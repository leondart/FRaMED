package org.framed.orm.ui.editPolicy;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;
import org.eclipse.gef.editpolicies.ComponentEditPolicy;
import org.eclipse.gef.requests.GroupRequest;
import org.framed.orm.model.Compartment;
import org.framed.orm.model.Grouping;
import org.framed.orm.model.NaturalType;
import org.framed.orm.model.RoleType;
import org.framed.orm.ui.action.GoDownTreeAction;
import org.framed.orm.ui.action.GoUpTreeAction;
import org.framed.orm.ui.action.StepInNewPageAction;
import org.framed.orm.ui.action.StepOutNewPageAction;
import org.framed.orm.ui.command.GoDownTreeCommand;
import org.framed.orm.ui.command.GoUpTreeCommand;
import org.framed.orm.ui.command.ORMGroupingDeleteCommand;
import org.framed.orm.ui.command.StepInNewPageCommand;
import org.framed.orm.ui.command.StepOutNewPageCommand;
import org.framed.orm.ui.command.types.ORMCompartmentDeleteCommand;
import org.framed.orm.ui.command.types.ORMNaturalTypeDeleteCommand;
import org.framed.orm.ui.command.types.ORMRoleTypeDeleteCommand;
import org.framed.orm.ui.editPart.ORMCompartmentEditPart;
import org.framed.orm.ui.editPart.ORMGroupingEditPart;
import org.framed.orm.ui.figure.ORMCompartmentV1Figure;
import org.framed.orm.ui.figure.ORMGroupingV1Figure;

/**
 * @author Kay Bierzynski
 * */
public class ORMTypeComponentEditPolicy extends ComponentEditPolicy {
	
	@Override 
	protected Command createDeleteCommand(GroupRequest deleteRequest) {
		Command retVal = null;
		if(getHost().getModel() instanceof Compartment ){
			if(((ORMCompartmentEditPart)getHost()).getFigure() instanceof ORMCompartmentV1Figure ){
				ORMCompartmentDeleteCommand typeDeleteCommand = new ORMCompartmentDeleteCommand();
				typeDeleteCommand.setCompartment((Compartment) getHost().getModel());
				retVal = typeDeleteCommand;
			}
		}
		if(getHost().getModel() instanceof NaturalType){
			ORMNaturalTypeDeleteCommand typeDeleteCommand = new ORMNaturalTypeDeleteCommand();
	    	typeDeleteCommand.setType((NaturalType) getHost().getModel());
	    	retVal = typeDeleteCommand;
		}
		if(getHost().getModel() instanceof RoleType){
			ORMRoleTypeDeleteCommand typeDeleteCommand = new ORMRoleTypeDeleteCommand();
	    	typeDeleteCommand.setType((RoleType) getHost().getModel());
	    	retVal = typeDeleteCommand;
		}
		if(getHost().getModel() instanceof Grouping){
			if(((ORMGroupingEditPart)getHost()).getFigure() instanceof ORMGroupingV1Figure ){
				ORMGroupingDeleteCommand groupingDeleteCommand = new ORMGroupingDeleteCommand();
				groupingDeleteCommand.setGrouping((Grouping) getHost().getModel());
				retVal = groupingDeleteCommand;
			}
		}
	    return retVal;
	  }
	
	 private GoDownTreeCommand createGoDownTreeCommand() {
	        EditPart host =  getHost();
	        
	        GoDownTreeCommand command = new  GoDownTreeCommand();
	        command.setEditPart((AbstractGraphicalEditPart)host);
	        
	        return command;
	    }
	
	 
	 private GoUpTreeCommand createGoUpTreeCommand() {
	        EditPart host =  getHost();
	       
	        GoUpTreeCommand command = new  GoUpTreeCommand();
	        command.setEditPart((AbstractGraphicalEditPart)host);
	        return command;
	    }
	 
	 private StepInNewPageCommand createStepInNewPageCommand() {
	        EditPart host =  getHost();
	        
	        StepInNewPageCommand command = new StepInNewPageCommand();
	        command.setEditPart((AbstractGraphicalEditPart)host);
	        
	        return command;
	    }
	
	 
	 private StepOutNewPageCommand createStepOutNewPageCommand() {
	        EditPart host =  getHost();
	       
	        StepOutNewPageCommand command = new  StepOutNewPageCommand();
	        command.setEditPart((AbstractGraphicalEditPart)host);
	        return command;
	    }
	 
	/**
     * <p>Extends the parent implementation by handling incoming GO_DOWN_TREE, GO_UP_TREE, STEP_IN_NEW_PAGE and STEP_OUT_NEW_PAGE requests.</p>
     * <p>The parent implementation {@inheritDoc}</p>
     */
    @Override
    public Command getCommand(Request request) {
        if(request.getType().equals(GoDownTreeAction.GO_DOWN_TREE_REQUEST)){
            return createGoDownTreeCommand();
        }
        if(request.getType().equals(GoUpTreeAction.GO_UP_TREE_REQUEST)){
            return createGoUpTreeCommand();
        }
        if(request.getType().equals(StepInNewPageAction.STEP_IN_NEW_PAGE_REQUEST)){
            return createStepInNewPageCommand();
        }
        if(request.getType().equals(StepOutNewPageAction.STEP_OUT_NEW_PAGE_REQUEST)){
            return createStepOutNewPageCommand();
        }
        return super.getCommand(request);
    }
}
