package org.framed.orm.ui.editPolicy;

import java.util.ArrayList;

import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.GraphicalNodeEditPolicy;
import org.eclipse.gef.requests.CreateConnectionRequest;
import org.eclipse.gef.requests.ReconnectRequest;
import org.framed.orm.model.Model;
import org.framed.orm.model.Relation;
import org.framed.orm.model.Type;
import org.framed.orm.ui.command.connectionkinds.ORMRelationCreateCommand;
import org.framed.orm.ui.editPart.connectionkinds.ORMRelationshipEditPart;

public class ORMRelationGraphicalNodeEditPolicy extends GraphicalNodeEditPolicy {

  @Override
  protected Command getConnectionCompleteCommand(CreateConnectionRequest request) {
    if (oSTCheck(request, Type.RELATIONSHIP_IMPLICATION, Type.RELATIONSHIP, Type.RELATIONSHIP)
        && tNotEqualSCheck(request) && testHasZeroRelation(request)) {
      return setupConnectionCompleteCommand(request);
    }
    return null;
  }

  @Override
  protected Command getConnectionCreateCommand(CreateConnectionRequest request) {
    if (oTCheck(request, Type.RELATIONSHIP_IMPLICATION, Type.RELATIONSHIP)) {
      Relation target = (Relation) request.getTargetEditPart().getModel();
      return setupConnectionStartCommand(request, target.getContainer());
    }
    return null;
  }

  @Override
  protected Command getReconnectTargetCommand(ReconnectRequest request) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  protected Command getReconnectSourceCommand(ReconnectRequest request) {
    // TODO Auto-generated method stub
    return null;
  }

  /**
   * This method completes and return the creation commands for all {@link Relation}s except for
   * {@link Relation}s from type cyclic, irreflexive and total.
   * 
   * @return {@link ORMRelationCreateCommand}
   * */
  private ORMRelationCreateCommand setupConnectionCompleteCommand(
      final CreateConnectionRequest request) {
    final ORMRelationCreateCommand result = (ORMRelationCreateCommand) request.getStartCommand();
    result.setTarget(((Relation) getHost().getModel()).getConnectionAnchor());
    return result;
  }

  /**
   * This method creates and return the creation command for all {@link Relation}s except the
   * relations from type cyclic, total and irrflexive.
   * 
   * @return {@link ORMRelationCreateCommand}
   * */
  private ORMRelationCreateCommand setupConnectionStartCommand(
      final CreateConnectionRequest request, final Model container) {
    final ORMRelationCreateCommand result = new ORMRelationCreateCommand();
    result.setSource(((Relation) getHost().getModel()).getConnectionAnchor());
    result.setRelation((Relation) request.getNewObject());
    result.setRelationContainer(container);

    request.setStartCommand(result);
    return result;
  }

  /**
   * This method tests if the type of the new object given by the request equals objecttye, the
   * source edit part model type given by the request equals the sourcetype and the target edit part
   * model type given by the request equals of targettype.
   * 
   * @fullname newObjectSourceEditPartTargetEditPartCheck
   * @return boolean
   * */
  private boolean oSTCheck(final CreateConnectionRequest request, final Type objecttype,
      final Type sourcetype, final Type targettype) {
    Relation source = (Relation) request.getSourceEditPart().getModel();
    Relation target = (Relation) request.getTargetEditPart().getModel();
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

  private boolean testHasZeroRelation(CreateConnectionRequest request) {
    if (request.getSourceEditPart() instanceof ORMRelationshipEditPart
        && request.getTargetEditPart() instanceof ORMRelationshipEditPart) {
      Relation targetrelation = (Relation) request.getTargetEditPart().getModel();
      Relation sourcerelation = (Relation) request.getSourceEditPart().getModel();
      ArrayList<Relation> targetRel = new ArrayList<Relation>();
      ArrayList<Relation> sourceRel = new ArrayList<Relation>();

      targetRel.addAll(targetrelation.getConnectionAnchor().getIncomingRelations());
      sourceRel.addAll(sourcerelation.getConnectionAnchor().getOutgoingRelations());

      targetRel.retainAll(sourceRel);
      if(targetRel.size() == 0){
        return true;
      }
    }
    return false;
  }
}
