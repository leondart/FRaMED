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
   * The {@link Dimension}s, which are describing the old relative position/coordinates of the
   * {@link Bendpoint}.
   */
  private Point oldDim1, oldDim2;
  /**
   * The {@link Dimension}s, which are describing the new relative position/coordinates of the
   * {@link Bendpoint}.
   */
  private Dimension newDim1, newDim2;
  /**
   * A list, which contains all {@link RelationshipConstraint}s from one {@link Relationship}. This
   * list is needed for the case the user wants to undone the moving of a {@link Bendpoint} from a
   * {@link RelationshipConstraint}. In such a case {@link Bendpoint}s with the same coordiantes as
   * the initial {@link Bendpoint} from all {@link RelationshipConstraint}s of the same
   * {@link Relationship} as the {@link RelationshipConstraint}, which the user has selected, must
   * be moved as well. The reason for that is that only one line of the
   * {@link RelationshipConstraint}s is visible to the user and when the user deletes the
   * {@link RelationshipConstraint}, whose line is visible, than the line of the next
   * {@link RelationshipConstraint} must become visible at the same place with the same
   * {@link Bendpoint}s as the line of the deleted {@link RelationshipConstraint}.
   */
  private ArrayList<RelationshipConstraint> relCList = new ArrayList<RelationshipConstraint>();

  /**
   * Constructor of this command, where the label is set, which describes this command to the user.
   * 
   */
  public ORMRelationMoveBendpointCommand() {
    super.setLabel("ORMRelationMoveBendpoint");
  }

  /**
   * {@inheritDoc} In this method the {@link Bendpoint} from the selected {@link Relation} is moved
   * to a new position and the old position is stored in case that user wants to undonwethe command.
   * After that in case the {@link Relation} is a {@link RelationshipConstraint} than
   * {@link Bendpoint}s with same coordinates as the initial {@link Bendpoint} from all
   * {@link RelationshipConstraint}s of the same {@link Relationship} as the
   * {@link RelationshipConstraint}, which the user has selected, must be moved to new coordinates
   * as well. The reason for that is that only one line of the {@link RelationshipConstraint}s is
   * visible to the user and when the user deletes the {@link RelationshipConstraint}, whose line is
   * visible, than the line of the next {@link RelationshipConstraint} must become visible at the
   * same place with the same {@link Bendpoint}s as the line of the deleted
   * {@link RelationshipConstraint}.
   */
  public void execute() {
    if (oldDim1 == null && oldDim2 == null) {
      oldDim1 = relation.getDim1BP().get(index);
      oldDim2 = relation.getDim2BP().get(index);
    }

    Point source = new Point(newDim1.width, newDim1.height);
    Point target = new Point(newDim2.width, newDim2.height);
    relation.getDim1BP().set(index, source);
    relation.getDim2BP().set(index, target);

    if (relation instanceof RelationshipConstraint) {

      relCList.addAll(((RelationshipConstraint) relation).getRelation().getRlshipConstraints());

      for (RelationshipConstraint relC : relCList) {
        if (!relC.equals(relation)) {
          relC.getDim1BP().set(index, source);
          relC.getDim2BP().set(index, target);
        }
      }
    }

  }

  /**
   * {@inheritDoc} This command is undone through moving the {@link Bendpoint} to the old position.
   * Is the {@link Relation} a {@link RelationshipConstraint} than after the moving of the initial
   * {@link Bendpoint} all {@link Bendpoint}s with same coordinates as the initial {@link Bendpoint}
   * from all {@link RelationshipConstraint}s of the same {@link Relationship} as the
   * {@link RelationshipConstraint}, which the user has selected, must be moved back to the old
   * position as well. The reason for that is that only one line of the
   * {@link RelationshipConstraint}s is visible to the user and when the user deletes the
   * {@link RelationshipConstraint}, whose line is visible, than the line of the next
   * {@link RelationshipConstraint} must become visible at the same place with the same
   * {@link Bendpoint}s as the line of the deleted {@link RelationshipConstraint}.
   * */
  @Override
  public void undo() {
    relation.getDim1BP().set(index, oldDim1);
    relation.getDim2BP().set(index, oldDim2);

    if (relation instanceof RelationshipConstraint) {
      for (RelationshipConstraint relC : relCList) {
        if (!relC.equals(relation)) {
          relC.getDim1BP().set(index, oldDim1);
          relC.getDim2BP().set(index, oldDim2);
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
   * Setter for the {@link Dimension}s, which are describing the new relative position of the
   * {@link Bendpoint}.
   * 
   * */
  public void setNewDimension(final Dimension dim1, final Dimension dim2) {
    this.newDim1 = dim1;
    this.newDim2 = dim2;
  }
}
