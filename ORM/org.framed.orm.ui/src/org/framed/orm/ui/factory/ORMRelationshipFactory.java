package org.framed.orm.ui.factory;

import org.eclipse.gef.requests.CreationFactory;
import org.framed.orm.model.OrmFactory;
import org.framed.orm.model.RelationLabel;
import org.framed.orm.model.Relationship;

/**
 * The ORMRelationshipFactory creates a Relationship object.
 * 
 * @author Kay Bierzynski
 * */
public class ORMRelationshipFactory implements CreationFactory {

  /**
   * Returns a new relationship object.
   * A relationship consists of the relationship itself, 
   * a label at the source and a label at the target indicating the cardinalities.
   */
  @Override
  public Object getNewObject() {
    Relationship relationship = OrmFactory.eINSTANCE.createRelationship();
    RelationLabel targetLabel = OrmFactory.eINSTANCE.createRelationLabel();
    RelationLabel sourceLabel = OrmFactory.eINSTANCE.createRelationLabel();
    targetLabel.setIsRelationEnd(true);
    sourceLabel.setIsRelationEnd(false);
    relationship.setTargetLabel(targetLabel);
    relationship.setSourceLabel(sourceLabel);
    return relationship;
  }

  @Override
  public Object getObjectType() {
    return Relationship.class;
  }
}
