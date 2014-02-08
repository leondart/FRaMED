package orm.factory;

import org.eclipse.gef.requests.CreationFactory;

import orm.model.OrmFactory;
import orm.model.RoleEquivalence;

/**
 * @author Kay Bierzynski
 * */
public class ORMRoleEquivalenceFactory implements CreationFactory{
	
	@Override public Object getNewObject() {
	    return OrmFactory.eINSTANCE.createRoleEquivalence();
	  }
	 
	  @Override public Object getObjectType() {
	    return RoleEquivalence.class;
	  }
}
