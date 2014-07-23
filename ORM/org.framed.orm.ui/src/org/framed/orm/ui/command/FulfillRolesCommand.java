package org.framed.orm.ui.command;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.gef.commands.Command;
import org.framed.orm.model.Fulfillment;
import org.framed.orm.model.RoleGroup;
import org.framed.orm.model.RoleType;
import org.framed.orm.ui.action.FulfillRolesAction;
import org.framed.orm.ui.action.RolesDialog;

/**
 * This command is used from the {@link FulfillRolesAction} and the {@link RolesDialog} to add all
 * the names of the choosen {@link RoleGroup}s and {@link RoleType}s to the fulfilledRoles list of a
 * {@link Fulfillment} and delete all the names of the not choosen {@link RoleGroup}s and
 * {@link RoleType}s from the fulfilledRoles list of a {@link Fulfillment}.
 * 
 * */
public class FulfillRolesCommand extends Command {

  /**
   * The {@link Fulfillment} with the fulfilledRoles list, where elements added to and deleted from.
   */
  private Fulfillment fulfillment;
  /**
   * A list, which containts all the names of the choosen {@link RoleGroup}s and {@link RoleType}s .
   * */
  private List<String> roles;
  /**
   * A list, which stores tempoary the initial content of the fulfilled roles list of the
   * {@link Fulfillment}.
   */
  private List<String> oldFulfilledRoles;

  /**
   * Constructor of this command, where the label is set, which describes this command to the user,
   * and initialize the oldFulfilledRoles list.
   * 
   * */
  public FulfillRolesCommand() {
    super.setLabel(" FulfillRolesCommand");
    oldFulfilledRoles = new ArrayList<String>();
  }

  /**
   * This method tests if the conditions for executing this command are fulfilled,
   * 
   * @return true if the parameter fulfillment and roles is set.
   */
  @Override
  public boolean canExecute() {
    return fulfillment != null && roles != null;
  }

  /**
   * {@inheritDoc} In this method the initial content of the fulfilledRoles list of the
   * {@link Fulfillment} is stored in the oldFulfilledRoles list. After this the all content of the
   * fulfilledRoles list is deleted and that the names of the choosen {@link RoleGroup}s and
   * {@link RoleType}s are added to the fulfilledRoles list.
   * 
   */
  @Override
  public void execute() {

    oldFulfilledRoles.addAll(fulfillment.getFulfilledRoles());

    fulfillment.getFulfilledRoles().clear();

    for (String name : roles) {
      fulfillment.getFulfilledRoles().add(name);
    }
  }

  /**
   * {@inheritDoc} To undo this command the content of the fulfilledRoles list is deleted and
   * replaced with the initial content of the fulfilledRoles list, which is stored in the oldFulfilledRoles list.
   * 
   * */
  @Override
  public void undo() {

    fulfillment.getFulfilledRoles().clear();
    fulfillment.getFulfilledRoles().addAll(oldFulfilledRoles);

  }

  /**
   * Setter for the choosen roles list.
   * 
   * @param roles java.util.List<String>
   * */
  public void setRoles(final List<String> roles) {
    this.roles = roles;
  }

  /**
   * Setter for the {@link Fulfillment}.
   * 
   * @param fulfillment org.framed.orm.model.Fulfillment
   * */
  public void setFulfillment(final Fulfillment fulfillment) {
    this.fulfillment = fulfillment;
  }
}
