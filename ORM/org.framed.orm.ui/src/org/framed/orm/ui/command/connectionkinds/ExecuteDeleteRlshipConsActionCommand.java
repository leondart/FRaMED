package org.framed.orm.ui.command.connectionkinds;

import org.eclipse.gef.DefaultEditDomain;
import org.eclipse.gef.commands.Command;
import org.framed.orm.ui.action.DeleteRelationshipConstraintsAction;
import org.framed.orm.ui.editPart.connectionkinds.ORMRelationshipConstraintEditPart;
import org.framed.orm.ui.editor.ORMGraphicalEditor;

public class ExecuteDeleteRlshipConsActionCommand extends Command {


  public ExecuteDeleteRlshipConsActionCommand() {
    super.setLabel("ExecuteDeleteRlshipConsActionCommand");
  }

  private ORMRelationshipConstraintEditPart editPart;

  /**
   * The command can be executed if all parameters have been set.
   */
  @Override
  public boolean canExecute() {
    return editPart != null;
  }


  @Override
  public void execute() {

    ORMGraphicalEditor editorPart =
        (ORMGraphicalEditor) ((DefaultEditDomain) editPart.getViewer().getEditDomain())
            .getEditorPart();
    DeleteRelationshipConstraintsAction action =
        (DeleteRelationshipConstraintsAction) editorPart.getEditorActionRegistry().getAction(
            DeleteRelationshipConstraintsAction.DELTE_RLSHIP_CONSTRAINTS_ID);
    action.setEditPart(editPart);
    action.run();

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

  public void setEditPart(final ORMRelationshipConstraintEditPart editPart) {
    this.editPart = editPart;
  }

}
