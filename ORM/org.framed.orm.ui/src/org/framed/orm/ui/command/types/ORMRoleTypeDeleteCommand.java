package org.framed.orm.ui.command.types;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.gef.commands.Command;

import org.framed.orm.model.Node;
import org.framed.orm.model.Relation;
import org.framed.orm.model.RoleType;
import org.framed.orm.model.Container;

/**
 * @author Kay Bierzynski
 * */
public class ORMRoleTypeDeleteCommand extends Command {

  private RoleType roleType;
  private Container parent;
  /** relations */
  private List<Relation> relations;
  /** Sources for the relations that start or end at this node. */
  private Map<Relation, Node> sourceLinks;
  /** Targets for the relations that start or end at this node. */
  private Map<Relation, Node> targetLinks;

  public ORMRoleTypeDeleteCommand() {
    super.setLabel("ORMRoleTypeDelete");
  }

  @Override
  public void execute() {
    detachLinks();
    roleType.setContainer(null);
  }

  @Override
  public void undo() {
    reattachLinks();
    roleType.setContainer(parent);

  }

  /**
   * Detach all relationss from the node and from other connecting types, storing the connection
   * information in local data structures.
   */
  private void detachLinks() {
    relations = new ArrayList<Relation>();
    sourceLinks = new HashMap<Relation, Node>();
    targetLinks = new HashMap<Relation, Node>();
    relations.addAll(roleType.getIncomingLinks());
    relations.addAll(roleType.getOutgoingLinks());
    for (Relation link : relations) {
      sourceLinks.put(link, link.getSource());
      targetLinks.put(link, link.getTarget());
      link.setSource(null);
      link.setTarget(null);
      link.setRelationContainer(null);
    }
  }

  /**
   * Reattach all relations to their source and target nodes.
   */
  private void reattachLinks() {
    for (Relation link : relations) {
      link.setSource(sourceLinks.get(link));
      link.setTarget(targetLinks.get(link));
      link.setRelationContainer(parent);
    }
  }

  public void setType(RoleType type) {
    this.roleType = type;
    this.parent = type.getContainer();
  }

}
