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

	private EditPolicyHandler ep;

	public ORMSegmentXYLayoutPolicy(EditPolicyHandler ep)
	{
		super();
		this.ep = ep;
	}

  /**
   * {@inheritDoc} Specifically the create commands for attributes and methods.
   * */
  @Override
  protected Command getCreateCommand(final CreateRequest request) {
    Command retVal = null;

    if (getHost().getModel() instanceof Shape) {
      Shape shape = (Shape) getHost().getModel();
      if (shape.getFirstSegment() != null && shape.getSecondSegment() != null) {
        if (request.getNewObjectType().equals(ORMAttributeFactory.attribute)) {
        	//wrap command to automatically check editPolicies on canExecute of command
          final EditPolicyCommandDecorator<ORMAttributeOperationCreateCommand> command =
              new EditPolicyCommandDecorator<>(new ORMAttributeOperationCreateCommand());
          command.getCmd().setParentSegment(shape.getFirstSegment());
          command.getCmd().setElement((NamedElement) (request.getNewObject()));
          command.setEditPolicyHandler(ep);
          retVal = command;
        }

        if (request.getNewObjectType().equals(ORMOperationFactory.operation)) {
            //wrap command to automatically check editPolicies on canExecute of command
            final EditPolicyCommandDecorator<ORMAttributeOperationCreateCommand> command =
                    new EditPolicyCommandDecorator<>(new ORMAttributeOperationCreateCommand());
          command.getCmd().setParentSegment(shape.getSecondSegment());
          command.getCmd().setElement((NamedElement) (request.getNewObject()));
          command.setEditPolicyHandler(ep);
          retVal = command;
        }
      }

    }

    if (getHost().getModel() instanceof Segment) {
      Shape shape = (Shape) getHost().getParent().getModel();
      if (shape.getFirstSegment() != null && shape.getSecondSegment() != null) {
        if (request.getNewObjectType().equals(ORMAttributeFactory.attribute)) {
            //wrap command to automatically check editPolicies on canExecute of command
            final EditPolicyCommandDecorator<ORMAttributeOperationCreateCommand> command =
                    new EditPolicyCommandDecorator<>(new ORMAttributeOperationCreateCommand());
          command.getCmd().setParentSegment(shape.getFirstSegment());
          command.getCmd().setElement((NamedElement) (request.getNewObject()));
          command.setEditPolicyHandler(ep);
          retVal = command;
        }

        if (request.getNewObjectType().equals(ORMOperationFactory.operation)) {
            //wrap command to automatically check editPolicies on canExecute of command
            final EditPolicyCommandDecorator<ORMAttributeOperationCreateCommand> command =
                    new EditPolicyCommandDecorator<>(new ORMAttributeOperationCreateCommand());
          command.getCmd().setParentSegment(shape.getSecondSegment());
          command.getCmd().setElement((NamedElement) (request.getNewObject()));
          command.setEditPolicyHandler(ep);
          retVal = command;
        }
      }

    }
    return retVal;
  }

}
