package org.framed.orm.ui.command.AttributeMethodeCommands;

import org.eclipse.gef.commands.Command;

import org.framed.orm.model.Methode;

/**
 * @author Kay Bierzynski
 * */
public class ORMMethodeRenameCommand extends Command {
	
	  private String oldMethodeName, newMethodeName;
	  private Methode met;
	 
	  @Override public void execute() {
	    oldMethodeName = met.getName();
	    met.setName(newMethodeName);
	  }
	 
	  @Override public void undo() {
	    met.setName(oldMethodeName);
	  }
	   
	  public void setNewName(String newMethodeName) {
	    this.newMethodeName = newMethodeName;
	  }
	   
	  public void setMethode(Methode met) {
	    this.met = met;
	  }

}
