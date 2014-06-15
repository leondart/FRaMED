package org.framed.orm.ui.action;

import java.util.ArrayList;

import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.gef.ui.actions.SelectionAction;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;
import org.framed.orm.model.Relationship;
import org.framed.orm.model.RelationshipConstraint;
import org.framed.orm.ui.command.connectionkinds.ORMRelationshipConstraintDeleteCommand;
import org.framed.orm.ui.command.connectionkinds.ORMRelationshipConstraintCreateCommand;
import org.framed.orm.ui.editPart.connectionkinds.ORMRelationEditPart;
import org.framed.orm.ui.editPart.connectionkinds.ORMRelationshipConstraintEditPart;
import org.framed.orm.ui.editPart.connectionkinds.ORMRelationshipEditPart;

public class RelationshipConstraintsAction extends SelectionAction {

  public static final String RLSHIP_CONSTRAINTS_ID = "RelationshipConstraints";
  private ORMRelationEditPart editPart;

  // private Request request;

  public RelationshipConstraintsAction(IWorkbenchPart part) {
    super(part);
    setId(RLSHIP_CONSTRAINTS_ID);
    setText("RelationshipConstraints...");
  }

  // this set method is for embedding this delete action in the delete button in the actionbar
  public void setEditPart(ORMRelationshipConstraintEditPart editPart) {
    this.editPart = editPart;
  }

  @Override
  protected boolean calculateEnabled() {

    if (getSelectedObjects().isEmpty() || getSelectedObjects().size() > 1) {
      return false;
    }

    for (Object selectedObject : getSelectedObjects()) {
      if (selectedObject instanceof ORMRelationshipEditPart) {
        return true;
      }
    }
    return false;
  }


  @Override
  public void run() {
    int style = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell().getStyle();
    Shell shell = new Shell((style & SWT.MIRRORED) != 0 ? SWT.RIGHT_TO_LEFT : SWT.NONE);

    // get selected constraint editpart
    if (editPart == null) {
      editPart = (ORMRelationEditPart) getSelectedObjects().get(0);
    }

    // get constraint relationship
    Relationship rlship;

    if (editPart instanceof ORMRelationshipEditPart) {
      rlship = (Relationship) editPart.getModel();
    } else {
      rlship = ((RelationshipConstraint) editPart.getModel()).getRelation();
    }
    // put all RelationshipConstraints in a list
    ArrayList<RelationshipConstraint> constraints = new ArrayList<RelationshipConstraint>();
    constraints.addAll(rlship.getRlshipConstraints());

    // create and setup the popup dialog
    ConstraintsDialog dialog = new ConstraintsDialog(shell);
    dialog.setConstraints(constraints);

    // open the popup dialog
    int returnCode = dialog.open();
    // end the action, when the popup dialog is closed through cancel button
    if (returnCode == Window.CANCEL) {
      editPart = null;
      return;
    }


    // delete all chosen constraints, when the popup dialog is closed through ok button
    else if (returnCode == Window.OK) {
      CompoundCommand compoundCommand = new CompoundCommand();

      for (RelationshipConstraint rc : dialog.getChosenCreateConstraints()) {
        if (!constraints.contains(rc)) {
          ORMRelationshipConstraintCreateCommand command =
              new ORMRelationshipConstraintCreateCommand();

          command.setRelation(rc);
          command.setRelationship(rlship);
          command.setRelationContainer(rlship.getRelationContainer());
          command.setSourceNode(rlship.getSource());
          command.setTargetNode(rlship.getTarget());

          compoundCommand.add(command);
        }
      }

      for (RelationshipConstraint rc : dialog.getChosenDeleteConstraints()) {
        if (constraints.contains(rc)) {
          ORMRelationshipConstraintDeleteCommand command =
              new ORMRelationshipConstraintDeleteCommand();
          command.setRelationshipConstraint(rc);
          command.setEPViewer(editPart.getViewer());
          compoundCommand.add(command);
        }
      }

      getCommandStack().execute(compoundCommand);

      // after every run of the action the editPart must be reset, because actions are not
      // initialized new every time when you call tham
      editPart = null;
    }
  }

  public void actionUndo() {
    getCommandStack().undo();
  }

  public void actionRedo() {
    getCommandStack().redo();
  }
}
