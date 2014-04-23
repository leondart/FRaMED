package orm.command;

import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.commands.Command;

import org.framed.orm.model.Node;


/**
 * @author Kay Bierzynski
 * */
public class ORMNodeChangeConstraintsCommand extends Command {
	
	private Rectangle oldConstraint;
	private Rectangle newConstraint;
	private Node node;
	
	/**
	 * The command can be executed when all parameters have been set.
	 */
	@Override
	public boolean canExecute() {
	    return node != null && newConstraint != null;
	}
	
	/**
	 * Ther command can be undone if the node and old constraints are set.
	 */
	@Override
	public boolean canUndo() {
	    return node != null && oldConstraint != null;
	}
	
	/**
	 * Save the old constraints and set new new constraints for the node.
	 */
	@Override public void execute() {
	    oldConstraint = node.getConstraints();
		node.setConstraints(newConstraint);
	}

	/**
	 * Restore the saved constraints to the node.
	 */
	@Override public void undo() {
		node.setConstraints(oldConstraint);
	}
	
	public void setNode(final Node node) {
		this.node = node;
	}
	
	public void setNewConstraint(Rectangle newConstraint) {
		this.newConstraint = newConstraint;
	}
	
}
