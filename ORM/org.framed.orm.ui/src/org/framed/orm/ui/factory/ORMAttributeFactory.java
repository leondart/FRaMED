package org.framed.orm.ui.factory;

import org.eclipse.gef.requests.CreationFactory;

import org.framed.orm.model.Attribute;
import org.framed.orm.model.OrmFactory;

/**
 * The ORMAttributeFactory creates an attribute object. Attributes are used e.g. in Compartments.
 * 
 * @author Kay Bierzynski
 * */
public class ORMAttributeFactory implements CreationFactory {
	
  @Override 
  public Object getNewObject() {		
    return OrmFactory.eINSTANCE.createAttribute();
  }

  @Override 
  public Object getObjectType() {
    return Attribute.class;
  }
}
