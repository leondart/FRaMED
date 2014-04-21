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
import orm.model.RelationContainer;
import orm.model.Relationship;
import orm.model.RelationshipConstraint;
import orm.model.RoleEquivalence;
import orm.model.RoleImplication;
import orm.model.RoleProhibition;
import orm.model.RoleType;

/**
 * This class handles the create logic of relations.
 * For the specification of the logic look up the model description.
 * NewObject = O/o
 * SourceEditPart = S/s
 * TargetEditPart = T/t
 * Model = M/m
 * @author Kay Bierzynski
 * */
public class ORMNodeGraphicalNodeEditPolicy extends GraphicalNodeEditPolicy {

	@Override
	protected Command getConnectionCompleteCommand(CreateConnectionRequest request) {
		Command retVal = null;
		//Fulfilment End
		if( oSTCheck(request, Fulfilment.class, ORMNaturalTypeEditPart.class, ORMCompartmentEditPart.class)||
			oSTCheck(request, Fulfilment.class, ORMCompartmentEditPart.class, ORMCompartmentEditPart.class) && tNotEqualSCheck(request)
			){
			 retVal = setupConnectionCompleteCommand(request);
		}
		
		//Role Implication End
		if( oSMTMCheck(request, RoleImplication.class, AbstractRole.class, AbstractRole.class) && tNotEqualSCheck(request)){
			 retVal = setupConnectionCompleteCommand(request);
		}
		// Role Equilvalence End
		if( oSTMCheck(request, RoleEquivalence.class, ORMRoleTypeEditPart.class , AbstractRole.class ) && tNotEqualSCheck(request) ||
			oSTCheck(request, RoleEquivalence.class, ORMRoleGroupEditPart.class, ORMRoleTypeEditPart.class )&& tNotEqualSCheck(request)){
			 retVal = setupConnectionCompleteCommand(request);
		}
		//Role Prohibition End
		if( oSTCheck(request, RoleProhibition.class, ORMRoleTypeEditPart.class, ORMRoleTypeEditPart.class) && tNotEqualSCheck(request)){
			retVal = setupConnectionCompleteCommand(request);
		}
		
		//Inheritance End
		if(oSTCheck(request,Inheritance.class, ORMRoleTypeEditPart.class, ORMRoleTypeEditPart.class) && tNotEqualSCheck(request)||  
		   oSTCheck(request, Inheritance.class, ORMNaturalTypeEditPart.class, ORMNaturalTypeEditPart.class) && tNotEqualSCheck(request) ||
		   oSTCheck(request, Inheritance.class,  ORMCompartmentEditPart.class,  ORMCompartmentEditPart.class) && tNotEqualSCheck(request)){
			retVal = setupConnectionCompleteCommand(request);
		}
		//Relationship End
		if(oSTCheck(request, Relationship.class, ORMRoleTypeEditPart.class,ORMRoleTypeEditPart.class)  && tNotEqualSCheck(request)){
			 retVal = setupConnectionCompleteCommand(request);
		}
		
		//Irreflexive Acyclic Total End
		if(request.getNewObject() instanceof RelationshipConstraint && request.getSourceEditPart() instanceof ORMRoleTypeEditPart
		   && request.getTargetEditPart() instanceof ORMRoleTypeEditPart  && tNotEqualSCheck(request)
		   && testIrreflexiveTotalAcylic(request,true)){
			 retVal = setupConnectionCompleteCommand(request);
		}
		
		return retVal;
	}
	
