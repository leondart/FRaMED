package orm.factory;

import org.eclipse.gef.requests.CreationFactory;

import orm.model.OrmFactory;
import orm.model.RoleProhibition;

/**
 * @author Kay Bierzynski
 * */
public class ORMRoleProhibitionFactory implements CreationFactory{
	
	@Override public Object getNewObject() {
	    return OrmFactory.eINSTANCE.createRoleProhibition();
	  }
	 
	  @Override public Object getObjectType() {
	    return RoleProhibition.class;
	  }
}
