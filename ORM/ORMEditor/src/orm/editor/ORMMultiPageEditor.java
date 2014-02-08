package orm.editor;

import java.util.EventObject;

import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.gef.commands.CommandStackListener;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IEditorActionBarContributor;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.ui.part.MultiPageEditorPart;
import org.eclipse.ui.ISelectionListener;
/**
 * 
 * @author Kay Bierzynski
 * */
public class ORMMultiPageEditor extends MultiPageEditorPart implements ISelectionListener, CommandStackListener, IResourceChangeListener {
 
	private ORMGraphicalEditor editorBeh,editorData;
	
	public ORMGraphicalEditor getEditorBeh(){return  editorBeh;}
	
	public ORMGraphicalEditor getEditorData(){return  editorData;}
	
	public ORMMultiPageEditor() {
		super();
		ResourcesPlugin.getWorkspace().addResourceChangeListener(this);
	}
	
	
	// create/adds the beahvioreditor to the multipageeditor
	void createPage0() {
		try {
			editorBeh = new ORMGraphicalEditor(this,false);
			int index = addPage(editorBeh, getEditorInput());
			setPageText(index, "Behavior");
		} catch (PartInitException e) {
			ErrorDialog.openError(
				getSite().getShell(),
				"Error creating nested orm editor",
				null,
				e.getStatus());
		}
	}
	
	// create/adds the dataeditor to the multipageeditor
	void createPage1() {
		try {
			editorData = new ORMGraphicalEditor(this,true);
			int index = addPage(editorData, getEditorInput());
			setPageText(index, "Data");
		} catch (PartInitException e) {
			ErrorDialog.openError(
				getSite().getShell(),
				"Error creating nested orm editor",
				null,
				e.getStatus());
		}
	}
	
	@Override
	protected void createPages() {
		createPage0();
		createPage1();

	}
	/**
	 * The <code>MultiPageEditorExample</code> implementation of this method
	 * checks that the input is an instance of <code>IFileEditorInput</code>.
	 */
	public void init(IEditorSite site, IEditorInput editorInput)
		throws PartInitException {
		if (!(editorInput instanceof IFileEditorInput))
			throw new PartInitException("Invalid Input: Must be IFileEditorInput");
		super.init(site, editorInput);
		getSite().getWorkbenchWindow().getSelectionService().addSelectionListener(this);
		
		//getSite().getWorkbenchWindow().getSelectionService().;
	}
	
	//TODO: testen ob save all richtig funktioniert
	// save for the active editor and synchronisation between the two editors
	@Override
	public void doSave(IProgressMonitor monitor) {
		if (this.equals(getSite().getPage().getActiveEditor())) {
		 if (editorBeh.equals(getActiveEditor())){
		    editorBeh.doSave(monitor);
		    //update the other editor
		    editorData.getOwnViewer().setContents( editorBeh.getOwnViewer().getContents().getModel());
		 }
		 if (editorData.equals(getActiveEditor())){
			    editorData.doSave(monitor);
			  //update the other editor
			   editorBeh.getOwnViewer().setContents( editorData.getOwnViewer().getContents().getModel());
		 }
		}
		
	}

	@Override
	public void doSaveAs() {
		//IEditorPart editor = getSite().getPage().getActiveEditor();
		
		//editorData.doSaveAs();
		//setPageText(0, editor.getTitle());
		
     if (editorBeh.equals(getActiveEditor()))
     {
    	 editorBeh.doSaveAs();
		setInput(editorBeh.getEditorInput());

     }
 	
     if (editorData.equals(getActiveEditor())){
    	editorData.doSaveAs();
		setInput(editorData.getEditorInput());
	
     }
	}

	//TODO: anpassen nicht alles ist erlaubt
	@Override
	public boolean isSaveAsAllowed() {
		return true;
	}
	
	// enabled select action for the active editor
	@Override
	public void selectionChanged(IWorkbenchPart part, ISelection selection) {
		if (this.equals(getSite().getPage().getActiveEditor())) {
			
		    if (editorBeh.equals(getActiveEditor())){
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
		// TODO Auto-generated method stub
		super.pageChange(newPageIndex);
		IEditorPart activeEditor = getEditor(newPageIndex);

		IEditorActionBarContributor contributor = getEditorSite()
				.getActionBarContributor();
		if (contributor != null
				&& contributor instanceof ORMGraphicalEditorActionBarContributor) {
			(( ORMGraphicalEditorActionBarContributor) contributor)
					.setActiveEditor(activeEditor);
		}
		
	}

	
	@Override
	public void commandStackChanged(EventObject event) {
		if (this.equals(getSite().getPage().getActiveEditor())) {
		    if (editorBeh.equals(getActiveEditor()))
		    	editorBeh.commandStackChanged(event);
		    	
		   
		    if (editorData.equals(getActiveEditor()))
		    	editorData.commandStackChanged(event);;
		 }
		
	}
	
	
	
	/**
	 * Closes all project files on project close.
	 */
	@Override
	public void resourceChanged(final IResourceChangeEvent event){
		if(event.getType() == IResourceChangeEvent.PRE_CLOSE){
			Display.getDefault().asyncExec(new Runnable(){
				public void run(){
					IWorkbenchPage[] pages = getSite().getWorkbenchWindow().getPages();
					for (int i = 0; i<pages.length; i++){
						if(((FileEditorInput)editorBeh.getEditorInput()).getFile().getProject().equals(event.getResource())){
							IEditorPart editorPart = pages[i].findEditor(editorBeh.getEditorInput());
							pages[i].closeEditor(editorPart,true);
						}
					}
				}            
			});
		}
	}

}
