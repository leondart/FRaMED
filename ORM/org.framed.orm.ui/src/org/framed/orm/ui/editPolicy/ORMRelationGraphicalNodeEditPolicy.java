package org.framed.orm.ui.editPolicy;

import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.GraphicalNodeEditPolicy;
import org.eclipse.gef.requests.CreateConnectionRequest;
import org.eclipse.gef.requests.ReconnectRequest;
import org.framed.orm.model.Model;
import org.framed.orm.model.ModelElement;
import org.framed.orm.model.Relation;
import org.framed.orm.model.Type;
import org.framed.orm.ui.command.connectionkinds.ORMRelationCreateCommand;

/**
 * This {@link GraphicalNodeEditPolicy} handles request for the creations of all kinds of
 * {@link Relation}s between other {@link Relation}s and creates and returns the necessary commands
 * for that purpose. NewObject = O/o SourceEditPart = S/s TargetEditPart = T/t Model = M/m
 *
 * @author Kay Bierzynski
 * */
public class ORMRelationGraphicalNodeEditPolicy extends GraphicalNodeEditPolicy {


	private EditPolicyHandler editPolicyHandler;


  public ORMRelationGraphicalNodeEditPolicy(
			EditPolicyHandler editPolicyHandler) {
	  this.editPolicyHandler = editPolicyHandler;

		// TODO Auto-generated constructor stub
	}

/**
   * {@inheritDoc}
   *
   * @return {@link ORMRelationCreateCommand} or null(when no condition is fufilled)
   * */
  @Override
  protected Command getConnectionCompleteCommand(CreateConnectionRequest request) {
    // TODO: check if implementation is correct
    if ((oSTCheck(request, Type.RELATIONSHIP_IMPLICATION, Type.RELATIONSHIP, Type.RELATIONSHIP) || oSTCheck(
        request, Type.RELATIONSHIP_EXCLUSION, Type.RELATIONSHIP, Type.RELATIONSHIP))
        && tNotEqualSCheck(request)) {
      return setupConnectionCompleteCommand(request);
    }
    return null;
  }

  /**
   * {@inheritDoc}
   *
   * @return {@link ORMRelationCreateCommand} or null(when no condition is fufilled)
   * */
  @Override
  protected Command getConnectionCreateCommand(CreateConnectionRequest request) {
    // TODO: check if implementation is correct
    if (oTCheck(request, Type.RELATIONSHIP_IMPLICATION, Type.RELATIONSHIP)
        || oTCheck(request, Type.RELATIONSHIP_EXCLUSION, Type.RELATIONSHIP)) {
      Relation target = (Relation) request.getTargetEditPart().getModel();
      return setupConnectionStartCommand(request, target.getContainer());
    }
    return null;
  }

  /**
   * {@inheritDoc}
   *
   * @return null
   * */
  @Override
  protected Command getReconnectTargetCommand(ReconnectRequest request) {
    return null;
  }

  /**
   * {@inheritDoc}
   *
   * @return null
   * */
  @Override
  protected Command getReconnectSourceCommand(ReconnectRequest request) {
    return null;
  }

  /**
   * This method completes and return the creation commands for all {@link Relation}s except for
   * {@link Relation}s from type cyclic, irreflexive, acyclic, reflexive and total.
   *
   * @return {@link ORMRelationCreateCommand}
   * */
  private EditPolicyCommandDecorator<ORMRelationCreateCommand> setupConnectionCompleteCommand(
      final CreateConnectionRequest request) {
    //wrap command to automatically check editPolicies on canExecute of command
    final EditPolicyCommandDecorator<ORMRelationCreateCommand> result = (EditPolicyCommandDecorator) request.getStartCommand();
    result.getCmd().setTarget(((Relation) getHost().getModel()).getConnectionAnchor());
    return result;
  }

  /**
   * This method creates and return the creation command for all {@link Relation}s except the
   * relations from type cyclic, total, acyclic, reflexive and irrflexive.
   *
   * @return {@link ORMRelationCreateCommand}
   * */
  private EditPolicyCommandDecorator<ORMRelationCreateCommand> setupConnectionStartCommand(
      final CreateConnectionRequest request, final Model container) {
	  //wrap command to automatically check editPolicies on canExecute of command
    final EditPolicyCommandDecorator<ORMRelationCreateCommand> result = new EditPolicyCommandDecorator<ORMRelationCreateCommand>(new ORMRelationCreateCommand());
    result.setEditPolicyHandler(editPolicyHandler);
    result.getCmd().setSource(((Relation) getHost().getModel()).getConnectionAnchor());
    result.getCmd().setRelation((Relation) request.getNewObject());
    result.getCmd().setRelationContainer(container);

    request.setStartCommand(result);
    return result;
  }

  /**
   * This method tests if the type of the new object given by the request equals the objecttype, the
   * source edit part model type given by the request equals the sourcetype and the target edit part
   * model type given by the request equals of targettype.
   *
   * @fullname newObjectSourceEditPartTargetEditPartCheck
   * @return boolean
   * */
  private boolean oSTCheck(final CreateConnectionRequest request, final Type objecttype,
      final Type sourcetype, final Type targettype) {
	    ModelElement source = (ModelElement) request.getSourceEditPart().getModel();
	    ModelElement target = (ModelElement) request.getTargetEditPart().getModel();
	    return request.getNewObjectType().equals(objecttype) && targettype.equals(target.getType())
        && sourcetype.equals(source.getType());
  }


  /**
   * This method tests if the new object given by the request equals objecttype and the target edit
   * part model type given by the request equals targettype.
   *
   * @fullname newObjectTargetEditPartCheck
   * @return boolean
   * */
  private boolean oTCheck(final CreateConnectionRequest request, final Type objecttype,
      final Type targettype) {
    Relation target = (Relation) request.getTargetEditPart().getModel();
    return request.getNewObjectType().equals(objecttype) && targettype.equals(target.getType());
  }

  /**
   * This method tests if the source edit part given by the request doesn't equals the target edit
   * part given by the request.
   *
   * @fullname targetEditPartNotEqualSourceEditPartCheck
   * @return boolean
   * */
  private boolean tNotEqualSCheck(final CreateConnectionRequest request) {
    return !(request.getTargetEditPart().equals(request.getSourceEditPart()));
  }

}
