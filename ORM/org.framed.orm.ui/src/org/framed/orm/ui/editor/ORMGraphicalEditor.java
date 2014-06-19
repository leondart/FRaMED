package org.framed.orm.ui.editor;

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
import org.eclipse.gef.ui.actions.ActionRegistry;
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
import org.framed.orm.model.CompartmentDiagram;
import org.framed.orm.model.Grouping;
import org.framed.orm.model.provider.OrmItemProviderAdapterFactory;
import org.framed.orm.ui.action.RelationshipConstraintsAction;
import org.framed.orm.ui.action.FulfillRolesAction;
import org.framed.orm.ui.action.StepInAction;
import org.framed.orm.ui.action.StepInNewPageAction;
import org.framed.orm.ui.action.StepOutAction;
import org.framed.orm.ui.action.StepOutNewPageAction;
import org.framed.orm.ui.editPart.ORMEditPartFactory;

/**
 * 
 * 
 * @author Kay Bierzynski
 * */
public class ORMGraphicalEditor extends
/* GraphicalEditorWithFlyoutPalette */AbstractGraphicalEditor {
  public enum EditorType {
    COMPARTMENT, ROLES/* TODO: ,GROUPING */
  }; // if the editor does not allow to create role-related components, it's a COMPARTMENT-editor

  private final Resource cdResource;
  private CompartmentDiagram cd;

  private final IEditorPart parentEditor; // the multipageditor
  private final boolean isEditorData;
  private PropertySheetPage propertyPage;

  private final EditorChangeNotifier changeNotifier = new EditorChangeNotifier(this);
  private EditorType editorType = EditorType.COMPARTMENT; // standard is compartment

  public GraphicalViewer getOwnViewer() {
    return getGraphicalViewer();
  }

  public IEditorPart getParentEditor() {
    return parentEditor;
  }

  public boolean getIsEditorData() {
    return isEditorData;
  }

  public ActionRegistry getEditorActionRegistry() {
    return getActionRegistry();
  }

  public ORMGraphicalEditor(IEditorPart editor, Resource resource, boolean flag) {

    isEditorData = flag;
    parentEditor = editor;
    cdResource = resource;

    setEditDomain(new DefaultEditDomain(this));

    // ((ORMMultiPageEditor)parentEditor).setEditorChangeNotifier(changeNotifier);
  }

  @Override
  protected void initializeGraphicalViewer() {
    super.initializeGraphicalViewer();
    getGraphicalViewer().setContents(cd);
    ((ORMMultiPageEditor) parentEditor).createCustomTitleForEditor(cd);
    // this.addListenerObject(changeNotifier);
    // add the change notifier as listener
    getGraphicalViewer().getEditDomain().getCommandStack()
        .addCommandStackEventListener(changeNotifier);
    // getGraphicalViewer().getContents().addEditPartListener(changeNotifier);
    // getEditDomain().getEditorPart().addPropertyListener(changeNotifier);
  }

  @Override
  protected void configureGraphicalViewer() {
    super.configureGraphicalViewer();

    getGraphicalViewer().setEditPartFactory(new ORMEditPartFactory());
    // set Contextmenu provider class + action registry
    getGraphicalViewer().setContextMenu(
        new ORMGraphicalEditorContextMenuProvider(getGraphicalViewer(), getActionRegistry()));

    // register grid and snap to geometry action
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
    ORMGraphicalEditorPalette tmp = new ORMGraphicalEditorPalette();

    changeNotifier.register(tmp); // register the palette for editor changes
    if (getEditorType() == EditorType.ROLES)
      tmp.setRoleEntriesVisibility(true);
    else
      tmp.setRoleEntriesVisibility(false);

    return tmp;
  }

  // creates own actions and actions for shortcuts
  @Override
  protected void createActions() {

    super.createActions();

    IAction action = new StepInAction(this);
    getActionRegistry().registerAction(action);
    getSelectionActions().add(action.getId());

    action = new StepOutAction(this);
    getActionRegistry().registerAction(action);
    getSelectionActions().add(action.getId());

    action = new StepInNewPageAction(this);
    getActionRegistry().registerAction(action);
    getSelectionActions().add(action.getId());

    action = new StepOutNewPageAction(this);
    getActionRegistry().registerAction(action);
    getSelectionActions().add(action.getId());

    action = new FulfillRolesAction(this);
    getActionRegistry().registerAction(action);
    getSelectionActions().add(action.getId());

    action = new RelationshipConstraintsAction(this);
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

  // initialize input
  @Override
  public void init(IEditorSite site, IEditorInput input) throws PartInitException {
    super.init(site, input);
    if (cdResource != null) {
      cd = (CompartmentDiagram) cdResource.getContents().get(0);
    }
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
   * This methods implements adapting to {@link IPropertySheetPage}. All other requests are
   * forwarded to the {@link GraphicalEditorWithFlyoutPalette#getAdapter(Class) parent}
   * implementation.
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

  public EditorType getEditorType() {
    return editorType;
  }

  public void updateEditorType() {
    EditorType temptype;

    if (getGraphicalViewer().getContents().getModel() instanceof CompartmentDiagram
        || getGraphicalViewer().getContents().getModel() instanceof Grouping) {
      temptype = EditorType.COMPARTMENT;
    } else {
      temptype = EditorType.ROLES;
    }

    if (this.editorType.equals(temptype)) {
      return;
    }

    this.editorType = temptype;
    changeNotifier.editorTypeChanged(editorType);

    // set data editor type to the same type as the behaviour editor type (btw: the complete design
    // of this editor
    // hick-hack should be refactored)
    ((ORMMultiPageEditor) getParentEditor()).getDataEditor().updateEditorType();;
  }

  /**
   * A property source which unwraps values that are wrapped in an EMF {@link PropertyValueWrapper}
   * 
   * 
   */
  public class UnwrappingPropertySource implements IPropertySource {
    private final IPropertySource source;

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
