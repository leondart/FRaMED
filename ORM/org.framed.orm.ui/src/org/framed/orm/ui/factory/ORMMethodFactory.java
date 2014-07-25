package org.framed.orm.ui.factory;

import org.eclipse.gef.requests.CreationFactory;

import org.framed.orm.model.Method;
import org.framed.orm.model.OrmFactory;

/**
 * The ORMMethodFactory creates a method object. Methods are used like attributes e.g. in compartments.
 * 
 * @author Kay Bierzynski
 * */
public class ORMMethodFactory implements CreationFactory {

  @Override 
  public Object getNewObject() {		
    return OrmFactory.eINSTANCE.createMethod();
  }

  @Override 
  public Object getObjectType() {
    return Method.class;
  }

}
