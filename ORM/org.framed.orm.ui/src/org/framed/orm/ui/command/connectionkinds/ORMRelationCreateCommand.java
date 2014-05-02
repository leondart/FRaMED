package org.framed.orm.ui.command.connectionkinds;

import org.eclipse.draw2d.geometry.Point;
import org.eclipse.gef.commands.Command;
import org.framed.orm.model.Relation;
import org.framed.orm.model.Node;
import org.framed.orm.model.RelationContainer;

/**
 * @author Kay Bierzynski
 * */
public class ORMRelationCreateCommand extends Command {
	
	  private Node target;
	  private Node source;
	  private Relation relation;
	  private RelationContainer rc;

	  public ORMRelationCreateCommand(){
	    super.setLabel("ORMRelationCreate");
	  }
	  
	  @Override
	  public boolean canExecute() {
	    return target != null && source != null && relation != null && rc!=null;
	  }
	   
	  @Override public void execute() {
	    relation.setSource(source);
	    relation.setTarget(target);
	    relation.setRelationContainer(rc);
	    
	    // for self-loop
	    if(source.equals(target)){
	      insertSelfLoopBPs();
	    }
	    
	  }
	 
	  @Override public void undo() {
	    relation.getSource().getOutgoingLinks().remove(relation);
	    relation.setSource(null);
	    relation.getTarget().getIncomingLinks().remove(relation);
	    relation.setTarget(null);
	    relation.setRelationContainer(null);
	  }
	  
	  public void insertSelfLoopBPs(){
	    int w = source.getConstraints().width;
        int h = source.getConstraints().height;
        relation.getDim1BP().add(new Point(0,h/2+30));
        relation.getDim1BP().add(new Point(w/2+30,h/2+30));
        relation.getDim1BP().add(new Point(w/2+30,0));
        relation.getDim2BP().add(new Point(0,h/2+30));
        relation.getDim2BP().add(new Point(w/2+30,h/2+30));
        relation.getDim2BP().add(new Point(w/2+30,0));
	  }
	 
	  public void setSourceNode(Node source) {
	    this.source = source;
	  }
	   
	  public void setTargetNode(Node target) {
	    this.target = target;
	  }
	   
	  public void setRelation(Relation relation) {
	    this.relation = relation;
	  }
	   
	  public void setRelationContainer(RelationContainer rm) {
		    this.rc = rm;
	  }
}
