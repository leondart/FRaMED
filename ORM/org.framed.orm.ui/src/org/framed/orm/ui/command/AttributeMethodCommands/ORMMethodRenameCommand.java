package org.framed.orm.ui.command.AttributeMethodCommands;

import org.eclipse.gef.commands.Command;

import org.framed.orm.model.Method;

/**
 * @author Kay Bierzynski
 * */
public class ORMMethodRenameCommand extends Command {
	
	  private String oldMethodName, newMethodName;
	  private Method met;
	 
	  public ORMMethodRenameCommand(){
	    super.setLabel("ORMMethodRename");
	  }
	  
	  @Override public void execute() {
	    oldMethodName = met.getName();
	    met.setName(newMethodName);
	  }
	 
	  @Override public void undo() {
	    met.setName(oldMethodName);
	  }
	   
	  public void setNewName(String newMethodName) {
	    this.newMethodName = newMethodName;
	  }
	   
	  public void setMethod(Method met) {
	    this.met = met;
	  }

}
