package org.framed.orm.ui.command.AttributeMethodCommands;


import org.eclipse.gef.commands.Command;

import org.framed.orm.model.Method;
import org.framed.orm.model.Type;

/**
 * @author Kay Bierzynski
 * */
public class ORMMethodCreateCommand extends Command {

  private Method method;
  private Type type;

  public ORMMethodCreateCommand() {
    super.setLabel("ORMMethodCreate");
  }

  /**
   * The command can be executed if all parameters have been set.
   */
  @Override
  public boolean canExecute() {
    return type != null && method != null;
  }

  /**
   * Set the name for the {@link Method} and add it to the container {@link Type}.
   */
  @Override
  public void execute() {

    method.setName("<new Method>");
    method.setType(type);

  }

  /**
   * Remove the {@link Method} from the container {@link Type}.
   */
  @Override
  public void undo() {
    method.setType(null);
  }



  public void setContainer(final Type type) {
    this.type = type;
  }

  public void setMethod(final Method method) {
    this.method = method;
  }

}
