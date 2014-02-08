package orm.command.types;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.gef.commands.Command;

import orm.model.CompartmentDiagram;
import orm.model.NaturalType;
import orm.model.Node;
import orm.model.Relation;
import orm.model.Rolemodel;

/**
 * @author Kay Bierzynski
 * */
public class ORMNaturalTypeDeleteCommand extends Command {
	
	  private NaturalType type;
	  private Rolemodel parentrolemodel;
	  private CompartmentDiagram cd;
	  /** relations */
	  private List<Relation> relations;
	  /** Sources for the realtions that start or end at this node. */
	  private Map<Relation, Node> sourceLinks;
	  /** Targets for the relations that start or end at this node. */
	  private Map<Relation, Node> targetLinks;
	  
	  @Override
	  public void execute() {
		detachLinks();
	    type.setParentRolemodel(null);
	    type.setCd(null);
	  }
	 
	  @Override
	  public void undo() {
		reattachLinks();  
	    if(parentrolemodel!=null) type.setParentRolemodel(parentrolemodel);
	    if(cd!=null) type.setCd(cd);
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
	      link.setRelationContainer(parentrolemodel);
	    }
	  }
	  
	  public void setType(NaturalType type) {
	    this.type = type;
	    this.parentrolemodel = type.getParentRolemodel();
	    this.cd = type.getCd();
	  }
	
}
