package org.framed.orm.ui.command.types;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.gef.commands.Command;

import org.framed.orm.model.CompartmentDiagram;
import org.framed.orm.model.Compartment;
import org.framed.orm.model.Node;
import org.framed.orm.model.Relation;
import org.framed.orm.model.Rolemodel;

/**
 * @author Kay Bierzynski
 * */
public class ORMCompartmentDeleteCommand extends Command {
	
	  private Compartment compartment;
	  private CompartmentDiagram cd;
	  private Rolemodel parentrolemodel;
	  
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
	    compartment.setCd(null);
	    compartment.setParentRolemodel(null);
	  }
	 
	  @Override
	  public void undo() {
	    reattachLinks();
	  if(cd != null)  compartment.setCd(cd);
	  if(parentrolemodel !=null)   compartment.setParentRolemodel(parentrolemodel);
	  }
	 
	  public void setCompartment(Compartment type) {
	    this.compartment = type;
	    this.cd = type.getCompartmentDiagram();
	    this.parentrolemodel = type.getParentRolemodel();
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
	      if(parentrolemodel != null) link.setRelationContainer(parentrolemodel);
	      if(cd != null) link.setRelationContainer(cd);
	    }
	  }
}
