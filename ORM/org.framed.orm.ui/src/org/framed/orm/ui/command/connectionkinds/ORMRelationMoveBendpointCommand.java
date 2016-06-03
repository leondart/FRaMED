package org.framed.orm.ui.command.connectionkinds;

import java.util.ArrayList;

import org.eclipse.draw2d.Bendpoint;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.gef.commands.Command;
import org.framed.orm.geometry.GeometryFactory;
import org.framed.orm.geometry.Point;
import org.framed.orm.geometry.RelativePoint;
import org.framed.orm.model.Relation;
import org.framed.orm.model.Type;


/**
 * Through this command a {@link Bendpoint} can be moved frome an old position to a new one.
 * 
 * @author Kay Bierzynski
 */
public class ORMRelationMoveBendpointCommand extends Command {

  /** Index on which the {@link Bendpoint}s new coordinates are added. */
  private int index;
  /** {@link Relation} which owns the {@link Bendpoint}, which is to be moved. */
  private Relation relation;
  /**
   * The {@link RelativePoint}s, which describes the old relative position/coordinates of the
   * {@link Bendpoint}.
   */
  private RelativePoint oldRelP;
  /**
   * The {@link Dimension}s, which are describing the new distances of the {@link Bendpoint} to the
   * source and target.
   */
  private Dimension newDimsource, newDimtarget;
  /**
   * A list, which contains all {@link Relation}s from type cyclic, total, acyclic, reflexive and
   * irreflexive(aka relationshipCOnstraints) from one {@link Relation} of the type relationship.
   * This list is needed for the case the user wants to undo the moving of a {@link Bendpoint} from
   * a relationshipConstraint. In such a case {@link Bendpoint}s with the same coordiantes as the
   * initial {@link Bendpoint} from all relationshipConstraints of the same relationship as the
   * relationshipConstraint, which the user has selected, must be moved as well. The reason for that
   * is that only one line of the relationshipConstraints is visible to the user and when the user
   * deletes the relationshipConstraint, whose line is visible, than the line of the next
   * relationshipConstraint must become visible at the same place with the same {@link Bendpoint}s
   * as the line of the deleted relationshipConstraint.
   */
  private ArrayList<Relation> relCList = new ArrayList<Relation>();

  /**
   * Constructor of this command, where the label is set, which describes this command to the user.
   * 
   */
  public ORMRelationMoveBendpointCommand() {
    super.setLabel("ORMRelationMoveBendpoint");
  }

