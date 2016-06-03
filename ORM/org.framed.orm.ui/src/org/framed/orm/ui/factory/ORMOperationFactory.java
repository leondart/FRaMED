package org.framed.orm.ui.factory;

import org.eclipse.gef.requests.CreationFactory;

import org.framed.orm.model.OrmFactory;

/**
 * The ORMMethodFactory creates a method object. Methods are used like attributes e.g. in
 * compartments.
 * 
 * @author Kay Bierzynski
 * */
public class ORMOperationFactory implements CreationFactory {

  public static int operation = 101;

  @Override
  public Object getNewObject() {
    return OrmFactory.eINSTANCE.createNamedElement();
  }

  @Override
  public Object getObjectType() {
    return operation;
  }

}
