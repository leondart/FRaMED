package org.framed.orm.ui.factory;

import org.eclipse.gef.requests.CreationFactory;
import org.framed.orm.model.OrmFactory;
import org.framed.orm.model.Shape;
import org.framed.orm.model.Type;

/**
 * The ORMCompartmentFactory creates a {@link Shape} from type compartmentype.
 * 
 * @author Kay Bierzynski
 * */
public class ORMCompartmentTypeFactory implements CreationFactory {

  @Override
  public Object getNewObject() {
    Shape shape = OrmFactory.eINSTANCE.createShape();
    shape.setType(Type.COMPARTMENT_TYPE);
    return shape;
  }

  @Override
  public Object getObjectType() {
    return Type.COMPARTMENT_TYPE;
  }

}
