package orm.command;


import org.eclipse.gef.DefaultEditDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;

import orm.editor.ORMGraphicalEditor;
import orm.editor.ORMMultiPageEditor;

/**
 * @author Kay Bierzynski
 * */
public class GoDownTreeCommand extends Command {

  private AbstractGraphicalEditPart editpart;

  @Override
  public void execute() {

    ORMGraphicalEditor editorPart =
        (ORMGraphicalEditor) ((DefaultEditDomain) editpart.getViewer().getEditDomain())
            .getEditorPart();
    IWorkbenchPage activePage = editorPart.getSite().getWorkbenchWindow().getActivePage();
    IEditorInput input = editorPart.getEditorInput();
    IEditorPart[] editorlist = activePage.getEditors();

    // close all old editor instances
    for (IEditorPart part : editorlist) {

      if (!(part.equals(editorPart.getParentEditor())) && part.getEditorInput().equals(input)) {
        activePage.closeEditor(part, true);
      }

    }

    try {
      // open new editor instance with old content edipart model
      ORMMultiPageEditor newPart =
          (ORMMultiPageEditor) activePage.openEditor(input, "ORMEditor.editorID", false,
              IWorkbenchPage.MATCH_NONE);
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
