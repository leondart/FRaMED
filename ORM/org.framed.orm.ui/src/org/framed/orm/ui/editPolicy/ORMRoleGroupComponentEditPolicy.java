package org.framed.orm.ui.editPolicy;

import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.ComponentEditPolicy;
import org.eclipse.gef.requests.GroupRequest;
import org.framed.orm.model.RoleGroup;
import org.framed.orm.ui.command.ORMRoleGroupDeleteCommand;


/**
 * @author Kay Bierzynski
 * */
public class ORMRoleGroupComponentEditPolicy extends ComponentEditPolicy {
	
	@Override 
	protected Command createDeleteCommand(GroupRequest deleteRequest) {
		
		ORMRoleGroupDeleteCommand roleGroupDeleteCommand = new ORMRoleGroupDeleteCommand();
	    roleGroupDeleteCommand.setRoleGroup((RoleGroup) getHost().getModel());
	    	
		return roleGroupDeleteCommand;
	}
}
