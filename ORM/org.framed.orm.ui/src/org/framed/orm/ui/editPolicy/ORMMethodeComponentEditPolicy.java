package org.framed.orm.ui.editPolicy;

import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.ComponentEditPolicy;
import org.eclipse.gef.requests.GroupRequest;
import org.framed.orm.model.Methode;
import org.framed.orm.ui.command.AttributeMethodeCommands.ORMMethodeDeleteCommand;

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
