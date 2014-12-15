package org.framed.orm.ui.command.shapes;

import java.util.ArrayList;
import java.util.List;

import org.framed.orm.model.Node;
import org.framed.orm.model.Relation;
import org.framed.orm.model.RoleGroup;
import org.framed.orm.model.RoleType;

/**
 * @author Kay Bierzynski
 * */
public class ORMRoleGroupDeleteCommand extends ORMShapeDeleteCommand {

  /**
   * A list which contains all {@link RoleType}s and {@link RoleGroup}s that are in this
   * {@link RoleGroup}.
   */
  private List<Node> items;


  /**
   * Constructor of this command, where the label is set, which describes this command to the user.
   */
  public ORMRoleGroupDeleteCommand() {
    super.setLabel("ORMRoleGroupDelete");
  }


  /**
   * Because a {@link RoleGroup} is a {@link Container} not only the {@link Relation}s connected to
   * this {@link RoleGroup} must be detached/deleted the {@link Relation}s connected to the children
   * and their children of this {@link RoleGroup} must be detached/deleted as well. For that reason
   * the first thing, which is done in this method is to gather all children and their children of
   * this {@link RoleGroup} in a single list. After that the {@link Relation}s connected to children
   * are added to relations list.
   * 
   * {@inheritDoc}
   */
  @Override
  protected void detachLinks() {

    items = new ArrayList<Node>();

    items.addAll(((RoleGroup) shape).getNodes());

    gatherRoleGroupsItems(items);

    for (Node item : items) {
      // add all relations with the source not in the RG and the target in the RG
      for (Relation rel : item.getIncomingLinks()) {
        if (!items.contains(rel.getSource()))
          relations.add(rel);
      }
      // add all relations with the source in the RG and the target not in the RG
      for (Relation rel : item.getOutgoingLinks()) {
        if (!items.contains(rel.getTarget()))
          relations.add(rel);
      }

    }
    super.detachLinks();
  }

  /**
   * This method puts adds the children of the children and so on of the {@link RoleGroup} to the
   * list, which was given initaily.
   * */
  private void gatherRoleGroupsItems(final List<Node> items) {
    List<Node> items2 = new ArrayList<Node>();
    for (Node item : items) {
      if (item instanceof RoleGroup) {
        items2.addAll(((RoleGroup) item).getNodes());
        gatherRoleGroupsItems(items2);
      }
    }
    items.addAll(items2);
  }

}
