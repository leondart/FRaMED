package org.framed.orm.ui.factory;

import org.eclipse.gef.requests.CreationFactory;

import org.framed.orm.model.Grouping;
import org.framed.orm.model.OrmFactory;

/**
 * The ORMGroupingFactory creates a grouping object.
 * 
 * @author Kay Bierzynski
 * */
public class ORMGroupingFactory implements CreationFactory {
	
  @Override 
  public Object getNewObject() {		
    return OrmFactory.eINSTANCE.createGrouping();
  }

  @Override 
  public Object getObjectType() {
    return Grouping.class;
  }

}

