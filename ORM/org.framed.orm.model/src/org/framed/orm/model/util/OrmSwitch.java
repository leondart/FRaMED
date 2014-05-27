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
      case OrmPackage.ATTRIBUTE: {
        Attribute attribute = (Attribute)theEObject;
        T result = caseAttribute(attribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OrmPackage.METHOD: {
        Method method = (Method)theEObject;
        T result = caseMethod(method);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OrmPackage.TYPE: {
        Type type = (Type)theEObject;
        T result = caseType(type);
        if (result == null) result = caseNode(type);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OrmPackage.COMPARTMENT_DIAGRAM: {
        CompartmentDiagram compartmentDiagram = (CompartmentDiagram)theEObject;
        T result = caseCompartmentDiagram(compartmentDiagram);
        if (result == null) result = caseRelationContainer(compartmentDiagram);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OrmPackage.NATURAL_TYPE: {
        NaturalType naturalType = (NaturalType)theEObject;
        T result = caseNaturalType(naturalType);
        if (result == null) result = caseType(naturalType);
        if (result == null) result = caseNode(naturalType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OrmPackage.COMPARTMENT: {
        Compartment compartment = (Compartment)theEObject;
        T result = caseCompartment(compartment);
        if (result == null) result = caseType(compartment);
        if (result == null) result = caseNode(compartment);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OrmPackage.GROUPING: {
        Grouping grouping = (Grouping)theEObject;
        T result = caseGrouping(grouping);
        if (result == null) result = caseNode(grouping);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OrmPackage.NODE: {
        Node node = (Node)theEObject;
        T result = caseNode(node);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OrmPackage.ROLE_TYPE: {
        RoleType roleType = (RoleType)theEObject;
        T result = caseRoleType(roleType);
        if (result == null) result = caseType(roleType);
        if (result == null) result = caseAbstractRole(roleType);
        if (result == null) result = caseNode(roleType);
        if (result == null) result = caseConstraint(roleType);
        if (result == null) result = caseRelation(roleType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OrmPackage.RELATION_CONTAINER: {
        RelationContainer relationContainer = (RelationContainer)theEObject;
        T result = caseRelationContainer(relationContainer);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OrmPackage.ROLE_GROUP: {
        RoleGroup roleGroup = (RoleGroup)theEObject;
        T result = caseRoleGroup(roleGroup);
        if (result == null) result = caseAbstractRole(roleGroup);
        if (result == null) result = caseNode(roleGroup);
        if (result == null) result = caseRelationContainer(roleGroup);
        if (result == null) result = caseConstraint(roleGroup);
        if (result == null) result = caseRelation(roleGroup);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OrmPackage.ROLEMODEL: {
        Rolemodel rolemodel = (Rolemodel)theEObject;
        T result = caseRolemodel(rolemodel);
        if (result == null) result = caseRelationContainer(rolemodel);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OrmPackage.TOTAL: {
        Total total = (Total)theEObject;
        T result = caseTotal(total);
        if (result == null) result = caseRelationshipConstraint(total);
        if (result == null) result = caseConstraint(total);
        if (result == null) result = caseRelation(total);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OrmPackage.FULFILLMENT: {
        Fulfillment fulfillment = (Fulfillment)theEObject;
        T result = caseFulfillment(fulfillment);
        if (result == null) result = caseRelation(fulfillment);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OrmPackage.ROLE_EQUIVALENCE: {
        RoleEquivalence roleEquivalence = (RoleEquivalence)theEObject;
        T result = caseRoleEquivalence(roleEquivalence);
        if (result == null) result = caseRoleConstraint(roleEquivalence);
        if (result == null) result = caseConstraint(roleEquivalence);
        if (result == null) result = caseRelation(roleEquivalence);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OrmPackage.ACYCLIC: {
        Acyclic acyclic = (Acyclic)theEObject;
        T result = caseAcyclic(acyclic);
        if (result == null) result = caseRelationshipConstraint(acyclic);
        if (result == null) result = caseConstraint(acyclic);
        if (result == null) result = caseRelation(acyclic);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OrmPackage.INHERITANCE: {
        Inheritance inheritance = (Inheritance)theEObject;
        T result = caseInheritance(inheritance);
        if (result == null) result = caseRelation(inheritance);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OrmPackage.RELATIONSHIP: {
        Relationship relationship = (Relationship)theEObject;
        T result = caseRelationship(relationship);
        if (result == null) result = caseRelation(relationship);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OrmPackage.ROLE_PROHIBITION: {
        RoleProhibition roleProhibition = (RoleProhibition)theEObject;
        T result = caseRoleProhibition(roleProhibition);
        if (result == null) result = caseRoleConstraint(roleProhibition);
        if (result == null) result = caseConstraint(roleProhibition);
        if (result == null) result = caseRelation(roleProhibition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OrmPackage.IRREFLEXIVE: {
        Irreflexive irreflexive = (Irreflexive)theEObject;
        T result = caseIrreflexive(irreflexive);
        if (result == null) result = caseRelationshipConstraint(irreflexive);
        if (result == null) result = caseConstraint(irreflexive);
        if (result == null) result = caseRelation(irreflexive);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OrmPackage.ROLE_IMPLICATION: {
        RoleImplication roleImplication = (RoleImplication)theEObject;
        T result = caseRoleImplication(roleImplication);
        if (result == null) result = caseRoleConstraint(roleImplication);
        if (result == null) result = caseConstraint(roleImplication);
        if (result == null) result = caseRelation(roleImplication);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OrmPackage.RELATIONSHIP_CONSTRAINT: {
        RelationshipConstraint relationshipConstraint = (RelationshipConstraint)theEObject;
        T result = caseRelationshipConstraint(relationshipConstraint);
        if (result == null) result = caseConstraint(relationshipConstraint);
        if (result == null) result = caseRelation(relationshipConstraint);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OrmPackage.RELATION: {
        Relation relation = (Relation)theEObject;
        T result = caseRelation(relation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OrmPackage.CONSTRAINT: {
        Constraint constraint = (Constraint)theEObject;
        T result = caseConstraint(constraint);
        if (result == null) result = caseRelation(constraint);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OrmPackage.ROLE_CONSTRAINT: {
        RoleConstraint roleConstraint = (RoleConstraint)theEObject;
        T result = caseRoleConstraint(roleConstraint);
        if (result == null) result = caseConstraint(roleConstraint);
        if (result == null) result = caseRelation(roleConstraint);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OrmPackage.ROLE_INVARIANT: {
        RoleInvariant roleInvariant = (RoleInvariant)theEObject;
        T result = caseRoleInvariant(roleInvariant);
        if (result == null) result = caseConstraint(roleInvariant);
        if (result == null) result = caseRelation(roleInvariant);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OrmPackage.ABSTRACT_ROLE: {
        AbstractRole abstractRole = (AbstractRole)theEObject;
        T result = caseAbstractRole(abstractRole);
        if (result == null) result = caseConstraint(abstractRole);
        if (result == null) result = caseRelation(abstractRole);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OrmPackage.COMPLEX_CONSTRAINT: {
        ComplexConstraint complexConstraint = (ComplexConstraint)theEObject;
        T result = caseComplexConstraint(complexConstraint);
        if (result == null) result = caseConstraint(complexConstraint);
        if (result == null) result = caseRelation(complexConstraint);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
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
   * Returns the result of interpreting the object as an instance of '<em>Method</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Method</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMethod(Method object) {
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
   * Returns the result of interpreting the object as an instance of '<em>Compartment Diagram</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Compartment Diagram</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCompartmentDiagram(CompartmentDiagram object) {
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
   * Returns the result of interpreting the object as an instance of '<em>Compartment</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Compartment</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCompartment(Compartment object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Grouping</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Grouping</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGrouping(Grouping object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Node</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Node</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNode(Node object) {
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
   * Returns the result of interpreting the object as an instance of '<em>Relation Container</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Relation Container</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRelationContainer(RelationContainer object) {
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
   * Returns the result of interpreting the object as an instance of '<em>Rolemodel</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Rolemodel</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRolemodel(Rolemodel object) {
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
   * Returns the result of interpreting the object as an instance of '<em>Acyclic</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Acyclic</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAcyclic(Acyclic object) {
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
   * Returns the result of interpreting the object as an instance of '<em>Role Invariant</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Role Invariant</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRoleInvariant(RoleInvariant object) {
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
