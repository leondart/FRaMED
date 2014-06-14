package org.framed.orm.ui.command;

import java.util.ArrayList;
import java.util.List;

import org.framed.orm.model.Node;
import org.framed.orm.model.Relation;
import org.framed.orm.model.RoleGroup;

/**
 * @author Kay Bierzynski
 * */
public class ORMRoleGroupDeleteCommand extends ORMNodeDeleteCommand {

  /** List which contains all roletypes and rolegroups that are in this rolegroup */
  private List<Node> items;

  public ORMRoleGroupDeleteCommand() {
    super.setLabel("ORMRoleGroupDelete");
  }


  /**
   * Detach all links from the node and from other connecting types, storing the connection
   * information in local data structures.
   */
  @Override
  protected void detachLinks() {

    items = new ArrayList<Node>();

    items.addAll(((RoleGroup)node).getNodes());

    gatherRoleGroupsItems(items);

    for (Node item : items) {
      // add all relations with the source not in the RG and the target in the RG
      for (Relation rel : item.getIncomingLinks()) {
        if (!items.contains(rel.getSource()))
          relations.add(rel);
      }
      // add all relations with the source in the RG and the target not in the RG
      for (Relation rel :  item.getOutgoingLinks()) {
        if (!items.contains(rel.getTarget()))
          relations.add(rel);
      }

    }
    super.detachLinks();
  }

  private void gatherRoleGroupsItems(List<Node> items) {
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
