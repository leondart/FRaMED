package org.framed.orm.ui.editPolicy;

import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.ComponentEditPolicy;
import org.eclipse.gef.requests.GroupRequest;
import org.framed.orm.model.Method;
import org.framed.orm.ui.command.AttributeMethodCommands.ORMMethodDeleteCommand;

/**
 * @author Kay Bierzynski
 * */
public class ORMMethodComponentEditPolicy extends ComponentEditPolicy {
	
	@Override 
	protected Command createDeleteCommand(GroupRequest deleteRequest) {
	    ORMMethodDeleteCommand metDeleteCommand = new ORMMethodDeleteCommand();
	    metDeleteCommand.setMethod((Method) getHost().getModel());
	    return metDeleteCommand;
	  }

}
