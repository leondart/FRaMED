package orm.editPolicy;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.GraphicalNodeEditPolicy;
import org.eclipse.gef.requests.CreateConnectionRequest;
import org.eclipse.gef.requests.ReconnectRequest;

import orm.command.connectionkinds.ORMRelationCreateCommand;
import orm.editPart.ORMCompartmentEditPart;
import orm.editPart.ORMGroupingEditPart;
import orm.editPart.ORMRoleGroupEditPart;
import orm.editPart.ORMRolemodelEditPart;
import orm.editPart.types.ORMNaturalTypeEditPart;
import orm.editPart.types.ORMRoleTypeEditPart;
import orm.model.AbstractRole;
import orm.model.Compartment;
import orm.model.Fulfilment;
import orm.model.Inheritance;
import orm.model.NaturalType;
import orm.model.Node;
import orm.model.Relation;
import orm.model.Relationship;
import orm.model.RelationshipConstraint;
import orm.model.RoleEquivalence;
import orm.model.RoleImplication;
import orm.model.RoleProhibition;
import orm.model.RoleType;

/**
 * This class handels the create logic of relations.
 * For the specification of the logic look up the model description.
 * @author Kay Bierzynski
 * */
public class ORMNodeGraphicalNodeEditPolicy extends GraphicalNodeEditPolicy {

	@Override
	protected Command getConnectionCompleteCommand(CreateConnectionRequest request) {
		Command retVal = null;
		//Fulfiment End
		if(request.getNewObjectType().equals(Fulfilment.class) && request.getSourceEditPart() instanceof ORMNaturalTypeEditPart 
		   && request.getTargetEditPart().getModel() instanceof Compartment ||
		   request.getNewObjectType().equals(Fulfilment.class) && request.getSourceEditPart() instanceof ORMCompartmentEditPart 
		   && request.getTargetEditPart().getModel() instanceof Compartment){
			ORMRelationCreateCommand result =  (ORMRelationCreateCommand) request.getStartCommand();
			 result.setTargetNode((Node)getHost().getModel());
			 retVal = result;
		}
		//Role Implication End
		if(request.getNewObjectType().equals(RoleImplication.class) && request.getSourceEditPart().getModel() instanceof AbstractRole
		   && request.getTargetEditPart().getModel() instanceof AbstractRole && !(request.getTargetEditPart().equals(request.getSourceEditPart()))
		   && request.getTargetEditPart().getParent() instanceof ORMRolemodelEditPart){
			 ORMRelationCreateCommand result =  (ORMRelationCreateCommand) request.getStartCommand();
			 result.setTargetNode((Node)getHost().getModel());
			 retVal = result;
		}
		// Role Equilvalence End
		if(testRoleEquilvalence(request)){
			 ORMRelationCreateCommand result =  (ORMRelationCreateCommand) request.getStartCommand();
			 result.setTargetNode((Node)getHost().getModel());
			 retVal = result;
		}
		//Role Prohibition End
		if(request.getNewObjectType().equals(RoleProhibition.class) && request.getSourceEditPart() instanceof ORMRoleTypeEditPart 
		   && request.getTargetEditPart() instanceof ORMRoleTypeEditPart  && !(request.getTargetEditPart().equals(request.getSourceEditPart()))
		   && request.getTargetEditPart().getParent() instanceof ORMRolemodelEditPart){
			ORMRelationCreateCommand result =  (ORMRelationCreateCommand) request.getStartCommand();
			result.setTargetNode((Node)getHost().getModel());
			retVal = result;
		}
		//Inheritance End
		if(testInheritance(request)){
			ORMRelationCreateCommand result =  (ORMRelationCreateCommand) request.getStartCommand();
			result.setTargetNode((Node)getHost().getModel());
			retVal = result;
		}
		//Relationship End
		if(request.getNewObjectType().equals(Relationship.class) && request.getSourceEditPart() instanceof ORMRoleTypeEditPart 
		   && request.getTargetEditPart() instanceof ORMRoleTypeEditPart  && !(request.getTargetEditPart().equals(request.getSourceEditPart()))
		   && (request.getTargetEditPart().getParent() instanceof ORMRolemodelEditPart ||  request.getTargetEditPart().getParent() instanceof ORMRoleGroupEditPart)){
			 ORMRelationCreateCommand result =  (ORMRelationCreateCommand) request.getStartCommand();
			 result.setTargetNode((Node)getHost().getModel());
			 retVal = result;
		}
		
		//Irreflexive Acyclic Total End
		if(request.getNewObject() instanceof RelationshipConstraint && request.getSourceEditPart() instanceof ORMRoleTypeEditPart 
		   && request.getTargetEditPart() instanceof ORMRoleTypeEditPart  && !(request.getTargetEditPart().equals(request.getSourceEditPart()))
		   && (request.getTargetEditPart().getParent() instanceof ORMRolemodelEditPart ||  request.getTargetEditPart().getParent() instanceof ORMRoleGroupEditPart)
		   && testIrreflexiveTotalAcylic(request,true)){
			 ORMRelationCreateCommand result =  (ORMRelationCreateCommand) request.getStartCommand();
			 result.setTargetNode((Node)getHost().getModel());
			 retVal = result;
		}
		
		return retVal;
	}
	
