package org.framed.orm.ui.command;

import org.framed.orm.geometry.Rectangle;
import org.eclipse.gef.commands.Command;
import org.framed.orm.model.Model;
import org.framed.orm.model.Shape;


/**
 * @author Lars Schuetze
 * 
 */
public class ORMAddCommand extends Command {

  private Model parent;
  private Shape child;
  private Model oldParent;
  private Rectangle oldBoundaries;
  private Rectangle boundaries;

  public ORMAddCommand() {
    super("ORMAddCommand");
  }

  @Override
  public boolean canExecute() {
    return ((parent != null) && (child != null));
  }

  @Override
  public void execute() {

    oldParent = child.getContainer();

    oldBoundaries = child.getBoundaries();
    redo();
  }

  @Override
  public void redo() {
    child.setContainer(parent);

    child.setBoundaries(boundaries);
  }

  @Override
  public void undo() {
    child.setContainer(oldParent);

    child.setBoundaries(oldBoundaries);
  }

  public void setChild(Shape child) {
    this.child = child;
  }

  public void setParent(Model parent) {
    this.parent = parent;
  }

  public void setBoundaries(Rectangle constraint) {
    this.boundaries = constraint;
  }
}
