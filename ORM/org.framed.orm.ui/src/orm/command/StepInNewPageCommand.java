package orm.command;

import org.eclipse.gef.DefaultEditDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.WorkbenchException;

import orm.editor.ORMGraphicalEditor;
import orm.editor.ORMMultiPageEditor;

/**
 * @author Kay Bierzynski
 * */
public class StepInNewPageCommand extends Command {

	 private AbstractGraphicalEditPart editpart;
	 
	  @Override
	  public void execute() {
		  
		  ORMGraphicalEditor editorPart = (ORMGraphicalEditor) ((DefaultEditDomain)editpart.getViewer().getEditDomain()).getEditorPart();
		  IWorkbenchPage page = null;
		  
		// open a new eclipse window  
		try {
			page = editorPart.getSite().getWorkbenchWindow().openPage(editorPart.getSite());
		} catch (WorkbenchException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  IEditorInput input = editorPart.getEditorInput();
		  
		  
		  try {
			    // open new editor instance with old content edipart model
				ORMMultiPageEditor newPart = (ORMMultiPageEditor) page.openEditor(input, "ORMEditor.editorID", false, IWorkbenchPage.MATCH_NONE );
		     	newPart.getEditorBeh().getOwnViewer().setContents( editpart.getViewer().getContents().getModel());
		     	newPart.getEditorData().getOwnViewer().setContents( editpart.getViewer().getContents().getModel());
				// set focus on the editor instance with new content
				page.activate(editorPart.getParentEditor());
		   } catch (PartInitException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
		   }
		    
		   
		   // set the two editors on same level
		   ((ORMMultiPageEditor)editorPart.getParentEditor()).getEditorBeh().getOwnViewer().setContents(editpart.getModel());	
		   ((ORMMultiPageEditor)editorPart.getParentEditor()).getEditorData().getOwnViewer().setContents(editpart.getModel());	
	  }
	 
	 @Override
	  public void undo() {
		 
	  }
	 
	 /**
	   * This command can for now not be undone. 
	  */
	@Override
	public boolean canUndo() {
		  return false;
	}
	 
	public void setEditPart(AbstractGraphicalEditPart editpart) {
		 this.editpart = editpart;
	 }
}
