package org.framed.orm.ui.editPolicy;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.GraphicalNodeEditPolicy;
import org.eclipse.gef.requests.CreateConnectionRequest;
import org.eclipse.gef.requests.ReconnectRequest;
import org.framed.orm.model.AbstractRole;
import org.framed.orm.model.Acyclic;
import org.framed.orm.model.Compartment;
import org.framed.orm.model.Fulfillment;
import org.framed.orm.model.Inheritance;
import org.framed.orm.model.Irreflexive;
import org.framed.orm.model.NaturalType;
import org.framed.orm.model.Node;
import org.framed.orm.model.Relation;
import org.framed.orm.model.Container;
import org.framed.orm.model.Relationship;
import org.framed.orm.model.RelationshipConstraint;
import org.framed.orm.model.RoleEquivalence;
import org.framed.orm.model.RoleImplication;
import org.framed.orm.model.RoleProhibition;
import org.framed.orm.model.RoleType;
import org.framed.orm.model.Total;
import org.framed.orm.ui.command.connectionkinds.ORMRelationCreateCommand;
import org.framed.orm.ui.command.connectionkinds.ORMRelationshipConstraintCreateCommand;
import org.framed.orm.ui.editPart.ORMGroupingEditPart;
import org.framed.orm.ui.editPart.ORMRoleGroupEditPart;
import org.framed.orm.ui.editPart.ORMRolemodelEditPart;
import org.framed.orm.ui.editPart.types.ORMCompartmentEditPart;
import org.framed.orm.ui.editPart.types.ORMNaturalTypeEditPart;
import org.framed.orm.ui.editPart.types.ORMRoleTypeEditPart;

/**
 * This class handles the create logic of relations. For the specification of the logic look up the
 * model description. NewObject = O/o SourceEditPart = S/s TargetEditPart = T/t Model = M/m
 * 
 * @author Kay Bierzynski
 * */
public class ORMNodeGraphicalNodeEditPolicy extends GraphicalNodeEditPolicy {
  private Relationship testedRelationship = null;

  @Override
  protected void showCreationFeedback(CreateConnectionRequest request) {
    if (!parentTest(request.getTargetEditPart(), request.getSourceEditPart())) {
      super.showCreationFeedback(request);
    }

  }

  @Override
  protected Command getConnectionCompleteCommand(CreateConnectionRequest request) {
    Command retVal = null;
    // Fulfillment End
    if (oSTCheck(request, Fulfillment.class, ORMNaturalTypeEditPart.class,
        ORMCompartmentEditPart.class)
        || oSTCheck(request, Fulfillment.class, ORMCompartmentEditPart.class,
            ORMCompartmentEditPart.class)) {
      retVal = setupConnectionCompleteCommand(request);
    }

    // Role Implication End
    if (oSMTMCheck(request, RoleImplication.class, AbstractRole.class, AbstractRole.class)
        && tNotEqualSCheck(request)
        && !parentTest(request.getTargetEditPart(), request.getSourceEditPart())
        && !childrenTest(request.getTargetEditPart(), request.getSourceEditPart())) {
      retVal = setupConnectionCompleteCommand(request);
    }
    // Role Equilvalence End
    if (oSMTMCheck(request, RoleEquivalence.class, AbstractRole.class, AbstractRole.class)
        && tNotEqualSCheck(request)
        && !parentTest(request.getTargetEditPart(), request.getSourceEditPart())
        && !childrenTest(request.getTargetEditPart(), request.getSourceEditPart())) {
      retVal = setupConnectionCompleteCommand(request);
    }
    // Role Prohibition End
    if (oSMTMCheck(request, RoleProhibition.class, AbstractRole.class, AbstractRole.class)
        && tNotEqualSCheck(request)
        && !parentTest(request.getTargetEditPart(), request.getSourceEditPart())
        && !childrenTest(request.getTargetEditPart(), request.getSourceEditPart())) {
      retVal = setupConnectionCompleteCommand(request);
    }

    // Inheritance End
    if (oSTCheck(request, Inheritance.class, ORMRoleTypeEditPart.class, ORMRoleTypeEditPart.class)
        && tNotEqualSCheck(request)
        || oSTCheck(request, Inheritance.class, ORMNaturalTypeEditPart.class,
            ORMNaturalTypeEditPart.class)
        && tNotEqualSCheck(request)
        || oSTCheck(request, Inheritance.class, ORMCompartmentEditPart.class,
            ORMCompartmentEditPart.class) && tNotEqualSCheck(request)) {
      retVal = setupConnectionCompleteCommand(request);
    }
    // Relationship End
    if (oSTCheck(request, Relationship.class, ORMRoleTypeEditPart.class, ORMRoleTypeEditPart.class)
        && tNotEqualSCheck(request) && !hasARelationship(request, true)) {
      retVal = setupConnectionCompleteCommand(request);
    }

    // Irreflexive Acyclic Total End
    if (request.getNewObject() instanceof RelationshipConstraint
        && request.getSourceEditPart() instanceof ORMRoleTypeEditPart
        && request.getTargetEditPart() instanceof ORMRoleTypeEditPart && tNotEqualSCheck(request)
        && hasARelationship(request, true) && !hasConstrainKind(request)) {
      ORMRelationshipConstraintCreateCommand result =
          (ORMRelationshipConstraintCreateCommand) request.getStartCommand();
      result.setTargetNode((Node) getHost().getModel());
      result.setRelationship(testedRelationship);
      retVal = result;
    }

    return retVal;
  }

