package org.framed.orm.ui.command;

import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.commands.Command;

import org.framed.orm.model.Container;
import org.framed.orm.model.RoleGroup;

/**
 * @author Kay Bierzynski
 * */
public class ORMRoleGroupCreateCommand extends Command {

  private Container parent;
  private RoleGroup roleGroup;
  private Rectangle constraints;

  public ORMRoleGroupCreateCommand() {
    super.setLabel("ORMRoleGroupCreate");
  }

  /**
   * The command can be executed if all parameters have been set.
   */
  @Override
  public boolean canExecute() {

    return constraints != null && parent != null;
  }

  /**
   * Set the constraints for the {@link RoleGroup} and add it to the container {@link RoleModel}.
   */
  @Override
  public void execute() {

    roleGroup.setConstraints(constraints);
    roleGroup.setContainer(parent);
  }

  /**
   * Remove the {@link RoleGroup} from the container {@link RoleModel}.
   */
  @Override
  public void undo() {

    roleGroup.setConstraints(null);
    roleGroup.setContainer(null);
  }


  public void setConstraints(final Rectangle constraints) {
    this.constraints = constraints;
  }



  public void setRoleGroup(final RoleGroup node) {
    this.roleGroup = node;
  }

  public void setContainer(final Container parent) {
    this.parent = parent;
  }
}
