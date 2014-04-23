package orm.editPolicy;

import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.ComponentEditPolicy;
import org.eclipse.gef.requests.GroupRequest;

import orm.command.AttributeMethodeCommands.ORMMethodeDeleteCommand;
import org.framed.orm.model.Methode;

/**
 * @author Kay Bierzynski
 * */
public class ORMMethodeComponentEditPolicy extends ComponentEditPolicy {
	
	@Override 
	protected Command createDeleteCommand(GroupRequest deleteRequest) {
	    ORMMethodeDeleteCommand metDeleteCommand = new ORMMethodeDeleteCommand();
	    metDeleteCommand.setMethode((Methode) getHost().getModel());
	    return metDeleteCommand;
	  }

}
