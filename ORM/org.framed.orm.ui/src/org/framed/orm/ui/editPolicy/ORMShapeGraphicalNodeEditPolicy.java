package org.framed.orm.ui.editPolicy;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.GraphicalNodeEditPolicy;
import org.eclipse.gef.requests.CreateConnectionRequest;
import org.eclipse.gef.requests.ReconnectRequest;
import org.framed.orm.model.Model;
import org.framed.orm.model.NamedElement;
import org.framed.orm.model.OrmFactory;
import org.framed.orm.model.Relation;
import org.framed.orm.model.Shape;
import org.framed.orm.model.Type;
import org.framed.orm.ui.command.connectionkinds.ORMRelationCreateCommand;
import org.framed.orm.ui.command.connectionkinds.ORMRelationshipConstraintCreateCommand;
import org.framed.orm.ui.editPart.ORMModelEditPart;
import org.framed.orm.ui.editPart.shape.ORMShapeWithSegmentEditPart;

/**
 * This {@link GraphicalNodeEditPolicy} handles request for the creations of all kinds of
 * {@link Relation}s except of {@linkReltions} from type relationshipimplication and creates and
 * returns the necessary commands for that purpose. NewObject = O/o SourceEditPart = S/s
 * TargetEditPart = T/t Model = M/m
 * 
 * @author Kay Bierzynski
 * */
public class ORMShapeGraphicalNodeEditPolicy extends GraphicalNodeEditPolicy {
  /**
   * A {@link Relation} from type relationship that exist between source edit part and target edit
   * part.
   * */
  private Relation testedRelationship = null;

  /**
   * {@inheritDoc} The feedback is only shown when the target edit part model is not the model
   * parent of the source edit part model. (this restriction is important for the creation of
   * {@link Relation}s in a {@link Shape} from type role group)
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
   * @return {@link ORMRelationshipConstraintCreateCommand}( in case a {@link Relation} from type
   *         cyclic, total or irreflexive should be created) or {@link ORMRelationCreateCommand}( in
   *         case any other Relation should be created)
   * */
  @Override
  protected Command getConnectionCompleteCommand(final CreateConnectionRequest request) {
    Command retVal = null;
    if (isCompleteOK(request)) {
      retVal = setupConnectionCompleteCommand(request);
    }

    // Irreflexive Acyclic Total End
    if ((oSTCheck(request, Type.CYCLIC, Type.ROLE_TYPE, Type.ROLE_TYPE)
        || oSTCheck(request, Type.IRREFLEXIVE, Type.ROLE_TYPE, Type.ROLE_TYPE) || oSTCheck(request,
          Type.TOTAL, Type.ROLE_TYPE, Type.ROLE_TYPE))
        && tNotEqualSCheck(request)
        && hasARelationship(request, true) && !hasConstraintsKind(request)) {
      final ORMRelationshipConstraintCreateCommand result =
          (ORMRelationshipConstraintCreateCommand) request.getStartCommand();
      result.setTarget((Shape) getHost().getModel());
      ArrayList<Relation> refrencedRelations = new ArrayList<Relation>();
      refrencedRelations.add(testedRelationship);
      result.setRefrencedRelations(refrencedRelations);

      retVal = result;
    }

    return retVal;
  }

