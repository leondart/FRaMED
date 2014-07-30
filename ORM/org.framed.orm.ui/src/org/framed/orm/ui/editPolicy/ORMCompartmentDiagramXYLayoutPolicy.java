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
import org.framed.orm.model.CompartmentDiagram;
import org.framed.orm.model.Container;
import org.framed.orm.model.Grouping;
import org.framed.orm.model.NaturalType;
import org.framed.orm.model.Node;
import org.framed.orm.model.OrmFactory;
import org.framed.orm.model.RoleType;
import org.framed.orm.model.Rolemodel;
import org.framed.orm.model.Type;
import org.framed.orm.ui.command.ORMRoleModelCreateCommand;
import org.framed.orm.ui.command.nodes.ORMCompartmentGroupingCreateCommand;
import org.framed.orm.ui.command.nodes.ORMNodeChangeBoundariesCommand;
import org.framed.orm.ui.command.nodes.ORMNodeCreateCommand;

/**
 * This {@link XYLayoutEditPolicy} handels request for creation and boundarie changes of
 * {@link Compartment}s, {@link Grouping}s and {@link NaturalType}s in a {@link CompartmentDiagram}
 * and returns and creates the nessecary commands for the creation and boundarie change.
 * 
 * @author Kay Bierzynski
 * */
public class ORMCompartmentDiagramXYLayoutPolicy extends XYLayoutEditPolicy {

  /** Default dimesnion of a {@link Type}. */
  private static final Dimension DEFAULT_TYPE_DIMENSION = ORMAbstractXYLayoutPolicy
      .dynamicDimensions(null);
  /** Default dimesnion of a {@link NaturalType}s and {@link RoleType}s. */
  private static final Dimension DEFAULT_TYPE_DIMENSION_ROLE_NATURAL = ORMAbstractXYLayoutPolicy
      .dynamicDimensions(NaturalType.class);

  /**
   * {@inheritDoc} Constraints means here boundaries.
   * 
   * @return {@link ORMNodeChangeBoundariesCommand}
   * */
  @Override
  protected Command createChangeConstraintCommand(final EditPart child, final Object constraint) {
    ORMNodeChangeBoundariesCommand command = new ORMNodeChangeBoundariesCommand();
    command.setNode((Node) child.getModel());
    command.setNewBoundaries((Rectangle) constraint);
    return command;
  }

  /**
   * {@inheritDoc} Specifically the create commands for {@link Compartment}s, {@link Grouping}s and
   * {@link NaturalType}s.
   * */
  @Override
  protected Command getCreateCommand(final CreateRequest request) {
    Command retVal = null;

    // if the request object is a compartment create the creatcommand for the compartment
    // and the creatcommand for the rolemodel, which belong to the compartment, and add them to a
    // compund command
    if (request.getNewObjectType().equals(Compartment.class)) {
      Rolemodel rm = OrmFactory.eINSTANCE.createRolemodel();
      Compartment ct = (Compartment) (request.getNewObject());
      CompoundCommand compoundcommand = new CompoundCommand();
      ct.setIsExpand(true);

      ORMRoleModelCreateCommand rmCommand = new ORMRoleModelCreateCommand();
      rmCommand.setCompartment(ct);
      rmCommand.setRolemodel(rm);
      compoundcommand.add(rmCommand);


      ORMCompartmentGroupingCreateCommand command = new ORMCompartmentGroupingCreateCommand();
      Rectangle constraints = (Rectangle) getConstraintFor(request);
      // here are init size set
      command.setBoundaries(new Rectangle(constraints.getLocation(), DEFAULT_TYPE_DIMENSION));
      command.setContainer((Container) getHost().getModel());
      command.setNode(ct);
      command.setRolemodel(rm);

      compoundcommand.add(command);



      retVal = compoundcommand;
    }

    // if the request object is a grouping create the creatcommand for the grouping
    // and the creatcommand for the rolemodel, which belong to the grouping, and add them to a
    // compund command
    if (request.getNewObjectType().equals(Grouping.class)) {
      Rolemodel rm = OrmFactory.eINSTANCE.createRolemodel();
      Grouping group = (Grouping) (request.getNewObject());
      CompoundCommand compoundcommand = new CompoundCommand();

      ORMRoleModelCreateCommand rmCommand = new ORMRoleModelCreateCommand();
      rmCommand.setGroup(group);
      rmCommand.setRolemodel(rm);
      compoundcommand.add(rmCommand);

      ORMCompartmentGroupingCreateCommand command = new ORMCompartmentGroupingCreateCommand();
      Rectangle constraints = (Rectangle) getConstraintFor(request);
      // here are init size set
      command.setBoundaries(new Rectangle(constraints.getLocation(), DEFAULT_TYPE_DIMENSION));
      command.setContainer((Container) getHost().getModel());
      command.setNode(group);
      command.setRolemodel(rm);

      compoundcommand.add(command);

      retVal = compoundcommand;
    }


    if (request.getNewObjectType().equals(NaturalType.class)) {
      ORMNodeCreateCommand command = new ORMNodeCreateCommand();
      Rectangle constraints = (Rectangle) getConstraintFor(request);

      // here are init size set
      command.setNode((Node) (request.getNewObject()));
      command.setBoundaries(new Rectangle(constraints.getLocation(),
          DEFAULT_TYPE_DIMENSION_ROLE_NATURAL));
      command.setContainer((Container) getHost().getModel());

      retVal = command;
    }
    return retVal;
  }



  // TODO: an den neusten Stand anpassen
  /**
   * {@inheritDoc} In this case the backround color changes to blue when the user is about to
   * execute a possible command.
   */
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

  /** {@inheritDoc} */
  @Override
  protected void eraseLayoutTargetFeedback(Request request) {
    Figure figure = (Figure) getHostFigure();
    figure.setBackgroundColor(ColorConstants.white);

    figure.setOpaque(false);
  }

}