  @Override
  protected Command getConnectionCreateCommand(CreateConnectionRequest request) {
    Command retVal = null;
    // Fufillment start
    if (oTCheck(request, Fulfillment.class, ORMNaturalTypeEditPart.class)
        || oTCheck(request, Fulfillment.class, ORMCompartmentEditPart.class)) {

      retVal = setupConnectionStartCommand(request, ((Node) getHost().getModel()).getContainer());

    }
    // Role Implication start
    if (oTMCheck(request, RoleImplication.class, AbstractRole.class)) {
      retVal = setupConnectionStartCommand(request, ((Node) getHost().getModel()).getContainer());
    }
    // Role Equivalence start
    if (oTMCheck(request, RoleEquivalence.class, AbstractRole.class)) {

      retVal = setupConnectionStartCommand(request, ((Node) getHost().getModel()).getContainer());
    }
    // Role Prohibition start
    if (oTMCheck(request, RoleProhibition.class, AbstractRole.class)) {
      retVal = setupConnectionStartCommand(request, ((Node) getHost().getModel()).getContainer());
    }

    // Inheritance start
    // TODO: check if RoleGroup can inherited from RoleType
    if (request.getNewObjectType().equals(Inheritance.class)
        && !(request.getTargetEditPart() instanceof ORMRoleGroupEditPart)
        && !(request.getTargetEditPart() instanceof ORMGroupingEditPart)
        && !(request.getTargetEditPart().getParent() instanceof ORMRoleGroupEditPart)) {

      retVal = setupConnectionStartCommand(request, ((Node) getHost().getModel()).getContainer());

    }
    // Relationship start
    if (oTCheck(request, Relationship.class, ORMRoleTypeEditPart.class)) {
      retVal = setupConnectionStartCommand(request, ((Node) getHost().getModel()).getContainer());
    }

    // Irreflexive Acyclic Total start
    if (request.getNewObject() instanceof RelationshipConstraint
        && request.getTargetEditPart() instanceof ORMRoleTypeEditPart
        && hasARelationship(request, false)) {

      ORMRelationshipConstraintCreateCommand result = new ORMRelationshipConstraintCreateCommand();
      result.setSourceNode((Node) getHost().getModel());
      result.setRelation((RelationshipConstraint) request.getNewObject());
      request.setStartCommand(result);

      result.setRelationContainer(((Node) getHost().getModel()).getContainer());

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


  private boolean oSTCheck(CreateConnectionRequest request, Class object, Class source, Class target) {

    return request.getNewObjectType().equals(object)
        && target.isInstance(request.getTargetEditPart())
        && source.isInstance(request.getSourceEditPart());
  }

  private boolean oSMTMCheck(CreateConnectionRequest request, Class object, Class source,
      Class target) {

    return request.getNewObjectType().equals(object)
        && target.isInstance(request.getTargetEditPart().getModel())
        && source.isInstance(request.getSourceEditPart().getModel());
  }

  // the methods is for future adaption of the logic
  private boolean oSTMCheck(CreateConnectionRequest request, Class object, Class source,
      Class target) {

    return request.getNewObjectType().equals(object)
        && target.isInstance(request.getTargetEditPart().getModel())
        && source.isInstance(request.getSourceEditPart());
  }

  private boolean oTCheck(CreateConnectionRequest request, Class object, Class target) {

    return request.getNewObjectType().equals(object)
        && target.isInstance(request.getTargetEditPart());
  }

  private boolean oTMCheck(CreateConnectionRequest request, Class object, Class target) {

    return request.getNewObjectType().equals(object)
        && target.isInstance(request.getTargetEditPart().getModel());
  }

  private boolean tNotEqualSCheck(CreateConnectionRequest request) {
    return !(request.getTargetEditPart().equals(request.getSourceEditPart()));
  }

  private ORMRelationCreateCommand setupConnectionCompleteCommand(CreateConnectionRequest request) {
    ORMRelationCreateCommand result = (ORMRelationCreateCommand) request.getStartCommand();
    result.setTargetNode((Node) getHost().getModel());
    return result;
  }

  private ORMRelationCreateCommand setupConnectionStartCommand(CreateConnectionRequest request,
      Container container) {
    ORMRelationCreateCommand result = new ORMRelationCreateCommand();
    result.setSourceNode((Node) getHost().getModel());
    result.setRelation((Relation) request.getNewObject());
    result.setRelationContainer(container);
    request.setStartCommand(result);
    return result;
  }

  public boolean parentTest(EditPart target, EditPart source) {
    boolean flag;
    flag = false;

    if (target != null && source != null) {
      if (target.equals(source.getParent())) {
        return true;
      } else {
        if (source.getParent() instanceof ORMRolemodelEditPart) {
          return false;
        } else {
          flag = parentTest(target, source.getParent());
        }
      }
    }

    return flag;
  }

  public boolean childrenTest(EditPart target, EditPart source) {
    boolean flag;
    flag = false;
    ArrayList<EditPart> children = new ArrayList<EditPart>();
    ArrayList<EditPart> roleGroups = new ArrayList<EditPart>();
    children.addAll(source.getChildren());

    for (EditPart child : children) {
      if (target.equals(child))
        return true;
      if (child instanceof ORMRoleGroupEditPart) {
        roleGroups.add(child);
      }
    }

    if (roleGroups.size() == 0) {
      return false;
    } else {
      for (EditPart rg : roleGroups) {
        flag = childrenTest(target, rg);
        if (flag)
          return flag;
      }
    }
    return flag;
  }

  private boolean hasConstrainKind(CreateConnectionRequest request) {

    if (testedRelationship != null) {
      for (RelationshipConstraint rel : testedRelationship.getRlshipConstraints()) {
        if (request.getNewObject() instanceof Irreflexive && rel instanceof Irreflexive)
          return true;
        if (request.getNewObject() instanceof Total && rel instanceof Total)
          return true;
        if (request.getNewObject() instanceof Acyclic && rel instanceof Acyclic)
          return true;
      }
    }
    return false;
  }

  private boolean hasARelationship(CreateConnectionRequest request, boolean isTargetTest) {
    List<Relation> relList = new ArrayList<Relation>();
    List<Relation> relSourceList = new ArrayList<Relation>();
    // false source true target
    if (isTargetTest) {
      relList.addAll(((ORMRoleTypeEditPart) request.getTargetEditPart())
          .getModelTargetConnections());
      relList.addAll(((ORMRoleTypeEditPart) request.getTargetEditPart())
          .getModelSourceConnections());
      relSourceList.addAll(((ORMRoleTypeEditPart) request.getSourceEditPart())
          .getModelTargetConnections());
      relSourceList.addAll(((ORMRoleTypeEditPart) request.getSourceEditPart())
          .getModelSourceConnections());
      for (Relation rel : relList) {
        if (rel instanceof Relationship) {
          for (Relation rel2 : relSourceList) {
            if (rel2.equals(rel)) {
              testedRelationship = (Relationship) rel;
              return true;
            }
          }

        }
      }
    } else {
      // test: has the focused editpart a relationship as connection?
      relList.addAll(((ORMRoleTypeEditPart) request.getTargetEditPart())
          .getModelSourceConnections());
      relList.addAll(((ORMRoleTypeEditPart) request.getTargetEditPart())
          .getModelTargetConnections());
      for (Relation rel : relList) {
        if (rel instanceof Relationship)
          return true;
      }
    }
    return false;
  }
}
