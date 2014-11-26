package org.framed.orm.ui.factory;

import org.eclipse.gef.requests.CreationFactory;
import org.framed.orm.model.OrmFactory;
import org.framed.orm.model.Shape;
import org.framed.orm.model.Type;

/**
 * The ORMGroupingFactory creates a {@link Shape} from type group.
 * 
 * @author Kay Bierzynski
 * */
public class ORMGroupFactory implements CreationFactory {
	
  @Override 
  public Object getNewObject() {		
    Shape shape = OrmFactory.eINSTANCE.createShape();
    shape.setType(Type.GROUP);
    return shape;
  }

  @Override 
  public Object getObjectType() {
    return Type.GROUP;
  }

}

