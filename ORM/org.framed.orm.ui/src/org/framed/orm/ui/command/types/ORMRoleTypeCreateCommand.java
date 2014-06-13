package org.framed.orm.ui.command.types;

import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.commands.Command;

import org.framed.orm.model.RoleType;
import org.framed.orm.model.Container;

/**
 * @author Kay Bierzynski
 * */
public class ORMRoleTypeCreateCommand extends Command {

  private RoleType roleType;
  private Rectangle constraints;
  private Container parent;

  public ORMRoleTypeCreateCommand() {
    super.setLabel("ORMRoleTypeCreate");
  }

  /**
   * The command can be executed if all parameters have been set.
   */
  @Override
  public boolean canExecute() {

    return roleType != null && constraints != null;
  }

  /**
   * Set the constraints for the {@link RoleType} and add it to the container
   * {@link CompartmentDiagram} or Rolemodel.
   */
  @Override
  public void execute() {

    roleType.setConstraints(constraints);
    // for Attribute/Methode list expanding
    roleType.setIsExpand(true);
    roleType.setContainer(parent);
  }

  /**
   * Remove the {@link RoleType} from the container {@link CompartmentDiagram} or Rolemodel.
   */
  @Override
  public void undo() {
    
    roleType.setConstraints(null);
    roleType.setContainer(null);
  }

  public void setConstraints(final Rectangle constraints) {
    this.constraints = constraints;
  }

  public void setRoleType(final RoleType node) {
    this.roleType = node;
  }


  public void setContainer(final Container parent) {
    this.parent = parent;
  }

}
