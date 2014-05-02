package org.framed.orm.ui.command.connectionkinds;


import org.eclipse.gef.commands.Command;
import org.framed.orm.model.Node;
import org.framed.orm.model.RelationContainer;
import org.framed.orm.model.Relationship;
import org.framed.orm.model.RelationshipConstraint;

public class ORMRelationshipConstraintCreateCommand extends Command {

  private Node target;
  private Node source;
  private RelationshipConstraint relation;
  private RelationContainer rc;
  private Relationship rlship;

  @Override
  public boolean canExecute() {
    return target != null && source != null && relation != null && rc != null && rlship != null;
  }

  @Override
  public void execute() {
    relation.setSource(source);
    relation.setTarget(target);
    relation.setRelationContainer(rc);
    relation.setRelation(rlship);
  }

  @Override
  public void undo() {
    relation.getSource().getOutgoingLinks().remove(relation);
    relation.setSource(null);
    relation.getTarget().getIncomingLinks().remove(relation);
    relation.setTarget(null);
    relation.setRelationContainer(null);
    relation.setRelation(null);
  }

  public void setSourceNode(Node source) {
    this.source = source;
  }

  public void setTargetNode(Node target) {
    this.target = target;
  }

  public void setRelationshipConstraint(RelationshipConstraint relation) {
    this.relation = relation;
  }

  public void setRelationship(Relationship rlship) {
    this.rlship = rlship;
  }

  public void setRelationContainer(RelationContainer rm) {
    this.rc = rm;
  }

}
