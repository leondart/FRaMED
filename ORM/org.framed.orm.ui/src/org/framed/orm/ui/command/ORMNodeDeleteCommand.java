package org.framed.orm.ui.command;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.gef.commands.Command;
import org.framed.orm.model.Container;
import org.framed.orm.model.Node;
import org.framed.orm.model.Relation;

/**
 * This the delete command for groupings, compartments, natrualtypes and roletypes.
 * @author Kay Bierzynski
 * */
public class ORMNodeDeleteCommand extends Command {
  
  protected Node node;
  protected Container parent;
  /** relations */
  protected List<Relation> relations;
  /** Sources for the realtions that start or end at this node. */
  private Map<Relation, Node> sourceLinks;
  /** Targets for the relations that start or end at this node. */
  private Map<Relation, Node> targetLinks;
  
  public ORMNodeDeleteCommand(){
    super.setLabel("ORMNodeDelete");
    relations = new ArrayList<Relation>();
  }
  
  @Override
  public void execute() {
    detachLinks();
    node.setContainer(null);
  }
 
  @Override
  public void undo() {
    reattachLinks();  
    node.setContainer(parent);
  }
 
  /**
   * Detach all links from the node and from other
   * connecting types, storing the connection information in local
   * data structures.
   */
  protected void detachLinks() {
    sourceLinks = new HashMap<Relation,Node>();
    targetLinks = new HashMap<Relation,Node>();
    relations.addAll(node.getIncomingLinks());
    relations.addAll(node.getOutgoingLinks());
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
  
  public void setNode(Node node) {
    this.node = node;
    this.parent = node.getContainer();
  }
}
