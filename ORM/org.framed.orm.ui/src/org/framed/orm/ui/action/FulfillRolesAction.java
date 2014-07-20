package org.framed.orm.ui.action;

import java.util.ArrayList;

import org.eclipse.gef.ui.actions.SelectionAction;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;
import org.framed.orm.model.Compartment;
import org.framed.orm.model.Fulfillment;
import org.framed.orm.model.RoleGroup;
import org.framed.orm.model.RoleType;
import org.framed.orm.ui.command.FulfillRolesCommand;
import org.framed.orm.ui.editPart.connectionkinds.ORMFulfillmentEditPart;

/**
 * This action is for adding to a {@link Fulfillment} the {@link RoleType}s and the
 * {@link RoleGroup}s, which the source of the {@link Fulfillment} fulfills.
 * 
 * @author Kay Bierzynski
 * 
 */
public class FulfillRolesAction extends SelectionAction {

  /** String which contains the id of this action. */
  public static final String FULFILL_ROLES_ID = "FulfillRoles";


  /**
   * Constructor of FulfillRolesAction, where the id of the action and the text, which is shown for
   * example in the context menu, is set .
   * 
   * @param part org.eclipse.ui.IWorkbenchPart
   * */
  public FulfillRolesAction(IWorkbenchPart part) {
    super(part);
    setId(FULFILL_ROLES_ID);
    setText("Fulfill Roles");
  }

  /**
   * {@inheritDoc} This action is enabled when the selected element is a {@link Fulfillment} and the
   * target of the selected {@link Fulfillment} has at least one {@link RoleType} or
   * {@link RoleGroup}.
   * */
  @Override
  protected boolean calculateEnabled() {

    if (getSelectedObjects().isEmpty() || getSelectedObjects().size() > 1) {
      return false;
    }

    for (Object selectedObject : getSelectedObjects()) {
      if (selectedObject instanceof ORMFulfillmentEditPart) {
        Compartment targetCompartment =
            (Compartment) ((ORMFulfillmentEditPart) selectedObject).getTarget().getModel();
        if (targetCompartment.getRolemodel().getParticipants().size() != 0) {
          return true;
        }
      }
    }
    return false;
  }

  /**
   * In this method first the {@link RolesDialog} is prepared and started. After the user has closed
   * the {@link RolesDialog} through the cancel button this method is finished as well. When the
   * user has closed the {@link RolesDialog} through the ok button the choosen roles are added all
   * at once to the {@link Fulfillment} through the {@link FulfillRolesCommand}.
   * 
   * */
  @Override
  public void run() {
    // get the style for the shell of the role dialog, which should be the same as the shell sytle
    // of the active workbench
    int style = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell().getStyle();
    Shell shell = new Shell((style & SWT.MIRRORED) != 0 ? SWT.RIGHT_TO_LEFT : SWT.NONE);

    // get the editpart of the selected fulfillment
    ORMFulfillmentEditPart editPart = (ORMFulfillmentEditPart) getSelectedObjects().get(0);
    // get the model of the selected fulfillment
    Fulfillment ful = (Fulfillment) editPart.getModel();
    // get the target of the selected fulfillment, which is always a compartment
    Compartment target = (Compartment) ful.getTarget();

    // create and setup the roles dialog
    RolesDialog dialog = new RolesDialog(shell);
    dialog.setRoles(target.getRolemodel().getParticipants());

    // add all role types and role groups wich are already "fulfilled" thorugh the Fulfillment to a
    // list
    ArrayList<String> fulfilledRoles = new ArrayList<String>(ful.getFulfilledRoles());
    dialog.setFulfilledRoles(fulfilledRoles);

    // open the roles dialog
    int returnCode = dialog.open();

    // end this method, when the roles dialog is closed through the cancel button
    if (returnCode == Window.CANCEL) {
      return;
    }

    // create the FulfillRolesCommand and add all chosen roles at once through the
    // FulfillRolesCommand, when the roles dialog is closed through ok
    // button
    if (returnCode == Window.OK) {
      FulfillRolesCommand command = new FulfillRolesCommand();
      command.setFulfillment(ful);
      command.setRoles(dialog.getFulfilledRoles());
      // manaul execution of the command to the spare effort of creating a special request, which
      // can hold all choosen roles
      editPart.getViewer().getEditDomain().getCommandStack().execute(command);
    }
  }

}
