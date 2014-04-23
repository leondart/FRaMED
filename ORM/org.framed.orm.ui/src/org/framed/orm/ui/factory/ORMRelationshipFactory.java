package org.framed.orm.ui.factory;

import org.eclipse.gef.requests.CreationFactory;

import org.framed.orm.model.OrmFactory;
import org.framed.orm.model.Relationship;

/**
 * @author Kay Bierzynski
 * */
public class ORMRelationshipFactory implements CreationFactory{
	
	@Override public Object getNewObject() {
	    return OrmFactory.eINSTANCE.createRelationship();
	  }
	 
	  @Override public Object getObjectType() {
	    return Relationship.class;
	  }
}
