package org.framed.orm.ui.command;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.gef.commands.Command;
import org.framed.orm.model.AbstractRole;
import org.framed.orm.model.Node;
import org.framed.orm.model.Relation;
import org.framed.orm.model.RoleGroup;
import org.framed.orm.model.Container;

/**
 * @author Kay Bierzynski
 * */
public class ORMRoleGroupDeleteCommand extends Command {

  private Container parent;
  private RoleGroup roleGroup;

  private List<Relation> relations;
  /** List which contains all roletypes and rolegroups that are in this rolegroup */
  private List<AbstractRole> items;
  /** Sources for the relations that start or end at this node. */
  private Map<Relation, Node> sourceLinks;
  /** Targets for the relations that start or end at this node. */
  private Map<Relation, Node> targetLinks;

  public ORMRoleGroupDeleteCommand() {
    super.setLabel("ORMRoleGroupDelete");
  }

  @Override
  public void execute() {
    detachLinks();
    roleGroup.setContainer(null);
  }

  @Override
  public void undo() {
    reattachLinks();
    roleGroup.setContainer(parent);
  }

  /**
   * Detach all links from the node and from other connecting types, storing the connection
   * information in local data structures.
   */
  private void detachLinks() {
    relations = new ArrayList<Relation>();
    items = new ArrayList<AbstractRole>();
    sourceLinks = new HashMap<Relation, Node>();
    targetLinks = new HashMap<Relation, Node>();

    items.addAll(roleGroup.getItems());

    gatherRoleGroupsItems(items);

    for (AbstractRole item : items) {
      // add all relations with the source not in the RG and the target in the RG
      for (Relation rel : ((Node) item).getIncomingLinks()) {
        if (!items.contains(rel.getSource()))
          relations.add(rel);
      }
      // add all relations with the source in the RG and the target not in the RG
      for (Relation rel : ((Node) item).getOutgoingLinks()) {
        if (!items.contains(rel.getTarget()))
          relations.add(rel);
      }

    }

    relations.addAll(roleGroup.getIncomingLinks());
    relations.addAll(roleGroup.getOutgoingLinks());

    for (Relation link : relations) {
      sourceLinks.put(link, link.getSource());
      targetLinks.put(link, link.getTarget());
      link.setSource(null);
      link.setTarget(null);
      link.setRelationContainer(null);
    }
  }

  private void gatherRoleGroupsItems(List<AbstractRole> items) {
    List<AbstractRole> items2 = new ArrayList<AbstractRole>();
    for (AbstractRole item : items) {
      if (item instanceof RoleGroup) {
        items2.addAll(((RoleGroup) item).getItems());
        gatherRoleGroupsItems(items2);
      }
    }
    items.addAll(items2);
  }

  /**
   * Reattach all links to their source and target node.
   */
  private void reattachLinks() {
    for (Relation link : relations) {
      link.setSource(sourceLinks.get(link));
      link.setTarget(targetLinks.get(link));
      link.setRelationContainer(parent);
    }
  }

  public void setRoleGroup(RoleGroup roleGroup) {
    this.roleGroup = roleGroup;
    this.parent = roleGroup.getContainer();
  }
}
