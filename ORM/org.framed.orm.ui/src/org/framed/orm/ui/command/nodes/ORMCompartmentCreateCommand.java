package org.framed.orm.ui.command.nodes;

import org.framed.orm.model.Compartment;
import org.framed.orm.model.Rolemodel;



/**
 * @author Kay Bierzynski
 * */
public class ORMCompartmentCreateCommand extends ORMNodeCreateCommand {


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

    super.execute();
    ((Compartment)node).setRolemodel(rm);
  }

  /**
   * Remove the {@link Compartment} from the container {@link CompartmentDiagram} or
   * {@link Rolemodel}.
   */
  @Override
  public void undo() {

    super.undo();
    ((Compartment)node).setRolemodel(null);
  }

  public void setRolemodel(final Rolemodel rm) {
    this.rm = rm;
  }

}