	@Override
	protected Command getConnectionCreateCommand(CreateConnectionRequest request) {
		Command retVal = null;
		//Fufillment start
		if(request.getNewObjectType().equals(Fulfilment.class) && request.getTargetEditPart() instanceof ORMNaturalTypeEditPart ||
		   request.getNewObjectType().equals(Fulfilment.class) && request.getTargetEditPart() instanceof ORMCompartmentEditPart){
			    ORMRelationCreateCommand result = new ORMRelationCreateCommand();
			    result.setSourceNode((Node)getHost().getModel());
			    result.setRelation((Relation) request.getNewObject());
			    if(getHost().getModel() instanceof NaturalType){
			    	if(((NaturalType)getHost().getModel()).getParentRolemodel() != null) result.setRelationContainer(((NaturalType)getHost().getModel()).getParentRolemodel());
			    	if(((NaturalType)getHost().getModel()).getCd() != null) result.setRelationContainer(((NaturalType)getHost().getModel()).getCd());
			    }
			    else{
			    	if(((Compartment)getHost().getModel()).getParentRolemodel() != null) result.setRelationContainer(((Compartment)getHost().getModel()).getParentRolemodel());
			    	if(((Compartment)getHost().getModel()).getCd() != null) result.setRelationContainer(((Compartment)getHost().getModel()).getCd());
			    }
			    request.setStartCommand(result);
			    retVal = result;
		}
		// Role Implication start
		if(request.getNewObjectType().equals(RoleImplication.class) && request.getTargetEditPart().getModel() instanceof AbstractRole
			&& request.getTargetEditPart().getParent() instanceof ORMRolemodelEditPart){
			  	ORMRelationCreateCommand result = new ORMRelationCreateCommand();
			    result.setSourceNode((Node)getHost().getModel());
			    result.setRelation((Relation) request.getNewObject());
			    result.setRelationContainer(((AbstractRole)getHost().getModel()).getParentRolemodel());
			    request.setStartCommand(result);
			    retVal = result;
		}
		//Role Equivalence start
		if(request.getNewObjectType().equals(RoleEquivalence.class) && request.getTargetEditPart().getModel() instanceof AbstractRole
			&& request.getTargetEditPart().getParent() instanceof ORMRolemodelEditPart){
		  	ORMRelationCreateCommand result = new ORMRelationCreateCommand();
		    result.setSourceNode((Node)getHost().getModel());
		    result.setRelation((Relation) request.getNewObject());
		    result.setRelationContainer(((AbstractRole)getHost().getModel()).getParentRolemodel());
		    request.setStartCommand(result);
		    retVal = result;
	    }
		// Role Prohibition start
		if(request.getNewObjectType().equals(RoleProhibition.class) && request.getTargetEditPart() instanceof ORMRoleTypeEditPart
			&& request.getTargetEditPart().getParent() instanceof ORMRolemodelEditPart){
		  	ORMRelationCreateCommand result = new ORMRelationCreateCommand();
		    result.setSourceNode((Node)getHost().getModel());
		    result.setRelation((Relation) request.getNewObject());
		    result.setRelationContainer(((AbstractRole)getHost().getModel()).getParentRolemodel());
		    request.setStartCommand(result);
		    retVal = result;
	    }
		
		//Inheritance start 
		// TODO: check if RoleGroup can inherited from RoleType
		if(request.getNewObjectType().equals(Inheritance.class) && !(request.getTargetEditPart() instanceof ORMRoleGroupEditPart) && !(request.getTargetEditPart() instanceof ORMGroupingEditPart)
			&& !(request.getTargetEditPart().getParent() instanceof ORMRoleGroupEditPart)){
		  	ORMRelationCreateCommand result = new ORMRelationCreateCommand();
		    result.setSourceNode((Node)getHost().getModel());
		    result.setRelation((Relation) request.getNewObject());
		    if( request.getTargetEditPart().getModel() instanceof AbstractRole){
		    	result.setRelationContainer((( AbstractRole)getHost().getModel()).getParentRolemodel());
		    }
		    else if(request.getTargetEditPart() instanceof ORMNaturalTypeEditPart) {
		    	result.setRelationContainer(((NaturalType)getHost().getModel()).getParentRolemodel());
		    }
		    else if(request.getTargetEditPart() instanceof ORMCompartmentEditPart) {
		     if(((Compartment)getHost().getModel()).getParentRolemodel() != null)	result.setRelationContainer(((Compartment)getHost().getModel()).getParentRolemodel());
		     if(((Compartment)getHost().getModel()).getCd() != null)	result.setRelationContainer(((Compartment)getHost().getModel()).getCd());
		    }
		    request.setStartCommand(result);
		    retVal = result;
	    }		
		// Relationship  start
		if(request.getNewObjectType().equals(Relationship.class) && request.getTargetEditPart() instanceof ORMRoleTypeEditPart){
			ORMRelationCreateCommand result = new ORMRelationCreateCommand();
			result.setSourceNode((Node)getHost().getModel());
			result.setRelation((Relation) request.getNewObject());
			if(((RoleType)getHost().getModel()).getParentRolemodel() != null) result.setRelationContainer(((RoleType)getHost().getModel()).getParentRolemodel());
			if(((RoleType)getHost().getModel()).getParentRoleGroup() != null) result.setRelationContainer(((RoleType)getHost().getModel()).getParentRoleGroup());
			request.setStartCommand(result);
			retVal = result;
		}
		
		// Irreflexive Acyclic Total start
		if(request.getNewObject() instanceof RelationshipConstraint && request.getTargetEditPart() instanceof ORMRoleTypeEditPart 
		   && testIrreflexiveTotalAcylic(request,false)){
				ORMRelationCreateCommand result = new ORMRelationCreateCommand();
				result.setSourceNode((Node)getHost().getModel());
				result.setRelation((Relation) request.getNewObject());
				if(((RoleType)getHost().getModel()).getParentRolemodel() != null) result.setRelationContainer(((RoleType)getHost().getModel()).getParentRolemodel());
				if(((RoleType)getHost().getModel()).getParentRoleGroup() != null) result.setRelationContainer(((RoleType)getHost().getModel()).getParentRoleGroup());
				request.setStartCommand(result);
				retVal = result;
			}
		
		return retVal;
	}

