package org.framed.orm.ui.factory;

import org.eclipse.gef.requests.CreationFactory;

import org.framed.orm.model.OrmFactory;
import org.framed.orm.model.RoleProhibition;

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
