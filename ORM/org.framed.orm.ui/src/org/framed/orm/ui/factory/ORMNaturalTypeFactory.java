package org.framed.orm.ui.factory;

import org.eclipse.gef.requests.CreationFactory;
import org.framed.orm.model.OrmFactory;
import org.framed.orm.model.Shape;
import org.framed.orm.model.Type;

/**
 * The ORMNaturalTypeFactory creates a {@link Shape} from type natrualtype.
 * 
 * @author Kay Bierzynski
 * */
public class ORMNaturalTypeFactory implements CreationFactory {

  @Override
  public Object getNewObject() {
    Shape shape = OrmFactory.eINSTANCE.createShape();
    shape.setType(Type.NATURAL_TYPE);
    return shape;
  }

  @Override
  public Object getObjectType() {
    return Type.NATURAL_TYPE;
  }
}
