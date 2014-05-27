package org.framed.orm.ui.editPart;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.framed.orm.model.Acyclic;
import org.framed.orm.model.Attribute;
import org.framed.orm.model.CompartmentDiagram;
import org.framed.orm.model.Compartment;
import org.framed.orm.model.Fulfillment;
import org.framed.orm.model.Grouping;
import org.framed.orm.model.Inheritance;
import org.framed.orm.model.Irreflexive;
import org.framed.orm.model.Method;
import org.framed.orm.model.NaturalType;
import org.framed.orm.model.Relationship;
import org.framed.orm.model.RoleEquivalence;
import org.framed.orm.model.RoleGroup;
import org.framed.orm.model.RoleImplication;
import org.framed.orm.model.RoleProhibition;
import org.framed.orm.model.RoleType;
import org.framed.orm.model.Rolemodel;
import org.framed.orm.model.Total;
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


/**
 * @author Kay Bierzynski
 * */
public class ORMEditPartFactory implements EditPartFactory {

  @Override
  public EditPart createEditPart(EditPart context, Object model) {
    EditPart part = null;

    if (model instanceof CompartmentDiagram) {
      part = new ORMCompartmentDiagramEditPart();
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
    }
    if (part != null) {
      part.setModel(model);
    }

    return part;
  }

}