  /**
   * {@inheritDoc}
   * 
   * @return {@link ORMRelationshipConstraintCreateCommand}( in case a {@link Relation} from type
   *         cyclic, total or irreflexive should be created) or {@link ORMRelationCreateCommand}( in
   *         case any other Relation should be created)
   * */
  @Override
  protected Command getConnectionCreateCommand(final CreateConnectionRequest request) {
    Command retVal = null;

    if (isStartOK(request)) {
      retVal = setupConnectionStartCommand(request, ((Shape) getHost().getModel()).getContainer());
    }

    // Irreflexive Acyclic Total start
    if ((oTCheck(request, Type.CYCLIC, Type.ROLE_TYPE)
        || oTCheck(request, Type.IRREFLEXIVE, Type.ROLE_TYPE) || oTCheck(request, Type.TOTAL,
          Type.ROLE_TYPE)) && hasARelationship(request, false)) {

      final ORMRelationshipConstraintCreateCommand result =
          new ORMRelationshipConstraintCreateCommand();
      result.setSource((Shape) getHost().getModel());
      result.setRelation((Relation) request.getNewObject());
      request.setStartCommand(result);

      result.setRelationContainer(((Shape) getHost().getModel()).getContainer());

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
   * This method tests if the type of the new object given by the request equals objecttye, the
   * source edit part model type given by the request equals the sourcetype and the target edit part
   * model type given by the request equals of targettype.
   * 
   * @fullname newObjectSourceEditPartTargetEditPartCheck
   * @return boolean
   * */
  private boolean oSTCheck(final CreateConnectionRequest request, final Type objecttype,
      final Type sourcetype, final Type targettype) {
    Shape source = (Shape) request.getSourceEditPart().getModel();
    Shape target = (Shape) request.getTargetEditPart().getModel();
    return request.getNewObjectType().equals(objecttype) && targettype.equals(target.getType())
        && sourcetype.equals(source.getType());
  }


  /**
   * This method tests if the new object given by the request equals objecttype and the target edit
   * part model type given by the request equals targettype.
   * 
   * @fullname newObjectTargetEditPartCheck
   * @return boolean
   * */
  private boolean oTCheck(final CreateConnectionRequest request, final Type objecttype,
      final Type targettype) {
    Shape target = (Shape) request.getTargetEditPart().getModel();
    return request.getNewObjectType().equals(objecttype) && targettype.equals(target.getType());
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
   * This method completes and return the creation commands for all {@link Relation}s except for
   * {@link Relation}s from type cyclic, irreflexive and total.
   * 
   * @return {@link ORMRelationCreateCommand}
   * */
  private ORMRelationCreateCommand setupConnectionCompleteCommand(
      final CreateConnectionRequest request) {
    final ORMRelationCreateCommand result = (ORMRelationCreateCommand) request.getStartCommand();
    result.setTarget((Shape) getHost().getModel());
    return result;
  }


  /**
   * This method creates and return the creation command for all {@link Relation}s except the
   * relations from type cyclic, total and irrflexive.
   * 
   * @return {@link ORMRelationCreateCommand}
   * */
  private ORMRelationCreateCommand setupConnectionStartCommand(
      final CreateConnectionRequest request, final Model container) {
    final ORMRelationCreateCommand result = new ORMRelationCreateCommand();
    result.setSource((Shape) getHost().getModel());
    result.setRelation((Relation) request.getNewObject());
    result.setRelationContainer(container);

    if (request.getNewObjectType().equals(Type.RELATIONSHIP)) {
      NamedElement ele = OrmFactory.eINSTANCE.createNamedElement();
      ele.setName("*");
      result.setSourceLabel(ele);
      NamedElement ele2 = OrmFactory.eINSTANCE.createNamedElement();
      ele2.setName("*");
      result.setTargetLabel(ele2);
    }
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
        if (source.getParent() instanceof ORMModelEditPart) {
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
   * kind(except {@link Relation}s from type total, irreflexive and cyclic) are fulfilled.
   * 
   * @return boolean
   * */
  public boolean isCompleteOK(final CreateConnectionRequest request) {
    // Fulfillment Test End
    return oSTCheck(request, Type.FULFILLMENT, Type.NATURAL_TYPE, Type.COMPARTMENT_TYPE)
        || oSTCheck(request, Type.FULFILLMENT, Type.DATA_TYPE, Type.COMPARTMENT_TYPE)
        || oSTCheck(request, Type.FULFILLMENT, Type.COMPARTMENT_TYPE, Type.COMPARTMENT_TYPE)
        // Role Implication TesT End
        || ((oSTCheck(request, Type.ROLE_IMPLICATION, Type.ROLE_GROUP, Type.ROLE_GROUP)
            || oSTCheck(request, Type.ROLE_IMPLICATION, Type.ROLE_GROUP, Type.ROLE_TYPE)
            || oSTCheck(request, Type.ROLE_IMPLICATION, Type.ROLE_TYPE, Type.ROLE_GROUP) || oSTCheck(
              request, Type.ROLE_IMPLICATION, Type.ROLE_TYPE, Type.ROLE_TYPE))
            && tNotEqualSCheck(request)
            && !parentTest(request.getTargetEditPart(), request.getSourceEditPart()) && !childrenTest(
              request.getTargetEditPart(), request.getSourceEditPart()))
        // Role Equilvalence Test End
        || ((oSTCheck(request, Type.ROLE_EQUIVALENCE, Type.ROLE_GROUP, Type.ROLE_GROUP)
            || oSTCheck(request, Type.ROLE_EQUIVALENCE, Type.ROLE_GROUP, Type.ROLE_TYPE)
            || oSTCheck(request, Type.ROLE_EQUIVALENCE, Type.ROLE_TYPE, Type.ROLE_GROUP) || oSTCheck(
              request, Type.ROLE_EQUIVALENCE, Type.ROLE_TYPE, Type.ROLE_TYPE))
            && tNotEqualSCheck(request)
            && !parentTest(request.getTargetEditPart(), request.getSourceEditPart()) && !childrenTest(
              request.getTargetEditPart(), request.getSourceEditPart()))
        // Role Prohibition Test End
        || ((oSTCheck(request, Type.ROLE_PROHIBITION, Type.ROLE_GROUP, Type.ROLE_GROUP)
            || oSTCheck(request, Type.ROLE_PROHIBITION, Type.ROLE_GROUP, Type.ROLE_TYPE)
            || oSTCheck(request, Type.ROLE_PROHIBITION, Type.ROLE_TYPE, Type.ROLE_GROUP) || oSTCheck(
              request, Type.ROLE_PROHIBITION, Type.ROLE_TYPE, Type.ROLE_TYPE))
            && tNotEqualSCheck(request)
            && !parentTest(request.getTargetEditPart(), request.getSourceEditPart()) && !childrenTest(
              request.getTargetEditPart(), request.getSourceEditPart()))
        // Inheritance Test End
        || (oSTCheck(request, Type.INHERITANCE, Type.ROLE_TYPE, Type.ROLE_TYPE) && tNotEqualSCheck(request))
        || (oSTCheck(request, Type.INHERITANCE, Type.NATURAL_TYPE, Type.NATURAL_TYPE) && tNotEqualSCheck(request))
        || (oSTCheck(request, Type.INHERITANCE, Type.DATA_TYPE, Type.DATA_TYPE) && tNotEqualSCheck(request))
        || (oSTCheck(request, Type.INHERITANCE, Type.COMPARTMENT_TYPE, Type.COMPARTMENT_TYPE) && tNotEqualSCheck(request))
        // Relationship Test End
        || (oSTCheck(request, Type.RELATIONSHIP, Type.ROLE_TYPE, Type.ROLE_TYPE)
            && tNotEqualSCheck(request) && !hasARelationship(request, true));
  }

  /**
   * This method tests if the conditions for the creation start of a {@link Relation} kind(except
   * {@link Relation}s from type total, cyclic and irreflexive) are fulfilled.
   * 
   * @return boolean
   * */
  public boolean isStartOK(final CreateConnectionRequest request) {
    // Fufillment start
    return oTCheck(request, Type.FULFILLMENT, Type.NATURAL_TYPE)
        || oTCheck(request, Type.FULFILLMENT, Type.DATA_TYPE)
        || oTCheck(request, Type.FULFILLMENT, Type.COMPARTMENT_TYPE)
        // Role Implication start
        || oTCheck(request, Type.ROLE_IMPLICATION, Type.ROLE_TYPE)
        || oTCheck(request, Type.ROLE_IMPLICATION, Type.ROLE_GROUP)
        // Role Equivalence start
        || oTCheck(request, Type.ROLE_EQUIVALENCE, Type.ROLE_TYPE)
        || oTCheck(request, Type.ROLE_EQUIVALENCE, Type.ROLE_GROUP)
        // Role Prohibition start
        || oTCheck(request, Type.ROLE_PROHIBITION, Type.ROLE_TYPE)
        || oTCheck(request, Type.ROLE_PROHIBITION, Type.ROLE_GROUP)
        // Inheritance start
        || oTCheck(request, Type.INHERITANCE, Type.NATURAL_TYPE)
        || oTCheck(request, Type.INHERITANCE, Type.DATA_TYPE)
        || oTCheck(request, Type.INHERITANCE, Type.ROLE_TYPE)
        || oTCheck(request, Type.INHERITANCE, Type.COMPARTMENT_TYPE)
        // Relationship start
        || oTCheck(request, Type.RELATIONSHIP, Type.ROLE_TYPE);
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
      if (child.getModel() instanceof Shape) {
        Shape shape = (Shape) child.getModel();
        if (shape.getType().equals(Type.ROLE_TYPE)) {
          roleGroups.add(child);
        }
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
   * relationshipConstraint(total,irrflexive,cyclic) kind of the requested relationshipConstraint
   * kind.
   * 
   * @return boolean
   * */
  private boolean hasConstraintsKind(final CreateConnectionRequest request) {

    if (testedRelationship != null) {
      for (Relation rel : testedRelationship.getReferencedRelation()) {
        if (request.getNewObjectType().equals(Type.IRREFLEXIVE)
            && rel.getType().equals(Type.IRREFLEXIVE))
          return true;
        if (request.getNewObjectType().equals(Type.TOTAL) && rel.getType().equals(Type.TOTAL))
          return true;
        if (request.getNewObjectType().equals(Type.CYCLIC) && rel.getType().equals(Type.CYCLIC))
          return true;
      }
    }
    return false;
  }

  /**
   * This method tests if between source edit part and traget edit part already exist a
   * {@link Relation} from type relationship.
   * 
   * @return boolean
   * */
  private boolean hasARelationship(final CreateConnectionRequest request, final boolean isTargetTest) {
    final List<Relation> relList = new ArrayList<Relation>();
    final List<Relation> relSourceList = new ArrayList<Relation>();
    // false source edit part(else) true target edit part(if)
    if (isTargetTest) {
      relList.addAll(((ORMShapeWithSegmentEditPart) request.getTargetEditPart())
          .getModelTargetConnections());
      relList.addAll(((ORMShapeWithSegmentEditPart) request.getTargetEditPart())
          .getModelSourceConnections());
      relSourceList.addAll(((ORMShapeWithSegmentEditPart) request.getSourceEditPart())
          .getModelTargetConnections());
      relSourceList.addAll(((ORMShapeWithSegmentEditPart) request.getSourceEditPart())
          .getModelSourceConnections());
      // test: has the target editpart the relationship connection as the source connection?
      for (Relation rel : relList) {
        if (rel.getType().equals(Type.RELATIONSHIP)) {
          for (Relation rel2 : relSourceList) {
            if (rel2.equals(rel)) {
              testedRelationship = rel;
              return true;
            }
          }

        }
      }
    } else {
      // test: has the source editpart a relationship as connection?
      relList.addAll(((ORMShapeWithSegmentEditPart) request.getTargetEditPart())
          .getModelSourceConnections());
      relList.addAll(((ORMShapeWithSegmentEditPart) request.getTargetEditPart())
          .getModelTargetConnections());
      for (Relation rel : relList) {
        if (rel.getType().equals(Type.RELATIONSHIP))
          return true;
      }
    }
    return false;
  }
}
