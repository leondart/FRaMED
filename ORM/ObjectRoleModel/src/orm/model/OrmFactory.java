/**
 */
package orm.model;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see orm.model.OrmPackage
 * @generated
 */
public interface OrmFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OrmFactory eINSTANCE = orm.model.impl.OrmFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute</em>'.
	 * @generated
	 */
	Attribute createAttribute();

	/**
	 * Returns a new object of class '<em>Methode</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Methode</em>'.
	 * @generated
	 */
	Methode createMethode();

	/**
	 * Returns a new object of class '<em>Compartment Diagram</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Compartment Diagram</em>'.
	 * @generated
	 */
	CompartmentDiagram createCompartmentDiagram();

	/**
	 * Returns a new object of class '<em>Natural Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Natural Type</em>'.
	 * @generated
	 */
	NaturalType createNaturalType();

	/**
	 * Returns a new object of class '<em>Compartment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Compartment</em>'.
	 * @generated
	 */
	Compartment createCompartment();

	/**
	 * Returns a new object of class '<em>Grouping</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Grouping</em>'.
	 * @generated
	 */
	Grouping createGrouping();

	/**
	 * Returns a new object of class '<em>Role Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Role Type</em>'.
	 * @generated
	 */
	RoleType createRoleType();

	/**
	 * Returns a new object of class '<em>Relation Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Relation Container</em>'.
	 * @generated
	 */
	RelationContainer createRelationContainer();

	/**
	 * Returns a new object of class '<em>Total</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Total</em>'.
	 * @generated
	 */
	Total createTotal();

	/**
	 * Returns a new object of class '<em>Fulfilment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fulfilment</em>'.
	 * @generated
	 */
	Fulfilment createFulfilment();

	/**
	 * Returns a new object of class '<em>Role Equivalence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Role Equivalence</em>'.
	 * @generated
	 */
	RoleEquivalence createRoleEquivalence();

	/**
	 * Returns a new object of class '<em>Acyclic</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Acyclic</em>'.
	 * @generated
	 */
	Acyclic createAcyclic();

	/**
	 * Returns a new object of class '<em>Inheritance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Inheritance</em>'.
	 * @generated
	 */
	Inheritance createInheritance();

	/**
	 * Returns a new object of class '<em>Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Relationship</em>'.
	 * @generated
	 */
	Relationship createRelationship();

	/**
	 * Returns a new object of class '<em>Role Prohibition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Role Prohibition</em>'.
	 * @generated
	 */
	RoleProhibition createRoleProhibition();

	/**
	 * Returns a new object of class '<em>Rolemodel</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rolemodel</em>'.
	 * @generated
	 */
	Rolemodel createRolemodel();

	/**
	 * Returns a new object of class '<em>Irreflexive</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Irreflexive</em>'.
	 * @generated
	 */
	Irreflexive createIrreflexive();

	/**
	 * Returns a new object of class '<em>Role Implication</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Role Implication</em>'.
	 * @generated
	 */
	RoleImplication createRoleImplication();

	/**
	 * Returns a new object of class '<em>Role Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Role Group</em>'.
	 * @generated
	 */
	RoleGroup createRoleGroup();

	/**
	 * Returns a new object of class '<em>Complex Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Complex Constraint</em>'.
	 * @generated
	 */
	ComplexConstraint createComplexConstraint();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	OrmPackage getOrmPackage();

} //OrmFactory
