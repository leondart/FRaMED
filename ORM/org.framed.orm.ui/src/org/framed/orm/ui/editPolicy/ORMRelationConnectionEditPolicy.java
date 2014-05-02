package org.framed.orm.ui.editPolicy;

import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.ConnectionEditPolicy;
import org.eclipse.gef.requests.GroupRequest;
import org.framed.orm.model.Relation;
import org.framed.orm.model.RelationshipConstraint;
import org.framed.orm.ui.command.connectionkinds.ORMRealtionshipConstraintDeleteCommand;
import org.framed.orm.ui.command.connectionkinds.ORMRelationDeleteCommand;

/**
 * @author Kay Bierzynski
 * */
public class ORMRelationConnectionEditPolicy extends ConnectionEditPolicy {

  @Override
  protected Command getDeleteCommand(GroupRequest request) {
    Command retVal = null;

    if (getHost().getModel() instanceof RelationshipConstraint) {
      ORMRealtionshipConstraintDeleteCommand command = new ORMRealtionshipConstraintDeleteCommand();
      command.setRelationshipConstraint((RelationshipConstraint) getHost().getModel());
      retVal = command;
    } else {
      ORMRelationDeleteCommand command = new ORMRelationDeleteCommand();
      command.setRelation((Relation) getHost().getModel());
      retVal = command;
    }

    return retVal;
  }

}
