package org.framed.orm.ui.factory;

import org.eclipse.gef.requests.CreationFactory;
import org.framed.orm.model.OrmFactory;
import org.framed.orm.model.Relation;
import org.framed.orm.model.Type;

/**
 * The ORMRoleImplicationFactory creates an {@link Relation} from type relationshipexclusion.
 * 
 * @author Duc Dung Dam
 * */
public class ORMRelationshipExclusionFactory implements CreationFactory {

  @Override
  public Object getNewObject() {
    Relation relation = OrmFactory.eINSTANCE.createRelation();
    relation.setName(null);
    relation.setType(Type.RELATIONSHIP_EXCLUSION);
    return relation;
  }

  @Override
  public Object getObjectType() {
    return Type.RELATIONSHIP_EXCLUSION;
  }
}
