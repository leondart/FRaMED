package orm.editPolicy;

import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.DirectEditPolicy;
import org.eclipse.gef.requests.DirectEditRequest;

import orm.command.AttributeMethodeCommands.ORMAttributeRenameCommand;
import orm.figure.LabelFigure;
import org.framed.orm.model.Attribute;

/**
 * @author Kay Bierzynski
 * */
public class ORMAttributeDirectEditPolicy extends DirectEditPolicy {

	@Override
	protected Command getDirectEditCommand(DirectEditRequest request) {
	
		ORMAttributeRenameCommand command = new ORMAttributeRenameCommand();
		command.setAttribute((Attribute) getHost().getModel());
		command.setNewName((String) request.getCellEditor().getValue());
			
		return command;
	}

	@Override
	protected void showCurrentEditValue(DirectEditRequest request) {
		String value = (String) request.getCellEditor().getValue();  
		((LabelFigure)getHostFigure()).setText(value);
	}

}
