package orm.factory;

import org.eclipse.gef.requests.CreationFactory;

import org.framed.orm.model.Methode;
import org.framed.orm.model.OrmFactory;

/**
 * @author Kay Bierzynski
 * */
public class ORMMethodeFactory implements CreationFactory {
	
	@Override public Object getNewObject() {		
	    return OrmFactory.eINSTANCE.createMethode();
	  }
	 
	  @Override public Object getObjectType() {
	    return Methode.class;
	  }
	
}
