package orm.factory;

import org.eclipse.gef.requests.CreationFactory;

import org.framed.orm.model.Grouping;
import org.framed.orm.model.OrmFactory;

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

