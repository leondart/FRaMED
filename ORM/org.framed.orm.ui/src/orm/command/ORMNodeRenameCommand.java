package orm.command;

import org.eclipse.gef.commands.Command;

import org.framed.orm.model.Node;

/**
 * @author Kay Bierzynski
 * */
public class ORMNodeRenameCommand extends Command {
	
	 private String oldName, newName;
	  private Node model;
	 
	  @Override public void execute() {
	    oldName = model.getName();
	    model.setName(newName);
	  }
	 
	  @Override public void undo() {
	    model.setName(oldName);
	  }
	   
	  public void setNewName(String newName) {
	    this.newName = newName;
	  }
	   
	  public void setModel(Node model) {
	    this.model = model;
	  }
	
}
