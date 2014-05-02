package org.framed.orm.ui.command.types;

import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.commands.Command;

import org.framed.orm.model.CompartmentDiagram;
import org.framed.orm.model.Compartment;
import org.framed.orm.model.Rolemodel;



/**
 * @author Kay Bierzynski
 * */
public class ORMCompartmentCreateCommand extends Command {

	
	private Compartment compartment;
	private Rectangle constraints;
	
	private CompartmentDiagram cd;
	private Rolemodel rm, parentrolemodel;
	
	public ORMCompartmentCreateCommand(){
	  super.setLabel("ORMCompartmentCreate");
	}
	
	/** 
	 * The command can be executed if all parameters have been set.
	 */
	@Override
	public boolean canExecute() {
		
	    return true;
	}
	
	/**
	 * Set the constraints for the {@link Compartment} and add it to the container 
	 * {@link CompartmenDiagram} or {@link Rolemodel}.
	 */
	@Override public void execute() {
		
		compartment.setConstraints(constraints);
		if(cd != null) compartment.setCd(cd);
		compartment.setIsExpand(true);
		compartment.setRolemodel(rm);
		if(parentrolemodel != null) compartment.setParentRolemodel(parentrolemodel);
	}
	
	/**
	 * Remove the {@link Compartment} from the container {@link CompartmentDiagram} or  {@link Rolemodel}.
	 */
	@Override public void undo() {
		if(cd != null) compartment.setCd(null);
		if(parentrolemodel != null) compartment.setParentRolemodel(null);
	}

	
	public void setConstraints(final Rectangle constraints) {
	    this.constraints = constraints;
	}
	
	public void setContainer(final CompartmentDiagram opd) {
		this.cd = opd;
	}
	
	public void setCompartment(final Compartment node) {
		this.compartment = node;
	}
	
	public void setRolemodel(final Rolemodel rm) {
		this.rm = rm;
	}
	
	public void setParentRolemodel(final Rolemodel rm) {
		this.parentrolemodel = rm;
	}
}
