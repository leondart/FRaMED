package org.framed.orm.ui.factory;

import org.eclipse.gef.requests.CreationFactory;

import org.framed.orm.model.Compartment;
import org.framed.orm.model.OrmFactory;

/**
 * The ORMCompartmentFactory creates a Compartment Object, which includes Role Objects.
 * 
 * @author Kay Bierzynski
 * */
public class ORMCompartmentFactory implements CreationFactory {
	
  @Override 
  public Object getNewObject() {		
    return OrmFactory.eINSTANCE.createCompartment();
  }

  @Override 
  public Object getObjectType() {
    return Compartment.class;
  }
  
}
