package orm.factory;

import org.eclipse.gef.requests.CreationFactory;

import org.framed.orm.model.OrmFactory;
import org.framed.orm.model.Total;

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
