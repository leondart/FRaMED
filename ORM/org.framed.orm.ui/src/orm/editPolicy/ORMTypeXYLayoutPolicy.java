package orm.editPolicy;

import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.XYLayoutEditPolicy;
import org.eclipse.gef.requests.CreateRequest;

import orm.command.AttributeMethodeCommands.ORMAttributeCreateCommand;
import orm.command.AttributeMethodeCommands.ORMMethodeCreateCommand;
import org.framed.orm.model.Attribute;
import org.framed.orm.model.Methode;
import org.framed.orm.model.Type;

/**
 * @author Kay Bierzynski
 * */
public class ORMTypeXYLayoutPolicy extends XYLayoutEditPolicy {

	@Override
	protected Command getCreateCommand(CreateRequest request) {
		 Command retVal = null;
	     if(request.getNewObjectType().equals(Methode.class)){
	       ORMMethodeCreateCommand command = new  ORMMethodeCreateCommand();
	       command.setContainer((Type) getHost().getModel());
	       command.setMethode((Methode)(request.getNewObject()));
	       retVal = command;
	      
	     }
	     
	     if(request.getNewObjectType().equals(Attribute.class)){
		       ORMAttributeCreateCommand command = new  ORMAttributeCreateCommand();
		       command.setContainer((Type) getHost().getModel());
		       command.setAttribute((Attribute)(request.getNewObject()));
		       retVal = command;
		      
		     }
	     return retVal;
	}

}

