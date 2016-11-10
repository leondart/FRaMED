package org.framed.orm.ui.editor;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EventObject;
import java.util.List;
import java.util.Map;

import javax.script.ScriptException;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor.PropertyValueWrapper;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.gef.DefaultEditDomain;
import org.eclipse.gef.EditDomain;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.GraphicalViewer;
import org.eclipse.gef.KeyStroke;
import org.eclipse.gef.commands.CommandStack;
import org.eclipse.gef.dnd.TemplateTransferDragSourceListener;
import org.eclipse.gef.dnd.TemplateTransferDropTargetListener;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.ui.actions.ActionRegistry;
import org.eclipse.gef.ui.actions.DirectEditAction;
import org.eclipse.gef.ui.actions.GEFActionConstants;
import org.eclipse.gef.ui.actions.ToggleGridAction;
import org.eclipse.gef.ui.actions.ToggleSnapToGeometryAction;
import org.eclipse.gef.ui.palette.PaletteViewer;
import org.eclipse.gef.ui.parts.GraphicalEditor;
import org.eclipse.gef.ui.parts.GraphicalEditorWithFlyoutPalette;
import org.eclipse.gef.ui.parts.GraphicalViewerKeyHandler;
import org.eclipse.gef.ui.properties.UndoablePropertySheetEntry;
import org.eclipse.gef.ui.properties.UndoablePropertySheetPage;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.MouseListener;
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
import org.framed.orm.model.OrmFactory;
import org.framed.orm.model.Relation;
import org.framed.orm.model.Shape;
import org.framed.orm.model.Type;
import org.framed.orm.model.provider.OrmItemProviderAdapterFactory;
import org.framed.orm.transformation.TransformationExecutor;
import org.framed.orm.ui.action.CreateAttributeOperationAction;
import org.framed.orm.ui.action.FulfillRolesAction;
import org.framed.orm.ui.action.RelationshipConstraintsAction;
import org.framed.orm.ui.action.StepInAction;
import org.framed.orm.ui.action.StepInNewPageAction;
import org.framed.orm.ui.action.StepInNewTabAction;
import org.framed.orm.ui.action.StepOutAction;
import org.framed.orm.ui.command.connectionkinds.ORMRelationshipConstraintCreateCommand;
import org.framed.orm.ui.command.connectionkinds.ORMRelationshipConstraintDeleteCommand;
import org.framed.orm.ui.editPart.ORMEditPartFactory;
import org.framed.orm.ui.editPart.connectionkinds.ORMRelationshipEditPart;
import org.framed.orm.ui.editor.palette.CreationConstraintToolEntry;
import org.framed.orm.ui.expression.FeatureExpression;

/**
 * The {@link GraphicalEditor} you can see. Interacts with the user and shows the contents.
 * 
 * @author Kay BierzynskiS
 * @author Paul Peschel
 * @author Duc Dung Dam
 * @author Marc Kandler
 * */
public class ORMGraphicalEditor extends AbstractGraphicalEditor {

  /**
   * This enum describes the editor type, which can be COMPARTMENT or ROLES.
   * */
  public enum EditorType {
    COMPARTMENT, /* the editor shows compartments at the moment */
    ROLES /* the editor shows roles at the moment (e.g. after step in) */
  }; // if the editor does not allow to create role-related components, it's a
     // COMPARTMENT-editor

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
   * The {@link EditorType} of this editor, which needs to change the visibility of palett entries.
   * */
  private EditorType editorType;


  /**
   * A Map to store the Palette Entries (Key) and the respective {@link FeatureExpression} which has to be evaluated to true
   * for the entry to be visible in the step-OUT perspective.
   */
  private Map<PaletteEntry, FeatureExpression> stepOUTPaletteVisibility;

  /**
   * A Map to store the Palette Entries (Key) and the respective {@link FeatureExpression} which has to be evaluated to true
   * for the entry to be visible in the step-IN perspective.
   */
  private Map<PaletteEntry, FeatureExpression> stepINPaletteVisibility;


  /**
   * The constructor of this class. The most of the global variables are initialized here and the
   * {@link EditDomain} of the editor is set here as well.
   * 
   * @param editor The parent editor
   * @param resource The currently used resource
   * @param flag Flag indicating the state of the editor
   * @param stepOUTPaletteVisibility
   * @param stepINPaletteVisibility
   */
  public ORMGraphicalEditor(final IEditorPart editor, final Resource resource, final boolean flag,
      Map<PaletteEntry, FeatureExpression> stepOUTPaletteVisibility,
      Map<PaletteEntry, FeatureExpression> stepINPaletteVisibility) {
    isEditorData = flag;
    parentEditor = editor;
    cdResource = resource;
    changeNotifier = new EditorChangeNotifier(this);
    editorType = EditorType.COMPARTMENT; // standard is compartment
    this.stepOUTPaletteVisibility = stepOUTPaletteVisibility;
    this.stepINPaletteVisibility = stepINPaletteVisibility;
    if (cdResource != null) {
      rootmodel = (Model) cdResource.getContents().get(0);
    }
    setEditDomain(new DefaultEditDomain(this));
  }
  
