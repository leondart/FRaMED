/**
 */
package model;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see model.ModelPackage
 * @generated
 */
public interface ModelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModelFactory eINSTANCE = model.impl.ModelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model</em>'.
	 * @generated
	 */
	Model createModel();

	/**
	 * Returns a new object of class '<em>Policy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Policy</em>'.
	 * @generated
	 */
	Policy createPolicy();

	/**
	 * Returns a new object of class '<em>Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Configuration</em>'.
	 * @generated
	 */
	Configuration createConfiguration();

	/**
	 * Returns a new object of class '<em>Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mapping</em>'.
	 * @generated
	 */
	Mapping createMapping();

	/**
	 * Returns a new object of class '<em>Feature Name Mapping Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Feature Name Mapping Rule</em>'.
	 * @generated
	 */
	FeatureNameMappingRule createFeatureNameMappingRule();

	/**
	 * Returns a new object of class '<em>And Mapping Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>And Mapping Rule</em>'.
	 * @generated
	 */
	AndMappingRule createAndMappingRule();

	/**
	 * Returns a new object of class '<em>And Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>And Rule</em>'.
	 * @generated
	 */
	AndRule createAndRule();

	/**
	 * Returns a new object of class '<em>Relation Type Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Relation Type Rule</em>'.
	 * @generated
	 */
	RelationTypeRule createRelationTypeRule();

	/**
	 * Returns a new object of class '<em>Not Mapping Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Not Mapping Rule</em>'.
	 * @generated
	 */
	NotMappingRule createNotMappingRule();

	/**
	 * Returns a new object of class '<em>Or Mapping Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Or Mapping Rule</em>'.
	 * @generated
	 */
	OrMappingRule createOrMappingRule();

	/**
	 * Returns a new object of class '<em>Implication Mapping Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Implication Mapping Rule</em>'.
	 * @generated
	 */
	ImplicationMappingRule createImplicationMappingRule();

	/**
	 * Returns a new object of class '<em>Or Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Or Rule</em>'.
	 * @generated
	 */
	OrRule createOrRule();

	/**
	 * Returns a new object of class '<em>Not Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Not Rule</em>'.
	 * @generated
	 */
	NotRule createNotRule();

	/**
	 * Returns a new object of class '<em>Implication Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Implication Rule</em>'.
	 * @generated
	 */
	ImplicationRule createImplicationRule();

	/**
	 * Returns a new object of class '<em>Source Type Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Source Type Rule</em>'.
	 * @generated
	 */
	SourceTypeRule createSourceTypeRule();

	/**
	 * Returns a new object of class '<em>Target Type Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Target Type Rule</em>'.
	 * @generated
	 */
	TargetTypeRule createTargetTypeRule();

	/**
	 * Returns a new object of class '<em>Command Name Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Command Name Rule</em>'.
	 * @generated
	 */
	CommandNameRule createCommandNameRule();

	/**
	 * Returns a new object of class '<em>Shape Type Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Shape Type Rule</em>'.
	 * @generated
	 */
	ShapeTypeRule createShapeTypeRule();

	/**
	 * Returns a new object of class '<em>Parent Type Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parent Type Rule</em>'.
	 * @generated
	 */
	ParentTypeRule createParentTypeRule();

	/**
	 * Returns a new object of class '<em>Step In Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Step In Rule</em>'.
	 * @generated
	 */
	StepInRule createStepInRule();

	/**
	 * Returns a new object of class '<em>True Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>True Rule</em>'.
	 * @generated
	 */
	TrueRule createTrueRule();

	/**
	 * Returns a new object of class '<em>False Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>False Rule</em>'.
	 * @generated
	 */
	FalseRule createFalseRule();

	/**
	 * Returns a new object of class '<em>Shape Name Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Shape Name Rule</em>'.
	 * @generated
	 */
	ShapeNameRule createShapeNameRule();

	/**
	 * Returns a new object of class '<em>True Mapping Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>True Mapping Rule</em>'.
	 * @generated
	 */
	TrueMappingRule createTrueMappingRule();

	/**
	 * Returns a new object of class '<em>Relation Is Cyclic Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Relation Is Cyclic Rule</em>'.
	 * @generated
	 */
	RelationIsCyclicRule createRelationIsCyclicRule();

	/**
	 * Returns a new object of class '<em>Relation Is Reflexiv Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Relation Is Reflexiv Rule</em>'.
	 * @generated
	 */
	RelationIsReflexivRule createRelationIsReflexivRule();

	/**
	 * Returns a new object of class '<em>Relation Types Are Equal Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Relation Types Are Equal Rule</em>'.
	 * @generated
	 */
	RelationTypesAreEqualRule createRelationTypesAreEqualRule();

	/**
	 * Returns a new object of class '<em>Type Exists Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Type Exists Rule</em>'.
	 * @generated
	 */
	TypeExistsRule createTypeExistsRule();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ModelPackage getModelPackage();

} //ModelFactory
