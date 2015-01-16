package org.framed.orm.ui.factory;

import org.eclipse.gef.requests.CreationFactory;
import org.framed.orm.model.OrmFactory;
import org.framed.orm.model.Shape;
import org.framed.orm.model.Type;

/**
 * The ORMDataTypeFactory creates a {@link Shape} from type datatype.
 * 
 * @author Kay Bierzynski
 * */
public class ORMDataTypeFactory implements CreationFactory {

  @Override
  public Object getNewObject() {
    Shape shape = OrmFactory.eINSTANCE.createShape();
    shape.setType(Type.DATA_TYPE);
    return shape;
  }

  @Override
  public Object getObjectType() {
    return Type.DATA_TYPE;
  }
}
