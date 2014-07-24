package org.framed.orm.ui.command.AttributeMethodCommands;

import org.eclipse.gef.commands.Command;
import org.framed.orm.model.Method;

/**
 * Through this command the name of a {@link Method} can be changed.
 * 
 * @author Kay Bierzynski
 * */
public class ORMMethodRenameCommand extends Command {

  /**
   * oldMethodName: The old method name, which is stored for the case the user wants to undone this
   * command. newMethodName: The new method name, which replaces the old method name.
   * */
  private String oldMethodName, newMethodName;
  /** The {@link Method}, whose name will be changed. */
  private Method met;


  /**
   * Constructor of this command, where the label is set, which describes this command to the user.
   * 
   */
  public ORMMethodRenameCommand() {
    super.setLabel("ORMMethodRename");
  }

  /**
   * {@inheritDoc} In this methode the initial name of the {@link Method} is stored in the
   * oldMethodName variable and than replaced with the new method name.
   */
  @Override
  public void execute() {
    oldMethodName = met.getName();
    met.setName(newMethodName);
  }


  /**
   * {@inheritDoc} To undo this command the new method name is replaced with the old/initial method
   * name.
   */
  @Override
  public void undo() {
    met.setName(oldMethodName);
  }
  
  /**
   * Setter of the new method name.
   * 
   * @param newMethodName java.lang.String
   */
  public void setNewName(final String newMethodName) {
    this.newMethodName = newMethodName;
  }
  
  /**
   * Setter of the {@link Method}, whose name will be changed.
   * 
   * @param met org.framed.orm.model.Method
   */
  public void setMethod(final Method met) {
    this.met = met;
  }

}
