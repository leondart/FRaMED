package orm.factory;

import org.eclipse.gef.requests.CreationFactory;

import orm.model.OrmFactory;
import orm.model.Total;

/**
 * @author Kay Bierzynski
 * */
public class ORMTotalFactory implements CreationFactory {
	
	@Override public Object getNewObject() {		
	    return OrmFactory.eINSTANCE.createTotal();
	  }
	 
	  @Override public Object getObjectType() {
	    return Total.class;
	  }
	
}
