package orm.editPolicy;

import org.eclipse.draw2d.geometry.Point;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.BendpointEditPolicy;
import org.eclipse.gef.requests.BendpointRequest;

import orm.command.connectionkinds.ORMRelationCreateBendpointCommand;
import orm.command.connectionkinds.ORMRelationDeleteBendpointCommand;
import orm.command.connectionkinds.ORMRelationMoveBendpointCommand;
import orm.model.Relation;




/**
 * Policy used by the {@link Relation} to manage link bendpoints.
 * @author Kay Bierzynski
 */
public class ORMRelationBendpointEditPolicy extends BendpointEditPolicy {

	/**
	   * {@inheritDoc}
	   */
	  @Override protected Command getCreateBendpointCommand(final BendpointRequest request) {
	    ORMRelationCreateBendpointCommand command = new ORMRelationCreateBendpointCommand ();
	     
	    Point p = request.getLocation();
	     
	    command.setRelation((Relation) request.getSource().getModel());
	    command.setLocation(p);
	    command.setIndex(request.getIndex());
	     
	    return command;
	  }
	 
	  /**
	   * {@inheritDoc}
	   */
	  @Override protected Command getMoveBendpointCommand(final BendpointRequest request) {
		ORMRelationMoveBendpointCommand command = new ORMRelationMoveBendpointCommand();
	     
	    Point p = request.getLocation();
	     
	    command.setRelation((Relation) request.getSource().getModel());
	    command.setLocation(p);
	    command.setIndex(request.getIndex());
	     
	    return command;
	  }
	 
	  /**
	   * {@inheritDoc}
	   */
	  @Override protected Command getDeleteBendpointCommand(final BendpointRequest request) {
		ORMRelationDeleteBendpointCommand command = new ORMRelationDeleteBendpointCommand();
	     
	    command.setRelation((Relation)request.getSource().getModel());
	    command.setIndex(request.getIndex());
	    return command;
	  }

}
