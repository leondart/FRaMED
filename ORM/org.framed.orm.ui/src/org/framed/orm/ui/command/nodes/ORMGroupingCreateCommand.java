package org.framed.orm.ui.command.nodes;

import org.framed.orm.model.Grouping;
import org.framed.orm.model.Rolemodel;

/**
 * @author Kay Bierzynski
 * */
public class ORMGroupingCreateCommand extends ORMNodeCreateCommand {


  public ORMGroupingCreateCommand() {
    super.setLabel("ORMGroupingCreate");
  }

  private Rolemodel rm;

  /**
   * Set the constraints for the {@link Grouping} and add it to the container
   * {@link CompartmentDiagramDiagram} or Parentrolemodel .
   */
  @Override
  public void execute() {
    super.execute();
    ((Grouping)node).setRolemodel(rm);
  }

  /**
   * Remove the {@link Grouping} from the container {@link CompartmentDiagramDiagram}.
   */
  @Override
  public void undo() {
    super.undo();
    ((Grouping)node).setRolemodel(null);
  }

  public void setRolemodel(final Rolemodel rm) {
    this.rm = rm;
  }

}
