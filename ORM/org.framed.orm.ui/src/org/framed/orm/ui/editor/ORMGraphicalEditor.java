package org.framed.orm.ui.editor;

import java.io.IOException;
import java.util.EventObject;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor.PropertyValueWrapper;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.gef.DefaultEditDomain;
import org.eclipse.gef.EditDomain;
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
import org.eclipse.gef.ui.parts.GraphicalEditor;
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
import org.framed.orm.model.Model;
import org.framed.orm.model.Shape;
import org.framed.orm.model.Type;
import org.framed.orm.model.provider.OrmItemProviderAdapterFactory;
import org.framed.orm.ui.action.CreateAttributeOperationAction;
import org.framed.orm.ui.action.RelationshipConstraintsAction;
import org.framed.orm.ui.action.FulfillRolesAction;
import org.framed.orm.ui.action.StepInAction;
import org.framed.orm.ui.action.StepInNewPageAction;
import org.framed.orm.ui.action.StepOutAction;
import org.framed.orm.ui.action.StepInNewTabAction;
import org.framed.orm.ui.editPart.ORMEditPartFactory;

/**
 * The {@link GraphicalEditor} you can see. Interacts with the user and shows the contents.
 * 
 * @author Kay BierzynskiS
 * @author Paul Peschel
 * */
public class ORMGraphicalEditor extends AbstractGraphicalEditor {

  /**
   * This enum describes the editor type, which can be COMPARTMENT or ROLES.
   * */
  public enum EditorType {
    COMPARTMENT, /* the editor shows compartments at the moment */
    ROLES /* the editor shows roles at the moment (e.g. after step in) */
  }; // if the editor does not allow to create role-related components, it's a COMPARTMENT-editor

  /**
   * The input {@link Resource} of this editor, which contains the emf model.
   * */
  private final Resource cdResource;
  /**
   * The Root {@link Model}, which represents the root of the model tree and which is the first
   * content for editor viewer.
   * */
  private Model rootmodel;

  /**
   * The {@link ORMMultiPageEditor}, where this editor is registered and managed.
   * */
  private final IEditorPart parentEditor; // the multipageditor
  /**
   * A boolean flag, which indicates if this edito shows the method list of the {@link Type} model
   * elements or not. false = this is a behaviour editor true = this is a data editor
   * */
  private final boolean isEditorData;
  /**
   * The {@link PropertySheetPage} of this editor, which shown in the Properties.
   * */
  private PropertySheetPage propertyPage;
  /**
   * The {@link EditorChangeNotifier} of this editor.
   * */
  private final EditorChangeNotifier changeNotifier;
  /**
   * The {@link EditorType} of this editor, which need to change the visibility of palett entrys.
   * */
  private EditorType editorType;


  /**
   * The constructor of this class. The most of the gloabal variables are initialized here and the
   * {@link EditDomain} ot the editor is set here as well.
   * */
  public ORMGraphicalEditor(final IEditorPart editor, final Resource resource, final boolean flag) {

    isEditorData = flag;
    parentEditor = editor;
    cdResource = resource;
    changeNotifier = new EditorChangeNotifier(this);
    editorType = EditorType.COMPARTMENT; // standard is compartment

    setEditDomain(new DefaultEditDomain(this));
  }

  /**
   * A getter for the editor type of this editor.
   * 
   * @return {@link EditorType}
   * */
  public EditorType getEditorType() {
    return editorType;
  }

  /**
   * A getter for the viewer of this editor.
   * 
   * @return {@link GraphicalViewer}
   * */
  public GraphicalViewer getOwnViewer() {
    return getGraphicalViewer();
  }

  /**
   * A getter for the parenteditor({@link ORMMultiPageEditor}) of this editor.
   * 
   * @return parentEditor {@link IEditorPart}
   * */
  public IEditorPart getParentEditor() {
    return parentEditor;
  }

  /**
   * A getter for the isEditorData flag.
   * 
   * @return isEditorData boolean
   * */
  public boolean getIsEditorData() {
    return isEditorData;
  }

  /**
   * A getter for action registry of this editor.
   * 
   * @return {@link ActionRegistry}
   * */
  public ActionRegistry getEditorActionRegistry() {
    return getActionRegistry();
  }

  /**
   * Initializes the graphical viewer responsible for the contents of the editor.
   */
  @Override
  protected void initializeGraphicalViewer() {
    super.initializeGraphicalViewer();
    getGraphicalViewer().setContents(rootmodel);
    ((ORMMultiPageEditor) parentEditor).createCustomTitleForEditor(rootmodel);

    // add the change notifier as listener
    getGraphicalViewer().getEditDomain().getCommandStack()
        .addCommandStackEventListener(changeNotifier);
  }

  /**
   * Configures the graphical viewer.
   * 
   * Sets org.framed.orm.ui.editPart.ORMEditPartFactory.ORMEditPartFactory(),
   * org.framed.orm.ui.editor
   * .ORMGraphicalEditorContextMenuProvider.ORMGraphicalEditorContextMenuProvider(EditPartViewer,
   * ActionRegistry).
   * 
   * Registers button actions of grid
   * (org.eclipse.gef.ui.actions.ToggleGridAction.ToggleGridAction(GraphicalViewer) ) and snap to
   * geometry (org.eclipse.gef.ui.actions.ToggleSnapToGeometryAction.ToggleSnapToGeometryAction(
   * GraphicalViewer) )
   * 
   * Configures the keyboard shortcuts @see
   * org.framed.orm.ui.editor.ORMGraphicalEditor.configureKeyboardShortcuts()
   */
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

