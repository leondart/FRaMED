package org.framed.orm.ui.editPolicy;

import org.eclipse.gef.commands.Command;
import org.framed.orm.ui.command.shapes.ORMShapeDeleteCommand;

/**
 * This class is a wrapper for editor commands to hook into canExecute-method.
 * on canExecute() the editPolicyhandler is called.
 * editPolicyHandler needs to be set on command creation!
 *
 * @author Christian Deussen
 *
 */
public class EditPolicyCommandDecorator<T extends Command> extends Command {

	private T myCommand;

	/**
	 * editPolicyHandler which provides canExecute implementation
	 */
	private EditPolicyHandler editPolicyHandler;

	public void setEditPolicyHandler(EditPolicyHandler ep) {
		editPolicyHandler = ep;
	}

	public T getCmd()
	{
		return myCommand;
	}

	public EditPolicyCommandDecorator(T cmd) {
		myCommand = cmd;
	}

	/**
	 * @return <code>true</code> when the command is allowed to be executed
	 */
	@Override
	public boolean canExecute() {
		/**
		 * somehow ORMShapeDeleteCommand is triggered by the framework quite frequently.
		 * so we do not check this command
		 */
		if(this.myCommand instanceof ORMShapeDeleteCommand)
			return true;

		if(this.editPolicyHandler == null) {
			System.out.println("EditPolicyHandler for " + this.myCommand.getClass().toString() +
					" not set. Set on editPolicyHandler on Command creation");
			return this.myCommand.canExecute();
		}
		return this.myCommand.canExecute() && this.editPolicyHandler.canExecute(myCommand);
	}

	/**
	 * @return <code>true</code> if the command can be undone. This method
	 *         should only be called after <code>execute()</code> or
	 *         <code>redo()</code> has been called.
	 */
	@Override
	public boolean canUndo() {
		return this.myCommand.canUndo();
	}

	/**
	 *
	 * dont override chain-command. => wont work
	 */

	/**
	 * This is called to indicate that the <code>Command</code> will not be used
	 * again. The Command may be in any state (executed, undone or redone) when
	 * dispose is called. The Command should not be referenced in any way after
	 * it has been disposed.
	 */
	@Override
	public void dispose() {
		this.myCommand.dispose();
	}

	/**
	 * Executes the Command. This method should not be called if the Command is
	 * not executable.
	 */
	@Override
	public void execute() {
		this.myCommand.execute();
	}

	/**
	 * @return an untranslated String used for debug purposes only
	 */
	@Override
	public String getDebugLabel() {
		return this.myCommand.getDebugLabel();
	}

	/**
	 * @return a String used to describe this command to the User
	 */
	@Override
	public String getLabel() {
		return this.myCommand.getLabel();
	}

	/**
	 * Re-executes the Command. This method should only be called after
	 * <code>undo()</code> has been called.
	 */
	@Override
	public void redo() {
		this.myCommand.redo();
	}

	/**
	 * Sets the debug label for this command
	 *
	 * @param label
	 *            a description used for debugging only
	 */
	@Override
	public void setDebugLabel(String label) {
		this.myCommand.setDebugLabel(label);
	}

	/**
	 * Sets the label used to describe this command to the User.
	 *
	 * @param label
	 *            the label
	 */
	@Override
	public void setLabel(String label) {
		this.myCommand.setLabel(label);
	}

	/**
	 * Undoes the changes performed during <code>execute()</code>. This method
	 * should only be called after <code>execute</code> has been called, and
	 * only when <code>canUndo()</code> returns <code>true</code>.
	 *
	 * @see #canUndo()
	 */
	@Override
	public void undo() {
		this.myCommand.undo();
	}

}
