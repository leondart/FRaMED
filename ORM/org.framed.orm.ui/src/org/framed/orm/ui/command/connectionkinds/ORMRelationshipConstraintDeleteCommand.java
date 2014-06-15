package org.framed.orm.ui.command.connectionkinds;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.draw2d.geometry.Point;
import org.eclipse.gef.EditPartViewer;
import org.eclipse.gef.commands.Command;
import org.framed.orm.model.Node;
import org.framed.orm.model.Container;
import org.framed.orm.model.Relationship;
import org.framed.orm.model.RelationshipConstraint;
import org.framed.orm.ui.editPart.connectionkinds.ORMRelationshipConstraintEditPart;

public class ORMRelationshipConstraintDeleteCommand extends Command {

  /** Relation to be deleted. */
  private RelationshipConstraint relation;
  /** RelationContainer that owns the relation. */
  private Container parent;
  /** Source of the relation. */
  private Node source;
  /** Target of the relation. */
  private Node target;

  private Relationship rlship;

  private EditPartViewer epViewer;

  private ArrayList<Point> dim1BPList = new ArrayList<Point>();

  private ArrayList<Point> dim2BPList = new ArrayList<Point>();

  /**
   * {@inheritDoc}
   */
  @Override
  public boolean canExecute() {
    return relation != null && epViewer != null;
  }

  /**
   * Disconnect Relation from source and target things and remove from owner RelationConatiner.
   */
  @Override
  public void execute() {

    parent = relation.getRelationContainer();
    source = relation.getSource();
    target = relation.getTarget();
    rlship = relation.getRelation();
    dim1BPList.addAll(relation.getDim1BP());
    dim2BPList.addAll(relation.getDim2BP());

    relation.setSource(null);
    relation.setTarget(null);
    relation.setRelationContainer(null);
    relation.setRelation(null);
    relation.getDim1BP().clear();
    relation.getDim2BP().clear();

    final List<RelationshipConstraint> relCList = new ArrayList<RelationshipConstraint>();

    relCList.addAll(rlship.getRlshipConstraints());
    relCList.remove(relation);

    for (final RelationshipConstraint relC : relCList) {
      ORMRelationshipConstraintEditPart editPart =
          (ORMRelationshipConstraintEditPart) epViewer.getEditPartRegistry().get(relC);
      editPart.getLabel().setText("");
      editPart.refreshVisuals();
    }

  }

  /**
   * Reconnect the relation to the source and target and add it to the owner RelationContainer.
   */
  @Override
  public void undo() {
    relation.setSource(source);
    relation.setTarget(target);
    relation.setRelationContainer(parent);
    relation.setRelation(rlship);

    if (rlship.getRlshipConstraints().size() != 0
        && rlship.getRlshipConstraints().get(0).getDim1BP().size() != 0) {
      relation.getDim1BP().addAll(rlship.getRlshipConstraints().get(0).getDim1BP());
      relation.getDim2BP().addAll(rlship.getRlshipConstraints().get(0).getDim2BP());
    } else {
      relation.getDim1BP().addAll(dim1BPList);
      relation.getDim2BP().addAll(dim2BPList);
    }
  }

  /**
   * Set the relation that will be delete from the diagram.
   * 
   * @param relaiton the relation to delete from the diagram.
   */
  public void setRelationshipConstraint(final RelationshipConstraint relaiton) {
    relation = relaiton;
  }


  public void setEPViewer(final EditPartViewer epViewer) {
    this.epViewer = epViewer;
  }
}
