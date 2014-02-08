package orm.editPolicy;

import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.ComponentEditPolicy;
import org.eclipse.gef.requests.GroupRequest;

import orm.command.AttributeMethodeCommands.ORMAttributeDeleteCommand;
import orm.model.Attribute;

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
