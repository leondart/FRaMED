package org.framed.orm.ui.command.connectionkinds;

import java.util.ArrayList;

import org.eclipse.draw2d.Bendpoint;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.gef.commands.Command;
import org.framed.orm.model.Node;
import org.framed.orm.model.Relation;
import org.framed.orm.model.Container;
import org.framed.orm.model.Relationship;
import org.framed.orm.model.RelationshipConstraint;
import org.framed.orm.ui.editPart.connectionkinds.ORMRelationshipConstraintEditPart;

/**
 * Through this command all {@link Relation}s except the {@link RelationshipConstraint}s can be
 * deleted(removed from the model tree). The {@link RelationshipConstraint}s need an extra command,
 * because after every deletion of a {@link RelationshipConstraint} the
 * {@link ORMRelationshipConstraintEditPart} of the other {@link RelationshipConstraint}s from the
 * same {@link Relationship} muste be refreshed.
 * 
 * @author Kay Bierzynski
 * */
public class ORMRelationDeleteCommand extends Command {

  /** The {@link Relation} to be removed. */
  private Relation relation;
  /** The {@link Container} from which the {@link Relation} should be removed. */
  private Container parent;
  /** The source/start {@link Node} of the {@link Relation} to be created. */
  private Node source;
  /** The target/end {@link Node} of the {@link Relation} to be created. */
  private Node target;
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
   * Constructor of this command, where the label is set, which describes this command to the user.
   * 
   */
  public ORMRelationDeleteCommand() {
    super.setLabel("ORMRelationDelete");
  }

  /**
   * This method tests if the conditions for executing this command are fulfilled,
   * 
   * @return true if the parameter relation is set.
   */
  @Override
  public boolean canExecute() {
    return relation != null;
  }

  /**
   * {@inheritDoc} In this method all the attributes of the {@link Relation} to be removed are
   * stored in variables in case that the user wants to undone this command. After this part the
   * {@link Relation} is removed from the source, the {@link Container} and the target and all of
   * it's {@link Bendpoint}s are deleted.
   * 
   */
  @Override
  public void execute() {
    parent = relation.getRelationContainer();
    source = relation.getSource();
    target = relation.getTarget();
    dim1BPList.addAll(relation.getDim1BP());
    dim2BPList.addAll(relation.getDim2BP());

    relation.setSource(null);
    relation.setTarget(null);
    relation.setRelationContainer(null);
    relation.getDim1BP().clear();
    relation.getDim2BP().clear();
  }

  /**
   * {@inheritDoc} This command is undone through the recreation/ invoking of the {@link Relation}
   * into the model tree through setting it's attributes.
   */
  @Override
  public void undo() {
    relation.setSource(source);
    relation.setTarget(target);
    relation.setRelationContainer(parent);
    relation.getDim1BP().addAll(dim1BPList);
    relation.getDim2BP().addAll(dim2BPList);

  }

  /**
   * Setter for the {@link Relation}, which is deleted/removed in this command.
   * 
   * @param relation org.framed.orm.model.Relation
   * */
  public void setRelation(final Relation relaiton) {
    relation = relaiton;
  }

}
