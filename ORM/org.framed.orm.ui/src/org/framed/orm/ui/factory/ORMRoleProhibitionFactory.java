package org.framed.orm.ui.factory;

import org.eclipse.gef.requests.CreationFactory;
import org.framed.orm.model.OrmFactory;
import org.framed.orm.model.Relation;
import org.framed.orm.model.Type;

/**
 * The ORMRoleProhibitionFactory creates an {@link Relation} from type roleprohibition.
 * 
 * @author Kay Bierzynski
 * */
public class ORMRoleProhibitionFactory implements CreationFactory{

  @Override 
  public Object getNewObject() {
    Relation relation = OrmFactory.eINSTANCE.createRelation();
    relation.setName("");
    relation.setType(Type.ROLE_PROHIBITION);
    return relation;
  }

  @Override 
  public Object getObjectType() {
    return Type.ROLE_PROHIBITION;
  }
}
