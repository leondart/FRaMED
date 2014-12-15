package org.framed.orm.ui.editPolicy;

import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.XYLayoutEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
import org.framed.orm.model.NamedElement;
import org.framed.orm.model.Segment;
import org.framed.orm.model.Shape;
import org.framed.orm.ui.command.AttributeOperationCommands.ORMAttributeOperationCreateCommand;
import org.framed.orm.ui.factory.ORMAttributeFactory;
import org.framed.orm.ui.factory.ORMOperationFactory;

/**
 * This {@link XYLayoutEditPolicy} handles request for creation of attributes and operation in a
 * {@link Segment} and returns and creates the necessary commands for the creation.
 * 
 * @author Kay Bierzynski
 * */
public class ORMSegmentXYLayoutPolicy extends XYLayoutEditPolicy {

  /**
   * {@inheritDoc} Specifically the create commands for attributes and methods.
   * */
  @Override
  protected Command getCreateCommand(final CreateRequest request) {
    Command retVal = null;

    if (getHost().getParent().getModel() instanceof Shape) {
      Shape parent = (Shape) getHost().getParent().getModel();

      if (request.getNewObjectType().equals(ORMAttributeFactory.attribute)
          && parent.getFirstSegment().equals(getHost().getModel())) {
        final ORMAttributeOperationCreateCommand command = new ORMAttributeOperationCreateCommand();
        command.setParentSegment((Segment) getHost().getModel());
        command.setElement((NamedElement) (request.getNewObject()));
        retVal = command;
      }

      if (request.getNewObjectType().equals(ORMOperationFactory.operation)
          && parent.getSecondSegment().equals(getHost().getModel())) {
        final ORMAttributeOperationCreateCommand command = new ORMAttributeOperationCreateCommand();
        command.setParentSegment((Segment) getHost().getModel());
        command.setElement((NamedElement) (request.getNewObject()));
        retVal = command;
      }

    }
    return retVal;
  }

}
