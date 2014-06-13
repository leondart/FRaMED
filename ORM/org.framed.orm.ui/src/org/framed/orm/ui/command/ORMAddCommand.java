package org.framed.orm.ui.command;

import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.commands.Command;
import org.framed.orm.model.Node;
import org.framed.orm.model.Container;


/**
 * @author Lars Schuetze
 * 
 */
public class ORMAddCommand extends Command {

  private Container parent;
  private Node child;
  private Container oldParent;
  private Rectangle oldConstraint;
  private Rectangle constraint;

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

    oldConstraint = child.getConstraints();
    redo();
  }

  @Override
  public void redo() {
    child.setContainer(parent);

    child.setConstraints(constraint);
  }

  @Override
  public void undo() {
    child.setContainer(oldParent);

    child.setConstraints(oldConstraint);
  }

  public void setChild(Node child) {
    this.child = child;
  }

  public void setParent(Container parent) {
    this.parent = parent;
  }

  public void setConstraint(Rectangle constraint) {
    this.constraint = constraint;
  }
}
