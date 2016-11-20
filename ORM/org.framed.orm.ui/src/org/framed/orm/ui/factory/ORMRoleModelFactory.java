package org.framed.orm.ui.factory;

import org.eclipse.gef.requests.CreationFactory;
import org.framed.orm.model.OrmFactory;
import org.framed.orm.model.Shape;
import org.framed.orm.model.Type;

/**
 * The ORMRoleModelFactory creates a {@link Shape} from type RoleModel.
 * 
 * @author Kevin Kassin
 * */
public class ORMRoleModelFactory implements CreationFactory{

	@Override
	  public Object getNewObject() {
	    Shape shape = OrmFactory.eINSTANCE.createShape();
	    shape.setType(Type.COMPARTMENT_TYPE);
	    //setName here to distinguish Role Model and Compartment Type
	    shape.setName("RoleModel");
	    return shape;
	  }

	  @Override
	  public Object getObjectType() {
	    return Type.COMPARTMENT_TYPE;
	  }
}
