package orm.command.AttributeMethodeCommands;

import org.eclipse.gef.commands.Command;

import orm.model.Attribute;
import orm.model.Type;

/**
 * @author Kay Bierzynski
 * */
public class ORMAttributeDeleteCommand extends Command {

	  private Attribute att;
	  private Type type;
	 
	  @Override
	  public void execute() {
		  att.setType(null);
		  
	  }
	 
	  @Override
	  public void undo() {
	    att.setType(type);
	  }
	 
	  public void setAttribute(Attribute att) {
	    this.att = att;
	    this.type = att.getType();
	  }
	
	
}
