package org.framed.orm.ui.factory;

import org.eclipse.gef.requests.CreationFactory;
import org.framed.orm.model.OrmFactory;
import org.framed.orm.model.Relation;
import org.framed.orm.model.Type;

/**
 * The ORMTotalFactory creates an {@link Relation} from type total.
 * 
 * @author Kay Bierzynski
 * */
public class ORMTotalFactory implements CreationFactory {

  @Override
  public Object getNewObject() {
    Relation relation = OrmFactory.eINSTANCE.createRelation();
    relation.setName("total");
    relation.setType(Type.TOTAL);
    return relation;
  }

  @Override
  public Object getObjectType() {
    return Type.TOTAL;
  }

}
