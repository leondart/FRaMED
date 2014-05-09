package org.framed.orm.ui.editPolicy;

import org.eclipse.gef.EditPartViewer;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.gef.editpolicies.ConnectionEditPolicy;
import org.eclipse.gef.requests.GroupRequest;
import org.framed.orm.model.Relation;
import org.framed.orm.model.Relationship;
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
      retVal =
          setupRelationshipConstraintDelete((RelationshipConstraint) getHost().getModel(),
              getHost().getViewer());
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

  private ORMRealtionshipConstraintDeleteCommand setupRelationshipConstraintDelete(
      RelationshipConstraint rc, EditPartViewer epv) {
    ORMRealtionshipConstraintDeleteCommand command = new ORMRealtionshipConstraintDeleteCommand();
    command.setRelationshipConstraint(rc);
    command.setEPViewer(epv);
    return command;
  }

}
