package orm.factory;

import org.eclipse.gef.requests.CreationFactory;

import orm.model.OrmFactory;
import orm.model.Relationship;

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
