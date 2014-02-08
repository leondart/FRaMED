package orm.command.AttributeMethodeCommands;

import org.eclipse.gef.commands.Command;

import orm.model.Attribute;
import orm.model.Type;

/**
 * @author Kay Bierzynski
 * */
public class ORMAttributeCreateCommand extends Command {
	
	private Attribute attribute;
	private Type type;

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
		attribute.setType(type);
	}


	
	public void setContainer(final Type type) {
		this.type = type;
	}
	
	public void setAttribute(final Attribute attribute) {
		this.attribute = attribute;
	}
}
