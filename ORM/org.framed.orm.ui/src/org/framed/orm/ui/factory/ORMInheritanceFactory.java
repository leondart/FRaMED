package org.framed.orm.ui.factory;

import org.eclipse.gef.requests.CreationFactory;
import org.framed.orm.model.OrmFactory;
import org.framed.orm.model.Relation;
import org.framed.orm.model.Type;

/**
 * The ORMInheritanceFactory creates an {@link Relation} from type inheritance.
 * 
 * @author Kay Bierzynski
 * */
public class ORMInheritanceFactory implements CreationFactory {
	
  @Override 
  public Object getNewObject() {		
    Relation relation = OrmFactory.eINSTANCE.createRelation();
    relation.setName(null);
    relation.setType(Type.INHERITANCE);
    return relation;
  }

  @Override 
  public Object getObjectType() {
    return Type.INHERITANCE;
  }
}
