package org.framed.orm.ui.editPolicy;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.RequestConstants;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.requests.CreateRequest;
import org.framed.orm.model.AbstractRole;
import org.framed.orm.model.Container;
import org.framed.orm.model.Node;
import org.framed.orm.model.RoleGroup;
import org.framed.orm.model.RoleType;
import org.framed.orm.ui.command.nodes.ORMNodeChangeConstraintsCommand;
import org.framed.orm.ui.command.nodes.ORMNodeCreateCommand;
import org.framed.orm.ui.figure.ORMRoleGroupFigure;

/**
 * @author Kay Bierzynski
 * */
public class ORMRoleGroupXYLayoutEditPolicy extends ORMAbstractXYLayoutPolicy {

  private static final Dimension DEFAULT_TYPE_DIMENSION_ROLEGROUP = new Dimension(200, 100);

  @Override
  protected Command createChangeConstraintCommand(EditPart child, Object constraint) {

    ORMNodeChangeConstraintsCommand command = new ORMNodeChangeConstraintsCommand();
    command.setNode((Node) child.getModel());
    command.setNewConstraint((Rectangle) constraint);

    return command;
  }

  @Override
  protected Command getCreateCommand(CreateRequest request) {

    if (request.getNewObjectType().equals(RoleType.class)
        || request.getNewObjectType().equals(RoleGroup.class)) {
      ORMNodeCreateCommand command = new ORMNodeCreateCommand();
      Rectangle constraints = (Rectangle) getConstraintFor(request);
      // here are init size set
      command.setNode((Node) (request.getNewObject()));

      command.setConstraints(new Rectangle(constraints.getLocation(),
          DEFAULT_TYPE_DIMENSION_ROLEGROUP));
      command.setContainer((Container) getHost().getModel());
      return command;
    }

    return null;
  }

  // Feedback
  @Override
  protected void showLayoutTargetFeedback(Request request) {
    if (request.getType() == RequestConstants.REQ_CREATE) {
      if (((CreateRequest) request).getNewObject() instanceof AbstractRole) {
        ORMRoleGroupFigure figure = (ORMRoleGroupFigure) getHostFigure();
        figure.setBackgroundColor(ColorConstants.lightBlue);
        figure.setOpaque(true);
      }
    }
  }

  @Override
  protected void eraseLayoutTargetFeedback(Request request) {
    ORMRoleGroupFigure figure = (ORMRoleGroupFigure) getHostFigure();
    figure.setBackgroundColor(ColorConstants.white);
    figure.setOpaque(false);
  }
}