  /**
   * {@inheritDoc} We need to override this method, because getSite.getPage().getActiveEditor()
   * would return the {@link ORMMultiPageEditor} that leads to the problem that the select actions
   * doesn't work.
   */
  @Override
  public void selectionChanged(final IWorkbenchPart part, final ISelection selection) {
    updateActions(getSelectionActions());
  }

  /**
   * This method sets shortcuts for actions.
   * */
  private void configureKeyboardShortcuts() {
    getGraphicalViewer().getKeyHandler();
    GraphicalViewerKeyHandler keyHandler = new GraphicalViewerKeyHandler(getGraphicalViewer());
    keyHandler.put(KeyStroke.getPressed(SWT.F2, 0),
        getActionRegistry().getAction(GEFActionConstants.DIRECT_EDIT));
    keyHandler.put(KeyStroke.getPressed(SWT.CR, '\r', 0),
        getActionRegistry().getAction(CreateAttributeOperationAction.CREATE_A_M_ID));
    getGraphicalViewer().setKeyHandler(keyHandler);
  }

  /**
   * {@inheritDoc} In this method the {@link ORMGraphicalEditorPalette} of this editor is registered
   * by the changeNotifier as well.
   */
  @Override
  protected PaletteRoot getPaletteRoot() {
    ORMGraphicalEditorPalette tmp = new ORMGraphicalEditorPalette();

    changeNotifier.register(tmp); // register the palette for editor changes
    if (getEditorType() == EditorType.ROLES) { // if we show only roles
      tmp.setRoleEntriesVisibility(true); // show only palette entries belonging to roles
    } else {
      // compartments
      tmp.setRoleEntriesVisibility(false); // show only palette entries belonging to compartment
    }

    return tmp;
  }

  /** {@inheritDoc} */
  @Override
  protected void createActions() {

    super.createActions();

    // TODO: when the Ediptpart of the Relation and shape are uncomment these actions

    IAction action = new StepInAction(this);
    getActionRegistry().registerAction(action);
    getSelectionActions().add(action.getId());

    action = new StepOutAction(this);
    getActionRegistry().registerAction(action);
    getSelectionActions().add(action.getId());

    action = new StepInNewPageAction(this);
    getActionRegistry().registerAction(action);
    getSelectionActions().add(action.getId());

    action = new StepInNewTabAction(this);
    getActionRegistry().registerAction(action);
    getSelectionActions().add(action.getId());

    action = new FulfillRolesAction(this);
    getActionRegistry().registerAction(action);
    getSelectionActions().add(action.getId());

    action = new RelationshipConstraintsAction(this);
    getActionRegistry().registerAction(action);
    getSelectionActions().add(action.getId());

    action = new CreateAttributeOperationAction(this);
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
  public void doSave(final IProgressMonitor monitor) {
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

  /** {@inheritDoc} */
  @Override
  public void init(final IEditorSite site, final IEditorInput input) throws PartInitException {
    super.init(site, input);
    if (cdResource != null) {
      rootmodel = (Model) cdResource.getContents().get(0);
    }
  }


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


  /**
   * This method updates the {@link EditorType} of this editor and the behaviour/data(depending on
   * which type this editor is) editor, when the user steps in or out of {@link Compartment}s or
   * {@link Grouping}s.
   * */
  public void updateEditorType() {
    EditorType temptype = this.editorType;

    if (getGraphicalViewer().getContents().getModel() instanceof Model) {
      temptype = EditorType.COMPARTMENT;
    }
    if (getGraphicalViewer().getContents().getModel() instanceof Shape) {
      Shape shape = (Shape) getGraphicalViewer().getContents().getModel();
      if (shape.getType() == Type.GROUP) {
        temptype = EditorType.COMPARTMENT;
      }
      if (shape.getType() == Type.COMPARTMENT_TYPE) {
        temptype = EditorType.ROLES;
      }
    }

    if (this.editorType.equals(temptype)) {
      return;
    }

    this.editorType = temptype;
    changeNotifier.editorTypeChanged(editorType);

    // set data editor type to the same type as the behaviour editor type (btw: the complete design
    // of this editor hick-hack should be refactored)
    ((ORMMultiPageEditor) getParentEditor()).getDataEditor().updateEditorType();;
  }

  /**
   * A property source which unwraps values that are wrapped in an EMF {@link PropertyValueWrapper}
   * 
   * 
   */
  public class UnwrappingPropertySource implements IPropertySource {
    private final IPropertySource source;

    /**
     * The constructor of this class, where the source is set.
     * */
    public UnwrappingPropertySource(final IPropertySource source) {
      this.source = source;
    }

    /** {@inheritDoc} */
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

    /** {@inheritDoc} */
    @Override
    public IPropertyDescriptor[] getPropertyDescriptors() {
      return source.getPropertyDescriptors();
    }

    /** {@inheritDoc} */
    @Override
    public Object getPropertyValue(final Object id) {
      final Object value = source.getPropertyValue(id);
      if (value instanceof PropertyValueWrapper) {
        PropertyValueWrapper wrapper = (PropertyValueWrapper) value;
        return wrapper.getEditableValue(null);
      } else {
        return source.getPropertyValue(id);
      }
    }

    /** {@inheritDoc} */
    @Override
    public boolean isPropertySet(final Object id) {
      return source.isPropertySet(id);
    }

    /** {@inheritDoc} */
    @Override
    public void resetPropertyValue(final Object id) {
      source.resetPropertyValue(id);
    }

    /** {@inheritDoc} */
    @Override
    public void setPropertyValue(final Object id, final Object value) {
      source.setPropertyValue(id, value);
    }
  }

}
