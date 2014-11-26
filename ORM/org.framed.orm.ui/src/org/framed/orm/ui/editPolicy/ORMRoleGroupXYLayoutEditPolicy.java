package org.framed.orm.ui.editPolicy;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.RequestConstants;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.XYLayoutEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
import org.framed.orm.model.AbstractRole;
import org.framed.orm.model.Container;
import org.framed.orm.model.Node;
import org.framed.orm.model.RoleGroup;
import org.framed.orm.model.RoleType;
import org.framed.orm.ui.command.nodes.ORMShapeChangeBoundariesCommand;
import org.framed.orm.ui.command.nodes.ORMNodeCreateCommand;
import org.framed.orm.ui.figure.ORMRoleGroupFigure;

/**
 * This {@link XYLayoutEditPolicy} handels request for creation and boundarie changes of
 * {@link RoleType}s and {@link RoleGroup}s in a {@link RoleGroup} and returns and creates the
 * nessecary commands for the creation and boundarie change.
 * 
 * @author Kay Bierzynski
 * */
public class ORMRoleGroupXYLayoutEditPolicy extends ORMAbstractXYLayoutPolicy {


  /**
   * {@inheritDoc} Constraints means here boundaries.
   * 
   * @return {@link ORMShapeChangeBoundariesCommand}
   * */
  @Override
  protected Command createChangeConstraintCommand(final EditPart child, final Object constraint) {

    final ORMShapeChangeBoundariesCommand command = new ORMShapeChangeBoundariesCommand();
    command.setShape((Node) child.getModel());
    command.setNewBoundaries((Rectangle) constraint);

    return command;
  }

  /**
   * {@inheritDoc} Specifically the create commands for {@link RoleType}s and {@link RoleGroup}s
   * */
  @Override
  protected Command getCreateCommand(final CreateRequest request) {

    if (request.getNewObjectType().equals(RoleType.class)
        || request.getNewObjectType().equals(RoleGroup.class)) {
      ORMNodeCreateCommand command = new ORMNodeCreateCommand();
      Rectangle constraints = (Rectangle) getConstraintFor(request);
      // here are init size set
      command.setShape((Node) (request.getNewObject()));

      command.setBoundaries(new Rectangle(constraints.getLocation(), ORMAbstractXYLayoutPolicy
          .dynamicDimensions(request.getNewObjectType())));
      command.setContainer((Container) getHost().getModel());
      return command;
    }

    return null;
  }

  // TODO: an den neusten Stand anpassen
  /**
   * {@inheritDoc} In this case the backround color changes to blue when the user is about to
   * execute a possible command.
   */
  @Override
  protected void showLayoutTargetFeedback(final Request request) {
    if (request.getType() == RequestConstants.REQ_CREATE) {
      if (((CreateRequest) request).getNewObject() instanceof AbstractRole) {
        final ORMRoleGroupFigure figure = (ORMRoleGroupFigure) getHostFigure();
        figure.setBackgroundColor(ColorConstants.lightBlue);
        figure.setOpaque(true);
      }
    }
  }

  /** {@inheritDoc} */
  @Override
  protected void eraseLayoutTargetFeedback(final Request request) {
    final ORMRoleGroupFigure figure = (ORMRoleGroupFigure) getHostFigure();
    figure.setBackgroundColor(ColorConstants.white);
    figure.setOpaque(false);
  }
}
