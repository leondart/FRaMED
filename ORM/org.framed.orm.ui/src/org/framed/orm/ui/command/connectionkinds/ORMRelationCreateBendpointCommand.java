package org.framed.orm.ui.command.connectionkinds;

import java.util.ArrayList;

import org.eclipse.draw2d.Bendpoint;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.gef.commands.Command;
import org.framed.orm.model.Relation;
import org.framed.orm.model.Relationship;
import org.framed.orm.model.RelationshipConstraint;

/**
 * With this command a {@link Bendpoint} for {@link Relation} can be created.
 * 
 * @author Kay Bierzynski
 * */
public class ORMRelationCreateBendpointCommand extends Command {

  /** Index on which the new {@link Bendpoint} coordinates are added. */
  private int index;
  /** The {@link Dimension}s, which are describing the relative position of the {@link Bendpoint}. */
  private Dimension dim1, dim2;
  /** {@link Relation} to which the {@link Bendpoint} is added. */
  private Relation relation;
  /**
   * A list, which contains all {@link RelationshipConstraint}s from one {@link Relationship}. This
   * list is needed for the case the user wants to undone the adding(remove) of a {@link Bendpoint}
   * to a {@link RelationshipConstraint} in such case {@link Bendpoint}s with the same coordiantes
   * as the initial {@link Bendpoint} must be removed from all {@link RelationshipConstraint}s of
   * the same {@link Relationship} as the {@link RelationshipConstraint}, which the user has
   * selected. The reason for that is that only one line of the {@link RelationshipConstraint}s is
   * visible to the user and when the user deletes the {@link RelationshipConstraint}, whose line is
   * visible, than the line of the next {@link RelationshipConstraint} must become visible at the
   * same place with the same {@link Bendpoint}s as the line of the deleted
   * {@link RelationshipConstraint}.
   */
  private ArrayList<RelationshipConstraint> relCList = new ArrayList<RelationshipConstraint>();

  /**
   * Constructor of this command, where the label is set, which describes this command to the user.
   * 
   */
  public ORMRelationCreateBendpointCommand() {
    super.setLabel("ORMRelationCreateBendpoint");
  }

  /**
   * {@inheritDoc} In this method the {@link Bendpoint} is added to the selected {@link Relation}.
   * Is the {@link Relation} a {@link RelationshipConstraint} than {@link Bendpoint}s with same
   * coordinates as the initial {@link Bendpoint} must be added to all
   * {@link RelationshipConstraint}s of the same {@link Relationship} as the
   * {@link RelationshipConstraint}, which the user has selected. The reason for that is that only
   * one line of the {@link RelationshipConstraint}s is visible to the user and when the user
   * deletes the {@link RelationshipConstraint}, whose line is visible, than the line of the next
   * {@link RelationshipConstraint} must become visible at the same place with the same
   * {@link Bendpoint}s as the line of the deleted {@link RelationshipConstraint}.
   */
  @Override
  public void execute() {
    Point source = new Point(dim1.width, dim1.height);
    Point target = new Point(dim2.width, dim2.height);
    relation.getDim1BP().add(index, source);
    relation.getDim2BP().add(index, target);

    if (relation instanceof RelationshipConstraint) {

      relCList.addAll(((RelationshipConstraint) relation).getRelation().getRlshipConstraints());
      relCList.remove(relation);

      for (RelationshipConstraint relC : relCList) {
        if (!relC.equals(relation)) {
          relC.getDim1BP().add(index, source);
          relC.getDim2BP().add(index, target);
        }
      }
    }

  }

  /**
   * {@inheritDoc} This command is undone through removing the {@link Bendpoint} from the selected
   * {@link Relation}. Is the {@link Relation} a {@link RelationshipConstraint} than
   * {@link Bendpoint}s with same coordinates as the initial {@link Bendpoint} must be removed from
   * all {@link RelationshipConstraint}s of the same {@link Relationship} as the
   * {@link RelationshipConstraint}, which the user has selected. The reason for that is that only
   * one line of the {@link RelationshipConstraint}s is visible to the user and when the user
   * deletes the {@link RelationshipConstraint}, whose line is visible, than the line of the next
   * {@link RelationshipConstraint} must become visible at the same place with the same
   * {@link Bendpoint}s as the line of the deleted {@link RelationshipConstraint}.
   * */
  @Override
  public void undo() {
    relation.getDim1BP().remove(index);
    relation.getDim2BP().remove(index);
    if (relation instanceof RelationshipConstraint) {

      for (RelationshipConstraint relC : relCList) {
        if (!relC.equals(relation)) {
          relC.getDim1BP().remove(index);
          relC.getDim2BP().remove(index);
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
    this.dim1 = dim1;
    this.dim2 = dim2;
  }
}
