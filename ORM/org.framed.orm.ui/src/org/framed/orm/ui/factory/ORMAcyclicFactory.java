package org.framed.orm.ui.factory;

import org.eclipse.gef.requests.CreationFactory;

import org.framed.orm.model.Acyclic;
import org.framed.orm.model.OrmFactory;

/**
 * This factory creates an Acyclic Object. This is a relationship object.
 * 
 * @author Kay Bierzynski
 * */
public class ORMAcyclicFactory implements CreationFactory {

  @Override
  public Object getNewObject() {
    return OrmFactory.eINSTANCE.createAcyclic();
  }

  @Override
  public Object getObjectType() {
    return Acyclic.class;
  }

}
