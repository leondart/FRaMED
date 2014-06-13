package org.framed.orm.ui.command.types;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.gef.commands.Command;

import org.framed.orm.model.Container;
import org.framed.orm.model.NaturalType;
import org.framed.orm.model.Node;
import org.framed.orm.model.Relation;


/**
 * @author Kay Bierzynski
 * */
public class ORMNaturalTypeDeleteCommand extends Command {
	
	  private NaturalType type;
	  private Container parent;
	  /** relations */
	  private List<Relation> relations;
	  /** Sources for the realtions that start or end at this node. */
	  private Map<Relation, Node> sourceLinks;
	  /** Targets for the relations that start or end at this node. */
	  private Map<Relation, Node> targetLinks;
	  
	  public ORMNaturalTypeDeleteCommand(){
	    super.setLabel("ORMNaturalTypeDelete");
	  }
	  
	  @Override
	  public void execute() {
		detachLinks();
	    type.setContainer(null);
	  }
	 
	  @Override
	  public void undo() {
		reattachLinks();  
	    type.setContainer(parent);
	  }
	 
	  /**
	   * Detach all links from the node and from other
	   * connecting types, storing the connection information in local
	   * data structures.
	   */
	  private void detachLinks() {
	    relations = new ArrayList<Relation>();
	    sourceLinks = new HashMap<Relation,Node>();
	    targetLinks = new HashMap<Relation,Node>();
	    relations.addAll(type.getIncomingLinks());
	    relations.addAll(type.getOutgoingLinks());
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
	  
	  public void setType(NaturalType type) {
	    this.type = type;
	    this.parent = type.getContainer();
	  }
	
}
