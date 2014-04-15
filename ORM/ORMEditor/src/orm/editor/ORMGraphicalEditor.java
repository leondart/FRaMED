package orm.editor;

import java.io.IOException;
import java.util.EventObject;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor.PropertyValueWrapper;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.gef.DefaultEditDomain;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.GraphicalViewer;
import org.eclipse.gef.KeyStroke;
import org.eclipse.gef.commands.CommandStack;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.ui.actions.DirectEditAction;
import org.eclipse.gef.ui.actions.GEFActionConstants;
import org.eclipse.gef.ui.actions.ToggleGridAction;
import org.eclipse.gef.ui.actions.ToggleSnapToGeometryAction;
import org.eclipse.gef.ui.parts.GraphicalEditorWithFlyoutPalette;
import org.eclipse.gef.ui.parts.GraphicalViewerKeyHandler;
import org.eclipse.gef.ui.properties.UndoablePropertySheetEntry;
import org.eclipse.gef.ui.properties.UndoablePropertySheetPage;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.SWT;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.views.properties.IPropertyDescriptor;
import org.eclipse.ui.views.properties.IPropertySheetPage;
import org.eclipse.ui.views.properties.IPropertySource;
import org.eclipse.ui.views.properties.IPropertySourceProvider;
import org.eclipse.ui.views.properties.PropertySheetPage;

import orm.action.GoDownTreeAction;
import orm.action.GoUpTreeAction;
import orm.action.StepInNewPageAction;
import orm.action.StepOutNewPageAction;
import orm.editPart.ORMEditPartFactory;
import orm.model.CompartmentDiagram;
import orm.model.provider.OrmItemProviderAdapterFactory;

/**
 * 
 * 
 * @author Kay Bierzynski
 * */
public class ORMGraphicalEditor extends GraphicalEditorWithFlyoutPalette {

  private Resource cdResource;
  private CompartmentDiagram cd;

  private IEditorPart parentEditor; // the multipageditor
  private boolean isEditorData;
  private PropertySheetPage propertyPage;

  public GraphicalViewer getOwnViewer() {
    return getGraphicalViewer();
  }

  public IEditorPart getParentEditor() {
    return parentEditor;
  }

  public boolean getIsEditorData() {
    return isEditorData;
  }

  public ORMGraphicalEditor(IEditorPart editor, Resource resource, boolean flag) {

    isEditorData = flag;
    parentEditor = editor;
    cdResource = resource;
    cd = (CompartmentDiagram) cdResource.getContents().get(0);

    setEditDomain(new DefaultEditDomain(this));
  }

  @Override
  protected void initializeGraphicalViewer() {
    super.initializeGraphicalViewer();
    getGraphicalViewer().setContents(cd);
  }

  @Override
  protected void configureGraphicalViewer() {
    super.configureGraphicalViewer();

    getGraphicalViewer().setEditPartFactory(new ORMEditPartFactory());
    // set Contextmenu provider class + action registry
    getGraphicalViewer().setContextMenu(
        new ORMGraphicalEditorContextMenuProvider(getGraphicalViewer(), getActionRegistry()));

    // register grid und snap to geometry action
    getActionRegistry().registerAction(new ToggleGridAction(getGraphicalViewer()));
    getActionRegistry().registerAction(new ToggleSnapToGeometryAction(getGraphicalViewer()));

    // set the shortcuts
    configureKeyboardShortcuts();
  }

  // need to override because getSite.getPage().getActiveEditor would return multipageditor
  // and with that the select actions
  // would not function
  @Override
  public void selectionChanged(IWorkbenchPart part, ISelection selection) {
    updateActions(getSelectionActions());
  }


  private void configureKeyboardShortcuts() {
    getGraphicalViewer().getKeyHandler();
    GraphicalViewerKeyHandler keyHandler = new GraphicalViewerKeyHandler(getGraphicalViewer());
    keyHandler.put(KeyStroke.getPressed(SWT.F2, 0),
        getActionRegistry().getAction(GEFActionConstants.DIRECT_EDIT));
    getGraphicalViewer().setKeyHandler(keyHandler);
  }

  @Override
  protected PaletteRoot getPaletteRoot() {
    return new ORMGraphicalEditorPalette();
  }

