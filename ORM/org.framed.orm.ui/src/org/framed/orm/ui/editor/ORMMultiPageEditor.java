package org.framed.orm.ui.editor;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.EventObject;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import javax.script.ScriptException;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.gef.commands.CommandStackListener;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IEditorActionBarContributor;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.ISelectionListener;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.ui.part.MultiPageEditorPart;
import org.framed.orm.featuremodel.FeatureName;
import org.framed.orm.model.Model;
import org.framed.orm.model.OrmPackage;
import org.framed.orm.model.Shape;
import org.framed.orm.model.Type;
import org.framed.orm.ui.expression.ExpressionNode;
import org.framed.orm.ui.expression.FeatureExpression;

import de.ovgu.featureide.fm.core.FeatureModel;
import de.ovgu.featureide.fm.core.io.UnsupportedModelException;
import de.ovgu.featureide.fm.ui.editors.configuration.ConfigJobManager;


/**
 * 
 * This {@link MultiPageEditorPart} has as pages the behaviour {@link ORMGraphicalEditor}, the
 * data {@link ORMGraphicalEditor}, and the {@link FeatureModelConfigurationEditor}.
 * 
 * @author Kay Bierzynski
 * @author Lars SchÃ¼tze
 * @author Marc Kandler
 * */
public class ORMMultiPageEditor extends MultiPageEditorPart implements ISelectionListener,
    CommandStackListener, IResourceChangeListener {

  
  private boolean autoSelectFeatures = true;
  
  private final ConfigJobManager configJobManager = new ConfigJobManager();

  /**
   * The behaviour {@link ORMGraphicalEditor}, which is manages through this editor.
   * */
  private ORMGraphicalEditor behaviourEditor;
  

  /**
   * The data {@link ORMGraphicalEditor}, which is manages through this editor.
   * */
  private ORMGraphicalEditor dataEditor;
  
  /**
   * The {@link FeatureModelConfigurationEditor} which handles everything related to the Configuration. 
   */
  private FeatureModelConfigurationEditor featureModelConfigurationEditor;
  
  /**
   * The {@link ReadOnlyEditor} responsible for displaying the content of the .crom file.
   * */
  private ReadOnlyEditor cromEditor;
  
  /**
   * The {@link ReadOnlyEditor} responsible for displaying the content of the .crom_dia file
   * */
  private ReadOnlyEditor cromDiaEditor;
  
  /**
   * The {@link EditorChangeNotifier} of this editor.
   * */
  private EditorChangeNotifier changeNotifier;
  /**
   * The input {@link Resource} of this editor, which contains the emf model.
   * */
  private Resource resource;
  /**
   * The name of the file, which contains the model resources. This variable is necessary for the
   * creation of custom title for this editor.
   */
  private String inputFilename;
  
  /**
   * A Mapping for a {@link org.framed.orm.ui.expression.FeatureExpression FeatureExpression} to a Set of Strings which represents
   * names of PaletteEntries.
   */
  private Map<FeatureExpression, Set<String>> configToPaletteMapping;
  
  private Map<PaletteEntry, FeatureExpression> stepOUTPaletteVisibility;
  
  private Map<PaletteEntry, FeatureExpression> stepINPaletteVisibility;

  /**
   * The constructor of this class, where {@link MultiPageEditorPart#MultiPageEditorPart()} is
   * called, inputFilename and changeNotifier are initialized and a listener to the model resources
   * is added.
   * */
  public ORMMultiPageEditor() {
    super();
    inputFilename = "";
    changeNotifier = null;
    ResourcesPlugin.getWorkspace().addResourceChangeListener(this);

  }


  /**
   * A setter for the {@link EditorChangeNotifier} of this editor.
   * */
  public void setEditorChangeNotifier(final EditorChangeNotifier changeNotifier) {
    this.changeNotifier = changeNotifier;
  }

  /**
   * This method creates a custom title for this editor out of resource file name, the genral model
   * element term and the specific model/{@link Type} element name of the model element which is the
   * content of the viewer of data/behavior {@link ORMGraphicalEditor}.
   * */
  public void createCustomTitleForEditor(final Object model) {

    if (model instanceof Model || model instanceof Shape) {
      final String modelClassName = model.getClass().getSimpleName();
      setTitle(inputFilename + " " + modelClassName.substring(0, modelClassName.length() - 4));
      if (model instanceof Shape) {
        Shape shape = ((Shape) model);
        if (shape.getType() == Type.COMPARTMENT_TYPE) {
          setTitle(inputFilename + " " + "CompartmentType" + " " + shape.getName());
        }
        if (shape.getType() == Type.GROUP) {
          setTitle(inputFilename + " " + "Group" + " " + shape.getName());
        }
      }
    }
  }

  /**
   * A getter for name of input resource file.
   * 
   * @return inputFilename String
   * */
  public String getInputFileName() {
    return inputFilename;
  }

  /** {@inheritDoc} */
  @Override
  public void setTitleImage(final Image titleImage) {
    super.setTitleImage(titleImage);
  }

  /**
   * This method creates the behavior {@link ORMGraphicalEditor}.
   */
  private void createBehaviorEditorPage() {
//    try {
      behaviourEditor = new ORMGraphicalEditor(this, resource, false, configToPaletteMapping);
//      int index = addPage(behaviourEditor, getEditorInput());
//      setPageText(index, "Behavior");
//    } catch (PartInitException e) {
//      ErrorDialog.openError(getSite().getShell(), "Error creating nested orm editor", null,
//          e.getStatus());
//    }
  }


  /**
   * This method creates the data {@link ORMGraphicalEditor}.
   */
  private void createDataEditorPage() {
//    try {
      dataEditor = new ORMGraphicalEditor(this, resource, true, configToPaletteMapping);
//      int index = addPage(dataEditor, getEditorInput());
//      setPageText(index, "Data");
//    } catch (PartInitException e) {
//      ErrorDialog.openError(getSite().getShell(), "Error creating nested orm editor", null,
//          e.getStatus());
//    }
  }
  
 
  /**
   * This method creates the {@link FeatureModelConfigurationEditor}.
   * @throws FileNotFoundException
   * @throws UnsupportedModelException
   */
  private void createFeatureModelConfigurationEditor() throws FileNotFoundException, UnsupportedModelException {
//    try {
      featureModelConfigurationEditor = new FeatureModelConfigurationEditor(this, resource);
      //setConfiguration();
      //featureModelConfigurationEditor.setOrmMultiPageEditor(this);
//      int index = addPage(featureModelConfigurationEditor, getEditorInput());
//      setPageText(index, "Configuration");
//    } catch (PartInitException e) {
//      ErrorDialog.openError(getSite().getShell(), "Error creating nested orm editor", null,
//          e.getStatus());
//    }
  }
  
  /**
   * This method creates the crom {@link ReadOnlyEdior} and adds the crom data as a page
   * to this editor.
   */
  private void createCromReadOnlyEditorPage() {
    cromEditor = new ReadOnlyEditor();
  }
  
  /**
   * This method creates the crom_dia {@link ReadOnlyEdior} and adds the crom_dia data as a page
   * to this editor.
   */
  private void createCromDiaReadOnlyEditorPage() {
    cromDiaEditor = new ReadOnlyEditor();
  }
  
 

  /** {@inheritDoc} 
   * This method calls the methods to create the editors and adds them as pages.
   * In this method the title image of this editor is set as well. 
   * */
  @Override
  protected void createPages() {
    //Necessary to initialize it here, as the constructor of ORMMultiPageEditor is called after createPages()
    configToPaletteMapping = new HashMap<FeatureExpression, Set<String>>();

    
    //It is necessary to create the FeatureModelConfigurationEditor first, because the graphical editors
    //(behavior and data) rely on the standardFramedConfiguration which is created in this editor
    try {
      createFeatureModelConfigurationEditor();
    } catch (FileNotFoundException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } catch (UnsupportedModelException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    try {
      initializeConfigToPaletteMapping();
    } catch (ScriptException e1) {
      // TODO Auto-generated catch block
      e1.printStackTrace();
    }
    
    createBehaviorEditorPage();
    createDataEditorPage();
    createCromDiaReadOnlyEditorPage();
    createCromReadOnlyEditorPage();

    //In order to keep the order of the pages(Behavior, Data, Configuration) in the editor, 
    //we need to create the pages after calling the respective Editor constructors
    int index;
    try {
      index = addPage(behaviourEditor, getEditorInput());
      setPageText(index, "Behavior");
      index = addPage(dataEditor, getEditorInput());
      setPageText(index, "Data");
      index = addPage(featureModelConfigurationEditor, getEditorInput());    
      setPageText(index, "Configuration");
      index = addPage(cromDiaEditor, getEditorInput());
      setPageText(index, "CROM_DIA");
      
      //To get the .crom-file, we have to take the current editorinput and derive the desired file from it
      URI uri = resource.getURI();
      uri = uri.trimFileExtension();
      uri = uri.appendFileExtension("crom");
      Path path = new Path(uri.toFileString());
      IFile myFile = ResourcesPlugin.getWorkspace().getRoot().getFileForLocation(path);
      IFileEditorInput cromDiaEditorInput = new FileEditorInput(myFile);
      index = addPage(cromEditor, cromDiaEditorInput);
      setPageText(index, "CROM");
    } catch (PartInitException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }


    // set TitleImage of this ORMMultiPageEditor with background color of the viewer of the
    // behaivorEditor
    Image img =
        Activator.imageDescriptorFromPlugin(Activator.PLUGIN_ID, "icons/rosi-icon-smaller.gif")
            .createImage();
    img.setBackground(behaviourEditor.getGraphicalControl().getBackground());
    setTitleImage(img);
  }

  /**
   * {@inheritDoc} The implementation of the {@link ORMMultiPageEditor} tests if the editor input is
   * from type {@link IFileEditorInput}, adds a selection listener and initializes the input
   * resource.
   */
  @Override
  public void init(final IEditorSite site, final IEditorInput editorInput) throws PartInitException {
    if (!(editorInput instanceof IFileEditorInput)) {
      throw new PartInitException("Invalid Input: Must be IFileEditorInput");
    }
    super.init(site, editorInput);
    getSite().getWorkbenchWindow().getSelectionService().addSelectionListener(this);

    initializeResource(editorInput);
  }

  /**
   * This method initializes the model resource, which serves as input for this editor.
   * */
  private void initializeResource(final IEditorInput editorInput) {
    OrmPackage.eINSTANCE.eClass(); // This initializes the OrmPackage singleton implementation.
    ResourceSet resourceSet = new ResourceSetImpl();
    if (editorInput instanceof IFileEditorInput) {
      IFileEditorInput fileInput = (IFileEditorInput) editorInput;
      IFile file = fileInput.getFile();
      inputFilename = file.getName();
      resource = resourceSet.createResource(URI.createURI(file.getLocationURI().toString()));
      try {
        resource.load(null);
      } catch (IOException e) {
        // TODO do something smarter.
        e.printStackTrace();
        resource = null;
      }
    }
  }

  /**
   * {@inheritDoc} The implementation of the {@link ORMMultiPageEditor} saves the all editor, which
   * work on the same input resource and are registered through a page.
   */
  @Override
  public void doSave(final IProgressMonitor monitor) {
    for (int i = 0; i < getPageCount(); i++) {
      IEditorPart editorPart = getEditor(i);
      if (editorPart.isDirty()) {
        editorPart.doSave(monitor);
      }
    }
  }

  /**
   * Does at the moment nothing, because {@link ORMGraphicalEditor#doSaveAs()} isn't implemented.
   * */
  @Override
  public void doSaveAs() {

    if (behaviourEditor.equals(getActiveEditor())) {
      behaviourEditor.doSaveAs();
      setInput(behaviourEditor.getEditorInput());

    }

    if (dataEditor.equals(getActiveEditor())) {
      dataEditor.doSaveAs();
      setInput(dataEditor.getEditorInput());

    }
  }

  /**
   * {@inheritDoc} At the moment this method returns always true, because SaveAs functionalty isn't
   * implemented.
   */
  @Override
  public boolean isSaveAsAllowed() {
    return true;
  }

  /** This method enables select action for the active editor. */
  @Override
  public void selectionChanged(final IWorkbenchPart part, final ISelection selection) {
    if (this.equals(getSite().getPage().getActiveEditor())) {

      if (behaviourEditor.equals(getActiveEditor())) {
        behaviourEditor.selectionChanged(getActiveEditor(), selection);
      }
      if (dataEditor.equals(getActiveEditor()))
        dataEditor.selectionChanged(getActiveEditor(), selection);
    }
  }

  /**
   * {@inheritDoc} 
   * Updates the Tree used in the {@link FeatureModelConfigurationEditor} we switch from another editor to it.
   * Otherwise, we update the palette entry visibility.
   * This method needs to be overwritten so that when you switch between the editors the
   * actionbarcontributer takes the actionregistry/graphicalViewer/CommandStack from the active
   * editor.
   * */
  @Override
  protected void pageChange(final int newPageIndex) {
    super.pageChange(newPageIndex);
    IEditorPart activeEditor = getEditor(newPageIndex);
    //update the tree if the new page is the configuration editor
    if (activeEditor.getClass().getName().endsWith("FeatureModelConfigurationEditor")) {
      featureModelConfigurationEditor.updateTree();
    }
    else
      { 
      //If the target editor is one of the graphical editors
      if (activeEditor instanceof ORMGraphicalEditor) {
        //call the update editor type function in order to update the palette entry visibility as well
        ORMGraphicalEditor editor = (ORMGraphicalEditor) activeEditor;
        editor.pageChanged();
        IEditorActionBarContributor contributor = getEditorSite().getActionBarContributor();
        if (contributor != null && contributor instanceof ORMGraphicalEditorActionBarContributor) {
          ((ORMGraphicalEditorActionBarContributor) contributor).setActiveEditor(activeEditor);
        }
      }
    }
    
  }

  /**
   * Called when the CommandStack state of the active editor has changed.
   * */
  @Override
  public void commandStackChanged(EventObject event) {
    if (this.equals(getSite().getPage().getActiveEditor())) {
      if (behaviourEditor.equals(getActiveEditor())) {
        behaviourEditor.commandStackChanged(event);
      }

      if (dataEditor.equals(getActiveEditor())) {
        dataEditor.commandStackChanged(event);
      }
    }

  }



  /**
   * Closes all project files on project close.
   */
  @Override
  public void resourceChanged(final IResourceChangeEvent event) {
    if (event.getType() == IResourceChangeEvent.PRE_CLOSE) {
      Display.getDefault().asyncExec(new Runnable() {

        public void run() {
          IWorkbenchPage[] pages = getSite().getWorkbenchWindow().getPages();
          for (int i = 0; i < pages.length; i++) {
            if (((FileEditorInput) behaviourEditor.getEditorInput()).getFile().getProject()
                .equals(event.getResource())) {
              IEditorPart editorPart = pages[i].findEditor(behaviourEditor.getEditorInput());
              pages[i].closeEditor(editorPart, true);
            }
          }
        }

      });
    }
  }

  /**
   * A getter for behaviour editor, which registered by this editor.
   * 
   * @reutrn {@link ORMGraphicalEditor}
   * */
  public ORMGraphicalEditor getBehaviorEditor() {
    return behaviourEditor;
  }

  /**
   * A getter for data editor, which registered by this editor.
   * 
   * @reutrn {@link ORMGraphicalEditor}
   * */
  public ORMGraphicalEditor getDataEditor() {
    return dataEditor;
  }

  /**
   * Sets the object obj as content in the behavior editor and data editor
   * 
   * @param obj The object which will be set as content
   */
  public void setContents(final Object obj) {
    /*
     * first, check which editor type we will get when setting the object as content. The palette
     * will be updated
     */

    getBehaviorEditor().getOwnViewer().setContents(obj);
    getDataEditor().getOwnViewer().setContents(obj);
  }
  

  public ConfigJobManager getConfigJobManager() {
    return configJobManager;
}
  
  public boolean isAutoSelectFeatures() {
    return autoSelectFeatures;
}
  
  /**
   * Initializes the mapping from a {@link FeatureExpression} to the respective palette entries.
   * This method should be executed here (other places possible as well), 
   * as we do not want to create this mapping multiple times to save resources.
   * </br>
   * If the {@link FeatureExpression} is evaluated to true, the respective palette entries are visible.
   * @throws ScriptException
   */
  private void initializeConfigToPaletteMapping() throws ScriptException {

    FeatureModel featureModel = featureModelConfigurationEditor.getFeatureModel();
//    FeatureExpression ex = new FeatureExpression(featureModel, 
//        ExpressionNode.LB.toString() + ExpressionNode.NOT + FeatureName.RML_FEATURE_MODEL + ExpressionNode.RB);
//    
//    ex = new FeatureExpression(featureModel, "(!"+FeatureName.ON_COMPARTMENTS+")");
////    FeatureExpression ex = new FeatureExpression(featureModel, 
////        FeatureName.RML_FEATURE_MODEL, ExpressionNode.AND, FeatureName.ROLE_TYPES);
////    System.out.println(ex.evaluate(featureModelConfigurationEditor.getConfiguration()));
////    System.out.println(ex.toString());
////    
////    ex = new FeatureExpression(featureModelConfigurationEditor.getFeatureModel(), 
////        FeatureName.RML_FEATURE_MODEL, ExpressionNode.OR, FeatureName.ROLE_TYPES);
////    System.out.println(ex.evaluate(featureModelConfigurationEditor.getConfiguration()));
////    System.out.println(ex.toString());
////    
////    ex = new FeatureExpression(featureModelConfigurationEditor.getFeatureModel(), ExpressionNode.LB,
////         ExpressionNode.NOT, FeatureName.RML_FEATURE_MODEL,ExpressionNode.RB, ExpressionNode.AND, FeatureName.ROLE_TYPES);
////    System.out.println(ex.evaluate(featureModelConfigurationEditor.getConfiguration()));
////    System.out.println(ex.toString());
//    //Test:
//    fillConfigToPaletteMapping(new FeatureExpression(featureModel, "(!"+FeatureName.ON_COMPARTMENTS+")"));
//    fillConfigToPaletteMapping(new FeatureExpression(featureModel, "(!"+FeatureName.COMPARTMENTS+")"));
//    fillConfigToPaletteMapping(new FeatureExpression(featureModel, "("+FeatureName.COMPARTMENTS+" && "+FeatureName.DATA_TYPES+")"
//        +"&& !"+FeatureName.COMPARTMENT_BEHAVIOR + "|| ("+FeatureName.RML_FEATURE_MODEL + " && " + FeatureName.ROLE_TYPES + ")"));
//    
//    fillConfigToPaletteMapping(new FeatureExpression(featureModel, 
//        FeatureName.RML_FEATURE_MODEL + "||" + FeatureName.ROLE_TYPES +
//        "||" + FeatureName.ROLE_STRUCTURE + "||" + FeatureName.ROLE_PROPERTIES + "||" + FeatureName.ROLE_BEHAVIOR + "||" + FeatureName.ROLE_INHERITANCE 
//        + "||" + FeatureName.PLAYABLE + "||" + FeatureName.PLAYERS + "||" + FeatureName.NATURALS + "||" + FeatureName.ROLES + "||" + FeatureName.COMPARTMENTS
//        + "||" + FeatureName.DATES + "||" + FeatureName.DEPENDENT + "||" + FeatureName.ON_COMPARTMENTS + "||" + FeatureName.ON_RELATIONSHIPS + "||" + FeatureName.ROLE_CONSTRAINTS
//        + "||" + FeatureName.ROLE_IMPLICATION + "||" + FeatureName.ROLE_PROHIBITION + "||" + FeatureName.ROLE_EQUIVALENCE + "||" + FeatureName.GROUP_CONSTRAINTS + "||" + FeatureName.OCCURRENCE_CONSTRAINTS
//        + "||" + FeatureName.RELATIONSHIPS + "||" + FeatureName.RELATIONSHIP_CONSTRAINTS + "||" + FeatureName.RELATIONSHIP_CARDINALITY + "||" + FeatureName.INTRA_RELATIONSHIP_CONSTRAINTS
//        + "||" + FeatureName.PARTHOOD_CONSTRAINTS + "||" + FeatureName.INTER_RELATIONSHIP_CONSTRAINTS + "||" + FeatureName.COMPARTMENT_TYPES + "||" + FeatureName.COMPARTMENT_STRUCTURE
//        + "||" + FeatureName.COMPARTMENT_PROPERTIES + "||" + FeatureName.COMPARTMENT_BEHAVIOR + "||" + 
//        FeatureName.COMPARTMENT_INHERITANCE + "&&" + FeatureName.PARTICIPANTS
//        + "&&" + FeatureName.CONTAINS_COMPARTMENTS + "&&" + FeatureName.PLAYABLE_BY_DEFINING_COMPARTMENT + "&&" + FeatureName.DATA_TYPES + "&&" + FeatureName.DATA_TYPE_INHERITANCE));
    
    //True-Expression for always visible palette entries
    fillConfigToPaletteMapping(new FeatureExpression(featureModel, FeatureName.RML_FEATURE_MODEL), PaletteEntry.NATURAL_TYPE, 
        PaletteEntry.ROLE_TYPE, PaletteEntry.GROUP);
    
    //RML_Feature_Model
    fillConfigToPaletteMapping(new FeatureExpression(featureModel, FeatureName.RML_FEATURE_MODEL));
//    //fillConfigToPaletteMapping("RML_Feature_Model");
//    
//    //Role_Types
      fillConfigToPaletteMapping(new FeatureExpression(featureModel, FeatureName.ROLE_TYPES));
//    //fillConfigToPaletteMapping("Role_Types");
//    
//    //Role_Structure
      fillConfigToPaletteMapping(new FeatureExpression(featureModel, FeatureName.ROLE_STRUCTURE));
////    fillConfigToPaletteMapping("Role_Structure");
////   
////    //Role_Properties
      fillConfigToPaletteMapping(new FeatureExpression(featureModel, FeatureName.ROLE_PROPERTIES), PaletteEntry.ATTRIBUTE);
////    fillConfigToPaletteMapping("Role_Properties" );//Attributes , Stepout immer, Stepin spezifisch
////  //Drag&Drop, siehe unten bzgl. Attributes
////    
////    //Role_Behavior
      fillConfigToPaletteMapping(new FeatureExpression(featureModel, FeatureName.ROLE_BEHAVIOR), PaletteEntry.OPERATION);
////    fillConfigToPaletteMapping("Role_Behavior", Type.FULFILLMENT);//Operations, stepout immer
////    //Drag&Drop, siehe unten bzgl. Operations
////    
////    //Role_Inheritance
      fillConfigToPaletteMapping(new FeatureExpression(featureModel, FeatureName.ROLE_INHERITANCE), PaletteEntry.INHERITANCE);
////    fillConfigToPaletteMapping("Role_Inheritance", Type.INHERITANCE);// Inheritance (Step-In Ansicht), stepout immer
////    //Editpolicy: Erlaubt ziehen von Vererbungsrelation zwischen Rollentypen
////    
////    //Playable
      fillConfigToPaletteMapping(new FeatureExpression(featureModel, FeatureName.PLAYABLE));
////    fillConfigToPaletteMapping("Playable"); //Keins
////    
////    //Players
      fillConfigToPaletteMapping(new FeatureExpression(featureModel, FeatureName.PLAYERS));
////    fillConfigToPaletteMapping("Players"); //Keins
////    
////    //Naturals
        fillConfigToPaletteMapping(new FeatureExpression(featureModel, FeatureName.NATURALS));
////    fillConfigToPaletteMapping("Naturals"); //Keins
////    
////    //Roles
        fillConfigToPaletteMapping(new FeatureExpression(featureModel, FeatureName.ROLES), PaletteEntry.FULFILLMENT);
////    fillConfigToPaletteMapping("Roles"); //(Step-in Ansicht) ist "Fills" (Fulfilment) (ggf. korrigieren) zu sehen
        //stepout immer, stepin wenn contains_comp aktiviert (Implikation)
////    //Editpolicy: Fill ziehen zwischen Rollentyp und Compartment, Impliziert containts_compartments
////    
////    //Compartments
        fillConfigToPaletteMapping(new FeatureExpression(featureModel, FeatureName.COMPARTMENTS));
////    fillConfigToPaletteMapping("Compartments", Type.REFLEXIVE);//Keine
////    
////    //Dates
        fillConfigToPaletteMapping(new FeatureExpression(featureModel, FeatureName.DATES));
////    fillConfigToPaletteMapping("Dates", Type.RELATIONSHIP_SHAPE_CHILD);// Keine
////    
////    //Dependent
        fillConfigToPaletteMapping(new FeatureExpression(featureModel, FeatureName.DEPENDENT));
////    fillConfigToPaletteMapping("Dependent");//Keins
////    
////    //On_Compartments
        fillConfigToPaletteMapping(new FeatureExpression(featureModel, FeatureName.ON_COMPARTMENTS));
////    fillConfigToPaletteMapping("On_Compartments");//Keins
////
////    //On_Relationships
        fillConfigToPaletteMapping(new FeatureExpression(featureModel, FeatureName.ON_RELATIONSHIPS));
////    fillConfigToPaletteMapping("On_Relationships");//Keins
////    
////    //Role_Constraints
        fillConfigToPaletteMapping(new FeatureExpression(featureModel, FeatureName.ROLE_CONSTRAINTS));
////    fillConfigToPaletteMapping("Role_Constraints", Type.ACYCLIC);//Keins
////    
////    //Role_Implication
        fillConfigToPaletteMapping(new FeatureExpression(featureModel, FeatureName.ROLE_IMPLICATION), PaletteEntry.ROLE_IMPLICATION);
////    fillConfigToPaletteMapping("Role_Implication", Type.FULFILLMENT);//(Step-in Ansicht) Role Implication
        //Stepout AUS (nie)
////    
////    //Role_Prohibition
        fillConfigToPaletteMapping(new FeatureExpression(featureModel, FeatureName.ROLE_PROHIBITION), PaletteEntry.ROLE_PROHIBITION);
////    fillConfigToPaletteMapping("Role_Prohibition", Type.ACYCLIC); //(Step-in Ansicht)  Role Prohibition
        //Stepout AUS
////    
////    //Role_Equivalence
        fillConfigToPaletteMapping(new FeatureExpression(featureModel, FeatureName.ROLE_EQUIVALENCE), PaletteEntry.ROLE_EQUIVALENCE);
////    fillConfigToPaletteMapping("Role_Equivalence", Type.REFLEXIVE);// (Step-in Ansicht) Role Equivalence 
        //stepout aus
////    
////    //Group_Constraints
        fillConfigToPaletteMapping(new FeatureExpression(featureModel, FeatureName.GROUP_CONSTRAINTS), PaletteEntry.ROLE_GROUP);
////    fillConfigToPaletteMapping("Group_Constraints", Type.FULFILLMENT); //Role Group
        //nur stepin
////    
////    //Occurence_Constraints
        fillConfigToPaletteMapping(new FeatureExpression(featureModel, FeatureName.OCCURRENCE_CONSTRAINTS));
////    fillConfigToPaletteMapping("Occurence_Constraints", Type.ROLE_EQUIVALENCE);//Keine
////    //Label über Rollentypen
////    
////    //Relationships
        fillConfigToPaletteMapping(new FeatureExpression(featureModel, FeatureName.RELATIONSHIPS), PaletteEntry.RELATIONSHIP);
////    fillConfigToPaletteMapping("Relationships", Type.DATA_TYPE); //Relationship nur stepin
////    //Editpolicy: Erlaubt Zeichnen von Relationships zwischen Rollentypen
////    
////    //Relationship_Constraints
        fillConfigToPaletteMapping(new FeatureExpression(featureModel, FeatureName.RELATIONSHIP_CONSTRAINTS));
////    fillConfigToPaletteMapping("Relationship_Constraints", Type.COMPARTMENT_TYPE);//Keins
////    
////    //Relationship_Cardinality
        fillConfigToPaletteMapping(new FeatureExpression(featureModel, FeatureName.RELATIONSHIP_CARDINALITY));
////    fillConfigToPaletteMapping("Relationship_Cardinality");//Keins
////    //Sind Labels an den Enden der Relationship (Müssten auf leer gesetzt werden)
////    
////    //Intra_Relationship_Constraints
        fillConfigToPaletteMapping(new FeatureExpression(featureModel, FeatureName.INTRA_RELATIONSHIP_CONSTRAINTS), PaletteEntry.REFLEXIVE, 
          PaletteEntry.IRREFLEXIVE, PaletteEntry.TOTAL, PaletteEntry.CYCLIC, PaletteEntry.ACYCLIC);
////    fillConfigToPaletteMapping("Intra_Relationship_Constraints"); //reflexiv, irreflexiv, total, zyklisch, azyklisch
        //nur stepin
////    
////    //Parthood_Constraints
        fillConfigToPaletteMapping(new FeatureExpression(featureModel, FeatureName.PARTHOOD_CONSTRAINTS));
////    fillConfigToPaletteMapping("Parthood_Constraints");//Keins
////    
////    //Inter_Relationship_Constraints
        fillConfigToPaletteMapping(new FeatureExpression(featureModel, FeatureName.INTER_RELATIONSHIP_CONSTRAINTS), 
            PaletteEntry.RELATIONSHIP_IMPLICATION, PaletteEntry.RELATIONSHIP_EXCLUSION);
////    fillConfigToPaletteMapping("Inter_Relationship_Constraints");// relationshipImplication, relationshipExclusion
        //nur stepin
////    
////    //Compartment_Types
        fillConfigToPaletteMapping(new FeatureExpression(featureModel, FeatureName.COMPARTMENT_TYPES), PaletteEntry.COMPARTMENT);
        //stepout und comp_types => sichtbar, stepin && contains_comp ==> sichtbar
////TODO in der Zukunft:      
//      fillConfigToPaletteMapping(new FeatureExpression(featureModel, ExpressionNode.NOT.getLiteral() + FeatureName.COMPARTMENT_TYPES), ROLEMODEL);
////    fillConfigToPaletteMapping("Compartment_Types");//Compartment, wenn nicht aktiviert, dann RoleModel (gibts noch nicht?)
////
////    //Compartment_Structure
        fillConfigToPaletteMapping(new FeatureExpression(featureModel, FeatureName.COMPARTMENT_STRUCTURE));
////    fillConfigToPaletteMapping("Compartment_Structure");//Keins
////    
////    //Compartment_Properties
        fillConfigToPaletteMapping(new FeatureExpression(featureModel, FeatureName.COMPARTMENT_PROPERTIES), PaletteEntry.ATTRIBUTE);
////    fillConfigToPaletteMapping("Compartment_Properties", Type.GROUP); 
        //top level immer, stepin wenn role_prop || compartment_prop
////    //Editpolicyänderung: Drag&Drop von Attributen auf Compartment Modellelemente
////    
////    //Compartment_Behavior
        fillConfigToPaletteMapping(new FeatureExpression(featureModel, FeatureName.COMPARTMENT_BEHAVIOR), PaletteEntry.OPERATION);
////    fillConfigToPaletteMapping("Compartment_Behavior", Type.GROUP);
      //top level immer, stepin wenn role_beh || compartment_beh
////    ////Editpolicyänderung: Drag&Drop von Operationen auf Compartment Modellelemente
////    
////    //Compartment_Inheritance
        fillConfigToPaletteMapping(new FeatureExpression(featureModel, FeatureName.COMPARTMENT_INHERITANCE), PaletteEntry.INHERITANCE);
////    fillConfigToPaletteMapping("Compartment_Inheritance"); //Inheritance
        //stepout immer, stepin wenn (role_inheritance || (compartment_inheritance && contains_compartments))
////    //Editpolicyänderung: Erlaubt Ziehen von Inheritance-Relation zwischen Datentypen
////    
////    //Participants
        fillConfigToPaletteMapping(new FeatureExpression(featureModel, FeatureName.PARTICIPANTS));
////    fillConfigToPaletteMapping("Participants");//Keins
////    
////    //Contains_Compartments
        fillConfigToPaletteMapping(new FeatureExpression(featureModel, FeatureName.CONTAINS_COMPARTMENTS));
////    fillConfigToPaletteMapping("Contains_Compartments");//Keins (Ausgrauen, wird später hinzugefügt)
////    
////    //Playable_by_Defining_Compartment
        fillConfigToPaletteMapping(new FeatureExpression(featureModel, FeatureName.PLAYABLE_BY_DEFINING_COMPARTMENT));
////    fillConfigToPaletteMapping("Playable_by_Defining_Compartment", Type.GROUP);//Keins
////    //Editpolicyänderung (Wenn aktiviert, dann funktioniert Fulfilment von Compartment zu selbem Compartment)
////    
////    //Data_Types
        fillConfigToPaletteMapping(new FeatureExpression(featureModel, FeatureName.DATA_TYPES), PaletteEntry.DATA_TYPE);
////    fillConfigToPaletteMapping("Data_Types", Type.DATA_TYPE); //DataType (nur stepout)
////    
////    //Data_Type_Inheritance
        fillConfigToPaletteMapping(new FeatureExpression(featureModel, FeatureName.DATA_TYPE_INHERITANCE));
////    fillConfigToPaletteMapping("Data_Type_Inheritance", Type.DATA_TYPE);//hat keinen Einfluss!
////    //Editpolicyänderung: Erlaubt Ziehen von Inheritance-Relation zwischen Datentypen
  }
  
  /**
   * Fills the map with {@link FeatureExpression}s and the respective {@link PaletteEntry PaletteEntries}.
   * @param framedFeatureExpression
   * @param paletteEntries
   */
  private void fillConfigToPaletteMapping(FeatureExpression framedFeatureExpression, PaletteEntry... paletteEntries){
    Set<String> templateSet = new HashSet<String>();
    for (PaletteEntry p : paletteEntries) {
      templateSet.add(p.getName());
    }
    configToPaletteMapping.put(framedFeatureExpression, templateSet);
  }
  
  private void fillPaletteEntryVisibility(Map<PaletteEntry, FeatureExpression> map, PaletteEntry paletteEntry, FeatureExpression framedFeatureExpression) {
    if (map == null || paletteEntry == null)
      throw new NullPointerException();
    map.put(paletteEntry, framedFeatureExpression);
    }
  
}
