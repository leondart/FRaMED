/**
 * 
 */
package org.framed.orm.ui.command;

import org.eclipse.gef.commands.Command;
import org.framed.orm.model.Model;
import org.framed.orm.model.Shape;

/**
 * @author Lars Schuetze
 * 
 */
public class ORMOrphanChildCommand extends Command {

  private Model parent;
  private Shape child;

  public ORMOrphanChildCommand() {
    super("ORMOrphanChildCommand");
  }

  @Override
  public boolean canExecute() {
    return ((parent != null) && (child != null));
  }

  @Override
  public void execute() {
    redo();
  }

  public void redo() {
    child.setContainer(null);
  }

  @Override
  public void undo() {
    
      child.setContainer(parent);
  }

  public void setChild(Shape child) {
    this.child = child;
  }

  public void setParent(Model parent) {
    this.parent = parent;
  }
}
