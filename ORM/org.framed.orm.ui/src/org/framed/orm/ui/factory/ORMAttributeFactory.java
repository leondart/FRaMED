package org.framed.orm.ui.factory;

import org.eclipse.gef.requests.CreationFactory;

import org.framed.orm.model.OrmFactory;

/**
 * The ORMAttributeFactory creates an attribute object. Attributes are used e.g. in Compartments.
 * 
 * @author Kay Bierzynski
 * */
public class ORMAttributeFactory implements CreationFactory {
  
  public static int attribute = 100;
  
  @Override 
  public Object getNewObject() {		
    return OrmFactory.eINSTANCE.createNamedElement();
  }

  @Override 
  public Object getObjectType() {
    return attribute;
  }
}
