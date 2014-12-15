package org.framed.orm.ui.editPolicy;

import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.ComponentEditPolicy;
import org.eclipse.gef.requests.GroupRequest;
import org.framed.orm.model.Attribute;
import org.framed.orm.ui.command.AttributeMethodCommands.ORMAttributeOperationDeleteCommand;

/**
 * This {@link ComponentEditPolicy} handels requests for the deletion of attributes and operations and
 * returns and creats the deletion commands.
 * 
 * @author Kay Bierzynski
 * */
public class ORMAttributeComponentEditPolicy extends ComponentEditPolicy {

  /**
   * {@inheritDoc} In this EditPolicy this method creates and returns a command for deleting a {@link Attribute}.
   * 
   * @return attDeleteCommand org.framed.orm.ui.command.AttributeMethodCommands.ORMAttributeDeleteCommand
   */
  @Override
  protected Command createDeleteCommand(final GroupRequest deleteRequest) {
    ORMAttributeOperationDeleteCommand attDeleteCommand = new ORMAttributeOperationDeleteCommand();
    attDeleteCommand.setAttribute((Attribute) getHost().getModel());
    return attDeleteCommand;
  }

}
