package org.framed.orm.ui.editPolicy;

import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.XYLayoutEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
import org.framed.orm.model.Attribute;
import org.framed.orm.model.Method;
import org.framed.orm.model.Type;
import org.framed.orm.ui.command.AttributeMethodCommands.ORMAttributeCreateCommand;
import org.framed.orm.ui.command.AttributeMethodCommands.ORMMethodCreateCommand;

/**
 * @author Kay Bierzynski
 * */
public class ORMTypeXYLayoutPolicy extends XYLayoutEditPolicy {

  @Override
  protected Command getCreateCommand(CreateRequest request) {
    Command retVal = null;
    if (request.getNewObjectType().equals(Method.class)) {
      ORMMethodCreateCommand command = new ORMMethodCreateCommand();
      command.setContainer((Type) getHost().getModel());
      command.setMethod((Method) (request.getNewObject()));
      retVal = command;

    }

    if (request.getNewObjectType().equals(Attribute.class)) {
      ORMAttributeCreateCommand command = new ORMAttributeCreateCommand();
      command.setContainer((Type) getHost().getModel());
      command.setAttribute((Attribute) (request.getNewObject()));
      retVal = command;

    }
    return retVal;
  }

}
