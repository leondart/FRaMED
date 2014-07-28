package org.framed.orm.ui.command.nodes;


import org.framed.orm.model.Compartment;
import org.framed.orm.model.Rolemodel;

/**
 * Through this command the model element {@link Compartment} and the model element {@link Grouping}
 * can be created(invoked into the model tree).
 * 
 * @author Kay Bierzynski
 * */
public class ORMCompartmentGroupingCreateCommand extends ORMNodeCreateCommand {

  /**
   * The {@link Rolemodel}, which is owned be the {@link Compartment}/{@link Grouping} to be created
   */
  private Rolemodel rm;

  /**
   * Constructor of this command, where the label is set, which describes this command to the user.
   * 
   */
  public ORMCompartmentGroupingCreateCommand() {
    super.setLabel("ORMCompartmentGroupingCreate");
  }

  /**
   * {@inheritDoc} Because in this command a {@link Compartment}/{@link Grouping} is created it's
   * child {@link Rolemodel} must be setted as well .
   */
  @Override
  public void execute() {

    super.execute();
    ((Compartment) node).setRolemodel(rm);
  }

  /**
   * {@inheritDoc} Because in this command a {@link Compartment} is created it's child
   * {@link Rolemodel} must be removed as well .
   */
  @Override
  public void undo() {

    super.undo();
    ((Compartment) node).setRolemodel(null);
  }

  /**
   * Setter for the {@link Rolemodel}, which is the child of the {@link Compartment} to be created.
   * 
   * @param rm org.framed.orm.model.Rolemodel
   * */
  public void setRolemodel(final Rolemodel rm) {
    this.rm = rm;
  }

}