	@Override
	protected Command getReconnectTargetCommand(ReconnectRequest request) {
		return null;
	}

	@Override
	protected Command getReconnectSourceCommand(ReconnectRequest request) {
		return null;
	}
	
	private boolean testRoleEquilvalence(CreateConnectionRequest request){
		return request.getNewObjectType().equals(RoleEquivalence.class) && request.getSourceEditPart() instanceof ORMRoleTypeEditPart  
			   && request.getTargetEditPart() instanceof ORMRoleTypeEditPart && !(request.getTargetEditPart().equals(request.getSourceEditPart())) 
			   && request.getTargetEditPart().getParent() instanceof ORMRolemodelEditPart ||
			   request.getNewObjectType().equals(RoleEquivalence.class) && request.getSourceEditPart() instanceof ORMRoleTypeEditPart  
			   && request.getTargetEditPart() instanceof ORMRoleGroupEditPart && !(request.getTargetEditPart().equals(request.getSourceEditPart())) 
			   && request.getTargetEditPart().getParent() instanceof ORMRolemodelEditPart ||
			   request.getNewObjectType().equals(RoleEquivalence.class) && request.getSourceEditPart() instanceof ORMRoleGroupEditPart  
			   && request.getTargetEditPart() instanceof ORMRoleTypeEditPart && !(request.getTargetEditPart().equals(request.getSourceEditPart()))
			   && request.getTargetEditPart().getParent() instanceof ORMRolemodelEditPart;
	}
	

