package orm.command;

import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.commands.Command;

import org.framed.orm.model.RoleGroup;
import org.framed.orm.model.Rolemodel;

/**
 * @author Kay Bierzynski
 * */
public class ORMRoleGroupCreateCommand extends Command {
	
	private RoleGroup   roleGroup, parentRoleGroup;
	private Rectangle   constraints;
	private Rolemodel   parentrolemodel;
	/** 
	 * The command can be executed if all parameters have been set.
	 */	
	@Override
	public boolean canExecute() {
		
	    return constraints!= null && roleGroup!= null;
	}
	
	/**
	 * Set the constraints for the {@link RoleGroup} and add it to the container 
	 * {@link RoleModel}.
	 */
	@Override public void execute() {
		
		roleGroup.setConstraints(constraints);
		if(parentrolemodel != null)  roleGroup.setParentRolemodel(parentrolemodel);
		if(parentRoleGroup != null)  roleGroup.setParentRoleGroup(parentRoleGroup);
	}
	
	/**
	 * Remove the {@link RoleGroup} from the container {@link RoleModel}.
	 */
	@Override public void undo() {
		roleGroup.setParentRolemodel(null);
		roleGroup.setParentRoleGroup(null);
	}

	
	public void setConstraints(final Rectangle constraints) {
	    this.constraints = constraints;
	}
	
	
	
	public void setRoleGroup(final RoleGroup node) {
		this.roleGroup = node;
	}
	
	public void setParentRoleGroup(final RoleGroup node) {
		this.parentRoleGroup = node;
	}
	
	public void setParentRolemodel(final Rolemodel rm) {
		this.parentrolemodel = rm;
	}
}
