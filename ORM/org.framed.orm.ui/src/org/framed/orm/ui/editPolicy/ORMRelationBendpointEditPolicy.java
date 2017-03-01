package org.framed.orm.ui.editPolicy;

import org.eclipse.draw2d.Bendpoint;
import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.BendpointEditPolicy;
import org.eclipse.gef.requests.BendpointRequest;
import org.framed.orm.geometry.GeometryFactory;
import org.framed.orm.model.Relation;
import org.framed.orm.ui.command.connectionkinds.ORMRelationCreateBendpointCommand;
import org.framed.orm.ui.command.connectionkinds.ORMRelationDeleteBendpointCommand;
import org.framed.orm.ui.command.connectionkinds.ORMRelationMoveBendpointCommand;



/**
 * Used to add {@link Bendpoint} handles on a ConnectionEditPart. The bendpoints are handeled
 * through the creation and returning of creation, deletion and moving command for Bendpoints.
 *
 * BendpointEditPolicy will automatically observe the org.eclipse.draw2d.Connection figure. If the
 * number of bends in the Connection changes, the handles will be updated.
 *
 * @author Kay Bierzynski
 */
public class ORMRelationBendpointEditPolicy extends BendpointEditPolicy {

  /**
   * This method creats and returns a command for the creation of a {@link Bendpoint}.
   *
   * @return {@link ORMRelationCreateBendpointCommand}
   */
  @Override
  protected Command getCreateBendpointCommand(final BendpointRequest request) {
    final ORMRelationCreateBendpointCommand command = new ORMRelationCreateBendpointCommand();

    Point p = request.getLocation();
    Connection conn = getConnection();

    conn.translateToRelative(p);
    Point sourceP = conn.getSourceAnchor().getReferencePoint();
    Point targetP = conn.getTargetAnchor().getReferencePoint();

    conn.translateToRelative(sourceP);
    conn.translateToRelative(targetP);


    command.setRelation((Relation) request.getSource().getModel());
    command.setDimension(p.getDifference(sourceP), p.getDifference(targetP));
    command.setIndex(request.getIndex());

    org.framed.orm.geometry.Point sourceRef = GeometryFactory.eINSTANCE.createPoint();
    sourceRef.setX(sourceP.x());
    sourceRef.setY(sourceP.y());
    command.setSourceRefence(sourceRef);
    org.framed.orm.geometry.Point targetRef = GeometryFactory.eINSTANCE.createPoint();
    sourceRef.setX(targetP.x());
    sourceRef.setY(targetP.y());
    command.setTargetRefence(targetRef);

    //wrap command to automatically check editPolicies on canExecute of command
    EditPolicyCommandDecorator<ORMRelationCreateBendpointCommand> cmd = new EditPolicyCommandDecorator<>(command);

    return cmd;
  }

  /**
   * This method creats and returns a command for changing the position of a {@link Bendpoint}.
   *
   * @return {@link ORMRelationMoveBendpointCommand}
   */
  @Override
  protected Command getMoveBendpointCommand(final BendpointRequest request) {
    final ORMRelationMoveBendpointCommand command = new ORMRelationMoveBendpointCommand();

    Point p = request.getLocation();
    Connection conn = getConnection();

    conn.translateToRelative(p);
    Point sourceP = conn.getSourceAnchor().getReferencePoint();
    Point targetP = conn.getTargetAnchor().getReferencePoint();

    conn.translateToRelative(sourceP);
    conn.translateToRelative(targetP);

    command.setRelation((Relation) request.getSource().getModel());
    command.setNewDimension(p.getDifference(sourceP), p.getDifference(targetP));
    command.setIndex(request.getIndex());

    //wrap command to automatically check editPolicies on canExecute of command
    EditPolicyCommandDecorator<ORMRelationMoveBendpointCommand> cmd = new EditPolicyCommandDecorator<>(command);

    return cmd;
  }

  /**
   * This method creats and returns a command for the deletion of a {@link Bendpoint}.
   *
   * @return {@link ORMRelationDeleteBendpointCommand}
   */
  @Override
  protected Command getDeleteBendpointCommand(final BendpointRequest request) {
	//wrap command to automatically check editPolicies on canExecute of command
    final EditPolicyCommandDecorator<ORMRelationDeleteBendpointCommand> command = new EditPolicyCommandDecorator<>(new ORMRelationDeleteBendpointCommand());
    //command.setEditPolicyHandler();
    command.getCmd().setRelation((Relation) request.getSource().getModel());
    command.getCmd().setIndex(request.getIndex());
    return command;
  }

}
