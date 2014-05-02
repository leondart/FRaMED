package org.framed.orm.ui.command.AttributeMethodeCommands;

import org.eclipse.gef.commands.Command;

import org.framed.orm.model.Attribute;



/**
 * @author Kay Bierzynski
 * */
public class ORMAttributeRenameCommand extends Command {
	
	  private String oldAttributeName, newAtttributeName;
	  private Attribute att;
	 
	  public ORMAttributeRenameCommand(){
	    super.setLabel("ORMAttributeRename");
	  }
	  
	  @Override public void execute() {
	     oldAttributeName = att.getName();
	     att.setName(newAtttributeName);
	  }
	 
	  @Override public void undo() {
	    att.setName(oldAttributeName);
	  }
	   
	  public void setNewName(String newAttributeName) {
	    this.newAtttributeName = newAttributeName;
	  }
	   
	  public void setAttribute(Attribute att) {
	    this.att = att;
	  }

}
