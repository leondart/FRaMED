package org.framed.orm.ui.command.connectionkinds;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.gef.EditPartViewer;
import org.eclipse.gef.commands.Command;
import org.framed.orm.model.Node;
import org.framed.orm.model.RelationContainer;
import org.framed.orm.model.Relationship;
import org.framed.orm.model.RelationshipConstraint;
import org.framed.orm.ui.editPart.connectionkinds.ORMRelationshipConstraintEditPart;

public class ORMRealtionshipConstraintDeleteCommand extends Command {
  
  /** Relation to be deleted. */
  private RelationshipConstraint relation; 
  /** RelationContainer that owns the relatiob. */
  private RelationContainer relationCon;
  /** Source of the relation. */
  private Node source;
  /** Target of the relation. */
  private Node target;
  private Relationship rlship;
  private EditPartViewer epViewer;
  /**
   * {@inheritDoc}
   */
  @Override
  public boolean canExecute() {
    return relation != null && epViewer != null;
  }

  /**
   * Disconnect Relation from source 
   * and target things and remove from owner RelationConatiner.
   */
  @Override
  public void execute() {
    relationCon = relation.getRelationContainer();
    source = relation.getSource();
    target = relation.getTarget();
    rlship = relation.getRelation();
    
    relation.setSource(null);
    relation.setTarget(null);
    relation.setRelationContainer(null);
    relation.setRelation(null);
  
    final List<RelationshipConstraint> relCList = new ArrayList<RelationshipConstraint>();
  
    relCList.addAll(rlship.getRlshipConstraints());
   
   for(final RelationshipConstraint relC : relCList){
      ((ORMRelationshipConstraintEditPart) epViewer.getEditPartRegistry().get(relC)).refreshVisuals();
    }
  }

  /**
   * Reconnect the relation to the source 
   * and target and add it to the owner RelationContainer.
   */
  @Override
  public void undo() {
    relation.setSource(source);
    relation.setTarget(target);
    relation.setRelationContainer(relationCon);
    relation.setRelation(rlship);
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
    this.epViewer=epViewer;
  }
}
