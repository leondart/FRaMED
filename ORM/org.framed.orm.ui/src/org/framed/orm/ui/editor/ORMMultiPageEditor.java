package org.framed.orm.ui.editor;

import java.io.IOException;
import java.util.EventObject;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IProgressMonitor;
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
import org.framed.orm.model.CompartmentDiagram;
import org.framed.orm.model.Node;
import org.framed.orm.model.OrmPackage;


/**
 * The multi-page editor handles the behaviour editor and the data editor.
 * 
 * @author Kay Bierzynski
 * @author Lars Schütze
 * */
public class ORMMultiPageEditor extends MultiPageEditorPart implements ISelectionListener,
    CommandStackListener, IResourceChangeListener {


  private ORMGraphicalEditor editorBeh;
  private ORMGraphicalEditor editorData;
  private EditorChangeNotifier changeNotifier = null;
  private Resource resource;
  private String inputFilename = "";

  public void setEditorChangeNotifier(EditorChangeNotifier changeNotifier) {
    this.changeNotifier = changeNotifier;
  }

  public void createCustomTitleForEditor(Object model) {

    String modelClassName = model.getClass().getSimpleName();
    setTitle(inputFilename + " " + modelClassName.substring(0, modelClassName.length() - 4));
    if (model instanceof Node) {
      setTitle(getTitle() + " " + ((Node) model).getName());
    }
  }

  public String getInputFileName() {
    return inputFilename;
  }

  public ORMMultiPageEditor() {
    super();
    ResourcesPlugin.getWorkspace().addResourceChangeListener(this);
  }

  @Override
  public void setTitleImage(Image titleImage) {
    super.setTitleImage(titleImage);
  }

  /**
   *  creates the beahvior editor and adds it to the multipage editor
   */
  void createBehaviorEditorPage() {
    try {
      editorBeh = new ORMGraphicalEditor(this, resource, false);
      int index = addPage(editorBeh, getEditorInput());
      setPageText(index, "Behavior");
    } catch (PartInitException e) {
      ErrorDialog.openError(getSite().getShell(), "Error creating nested orm editor", null,
          e.getStatus());
    }
  }

  /**
   *  creates the data editor and adds it to the multipageeditor
   */
  void createDataEditorPage() {
    try {
      editorData = new ORMGraphicalEditor(this, resource, true);
      int index = addPage(editorData, getEditorInput());
      setPageText(index, "Data");
    } catch (PartInitException e) {
      ErrorDialog.openError(getSite().getShell(), "Error creating nested orm editor", null,
          e.getStatus());
    }
  }

  /**
   * Creates the behavior and data editor pages and initializes them
   */
  @Override
  protected void createPages() {
    createBehaviorEditorPage();
    createDataEditorPage();

    // set TitleImage of this ORMMultiPageEditor with background color of the viewer of the behaivorEditor
    Image img =
        Activator.imageDescriptorFromPlugin(Activator.PLUGIN_ID, "icons/rosi-icon-smaller.gif")
            .createImage();
    img.setBackground(editorBeh.getGraphicalControl().getBackground());
    setTitleImage(img);
  }

  /**
   * The <code>MultiPageEditorExample</code> implementation of this method checks that the input is
   * an instance of <code>IFileEditorInput</code>.
   */
  public void init(IEditorSite site, IEditorInput editorInput) throws PartInitException {
    if (!(editorInput instanceof IFileEditorInput))
      throw new PartInitException("Invalid Input: Must be IFileEditorInput");
    super.init(site, editorInput);
    getSite().getWorkbenchWindow().getSelectionService().addSelectionListener(this);
    
    initializeResource(editorInput);
  }

  private void initializeResource(IEditorInput editorInput) {
    OrmPackage.eINSTANCE.eClass();                      // This initializes the OrmPackage singleton implementation.
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

  // TODO: test whether "save all" works correct
  // save for the active editor and synchronization between the two editors
  @Override
  public void doSave(IProgressMonitor monitor) {
    for (int i = 0; i < getPageCount(); i++) {
      IEditorPart editorPart = getEditor(i);
      if (editorPart.isDirty()) {
        editorPart.doSave(monitor);
      }
    }
  }

  @Override
  public void doSaveAs() {

    if (editorBeh.equals(getActiveEditor())) {
      editorBeh.doSaveAs();
      setInput(editorBeh.getEditorInput());

    }

    if (editorData.equals(getActiveEditor())) {
      editorData.doSaveAs();
      setInput(editorData.getEditorInput());

    }
  }

  // TODO: adapt it, because not everything is allowed
  @Override
  public boolean isSaveAsAllowed() {
    return true;
  }

  // enables select action for the active editor
  @Override
  public void selectionChanged(IWorkbenchPart part, ISelection selection) {
    if (this.equals(getSite().getPage().getActiveEditor())) {

      if (editorBeh.equals(getActiveEditor())) {
        editorBeh.selectionChanged(getActiveEditor(), selection);
      }
      if (editorData.equals(getActiveEditor()))
        editorData.selectionChanged(getActiveEditor(), selection);
    }
  }

  // need to be overriden so that when you switch between the editors the actionbarcontributer
  // take the actionregistry/graphicalViewer/CommandStack from the active editor
  @Override
  protected void pageChange(int newPageIndex) {
    super.pageChange(newPageIndex);
    IEditorPart activeEditor = getEditor(newPageIndex);

    IEditorActionBarContributor contributor = getEditorSite().getActionBarContributor();
    if (contributor != null && contributor instanceof ORMGraphicalEditorActionBarContributor) {
      ((ORMGraphicalEditorActionBarContributor) contributor).setActiveEditor(activeEditor);
    }
  }

  @Override
  public void commandStackChanged(EventObject event) {
    if (this.equals(getSite().getPage().getActiveEditor())) {
      if (editorBeh.equals(getActiveEditor())) {
        editorBeh.commandStackChanged(event);
      }

      if (editorData.equals(getActiveEditor())) {
        editorData.commandStackChanged(event);
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
            if (((FileEditorInput) editorBeh.getEditorInput()).getFile().getProject()
                .equals(event.getResource())) {
              IEditorPart editorPart = pages[i].findEditor(editorBeh.getEditorInput());
              pages[i].closeEditor(editorPart, true);
            }
          }
        }

      });
    }
  }

  public ORMGraphicalEditor getBehaviorEditor() {
    return editorBeh;
  }

  public ORMGraphicalEditor getDataEditor() {
    return editorData;
  }

  /**
   * Sets the object obj as content in the behavior editor and data editor
   * 
   * @param obj The object which will be set as content
   */
  public void setContents(Object obj) {
    /*
     * first, check which editor type we will get when setting the object as content. The palette
     * will be updated
     */

    getBehaviorEditor().getOwnViewer().setContents(obj);
    getDataEditor().getOwnViewer().setContents(obj);
  }
}
