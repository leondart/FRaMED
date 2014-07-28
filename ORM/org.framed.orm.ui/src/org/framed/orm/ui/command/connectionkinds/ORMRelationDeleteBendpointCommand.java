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
 * Command used to delete/remove a {@link Bendpoint}.
 * 
 * @author Kay Bierzynski
 */
public class ORMRelationDeleteBendpointCommand extends Command {

  /** {@link Relation} from which the {@link Bendpoint} is removed. */
  private Relation relation;
  /** Index on which the {@link Bendpoint} coordinates should be readded . */
  private int index;
  /** The {@link Dimension}s, which are describing the relative position of the {@link Bendpoint}. */
  private Point dim1, dim2;
  /**
   * A list, which contains all {@link RelationshipConstraint}s from one {@link Relationship}. This
   * list is needed for the case the user wants to undone the removing of a {@link Bendpoint} to a
   * {@link RelationshipConstraint} in such case {@link Bendpoint}s with the same coordiantes as the
   * initial {@link Bendpoint} must be added to all {@link RelationshipConstraint}s of the same
   * {@link Relationship} as the {@link RelationshipConstraint}, which the user has selected. The
   * reason for that is that only one line of the {@link RelationshipConstraint}s is visible to the
   * user and when the user deletes the {@link RelationshipConstraint}, whose line is visible, than
   * the line of the next {@link RelationshipConstraint} must become visible at the same place with
   * the same {@link Bendpoint}s as the line of the deleted {@link RelationshipConstraint}.
   */
  private ArrayList<RelationshipConstraint> relCList = new ArrayList<RelationshipConstraint>();

  /**
   * Constructor of this command, where the label is set, which describes this command to the user.
   * 
   */
  public ORMRelationDeleteBendpointCommand() {
    super.setLabel("ORMRelationDeleteBendpoint");
  }

  /**
   * This method tests if the conditions for executing this command are fulfilled,
   * 
   * @return true if the parameter relation is set and the parameter index is valid.
   */
  @Override
  public boolean canExecute() {
    if (relation != null) {
      return (relation.getDim1BP().size() > index) && (relation.getDim2BP().size() > index);
    }
    return false;
  }

  /**
   * {@inheritDoc} In this method the {@link Bendpoint} is removed from the selected
   * {@link Relation}. Is the {@link Relation} a {@link RelationshipConstraint} than
   * {@link Bendpoint}s with same coordinates as the initial {@link Bendpoint} must be removed from
   * all {@link RelationshipConstraint}s of the same {@link Relationship} as the
   * {@link RelationshipConstraint}, which the user has selected. The reason for that is that only
   * one line of the {@link RelationshipConstraint}s is visible to the user and when the user
   * deletes the {@link RelationshipConstraint}, whose line is visible, than the line of the next
   * {@link RelationshipConstraint} must become visible at the same place with the same
   * {@link Bendpoint}s as the line of the deleted {@link RelationshipConstraint}.
   */
  @Override
  public void execute() {
    dim1 = relation.getDim1BP().get(index);
    dim2 = relation.getDim2BP().get(index);
    relation.getDim1BP().remove(index);
    relation.getDim2BP().remove(index);

    if (relation instanceof RelationshipConstraint) {

      relCList.addAll(((RelationshipConstraint) relation).getRelation().getRlshipConstraints());

      for (RelationshipConstraint relC : relCList) {
        if (!relC.equals(relation)) {
          relC.getDim1BP().remove(index);
          relC.getDim2BP().remove(index);
        }
      }
    }

  }

  /**
   * {@inheritDoc} This command is undone through adding the {@link Bendpoint} to the selected
   * {@link Relation}. Is the {@link Relation} a {@link RelationshipConstraint} than
   * {@link Bendpoint}s with same coordinates as the initial {@link Bendpoint} must be added to all
   * {@link RelationshipConstraint}s of the same {@link Relationship} as the
   * {@link RelationshipConstraint}, which the user has selected. The reason for that is that only
   * one line of the {@link RelationshipConstraint}s is visible to the user and when the user
   * deletes the {@link RelationshipConstraint}, whose line is visible, than the line of the next
   * {@link RelationshipConstraint} must become visible at the same place with the same
   * {@link Bendpoint}s as the line of the deleted {@link RelationshipConstraint}.
   * */
  @Override
  public void undo() {
    relation.getDim1BP().add(index, dim1);
    relation.getDim2BP().add(index, dim2);

    if (relation instanceof RelationshipConstraint) {

      for (RelationshipConstraint relC : relCList) {
        if (!relC.equals(relation)) {
          relC.getDim1BP().add(index, dim1);
          relC.getDim2BP().add(index, dim2);
        }
      }
    }

  }

  /**
   * Setter for the index on which the {@link Bendpoint} should be removed from the {@link Relation}
   * .
   * 
   * @param index integer
   */
  public void setIndex(final int index) {
    this.index = index;
  }

  /**
   * Setter for the {@link Relation} from which the {@link Bendpoint} should be removed.
   * 
   * @param relation org.framed.orm.model.Relation
   */
  public void setRelation(final Relation relation) {
    this.relation = relation;
  }

}
