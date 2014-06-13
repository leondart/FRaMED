package org.framed.orm.ui.command.types;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.gef.commands.Command;

import org.framed.orm.model.Container;
import org.framed.orm.model.Compartment;
import org.framed.orm.model.Node;
import org.framed.orm.model.Relation;

/**
 * @author Kay Bierzynski
 * */
public class ORMCompartmentDeleteCommand extends Command {
	
	  private Compartment compartment;
	  private Container parent;
	  
	  private List<Relation> relations;
	  /** Sources for the relations that start or end  at this node. */
	  private Map<Relation, Node> sourceLinks;
	  /** Targets for the relations that start or end at this node. */
	  private Map<Relation, Node> targetLinks;
	  
	  public ORMCompartmentDeleteCommand(){
	    super.setLabel("ORMCompartmentDelete");
	  }
	  
	  @Override
	  public void execute() {
		detachLinks();
	    compartment.setContainer(null);
	  }
	 
	  @Override
	  public void undo() {
	    reattachLinks();
	    compartment.setContainer(parent);
	  }
	 
	  public void setCompartment(Compartment type) {
	    this.compartment = type;
	    this.parent = type.getContainer();
	  }
	
	  /**
	   * Detach all relations from the node and from  other
	   * connecting typse, storing the connection information in local
	   * data structures.
	   */
	  private void detachLinks() {
	    relations = new ArrayList<Relation>();
	    sourceLinks = new HashMap<Relation,Node>();
	    targetLinks = new HashMap<Relation,Node>();
	    relations.addAll(compartment.getIncomingLinks());
	    relations.addAll(compartment.getOutgoingLinks());
	    for (Relation link : relations) {
	      sourceLinks.put(link, link.getSource());
	      targetLinks.put(link, link.getTarget());
	      link.setSource(null);
	      link.setTarget(null);
	      link.setRelationContainer(null);
	    }
	  }
	  
	  /**
	   * Reattach all relations to their source and target things.
	   */
	  private void reattachLinks() {
	    for (Relation link : relations) {
	      link.setSource(sourceLinks.get(link));
	      link.setTarget(targetLinks.get(link));
	      link.setRelationContainer(parent);
	    }
	  }
}
