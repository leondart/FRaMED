/**
 * 
 */
package org.framed.orm.ui.command;

import org.eclipse.gef.commands.Command;
import org.framed.orm.model.Node;
import org.framed.orm.model.Container;

/**
 * @author Lars Schuetze
 * 
 */
public class ORMOrphanChildCommand extends Command {

  private Container parent;
  private Node child;

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

  public void setChild(Node child) {
    this.child = child;
  }

  public void setParent(Container parent) {
    this.parent = parent;
  }
}
