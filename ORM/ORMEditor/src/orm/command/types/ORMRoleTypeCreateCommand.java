package orm.command.types;

import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.commands.Command;

import orm.model.RoleGroup;
import orm.model.RoleType;
import orm.model.Rolemodel;

/**
 * @author Kay Bierzynski
 * */
public class ORMRoleTypeCreateCommand extends Command {
	
	private RoleType    roleType;
	private Rectangle   constraints;
	private Rolemodel   parentrolemodel;
	private RoleGroup   roleGroup;
	/** 
	 * The command can be executed if all parameters have been set.
	 */
	@Override
	public boolean canExecute() {
		
	    return roleType != null && constraints != null;
	}
	
	/**
	 * Set the constraints for the {@link RoleType} and add it to the container 
	 * {@link CompartmentDiagram} or Rolemodel.
	 */
	@Override public void execute() {
		
		roleType.setConstraints(constraints);
		// for Attribute/Methode list expanding 
		roleType.setIsExpand(true);
	  if(parentrolemodel!=null)  roleType.setParentRolemodel(parentrolemodel);
	  if(roleGroup!=null)   roleType.setParentRoleGroup(roleGroup);
	}
	
	/**
	 * Remove the {@link RoleType} from the container {@link CompartmentDiagram} or Rolemodel.
	 */
	@Override public void undo() {
		roleType.setParentRolemodel(null);
		roleType.setParentRoleGroup(null);
	}

	
	public void setConstraints(final Rectangle constraints) {
	    this.constraints = constraints;
	}
	
	
	
	public void setRoleType(final RoleType node) {
		this.roleType = node;
	}
	
	
	public void setParentRolemodel(final Rolemodel rm) {
		this.parentrolemodel = rm;
	}
	
	public void setParentRoleGroup(final RoleGroup rm) {
		this.roleGroup = rm;
	}
}
