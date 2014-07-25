package org.framed.orm.ui.factory;

import org.eclipse.gef.requests.CreationFactory;

import org.framed.orm.model.OrmFactory;
import org.framed.orm.model.RoleGroup;

/**
 * The ORMRoleGroupFactory creates a RoleGroup object.
 * 
 * @author Kay Bierzynski
 * */
public class ORMRoleGroupFactory implements CreationFactory {
	
	
  @Override 
  public Object getNewObject() {		
    return OrmFactory.eINSTANCE.createRoleGroup();
  }

  @Override 
  public Object getObjectType() {
    return RoleGroup.class;
  }
}
