package org.framed.orm.ui.editPolicy;

import org.eclipse.gef.EditPartViewer;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.gef.editpolicies.ConnectionEditPolicy;
import org.eclipse.gef.requests.GroupRequest;
import org.framed.orm.model.Relation;
import org.framed.orm.model.Relationship;
import org.framed.orm.model.RelationshipConstraint;
import org.framed.orm.ui.action.RelationshipConstraintsAction;
import org.framed.orm.ui.action.RolesDialog;
import org.framed.orm.ui.command.connectionkinds.CallRelationshipConstraintsActionCommand;
import org.framed.orm.ui.command.connectionkinds.ORMRelationshipConstraintDeleteCommand;
import org.framed.orm.ui.command.connectionkinds.ORMRelationDeleteCommand;
import org.framed.orm.ui.editPart.connectionkinds.ORMRelationshipConstraintEditPart;

/**
 * This {@link ConnectionEditPolicy} handels requests for the deletion of {@link Relation}s and
 * returns and creats the deletion commands for this purpose.
 * 
 * @author Kay Bierzynski
 * */
public class ORMRelationConnectionEditPolicy extends ConnectionEditPolicy {

  /**
   * This method creats and returns command for the deletion of {@link Relation}s. When the
   * {@link Relation}, which the user wants to be deleted, is {@link Relationship} than the deletion
   * command for {@link RelationshipConstraint}s of the Relationship are created and returned as
   * well, because a {@link RelationshipConstraint} can only exist with a {@link Relationship}. When
   * the {@link Relation}, which the user wants to be deleted, is a {@link RelationshipConstraint}
   * than the {@link CallRelationshipConstraintsActionCommand} is created and returned, because the
   * deletion of {@link RelationshipConstraint}s is spefically handled in this editor through the
   * {@link RelationshipConstraintsAction} and the {@link RolesDialog}.
   * 
   * */
  @Override
  protected Command getDeleteCommand(final GroupRequest request) {
    Command retVal = null;

    if (getHost().getModel() instanceof RelationshipConstraint
        && getHost() instanceof ORMRelationshipConstraintEditPart) {
      CallRelationshipConstraintsActionCommand command =
          new CallRelationshipConstraintsActionCommand();
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

  /**
   * This method creates and return the deletion commands for all {@link Relation}s except for
   * {@link RelationshipConstraint}s.
   * 
   * @return {@link ORMRelationDeleteCommand}
   * */
  private ORMRelationDeleteCommand setupRelationDelete(final Relation rel) {
    final ORMRelationDeleteCommand command = new ORMRelationDeleteCommand();
    command.setRelation(rel);
    return command;
  }

  /**
   * This method creates and return the deletion command for all {@link RelationshipConstraint}s.
   * 
   * @return {@link ORMRelationshipConstraintDeleteCommand }
   * */
  private ORMRelationshipConstraintDeleteCommand setupRelationshipConstraintDelete(
      final RelationshipConstraint rc, final EditPartViewer epv) {
    final ORMRelationshipConstraintDeleteCommand command =
        new ORMRelationshipConstraintDeleteCommand();
    command.setRelationshipConstraint(rc);
    command.setEPViewer(epv);
    return command;
  }

}
