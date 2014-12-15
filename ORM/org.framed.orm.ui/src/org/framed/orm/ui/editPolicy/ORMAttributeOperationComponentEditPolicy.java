package org.framed.orm.ui.editPolicy;

import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.ComponentEditPolicy;
import org.eclipse.gef.requests.GroupRequest;
import org.framed.orm.model.NamedElement;
import org.framed.orm.model.Segment;
import org.framed.orm.ui.command.AttributeOperationCommands.ORMAttributeOperationDeleteCommand;

/**
 * This {@link ComponentEditPolicy} handles requests for the deletion of attributes and operations and
 * returns and creates the deletion commands.
 * 
 * @author Kay Bierzynski
 * */
public class ORMAttributeOperationComponentEditPolicy extends ComponentEditPolicy {

  /**
   * {@inheritDoc} In this EditPolicy this method creates and returns a command for deleting a attribute or operation.
   * 
   * @return command org.framed.orm.ui.command.AttributeOperationCommands.ORMAttributeOperationDeleteCommand
   */
  @Override
  protected Command createDeleteCommand(final GroupRequest deleteRequest) {
    ORMAttributeOperationDeleteCommand command = new ORMAttributeOperationDeleteCommand();
    command.setElement((NamedElement) getHost().getModel());
    command.setParentSegment((Segment)getHost().getParent().getModel());
    return command;
  }

}
