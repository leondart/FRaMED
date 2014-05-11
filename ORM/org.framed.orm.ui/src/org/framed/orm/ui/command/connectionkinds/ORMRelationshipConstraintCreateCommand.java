package org.framed.orm.ui.command.connectionkinds;



import org.eclipse.draw2d.geometry.Point;
import org.framed.orm.model.Relation;
import org.framed.orm.model.Relationship;
import org.framed.orm.model.RelationshipConstraint;

public class ORMRelationshipConstraintCreateCommand extends ORMRelationCreateCommand {


  private RelationshipConstraint relationCons;
  private Relationship rlship;

  @Override
  public boolean canExecute() {
    return target != null && source != null && relationCons != null && relcon != null && rlship != null;
  }

  @Override
  public void execute() {
    relationCons.setSource(source);
    relationCons.setTarget(target);
    relationCons.setRelationContainer(relcon);
    relationCons.setRelation(rlship);
    
    if (rlship.getRlshipConstraints().size() != 0) {
      relationCons.getDim1BP().addAll(rlship.getRlshipConstraints().get(0).getDim1BP());
      relationCons.getDim2BP().addAll(rlship.getRlshipConstraints().get(0).getDim2BP());
    }
    
    if (relationCons.getDim1BP().isEmpty()) {
      Point ps = new Point(source.getConstraints().x(), source.getConstraints().y());
      Point pt = new Point(target.getConstraints().x(), target.getConstraints().y());
      adaptRelationCreation(ps, pt);
    }
    
  }

  @Override
  public void undo() {
    relationCons.getSource().getOutgoingLinks().remove(relationCons);
    relationCons.setSource(null);
    relationCons.getTarget().getIncomingLinks().remove(relationCons);
    relationCons.setTarget(null);
    relationCons.setRelationContainer(null);
    relationCons.setRelation(null);
    relationCons.getDim1BP().clear();
    relationCons.getDim2BP().clear();
  }

  @Override
  public void setRelation(final Relation relation) {
    this.relationCons = (RelationshipConstraint) relation;
    this.relation = relation;
  }

  public void setRelationship(Relationship rlship) {
    this.rlship = rlship;
  }


  

}
