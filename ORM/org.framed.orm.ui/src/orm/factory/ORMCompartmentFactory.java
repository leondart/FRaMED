package orm.factory;

import org.eclipse.gef.requests.CreationFactory;

import org.framed.orm.model.Compartment;
import org.framed.orm.model.OrmFactory;

/**
 * @author Kay Bierzynski
 * */
public class ORMCompartmentFactory implements CreationFactory {
	
	@Override public Object getNewObject() {		
	    return OrmFactory.eINSTANCE.createCompartment();
	  }
	 
	  @Override public Object getObjectType() {
	    return Compartment.class;
	  }
	
}
