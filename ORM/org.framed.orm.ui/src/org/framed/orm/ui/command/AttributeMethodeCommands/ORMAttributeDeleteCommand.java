package org.framed.orm.ui.command.AttributeMethodeCommands;

import org.eclipse.gef.commands.Command;

import org.framed.orm.model.Attribute;
import org.framed.orm.model.Type;

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