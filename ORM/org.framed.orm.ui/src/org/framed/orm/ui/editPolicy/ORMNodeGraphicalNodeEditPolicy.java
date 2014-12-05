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
import org.framed.orm.model.Fulfillment;
import org.framed.orm.model.Inheritance;
import org.framed.orm.model.Irreflexive;
import org.framed.orm.model.Node;
import org.framed.orm.model.Relation;
import org.framed.orm.model.Container;
import org.framed.orm.model.Relationship;
import org.framed.orm.model.RelationshipConstraint;
import org.framed.orm.model.RoleEquivalence;
import org.framed.orm.model.RoleGroup;
import org.framed.orm.model.RoleImplication;
import org.framed.orm.model.RoleProhibition;
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
 * This {@link GraphicalNodeEditPolicy} handles request for the creations of all kinds of
 * {@link Relation}s and creates and returns the necessary commands for that purpose. NewObject =
 * O/o SourceEditPart = S/s TargetEditPart = T/t Model = M/m
 * 
 * @author Kay Bierzynski
 * */
public class ORMNodeGraphicalNodeEditPolicy extends GraphicalNodeEditPolicy {
  /**
   * A {@link Relationship} that exist between source edit part and target edit part.
   * */
  private Relationship testedRelationship = null;

  /**
   * {@inheritDoc} The feedback is only shown when the target edit part model is not the model
   * parent of the source edit part model. (this restriction is important for the creation of
   * {@link Relation}s in a {@link RoleGroup})
   */
  @Override
  protected void showCreationFeedback(final CreateConnectionRequest request) {
    if (!parentTest(request.getTargetEditPart(), request.getSourceEditPart())) {
      super.showCreationFeedback(request);
    }

  }

  /**
   * {@inheritDoc}
   * 
   * @return {@link ORMRelationshipConstraintCreateCommand}( in case a
   *         {@link RelationshipConstraint} should be created) or {@link ORMRelationCreateCommand}(
   *         in case any other Relation should be created)
   * */
  @Override
  protected Command getConnectionCompleteCommand(final CreateConnectionRequest request) {
    Command retVal = null;
    if (isCompleteOK(request)) {
      retVal = setupConnectionCompleteCommand(request);
    }

    // Irreflexive Acyclic Total End
    if (request.getNewObject() instanceof RelationshipConstraint
        && request.getSourceEditPart() instanceof ORMRoleTypeEditPart
        && request.getTargetEditPart() instanceof ORMRoleTypeEditPart && tNotEqualSCheck(request)
        && hasARelationship(request, true) && !hasConstraintsKind(request)) {
      final ORMRelationshipConstraintCreateCommand result =
          (ORMRelationshipConstraintCreateCommand) request.getStartCommand();
      result.setTarget((Node) getHost().getModel());
      result.setRelationship(testedRelationship);
      retVal = result;
    }

    return retVal;
  }

  /**
   * {@inheritDoc}
   * 
   * @return {@link ORMRelationshipConstraintCreateCommand}( in case a
   *         {@link RelationshipConstraint} should be created) or {@link ORMRelationCreateCommand}(
   *         in case any other Relation should be created)
   * */
  @Override
  protected Command getConnectionCreateCommand(final CreateConnectionRequest request) {
    Command retVal = null;

    if (isStartOK(request)) {
      retVal = setupConnectionStartCommand(request, ((Node) getHost().getModel()).getContainer());
    }

    // Irreflexive Acyclic Total start
    if (request.getNewObject() instanceof RelationshipConstraint
        && request.getTargetEditPart() instanceof ORMRoleTypeEditPart
        && hasARelationship(request, false)) {

      final ORMRelationshipConstraintCreateCommand result =
          new ORMRelationshipConstraintCreateCommand();
      result.setSource((Node) getHost().getModel());
      result.setRelation((RelationshipConstraint) request.getNewObject());
      request.setStartCommand(result);

      result.setRelationContainer(((Node) getHost().getModel()).getContainer());

      retVal = result;
    }

    return retVal;
  }

  /**
   * {@inheritDoc}
   * 
   * @return null
   * */
  @Override
  protected Command getReconnectTargetCommand(ReconnectRequest request) {
    return null;
  }

  /**
   * {@inheritDoc}
   * 
   * @return null
   * */
  @Override
  protected Command getReconnectSourceCommand(ReconnectRequest request) {
    return null;
  }

