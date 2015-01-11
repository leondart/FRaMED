package org.framed.orm.ui.factory;

import org.eclipse.gef.requests.CreationFactory;
import org.framed.orm.model.OrmFactory;
import org.framed.orm.model.Relation;
import org.framed.orm.model.Type;

/**
 * The ORMRoleEquivalenceFactory creates an {@link Relation} from type roleequivalence.
 * 
 * @author Kay Bierzynski
 * */
public class ORMRoleEquivalenceFactory implements CreationFactory {

  @Override
  public Object getNewObject() {
    Relation relation = OrmFactory.eINSTANCE.createRelation();
    relation.setName("");
    relation.setType(Type.ROLE_EQUIVALENCE);
    return relation;
  }

  @Override
  public Object getObjectType() {
    return Type.ROLE_EQUIVALENCE;
  }
}
