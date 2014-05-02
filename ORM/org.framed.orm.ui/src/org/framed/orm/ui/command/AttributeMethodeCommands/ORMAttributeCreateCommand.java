package org.framed.orm.ui.command.AttributeMethodeCommands;

import org.eclipse.gef.commands.Command;

import org.framed.orm.model.Attribute;
import org.framed.orm.model.Type;

/**
 * @author Kay Bierzynski
 * */
public class ORMAttributeCreateCommand extends Command {
	
	private Attribute attribute;
	private Type type;

	public ORMAttributeCreateCommand(){
	  super.setLabel("ORMAttributeCreate");
	}
	
	/** 
	 * The command can be executed if all parameters have been set.
	 */
	@Override
	public boolean canExecute() {
	    return type != null  && attribute != null;
	}
	
	/**
	 * Set the name for the {@link Attribute} and add it to the container 
	 * {@link Type}.
	 */
	@Override public void execute() {
		
		attribute.setName("<new Attribute>");
		attribute.setType(type);
		
	}

	/**
	 * Remove the {@link Attribute} from the container {@link Type}.
	 */
	@Override public void undo() {
		attribute.setType(null);
	}

	@Override
	public boolean canUndo() {
		return true;
	}

	
	public void setContainer(final Type type) {
		this.type = type;
	}
	
	public void setAttribute(final Attribute attribute) {
		this.attribute = attribute;
	}
}
