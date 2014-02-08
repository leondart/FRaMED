package orm.factory;

import org.eclipse.gef.requests.CreationFactory;

import orm.model.Fulfilment;
import orm.model.OrmFactory;

/**
 * @author Kay Bierzynski
 * */
public class ORMFulfilmentFactory implements CreationFactory{
	
	@Override public Object getNewObject() {
	    return OrmFactory.eINSTANCE.createFulfilment();
	  }
	 
	  @Override public Object getObjectType() {
	    return Fulfilment.class;
	  }
}
