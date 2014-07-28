package org.framed.orm.ui.command.connectionkinds;

import org.eclipse.draw2d.geometry.Point;
import org.framed.orm.model.Container;
import org.framed.orm.model.Relation;
import org.framed.orm.model.Relationship;
import org.framed.orm.model.RelationshipConstraint;

/**
 * Through this command {@link RelationshipConstraint}s can be created(invoked into the model tree).
 * 
 * @author Kay Bierzynski
 * */
public class ORMRelationshipConstraintCreateCommand extends ORMRelationCreateCommand {

  /**
   * The {@link RelationshipConstraint} to be created. The basis class of the
   * {@link RelationshipConstraint} is given by a factory.
   */
  private RelationshipConstraint relationCons;
  /** The {@link Relationship} to which the {@link RelationshipConstraint} belongs to. */
  private Relationship relationship;

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
   * {@inheritDoc} In this method the {@link RelationshipConstrain} is created/ invoked into the
   * model tree through setting it's parameter. After that when a {@link RelationshipConstrain}
   * already exist beside the {@link RelationshipConstrain} to be invoked all {@link Bendpoint}s
   * from this {@link RelationshipConstrain} are added to the created {@link RelationshipConstrain}
   * as well. When more as one {@link Relation} exists between the target and the source of the
   * {@link RelationshipConstrain} than a {@link Bendpoint} is added to the created
   * {@link RelationshipConstrain} to make the {@link RelationshipConstrain} better visibile/
   * acessesible to the user.
   * 
   */
  @Override
  public void execute() {
    relationCons.setSource(source);
    relationCons.setTarget(target);
    relationCons.setRelationContainer(parent);
    relationCons.setRelation(relationship);

    int relationCount = getRelationCount();
    if (relationship.getRlshipConstraints().size() > 1) {
      relationCons.getDim1BP().addAll(relationship.getRlshipConstraints().get(0).getDim1BP());
      relationCons.getDim2BP().addAll(relationship.getRlshipConstraints().get(0).getDim2BP());
    }
    if (relationCount > 1 && relationship.getRlshipConstraints().size() <= 1) {
      Point ps = new Point(source.getConstraints().x(), source.getConstraints().y());
      Point pt = new Point(target.getConstraints().x(), target.getConstraints().y());
      adaptRelationCreation(ps, pt, relationCount);
    }

  }

  /**
   * {@inheritDoc} This command is undone through removing the created {@link RelationshipConstrain}
   * from the source, the {@link Container}, the {@link Relationship} and the target and through
   * deleting all the {@link Bendpoint}s of the {@link RelationshipConstrain}.
   * 
   */
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

  /**
   * Setter for the {@link RelationshipConstrain}, which is created/invoked in this command.
   * 
   * @param relation org.framed.orm.model.Relation
   * */
  @Override
  public void setRelation(final Relation relation) {
    this.relationCons = (RelationshipConstraint) relation;
  }

  /**
   * Setter for the {@link Relationship} to which the {@link RelationshipConstrain} is added.
   * 
   * @param rlship org.framed.orm.model.Relationship
   * */
  public void setRelationship(final Relationship rlship) {
    this.relationship = rlship;
  }



}
