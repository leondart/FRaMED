/**
 */
package org.framed.orm.model.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.framed.orm.model.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.framed.orm.model.OrmPackage
 * @generated
 */
public class OrmAdapterFactory extends AdapterFactoryImpl {
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static OrmPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OrmAdapterFactory() {
    if (modelPackage == null) {
      modelPackage = OrmPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object) {
    if (object == modelPackage) {
      return true;
    }
    if (object instanceof EObject) {
      return ((EObject) object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected OrmSwitch<Adapter> modelSwitch = new OrmSwitch<Adapter>() {
    @Override
    public Adapter caseAttribute(Attribute object) {
      return createAttributeAdapter();
    }

    @Override
    public Adapter caseMethod(Method object) {
      return createMethodAdapter();
    }

    @Override
    public Adapter caseType(Type object) {
      return createTypeAdapter();
    }

    @Override
    public Adapter caseCompartmentDiagram(CompartmentDiagram object) {
      return createCompartmentDiagramAdapter();
    }

    @Override
    public Adapter caseNaturalType(NaturalType object) {
      return createNaturalTypeAdapter();
    }

    @Override
    public Adapter caseCompartment(Compartment object) {
      return createCompartmentAdapter();
    }

    @Override
    public Adapter caseGrouping(Grouping object) {
      return createGroupingAdapter();
    }

    @Override
    public Adapter caseNode(Node object) {
      return createNodeAdapter();
    }

    @Override
    public Adapter caseRoleType(RoleType object) {
      return createRoleTypeAdapter();
    }

    @Override
    public Adapter caseContainer(Container object) {
      return createContainerAdapter();
    }

    @Override
    public Adapter caseRoleGroup(RoleGroup object) {
      return createRoleGroupAdapter();
    }

    @Override
    public Adapter caseRolemodel(Rolemodel object) {
      return createRolemodelAdapter();
    }

    @Override
    public Adapter caseTotal(Total object) {
      return createTotalAdapter();
    }

    @Override
    public Adapter caseFulfillment(Fulfillment object) {
      return createFulfillmentAdapter();
    }

    @Override
    public Adapter caseRoleEquivalence(RoleEquivalence object) {
      return createRoleEquivalenceAdapter();
    }

    @Override
    public Adapter caseAcyclic(Acyclic object) {
      return createAcyclicAdapter();
    }

    @Override
    public Adapter caseInheritance(Inheritance object) {
      return createInheritanceAdapter();
    }

    @Override
    public Adapter caseRelationship(Relationship object) {
      return createRelationshipAdapter();
    }

    @Override
    public Adapter caseRoleProhibition(RoleProhibition object) {
      return createRoleProhibitionAdapter();
    }

    @Override
    public Adapter caseIrreflexive(Irreflexive object) {
      return createIrreflexiveAdapter();
    }

    @Override
    public Adapter caseRoleImplication(RoleImplication object) {
      return createRoleImplicationAdapter();
    }

    @Override
    public Adapter caseRelationshipConstraint(RelationshipConstraint object) {
      return createRelationshipConstraintAdapter();
    }

    @Override
    public Adapter caseRelation(Relation object) {
      return createRelationAdapter();
    }

    @Override
    public Adapter caseConstraint(Constraint object) {
      return createConstraintAdapter();
    }

    @Override
    public Adapter caseRoleConstraint(RoleConstraint object) {
      return createRoleConstraintAdapter();
    }

    @Override
    public Adapter caseRoleInvariant(RoleInvariant object) {
      return createRoleInvariantAdapter();
    }

    @Override
    public Adapter caseAbstractRole(AbstractRole object) {
      return createAbstractRoleAdapter();
    }

    @Override
    public Adapter caseComplexConstraint(ComplexConstraint object) {
      return createComplexConstraintAdapter();
    }

    @Override
    public Adapter caseRelationLabel(RelationLabel object) {
      return createRelationLabelAdapter();
    }

    @Override
    public Adapter defaultCase(EObject object) {
      return createEObjectAdapter();
    }
  };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target) {
    return modelSwitch.doSwitch((EObject) target);
  }


  /**
   * Creates a new adapter for an object of class '{@link org.framed.orm.model.Attribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.framed.orm.model.Attribute
   * @generated
   */
  public Adapter createAttributeAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.framed.orm.model.Method <em>Method</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.framed.orm.model.Method
   * @generated
   */
  public Adapter createMethodAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.framed.orm.model.Type <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.framed.orm.model.Type
   * @generated
   */
  public Adapter createTypeAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.framed.orm.model.CompartmentDiagram <em>Compartment Diagram</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.framed.orm.model.CompartmentDiagram
   * @generated
   */
  public Adapter createCompartmentDiagramAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.framed.orm.model.NaturalType <em>Natural Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.framed.orm.model.NaturalType
   * @generated
   */
  public Adapter createNaturalTypeAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.framed.orm.model.Compartment <em>Compartment</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.framed.orm.model.Compartment
   * @generated
   */
  public Adapter createCompartmentAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.framed.orm.model.Grouping <em>Grouping</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.framed.orm.model.Grouping
   * @generated
   */
  public Adapter createGroupingAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.framed.orm.model.Node <em>Node</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.framed.orm.model.Node
   * @generated
   */
  public Adapter createNodeAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.framed.orm.model.RoleType <em>Role Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.framed.orm.model.RoleType
   * @generated
   */
  public Adapter createRoleTypeAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.framed.orm.model.Container <em>Container</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.framed.orm.model.Container
   * @generated
   */
  public Adapter createContainerAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.framed.orm.model.RoleGroup <em>Role Group</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.framed.orm.model.RoleGroup
   * @generated
   */
  public Adapter createRoleGroupAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.framed.orm.model.Rolemodel <em>Rolemodel</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.framed.orm.model.Rolemodel
   * @generated
   */
  public Adapter createRolemodelAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.framed.orm.model.Total <em>Total</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.framed.orm.model.Total
   * @generated
   */
  public Adapter createTotalAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.framed.orm.model.Fulfillment <em>Fulfillment</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.framed.orm.model.Fulfillment
   * @generated
   */
  public Adapter createFulfillmentAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.framed.orm.model.RoleEquivalence <em>Role Equivalence</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.framed.orm.model.RoleEquivalence
   * @generated
   */
  public Adapter createRoleEquivalenceAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.framed.orm.model.Acyclic <em>Acyclic</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.framed.orm.model.Acyclic
   * @generated
   */
  public Adapter createAcyclicAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.framed.orm.model.Inheritance <em>Inheritance</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.framed.orm.model.Inheritance
   * @generated
   */
  public Adapter createInheritanceAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.framed.orm.model.Relationship <em>Relationship</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.framed.orm.model.Relationship
   * @generated
   */
  public Adapter createRelationshipAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.framed.orm.model.RoleProhibition <em>Role Prohibition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.framed.orm.model.RoleProhibition
   * @generated
   */
  public Adapter createRoleProhibitionAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.framed.orm.model.Irreflexive <em>Irreflexive</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.framed.orm.model.Irreflexive
   * @generated
   */
  public Adapter createIrreflexiveAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.framed.orm.model.RoleImplication <em>Role Implication</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.framed.orm.model.RoleImplication
   * @generated
   */
  public Adapter createRoleImplicationAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.framed.orm.model.RelationshipConstraint <em>Relationship Constraint</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.framed.orm.model.RelationshipConstraint
   * @generated
   */
  public Adapter createRelationshipConstraintAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.framed.orm.model.Relation <em>Relation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.framed.orm.model.Relation
   * @generated
   */
  public Adapter createRelationAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.framed.orm.model.Constraint <em>Constraint</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.framed.orm.model.Constraint
   * @generated
   */
  public Adapter createConstraintAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.framed.orm.model.RoleConstraint <em>Role Constraint</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.framed.orm.model.RoleConstraint
   * @generated
   */
  public Adapter createRoleConstraintAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.framed.orm.model.RoleInvariant <em>Role Invariant</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.framed.orm.model.RoleInvariant
   * @generated
   */
  public Adapter createRoleInvariantAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.framed.orm.model.AbstractRole <em>Abstract Role</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.framed.orm.model.AbstractRole
   * @generated
   */
  public Adapter createAbstractRoleAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.framed.orm.model.ComplexConstraint <em>Complex Constraint</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.framed.orm.model.ComplexConstraint
   * @generated
   */
  public Adapter createComplexConstraintAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.framed.orm.model.RelationLabel <em>Relation Label</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.framed.orm.model.RelationLabel
   * @generated
   */
  public Adapter createRelationLabelAdapter() {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter() {
    return null;
  }

} //OrmAdapterFactory
