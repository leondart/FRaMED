package org.framed.orm.ui.command.nodes;

import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.commands.Command;
import org.framed.orm.model.Node;


/**
 * Through this command the boundaries of a {@link Node} can be changed.
 * 
 * @author Kay Bierzynski
 * */
public class ORMNodeChangeBoundariesCommand extends Command {

  /**
   * The initial boundaries of the {@link Node} need to be stored for tha case that the user wants
   * to undone this command.
   */
  private Rectangle oldBoundaries;
  /** The new boundaries of the {@link Node}. */
  private Rectangle newBoundaries;
  /** The {@link Node}, whose boundaries should be changed. */
  private Node node;

  /**
   * Constructor of this command, where the label is set, which describes this command to the user.
   * 
   */
  public ORMNodeChangeBoundariesCommand() {
    super.setLabel("ORMNodeChangeConstraints");
  }

  /**
   * This method tests if the conditions for executing this command are fulfilled,
   * 
   * @return true if the parameter newBoundaries and node are set.
   */
  @Override
  public boolean canExecute() {
    return node != null && newBoundaries != null;
  }

  /**
   * This method tests if the conditions for undoing this command are fulfilled,
   * 
   * @return true if the parameter oldBoundaries and node are set.
   */
  @Override
  public boolean canUndo() {
    return node != null && oldBoundaries != null;
  }

  /**
   * {@inheritDoc} In this method the old boundaries of the {@link Node} are saved for the case that
   * the user wants to undo this command and than old boundaries are replaced with th new
   * boundaries.
   */
  @Override
  public void execute() {
    oldBoundaries = node.getConstraints();
    node.setConstraints(newBoundaries);
  }

  /**
   * {@inheritDoc} This command can be undone through replacing the new boundaries with the old
   * boundaries.
   */
  @Override
  public void undo() {
    node.setConstraints(oldBoundaries);
  }

  /**
   * Setter for the {@link Node}, whose boundaries should be changed.
   * 
   * @param node org.framed.orm.model.Node
   * */
  public void setNode(final Node node) {
    this.node = node;
  }

  /**
   * Setter for the new boundaries of the {@link Node}.
   * 
   * @param boundaries org.eclipse.draw2d.geometry.Rectangle
   * */
  public void setNewBoundaries(Rectangle newConstraint) {
    this.newBoundaries = newConstraint;
  }

}
