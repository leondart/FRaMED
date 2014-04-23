package orm.editPolicy;

import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.ComponentEditPolicy;
import org.eclipse.gef.requests.GroupRequest;

import orm.command.ORMRoleGroupDeleteCommand;
import org.framed.orm.model.RoleGroup;


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
