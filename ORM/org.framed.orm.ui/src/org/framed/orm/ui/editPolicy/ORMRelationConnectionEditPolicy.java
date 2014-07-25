package org.framed.orm.ui.editPolicy;

import org.eclipse.gef.EditPartViewer;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.gef.editpolicies.ConnectionEditPolicy;
import org.eclipse.gef.requests.GroupRequest;
import org.framed.orm.model.Relation;
import org.framed.orm.model.Relationship;
import org.framed.orm.model.RelationshipConstraint;
import org.framed.orm.ui.command.connectionkinds.CallRelationshipConstraintsActionCommand;
import org.framed.orm.ui.command.connectionkinds.ORMRelationshipConstraintDeleteCommand;
import org.framed.orm.ui.command.connectionkinds.ORMRelationDeleteCommand;
import org.framed.orm.ui.editPart.connectionkinds.ORMRelationshipConstraintEditPart;

/**
 * @author Kay Bierzynski
 * */
public class ORMRelationConnectionEditPolicy extends ConnectionEditPolicy {

  @Override
  protected Command getDeleteCommand(GroupRequest request) {
    Command retVal = null;

    if (getHost().getModel() instanceof RelationshipConstraint && getHost() instanceof ORMRelationshipConstraintEditPart) {
        CallRelationshipConstraintsActionCommand command = new CallRelationshipConstraintsActionCommand();
        command.setEditPart((ORMRelationshipConstraintEditPart) getHost());
        
        retVal = command;
       
    } else if (getHost().getModel() instanceof Relationship) {
      Relationship rlship = (Relationship) getHost().getModel();
      CompoundCommand compoundCommand = new CompoundCommand();

      for (RelationshipConstraint rc : rlship.getRlshipConstraints()) {
        compoundCommand.add(setupRelationshipConstraintDelete(rc, getHost().getViewer()));
      }

      compoundCommand.add(setupRelationDelete((Relation) getHost().getModel()));
      retVal = compoundCommand;
    } else {
      retVal = setupRelationDelete((Relation) getHost().getModel());
    }

    return retVal;
  }

  private ORMRelationDeleteCommand setupRelationDelete(Relation rel) {
    ORMRelationDeleteCommand command = new ORMRelationDeleteCommand();
    command.setRelation(rel);
    return command;
  }

  private ORMRelationshipConstraintDeleteCommand setupRelationshipConstraintDelete(
      RelationshipConstraint rc, EditPartViewer epv) {
    ORMRelationshipConstraintDeleteCommand command = new ORMRelationshipConstraintDeleteCommand();
    command.setRelationshipConstraint(rc);
    command.setEPViewer(epv);
    return command;
  }

}
