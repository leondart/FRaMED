package org.framed.orm.ui.command;

import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.commands.Command;
import org.framed.orm.model.AbstractRole;
import org.framed.orm.model.Node;
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
    oldParent = child.getParentRoleGroup();
    if (oldParent == null) {
      oldParent = child.getParentRolemodel();
    }
    if (child instanceof Node) {
      oldConstraint = ((Node) child).getConstraints();
    }
    redo();
  }

  @Override
  public void redo() {
    if (parent instanceof RoleGroup) {
      child.setParentRolemodel(null);
      child.setParentRoleGroup((RoleGroup) parent);
    } else {
      child.setParentRoleGroup(null);
      child.setParentRolemodel((Rolemodel) parent);
    }
    if (child instanceof Node) {
      ((Node) child).setConstraints(constraint);
    }
  }

  @Override
  public void undo() {
    if (oldParent instanceof RoleGroup) {
      child.setParentRolemodel(null);
      child.setParentRoleGroup((RoleGroup) oldParent);
    } else {
      child.setParentRoleGroup(null);
      child.setParentRolemodel((Rolemodel) oldParent);
    }
    if (child instanceof Node) {
      ((Node) child).setConstraints(oldConstraint);
    }
  }

  public void setChild(AbstractRole child) {
    this.child = child;
  }

  public void setParent(RelationContainer parent) {
    this.parent = parent;
  }

  public void setConstraint(Rectangle constraint) {
    this.constraint = constraint;
  }
}
