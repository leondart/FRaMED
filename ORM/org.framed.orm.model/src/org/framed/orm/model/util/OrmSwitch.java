/**
 */
package org.framed.orm.model.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.framed.orm.model.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.framed.orm.model.OrmPackage
 * @generated
 */
public class OrmSwitch<T> extends Switch<T> {
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static OrmPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OrmSwitch() {
    if (modelPackage == null) {
      modelPackage = OrmPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage) {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject) {
    switch (classifierID) {
      case OrmPackage.NAMED_ELEMENT: {
        NamedElement namedElement = (NamedElement) theEObject;
        T result = caseNamedElement(namedElement);
        if (result == null)
          result = defaultCase(theEObject);
        return result;
      }
      case OrmPackage.MODEL_ELEMENT: {
        ModelElement modelElement = (ModelElement) theEObject;
        T result = caseModelElement(modelElement);
        if (result == null)
          result = caseNamedElement(modelElement);
        if (result == null)
          result = defaultCase(theEObject);
        return result;
      }
      case OrmPackage.MODEL: {
        Model model = (Model) theEObject;
        T result = caseModel(model);
        if (result == null)
          result = defaultCase(theEObject);
        return result;
      }
      case OrmPackage.ELEMENT_MODEL: {
        ElementModel elementModel = (ElementModel) theEObject;
        T result = caseElementModel(elementModel);
        if (result == null)
          result = caseModel(elementModel);
        if (result == null)
          result = defaultCase(theEObject);
        return result;
      }
      case OrmPackage.ABSTRACT_ROLE_MODEL: {
        AbstractRoleModel abstractRoleModel = (AbstractRoleModel) theEObject;
        T result = caseAbstractRoleModel(abstractRoleModel);
        if (result == null)
          result = caseModel(abstractRoleModel);
        if (result == null)
          result = defaultCase(theEObject);
        return result;
      }
      case OrmPackage.RIGID_TYPE: {
        RigidType rigidType = (RigidType) theEObject;
        T result = caseRigidType(rigidType);
        if (result == null)
          result = caseModelElement(rigidType);
        if (result == null)
          result = caseType(rigidType);
        if (result == null)
          result = caseRelationTarget(rigidType);
        if (result == null)
          result = caseNamedElement(rigidType);
        if (result == null)
          result = defaultCase(theEObject);
        return result;
      }
      case OrmPackage.GROUP: {
        Group group = (Group) theEObject;
        T result = caseGroup(group);
        if (result == null)
          result = caseModelElement(group);
        if (result == null)
          result = caseElementModel(group);
        if (result == null)
          result = caseRelationTarget(group);
        if (result == null)
          result = caseNamedElement(group);
        if (result == null)
          result = caseModel(group);
        if (result == null)
          result = defaultCase(theEObject);
        return result;
      }
      case OrmPackage.RELATION: {
        Relation relation = (Relation) theEObject;
        T result = caseRelation(relation);
        if (result == null)
          result = defaultCase(theEObject);
        return result;
      }
      case OrmPackage.PARAMETER: {
        Parameter parameter = (Parameter) theEObject;
        T result = caseParameter(parameter);
        if (result == null)
          result = caseTypedElement(parameter);
        if (result == null)
          result = caseNamedElement(parameter);
        if (result == null)
          result = defaultCase(theEObject);
        return result;
      }
      case OrmPackage.OPERATION: {
        Operation operation = (Operation) theEObject;
        T result = caseOperation(operation);
        if (result == null)
          result = caseTypedElement(operation);
        if (result == null)
          result = caseNamedElement(operation);
        if (result == null)
          result = defaultCase(theEObject);
        return result;
      }
      case OrmPackage.ATTRIBUTE: {
        Attribute attribute = (Attribute) theEObject;
        T result = caseAttribute(attribute);
        if (result == null)
          result = caseTypedElement(attribute);
        if (result == null)
          result = caseNamedElement(attribute);
        if (result == null)
          result = defaultCase(theEObject);
        return result;
      }
      case OrmPackage.TYPE: {
        Type type = (Type) theEObject;
        T result = caseType(type);
        if (result == null)
          result = caseRelationTarget(type);
        if (result == null)
          result = caseNamedElement(type);
        if (result == null)
          result = defaultCase(theEObject);
        return result;
      }
      case OrmPackage.DATA_TYPE: {
        DataType dataType = (DataType) theEObject;
        T result = caseDataType(dataType);
        if (result == null)
          result = caseRigidType(dataType);
        if (result == null)
          result = caseModelElement(dataType);
        if (result == null)
          result = caseType(dataType);
        if (result == null)
          result = caseRelationTarget(dataType);
        if (result == null)
          result = caseNamedElement(dataType);
        if (result == null)
          result = defaultCase(theEObject);
        return result;
      }
      case OrmPackage.NATURAL_TYPE: {
        NaturalType naturalType = (NaturalType) theEObject;
        T result = caseNaturalType(naturalType);
        if (result == null)
          result = caseRigidType(naturalType);
        if (result == null)
          result = caseModelElement(naturalType);
        if (result == null)
          result = caseType(naturalType);
        if (result == null)
          result = caseRelationTarget(naturalType);
        if (result == null)
          result = caseNamedElement(naturalType);
        if (result == null)
          result = defaultCase(theEObject);
        return result;
      }
      case OrmPackage.COMPARTMENT_TYPE: {
        CompartmentType compartmentType = (CompartmentType) theEObject;
        T result = caseCompartmentType(compartmentType);
        if (result == null)
          result = caseRigidType(compartmentType);
        if (result == null)
          result = caseAbstractRoleModel(compartmentType);
        if (result == null)
          result = caseModelElement(compartmentType);
        if (result == null)
          result = caseType(compartmentType);
        if (result == null)
          result = caseModel(compartmentType);
        if (result == null)
          result = caseRelationTarget(compartmentType);
        if (result == null)
          result = caseNamedElement(compartmentType);
        if (result == null)
          result = defaultCase(theEObject);
        return result;
      }
      case OrmPackage.ANTI_RIGID_TYPE: {
        AntiRigidType antiRigidType = (AntiRigidType) theEObject;
        T result = caseAntiRigidType(antiRigidType);
        if (result == null)
          result = caseType(antiRigidType);
        if (result == null)
          result = caseRelationTarget(antiRigidType);
        if (result == null)
          result = caseNamedElement(antiRigidType);
        if (result == null)
          result = defaultCase(theEObject);
        return result;
      }
      case OrmPackage.ROLE_TYPE: {
        RoleType roleType = (RoleType) theEObject;
        T result = caseRoleType(roleType);
        if (result == null)
          result = caseAbstractRole(roleType);
        if (result == null)
          result = caseAntiRigidType(roleType);
        if (result == null)
          result = caseRoleGroupElement(roleType);
        if (result == null)
          result = caseType(roleType);
        if (result == null)
          result = caseRelationTarget(roleType);
        if (result == null)
          result = caseNamedElement(roleType);
        if (result == null)
          result = defaultCase(theEObject);
        return result;
      }
      case OrmPackage.RELATIONSHIP: {
        Relationship relationship = (Relationship) theEObject;
        T result = caseRelationship(relationship);
        if (result == null)
          result = caseRelation(relationship);
        if (result == null)
          result = caseNamedElement(relationship);
        if (result == null)
          result = defaultCase(theEObject);
        return result;
      }
      case OrmPackage.FULFILLMENT: {
        Fulfillment fulfillment = (Fulfillment) theEObject;
        T result = caseFulfillment(fulfillment);
        if (result == null)
          result = caseRelation(fulfillment);
        if (result == null)
          result = defaultCase(theEObject);
        return result;
      }
      case OrmPackage.INHERITANCE: {
        Inheritance inheritance = (Inheritance) theEObject;
        T result = caseInheritance(inheritance);
        if (result == null)
          result = caseRelation(inheritance);
        if (result == null)
          result = defaultCase(theEObject);
        return result;
      }
      case OrmPackage.CONSTRAINT: {
        Constraint constraint = (Constraint) theEObject;
        T result = caseConstraint(constraint);
        if (result == null)
          result = caseRelation(constraint);
        if (result == null)
          result = defaultCase(theEObject);
        return result;
      }
      case OrmPackage.ROLE_CONSTRAINT: {
        RoleConstraint roleConstraint = (RoleConstraint) theEObject;
        T result = caseRoleConstraint(roleConstraint);
        if (result == null)
          result = caseConstraint(roleConstraint);
        if (result == null)
          result = caseRelation(roleConstraint);
        if (result == null)
          result = defaultCase(theEObject);
        return result;
      }
      case OrmPackage.RELATIONSHIP_CONSTRAINT: {
        RelationshipConstraint relationshipConstraint = (RelationshipConstraint) theEObject;
        T result = caseRelationshipConstraint(relationshipConstraint);
        if (result == null)
          result = caseConstraint(relationshipConstraint);
        if (result == null)
          result = caseRelation(relationshipConstraint);
        if (result == null)
          result = defaultCase(theEObject);
        return result;
      }
      case OrmPackage.INTRA_RELATIONSHIP_CONSTRAINT: {
        IntraRelationshipConstraint intraRelationshipConstraint =
            (IntraRelationshipConstraint) theEObject;
        T result = caseIntraRelationshipConstraint(intraRelationshipConstraint);
        if (result == null)
          result = caseRelationshipConstraint(intraRelationshipConstraint);
        if (result == null)
          result = caseConstraint(intraRelationshipConstraint);
        if (result == null)
          result = caseRelation(intraRelationshipConstraint);
        if (result == null)
          result = defaultCase(theEObject);
        return result;
      }
      case OrmPackage.INTER_RELATIONSHIP_CONSTRAINT: {
        InterRelationshipConstraint interRelationshipConstraint =
            (InterRelationshipConstraint) theEObject;
        T result = caseInterRelationshipConstraint(interRelationshipConstraint);
        if (result == null)
          result = caseRelationshipConstraint(interRelationshipConstraint);
        if (result == null)
          result = caseConstraint(interRelationshipConstraint);
        if (result == null)
          result = caseRelation(interRelationshipConstraint);
        if (result == null)
          result = defaultCase(theEObject);
        return result;
      }
      case OrmPackage.COMPLEX_CONSTRAINT: {
        ComplexConstraint complexConstraint = (ComplexConstraint) theEObject;
        T result = caseComplexConstraint(complexConstraint);
        if (result == null)
          result = caseConstraint(complexConstraint);
        if (result == null)
          result = caseRelation(complexConstraint);
        if (result == null)
          result = defaultCase(theEObject);
        return result;
      }
      case OrmPackage.DATA_INHERITANCE: {
        DataInheritance dataInheritance = (DataInheritance) theEObject;
        T result = caseDataInheritance(dataInheritance);
        if (result == null)
          result = caseInheritance(dataInheritance);
        if (result == null)
          result = caseRelation(dataInheritance);
        if (result == null)
          result = defaultCase(theEObject);
        return result;
      }
      case OrmPackage.NATURAL_INHERITANCE: {
        NaturalInheritance naturalInheritance = (NaturalInheritance) theEObject;
        T result = caseNaturalInheritance(naturalInheritance);
        if (result == null)
          result = caseInheritance(naturalInheritance);
        if (result == null)
          result = caseRelation(naturalInheritance);
        if (result == null)
          result = defaultCase(theEObject);
        return result;
      }
      case OrmPackage.COMPARTMENT_INHERITANCE: {
        CompartmentInheritance compartmentInheritance = (CompartmentInheritance) theEObject;
        T result = caseCompartmentInheritance(compartmentInheritance);
        if (result == null)
          result = caseInheritance(compartmentInheritance);
        if (result == null)
          result = caseRelation(compartmentInheritance);
        if (result == null)
          result = defaultCase(theEObject);
        return result;
      }
      case OrmPackage.ROLE_INHERITANCE: {
        RoleInheritance roleInheritance = (RoleInheritance) theEObject;
        T result = caseRoleInheritance(roleInheritance);
        if (result == null)
          result = caseInheritance(roleInheritance);
        if (result == null)
          result = caseRelation(roleInheritance);
        if (result == null)
          result = defaultCase(theEObject);
        return result;
      }
      case OrmPackage.PLACE: {
        Place place = (Place) theEObject;
        T result = casePlace(place);
        if (result == null)
          result = defaultCase(theEObject);
        return result;
      }
      case OrmPackage.RELATIONSHIP_IMPLICATION: {
        RelationshipImplication relationshipImplication = (RelationshipImplication) theEObject;
        T result = caseRelationshipImplication(relationshipImplication);
        if (result == null)
          result = caseInterRelationshipConstraint(relationshipImplication);
        if (result == null)
          result = caseRelationshipConstraint(relationshipImplication);
        if (result == null)
          result = caseConstraint(relationshipImplication);
        if (result == null)
          result = caseRelation(relationshipImplication);
        if (result == null)
          result = defaultCase(theEObject);
        return result;
      }
      case OrmPackage.RELATION_TARGET: {
        RelationTarget relationTarget = (RelationTarget) theEObject;
        T result = caseRelationTarget(relationTarget);
        if (result == null)
          result = caseNamedElement(relationTarget);
        if (result == null)
          result = defaultCase(theEObject);
        return result;
      }
      case OrmPackage.IRREFLEXIVE: {
        Irreflexive irreflexive = (Irreflexive) theEObject;
        T result = caseIrreflexive(irreflexive);
        if (result == null)
          result = caseIntraRelationshipConstraint(irreflexive);
        if (result == null)
          result = caseRelationshipConstraint(irreflexive);
        if (result == null)
          result = caseConstraint(irreflexive);
        if (result == null)
          result = caseRelation(irreflexive);
        if (result == null)
          result = defaultCase(theEObject);
        return result;
      }
      case OrmPackage.CYCLIC: {
        Cyclic cyclic = (Cyclic) theEObject;
        T result = caseCyclic(cyclic);
        if (result == null)
          result = caseIntraRelationshipConstraint(cyclic);
        if (result == null)
          result = caseRelationshipConstraint(cyclic);
        if (result == null)
          result = caseConstraint(cyclic);
        if (result == null)
          result = caseRelation(cyclic);
        if (result == null)
          result = defaultCase(theEObject);
        return result;
      }
      case OrmPackage.TOTAL: {
        Total total = (Total) theEObject;
        T result = caseTotal(total);
        if (result == null)
          result = caseIntraRelationshipConstraint(total);
        if (result == null)
          result = caseRelationshipConstraint(total);
        if (result == null)
          result = caseConstraint(total);
        if (result == null)
          result = caseRelation(total);
        if (result == null)
          result = defaultCase(theEObject);
        return result;
      }
      case OrmPackage.ABSTRACT_ROLE: {
        AbstractRole abstractRole = (AbstractRole) theEObject;
        T result = caseAbstractRole(abstractRole);
        if (result == null)
          result = caseRoleGroupElement(abstractRole);
        if (result == null)
          result = defaultCase(theEObject);
        return result;
      }
      case OrmPackage.ROLE_GROUP: {
        RoleGroup roleGroup = (RoleGroup) theEObject;
        T result = caseRoleGroup(roleGroup);
        if (result == null)
          result = caseAbstractRole(roleGroup);
        if (result == null)
          result = caseRelationTarget(roleGroup);
        if (result == null)
          result = caseAbstractRoleModel(roleGroup);
        if (result == null)
          result = caseRoleGroupElement(roleGroup);
        if (result == null)
          result = caseNamedElement(roleGroup);
        if (result == null)
          result = caseModel(roleGroup);
        if (result == null)
          result = defaultCase(theEObject);
        return result;
      }
      case OrmPackage.ROLE_IMPLICATION: {
        RoleImplication roleImplication = (RoleImplication) theEObject;
        T result = caseRoleImplication(roleImplication);
        if (result == null)
          result = caseRoleConstraint(roleImplication);
        if (result == null)
          result = caseConstraint(roleImplication);
        if (result == null)
          result = caseRelation(roleImplication);
        if (result == null)
          result = defaultCase(theEObject);
        return result;
      }
      case OrmPackage.ROLE_EQUIVALENCE: {
        RoleEquivalence roleEquivalence = (RoleEquivalence) theEObject;
        T result = caseRoleEquivalence(roleEquivalence);
        if (result == null)
          result = caseRoleConstraint(roleEquivalence);
        if (result == null)
          result = caseConstraint(roleEquivalence);
        if (result == null)
          result = caseRelation(roleEquivalence);
        if (result == null)
          result = defaultCase(theEObject);
        return result;
      }
      case OrmPackage.ROLE_PROHIBITION: {
        RoleProhibition roleProhibition = (RoleProhibition) theEObject;
        T result = caseRoleProhibition(roleProhibition);
        if (result == null)
          result = caseRoleConstraint(roleProhibition);
        if (result == null)
          result = caseConstraint(roleProhibition);
        if (result == null)
          result = caseRelation(roleProhibition);
        if (result == null)
          result = defaultCase(theEObject);
        return result;
      }
      case OrmPackage.PART: {
        Part part = (Part) theEObject;
        T result = casePart(part);
        if (result == null)
          result = defaultCase(theEObject);
        return result;
      }
      case OrmPackage.TYPED_ELEMENT: {
        TypedElement typedElement = (TypedElement) theEObject;
        T result = caseTypedElement(typedElement);
        if (result == null)
          result = caseNamedElement(typedElement);
        if (result == null)
          result = defaultCase(theEObject);
        return result;
      }
      case OrmPackage.PARTHOOD_CONSTRAINT: {
        ParthoodConstraint parthoodConstraint = (ParthoodConstraint) theEObject;
        T result = caseParthoodConstraint(parthoodConstraint);
        if (result == null)
          result = caseIntraRelationshipConstraint(parthoodConstraint);
        if (result == null)
          result = caseRelationshipConstraint(parthoodConstraint);
        if (result == null)
          result = caseConstraint(parthoodConstraint);
        if (result == null)
          result = caseRelation(parthoodConstraint);
        if (result == null)
          result = defaultCase(theEObject);
        return result;
      }
      case OrmPackage.ROLE_GROUP_ELEMENT: {
        RoleGroupElement roleGroupElement = (RoleGroupElement) theEObject;
        T result = caseRoleGroupElement(roleGroupElement);
        if (result == null)
          result = defaultCase(theEObject);
        return result;
      }
      case OrmPackage.ABSTRACT_ROLE_REF: {
        AbstractRoleRef abstractRoleRef = (AbstractRoleRef) theEObject;
        T result = caseAbstractRoleRef(abstractRoleRef);
        if (result == null)
          result = caseRoleGroupElement(abstractRoleRef);
        if (result == null)
          result = defaultCase(theEObject);
        return result;
      }
      case OrmPackage.RELATION_LABEL: {
        RelationLabel relationLabel = (RelationLabel) theEObject;
        T result = caseRelationLabel(relationLabel);
        if (result == null)
          result = defaultCase(theEObject);
        return result;
      }
      default:
        return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNamedElement(NamedElement object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Model Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Model Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModelElement(ModelElement object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Model</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModel(Model object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Element Model</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Element Model</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseElementModel(ElementModel object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Abstract Role Model</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Abstract Role Model</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAbstractRoleModel(AbstractRoleModel object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Rigid Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Rigid Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRigidType(RigidType object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Group</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Group</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGroup(Group object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Relation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Relation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRelation(Relation object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Parameter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Parameter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseParameter(Parameter object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Operation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Operation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOperation(Operation object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Attribute</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Attribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAttribute(Attribute object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseType(Type object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Data Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Data Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDataType(DataType object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Natural Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Natural Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNaturalType(NaturalType object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Compartment Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Compartment Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCompartmentType(CompartmentType object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Anti Rigid Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Anti Rigid Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAntiRigidType(AntiRigidType object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Role Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Role Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRoleType(RoleType object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Relationship</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Relationship</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRelationship(Relationship object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Fulfillment</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Fulfillment</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFulfillment(Fulfillment object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Inheritance</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Inheritance</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInheritance(Inheritance object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Constraint</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Constraint</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConstraint(Constraint object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Role Constraint</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Role Constraint</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRoleConstraint(RoleConstraint object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Relationship Constraint</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Relationship Constraint</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRelationshipConstraint(RelationshipConstraint object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Intra Relationship Constraint</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Intra Relationship Constraint</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIntraRelationshipConstraint(IntraRelationshipConstraint object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Inter Relationship Constraint</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Inter Relationship Constraint</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInterRelationshipConstraint(InterRelationshipConstraint object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Complex Constraint</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Complex Constraint</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseComplexConstraint(ComplexConstraint object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Data Inheritance</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Data Inheritance</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDataInheritance(DataInheritance object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Natural Inheritance</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Natural Inheritance</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNaturalInheritance(NaturalInheritance object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Compartment Inheritance</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Compartment Inheritance</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCompartmentInheritance(CompartmentInheritance object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Role Inheritance</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Role Inheritance</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRoleInheritance(RoleInheritance object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Place</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Place</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePlace(Place object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Relationship Implication</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Relationship Implication</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRelationshipImplication(RelationshipImplication object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Relation Target</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Relation Target</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRelationTarget(RelationTarget object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Irreflexive</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Irreflexive</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIrreflexive(Irreflexive object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Cyclic</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Cyclic</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCyclic(Cyclic object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Total</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Total</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTotal(Total object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Abstract Role</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Abstract Role</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAbstractRole(AbstractRole object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Role Group</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Role Group</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRoleGroup(RoleGroup object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Role Implication</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Role Implication</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRoleImplication(RoleImplication object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Role Equivalence</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Role Equivalence</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRoleEquivalence(RoleEquivalence object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Role Prohibition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Role Prohibition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRoleProhibition(RoleProhibition object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Part</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Part</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePart(Part object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Typed Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Typed Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTypedElement(TypedElement object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Parthood Constraint</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Parthood Constraint</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseParthoodConstraint(ParthoodConstraint object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Role Group Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Role Group Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRoleGroupElement(RoleGroupElement object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Abstract Role Ref</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Abstract Role Ref</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAbstractRoleRef(AbstractRoleRef object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Relation Label</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Relation Label</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRelationLabel(RelationLabel object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object) {
    return null;
  }

} //OrmSwitch
