package org.framed.orm.ui.command.types;

import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.commands.Command;

import org.framed.orm.model.Container;
import org.framed.orm.model.Compartment;
import org.framed.orm.model.Rolemodel;



/**
 * @author Kay Bierzynski
 * */
public class ORMCompartmentCreateCommand extends Command {


  private Compartment compartment;
  private Rectangle constraints;

  private Container parent;
  private Rolemodel rm;

  public ORMCompartmentCreateCommand() {
    super.setLabel("ORMCompartmentCreate");
  }

  /**
   * The command can be executed if all parameters have been set.
   */
  @Override
  public boolean canExecute() {

    return true;
  }

  /**
   * Set the constraints for the {@link Compartment} and add it to the container
   * {@link CompartmenDiagram} or {@link Rolemodel}.
   */
  @Override
  public void execute() {

    compartment.setConstraints(constraints);
    compartment.setContainer(parent);
    compartment.setIsExpand(true);
    compartment.setRolemodel(rm);
  }

  /**
   * Remove the {@link Compartment} from the container {@link CompartmentDiagram} or
   * {@link Rolemodel}.
   */
  @Override
  public void undo() {

    compartment.setConstraints(null);
    compartment.setContainer(null);
    compartment.setRolemodel(null);
  }


  public void setConstraints(final Rectangle constraints) {
    this.constraints = constraints;
  }

  public void setContainer(final Container parent) {
    this.parent = parent;
  }

  public void setCompartment(final Compartment node) {
    this.compartment = node;
  }

  public void setRolemodel(final Rolemodel rm) {
    this.rm = rm;
  }

}
