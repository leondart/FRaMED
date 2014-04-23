package orm.factory;

import org.eclipse.gef.requests.CreationFactory;

import org.framed.orm.model.Irreflexive;
import org.framed.orm.model.OrmFactory;

/**
 * @author Kay Bierzynski
 * */
public class ORMIrreflexiveFactory implements CreationFactory{
	
	@Override public Object getNewObject() {
	    return OrmFactory.eINSTANCE.createIrreflexive();
	  }
	 
	  @Override public Object getObjectType() {
	    return Irreflexive.class;
	  }
}
