package org.framed.orm.ui.factory;

import org.eclipse.gef.requests.CreationFactory;
import org.framed.orm.model.OrmFactory;
import org.framed.orm.model.Shape;
import org.framed.orm.model.Type;

/**
 * The ORMRoleTypeFactory creates a {@link Shape} from type roletype.
 * 
 * @author Kay Bierzynski
 * */
public class ORMRoleTypeFactory implements CreationFactory {

  @Override
  public Object getNewObject() {
    Shape shape = OrmFactory.eINSTANCE.createShape();
    shape.setType(Type.ROLE_TYPE);
    return shape;
  }

  @Override
  public Object getObjectType() {
    return Type.ROLE_TYPE;
  }

}
