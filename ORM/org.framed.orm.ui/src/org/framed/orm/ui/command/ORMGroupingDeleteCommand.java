package org.framed.orm.ui.command;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.gef.commands.Command;

import org.framed.orm.model.Container;
import org.framed.orm.model.Grouping;
import org.framed.orm.model.Node;
import org.framed.orm.model.Relation;

/**
 * @author Kay Bierzynski
 * */
public class ORMGroupingDeleteCommand extends Command {

  private Grouping grouping;
  private Container parent;

  private List<Relation> relations;
  /** Sources for the links that start or end at this node. */
  private Map<Relation, Node> sourceLinks;
  /** Targets for the links that start or end at this node. */
  private Map<Relation, Node> targetLinks;

  public ORMGroupingDeleteCommand() {
    super.setLabel("ORMGroupingDelete");
  }

  @Override
  public void execute() {
    detachLinks();
    grouping.setContainer(null);
  }

  @Override
  public void undo() {
    reattachLinks();
    grouping.setContainer(parent);
  }

  public void setGrouping(Grouping grouping) {
    this.grouping = grouping;
    this.parent = grouping.getContainer();
  }


  /**
   * Detach all links from the node and from the other connecting type, storing the connection
   * information in local data structures.
   */
  private void detachLinks() {
    relations = new ArrayList<Relation>();
    sourceLinks = new HashMap<Relation, Node>();
    targetLinks = new HashMap<Relation, Node>();
    relations.addAll(grouping.getIncomingLinks());
    relations.addAll(grouping.getOutgoingLinks());
    for (Relation link : relations) {
      sourceLinks.put(link, link.getSource());
      targetLinks.put(link, link.getTarget());
      link.setSource(null);
      link.setTarget(null);
      link.setRelationContainer(null);
    }
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
}
