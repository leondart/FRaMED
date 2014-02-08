package orm.factory;

import org.eclipse.gef.requests.CreationFactory;

import orm.model.Compartment;
import orm.model.OrmFactory;

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
