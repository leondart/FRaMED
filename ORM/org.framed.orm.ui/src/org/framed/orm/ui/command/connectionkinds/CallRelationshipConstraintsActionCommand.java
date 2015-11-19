package org.framed.orm.ui.command.connectionkinds;

import org.eclipse.gef.DefaultEditDomain;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.CommandStack;
import org.framed.orm.model.Relation;
import org.framed.orm.ui.action.RelationshipConstraintsAction;
import org.framed.orm.ui.editor.ORMGraphicalEditor;


/**
 * Through this command the {@link RelationshipConstraintsAction} is called. This command is called,
 * when the user selects the figure of a {@link Relation} from type total, cyclic, acyclic, reflexive or irreflexive and
 * the clicks on the delete button.(red X in the actionbar)
 * 
 * @author Kay Bierzynski
 * */
public class CallRelationshipConstraintsActionCommand extends Command {

  /** The {@link RelationshipConstraintsAction}, which called/invoked through this command. */
  private RelationshipConstraintsAction action;
  /**
   * The {@link EditPart} of the {@link Relation} from the type total, cyclic, acyclic, reflexive or irreflexive, which
   * the user has selected.
   */
  private EditPart editPart;

  /**
   * Constructor of this command, where the label is set, which describes this command to the user.
   * 
   */
  public CallRelationshipConstraintsActionCommand() {
    super.setLabel("CallRelationshipConstraintsActionCommand");
  }

  /**
   * This method tests if the conditions for executing this command are fulfilled,
   * 
   * @return true if the parameter editPart is set.
   */
  @Override
  public boolean canExecute() {
    return editPart != null;
  }

  /**
   * {@inheritDoc} In this method we get the {@link ORMGraphicalEditor}, which owns the
   * {@link RelationshipConstraintsAction}. After we got the editor we derive from it the
   * {@link RelationshipConstraintsAction}, set the action up and run the action through calling the
   * run method.
   */
  @Override
  public void execute() {

    final ORMGraphicalEditor editorPart =
        (ORMGraphicalEditor) ((DefaultEditDomain) editPart.getViewer().getEditDomain())
            .getEditorPart();
    action =
        (RelationshipConstraintsAction) editorPart.getEditorActionRegistry().getAction(
            RelationshipConstraintsAction.RLSHIP_CONSTRAINTS_ID);
    action.setEditPart(editPart);
    action.run();

  }

  /**
   * {@inheritDoc} This command is undone through calling
   * {@link RelationshipConstraintsAction#actionUndo()}. The action must undo itself, because a
   * command has in the normal case no accesses to the {@link CommandStack}.
   */
  @Override
  public void undo() {
    action.actionUndo();
  }


  /**
   * {@inheritDoc} This command is redone through calling
   * {@link RelationshipConstraintsAction#actionRedo()}. The action must redo itself, because a
   * command has in the normal case no accesses to the {@link CommandStack}.
   */
  @Override
  public void redo() {
    action.actionRedo();
  }

  /**
   * Setter of the {@link EditPart}, which the user has selected for
   * deletion.
   * 
   * @param editpart org.eclipse.gef.EditPart
   */
  public void setEditPart(final EditPart editPart) {
    this.editPart = editPart;
  }

}
