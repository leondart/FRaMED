package org.framed.orm.ui.command.connectionkinds;

import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
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
   * The {@link Relation} from type cyclic, irrfelxive or total to be created. The basis class of
   * the {@link Relation} is given by a factory.
   */
  private Relation relationCons;
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
    return target != null && source != null && relationCons != null && parent != null
        && relationship != null;
  }

  /**
   * In this method the relationshipConstrain(cyclic,total,irrflexive) is created/ invoked into the
   * model tree through setting it's parameter. After that when a relationshipConstrain
   * already exist beside the relationshipConstrain to be invoked all {@link Bendpoint}s
   * from this relationshipConstrain are added to the created relationshipConstrain
   * as well. When more as one {@link Relation} exists between the target and the source of the
   * relationshipConstrain than a {@link Bendpoint} is added to the created
   * relationshipConstrain to make the relationshipConstrain better visibile/
   * acessesible to the user.
   * 
   */
  @Override
  public void execute() {
    relationCons.setSource(source);
    relationCons.setTarget(target);
    relationCons.setContainer(parent);
    relationCons.getReferencedRelation().add(relationship);
    relationship.getReferencedRelation().add(relationCons);
    
    int relationCount = getRelationCount();
    if (relationship.getReferencedRelation().size() > 1) {
      relationCons.getBendpoints().addAll(relationship.getReferencedRelation().get(0).getBendpoints());
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
   * This command is undone through removing the created relationshipConstrain from the
   * source, the {@link Model}, the {@link Relation} from type relationship and the target and through deleting all
   * the {@link Bendpoint}s of the relationshipConstrain.
   * 
   */
  @Override
  public void undo() {
    relationCons.getSource().getOutgoingRelations().remove(relationCons);
    relationCons.setSource(null);
    relationCons.getTarget().getIncomingRelations().remove(relationCons);
    relationCons.setTarget(null);
    relationCons.setContainer(null);
    relationCons.getReferencedRelation().clear();
    relationCons.getBendpoints().clear();
    relationship.getReferencedRelation().remove(relationCons);
  }

  /**
   * Setter for the {@link Relation} from type total, cyclic or total , which is created/invoked in this command.
   * 
   * @param relation org.framed.orm.model.Relation
   * */
  @Override
  public void setRelation(final Relation relation) {
    this.relationCons = relation;
  }

  /**
   * Setter for the {@link Relation} from type realtionship to which the relationshipConstrain is added.
   * 
   * @param rlship org.framed.orm.model.Relation
   * */
  public void setRelationship(final Relation rlship) {
    this.relationship = rlship;
  }



}
