package org.framed.orm.ui.editPolicy;

import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.ComponentEditPolicy;
import org.eclipse.gef.requests.GroupRequest;
import org.framed.orm.model.Attribute;
import org.framed.orm.ui.command.AttributeMethodeCommands.ORMAttributeDeleteCommand;

/**
 * @author Kay Bierzynski
 * */
public class ORMAttributeComponentEditPolicy extends ComponentEditPolicy {
	
	@Override 
	protected Command createDeleteCommand(GroupRequest deleteRequest) {
	    ORMAttributeDeleteCommand attDeleteCommand = new ORMAttributeDeleteCommand();
	    attDeleteCommand.setAttribute((Attribute) getHost().getModel());
	    return attDeleteCommand;
	  }
	
}
