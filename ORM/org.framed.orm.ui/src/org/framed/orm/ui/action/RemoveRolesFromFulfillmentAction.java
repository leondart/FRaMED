package org.framed.orm.ui.action;

import java.util.ArrayList;

import org.eclipse.gef.ui.actions.SelectionAction;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;
import org.framed.orm.model.AbstractRole;
import org.framed.orm.model.Compartment;
import org.framed.orm.model.Fulfilment;
import org.framed.orm.model.Node;
import org.framed.orm.ui.command.RemoveRolesFromFulCommand;
import org.framed.orm.ui.editPart.connectionkinds.ORMFulfilmentEditPart;

public class RemoveRolesFromFulfillmentAction extends SelectionAction {

  public static final String REMOVE_ROLES_FROM_FUL_ID = "RemoveRolesFromFul";
  public static final String REMOVE_ROLES_FROM_FUL_REQUEST = "RemoveRolesFromFul";


  // private Request request;

  public RemoveRolesFromFulfillmentAction(IWorkbenchPart part) {
    super(part);
    setId(REMOVE_ROLES_FROM_FUL_ID);
    setText("Remove Roles");
    // request = new Request(REMOVE_ROLES_FROM_FUL_REQUEST);
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


    ArrayList<AbstractRole> roles = new ArrayList<AbstractRole>();
    ArrayList<AbstractRole> targetRoles = new ArrayList<AbstractRole>();
    targetRoles.addAll(target.getRolemodel().getParticipants());
    
    // get the roles, which already are fulfilled/played by the source of the selected
    // fulfillment
    for (AbstractRole role : targetRoles) {
      for (String name : ful.getFulfilledRoles()) {
        if (name.equals(((Node) role).getName()))
          roles.add(role);
      }
    }

    // create and setup the popup dialog
    RolesDialog dialog = new RolesDialog(shell);
    dialog.setRoles(roles);

    // open the popup dialog
    int returnCode = dialog.open();
    // end the action, when the popup dialog is closed through cancel button
    if (returnCode == -1) {
      return;
    }
    // add all chosen roles, when the popup dialog is closed through ok button
    else if (returnCode == 1) {
      RemoveRolesFromFulCommand command = new RemoveRolesFromFulCommand();
      command.setFulfillment(ful);
      command.setRoles(dialog.getChosenRoles());
      editPart.getViewer().getEditDomain().getCommandStack().execute(command);
    }
  }

}
