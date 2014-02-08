package orm.factory;

import org.eclipse.gef.requests.CreationFactory;

import orm.model.NaturalType;
import orm.model.OrmFactory;

/**
 * @author Kay Bierzynski
 * */
public class ORMNaturalTypeFactory implements CreationFactory {
	
	@Override public Object getNewObject() {		
	    return OrmFactory.eINSTANCE.createNaturalType();
	  }
	 
	  @Override public Object getObjectType() {
	    return NaturalType.class;
	  }
}
