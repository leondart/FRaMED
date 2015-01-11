package org.framed.orm.ui.factory;

import org.eclipse.gef.requests.CreationFactory;
import org.framed.orm.model.OrmFactory;
import org.framed.orm.model.Relation;
import org.framed.orm.model.Type;

/**
 * This factory creates an {@link Relation} from type cyclic.
 * 
 * @author Kay Bierzynski
 * */
public class ORMCyclicFactory implements CreationFactory {

  @Override
  public Object getNewObject() {
    Relation relation = OrmFactory.eINSTANCE.createRelation();
    relation.setName("cyclic");
    relation.setType(Type.CYCLIC);
    return relation;
  }

  @Override
  public Object getObjectType() {
    return Type.CYCLIC;
  }

}
