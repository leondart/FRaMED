package org.framed.orm.ui.factory;

import org.eclipse.gef.requests.CreationFactory;
import org.framed.orm.model.OrmFactory;
import org.framed.orm.model.Relation;
import org.framed.orm.model.Type;

/**
 * The ORMRelationshipFactory creates an {@link Relation} from type relationship.
 * 
 * @author Kay Bierzynski
 * */
public class ORMRelationshipFactory implements CreationFactory {

  @Override
  public Object getNewObject() {
    Relation relation = OrmFactory.eINSTANCE.createRelation();
    relation.setName("");
    relation.setType(Type.RELATIONSHIP);
    return relation;
  }

  @Override
  public Object getObjectType() {
    return Type.RELATIONSHIP;
  }
}
