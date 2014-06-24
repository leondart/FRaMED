package org.framed.orm.ui.editPolicy;

import org.eclipse.draw2d.Label;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.DirectEditPolicy;
import org.eclipse.gef.requests.DirectEditRequest;
import org.framed.orm.model.Method;
import org.framed.orm.ui.command.AttributeMethodCommands.ORMMethodRenameCommand;

/**
 * @author Kay Bierzynski
 * */
public class ORMMethodDirectEditPolicy extends DirectEditPolicy {

  @Override
  protected Command getDirectEditCommand(DirectEditRequest request) {

    ORMMethodRenameCommand command = new ORMMethodRenameCommand();
    command.setMethod((Method) getHost().getModel());
    command.setNewName((String) request.getCellEditor().getValue());

    return command;
  }

  @Override
  protected void showCurrentEditValue(DirectEditRequest request) {
    String value = (String) request.getCellEditor().getValue();
    ((Label) getHostFigure()).setText(value);
  }

}
