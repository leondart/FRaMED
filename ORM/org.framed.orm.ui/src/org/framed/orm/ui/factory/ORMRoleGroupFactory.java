package org.framed.orm.ui.factory;

import org.eclipse.gef.requests.CreationFactory;
import org.framed.orm.model.OrmFactory;
import org.framed.orm.model.Shape;
import org.framed.orm.model.Type;

/**
 * The ORMRoleGroupFactory creates a {@link Shape} from type rolegroup.
 * 
 * @author Kay Bierzynski
 * */
public class ORMRoleGroupFactory implements CreationFactory {
	
	
  @Override 
  public Object getNewObject() {		
    Shape shape = OrmFactory.eINSTANCE.createShape();
    shape.setType(Type.ROLE_GROUP);
    return shape;
  }

  @Override 
  public Object getObjectType() {
    return Type.ROLE_GROUP;
  }
}
