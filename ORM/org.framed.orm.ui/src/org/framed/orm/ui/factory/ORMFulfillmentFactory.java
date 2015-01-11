package org.framed.orm.ui.factory;

import org.eclipse.gef.requests.CreationFactory;
import org.framed.orm.model.OrmFactory;
import org.framed.orm.model.Relation;
import org.framed.orm.model.Type;

/**
 * The ORMFulfillmentFactory creates an {@link Relation} from type fulfillment.
 * 
 * @author Kay Bierzynski
 * */
public class ORMFulfillmentFactory implements CreationFactory {

  @Override
  public Object getNewObject() {
    Relation relation = OrmFactory.eINSTANCE.createRelation();
    relation.setName("");
    relation.setType(Type.FULFILLMENT);
    return relation;
  }

  @Override
  public Object getObjectType() {
    return Type.FULFILLMENT;
  }
}
