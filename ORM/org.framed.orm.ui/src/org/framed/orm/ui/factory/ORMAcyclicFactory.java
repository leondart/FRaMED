package org.framed.orm.ui.factory;

import org.eclipse.gef.requests.CreationFactory;
import org.framed.orm.model.OrmFactory;
import org.framed.orm.model.Relation;
import org.framed.orm.model.Type;

/**
 * This factory creates an {@link Relation} from type acyclic.
 * 
 * @author Duc Dung Dam
 * */
public class ORMAcyclicFactory implements CreationFactory {

  @Override
  public Object getNewObject() {
    Relation relation = OrmFactory.eINSTANCE.createRelation();
    relation.setName("ayclic");
    relation.setType(Type.ACYCLIC);
    return relation;
  }

  @Override
  public Object getObjectType() {
    return Type.ACYCLIC;
  }

}
