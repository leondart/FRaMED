package orm.factory;

import org.eclipse.gef.requests.CreationFactory;

import orm.model.Inheritance;

import orm.model.OrmFactory;

/**
 * @author Kay Bierzynski
 * */
public class ORMInheritanceFactory implements CreationFactory {
	
	@Override public Object getNewObject() {		
	    return OrmFactory.eINSTANCE.createInheritance();
	  }
	 
	  @Override public Object getObjectType() {
	    return Inheritance.class;
	  }
}
