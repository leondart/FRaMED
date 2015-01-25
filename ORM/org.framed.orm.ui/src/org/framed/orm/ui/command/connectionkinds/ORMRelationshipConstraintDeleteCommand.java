package org.framed.orm.ui.command.connectionkinds;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.draw2d.Bendpoint;
import org.eclipse.gef.EditPartViewer;
import org.eclipse.gef.commands.Command;
import org.framed.orm.geometry.GeometryFactory;
import org.framed.orm.geometry.RelativePoint;
import org.framed.orm.model.Model;
import org.framed.orm.model.Relation;
import org.framed.orm.model.Shape;
import org.framed.orm.ui.editPart.connectionkinds.ORMRelationshipConstraintEditPart;

/**
 * Through this command {@link Relation}s from type total, cyclic and irreflexive can be
 * deleted(removed from the model tree).
 * 
 * @author Kay Bierzynski
 * */
public class ORMRelationshipConstraintDeleteCommand extends Command {

  /** The {@link Relation} from type total, cyclic or irreflexive to be removed. */
  private Relation relation;
  /**
   * The {@link Model} from which the {@link Relation} from type total, cyclic or irreflexive should
   * be removed.
   */
  private Model parent;
  /**
   * The source/start {@link Shape} of the {@link Relation} from type total, cyclic or irreflexive
   * to be created.
   */
  private Shape source;
  /**
   * The source/start {@link Shape} of the {@link Relation} from type total, cyclic or irreflexive
   * to be created.
   */
  private Shape target;
  /**
   * The Relation from type relationship to which the {@link Relation} from type total, cyclic or
   * irreflexive belongs to.
   */
  private Relation relationship;
  /**
   * The {@link EditPartViewer}, which is need to activiate the next {@link Relation} from type
   * total, cyclic or irreflexive to make it's line visible after this relationship constraint is
   * deleted.
   */
  private EditPartViewer epViewer;
  /**
   * A list, which stores the {@link Bendpoint}s positions for the case that the user wants to
   * undone this command.
   */
  private ArrayList<RelativePoint> bendpointList = new ArrayList<RelativePoint>();

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
   * {@inheritDoc} In this method all the attributes of the {@link Relation} from type total, cyclic
   * or irreflexive to be removed are stored in variables in case that the user wants to undone this
   * command. After this part the relationship constraint is removed from the source, the
   * {@link Model}, the {@link Relation} from type relationship and the target and all of it's
   * {@link Bendpoint}s are deleted. At the end of the method all the remaining relationship
   * constraint of the relationship are gathered in a list and the
   * {@link ORMRelationshipConstraintEditPart} of every relationship constraint in the list is
   * refreshed. The refreshing makes the line of the next relationship constraint visible.
   */
  @Override
  public void execute() {

    parent = relation.getContainer();
    source = (Shape) relation.getSource();
    target = (Shape) relation.getTarget();
    relationship = relation.getReferencedRelation().get(0);
    relationship.getReferencedRelation().remove(relation);
    bendpointList.addAll(relation.getBendpoints());


    relation.setSource(null);
    relation.setTarget(null);
    relation.setContainer(null);
    relation.getReferencedRelation().clear();
    relation.getBendpoints().clear();


    final List<Relation> relCList = new ArrayList<Relation>();

    relCList.addAll(relationship.getReferencedRelation());

    for (final Relation relC : relCList) {
      ORMRelationshipConstraintEditPart editPart =
          (ORMRelationshipConstraintEditPart) epViewer.getEditPartRegistry().get(relC);
      editPart.getLabel().setText("");
      editPart.refreshVisuals();
    }

  }

  /**
   * {@inheritDoc} This command is undone through the recreation/ invoking of the {@link Relation}
   * from type total, cyclic or irreflexive into the model tree through setting it's attributes.
   * When another relationship constraint exists between source and target the relationship
   * constraint, which is readded, get it's {@link Bendpoint}s from their.
   */
  @Override
  public void undo() {
    relation.setSource(source);
    relation.setTarget(target);
    relation.setContainer(parent);
    relation.getReferencedRelation().add(relationship);
    relationship.getReferencedRelation().add(relation);
    
    if (relationship.getReferencedRelation().size() != 0
        && relationship.getReferencedRelation().get(0).getBendpoints().size() != 0) {
      Relation rel = relationship.getReferencedRelation().get(0);
      // RelativePoints cannot be shared between rleations so we must create a relativepoint with
      // same data
      for (RelativePoint relP : rel.getBendpoints()) {
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

        relation.getBendpoints().add(newRelP);
      }
    } else {
      relation.getBendpoints().addAll(bendpointList);
    }
  }

  /**
   * Setter for the {@link Relation} from type total, cyclic or irreflexive, which is
   * deleted/removed in this command.
   * 
   * @param relation org.framed.orm.model.Relation
   * */
  public void setRelation(final Relation relation) {
    this.relation = relation;
  }

  /**
   * Setter for the {@link EditPartViewer}, which is need to activiate the next {@link Relation}
   * from type total, cyclic or irreflexive to make it's line visible after this he {@link Relation}
   * from type total, cyclic or irreflexive is deleted.
   * 
   * @param epViewer org.eclipse.gef.EditPartViewer
   * */
  public void setEPViewer(final EditPartViewer epViewer) {
    this.epViewer = epViewer;
  }
}
