package org.framed.orm.ui.action;

import java.util.ArrayList;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.ui.actions.SelectionAction;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;
import org.framed.orm.model.ModelElement;
import org.framed.orm.model.Relation;
import org.framed.orm.model.Shape;
import org.framed.orm.model.Type;
import org.framed.orm.ui.command.FulfillRolesCommand;

/**
 * This action is for adding to a {@link Relation} from type fulfillment the {@link Shapes}s from
 * type roletype and rolegroup ,which the source of the fufillment fulfills.
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
   * {@inheritDoc} This action is enabled when the selected element is a {@link Relation} from type
   * fulfillemnt and the target of the selected fulfillemt has at least one {@link Shape} from type
   * roletype or rolegroup.
   * */
  @Override
  protected boolean calculateEnabled() {

    if (getSelectedObjects().isEmpty() || getSelectedObjects().size() > 1) {
      return false;
    }

    for (Object selectedObject : getSelectedObjects()) {
      if (((EditPart) selectedObject).getModel() instanceof Relation) {
        Relation relation = (Relation) ((EditPart) selectedObject).getModel();
        if (relation.getType().equals(Type.FULFILLMENT) && relation.getTarget() instanceof Shape) {
          Shape shape = (Shape) relation.getTarget();
          if (shape.getType().equals(Type.COMPARTMENT_TYPE)
              && shape.getModel().getElements().size() != 0) {
            return true;
          }
        }
      }
    }
    return false;
  }

  /**
   * In this method first the {@link RolesDialog} is prepared and started. After the user has closed
   * the {@link RolesDialog} through the cancel button this method is finished as well. When the
   * user has closed the {@link RolesDialog} through the ok button the choosen roles are added all
   * at once to the fulfillment through the {@link FulfillRolesCommand}.
   * 
   * */
  @Override
  public void run() {
    // get the style for the shell of the role dialog, which should be the same as the shell sytle
    // of the active workbench
    int style = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell().getStyle();
    Shell shell = new Shell((style & SWT.MIRRORED) != 0 ? SWT.RIGHT_TO_LEFT : SWT.NONE);

    // get the editpart of the selected fulfillment
    EditPart editPart = (EditPart) getSelectedObjects().get(0);
    // get the model of the selected fulfillment
    Relation ful = (Relation) editPart.getModel();
    // get the target of the selected fulfillment, which is always a compartment
    Shape target = (Shape) ful.getTarget();

    // create and setup the roles dialog
    RolesDialog dialog = new RolesDialog(shell);
    ArrayList<Shape> roles = new ArrayList<Shape>();
    for(ModelElement modelelement : target.getModel().getElements()){
      if(modelelement.getType().equals(Type.ROLE_TYPE) || modelelement.getType().equals(Type.ROLE_GROUP)){
        roles.add((Shape) modelelement);
      }
    }
    
    dialog.setRoles(roles);

    // add all role types and role groups wich are already "fulfilled" through the Fulfillment to a
    // list
    ArrayList<Shape> fulfilledRoles = new ArrayList<Shape>(ful.getReferencedRoles());
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
