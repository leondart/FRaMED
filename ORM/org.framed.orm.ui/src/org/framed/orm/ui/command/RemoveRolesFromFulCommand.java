package org.framed.orm.ui.command;

import java.util.ArrayList;

import org.eclipse.gef.commands.Command;
import org.framed.orm.model.Fulfilment;

public class RemoveRolesFromFulCommand extends Command {

  public RemoveRolesFromFulCommand() {
    super.setLabel("RemoveRolesFromFulCommand");
  }


  private Fulfilment fulfillment;
  private ArrayList<String> roles;


  /**
   * The command can be executed if all parameters have been set.
   */
  @Override
  public boolean canExecute() {
    return fulfillment != null && roles != null;
  }


  @Override
  public void execute() {

    for (String name : roles) {
      fulfillment.getFulfilledRoles().remove(name);
    }

  }

  @Override
  public void undo() {

    for (String name : roles) {
      fulfillment.getFulfilledRoles().add(name);
    }

  }

  public void setRoles(ArrayList<String> roles) {
    this.roles = roles;
  }

  public void setFulfillment(Fulfilment fulfillment) {
    this.fulfillment = fulfillment;
  }
}
