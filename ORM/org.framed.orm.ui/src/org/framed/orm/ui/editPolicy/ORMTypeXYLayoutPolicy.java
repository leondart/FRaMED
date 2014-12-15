package org.framed.orm.ui.editPolicy;

import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.XYLayoutEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
import org.framed.orm.model.Attribute;
import org.framed.orm.model.Method;
import org.framed.orm.model.Type;
import org.framed.orm.ui.command.AttributeOperationCommands.ORMAttributeOperationCreateCommand;
import org.framed.orm.ui.command.AttributeOperationCommands.ORMMethodCreateCommand;

/**
 * This {@link XYLayoutEditPolicy} handels request for creation of all kinds {@link Attribute}s and
 * {@link Method}s in a {@link Type} and returns and creates the nessecary commands for the
 * creation.
 * 
 * @author Kay Bierzynski
 * */
public class ORMTypeXYLayoutPolicy extends XYLayoutEditPolicy {

  /**
   * {@inheritDoc} Specifically the create commands for all kinds of {@link Attribute}s and {@link Method}s.
   * */
  @Override
  protected Command getCreateCommand(final CreateRequest request) {
    Command retVal = null;
    
    if (request.getNewObjectType().equals(Method.class)) {
      final ORMMethodCreateCommand command = new ORMMethodCreateCommand();
      command.setContainer((Type) getHost().getModel());
      command.setMethod((Method) (request.getNewObject()));
      retVal = command;

    }

    if (request.getNewObjectType().equals(Attribute.class)) {
      final ORMAttributeOperationCreateCommand command = new ORMAttributeOperationCreateCommand();
      command.setParentSegment((Type) getHost().getModel());
      command.setElement((Attribute) (request.getNewObject()));
      retVal = command;

    }
    return retVal;
  }

}
