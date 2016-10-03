package org.framed.orm.ui.editor;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.EventObject;
import java.util.HashMap;
import java.util.Map;

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

import de.ovgu.featureide.fm.core.io.UnsupportedModelException;


/**
 * 
 * This {@link MultiPageEditorPart} is responsible for creating and managing all pages of FRaMED.
 * The following pages exist:
 * <ul> 
 *  <li>Behavior ({@link ORMGraphicalEditor})</li> 
 *  <li>Data ({@link ORMGraphicalEditor})</li>
 *  <li>Configuration ({@link FeatureModelConfigurationEditor}) </li>
 *  <li>CROM ({@link ReadOnlyEditor})</li>
 *  <li>CROM_DIA ({@link ReadOnlyEditor})</li> 
 * </ul>
 * 
 * @author Kay Bierzynski
 * @author Lars Schütze
 * @author Marc Kandler
 * */
public class ORMMultiPageEditor extends MultiPageEditorPart implements ISelectionListener,
    CommandStackListener, IResourceChangeListener {

  /**
   * The behavior {@link ORMGraphicalEditor}, which is manages through this editor.
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
    behaviourEditor =
        new ORMGraphicalEditor(this, resource, false, stepOUTPaletteVisibility,
            stepINPaletteVisibility);
  }


  /**
   * This method creates the data {@link ORMGraphicalEditor}.
   */
  private void createDataEditorPage() {
    dataEditor =
        new ORMGraphicalEditor(this, resource, true, stepOUTPaletteVisibility,
            stepINPaletteVisibility);
  }


  /**
   * This method creates the {@link FeatureModelConfigurationEditor}.
   * @throws FileNotFoundException
   * @throws UnsupportedModelException
   */
  private void createFeatureModelConfigurationEditor() throws FileNotFoundException,
      UnsupportedModelException {
    featureModelConfigurationEditor = new FeatureModelConfigurationEditor(this, resource);
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
    // Necessary to initialize it here, as the constructor of ORMMultiPageEditor is called after
    // createPages()
    // configToPaletteMapping = new HashMap<FeatureExpression, Set<String>>();
    stepOUTPaletteVisibility = new HashMap<PaletteEntry, FeatureExpression>();
    stepINPaletteVisibility = new HashMap<PaletteEntry, FeatureExpression>();

    // It is necessary to create the FeatureModelConfigurationEditor first, because the graphical
    // editors
    // (behavior and data) rely on the standardFramedConfiguration which is created in that editor
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
      initializePaletteVisibilityMappings();
    } catch (ScriptException e1) {
      // TODO Auto-generated catch block
      e1.printStackTrace();
    }

    createBehaviorEditorPage();
    createDataEditorPage();
    createCromDiaReadOnlyEditorPage();
    createCromReadOnlyEditorPage();

    // In order to keep the order of the pages(Behavior, Data, Configuration) in the editor,
    // we need to create the pages after calling the respective Editor constructors
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

      // To get the .crom-file, we have to take the current editorinput and derive the desired file
      // from it
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
    // update the tree if the new page is the configuration editor
    if (activeEditor.getClass().getName().endsWith("FeatureModelConfigurationEditor")) {
      featureModelConfigurationEditor.updateTree();
    } else {
      // If the target editor is one of the graphical editors
      if (activeEditor instanceof ORMGraphicalEditor) {
        // call the update editor type function in order to update the palette entry visibility as
        // well
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


  /**
   * Initialized the mapping from a Palette Entry to the {@link FeatureExpression} which has to be evaluated to true
   * in order for the palette entry to be visible.
   * We differentiate between the top-level view ("Step-Out") and the detailed view (Step-In), as depending on the state
   * different Palette Entries are visible.
   * 
   * </br></br>
   * Please note that there are three possible ways to create a {@link FeatureExpression}.
   * 
   * </br>
   * The Key of the respective map (Palette Entry) is visible in the editor, if the Value ({@link FeatureExpression}) can be evaluated to true.
   * @throws ScriptException
   */
  private void initializePaletteVisibilityMappings() throws ScriptException {
    // Step-Out Visibility
    stepOUTPaletteVisibility.put(PaletteEntry.COMPARTMENT, new FeatureExpression(
        FeatureName.COMPARTMENT_TYPES));
    stepOUTPaletteVisibility.put(PaletteEntry.NATURAL_TYPE, new FeatureExpression(true));
    stepOUTPaletteVisibility.put(PaletteEntry.DATA_TYPE, new FeatureExpression(
        FeatureName.DATA_TYPES));
    stepOUTPaletteVisibility.put(PaletteEntry.GROUP, new FeatureExpression(true));
    stepOUTPaletteVisibility.put(PaletteEntry.FULFILLMENT, new FeatureExpression(true));
    stepOUTPaletteVisibility.put(PaletteEntry.OPERATION, new FeatureExpression(true));
    stepOUTPaletteVisibility.put(PaletteEntry.ATTRIBUTE, new FeatureExpression(true));
    stepOUTPaletteVisibility.put(PaletteEntry.INHERITANCE, new FeatureExpression(true));

    // Step-In Visibility
    stepINPaletteVisibility.put(PaletteEntry.ROLE_TYPE, new FeatureExpression(true));
    stepINPaletteVisibility.put(PaletteEntry.ROLE_GROUP, new FeatureExpression(
        FeatureName.GROUP_CONSTRAINTS));
    stepINPaletteVisibility.put(PaletteEntry.ROLE_IMPLICATION, new FeatureExpression(
        FeatureName.ROLE_IMPLICATION));
    stepINPaletteVisibility.put(PaletteEntry.RELATIONSHIP_IMPLICATION, new FeatureExpression(
        FeatureName.INTER_RELATIONSHIP_CONSTRAINTS));
    stepINPaletteVisibility.put(PaletteEntry.RELATIONSHIP_EXCLUSION, new FeatureExpression(
        FeatureName.INTER_RELATIONSHIP_CONSTRAINTS));
    stepINPaletteVisibility.put(PaletteEntry.ROLE_EQUIVALENCE, new FeatureExpression(
        FeatureName.ROLE_EQUIVALENCE));
    stepINPaletteVisibility.put(PaletteEntry.ROLE_PROHIBITION, new FeatureExpression(
        FeatureName.ROLE_PROHIBITION));
    stepINPaletteVisibility.put(PaletteEntry.RELATIONSHIP, new FeatureExpression(
        FeatureName.RELATIONSHIPS));
    FeatureExpression expression =
        new FeatureExpression(FeatureName.INTRA_RELATIONSHIP_CONSTRAINTS);
    stepINPaletteVisibility.put(PaletteEntry.REFLEXIVE, expression);
    stepINPaletteVisibility.put(PaletteEntry.IRREFLEXIVE, expression);
    stepINPaletteVisibility.put(PaletteEntry.TOTAL, expression);
    stepINPaletteVisibility.put(PaletteEntry.CYCLIC, expression);
    stepINPaletteVisibility.put(PaletteEntry.ACYCLIC, expression);
    stepINPaletteVisibility.put(PaletteEntry.COMPARTMENT, new FeatureExpression(
        FeatureName.CONTAINS_COMPARTMENTS));
    stepINPaletteVisibility.put(PaletteEntry.OPERATION, new FeatureExpression(
        FeatureName.ROLE_BEHAVIOR + ExpressionNode.OR.getLiteral()
            + FeatureName.COMPARTMENT_BEHAVIOR));
    stepINPaletteVisibility.put(PaletteEntry.ATTRIBUTE, new FeatureExpression(
        FeatureName.ROLE_PROPERTIES + ExpressionNode.OR.getLiteral()
            + FeatureName.COMPARTMENT_PROPERTIES));
    stepINPaletteVisibility.put(PaletteEntry.INHERITANCE, new FeatureExpression(
        FeatureName.ROLE_INHERITANCE + " || (" + FeatureName.COMPARTMENT_INHERITANCE + "&&"
            + FeatureName.CONTAINS_COMPARTMENTS + ")"));

  }
}
