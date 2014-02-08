package orm.editPolicy;


import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.DirectEditPolicy;
import org.eclipse.gef.requests.DirectEditRequest;

import orm.command.ORMNodeRenameCommand;
import orm.figure.ORMGroupingV1Figure;
import orm.figure.ORMGroupingV2Figure;
import orm.figure.ORMRoleGroupFigure;
import orm.figure.ORMTypeFigure;
import orm.model.Node;

/**
 * @author Kay Bierzynski
 * */
public class ORMNodeDirectEditPolicy extends DirectEditPolicy {

	@Override
	protected Command getDirectEditCommand(DirectEditRequest request) {
		 
	
			ORMNodeRenameCommand command = new ORMNodeRenameCommand();
		    command.setModel((Node) getHost().getModel());
		    command.setNewName((String) request.getCellEditor().getValue());
		
		    return command;
	}

	@Override
	protected void showCurrentEditValue(DirectEditRequest request) {
		String value = (String) request.getCellEditor().getValue(); 
		if(getHostFigure() instanceof ORMTypeFigure)   ((ORMTypeFigure)getHostFigure()).getLabel().setText(value);
		if(getHostFigure() instanceof ORMRoleGroupFigure)   ((ORMRoleGroupFigure)getHostFigure()).getLabel().setText(value);
		if(getHostFigure() instanceof ORMGroupingV1Figure)   ((ORMGroupingV1Figure)getHostFigure()).getLabel().setText(value);
		if(getHostFigure() instanceof ORMGroupingV2Figure)   ((ORMGroupingV2Figure)getHostFigure()).getLabel().setText(value);
	}

}
