/**
 * 
 */
package org.framed.orm.ui.command;

import org.eclipse.gef.commands.Command;
import org.framed.orm.model.AbstractRole;
import org.framed.orm.model.RelationContainer;
import org.framed.orm.model.RoleGroup;
import org.framed.orm.model.Rolemodel;

/**
 * @author Lars Schuetze
 * 
 */
public class ORMOrphanChildCommand extends Command {

  private RelationContainer parent;
  private AbstractRole child;

  public ORMOrphanChildCommand() {
    super("ORMOrphanChildCommand");
  }

  @Override
  public boolean canExecute() {
    return ((parent != null) && (child != null));
  }

  @Override
  public void execute() {
    child.setParentRoleGroup(null);
    child.setParentRolemodel(null);
  }

  @Override
  public void undo() {
    if (parent instanceof RoleGroup) {
      child.setParentRoleGroup((RoleGroup) parent);
      // child.setParentRolemodel(null);
    } else {
      child.setParentRolemodel((Rolemodel) parent);
      // child.setParentRoleGroup(null);
    }
  }

  public void setChild(AbstractRole child) {
    this.child = child;
  }

  public void setParent(RelationContainer parent) {
    this.parent = parent;
  }
}
