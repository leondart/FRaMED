package org.framed.orm.ui.command.AttributeOperationCommands;

import org.eclipse.gef.commands.Command;
import org.framed.orm.model.Attribute;
import org.framed.orm.model.Type;
import org.framed.orm.ui.factory.ORMAttributeFactory;

/**
 * Through this command the model element {@link Attribute} can be created(invoked into the model
 * tree).
 * 
 * @author Kay Bierzynski
 * */
public class ORMAttributeCreateCommand extends Command {

  /** The {@link Attribute}, which will be created/invoked in this command. */
  private Attribute attribute;
  /**
   * The {@link Type} to which the {@link Attribute} is added also the parent of the
   * {@link Attribute} in the model tree.
   */
  private Type type;

  /**
   * Constructor of this command, where the label is set, which describes this command to the user.
   * 
   */
  public ORMAttributeCreateCommand() {
    super.setLabel("ORMAttributeCreate");
  }

  /**
   * This method tests if the conditions for executing this command are fulfilled,
   * 
   * @return true if the parameter type and attibute are set.
   */
  @Override
  public boolean canExecute() {
    return type != null && attribute != null;
  }

  /**
   * {@inheritDoc} In this methode the name for the {@link Attribute} is initialized with the name
   * <new Attribute> and the reference to the it's parent {@link Type} is set.
   */
  @Override
  public void execute() {

    attribute.setName("<new Attribute>");
    attribute.setType(type);

  }

  /**
   * {@inheritDoc} To undo this command the reference to the parent {@link Type} is set on null.
   * Through setting the parent refrence on null the {@link Attribute} is removed from the model
   * tree.
   */
  @Override
  public void undo() {
    attribute.setType(null);
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
   * Setter of the {@link Attribute}, which should be created/invoked. The basis {@link Attribute}
   * class is given by {@link ORMAttributeFactory}.
   * 
   * @param attribute org.framed.orm.model.Attribute
   */
  public void setAttribute(final Attribute attribute) {
    this.attribute = attribute;
  }
}
