package orm.factory;

import org.eclipse.gef.requests.CreationFactory;

import orm.model.RoleImplication;
import orm.model.OrmFactory;

/**
 * @author Kay Bierzynski
 * */
public class ORMRoleImplicationFactory implements CreationFactory{
	
	@Override public Object getNewObject() {
	    return OrmFactory.eINSTANCE.createRoleImplication();
	  }
	 
	  @Override public Object getObjectType() {
	    return RoleImplication.class;
	  }
}
