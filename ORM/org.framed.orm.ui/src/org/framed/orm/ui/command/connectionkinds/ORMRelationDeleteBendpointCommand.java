package org.framed.orm.ui.command.connectionkinds;


import java.util.ArrayList;

import org.eclipse.draw2d.Bendpoint;
import org.eclipse.gef.commands.Command;
import org.framed.orm.geometry.RelativePoint;
import org.framed.orm.model.Relation;
import org.framed.orm.model.Type;



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
  /**
   * The {@link RelativePoint}, which represents the {@link Bendpoint} that should be removed in
   * this command.
   */
  private RelativePoint relP;
  /**
   * A list, which contains all {@link Relation}s from type cyclic, total and irreflexive(aka
   * RelationshipConstraints) from one {@link Relation} from type relationship. This list is needed
   * for the case the user wants to undo the removing of a {@link Bendpoint} from a
   * relationshipConstraint in such a case {@link Bendpoint}s with the same coordiantes as the
   * initial {@link Bendpoint} must be added to all relationshipConstraints of the same
   * {@link Relation} from type relationship as the relationshipConstraint, which the user has
   * selected. The reason for that is that only one line of the relationshipConstraints is visible
   * to the user and when the user deletes the relationshipConstraint, whose line is visible, than
   * the line of the next relationshipConstraint must become visible at the same place with the same
   * {@link Bendpoint}s as the line of the deleted relationshipConstraint.
   */
  private ArrayList<Relation> relCList = new ArrayList<Relation>();

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
      return relation.getBendpoints().size() > index;
    }
    return false;
  }

  /**
   * {@inheritDoc} In this method the {@link Bendpoint} is removed from the selected
   * {@link Relation}. Is the {@link Relation} from type cyclic, total and irreflexive(aka
   * relationshipConstraint) than {@link Bendpoint}s with same coordinates as the initial
   * {@link Bendpoint} must be removed from all relationshipConstraints of the same {@link Relation}
   * from type relationship as the {relationshipConstraint, which the user has selected. The reason
   * for that is that only one line of the relationshipConstraints is visible to the user and when
   * the user deletes the relationshipConstraint, whose line is visible, than the line of the next
   * relationshipConstraint must become visible at the same place with the same {@link Bendpoint}s
   * as the line of the deleted relationshipConstraint.
   */
  @Override
  public void execute() {
    relP = relation.getBendpoints().get(index);
    relation.getBendpoints().remove(index);

    if (relation.getType().equals(Type.TOTAL) || relation.getType().equals(Type.CYCLIC)
        || relation.getType().equals(Type.IRREFLEXIVE)) {

      relCList.addAll(relation.getReferencedRelation().get(0).getReferencedRelation());

      for (Relation relC : relCList) {
        if (!relC.equals(relation)) {
          relC.getBendpoints().remove(index);
        }
      }
    }

  }

  /**
   * {@inheritDoc} This command is undone through adding the {@link Bendpoint} to the selected
   * {@link Relation}. Is the {@link Relation} from type cyclic, total and irreflexive(aka
   * relationshipConstraint) than {@link Bendpoint}s with same coordinates as the initial
   * {@link Bendpoint} must be added to all relationshipConstraints of the same {@link Relation}
   * from type relationship as the relationshipConstraint, which the user has selected. The reason
   * for that is that only one line of the relationshipConstraints is visible to the user and when
   * the user deletes the relationshipConstraint, whose line is visible, than the line of the next
   * relationshipConstraint must become visible at the same place with the same {@link Bendpoint}s
   * as the line of the deleted relationshipConstraint.
   * */
  @Override
  public void undo() {
    relation.getBendpoints().add(index, relP);

    if (relation.getType().equals(Type.TOTAL) || relation.getType().equals(Type.CYCLIC)
        || relation.getType().equals(Type.IRREFLEXIVE)) {

      for (Relation relC : relCList) {
        if (!relC.equals(relation)) {
          relC.getBendpoints().add(index, relP);
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
