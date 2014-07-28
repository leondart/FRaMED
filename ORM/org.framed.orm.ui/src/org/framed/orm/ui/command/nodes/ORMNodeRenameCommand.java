package org.framed.orm.ui.command.nodes;

import org.eclipse.gef.commands.Command;
import org.framed.orm.model.Node;

/**
 * Through this command the name of a {@link Node} can be changed.
 * 
 * @author Kay Bierzynski
 * */
public class ORMNodeRenameCommand extends Command {

  /**
   * oldName: The old Node name, which is stored for the case the user wants to undone this command.
   * newName: The new node name, which replaces the old node name.
   * */
  private String oldName, newName;
  /** The {@link Node}, whose name will be changed. */
  private Node model;

  /**
   * Constructor of this command, where the label is set, which describes this command to the user.
   * 
   */
  public ORMNodeRenameCommand() {
    super.setLabel("ORMNodeRename");
  }

  /**
   * {@inheritDoc} In this methode the initial name of the {@link Node} is stored in the oldName
   * variable and than replaced with the new node name.
   */
  @Override
  public void execute() {
    oldName = model.getName();
    model.setName(newName);
  }

  /**
   * {@inheritDoc} To undo this command the new node name is replaced with the old/initial node
   * name.
   */
  @Override
  public void undo() {
    model.setName(oldName);
  }

  /**
   * Setter of the new node name.
   * 
   * @param newName java.lang.String
   */
  public void setNewName(final String newName) {
    this.newName = newName;
  }

  /**
   * Setter of the {@link Node}, whose name will be changed.
   * 
   * @param model org.framed.orm.model.Node
   */
  public void setNode(final Node model) {
    this.model = model;
  }

}
