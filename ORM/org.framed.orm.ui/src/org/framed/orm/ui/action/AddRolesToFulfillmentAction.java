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
import org.framed.orm.ui.command.AddRolesToFulCommand;
import org.framed.orm.ui.editPart.connectionkinds.ORMFulfilmentEditPart;


public class AddRolesToFulfillmentAction extends SelectionAction {

  public static final String ADD_ROLES_TO_FUL_ID = "AddRolesToFul";
  public static final String ADD_ROLES_TO_FUL_REQUEST = "AddRolesToFul";


  // private Request request;

  public AddRolesToFulfillmentAction(IWorkbenchPart part) {
    super(part);
    setId(ADD_ROLES_TO_FUL_ID);
    setText("Add Roles");
    // request = new Request(ADD_ROLES_TO_FUL_REQUEST);
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

    // put all abstractroles in a list
    ArrayList<AbstractRole> roles = new ArrayList<AbstractRole>();
    roles.addAll(target.getRolemodel().getParticipants());

    // filter out the roles, which already are fulfilled/played by the source of the selected
    // fulfillment
    for (AbstractRole role : roles) {
      for (String name : ful.getFulfilledRoles()) {
        if (name.equals(((Node) role).getName()))
          roles.remove(role);
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
    // add all choosen roles, when the popup dialog is closed through ok button
    else if (returnCode == 1) {
      AddRolesToFulCommand command = new AddRolesToFulCommand();
      command.setFulfillment(ful);
      command.setRoles(dialog.getChoosenRoles());
      editPart.getViewer().getEditDomain().getCommandStack().execute(command);
    }
  }



}
