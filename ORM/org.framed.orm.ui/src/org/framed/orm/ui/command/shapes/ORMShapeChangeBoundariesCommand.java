package org.framed.orm.ui.command.shapes;

import org.framed.orm.geometry.Rectangle;
import org.eclipse.gef.commands.Command;
import org.framed.orm.model.Shape;

;


/**
 * Through this command the boundaries of a {@link Shape} can be changed.
 * 
 * @author Kay Bierzynski
 * */
public class ORMShapeChangeBoundariesCommand extends Command {

  /**
   * The initial boundaries of the {@link Shape} need to be stored for tha case that the user wants
   * to undone this command.
   */
  private Rectangle oldBoundaries;
  /** The new boundaries of the {@link Shape}. */
  private Rectangle newBoundaries;
  /** The {@link Shape}, whose boundaries should be changed. */
  private Shape shape;

  /**
   * Constructor of this command, where the label is set, which describes this command to the user.
   * 
   */
  public ORMShapeChangeBoundariesCommand() {
    super.setLabel("ORMShapeChangeConstraints");
  }

  /**
   * This method tests if the conditions for executing this command are fulfilled,
   * 
   * @return true if the parameter newBoundaries and node are set.
   */
  @Override
  public boolean canExecute() {
    return shape != null && newBoundaries != null;
  }

  /**
   * This method tests if the conditions for undoing this command are fulfilled,
   * 
   * @return true if the parameter oldBoundaries and node are set.
   */
  @Override
  public boolean canUndo() {
    return shape != null && oldBoundaries != null;
  }

  /**
   * {@inheritDoc} In this method the old boundaries of the {@link Node} are saved for the case that
   * the user wants to undo this command and than old boundaries are replaced with th new
   * boundaries.
   */
  @Override
  public void execute() {
    oldBoundaries = shape.getBoundaries();
    shape.setBoundaries(newBoundaries);
  }

  /**
   * {@inheritDoc} This command can be undone through replacing the new boundaries with the old
   * boundaries.
   */
  @Override
  public void undo() {
    shape.setBoundaries(oldBoundaries);
  }

  /**
   * Setter for the {@link Shape}, whose boundaries should be changed.
   * 
   * @param shape org.framed.orm.model.Shape
   * */
  public void setShape(final Shape shape) {
    this.shape = shape;
  }

  /**
   * Setter for the new boundaries of the {@link Shape}.
   * 
   * @param boundaries org.eclipse.draw2d.geometry.Rectangle
   * */
  public void setNewBoundaries(Rectangle newBoundarie) {
    this.newBoundaries = newBoundarie;
  }

}
