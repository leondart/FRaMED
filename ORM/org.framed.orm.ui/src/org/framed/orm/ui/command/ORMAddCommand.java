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
public class ORMAddCommand extends Command {

  private RelationContainer parent;
  private AbstractRole child;
  private RelationContainer oldParent;

  public ORMAddCommand() {
    super("ORMAddCommand");
  }

  @Override
  public boolean canExecute() {
    return ((parent != null) && (child != null));
  }

  @Override
  public void execute() {
    if (parent instanceof RoleGroup) {
      child.setParentRoleGroup((RoleGroup) parent);
      // child.setParentRolemodel(null);
    } else {
      child.setParentRolemodel((Rolemodel) parent);
      // child.setParentRoleGroup(null);
    }
  }

  @Override
  public void undo() {
    if (oldParent instanceof RoleGroup) {
      child.setParentRoleGroup((RoleGroup) oldParent);
    } else {
      child.setParentRolemodel((Rolemodel) oldParent);
    }
  }

  public void setChild(AbstractRole child) {
    this.child = child;
  }

  public void setParent(RelationContainer parent) {
    this.parent = parent;
    oldParent = child.getParentRoleGroup();
    if (oldParent == null) {
      oldParent = child.getParentRolemodel();
    }
  }
}
