package org.framed.orm.ui.command;

import org.eclipse.gef.commands.Command;



import org.framed.orm.model.Type;

/**
 * @author Kay Bierzynski
 * */
public class ExpandStateChangeCommand extends Command {
	
	private Type type;

	/** 
	 * The command can be executed if all parameters have been set.
	 */
	@Override
	public boolean canExecute() {
	    return type != null  ;
	}
	
	
	@Override public void execute() {
		
		if(type.isIsExpand()) type.setIsExpand(false);
		
		else if(!(type.isIsExpand())) type.setIsExpand(true);
		
	}
	
	 @Override
	  public void undo() {
		 
	  }
	 
	 /**
	   * This command can for now not be undone. 
	  */
	 @Override
	 public boolean canUndo() {
		   return false;
	 }
	
	public void setContainer(final Type type) {
		this.type = type;
	}
	
}
