package org.framed.orm.ui.command.AttributeMethodCommands;

import org.eclipse.gef.commands.Command;
import org.framed.orm.model.Attribute;

/**
 * Through this command the name of a {@link Attribute} can be changed.
 * 
 * @author Kay Bierzynski
 * */
public class ORMAttributeRenameCommand extends Command {

  /**
   * oldAttributeName: The old attribute name, which is stored for the case the user wants to undone
   * this command. newAtttributeName: The new attribute name, which replaces the old attribute name.
   * */
  private String oldAttributeName, newAtttributeName;
  /** The {@link Attribute}, whose name will be changed. */
  private Attribute att;

  /**
   * Constructor of this command, where the label is set, which describes this command to the user.
   * 
   */
  public ORMAttributeRenameCommand() {
    super.setLabel("ORMAttributeRename");
  }

  /**
   * {@inheritDoc} In this methode the initial name of the {@link Attribute} is stored in the
   * oldAttributeName variable and than replaced with the new attribute name.
   */
  @Override
  public void execute() {
    oldAttributeName = att.getName();
    att.setName(newAtttributeName);
  }

  /**
   * {@inheritDoc} To undo this command the new attribute name is replaced with the old/initial
   * attribute name.
   */
  @Override
  public void undo() {
    att.setName(oldAttributeName);
  }

  /**
   * Setter of the new attribute name.
   * 
   * @param newAttributeName java.lang.String
   */
  public void setNewName(final String newAttributeName) {
    this.newAtttributeName = newAttributeName;
  }

  /**
   * Setter of the {@link Attribute}, whose name will be changed.
   * 
   * @param att org.framed.orm.model.Attribute
   */
  public void setAttribute(final Attribute att) {
    this.att = att;
  }

}
