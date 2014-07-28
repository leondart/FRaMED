package org.framed.orm.ui.command.connectionkinds;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.draw2d.Bendpoint;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.gef.EditPartViewer;
import org.eclipse.gef.commands.Command;
import org.framed.orm.model.Node;
import org.framed.orm.model.Container;
import org.framed.orm.model.Relationship;
import org.framed.orm.model.RelationshipConstraint;
import org.framed.orm.ui.editPart.connectionkinds.ORMRelationshipConstraintEditPart;

/**
 * Through this command {@link RelationshipConstraint}s can be deleted(removed from the model tree).
 * 
 * @author Kay Bierzynski
 * */
public class ORMRelationshipConstraintDeleteCommand extends Command {

  /** The {@link RelationshipConstraint} to be removed. */
  private RelationshipConstraint relation;
  /** The {@link Container} from which the {@link RelationshipConstraint} should be removed. */
  private Container parent;
  /** The source/start {@link Node} of the {@link RelationshipConstraint} to be created. */
  private Node source;
  /** The source/start {@link Node} of the {@link RelationshipConstraint} to be created. */
  private Node target;
  /** The {@link Relationship} to which the {@link RelationshipConstraint} belongs to. */
  private Relationship relationship;
  /**
   * The {@link EditPartViewer}, which is need to activiate the next {@link RelationshipConstraint}
   * to make it's line visible after this {@link RelationshipConstraint} is deleted.
   */
  private EditPartViewer epViewer;
  /**
   * A list, which stores the first part of the {@link Bendpoint}s positions for the case that the
   * user wants to undone this command.
   */
  private ArrayList<Point> dim1BPList = new ArrayList<Point>();
  /**
   * A list, which stores the second part of the {@link Bendpoint}s positions for the case that the
   * user wants to undone this command.
   */
  private ArrayList<Point> dim2BPList = new ArrayList<Point>();

  /**
   * This method tests if the conditions for executing this command are fulfilled,
   * 
   * @return true if the parameter relation and epViewer are set.
   */
  @Override
  public boolean canExecute() {
    return relation != null && epViewer != null;
  }

  /**
   * {@inheritDoc} In this method all the attributes of the {@link RelationshipConstraint} to be
   * removed are stored in variables in case that the user wants to undone this command. After this
   * part the {@link RelationshipConstraint} is removed from the source, the {@link Container}, the
   * {@link Relationship} and the target and all of it's {@link Bendpoint}s are deleted. At the end
   * of the method all the remaining {@link RelationshipConstraint} of the {@link Relationship} are
   * gathered in a list and the {@link ORMRelationshipConstraintEditPart} of every
   * {@link RelationshipConstraint} in the list is refreshed. The refreshing makes the line of the
   * next {@link RelationshipConstraint} visible.
   */
  @Override
  public void execute() {

    parent = relation.getRelationContainer();
    source = relation.getSource();
    target = relation.getTarget();
    relationship = relation.getRelation();
    dim1BPList.addAll(relation.getDim1BP());
    dim2BPList.addAll(relation.getDim2BP());

    relation.setSource(null);
    relation.setTarget(null);
    relation.setRelationContainer(null);
    relation.setRelation(null);
    relation.getDim1BP().clear();
    relation.getDim2BP().clear();

    final List<RelationshipConstraint> relCList = new ArrayList<RelationshipConstraint>();

    relCList.addAll(relationship.getRlshipConstraints());
    // relCList.remove(relation);

    for (final RelationshipConstraint relC : relCList) {
      ORMRelationshipConstraintEditPart editPart =
          (ORMRelationshipConstraintEditPart) epViewer.getEditPartRegistry().get(relC);
      editPart.getLabel().setText("");
      editPart.refreshVisuals();
    }

  }

  /**
   * {@inheritDoc} This command is undone through the recreation/ invoking of the
   * {@link RelationshipConstraint} into the model tree through setting it's attributes. When
   * another {@link RelationshipConstraint} exists between source and target the
   * {@link RelationshipConstraint}, which is readded, get it's {@link Bendpoint}s from their.
   */
  @Override
  public void undo() {
    relation.setSource(source);
    relation.setTarget(target);
    relation.setRelationContainer(parent);
    relation.setRelation(relationship);

    if (relationship.getRlshipConstraints().size() != 0
        && relationship.getRlshipConstraints().get(0).getDim1BP().size() != 0) {
      relation.getDim1BP().addAll(relationship.getRlshipConstraints().get(0).getDim1BP());
      relation.getDim2BP().addAll(relationship.getRlshipConstraints().get(0).getDim2BP());
    } else {
      relation.getDim1BP().addAll(dim1BPList);
      relation.getDim2BP().addAll(dim2BPList);
    }
  }

  /**
   * Setter for the {@link RelationshipConstraint}, which is deleted/removed in this command.
   * 
   * @param relation org.framed.orm.model.RelationConstraint
   * */
  public void setRelationshipConstraint(final RelationshipConstraint relaiton) {
    relation = relaiton;
  }

  /**
   * Setter for the {@link EditPartViewer}, which is need to activiate the next
   * {@link RelationshipConstraint} to make it's line visible after this
   * {@link RelationshipConstraint} is deleted..
   * 
   * @param epViewer org.eclipse.gef.EditPartViewer
   * */
  public void setEPViewer(final EditPartViewer epViewer) {
    this.epViewer = epViewer;
  }
}
