package orm.factory;

import org.eclipse.gef.requests.CreationFactory;

import orm.model.Acyclic;
import orm.model.OrmFactory;

/**
 * @author Kay Bierzynski
 * */
public class ORMAcyclicFactory implements CreationFactory {
	
	@Override public Object getNewObject() {		
	    return OrmFactory.eINSTANCE.createAcyclic();
	  }
	 
	  @Override public Object getObjectType() {
	    return Acyclic.class;
	  }
	
}