	private boolean testInheritance(CreateConnectionRequest request){
		// test1: for RoleType and Role Group test2: for NaturalType test3: for Compartments
		return request.getNewObjectType().equals(Inheritance.class) && request.getSourceEditPart() instanceof  ORMRoleTypeEditPart  
			   && request.getTargetEditPart() instanceof ORMRoleTypeEditPart && !(request.getTargetEditPart().equals(request.getSourceEditPart()))
			   && request.getTargetEditPart().getParent() instanceof ORMRolemodelEditPart||
			   request.getNewObjectType().equals(Inheritance.class) && request.getSourceEditPart() instanceof ORMNaturalTypeEditPart  
			   && request.getTargetEditPart() instanceof  ORMNaturalTypeEditPart  && !(request.getTargetEditPart().equals(request.getSourceEditPart()))||
			   request.getNewObjectType().equals(Inheritance.class) && request.getSourceEditPart() instanceof ORMCompartmentEditPart  
			   && request.getTargetEditPart() instanceof ORMCompartmentEditPart && !(request.getTargetEditPart().equals(request.getSourceEditPart()));
	}
	
	
	private boolean testIrreflexiveTotalAcylic(CreateConnectionRequest request, boolean isTargetTest){
		boolean returnValue = false;
		List<Relation> relList = new ArrayList();
		List<Relation> relSourceList = new ArrayList();
		// false source true target
		if(isTargetTest){
			 relList.addAll(((ORMRoleTypeEditPart)request.getTargetEditPart()).getModelTargetConnections());
			 relList.addAll(((ORMRoleTypeEditPart)request.getTargetEditPart()).getModelSourceConnections());
			 relSourceList.addAll(((ORMRoleTypeEditPart)request.getSourceEditPart()).getModelTargetConnections());
			 relSourceList.addAll(((ORMRoleTypeEditPart)request.getSourceEditPart()).getModelSourceConnections());
			for(Relation rel : relList){
				if(rel instanceof Relationship){ 
					for(Relation rel2 :  relSourceList){
						if(rel2.equals(rel))returnValue = true;
					}
					
				}
			}
		}
		else{
			 relList.addAll(((ORMRoleTypeEditPart)request.getTargetEditPart()).getModelSourceConnections());
			 relList.addAll(((ORMRoleTypeEditPart)request.getTargetEditPart()).getModelTargetConnections());
			for(Relation rel : relList){
				if(rel instanceof Relationship) returnValue = true;
			}
		}
		return returnValue;
	}
}
