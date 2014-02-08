package orm.command;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.gef.commands.Command;

import orm.model.Node;
import orm.model.Relation;
import orm.model.RoleGroup;
import orm.model.Rolemodel;

/**
 * @author Kay Bierzynski
 * */
public class ORMRoleGroupDeleteCommand extends Command {
	
	
	 private RoleGroup roleGroup,parentRoleGroup;
	 private Rolemodel parentrolemodel;
	 
	  private List<Relation> relations;
	  /** Sources for the relations that start or end at this node. */
	  private Map<Relation, Node> sourceLinks;
	  /** Targets for the relations that start or end at this node. */
	  private Map<Relation, Node> targetLinks;
	 
	  @Override
	  public void execute() {
		detachLinks();
	    roleGroup.setParentRolemodel(null);
	    roleGroup.setParentRoleGroup(null);
	  }
	 
	  @Override
	  public void undo() {
		reattachLinks();
		if(parentrolemodel != null)  roleGroup.setParentRolemodel(parentrolemodel);
		if(parentRoleGroup != null)  roleGroup.setParentRoleGroup(parentRoleGroup);
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
	  
	  /**
	   * Reattach all links to their source and target node.
	   */
	  private void reattachLinks() {
	    for (Relation link : relations) {
	      link.setSource(sourceLinks.get(link));
	      link.setTarget(targetLinks.get(link));
	     if(parentrolemodel != null) link.setRelationContainer(parentrolemodel);
	    }
	  }
	  
	  public void setRoleGroup(RoleGroup roleGroup) {
	    this.roleGroup = roleGroup;
	    this.parentrolemodel = roleGroup.getParentRolemodel();
	    this.parentRoleGroup = roleGroup.getParentRoleGroup();
	  }
}
