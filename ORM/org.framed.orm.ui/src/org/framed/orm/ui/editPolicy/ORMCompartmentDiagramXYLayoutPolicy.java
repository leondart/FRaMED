package org.framed.orm.ui.editPolicy;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.RequestConstants;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.gef.editpolicies.XYLayoutEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
import org.framed.orm.model.Compartment;
import org.framed.orm.model.Container;
import org.framed.orm.model.Grouping;
import org.framed.orm.model.NaturalType;
import org.framed.orm.model.Node;
import org.framed.orm.model.OrmFactory;
import org.framed.orm.model.Rolemodel;
import org.framed.orm.ui.command.ORMGroupingCreateCommand;
import org.framed.orm.ui.command.ORMNodeChangeConstraintsCommand;
import org.framed.orm.ui.command.ORMRoleModelCreateCommand;
import org.framed.orm.ui.command.types.ORMCompartmentCreateCommand;
import org.framed.orm.ui.command.types.ORMNaturalTypeCreateCommand;

/**
 * @author Kay Bierzynski
 * */
public class ORMCompartmentDiagramXYLayoutPolicy extends XYLayoutEditPolicy {

  private static final Dimension DEFAULT_TYPE_DIMENSION = new Dimension(200, 200);
  private static final Dimension DEFAULT_TYPE_DIMENSION_ROLE_Natural = new Dimension(50, 50);

  /**
   * Command created top change the constraints of a {@link Node} instance.
   */
  @Override
  protected Command createChangeConstraintCommand(EditPart child, Object constraint) {
    ORMNodeChangeConstraintsCommand command = new ORMNodeChangeConstraintsCommand();
    command.setNode((Node) child.getModel());
    command.setNewConstraint((Rectangle) constraint);
    return command;
  }

  /**
   * Command created to add new compartment, grouping or natural type instances .
   */
  @Override
  protected Command getCreateCommand(CreateRequest request) {
    Command retVal = null;

    // if the request object is a compartment create the creatcommand for the compartment
    // and the creatcommand for the rolemodel, which belong to the compartment
    if (request.getNewObjectType().equals(Compartment.class)) {
      Rolemodel rm = OrmFactory.eINSTANCE.createRolemodel();
      Compartment ct = (Compartment) (request.getNewObject());
      CompoundCommand compoundcommand = new CompoundCommand();
      ct.setIsExpand(true);

      ORMRoleModelCreateCommand rmCommand = new ORMRoleModelCreateCommand();
      rmCommand.setCompartment(ct);
      rmCommand.setRolemodel(rm);
      compoundcommand.add(rmCommand);


      ORMCompartmentCreateCommand command = new ORMCompartmentCreateCommand();
      Rectangle constraints = (Rectangle) getConstraintFor(request);
      // here are init size set
      command.setConstraints(new Rectangle(constraints.getLocation(), DEFAULT_TYPE_DIMENSION));
      command.setContainer((Container) getHost().getModel());
      command.setCompartment(ct);
      command.setRolemodel(rm);

      compoundcommand.add(command);



      retVal = compoundcommand;
    }

    // if the request object is a grouping create the creatcommand for the grouping
    // and the creatcommand for the rolemodel, which belong to the grouping
    if (request.getNewObjectType().equals(Grouping.class)) {
      Rolemodel rm = OrmFactory.eINSTANCE.createRolemodel();
      Grouping group = (Grouping) (request.getNewObject());
      CompoundCommand compoundcommand = new CompoundCommand();

      ORMRoleModelCreateCommand rmCommand = new ORMRoleModelCreateCommand();
      rmCommand.setGroup(group);
      rmCommand.setRolemodel(rm);
      compoundcommand.add(rmCommand);

      ORMGroupingCreateCommand command = new ORMGroupingCreateCommand();
      Rectangle constraints = (Rectangle) getConstraintFor(request);
      // here are init size set
      command.setConstraints(new Rectangle(constraints.getLocation(), DEFAULT_TYPE_DIMENSION));
      command.setContainer((Container) getHost().getModel());
      command.setGrouping(group);
      command.setRolemodel(rm);

      compoundcommand.add(command);

      retVal = compoundcommand;
    }


    if (request.getNewObjectType().equals(NaturalType.class)) {
      ORMNaturalTypeCreateCommand command = new ORMNaturalTypeCreateCommand();
      Rectangle constraints = (Rectangle) getConstraintFor(request);

      // here are init size set
      command.setNaturalType((NaturalType) (request.getNewObject()));
      command.setConstraints(new Rectangle(constraints.getLocation(),
          DEFAULT_TYPE_DIMENSION_ROLE_Natural));
      command.setContainer((Container) getHost().getModel());

      retVal = command;
    }
    return retVal;
  }

  // Feedback
  // TODO: an den neusten Stand anpassen
  @Override
  protected void showLayoutTargetFeedback(Request request) {
    // the background color of the compartmentdiagram switch to blue when the request object is
    // compartment
    if (request.getType() == RequestConstants.REQ_CREATE) {
      if (((CreateRequest) request).getNewObjectType().equals(Compartment.class)) {
        Figure figure = (Figure) getHostFigure();
        figure.setBackgroundColor(ColorConstants.lightBlue);

        figure.setOpaque(true);
      }
    }
  }

  @Override
  protected void eraseLayoutTargetFeedback(Request request) {
    Figure figure = (Figure) getHostFigure();
    figure.setBackgroundColor(ColorConstants.white);

    figure.setOpaque(false);
  }

}
