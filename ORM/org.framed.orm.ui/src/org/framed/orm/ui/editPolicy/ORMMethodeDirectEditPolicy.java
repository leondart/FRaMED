package org.framed.orm.ui.editPolicy;

import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.DirectEditPolicy;
import org.eclipse.gef.requests.DirectEditRequest;
import org.framed.orm.model.Methode;
import org.framed.orm.ui.command.AttributeMethodeCommands.ORMMethodeRenameCommand;
import org.framed.orm.ui.figure.LabelFigure;

/**
 * @author Kay Bierzynski
 * */
public class ORMMethodeDirectEditPolicy extends DirectEditPolicy {

	@Override
	protected Command getDirectEditCommand(DirectEditRequest request) {
		
		ORMMethodeRenameCommand command = new ORMMethodeRenameCommand();
		command.setMethode((Methode) getHost().getModel());
		command.setNewName((String) request.getCellEditor().getValue());
			
		return command;
	}

	@Override
	protected void showCurrentEditValue(DirectEditRequest request) {
		String value = (String) request.getCellEditor().getValue();  
		((LabelFigure)getHostFigure()).setText(value);

	}

}
