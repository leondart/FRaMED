package org.framed.orm.ui.command;


import org.eclipse.gef.DefaultEditDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.framed.orm.ui.editor.ORMGraphicalEditor;
import org.framed.orm.ui.editor.ORMGraphicalEditor.EditorType;
import org.framed.orm.ui.editor.ORMMultiPageEditor;

/**
 * @author Kay Bierzynski
 * */
public class GoDownTreeCommand extends Command {

  private AbstractGraphicalEditPart editpart;

  public GoDownTreeCommand(){
    super.setLabel("GoDownTree");
  }
  
  @Override
  public void execute() {

    //get the current editorpart
    ORMGraphicalEditor editorPart =
        (ORMGraphicalEditor) ((DefaultEditDomain) editpart.getViewer().getEditDomain())
            .getEditorPart();
    IWorkbenchPage activePage = editorPart.getSite().getWorkbenchWindow().getActivePage();  //get the current active page
    IEditorInput input = editorPart.getEditorInput();
    IEditorPart[] editorlist = activePage.getEditors();

    // close all old editor instances
    for (IEditorPart editor : editorlist) {

      if (!editor.equals(editorPart.getParentEditor()) && editor.getEditorInput().equals(input)) {
        activePage.closeEditor(editor, true);
      }

    }

    try {
      // open new editor instance with old content editpart model
      ORMMultiPageEditor newPart =
          (ORMMultiPageEditor) activePage.openEditor(input, "ORMEditor.editorID", false,
              IWorkbenchPage.MATCH_NONE);
      editorPart.setEditorType(EditorType.ROLES);
      newPart.setContents(editpart.getViewer().getContents().getModel());
      // set focus on the editor instance with new content
      activePage.activate(editorPart.getParentEditor());
    } catch (PartInitException e1) {
      // TODO Auto-generated catch block
      e1.printStackTrace();
    }


    // set the two editors on same level
    final ORMMultiPageEditor ormMultiPageEditor = (ORMMultiPageEditor) editorPart.getParentEditor();
    ormMultiPageEditor.setContents(editpart.getModel());
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
