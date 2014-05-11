package org.framed.orm.ui.action;

import java.util.ArrayList;

import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.gef.ui.actions.SelectionAction;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;
import org.framed.orm.model.Relationship;
import org.framed.orm.model.RelationshipConstraint;
import org.framed.orm.ui.command.connectionkinds.ORMRealtionshipConstraintDeleteCommand;
import org.framed.orm.ui.editPart.connectionkinds.ORMRelationshipConstraintEditPart;

public class DeleteRelationshipConstraintsAction extends SelectionAction {

  public static final String DELTE_RLSHIP_CONSTRAINTS_ID = " DeleteRelationshipConstraints";
  public static final String DELTE_RLSHIP_CONSTRAINTS_REQUEST = "DeleteRelationshipConstraints";
  private ORMRelationshipConstraintEditPart editPart;

  // private Request request;

  public DeleteRelationshipConstraintsAction(IWorkbenchPart part) {
    super(part);
    setId(DELTE_RLSHIP_CONSTRAINTS_ID);
    setText("Delete  RelationshipConstraints");
    // request = new Request(DELTE_RLSHIP_CONSTRAINTS_REQUEST);
  }
  
  public void setEditPart(ORMRelationshipConstraintEditPart editPart){
    this.editPart = editPart;
  }

  @Override
  protected boolean calculateEnabled() {

    if (getSelectedObjects().isEmpty() || getSelectedObjects().size() > 1) {
      return false;
    }

    for (Object selectedObject : getSelectedObjects()) {
      if (selectedObject instanceof ORMRelationshipConstraintEditPart) {
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
    if(editPart == null){
      editPart = (ORMRelationshipConstraintEditPart) getSelectedObjects().get(0);
    }
    // get selected constraint model
    RelationshipConstraint constraint = (RelationshipConstraint) editPart.getModel();
    // get selected constraint relationship
    Relationship rlship = constraint.getRelation();

    // put all RelationshipConstraints in a list
    ArrayList<RelationshipConstraint> constraints = new ArrayList<RelationshipConstraint>();
    constraints.addAll(rlship.getRlshipConstraints());


    // create and setup the popup dialog
    ConstraintsDialog dialog = new ConstraintsDialog(shell);
    dialog.setConstraints(constraints);

    // open the popup dialog
    int returnCode = dialog.open();
    // end the action, when the popup dialog is closed through cancel button
    if (returnCode == -1) {
      return;
    }
    // delete all chosen constraints, when the popup dialog is closed through ok button
    else if (returnCode == 1) {
      CompoundCommand compoundCommand = new CompoundCommand();
      for (RelationshipConstraint rc : dialog.getChosenConstraints()) {
        ORMRealtionshipConstraintDeleteCommand command =
            new ORMRealtionshipConstraintDeleteCommand();
        command.setRelationshipConstraint(rc);
        command.setEPViewer(editPart.getViewer());
        compoundCommand.add(command);
      }
      editPart.getViewer().getEditDomain().getCommandStack().execute(compoundCommand);
    }
  }


}
