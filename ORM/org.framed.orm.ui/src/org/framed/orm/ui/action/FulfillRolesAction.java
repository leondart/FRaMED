package org.framed.orm.ui.action;

import java.util.ArrayList;

import org.eclipse.gef.ui.actions.SelectionAction;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;
import org.framed.orm.model.Compartment;
import org.framed.orm.model.Fulfilment;
import org.framed.orm.ui.command.FulfillRolesCommand;
import org.framed.orm.ui.editPart.connectionkinds.ORMFulfilmentEditPart;


public class FulfillRolesAction extends SelectionAction {

  public static final String FULFILL_ROLES_ID = "FulfillRoles";

  public FulfillRolesAction(IWorkbenchPart part) {
    super(part);
    setId(FULFILL_ROLES_ID);
    setText("Fulfill Roles");
  }

  @Override
  protected boolean calculateEnabled() {

    if (getSelectedObjects().isEmpty() || getSelectedObjects().size() > 1) {
      return false;
    }

    for (Object selectedObject : getSelectedObjects()) {
      if (selectedObject instanceof ORMFulfilmentEditPart) {
        return true;
      }
    }
    return false;
  }

  @Override
  public void run() {
    int style = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell().getStyle();
    Shell shell = new Shell((style & SWT.MIRRORED) != 0 ? SWT.RIGHT_TO_LEFT : SWT.NONE);

    // get selected fulfillment editpart
    ORMFulfilmentEditPart editPart = (ORMFulfilmentEditPart) getSelectedObjects().get(0);
    // get selected fulfillment model
    Fulfilment ful = (Fulfilment) editPart.getModel();
    // get selected fulfillment target compartment
    Compartment target = (Compartment) ful.getTarget();

    // create and setup the popup dialog
    RolesDialog dialog = new RolesDialog(shell);
    dialog.setRoles(target.getRolemodel().getParticipants());

    ArrayList<String> fulfilledRoles = new ArrayList<String>();
    fulfilledRoles.addAll(ful.getFulfilledRoles());

    dialog.setFulfilledRoles(fulfilledRoles);

    // open the popup dialog
    int returnCode = dialog.open();
    // end the action, when the popup dialog is closed through cancel button
    if (returnCode == -1) {
      return;
    }
    // add all chosen roles, when the popup dialog is closed through ok button
    else if (returnCode == 1) {
      FulfillRolesCommand command = new FulfillRolesCommand();
      command.setFulfillment(ful);
      command.setRoles(dialog.getFulfilledRoles());
      editPart.getViewer().getEditDomain().getCommandStack().execute(command);
    }
  }



}
