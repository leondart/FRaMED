package org.framed.orm.ui.editPart;


import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.EditPartViewer;
import org.framed.orm.model.Model;
import org.framed.orm.model.Relation;
import org.framed.orm.model.Segment;
import org.framed.orm.model.Shape;
import org.framed.orm.ui.editPart.connectionkinds.ORMAcyclicEditPart;
import org.framed.orm.ui.editPart.connectionkinds.ORMFulfillmentEditPart;
import org.framed.orm.ui.editPart.connectionkinds.ORMInheritanceEditPart;
import org.framed.orm.ui.editPart.connectionkinds.ORMIrreflexiveEditPart;
import org.framed.orm.ui.editPart.connectionkinds.ORMRelationshipEditPart;
import org.framed.orm.ui.editPart.connectionkinds.ORMRoleEquivalenceEditPart;
import org.framed.orm.ui.editPart.connectionkinds.ORMRoleImplicationEditPart;
import org.framed.orm.ui.editPart.connectionkinds.ORMRoleProhibitionEditPart;
import org.framed.orm.ui.editPart.connectionkinds.ORMTotalEditPart;
import org.framed.orm.ui.editPart.types.ORMCompartmentEditPart;
import org.framed.orm.ui.editPart.types.ORMNaturalTypeEditPart;
import org.framed.orm.ui.editPart.types.ORMRoleTypeEditPart;
import org.framed.orm.ui.editPart.types.ORMShapeEditPart;



/**
 * A factory for creating new {@link EditPart}s. {@link EditPartViewer}s can be configured with an
 * EditPartFactory. Whenever an EditPart in that viewer needs to create another EditPart, it can use
 * the Viewer's factory. The factory is also used by the viewer whenever
 * {@link EditPartViewer#setContents(Object)} is called.(Comment taken from {@link EditPartFactory}.
 * 
 * @author Kay Bierzynski
 * */
public class ORMEditPartFactory implements EditPartFactory {

  /** {@inheritDoc} */
  @Override
  public EditPart createEditPart(final EditPart context,final Object model) {
    EditPart part = null;
    
    if(model instanceof Model){
      part = new ORMModelEditPart();
    }    
    
    if(model instanceof Relation){
      
    }

    if(model instanceof Shape){
      part = new ORMShapeEditPart();
    }
   
    if(model instanceof Segment){
      
    }
    
 /*   if (model instanceof CompartmentDiagram) {
      part = new ORMModelEditPart();
    } else if (model instanceof Compartment) {
      part = new ORMCompartmentEditPart();
    } else if (model instanceof Method) {
      part = new ORMMethodEditPart();
    } else if (model instanceof Attribute) {
      part = new ORMAttributeEditPart();
    } else if (model instanceof Rolemodel) {
      part = new ORMRolemodelEditPart();
    } else if (model instanceof RoleType) {
      part = new ORMRoleTypeEditPart();
    } else if (model instanceof NaturalType) {
      part = new ORMNaturalTypeEditPart();
    } else if (model instanceof RoleGroup) {
      part = new ORMRoleGroupEditPart();
    } else if (model instanceof Fulfillment) {
      part = new ORMFulfillmentEditPart();
    } else if (model instanceof RoleImplication) {
      part = new ORMRoleImplicationEditPart();
    } else if (model instanceof RoleEquivalence) {
      part = new ORMRoleEquivalenceEditPart();
    } else if (model instanceof RoleProhibition) {
      part = new ORMRoleProhibitionEditPart();
    } else if (model instanceof Inheritance) {
      part = new ORMInheritanceEditPart();
    } else if (model instanceof Relationship) {
      part = new ORMRelationshipEditPart();
    } else if (model instanceof Irreflexive) {
      part = new ORMIrreflexiveEditPart();
    } else if (model instanceof Total) {
      part = new ORMTotalEditPart();
    } else if (model instanceof Acyclic) {
      part = new ORMAcyclicEditPart();
    } else if (model instanceof Grouping) {
      part = new ORMGroupingEditPart();
    } else if (model instanceof RelationLabel) {
      part = new ORMRelationLabelEditPart();
    }*/
    if (part != null) {
      part.setModel(model);
    }

    return part;
  }
}
