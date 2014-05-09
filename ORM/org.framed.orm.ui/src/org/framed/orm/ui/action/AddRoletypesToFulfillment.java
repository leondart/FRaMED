package org.framed.orm.ui.action;

import java.util.ArrayList;

import org.eclipse.gef.Request;
import org.eclipse.gef.ui.actions.SelectionAction;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;
import org.framed.orm.model.AbstractRole;
import org.framed.orm.model.Compartment;
import org.framed.orm.model.Fulfilment;
import org.framed.orm.model.Node;
import org.framed.orm.ui.editPart.connectionkinds.ORMFulfilmentEditPart;


public class AddRoletypesToFulfillment extends SelectionAction {

  public static final String ADD_RTS_TO_FUL_ID = "AddRtsToFul";
  public static final String ADD_RTS_TO_FUL_REQUEST = "AddRtsToFul";


  private Request request;

  public AddRoletypesToFulfillment(IWorkbenchPart part) {
    super(part);
    setId(ADD_RTS_TO_FUL_ID);
    setText("Add Roletypes");
    request = new Request(ADD_RTS_TO_FUL_REQUEST);
  }

  @Override
  protected boolean calculateEnabled() {

    if (getSelectedObjects().isEmpty() || getSelectedObjects().size()>1) {
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
    
    
    Node target = ((Fulfilment)((ORMFulfilmentEditPart) getSelectedObjects().get(0)).getModel()).getTarget();
    ArrayList<AbstractRole> roles = new  ArrayList<AbstractRole>();
    roles.addAll(((Compartment)target).getRolemodel().getParticipants());
    
    AddRoletypesDialog dialog = new AddRoletypesDialog(shell);
    dialog.setRoles(roles);
    
    int test = dialog.open();
    if(test == -1) return;
  }
  



}
