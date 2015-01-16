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
 * With this command a {@link Bendpoint} for {@link Relation} can be created.
 * 
 * @author Kay Bierzynski
 * */
public class ORMRelationCreateBendpointCommand extends Command {

  /**
   * Index on which the new {@link Bendpoint} is added. The index is needed for the case when the
   * user wants to undo this command
   */
  private int index;
  /**
   * The {@link Point}s, which are the the refrence to the target and source of the {@link Relation}
   * to which the {@link Bendpoint is added}
   */
  private Point sourceRefence, targetRefence;
  /**
   * The {@link Dimension}s, which are describing the distances of the {@link Bendpoint} to the
   * target and the source.
   */
  private Dimension dimsource, dimtarget;
  /** {@link Relation} to which the {@link Bendpoint} is added. */
  private Relation relation;
  /**
   * A list, which contains all {@link Relation}s from type cyclic, total and irreflexive(aka
   * RelationshipConstraint) from one {@link Relation} from type relationship. This list is needed
   * for the case the user wants to undone the adding(remove) of a {@link Bendpoint} to a
   * relationshipConstraint in such case {@link Bendpoint}s with the same coordiantes as the initial
   * {@link Bendpoint} must be removed from all relationshipConstraints of the same relationship as
   * the relationshipConstraint, which the user has selected. The reason for that is that only one
   * line of the relationshipConstraints is visible to the user and when the user deletes the
   * relationshipConstraint, whose line is visible, than the line of the next relationshipConstraint
   * must become visible at the same place with the same {@link Bendpoint}s as the line of the
   * deleted relationshipConstraint.
   */
  private ArrayList<Relation> relCList = new ArrayList<Relation>();

  /**
   * Constructor of this command, where the label is set, which describes this command to the user.
   * 
   */
  public ORMRelationCreateBendpointCommand() {
    super.setLabel("ORMRelationCreateBendpoint");
  }

  /**
   * {@inheritDoc} In this method the {@link Bendpoint} is added to the selected {@link Relation}.
   * Is the {@link Relation} from type cyclic, total and irrflexvie(aka RelationshipConstraint) than
   * {@link Bendpoint}s with same coordinates as the initial {@link Bendpoint} must be added to all
   * relationshipConstraints of the same {@link Relation} from type relationship as the
   * relationshipConstraint, which the user has selected. The reason for that is that only one line
   * of the relationshipConstraints is visible to the user and when the user deletes the
   * relationshipConstraint, whose line is visible, than the line of the next relationshipConstraint
   * must become visible at the same place with the same {@link Bendpoint}s as the line of the
   * deleted relationshipConstraint.
   */
  @Override
  public void execute() {
    Point source = GeometryFactory.eINSTANCE.createPoint();
    source.setX(dimsource.width);
    source.setY(dimsource.height);

    Point target = GeometryFactory.eINSTANCE.createPoint();
    target.setX(dimtarget.width);
    target.setY(dimtarget.height);

    RelativePoint relP = GeometryFactory.eINSTANCE.createRelativePoint();
    relP.getReferencePoints().add(sourceRefence);
    relP.getReferencePoints().add(targetRefence);
    relP.getDistances().add(source);
    relP.getDistances().add(target);

    relation.getBendpoints().add(index, relP);

    if (relation.getType().equals(Type.TOTAL) || relation.getType().equals(Type.CYCLIC)
        || relation.getType().equals(Type.IRREFLEXIVE)) {

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
        relC.getBendpoints().add(index, newRelP);
      }
    }

  }

  /**
   * {@inheritDoc} This command is undone through removing the {@link Bendpoint} from the selected
   * {@link Relation}. Is the {@link Relation} from type cyclic, total and irreflexive(aka
   * relationConstraint) than {@link Bendpoint}s with same coordinates as the initial
   * {@link Bendpoint} must be removed from all relationshipConstraints of the same {@link Relation}
   * from type relationship as the relationshipConstraint, which the user has selected. The reason
   * for that is that only one line of the relationshipConstraints is visible to the user and when
   * the user deletes the relationshipConstraint, whose line is visible, than the line of the next
   * telationshipConstraint must become visible at the same place with the same {@link Bendpoint}s
   * as the line of the deleted relationshipConstraint.
   * */
  @Override
  public void undo() {
    relation.getBendpoints().remove(index);

    if (relation.getType().equals(Type.TOTAL) || relation.getType().equals(Type.CYCLIC)
        || relation.getType().equals(Type.IRREFLEXIVE)) {

      for (Relation relC : relCList) {
        if (!relC.equals(relation)) {
          relC.getBendpoints().remove(index);
        }
      }

    }
  }

  /**
   * Setter for the index on which the {@link Bendpoint} should be added to the {@link Relation}.
   * 
   * @param index integer
   */
  public void setIndex(final int index) {
    // TODO: add validation checks
    this.index = index;
  }

  /**
   * Setter for the {@link Relation} to which the {@link Bendpoint} should be added.
   * 
   * @param relation org.framed.orm.model.Relation
   */
  public void setRelation(final Relation relation) {
    this.relation = relation;
  }

  /**
   * Setter for the {@link Dimension}s, which are describing the relative position of the
   * {@link Bendpoint}.
   * 
   * @param relation org.eclipse.draw2d.geometry.Dimension
   */
  public void setDimension(final Dimension dim1, final Dimension dim2) {
    this.dimsource = dim1;
    this.dimtarget = dim2;
  }

  /**
   * Setter for the {@link Point}, which is the refence to the source of the {@link Relation} to
   * which the Bendpoint is added.
   * 
   * @param sourceRefence org.framed.orm.geometry.Point
   */
  public void setSourceRefence(final Point sourceRefence) {
    this.sourceRefence = sourceRefence;
  }

  /**
   * Setter for the {@link Point}, which is the refence to the target of the {@link Relation} to
   * which the Bendpoint is added.
   * 
   * @param targetRefence org.framed.orm.geometry.Point
   */
  public void setTargetRefence(final Point targetRefence) {
    this.targetRefence = targetRefence;
  }


}
