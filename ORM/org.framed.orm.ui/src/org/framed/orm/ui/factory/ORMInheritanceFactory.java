package org.framed.orm.ui.factory;

import org.eclipse.gef.requests.CreationFactory;

import org.framed.orm.model.Inheritance;

import org.framed.orm.model.OrmFactory;

/**
 * The ORMInheritanceFactory creates a inheritance object.
 * 
 * @author Kay Bierzynski
 * */
public class ORMInheritanceFactory implements CreationFactory {
	
  @Override 
  public Object getNewObject() {		
    return OrmFactory.eINSTANCE.createInheritance();
  }

  @Override 
  public Object getObjectType() {
    return Inheritance.class;
  }
}
