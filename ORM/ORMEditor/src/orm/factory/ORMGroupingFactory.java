package orm.factory;

import org.eclipse.gef.requests.CreationFactory;

import orm.model.Grouping;
import orm.model.OrmFactory;

/**
 * @author Kay Bierzynski
 * */
public class ORMGroupingFactory implements CreationFactory {
	
	@Override public Object getNewObject() {		
	    return OrmFactory.eINSTANCE.createGrouping();
	  }
	 
	  @Override public Object getObjectType() {
	    return Grouping.class;
	  }
	
}

