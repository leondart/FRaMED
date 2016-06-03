package org.framed.orm.ui.command;

import org.eclipse.gef.commands.Command;
import org.framed.orm.model.NamedElement;

/**
 * Through this command the name of a {@link NamedElement} can be changed.
 * 
 * @author Kay Bierzynski
 * */
public class ORMNamedElementRenameCommand extends Command {

  /**
   * oldName: The old name, which is stored for the case the user wants to undone this command.
   * newName: The new name, which replaces the old name.
   * */
  private String oldName, newName;

  /** The {@link NamedElement}, whose name will be changed. */
  private NamedElement element;

  /**
   * Constructor of this command, where the label is set, which describes this command to the user.
   * 
   */
  public ORMNamedElementRenameCommand() {
    super.setLabel("ORMNamedElementRename");
  }

  /**
   * This method tests if the conditions for executing this command are fulfilled,
   * 
   * @return true when the new name is set
   */
  @Override
  public boolean canExecute() {
    return newName != null;
  }

  /**
   * {@inheritDoc} In this methode the initial name of the {@link NamedElement} is stored in the
   * oldName variable and than replaced with the new name.
   */
  @Override
  public void execute() {
    oldName = element.getName();
    element.setName(newName);
  }

  /**
   * {@inheritDoc} To undo this command the new name is replaced with the old/initial name.
   */
  @Override
  public void undo() {
    element.setName(oldName);
  }

  /**
   * Setter of the new name.
   * 
   * @param newName java.lang.String
   */
  public void setNewName(final String newName) {
    this.newName = newName;
  }

  /**
   * Setter of the {@link NamedElement}, whose name will be changed.
   * 
   * @param element org.framed.orm.model.NamedElement
   */
  public void setNamedElement(final NamedElement element) {
    this.element = element;
  }

}
