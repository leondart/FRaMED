package org.framed.orm.ui.factory;

import org.eclipse.gef.requests.CreationFactory;

import org.framed.orm.model.RoleImplication;
import org.framed.orm.model.OrmFactory;

/**
 * The ORMRoleImplicationFactory creates a RoleImplication relation object.
 * 
 * @author Kay Bierzynski
 * */
public class ORMRoleImplicationFactory implements CreationFactory{

  @Override 
  public Object getNewObject() {
    return OrmFactory.eINSTANCE.createRoleImplication();
  }

  @Override 
  public Object getObjectType() {
    return RoleImplication.class;
  }
}