  /**
   * {@inheritDoc} In this method the {@link Bendpoint} from the selected {@link Relation} is moved
   * to a new position and the old position is stored in case that user wants to undo the command.
   * After that in case the {@link Relation} is from type cyclic, total, acyclic, reflexive or
   * irrflexive(aka relationshipConstraint) than {@link Bendpoint}s with same coordinates as the
   * initial {@link Bendpoint} from all relationshipConstraints of the same {@link Relationship} as
   * the relationshipConstraint, which the user has selected, must be moved to new coordinates as
   * well. The reason for that is that only one line of the relationshipConstraints is visible to
   * the user and when the user deletes the relationshipConstraint, whose line is visible, than the
   * line of the next relationshipConstraint must become visible at the same place with the same
   * {@link Bendpoint}s as the line of the deleted relationshipConstraint.
   */
  public void execute() {
    if (oldRelP == null) {
      oldRelP = relation.getBendpoints().get(index);
    }

    Point source = GeometryFactory.eINSTANCE.createPoint();
    source.setX(newDimsource.width);
    source.setY(newDimsource.height);

    Point target = GeometryFactory.eINSTANCE.createPoint();
    target.setX(newDimtarget.width);
    target.setY(newDimtarget.height);

    RelativePoint relP = GeometryFactory.eINSTANCE.createRelativePoint();
    relP.getReferencePoints().addAll(oldRelP.getReferencePoints());
    relP.getDistances().add(source);
    relP.getDistances().add(target);

    relation.getBendpoints().set(index, relP);

    if (relation.getType().equals(Type.TOTAL) || relation.getType().equals(Type.CYCLIC)
        || relation.getType().equals(Type.IRREFLEXIVE) || relation.getType().equals(Type.ACYCLIC)
        || relation.getType().equals(Type.REFLEXIVE)) {

      relCList.addAll(relation.getReferencedRelation().get(0).getReferencedRelation());
      relCList.remove(relation);

      for (Relation relC : relCList) {
        // RelativePoints cannot be shared between rleations so we must create a relativepoint with
        // same data
        RelativePoint newRelP = GeometryFactory.eINSTANCE.createRelativePoint();

        org.framed.orm.geometry.Point sourceDis = GeometryFactory.eINSTANCE.createPoint();
        sourceDis.setX(relP.getDistances().get(0).getX());
        sourceDis.setY(relP.getDistances().get(0).getY());
        newRelP.getDistances().add(sourceDis);

        org.framed.orm.geometry.Point targetDis = GeometryFactory.eINSTANCE.createPoint();
        targetDis.setX(relP.getDistances().get(1).getX());
        targetDis.setY(relP.getDistances().get(1).getY());
        newRelP.getDistances().add(targetDis);

        org.framed.orm.geometry.Point sourceRef = GeometryFactory.eINSTANCE.createPoint();
        sourceRef.setX(relP.getReferencePoints().get(0).getX());
        sourceRef.setY(relP.getReferencePoints().get(0).getY());
        newRelP.getReferencePoints().add(sourceRef);

        org.framed.orm.geometry.Point targetRef = GeometryFactory.eINSTANCE.createPoint();
        targetRef.setX(relP.getReferencePoints().get(1).getX());
        targetRef.setY(relP.getReferencePoints().get(1).getY());
        newRelP.getReferencePoints().add(targetRef);

        relC.getBendpoints().set(index, newRelP);
      }
    }

  }

  /**
   * {@inheritDoc} This command is undone through moving the {@link Bendpoint} to the old position.
   * Is the {@link Relation} from type cyclic, total, acyclic, reflexive or irrfelxive(aka
   * relationshipConstraint) than after the moving of the initial {@link Bendpoint} all
   * {@link Bendpoint}s with same coordinates as the initial {@link Bendpoint} from all
   * relationshipConstraints of the same {@link Relation} from type relationship as the
   * relationshipConstraint, which the user has selected, must be moved back to the old position as
   * well. The reason for that is that only one line of the relationshipConstraints is visible to
   * the user and when the user deletes the relationshipConstraint, whose line is visible, than the
   * line of the next relationshipConstraint must become visible at the same place with the same
   * {@link Bendpoint}s as the line of the deleted relationshipConstraint.
   * */
  @Override
  public void undo() {
    relation.getBendpoints().set(index, oldRelP);

    if (relation.getType().equals(Type.TOTAL) || relation.getType().equals(Type.CYCLIC)
        || relation.getType().equals(Type.IRREFLEXIVE) || relation.getType().equals(Type.ACYCLIC)
        || relation.getType().equals(Type.REFLEXIVE)) {
      for (Relation relC : relCList) {
        if (!relC.equals(relation)) {
          relC.getBendpoints().set(index, oldRelP);
        }
      }
    }

  }

  /**
   * Setter for the index on which the new coordiantes(position) {@link Bendpoint} should be added .
   * 
   * @param index integer
   */
  public void setIndex(final int index) {
    this.index = index;
  }

  /**
   * Setter for the {@link Relation} from which owns the {@link Bendpoint} which is to be moved to a
   * new position.
   * 
   * @param relation org.framed.orm.model.Relation
   */
  public void setRelation(final Relation relation) {
    this.relation = relation;
  }

  /**
   * Setter for the {@link Dimension}s, which are describing the new distances of the
   * {@link Bendpoint} to target and source.
   * 
   * */
  public void setNewDimension(final Dimension dim1, final Dimension dim2) {
    this.newDimsource = dim1;
    this.newDimtarget = dim2;
  }
}
