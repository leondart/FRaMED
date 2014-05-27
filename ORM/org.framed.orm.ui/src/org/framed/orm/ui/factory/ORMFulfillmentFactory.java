package org.framed.orm.ui.factory;

import org.eclipse.gef.requests.CreationFactory;

import org.framed.orm.model.Fulfillment;
import org.framed.orm.model.OrmFactory;

/**
 * @author Kay Bierzynski
 * */
public class ORMFulfillmentFactory implements CreationFactory{
	
	@Override public Object getNewObject() {
	    return OrmFactory.eINSTANCE.createFulfillment();
	  }
	 
	  @Override public Object getObjectType() {
	    return Fulfillment.class;
	  }
}
