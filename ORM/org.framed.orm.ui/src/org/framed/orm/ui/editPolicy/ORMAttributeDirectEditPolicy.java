package org.framed.orm.ui.editPolicy;

import org.eclipse.draw2d.Label;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.DirectEditPolicy;
import org.eclipse.gef.requests.DirectEditRequest;
import org.framed.orm.model.Attribute;
import org.framed.orm.ui.command.AttributeMethodCommands.ORMAttributeRenameCommand;

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
    ((Label) getHostFigure()).setText(value);
  }

}
