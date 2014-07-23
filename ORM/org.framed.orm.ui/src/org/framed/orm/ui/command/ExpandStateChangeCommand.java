package org.framed.orm.ui.command;

import org.eclipse.gef.commands.Command;

import org.framed.orm.model.Type;

/**
 * Through this command the model attribute isExpand from type model elements can be changed.
 * 
 * @author Kay Bierzynski
 * */
public class ExpandStateChangeCommand extends Command {

  /**
   * Constructor of this command, where the label is set, which describes this command to the user.
   * 
   * */
  public ExpandStateChangeCommand() {
    super.setLabel("ExpandStateChange");
  }

  /** The {@link Type}, where the isExpand attribute should be changed. */
  private Type type;

  /**
   * This method tests if the conditions for executing this command are fulfilled,
   * 
   * @return true if the parameter type is set.
   */
  @Override
  public boolean canExecute() {
    return type != null;
  }

  /**
   * {@inheritDoc} In this method the isExpand boolean attribute is set to false when the isExpand
   * attribute was initially true and the isExpand boolean attribute is set to true when the
   * isExpand attribute was initially false.
   * */
  @Override
  public void execute() {

    if (type.isIsExpand()) {
      type.setIsExpand(false);
    } else {
      type.setIsExpand(true);
    }
  }

  /**
   * Method, which determines if the the command can be undone or not.
   * 
   * @return false this command can never undone, because change of the isExpand attribute should
   *         always be done through clicking on the buttoen which collapse or expands parts of the
   *         type figure
   */
  @Override
  public boolean canUndo() {
    return false;
  }
  
  /**
   * Setter for the {@link Type} for which the isExpand attribute should be changed.
   * 
   * @param type org.framed.orm.model.Type
   * */
  public void setType(final Type type) {
    this.type = type;
  }

}
