package orm.factory;

import org.eclipse.gef.requests.CreationFactory;

import orm.model.OrmFactory;
import orm.model.RoleGroup;

/**
 * @author Kay Bierzynski
 * */
public class ORMRoleGroupFactory implements CreationFactory {
	
	
	@Override public Object getNewObject() {		
	    return OrmFactory.eINSTANCE.createRoleGroup();
	  }
	 
	  @Override public Object getObjectType() {
	    return RoleGroup.class;
	  }
}
