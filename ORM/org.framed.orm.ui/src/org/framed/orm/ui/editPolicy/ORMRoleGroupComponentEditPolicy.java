package org.framed.orm.ui.editPolicy;

import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.ComponentEditPolicy;
import org.eclipse.gef.requests.GroupRequest;
import org.framed.orm.model.Node;
import org.framed.orm.ui.command.nodes.ORMRoleGroupDeleteCommand;


/**
 * @author Kay Bierzynski
 * */
public class ORMRoleGroupComponentEditPolicy extends ComponentEditPolicy {
	
	@Override 
	protected Command createDeleteCommand(GroupRequest deleteRequest) {
		
		ORMRoleGroupDeleteCommand roleGroupDeleteCommand = new ORMRoleGroupDeleteCommand();
	    roleGroupDeleteCommand.setNode((Node) getHost().getModel());
	    	
		return roleGroupDeleteCommand;
	}
}
