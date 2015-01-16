package org.framed.orm.ui.command.connectionkinds;

import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.framed.orm.geometry.GeometryFactory;
import org.framed.orm.geometry.RelativePoint;
import org.framed.orm.model.Model;
import org.framed.orm.model.Relation;

/**
 * Through this command {@link Relation}s from type cyclic, total and irreflexive can be
 * created(invoked into the model tree).
 * 
 * @author Kay Bierzynski
 * */
public class ORMRelationshipConstraintCreateCommand extends ORMRelationCreateCommand {

  /**
   * The {@link Relation} from type relationship to which the
   * relationshipConstraint(cyclic,total,irrflexive) belongs to.
   */
  private Relation relationship;

  /**
   * This method tests if the conditions for executing this command are fulfilled,
   * 
   * @return true if the parameter target, source, relationCons, arent and relationship are set.
   */
  @Override
  public boolean canExecute() {
    return target != null && source != null && relation != null && parent != null
        && relationship != null;
  }

  /**
   * In this method the relationshipConstrain(cyclic,total,irreflexive) is created/ invoked into the
   * model tree through setting it's parameter. After that when a relationshipConstrain already
   * exist beside the relationshipConstrain to be invoked all {@link Bendpoint}s from this
   * relationshipConstrain are added to the created relationshipConstrain as well. When more as one
   * {@link Relation} exists between the target and the source of the relationshipConstrain than a
   * {@link Bendpoint} is added to the created relationshipConstrain to make the
   * relationshipConstrain better visible/ acessesible to the user.
   * 
   */
  @Override
  public void execute() {
    relation.setSource(source);
    relation.setTarget(target);
    relation.setContainer(parent);
    relation.getReferencedRelation().add(relationship);
    relationship.getReferencedRelation().add(relation);

    int relationCount = getRelationCount();
    if (relationship.getReferencedRelation().size() > 1) {
      Relation rel = relationship.getReferencedRelation().get(0);
      // RelativePoints cannot be shared between rleations so we must create a relativepoint with
      // same data
      for (RelativePoint relP : rel.getBendpoints()) {
        RelativePoint newRelP = GeometryFactory.eINSTANCE.createRelativePoint();
        
        org.framed.orm.geometry.Point sourceDis =  GeometryFactory.eINSTANCE.createPoint();
        sourceDis.setX(relP.getDistances().get(0).getX());
        sourceDis.setY(relP.getDistances().get(0).getY());
        newRelP.getDistances().add(sourceDis);
        
        org.framed.orm.geometry.Point targetDis =  GeometryFactory.eINSTANCE.createPoint();
        targetDis.setX(relP.getDistances().get(1).getX());
        targetDis.setY(relP.getDistances().get(1).getY());
        newRelP.getDistances().add(targetDis);
        
        org.framed.orm.geometry.Point sourceRef =  GeometryFactory.eINSTANCE.createPoint();
        sourceRef.setX(relP.getReferencePoints().get(0).getX());
        sourceRef.setY(relP.getReferencePoints().get(0).getY());
        newRelP.getReferencePoints().add(sourceRef);
        
        org.framed.orm.geometry.Point targetRef =  GeometryFactory.eINSTANCE.createPoint();
        targetRef.setX(relP.getReferencePoints().get(1).getX());
        targetRef.setY(relP.getReferencePoints().get(1).getY());
        newRelP.getReferencePoints().add(targetRef);
        
        relation.getBendpoints().add(newRelP);
      }
    }
    if (relationCount > 1 && relationship.getReferencedRelation().size() <= 1) {
      Rectangle sourcerec = createRectabgleFromFromBoundarieData(source);
      Rectangle targetrec = createRectabgleFromFromBoundarieData(target);
      Point ps = calculateCorrectPoint(sourcerec, targetrec.getLocation());
      Point pt = calculateCorrectPoint(targetrec, sourcerec.getLocation());
      adaptRelationCreation(ps, pt, relationCount);
    }

  }

  /**
   * This command is undone through removing the created relationshipConstrain from the source, the
   * {@link Model}, the {@link Relation} from type relationship and the target and through deleting
   * all the {@link Bendpoint}s of the relationshipConstrain.
   * 
   */
  @Override
  public void undo() {
    relation.getSource().getOutgoingRelations().remove(relation);
    relation.setSource(null);
    relation.getTarget().getIncomingRelations().remove(relation);
    relation.setTarget(null);
    relation.setContainer(null);
    relation.getReferencedRelation().clear();
    relation.getBendpoints().clear();
    relationship.getReferencedRelation().remove(relation);
  }

  /**
   * Setter for the {@link Relation} from type realtionship to which the relationshipConstrain is
   * added.
   * 
   * @param rlship org.framed.orm.model.Relation
   * */
  public void setRelationship(final Relation rlship) {
    this.relationship = rlship;
  }



}