  /**
   * This method tests if the new object given by the request equals object, the source edit part
   * given by the request is instance of source and the target edit part given by the request is
   * instance of target.
   * 
   * @fullname newObjectSourceEditPartTargetEditPartCheck
   * @return boolean
   * */
  private boolean oSTCheck(final CreateConnectionRequest request, final Class object,
      final Class source, final Class target) {

    return request.getNewObjectType().equals(object)
        && target.isInstance(request.getTargetEditPart())
        && source.isInstance(request.getSourceEditPart());
  }

  /**
   * This method tests if the new object given by the request equals object, the source edit part
   * model given by the request is instance of source and the target edit part model given by the
   * request is instance of target.
   * 
   * @fullname newObjectSourceEditPartModelTargetEditPartModelCheck
   * @return boolean
   * */
  private boolean oSMTMCheck(final CreateConnectionRequest request, final Class object,
      final Class source, final Class target) {

    return request.getNewObjectType().equals(object)
        && target.isInstance(request.getTargetEditPart().getModel())
        && source.isInstance(request.getSourceEditPart().getModel());
  }


  /**
   * This method tests if the new object given by the request equals object and the target edit part
   * given by the request is instance of target.
   * 
   * @fullname newObjectTargetEditPartCheck
   * @return boolean
   * */
  private boolean oTCheck(final CreateConnectionRequest request, final Class object,
      final Class target) {

    return request.getNewObjectType().equals(object)
        && target.isInstance(request.getTargetEditPart());
  }

  /**
   * This method tests if the new object given by the request equals object and the target edit part
   * model given by the request is instance of target.
   * 
   * @fullname newObjectTargetEditPartModelCheck
   * @return boolean
   * */
  private boolean oTMCheck(CreateConnectionRequest request, Class object, Class target) {

    return request.getNewObjectType().equals(object)
        && target.isInstance(request.getTargetEditPart().getModel());
  }

  /**
   * This method tests if the source edit part given by the request doesn't equals the target edit
   * part given by the request.
   * 
   * @fullname targetEditPartNotEqualSourceEditPartCheck
   * @return boolean
   * */
  private boolean tNotEqualSCheck(final CreateConnectionRequest request) {
    return !(request.getTargetEditPart().equals(request.getSourceEditPart()));
  }

  /**
   * This method creates and return the creation commands for all {@link Relation}s except for
   * {@link RelationshipConstraint}s.
   * 
   * @return {@link ORMRelationCreateCommand}
   * */
  private ORMRelationCreateCommand setupConnectionCompleteCommand(
      final CreateConnectionRequest request) {
    final ORMRelationCreateCommand result = (ORMRelationCreateCommand) request.getStartCommand();
    result.setTarget((Node) getHost().getModel());
    return result;
  }


  /**
   * This method creates and return the creation command for all {@link RelationshipConstraint}s.
   * 
   * @return {@link ORMRelationshipConstraintCreateCommand}
   * */
  private ORMRelationCreateCommand setupConnectionStartCommand(
      final CreateConnectionRequest request, final Container container) {
    final ORMRelationCreateCommand result = new ORMRelationCreateCommand();
    result.setSource((Node) getHost().getModel());
    result.setRelation((Relation) request.getNewObject());
    result.setRelationContainer(container);
    request.setStartCommand(result);
    return result;
  }


