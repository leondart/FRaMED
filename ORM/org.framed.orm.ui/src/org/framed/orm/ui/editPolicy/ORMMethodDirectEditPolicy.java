package org.framed.orm.ui.editPolicy;

import org.eclipse.draw2d.Label;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.DirectEditPolicy;
import org.eclipse.gef.requests.DirectEditRequest;
import org.framed.orm.model.Method;
import org.framed.orm.ui.command.AttributeMethodCommands.ORMMethodRenameCommand;

/**
 * This {@link DirectEditPolicy} shows DirectEdit feedback and creates the Command to perform a
 * "direct edit" of a {@link Method} name. Direct Edit is when the User is editing a property of
 * an EditPart directly (as opposed to in the Properties View) in the Viewer using a
 * org.eclipse.jface.viewers.CellEditor. This EditPolicy is typically installed using
 * org.eclipse.gef.EditPolicy.DIRECT_EDIT_ROLE.
 * 
 * @author Kay Bierzynski
 * */
public class ORMMethodDirectEditPolicy extends DirectEditPolicy {

  /**
   * {@inheritDoc} In this specific EditPolicy the command, which is returned, is for renaming of a
   * {@link Method}.
   * 
   * @return command org.framed.orm.ui.command.AttributeMethodCommands.ORMMethodRenameCommand
   * */
  @Override
  protected Command getDirectEditCommand(final DirectEditRequest request) {

    final ORMMethodRenameCommand command = new ORMMethodRenameCommand();
    command.setMethod((Method) getHost().getModel());
    command.setNewName((String) request.getCellEditor().getValue());

    return command;
  }

  /** {@inheritDoc} */
  @Override
  protected void showCurrentEditValue(final DirectEditRequest request) {
    String value = (String) request.getCellEditor().getValue();
    ((Label) getHostFigure()).setText(value);
  }

}
