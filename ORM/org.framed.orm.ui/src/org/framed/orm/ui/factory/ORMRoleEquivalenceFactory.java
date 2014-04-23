package org.framed.orm.ui.factory;

import org.eclipse.gef.requests.CreationFactory;

import org.framed.orm.model.OrmFactory;
import org.framed.orm.model.RoleEquivalence;

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