  /**
   * This method tests if target edit part model is the parent model of the source edit part model.
   * 
   * @return boolean
   * */
  public boolean parentTest(final EditPart target, final EditPart source) {
    boolean flag = false;

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

  /**
   * This method tests if the conditions for the creation completion of a {@link Relation}
   * kind(except {@link RelationshipConstraint}s) are fulfilled.
   * 
   * @return boolean
   * */
  public boolean isCompleteOK(final CreateConnectionRequest request) {
    // Fulfillment Test End
    return oSTCheck(request, Fulfillment.class, ORMNaturalTypeEditPart.class,
        ORMCompartmentEditPart.class)
        || oSTCheck(request, Fulfillment.class, ORMCompartmentEditPart.class,
            ORMCompartmentEditPart.class)
        // Role Implication TesT End
        || (oSMTMCheck(request, RoleImplication.class, AbstractRole.class, AbstractRole.class)
            && tNotEqualSCheck(request)
            && !parentTest(request.getTargetEditPart(), request.getSourceEditPart()) && !childrenTest(
              request.getTargetEditPart(), request.getSourceEditPart()))
        // Role Equilvalence Test End
        || (oSMTMCheck(request, RoleEquivalence.class, AbstractRole.class, AbstractRole.class)
            && tNotEqualSCheck(request)
            && !parentTest(request.getTargetEditPart(), request.getSourceEditPart()) && !childrenTest(
              request.getTargetEditPart(), request.getSourceEditPart()))
        // Role Prohibition Test End
        || (oSMTMCheck(request, RoleProhibition.class, AbstractRole.class, AbstractRole.class)
            && tNotEqualSCheck(request)
            && !parentTest(request.getTargetEditPart(), request.getSourceEditPart()) && !childrenTest(
              request.getTargetEditPart(), request.getSourceEditPart()))
        // Inheritance Test End
        || (oSTCheck(request, Inheritance.class, ORMRoleTypeEditPart.class,
            ORMRoleTypeEditPart.class) && tNotEqualSCheck(request))
        || (oSTCheck(request, Inheritance.class, ORMNaturalTypeEditPart.class,
            ORMNaturalTypeEditPart.class) && tNotEqualSCheck(request))
        || (oSTCheck(request, Inheritance.class, ORMCompartmentEditPart.class,
            ORMCompartmentEditPart.class) && tNotEqualSCheck(request))
        // Relationship Test End
        || (oSTCheck(request, Relationship.class, ORMRoleTypeEditPart.class,
            ORMRoleTypeEditPart.class) && tNotEqualSCheck(request) && !hasARelationship(request,
              true));
  }

  /**
   * This method tests if the conditions for the creation start of a {@link Relation} kind(except
   * {@link RelationshipConstraint}s) are fulfilled.
   * 
   * @return boolean
   * */
  public boolean isStartOK(final CreateConnectionRequest request) {
    // Fufillment start
    return oTCheck(request, Fulfillment.class, ORMNaturalTypeEditPart.class)
        || oTCheck(request, Fulfillment.class, ORMCompartmentEditPart.class)
        // Role Implication start
        || oTMCheck(request, RoleImplication.class, AbstractRole.class)
        // Role Equivalence start
        || oTMCheck(request, RoleEquivalence.class, AbstractRole.class)
        // Role Prohibition start
        || oTMCheck(request, RoleProhibition.class, AbstractRole.class)
        // Inheritance start
        || (request.getNewObjectType().equals(Inheritance.class)
            && !(request.getTargetEditPart() instanceof ORMRoleGroupEditPart)
            && !(request.getTargetEditPart() instanceof ORMGroupingEditPart) && !(request
            .getTargetEditPart().getParent() instanceof ORMRoleGroupEditPart))
        // Relationship start
        || oTCheck(request, Relationship.class, ORMRoleTypeEditPart.class);
  }

  /**
   * This method tests if target edit part model is a child model of the source edit part model.
   * 
   * @return boolean
   * */
  public boolean childrenTest(final EditPart target, final EditPart source) {
    boolean flag;
    flag = false;
    final ArrayList<EditPart> children = new ArrayList<EditPart>();
    final ArrayList<EditPart> roleGroups = new ArrayList<EditPart>();
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

  /**
   * This method tests if between source edit part and traget edit part already exist a
   * {@link RelationshipConstraint} kind of the requested {@link RelationshipConstraint} kind.
   * 
   * @return boolean
   * */
  private boolean hasConstraintsKind(final CreateConnectionRequest request) {

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

  /**
   * This method tests if between source edit part and traget edit part already exist a
   * {@link Relationship}.
   * 
   * @return boolean
   * */
  private boolean hasARelationship(final CreateConnectionRequest request, final boolean isTargetTest) {
    final List<Relation> relList = new ArrayList<Relation>();
    final List<Relation> relSourceList = new ArrayList<Relation>();
    // false source edit part(else) true target edit part(if)
    if (isTargetTest) {
      relList.addAll(((ORMRoleTypeEditPart) request.getTargetEditPart())
          .getModelTargetConnections());
      relList.addAll(((ORMRoleTypeEditPart) request.getTargetEditPart())
          .getModelSourceConnections());
      relSourceList.addAll(((ORMRoleTypeEditPart) request.getSourceEditPart())
          .getModelTargetConnections());
      relSourceList.addAll(((ORMRoleTypeEditPart) request.getSourceEditPart())
          .getModelSourceConnections());
      // test: has the target editpart the relationship connection as the source connection?
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
      // test: has the source editpart a relationship as connection?
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