  public CommandStack getCommandStack() {return super.getCommandStack();}

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
    GraphicalViewer viewer = getGraphicalViewer();
    viewer.setContents(rootmodel);
    ((ORMMultiPageEditor) parentEditor).createCustomTitleForEditor(rootmodel);

    // add the change notifier as listener
    viewer.getEditDomain().getCommandStack().addCommandStackEventListener(changeNotifier);
  }

  /**
   * Configures the graphical viewer.
   * 
   * Sets org.framed.orm.ui.editPart.ORMEditPartFactory.ORMEditPartFactory(),
   * org.framed.orm.ui.editor .ORMGraphicalEditorContextMenuProvider.
   * ORMGraphicalEditorContextMenuProvider(EditPartViewer, ActionRegistry).
   * 
   * Registers button actions of grid (org.eclipse.gef.ui.actions.ToggleGridAction
   * .ToggleGridAction(GraphicalViewer) ) and snap to geometry (org.eclipse.gef
   * .ui.actions.ToggleSnapToGeometryAction.ToggleSnapToGeometryAction( GraphicalViewer) )
   * 
   * Configures the keyboard shortcuts @see
   * org.framed.orm.ui.editor.ORMGraphicalEditor.configureKeyboardShortcuts()
   * 
   * Adds drag and drop listener for shape creation by dragging objects from palette to
   * EditorViewer.
   * 
   * Adds mouse listener for handling onClick events on constraint entries. This will create/delete
   * a constraint for a current selected relationship.
   */
  @Override
  protected void configureGraphicalViewer() {
    super.configureGraphicalViewer();
    final GraphicalViewer viewer = getGraphicalViewer();
    final PaletteViewer paletteViewer = getEditDomain().getPaletteViewer();

    viewer.setEditPartFactory(new ORMEditPartFactory());
    // set Contextmenu provider class + action registry
    viewer.setContextMenu(new ORMGraphicalEditorContextMenuProvider(getGraphicalViewer(),
        getActionRegistry()));

    // register grid and snap to geometry action
    getActionRegistry().registerAction(new ToggleGridAction(getGraphicalViewer()));
    getActionRegistry().registerAction(new ToggleSnapToGeometryAction(getGraphicalViewer()));

    // set the shortcuts
    configureKeyboardShortcuts();


    // add drag and drop listener
    viewer.addDropTargetListener(new TemplateTransferDropTargetListener(viewer));
    getEditDomain().getPaletteViewer().addDragSourceListener(
        new TemplateTransferDragSourceListener(getEditDomain().getPaletteViewer()));
    // add the mouse listener
    paletteViewer.getControl().addMouseListener(new MouseListener() {
      Point p_temp;

      @Override
      public void mouseDown(MouseEvent e) {
        p_temp = new Point(e.x, e.y);
      }

      @Override
      public void mouseUp(MouseEvent e) {
        if (p_temp.equals(new Point(e.x, e.y))) {
          final EditPart editPart = paletteViewer.findObjectAt(new Point(e.x, e.y));
          if (editPart instanceof EditPart
              && editPart.getModel() instanceof CreationConstraintToolEntry) {
            EditPart ep = (EditPart) viewer.getSelectedEditParts().get(0);
            if (ep instanceof ORMRelationshipEditPart) {
              ORMRelationshipEditPart ep_relationship = (ORMRelationshipEditPart) ep;
              Relation relationship = ep_relationship.getRelationship();
              List<Relation> constraints = relationship.getReferencedRelation();

              System.out.println("Relationship: " + relationship.getName());
              System.out.println("Existing constraints: "
                  + relationship.getReferencedRelation().toString());
              Relation relation = OrmFactory.eINSTANCE.createRelation();
              Type type =
                  Type.get(((CreationConstraintToolEntry) editPart.getModel()).getTypeValue());
              relation.setType(type);
              relation.setName(type.getName());

              boolean constraintExist = false;
              for (Relation r : constraints) {
                if (r.getType().equals(type)) {
                  constraintExist = true;
                  System.out.println("Constraint delete!");
                  ORMRelationshipConstraintDeleteCommand command =
                      new ORMRelationshipConstraintDeleteCommand();
                  command.setRelation(r);
                  command.setEPViewer(ep.getViewer());
                  getCommandStack().execute(command);
                  break;
                }
              }

              if (!constraintExist) {
                relationship.getReferencedRelation().add(relation);
                ORMRelationshipConstraintCreateCommand command =
                    new ORMRelationshipConstraintCreateCommand();
                command.setRelation(relation);
                command.setRelationContainer(relationship.getContainer());
                command.setSource((Shape) relationship.getSource());
                command.setTarget((Shape) relationship.getTarget());
                command.setSourceLabel(null);
                command.setTargetLabel(null);
                ArrayList<Relation> refrencedRelation = new ArrayList<Relation>();
                refrencedRelation.add(relationship);
                command.setRefrencedRelations(refrencedRelation);
                getCommandStack().execute(command);
              }
            }
          }
        }
      }

      @Override
      public void mouseDoubleClick(MouseEvent e) {}
    });
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
    ORMGraphicalEditorPalette tmp = null;
    try {
      tmp =
          new ORMGraphicalEditorPalette(stepOUTPaletteVisibility, stepINPaletteVisibility,
              rootmodel);
    } catch (ScriptException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }

    changeNotifier.register(tmp); // register the palette for editor changes
    if (getEditorType() == EditorType.ROLES) { // if we show only roles
      tmp.setPaletteEntriesVisibility(false); // show only palette entries
      // belonging to roles
    } else {
      // compartments
      tmp.setPaletteEntriesVisibility(true); // show only palette entries
      // belonging to compartment
    }

    return tmp;
  }

  /** {@inheritDoc} */
  @Override
  protected void createActions() {

    super.createActions();

    // TODO: when the Ediptpart of the Relation and shape are uncomment
    // these actions

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

    // save graphical resource
    boolean graphicalResourceSaved = saveGraphicalResource();
    if (!graphicalResourceSaved) {
      return;
    }

    // transform graphical model to crom
    boolean modelTransformationSucceed = transformModel();
    if (!modelTransformationSucceed) {
      return;
    }

    getCommandStack().markSaveLocation();
  }

  /**
   * Transforms the graphical model into an instance of crom model.
   * 
   * @return true if transformation succeeds, otherwise false.
   */
  private boolean transformModel() {
    // resolve target uri
    URI sourceURI = cdResource.getURI();
    // Remove .crom_dia file extension
    sourceURI = sourceURI.trimFileExtension();
    // Add .crom file extension
    sourceURI = sourceURI.appendFileExtension("crom");

    // Get file path relative to workspace (needed for URI.createPlatformResourceURI)
    Path path = new Path(sourceURI.toFileString());
    IFile myFile = ResourcesPlugin.getWorkspace().getRoot().getFileForLocation(path);

    // create target resource (using createPlatformResourceURI
    // updates the project explorer to show the file upon initial save)
    URI targetURI = URI.createPlatformResourceURI(myFile.getFullPath().toString(), true);
    ResourceSet set = new ResourceSetImpl();
    Resource res = set.createResource(targetURI);

    // setup model transformation
    TransformationExecutor exe = new TransformationExecutor();
    exe.setSourceModelFile(cdResource);
    exe.setTargetModelFile(res);

    // execute transformation
    try {
      res.save(Collections.EMPTY_MAP);
      exe.execute();
      return true;
    } catch (Exception e) {
      e.printStackTrace();
    }

    return false;
  }

  /**
   * Returns the rootmodel used in the graphical editor. Used in order to access the configuration.
   *
   * @return rootmodel of the graphical editor
   */
  public Model getRootmodel() {
    return rootmodel;
  }


  /**
   * Returns the used resource. Used in order to save the configuration
   * 
   * @return cdResource of the editor
   */
  public Resource getCdResource() {
    return cdResource;
  }

  /**
   * Saves the graphical resource.
   * 
   * @return True if saving of model succeeds, otherwise false.
   */
  private boolean saveGraphicalResource() {
    if (cdResource == null) {
      return false;
    }

    try {
      cdResource.save(null);
      return true;
    } catch (IOException e) {
      // TODO do something smarter.
      e.printStackTrace();
    }
    return false;
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
        // A new PropertySourceProvider was implemented to fetch the
        // model
        // from the edit part when required. The property source is
        // provided
        // by the generated EMF classes and wrapped by the
        // AdapterFactoryContentProvider
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

  public void pageChanged() {
    changeNotifier.editorTypeChanged(editorType);
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

    // set data editor type to the same type as the behaviour editor type
    // (btw: the complete design
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
