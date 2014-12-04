package org.framed.orm.ui.command.AttributeMethodCommands;


import org.eclipse.gef.commands.Command;
import org.framed.orm.model.Method;
import org.framed.orm.model.Type;
import org.framed.orm.ui.factory.ORMOperationFactory;

/**
 * Through this command the model element {@link Method} can be created(invoked into the model
 * tree).
 * 
 * @author Kay Bierzynski
 * */
public class ORMMethodCreateCommand extends Command {

  /** The {@link Method}, which will be created/invoked in this command. */
  private Method method;
  /**
   * The {@link Type} to which the {@link Method} is added also the parent of the {@link Method} in
   * the model tree.
   */
  private Type type;

  /**
   * Constructor of this command, where the label is set, which describes this command to the user.
   * 
   */
  public ORMMethodCreateCommand() {
    super.setLabel("ORMMethodCreate");
  }

  /**
   * This method tests if the conditions for executing this command are fulfilled,
   * 
   * @return true if the parameter type and method are set.
   */
  @Override
  public boolean canExecute() {
    return type != null && method != null;
  }

  /**
   * {@inheritDoc} In this methode the name for the {@link Method} is initialized with the name <new
   * Method> and the reference to the it's parent {@link Type} is set.
   */
  @Override
  public void execute() {

    method.setName("<new Method>");
    method.setType(type);

  }

  /**
   * {@inheritDoc} To undo this command the reference to the parent {@link Type} is set on null.
   * Through setting the parent refrence on null the {@link Method} is removed from the model tree.
   */
  @Override
  public void undo() {
    method.setType(null);
  }

  /**
   * Setter of the parent {@link Type}
   * 
   * @param type org.framed.orm.model.Type
   */
  public void setContainer(final Type type) {
    this.type = type;
  }

  /**
   * Setter of the {@link Method}, which should be created/invoked. The basis {@link Method} class
   * is given by {@link ORMOperationFactory}.
   * 
   * @param method org.framed.orm.model.Method
   */
  public void setMethod(final Method method) {
    this.method = method;
  }

}
