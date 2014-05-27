package org.framed.orm.ui.command;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.gef.commands.Command;
import org.framed.orm.model.Fulfilment;

public class FulfillRolesCommand extends Command {


  public FulfillRolesCommand() {
    super.setLabel(" FulfillRolesCommand");
  }


  private Fulfilment fulfillment;
  private List<String> roles;
  private List<String> oldFulfilledRoles = new ArrayList<String>();

  /**
   * The command can be executed if all parameters have been set.
   */
  @Override
  public boolean canExecute() {
    return fulfillment != null && roles != null;
  }


  @Override
  public void execute() {

    oldFulfilledRoles.addAll(fulfillment.getFulfilledRoles());

    for (String name : roles) {
      if (!fulfillment.getFulfilledRoles().contains(name)) {
        fulfillment.getFulfilledRoles().add(name);
      }
    }

    fulfillment.getFulfilledRoles().retainAll(roles);
  }

  @Override
  public void undo() {

    fulfillment.getFulfilledRoles().clear();
    fulfillment.getFulfilledRoles().addAll(oldFulfilledRoles);

  }

  public void setRoles(List<String> roles) {
    this.roles = roles;
  }

  public void setFulfillment(Fulfilment fulfillment) {
    this.fulfillment = fulfillment;
  }
}
