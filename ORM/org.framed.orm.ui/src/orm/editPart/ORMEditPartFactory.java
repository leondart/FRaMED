package orm.editPart;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;

import orm.editPart.connectionkinds.ORMAcyclicEditPart;
import orm.editPart.connectionkinds.ORMFulfilmentEditPart;
import orm.editPart.connectionkinds.ORMInheritanceEditPart;
import orm.editPart.connectionkinds.ORMIrreflexiveEditPart;
import orm.editPart.connectionkinds.ORMRelationshipEditPart;
import orm.editPart.connectionkinds.ORMRoleEquivalenceEditPart;
import orm.editPart.connectionkinds.ORMRoleImplicationEditPart;
import orm.editPart.connectionkinds.ORMRoleProhibitionEditPart;
import orm.editPart.connectionkinds.ORMTotalEditPart;
import orm.editPart.types.ORMNaturalTypeEditPart;
import orm.editPart.types.ORMRoleTypeEditPart;
import org.framed.orm.model.Acyclic;
import org.framed.orm.model.Attribute;
import org.framed.orm.model.CompartmentDiagram;
import org.framed.orm.model.Compartment;
import org.framed.orm.model.Fulfilment;
import org.framed.orm.model.Grouping;
import org.framed.orm.model.Inheritance;
import org.framed.orm.model.Irreflexive;
import org.framed.orm.model.Methode;
import org.framed.orm.model.NaturalType;
import org.framed.orm.model.Relationship;
import org.framed.orm.model.RoleEquivalence;
import org.framed.orm.model.RoleGroup;
import org.framed.orm.model.RoleImplication;
import org.framed.orm.model.RoleProhibition;
import org.framed.orm.model.RoleType;
import org.framed.orm.model.Rolemodel;
import org.framed.orm.model.Total;


/**
 * @author Kay Bierzynski
 * */
public class ORMEditPartFactory implements EditPartFactory {
	
	 @Override public EditPart createEditPart(EditPart context, Object model) {
		    EditPart part = null;
		     
		    if(model instanceof CompartmentDiagram)
		    {
		      part = new ORMCompartmentDiagramEditPart(); 
		    } 
		    else if(model instanceof Compartment) 
		    {
		      part = new ORMCompartmentEditPart();
		    }
		    else if(model instanceof Methode) 
		    {
		      part = new ORMMethodEditPart();
		    }
		    else if(model instanceof Attribute) 
		    {
		      part = new ORMAttributeEditPart();
		    }
		    else if(model instanceof Rolemodel) 
		    {
		      part = new ORMRolemodelEditPart();
		    }
		    else if(model instanceof RoleType) 
		    {
		      part = new ORMRoleTypeEditPart();
		    }
		    else if(model instanceof NaturalType) 
		    {
		      part = new ORMNaturalTypeEditPart();
		    }
		    else if(model instanceof RoleGroup) 
		    {
		      part = new ORMRoleGroupEditPart();
		    }
		    else if(model instanceof Fulfilment) 
		    {
		      part = new ORMFulfilmentEditPart();
		    }
		    else if(model instanceof RoleImplication) 
		    {
		      part = new ORMRoleImplicationEditPart();
		    }
		    else if(model instanceof RoleEquivalence) 
		    {
		      part = new ORMRoleEquivalenceEditPart();
		    }
		    else if(model instanceof RoleProhibition) 
		    {
		      part = new ORMRoleProhibitionEditPart();
		    }
		    else if(model instanceof Inheritance) 
		    {
		      part = new ORMInheritanceEditPart();
		    }
		    else if(model instanceof Relationship) 
		    {
		      part = new ORMRelationshipEditPart();
		    }
		    else if(model instanceof Irreflexive) 
		    {
		      part = new ORMIrreflexiveEditPart();
		    }
		    else if(model instanceof Total) 
		    {
		      part = new ORMTotalEditPart();
		    }
		    else if(model instanceof Acyclic) 
		    {
		      part = new ORMAcyclicEditPart();
		    }
		    else if(model instanceof Grouping) 
		    {
		      part = new ORMGroupingEditPart();
		    }
		    if(part != null) {
		      part.setModel(model);
		    }
		     
		    return part;
		  }
	
}
