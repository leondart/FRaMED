package org.framed.orm.ui.editPolicy;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.RequestConstants;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.gef.requests.CreateRequest;
import org.framed.orm.model.Compartment;
import org.framed.orm.model.Container;
import org.framed.orm.model.Grouping;
import org.framed.orm.model.NaturalType;
import org.framed.orm.model.Node;
import org.framed.orm.model.OrmFactory;
import org.framed.orm.model.RoleGroup;
import org.framed.orm.model.RoleType;
import org.framed.orm.model.Rolemodel;
import org.framed.orm.ui.command.ORMRoleModelCreateCommand;
import org.framed.orm.ui.command.nodes.ORMCompartmentGroupingCreateCommand;
import org.framed.orm.ui.command.nodes.ORMNodeChangeBoundariesCommand;
import org.framed.orm.ui.command.nodes.ORMNodeCreateCommand;
import org.framed.orm.ui.editPart.ORMGroupingEditPart;
import org.framed.orm.ui.editPart.types.ORMCompartmentEditPart;
import org.framed.orm.ui.figure.ORMRolemodelFigure;

/**
 * @author Kay Bierzynski
 * */
public class ORMRolemodelXYLayoutPolicy extends ORMAbstractXYLayoutPolicy {

//  private static final Dimension DEFAULT_TYPE_DIMENSION = ORMAbstractXYLayoutPolicy.dynamicDimensions(null);
//  private static final Dimension DEFAULT_TYPE_DIMENSION_ROLE_NATRUAL = ORMAbstractXYLayoutPolicy.dynamicDimensions(NaturalType.class);
//  private static final Dimension DEFAULT_TYPE_DIMENSION_ROLEGROUP = ORMAbstractXYLayoutPolicy.dynamicDimensions(RoleGroup.class);

  /**
   * Command created top change the constraints of a {@link Node} instance.
   */
  @Override
  protected Command createChangeConstraintCommand(EditPart child, Object constraint) {

    ORMNodeChangeBoundariesCommand command = new ORMNodeChangeBoundariesCommand();
    command.setNode((Node) child.getModel());
    command.setNewBoundaries((Rectangle) constraint);

    return command;
  }

  /**
   * Command created to add new nodes to the Rolemodel. In future versions of the rolemodel only
   * roletype and rolegroup instances will be addebale.
   */
  @Override
  protected Command getCreateCommand(CreateRequest request) {
    Command retVal = null;

    // when the parent of the rolemodel is a compartment only roletype and rolegroup instances can
    // be added
    if (!(getHost().getParent() instanceof ORMGroupingEditPart)) {
      if (request.getNewObjectType().equals(RoleType.class)
          || request.getNewObjectType().equals(RoleGroup.class)) {
        ORMNodeCreateCommand command = new ORMNodeCreateCommand();
        Rectangle constraints = (Rectangle) getConstraintFor(request);
        // here are init size set
        command.setNode((Node) (request.getNewObject()));

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
        ORMNodeCreateCommand command = new ORMNodeCreateCommand();
        Rectangle constraints = (Rectangle) getConstraintFor(request);

        System.out.println("Creating natural type");
        
        command.setNode((Node) (request.getNewObject()));
        // here are init size set
        command.setBoundaries(new Rectangle(constraints.getLocation(),
            ORMAbstractXYLayoutPolicy.dynamicDimensions(request.getNewObjectType())));
        command.setContainer((Container) getHost().getModel());
        retVal = command;
      }

      // if the request object is a compartment create the creatcommand for the compartment
      // and the creatcommand for the rolemodel, which belong to the compartment
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
        command.setNode(ct);
        command.setRolemodel(rm);
        compoundcommand.add(command);
        command.setContainer((Container) getHost().getModel());
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

        ORMCompartmentGroupingCreateCommand command = new ORMCompartmentGroupingCreateCommand();
        Rectangle constraints = (Rectangle) getConstraintFor(request);
        // here are init size set
        command.setBoundaries(new Rectangle(constraints.getLocation(), ORMAbstractXYLayoutPolicy.dynamicDimensions(request.getNewObjectType())));
        command.setNode(group);
        command.setRolemodel(rm);
        compoundcommand.add(command);
        command.setContainer((Container) getHost().getModel());
        retVal = compoundcommand;
      }
    }
    return retVal;
  }

  // Feedback
  // TODO: an den neusten Stand anpassem
  @Override
  protected void showLayoutTargetFeedback(Request request) {
    if (request.getType() == RequestConstants.REQ_CREATE) {
      if (((CreateRequest) request).getNewObjectType().equals(RoleType.class)
          || ((CreateRequest) request).getNewObjectType().equals(Compartment.class)
          && getHost().getParent() instanceof ORMGroupingEditPart
          || ((CreateRequest) request).getNewObjectType().equals(NaturalType.class)
          && getHost().getParent() instanceof ORMGroupingEditPart
          || ((CreateRequest) request).getNewObjectType().equals(RoleGroup.class)) {
        ORMRolemodelFigure figure = (ORMRolemodelFigure) getHostFigure();
        figure.setBackgroundColor(ColorConstants.lightBlue);
        figure.setOpaque(true);
      }
    }
  }

  @Override
  protected void eraseLayoutTargetFeedback(Request request) {
    ORMRolemodelFigure figure = (ORMRolemodelFigure) getHostFigure();
    figure.setBackgroundColor(ColorConstants.white);
    figure.setOpaque(false);
  }
}
