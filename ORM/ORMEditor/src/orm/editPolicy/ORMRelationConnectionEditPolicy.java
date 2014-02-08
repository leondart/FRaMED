package orm.editPolicy;

import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.ConnectionEditPolicy;
import org.eclipse.gef.requests.GroupRequest;

import orm.command.connectionkinds.ORMRelationDeleteCommand;
import orm.model.Relation;

/**
 * @author Kay Bierzynski
 * */
public class ORMRelationConnectionEditPolicy extends ConnectionEditPolicy {
	
	@Override
	protected Command getDeleteCommand(GroupRequest request) {
	
		ORMRelationDeleteCommand command = new ORMRelationDeleteCommand();
		command.setRelation((Relation) getHost().getModel());
		
		return command;
	}

}
