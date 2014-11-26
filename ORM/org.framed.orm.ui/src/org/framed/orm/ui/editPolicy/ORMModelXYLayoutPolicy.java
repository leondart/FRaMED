package org.framed.orm.ui.editPolicy;

import org.eclipse.draw2d.ColorConstants;
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
import org.framed.orm.model.Shape;
import org.framed.orm.model.OrmFactory;
import org.framed.orm.model.RoleGroup;
import org.framed.orm.model.RoleType;
import org.framed.orm.model.Rolemodel;
import org.framed.orm.ui.command.ORMRoleModelCreateCommand;
import org.framed.orm.ui.command.nodes.ORMCompartmentGroupingCreateCommand;
import org.framed.orm.ui.command.nodes.ORMShapeChangeBoundariesCommand;
import org.framed.orm.ui.command.nodes.ORMShapeCreateCommand;
import org.framed.orm.ui.editPart.ORMGroupingEditPart;
import org.framed.orm.ui.editPart.types.ORMCompartmentEditPart;
import org.framed.orm.ui.figure.ORMModelFigure;

/**
 * This {@link XYLayoutEditPolicy} handels request for creation and boundarie changes of
 * all kinds {@link Node}s in a {@link Rolemodel} and returns and creates the
 * nessecary commands for the creation and boundarie change.
 * 
 * @author Kay Bierzynski
 * */
public class ORMModelXYLayoutPolicy extends ORMAbstractXYLayoutPolicy {


  /**
   * {@inheritDoc} Constraints means here boundaries.
   * 
   * @return {@link ORMShapeChangeBoundariesCommand}
   * */
  @Override
  protected Command createChangeConstraintCommand(final EditPart child, final Object newBoundarie) {

    final ORMShapeChangeBoundariesCommand command = new ORMShapeChangeBoundariesCommand();
    command.setShape((Shape) child.getModel());
    command.setNewBoundaries((Rectangle) newBoundarie);

    return command;
  }
 
  /**
   * {@inheritDoc} Specifically the create commands for all kinds of {@link Node}s.
   * */
  @Override
  protected Command getCreateCommand(final CreateRequest request) {
    Command retVal = null;

    // when the parent of the rolemodel is a compartment only roletype and rolegroup instances can
    // be added
    if (!(getHost().getParent() instanceof ORMGroupingEditPart)) {
      if (request.getNewObjectType().equals(RoleType.class)
          || request.getNewObjectType().equals(RoleGroup.class)) {
        ORMShapeCreateCommand command = new ORMShapeCreateCommand();
        Rectangle constraints = (Rectangle) getConstraintFor(request);
        // here are init size set
        command.setShape((Node) (request.getNewObject()));

        command.setBoundaries(new Rectangle(constraints.getLocation(),
            ORMAbstractXYLayoutPolicy.dynamicDimensions(request.getNewObjectType())));
        command.setContainer((Container) getHost().getModel());
        retVal = command;
      }
    }

    // when the parent of the rolemodel is a grouping only naturaltype, compartment and grouping
    // instances can be added
    if (!(getHost().getParent() instanceof ORMCompartmentEditPart)) {
      if (request.getNewObjectType().equals(NaturalType.class)) {
        ORMShapeCreateCommand command = new ORMShapeCreateCommand();
        Rectangle constraints = (Rectangle) getConstraintFor(request);
        
        command.setShape((Node) (request.getNewObject()));
        // here are init size set
        command.setBoundaries(new Rectangle(constraints.getLocation(),
            ORMAbstractXYLayoutPolicy.dynamicDimensions(request.getNewObjectType())));
        command.setContainer((Container) getHost().getModel());
        retVal = command;
      }

      // if the request object is a compartment create the creatcommand for the compartment
      // and the creatcommand for the rolemodel, which belong to the compartment and add them to a
      // compund command
      
      if (request.getNewObjectType().equals(Compartment.class)) {
        Rolemodel rm = OrmFactory.eINSTANCE.createRolemodel();
        Compartment ct = (Compartment) (request.getNewObject());
        CompoundCommand compoundcommand = new CompoundCommand();

        ORMRoleModelCreateCommand rmCommand = new ORMRoleModelCreateCommand();
        rmCommand.setCompartment(ct);
        rmCommand.setRolemodel(rm);
        compoundcommand.add(rmCommand);

        ORMCompartmentGroupingCreateCommand command = new ORMCompartmentGroupingCreateCommand();
        Rectangle constraints = (Rectangle) getConstraintFor(request);
        // here are init size set
        command.setBoundaries(new Rectangle(constraints.getLocation(), ORMAbstractXYLayoutPolicy.dynamicDimensions(request.getNewObjectType())));
        command.setShape(ct);
        command.setRolemodel(rm);
        compoundcommand.add(command);
        command.setContainer((Container) getHost().getModel());
        retVal = compoundcommand;
      }

      // if the request object is a grouping create the creatcommand for the grouping
      // and the creatcommand for the rolemodel, which belong to the grouping and add them to a
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
        command.setBoundaries(new Rectangle(constraints.getLocation(), ORMAbstractXYLayoutPolicy.dynamicDimensions(request.getNewObjectType())));
        command.setShape(group);
        command.setRolemodel(rm);
        compoundcommand.add(command);
        command.setContainer((Container) getHost().getModel());
        retVal = compoundcommand;
      }
    }
    return retVal;
  }

  // TODO: an den neusten Stand anpassen
  /**
   * {@inheritDoc} In this case the backround color changes to blue when the user is about to
   * execute a possible command.
   */
  @Override
  protected void showLayoutTargetFeedback(final Request request) {
    if (request.getType() == RequestConstants.REQ_CREATE) {
      if (((CreateRequest) request).getNewObjectType().equals(RoleType.class)
          || ((CreateRequest) request).getNewObjectType().equals(Compartment.class)
          && getHost().getParent() instanceof ORMGroupingEditPart
          || ((CreateRequest) request).getNewObjectType().equals(NaturalType.class)
          && getHost().getParent() instanceof ORMGroupingEditPart
          || ((CreateRequest) request).getNewObjectType().equals(RoleGroup.class)) {
        final ORMModelFigure figure = (ORMModelFigure) getHostFigure();
        figure.setBackgroundColor(ColorConstants.lightBlue);
        figure.setOpaque(true);
      }
    }
  }

  /** {@inheritDoc} */
  @Override
  protected void eraseLayoutTargetFeedback(final Request request) {
    final ORMModelFigure figure = (ORMModelFigure) getHostFigure();
    figure.setBackgroundColor(ColorConstants.white);
    figure.setOpaque(false);
  }
}