  // cretas own actions and actions for shortcuts
  @Override
  protected void createActions() {

    super.createActions();

    IAction action = new GoDownTreeAction(this);
    getActionRegistry().registerAction(action);
    getSelectionActions().add(action.getId());

    action = new GoUpTreeAction(this);
    getActionRegistry().registerAction(action);
    getSelectionActions().add(action.getId());

    action = new StepInNewPageAction(this);
    getActionRegistry().registerAction(action);
    getSelectionActions().add(action.getId());

    action = new StepOutNewPageAction(this);
    getActionRegistry().registerAction(action);
    getSelectionActions().add(action.getId());

    // create direct editing action for shortcuts
    action = new DirectEditAction(this);
    getActionRegistry().registerAction(action);
    getSelectionActions().add(action.getId());
  }

  /**
   * Save the model using the resource from which it was opened, and mark the current location in
   * the {@link CommandStack}.
   */
  @Override
  public void doSave(IProgressMonitor monitor) {
    if (cdResource == null) {
      return;
    }

    try {
      cdResource.save(null);
      getCommandStack().markSaveLocation();
    } catch (IOException e) {
      // TODO do something smarter.
      e.printStackTrace();
    }
  }

  // initialise input
  @Override
  public void init(IEditorSite site, IEditorInput input) throws PartInitException {
    super.init(site, input);
    // loadInput(input);
  }

  // TODO: anpassen an multiPageEditor --> bug wenn man im Behavior Editor etwas veraendert enabled
  // dies auch Data Editor den save button von eclipse
  /**
   * Fire a {@link IEditorPart#PROP_DIRTY} property change and call super implementation. Enable
   * save from Eclipse.
   */
  @Override
  public void commandStackChanged(EventObject event) {
    firePropertyChange(PROP_DIRTY);
    super.commandStackChanged(event);
  }

  /**
   * This methos implements adapting to {@link IPropertySheetPage}. All other requests are forwarded
   * to the {@link GraphicalEditorWithFlyoutPalette#getAdapter(Class) parent} implementation.
   */
  @Override
  public Object getAdapter(@SuppressWarnings("rawtypes") Class type) {
    super.getAdapter(type);
    if (type.equals(IPropertySheetPage.class)) {
      if (propertyPage == null) {
        propertyPage = (UndoablePropertySheetPage) super.getAdapter(type);
        // A new PropertySourceProvider was implemented to fetch the model
        // from the edit part when required. The property source is provided
        // by the generated EMF classes and wrapped by the AdapterFactoryContentProvider
        // to yield standard eclipse interfaces.
        IPropertySourceProvider sourceProvider = new IPropertySourceProvider() {
          IPropertySourceProvider modelPropertySourceProvider = new AdapterFactoryContentProvider(
              new OrmItemProviderAdapterFactory());

          @Override
          public IPropertySource getPropertySource(Object object) {
            IPropertySource source = null;
            if (object instanceof EditPart) {
              source =
                  modelPropertySourceProvider.getPropertySource(((EditPart) object).getModel());
            } else {
              source = modelPropertySourceProvider.getPropertySource(object);
            }

            if (source != null) {
              return new UnwrappingPropertySource(source);
            } else {
              return null;
            }
          }

        };
        UndoablePropertySheetEntry root = new UndoablePropertySheetEntry(getCommandStack());
        root.setPropertySourceProvider(sourceProvider);
        propertyPage.setRootEntry(root);
      }
      return propertyPage;
    }
    return super.getAdapter(type);
  }

  /**
   * A property source which unwraps values that are wrapped in an EMF {@link PropertyValueWrapper}
   * 
   * 
   */
  public class UnwrappingPropertySource implements IPropertySource {
    private IPropertySource source;

    public UnwrappingPropertySource(final IPropertySource source) {
      this.source = source;
    }

    @Override
    public Object getEditableValue() {
      Object value = source.getEditableValue();
      if (value instanceof PropertyValueWrapper) {
        PropertyValueWrapper wrapper = (PropertyValueWrapper) value;
        return wrapper.getEditableValue(null);
      } else {
        return source.getEditableValue();
      }
    }

    @Override
    public IPropertyDescriptor[] getPropertyDescriptors() {
      return source.getPropertyDescriptors();
    }

    @Override
    public Object getPropertyValue(Object id) {
      Object value = source.getPropertyValue(id);
      if (value instanceof PropertyValueWrapper) {
        PropertyValueWrapper wrapper = (PropertyValueWrapper) value;
        return wrapper.getEditableValue(null);
      } else {
        return source.getPropertyValue(id);
      }
    }

    @Override
    public boolean isPropertySet(Object id) {
      return source.isPropertySet(id);
    }

    @Override
    public void resetPropertyValue(Object id) {
      source.resetPropertyValue(id);
    }

    @Override
    public void setPropertyValue(Object id, Object value) {
      source.setPropertyValue(id, value);
    }
  }

}
