package org.framed.orm.ui.command;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.gef.commands.Command;
import org.framed.orm.model.Relation;
import org.framed.orm.model.Shape;
import org.framed.orm.ui.action.FulfillRolesAction;
import org.framed.orm.ui.action.RolesDialog;

/**
 * This command is used from the {@link FulfillRolesAction} and the {@link RolesDialog} to add all
 * of the choosen {@link Shape}s from type roletype and rolegroups to the fulfilledRoles list of a
 * {@link Relation} from type fulfillment and delete of the not choosen rolegroups and roleTypes
 * from the referencedRoles list of a fulfillment.
 * 
 * */
public class FulfillRolesCommand extends Command {

  /**
   * The {@link Relation} from type fulfillment with the referencedRoles list, where elements added
   * to and deleted from.
   */
  private Relation fulfillment;
  /**
   * A list, which containts all of the choosen {@link Shapes}s from type rolegroup and roletype .
   * */
  private List<Shape> roles;
  /**
   * A list, which stores tempoary the initial content of the refrenced roles list of the
   * {@link Relation} from type fulfillment.
   */
  private List<Shape> oldFulfilledRoles;

  /**
   * Constructor of this command, where the label is set, which describes this command to the user,
   * and initialize the oldFulfilledRoles list.
   * 
   * */
  public FulfillRolesCommand() {
    super.setLabel(" FulfillRolesCommand");
    oldFulfilledRoles = new ArrayList<Shape>();
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
   * {@inheritDoc} In this method the initial content of the fulfilledRoles list of the fulfillment
   * is stored in the oldFulfilledRoles list. After that all content of the fulfilledRoles list is
   * deleted and the choosen {@link Shapes}s from type roletype and rolegroup are added to the
   * fulfilledRoles list.
   * 
   */
  @Override
  public void execute() {

    oldFulfilledRoles.addAll(fulfillment.getReferencedRoles());

    fulfillment.getReferencedRoles().clear();

    for (Shape role : roles) {
      fulfillment.getReferencedRoles().add(role);
    }
  }

  /**
   * {@inheritDoc} To undo this command the content of the fulfilledRoles list is deleted and
   * replaced with the initial content of the fulfilledRoles list, which is stored in the
   * oldFulfilledRoles list.
   * 
   * */
  @Override
  public void undo() {

    fulfillment.getReferencedRoles().clear();
    fulfillment.getReferencedRoles().addAll(oldFulfilledRoles);

  }

  /**
   * Setter for the choosen roles list.
   * 
   * @param roles java.util.List<Shape>
   * */
  public void setRoles(final List<Shape> roles) {
    this.roles = roles;
  }

  /**
   * Setter for the {@link Relation} from type fulfillment.
   * 
   * @param fulfillment org.framed.orm.model.Relation
   * */
  public void setFulfillment(final Relation fulfillment) {
    this.fulfillment = fulfillment;
  }
}
