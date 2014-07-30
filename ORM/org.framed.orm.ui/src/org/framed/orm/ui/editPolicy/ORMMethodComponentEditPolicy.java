package org.framed.orm.ui.editPolicy;

import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.ComponentEditPolicy;
import org.eclipse.gef.requests.GroupRequest;
import org.framed.orm.model.Method;
import org.framed.orm.ui.command.AttributeMethodCommands.ORMMethodDeleteCommand;

/**
 * This {@link ComponentEditPolicy} handels requests for the deletion of {@link Methods}s and
 * returns and creats the deletion commands.
 * 
 * @author Kay Bierzynski
 * */
public class ORMMethodComponentEditPolicy extends ComponentEditPolicy {
	
  /**
   * {@inheritDoc} In this EditPolicy this method creats and returns a command for deleting a {@link Method}.
   * 
   * @return {@link ORMMethodDeleteCommand}
   */
	@Override 
	protected Command createDeleteCommand(final GroupRequest deleteRequest) {
	    ORMMethodDeleteCommand metDeleteCommand = new ORMMethodDeleteCommand();
	    metDeleteCommand.setMethod((Method) getHost().getModel());
	    return metDeleteCommand;
	  }

}
