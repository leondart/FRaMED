package org.framed.orm.ui.editPolicy;

import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.ComponentEditPolicy;
import org.eclipse.gef.requests.GroupRequest;
import org.framed.orm.model.Node;
import org.framed.orm.model.RoleGroup;
import org.framed.orm.ui.command.nodes.ORMRoleGroupDeleteCommand;


/**
 * This {@link ComponentEditPolicy} handels requests for the deletion of {@link RoleGroup}s and
 * returns and creats the deletion commands for this purpose.
 * 
 * @author Kay Bierzynski
 * */
public class ORMRoleGroupComponentEditPolicy extends ComponentEditPolicy {

  /**
   * {@inheritDoc} In this EditPolicy this method creates and returns a command for deleting a
   * {@link RoleGroup}.
   * 
   * @return {@link ORMRoleGroupDeleteCommand}
   */
  @Override
  protected Command createDeleteCommand(final GroupRequest deleteRequest) {

    final ORMRoleGroupDeleteCommand roleGroupDeleteCommand = new ORMRoleGroupDeleteCommand();
    roleGroupDeleteCommand.setShape((Node) getHost().getModel());

    return roleGroupDeleteCommand;
  }
}
