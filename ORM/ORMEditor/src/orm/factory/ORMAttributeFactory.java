package orm.factory;

import org.eclipse.gef.requests.CreationFactory;

import org.framed.orm.model.Attribute;
import org.framed.orm.model.OrmFactory;

/**
 * @author Kay Bierzynski
 * */
public class ORMAttributeFactory implements CreationFactory {
	
	@Override public Object getNewObject() {		
	    return OrmFactory.eINSTANCE.createAttribute();
	  }
	 
	  @Override public Object getObjectType() {
	    return Attribute.class;
	  }
}