	@Override
	protected Command getConnectionCreateCommand(CreateConnectionRequest request) {
		Command retVal = null;
		//Fufillment start
		if(oTCheck(request, Fulfilment.class, ORMNaturalTypeEditPart.class) ||
		   oTCheck(request, Fulfilment.class, ORMCompartmentEditPart.class)){
			    if(getHost().getModel() instanceof NaturalType){
			    	if(((NaturalType)getHost().getModel()).getParentRolemodel() != null) retVal = setupConnectionStartCommand(request, ((NaturalType)getHost().getModel()).getParentRolemodel());
			    	if(((NaturalType)getHost().getModel()).getCd() != null) retVal = setupConnectionStartCommand(request, ((NaturalType)getHost().getModel()).getCd());
			    }
			    else{
			    	if(((Compartment)getHost().getModel()).getParentRolemodel() != null) retVal = setupConnectionStartCommand(request,((Compartment)getHost().getModel()).getParentRolemodel());
			    	if(((Compartment)getHost().getModel()).getCd() != null) retVal = setupConnectionStartCommand(request, ((Compartment)getHost().getModel()).getCd());
			    }		 
		}
		// Role Implication start
		if(oTMCheck(request, RoleImplication.class,  AbstractRole.class)){
			retVal = setupConnectionStartCommand(request, ((AbstractRole)getHost().getModel()).getParentRolemodel());
		}
		//Role Equivalence start
		if(oTMCheck(request,RoleEquivalence.class,  AbstractRole.class)){
			retVal = setupConnectionStartCommand(request, ((AbstractRole)getHost().getModel()).getParentRolemodel());
	    }
		// Role Prohibition start
		if(oTCheck(request, RoleProhibition.class, ORMRoleTypeEditPart.class)){
			retVal = setupConnectionStartCommand(request, ((AbstractRole)getHost().getModel()).getParentRolemodel());
	    }
		
		//Inheritance start 
		// TODO: check if RoleGroup can inherited from RoleType
		if(request.getNewObjectType().equals(Inheritance.class) && !(request.getTargetEditPart() instanceof ORMRoleGroupEditPart) && !(request.getTargetEditPart() instanceof ORMGroupingEditPart)
			&& !(request.getTargetEditPart().getParent() instanceof ORMRoleGroupEditPart)){
			
		    if( request.getTargetEditPart().getModel() instanceof AbstractRole){
		    	retVal = setupConnectionStartCommand(request, ((AbstractRole)getHost().getModel()).getParentRolemodel());
		    }
		    else if(request.getTargetEditPart() instanceof ORMNaturalTypeEditPart) {
		    	if(((NaturalType)getHost().getModel()).getParentRolemodel() != null) retVal = setupConnectionStartCommand(request, ((NaturalType)getHost().getModel()).getParentRolemodel());
		    	if(((NaturalType)getHost().getModel()).getCd() != null) retVal = setupConnectionStartCommand(request, ((NaturalType)getHost().getModel()).getCd());
		    }
		    else if(request.getTargetEditPart() instanceof ORMCompartmentEditPart) {
		    	if(((Compartment)getHost().getModel()).getParentRolemodel() != null) retVal = setupConnectionStartCommand(request,((Compartment)getHost().getModel()).getParentRolemodel());
		    	if(((Compartment)getHost().getModel()).getCd() != null) retVal = setupConnectionStartCommand(request, ((Compartment)getHost().getModel()).getCd());
		    }
		  
	    }		
		// Relationship  start
		if(oTCheck(request, Relationship.class, ORMRoleTypeEditPart.class)){
			if(((RoleType)getHost().getModel()).getParentRolemodel() != null) retVal = setupConnectionStartCommand(request, ((AbstractRole)getHost().getModel()).getParentRolemodel());
			if(((RoleType)getHost().getModel()).getParentRoleGroup() != null) retVal = setupConnectionStartCommand(request, ((AbstractRole)getHost().getModel()).getParentRoleGroup());
		}
		
		// Irreflexive Acyclic Total start
		if(request.getNewObject() instanceof RelationshipConstraint && request.getTargetEditPart() instanceof ORMRoleTypeEditPart 
		   && testIrreflexiveTotalAcylic(request,false)){
			if(((RoleType)getHost().getModel()).getParentRolemodel() != null) retVal = setupConnectionStartCommand(request, ((AbstractRole)getHost().getModel()).getParentRolemodel());
			if(((RoleType)getHost().getModel()).getParentRoleGroup() != null) retVal = setupConnectionStartCommand(request, ((AbstractRole)getHost().getModel()).getParentRoleGroup());
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
		
	
	private boolean oSTCheck(CreateConnectionRequest request, Class object, Class source, Class target ){
		
		return 	  request.getNewObjectType().equals(object) && target.isInstance(request.getTargetEditPart()) 
				   &&  source.isInstance(request.getSourceEditPart());
	}
	
	private boolean oSMTMCheck(CreateConnectionRequest request, Class object, Class source, Class target ){
		
		return   request.getNewObjectType().equals(object) && target.isInstance(request.getTargetEditPart().getModel())
				&&  source.isInstance(request.getSourceEditPart().getModel());
	}
	
	
	private boolean oSTMCheck(CreateConnectionRequest request, Class object, Class source, Class target ){
		
		return   request.getNewObjectType().equals(object) && target.isInstance(request.getTargetEditPart().getModel())
				&&  source.isInstance(request.getSourceEditPart());
	}
	
	private boolean oTCheck(CreateConnectionRequest request, Class object,  Class target ){
		
		return   request.getNewObjectType().equals(object) && target.isInstance(request.getTargetEditPart());
	}
	
	private boolean oTMCheck(CreateConnectionRequest request, Class object,  Class target ){
		
		return   request.getNewObjectType().equals(object) && target.isInstance(request.getTargetEditPart().getModel());
	}
	
	private boolean tNotEqualSCheck(CreateConnectionRequest request){
		return !(request.getTargetEditPart().equals(request.getSourceEditPart()));
	}
	
	private ORMRelationCreateCommand setupConnectionCompleteCommand(CreateConnectionRequest request){
		ORMRelationCreateCommand result =  (ORMRelationCreateCommand) request.getStartCommand();
		result.setTargetNode((Node)getHost().getModel());
		return result;
	}
	
	private ORMRelationCreateCommand setupConnectionStartCommand(CreateConnectionRequest request, RelationContainer rm){
		ORMRelationCreateCommand result = new ORMRelationCreateCommand();
	    result.setSourceNode((Node)getHost().getModel());
	    result.setRelation((Relation) request.getNewObject());
	    result.setRelationContainer(rm);
	    request.setStartCommand(result);
		return result;
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