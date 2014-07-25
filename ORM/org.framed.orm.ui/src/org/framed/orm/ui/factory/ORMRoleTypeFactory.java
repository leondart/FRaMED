package org.framed.orm.ui.factory;

import org.eclipse.gef.requests.CreationFactory;

import org.framed.orm.model.OrmFactory;
import org.framed.orm.model.RoleType;

/**
 * The ORMRoleTypeFactory creates a RoleType object.
 * 
 * @author Kay Bierzynski
 * */
public class ORMRoleTypeFactory implements CreationFactory {

  @Override 
  public Object getNewObject() {		
    return OrmFactory.eINSTANCE.createRoleType();
  }

  @Override 
  public Object getObjectType() {
    return RoleType.class;
  }

}
