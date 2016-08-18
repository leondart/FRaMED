package org.framed.orm.ui.editor;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.EventObject;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.gef.commands.CommandStackListener;
import org.eclipse.jface.dialogs.ErrorDialog;
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
import org.framed.orm.featuremodel.FRaMEDConfiguration;
import org.framed.orm.featuremodel.FRaMEDFeature;
import org.framed.orm.model.Model;
import org.framed.orm.model.Shape;
import org.framed.orm.model.OrmPackage;
import org.framed.orm.model.Type;
import org.osgi.framework.Bundle;

import de.ovgu.featureide.fm.core.FeatureModel;
import de.ovgu.featureide.fm.core.configuration.Configuration;
import de.ovgu.featureide.fm.core.configuration.Selection;
import de.ovgu.featureide.fm.core.io.UnsupportedModelException;
import de.ovgu.featureide.fm.core.io.xml.XmlFeatureModelReader;
import de.ovgu.featureide.fm.core.job.WorkMonitor;
import de.ovgu.featureide.fm.ui.editors.configuration.ConfigJobManager;


/**
 * 
 * This {@link MultiPageEditorPart} has as pages the behaviour {@link ORMGraphicalEditor} and the
 * data {@link ORMGraphicalEditor}.
 * 
 * @author Kay Bierzynski
 * @author Lars Schütze
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
  
  private FeatureModelConfigurationEditor featureModelConfigurationEditor;
  
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
   * creation of custom title for this edito.
   */
  private String inputFilename;

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
   * content of the viewer of data/behaviour {@link ORMGraphicalEditor}.
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
   * This method creates the beahvior {@link ORMGraphicalEditor} and adds the behaviour editor as a
   * page to this editor.
   */
  private void createBehaviorEditorPage() {
    try {
      behaviourEditor = new ORMGraphicalEditor(this, resource, false);
      int index = addPage(behaviourEditor, getEditorInput());
      setPageText(index, "Behavior");
    } catch (PartInitException e) {
      ErrorDialog.openError(getSite().getShell(), "Error creating nested orm editor", null,
          e.getStatus());
    }
  }


  /**
   * This method creates the data {@link ORMGraphicalEditor} and adds the behaviour data as a page
   * to this editor.
   */
  private void createDataEditorPage() {
    try {
      dataEditor = new ORMGraphicalEditor(this, resource, true);
      int index = addPage(dataEditor, getEditorInput());
      setPageText(index, "Data");
    } catch (PartInitException e) {
      ErrorDialog.openError(getSite().getShell(), "Error creating nested orm editor", null,
          e.getStatus());
    }
  }
  
 
  private void createFeatureModelConfigurationEditor() throws FileNotFoundException, UnsupportedModelException {
    try {
      featureModelConfigurationEditor = new FeatureModelConfigurationEditor(this, resource);
      //setConfiguration();
      featureModelConfigurationEditor.setOrmMultiPageEditor(this);
      int index = addPage(featureModelConfigurationEditor, getEditorInput());
      setPageText(index, "Configuration");
    } catch (PartInitException e) {
      ErrorDialog.openError(getSite().getShell(), "Error creating nested orm editor", null,
          e.getStatus());
    }
  }
  
 

  /** {@inheritDoc} In this method the title image of this editor is set as well. */
  @Override
  protected void createPages() {
    createBehaviorEditorPage();
    createDataEditorPage();
    try {
      createFeatureModelConfigurationEditor();
    } catch (FileNotFoundException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } catch (UnsupportedModelException e) {
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
   * {@inheritDoc} This method needs to be overriden so that when you switch between the editors the
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
      IEditorActionBarContributor contributor = getEditorSite().getActionBarContributor();
      if (contributor != null && contributor instanceof ORMGraphicalEditorActionBarContributor) {
        ((ORMGraphicalEditorActionBarContributor) contributor).setActiveEditor(activeEditor);
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
}
