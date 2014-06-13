package org.framed.orm.ui.command;

import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.commands.Command;
import org.framed.orm.model.Container;
import org.framed.orm.model.Grouping;
import org.framed.orm.model.Rolemodel;

/**
 * @author Kay Bierzynski
 * */
public class ORMGroupingCreateCommand extends Command {


  public ORMGroupingCreateCommand() {
    super.setLabel("ORMGroupingCreate");
  }

  private Grouping grouping;
  private Rectangle constraints;
  private Container parent;
  private Rolemodel rm;

  /**
   * The command can be executed if all parameters have been set.
   */
  @Override
  public boolean canExecute() {

    return parent != null;
  }

  /**
   * Set the constraints for the {@link Grouping} and add it to the container
   * {@link CompartmentDiagramDiagram} or Parentrolemodel .
   */
  @Override
  public void execute() {
    grouping.setConstraints(constraints);
    grouping.setContainer(parent);
    grouping.setRolemodel(rm);
  }

  /**
   * Remove the {@link Grouping} from the container {@link CompartmentDiagramDiagram}.
   */
  @Override
  public void undo() {
      grouping.setConstraints(null);
      grouping.setContainer(null);
      grouping.setRolemodel(null);
  }


  public void setConstraints(final Rectangle constraints) {
    this.constraints = constraints;
  }

  public void setContainer(final Container parent) {
    this.parent = parent;
  }

  public void setGrouping(final Grouping node) {
    this.grouping = node;
  }

  public void setRolemodel(final Rolemodel rm) {
    this.rm = rm;
  }

}
