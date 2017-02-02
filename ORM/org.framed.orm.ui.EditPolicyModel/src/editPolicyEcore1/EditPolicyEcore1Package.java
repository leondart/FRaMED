/**
 */
package editPolicyEcore1;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see editPolicyEcore1.EditPolicyEcore1Factory
 * @model kind="package"
 * @generated
 */
public interface EditPolicyEcore1Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "editPolicyEcore1";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/editPolicyEcore1";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "editPolicyEcore1";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EditPolicyEcore1Package eINSTANCE = editPolicyEcore1.impl.EditPolicyEcore1PackageImpl.init();

	/**
	 * The meta object id for the '{@link editPolicyEcore1.impl.ModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see editPolicyEcore1.impl.ModelImpl
	 * @see editPolicyEcore1.impl.EditPolicyEcore1PackageImpl#getModel()
	 * @generated
	 */
	int MODEL = 0;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__CONFIGURATION = 0;

	/**
	 * The feature id for the '<em><b>Policies</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__POLICIES = 1;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link editPolicyEcore1.impl.PolicyImpl <em>Policy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see editPolicyEcore1.impl.PolicyImpl
	 * @see editPolicyEcore1.impl.EditPolicyEcore1PackageImpl#getPolicy()
	 * @generated
	 */
	int POLICY = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Rule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY__RULE = 1;

	/**
	 * The number of structural features of the '<em>Policy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link editPolicyEcore1.impl.ConfigurationImpl <em>Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see editPolicyEcore1.impl.ConfigurationImpl
	 * @see editPolicyEcore1.impl.EditPolicyEcore1PackageImpl#getConfiguration()
	 * @generated
	 */
	int CONFIGURATION = 2;

	/**
	 * The feature id for the '<em><b>Mappings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__MAPPINGS = 0;

	/**
	 * The number of structural features of the '<em>Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link editPolicyEcore1.impl.AbstractMappingRuleImpl <em>Abstract Mapping Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see editPolicyEcore1.impl.AbstractMappingRuleImpl
	 * @see editPolicyEcore1.impl.EditPolicyEcore1PackageImpl#getAbstractMappingRule()
	 * @generated
	 */
	int ABSTRACT_MAPPING_RULE = 3;

	/**
	 * The number of structural features of the '<em>Abstract Mapping Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_MAPPING_RULE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link editPolicyEcore1.impl.MappingImpl <em>Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see editPolicyEcore1.impl.MappingImpl
	 * @see editPolicyEcore1.impl.EditPolicyEcore1PackageImpl#getMapping()
	 * @generated
	 */
	int MAPPING = 4;

	/**
	 * The feature id for the '<em><b>Policy Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING__POLICY_NAME = 0;

	/**
	 * The feature id for the '<em><b>Rule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING__RULE = 1;

	/**
	 * The number of structural features of the '<em>Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link editPolicyEcore1.impl.FeatureNameMappingRuleImpl <em>Feature Name Mapping Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see editPolicyEcore1.impl.FeatureNameMappingRuleImpl
	 * @see editPolicyEcore1.impl.EditPolicyEcore1PackageImpl#getFeatureNameMappingRule()
	 * @generated
	 */
	int FEATURE_NAME_MAPPING_RULE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_NAME_MAPPING_RULE__NAME = ABSTRACT_MAPPING_RULE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Feature Name Mapping Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_NAME_MAPPING_RULE_FEATURE_COUNT = ABSTRACT_MAPPING_RULE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link editPolicyEcore1.impl.AndMappingRuleImpl <em>And Mapping Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see editPolicyEcore1.impl.AndMappingRuleImpl
	 * @see editPolicyEcore1.impl.EditPolicyEcore1PackageImpl#getAndMappingRule()
	 * @generated
	 */
	int AND_MAPPING_RULE = 6;

	/**
	 * The feature id for the '<em><b>Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_MAPPING_RULE__RULES = ABSTRACT_MAPPING_RULE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>And Mapping Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_MAPPING_RULE_FEATURE_COUNT = ABSTRACT_MAPPING_RULE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link editPolicyEcore1.impl.AbstractRuleImpl <em>Abstract Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see editPolicyEcore1.impl.AbstractRuleImpl
	 * @see editPolicyEcore1.impl.EditPolicyEcore1PackageImpl#getAbstractRule()
	 * @generated
	 */
	int ABSTRACT_RULE = 7;

	/**
	 * The number of structural features of the '<em>Abstract Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_RULE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link editPolicyEcore1.impl.AndRuleImpl <em>And Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see editPolicyEcore1.impl.AndRuleImpl
	 * @see editPolicyEcore1.impl.EditPolicyEcore1PackageImpl#getAndRule()
	 * @generated
	 */
	int AND_RULE = 8;

	/**
	 * The feature id for the '<em><b>Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_RULE__RULES = ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>And Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_RULE_FEATURE_COUNT = ABSTRACT_RULE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link editPolicyEcore1.impl.RelationNameRuleImpl <em>Relation Name Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see editPolicyEcore1.impl.RelationNameRuleImpl
	 * @see editPolicyEcore1.impl.EditPolicyEcore1PackageImpl#getRelationNameRule()
	 * @generated
	 */
	int RELATION_NAME_RULE = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_NAME_RULE__NAME = ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Relation Name Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_NAME_RULE_FEATURE_COUNT = ABSTRACT_RULE_FEATURE_COUNT + 1;

	/**
	 * Returns the meta object for class '{@link editPolicyEcore1.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see editPolicyEcore1.Model
	 * @generated
	 */
	EClass getModel();

	/**
	 * Returns the meta object for the containment reference list '{@link editPolicyEcore1.Model#getPolicies <em>Policies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Policies</em>'.
	 * @see editPolicyEcore1.Model#getPolicies()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Policies();

	/**
	 * Returns the meta object for the containment reference '{@link editPolicyEcore1.Model#getConfiguration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Configuration</em>'.
	 * @see editPolicyEcore1.Model#getConfiguration()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Configuration();

	/**
	 * Returns the meta object for class '{@link editPolicyEcore1.Policy <em>Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Policy</em>'.
	 * @see editPolicyEcore1.Policy
	 * @generated
	 */
	EClass getPolicy();

	/**
	 * Returns the meta object for the attribute '{@link editPolicyEcore1.Policy#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see editPolicyEcore1.Policy#getName()
	 * @see #getPolicy()
	 * @generated
	 */
	EAttribute getPolicy_Name();

	/**
	 * Returns the meta object for the containment reference '{@link editPolicyEcore1.Policy#getRule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rule</em>'.
	 * @see editPolicyEcore1.Policy#getRule()
	 * @see #getPolicy()
	 * @generated
	 */
	EReference getPolicy_Rule();

	/**
	 * Returns the meta object for class '{@link editPolicyEcore1.Configuration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Configuration</em>'.
	 * @see editPolicyEcore1.Configuration
	 * @generated
	 */
	EClass getConfiguration();

	/**
	 * Returns the meta object for the containment reference list '{@link editPolicyEcore1.Configuration#getMappings <em>Mappings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mappings</em>'.
	 * @see editPolicyEcore1.Configuration#getMappings()
	 * @see #getConfiguration()
	 * @generated
	 */
	EReference getConfiguration_Mappings();

	/**
	 * Returns the meta object for class '{@link editPolicyEcore1.AbstractMappingRule <em>Abstract Mapping Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Mapping Rule</em>'.
	 * @see editPolicyEcore1.AbstractMappingRule
	 * @generated
	 */
	EClass getAbstractMappingRule();

	/**
	 * Returns the meta object for class '{@link editPolicyEcore1.Mapping <em>Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mapping</em>'.
	 * @see editPolicyEcore1.Mapping
	 * @generated
	 */
	EClass getMapping();

	/**
	 * Returns the meta object for the attribute '{@link editPolicyEcore1.Mapping#getPolicyName <em>Policy Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Policy Name</em>'.
	 * @see editPolicyEcore1.Mapping#getPolicyName()
	 * @see #getMapping()
	 * @generated
	 */
	EAttribute getMapping_PolicyName();

	/**
	 * Returns the meta object for the containment reference '{@link editPolicyEcore1.Mapping#getRule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rule</em>'.
	 * @see editPolicyEcore1.Mapping#getRule()
	 * @see #getMapping()
	 * @generated
	 */
	EReference getMapping_Rule();

	/**
	 * Returns the meta object for class '{@link editPolicyEcore1.FeatureNameMappingRule <em>Feature Name Mapping Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Name Mapping Rule</em>'.
	 * @see editPolicyEcore1.FeatureNameMappingRule
	 * @generated
	 */
	EClass getFeatureNameMappingRule();

	/**
	 * Returns the meta object for the attribute '{@link editPolicyEcore1.FeatureNameMappingRule#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see editPolicyEcore1.FeatureNameMappingRule#getName()
	 * @see #getFeatureNameMappingRule()
	 * @generated
	 */
	EAttribute getFeatureNameMappingRule_Name();

	/**
	 * Returns the meta object for class '{@link editPolicyEcore1.AndMappingRule <em>And Mapping Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>And Mapping Rule</em>'.
	 * @see editPolicyEcore1.AndMappingRule
	 * @generated
	 */
	EClass getAndMappingRule();

	/**
	 * Returns the meta object for the containment reference list '{@link editPolicyEcore1.AndMappingRule#getRules <em>Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rules</em>'.
	 * @see editPolicyEcore1.AndMappingRule#getRules()
	 * @see #getAndMappingRule()
	 * @generated
	 */
	EReference getAndMappingRule_Rules();

	/**
	 * Returns the meta object for class '{@link editPolicyEcore1.AbstractRule <em>Abstract Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Rule</em>'.
	 * @see editPolicyEcore1.AbstractRule
	 * @generated
	 */
	EClass getAbstractRule();

	/**
	 * Returns the meta object for class '{@link editPolicyEcore1.AndRule <em>And Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>And Rule</em>'.
	 * @see editPolicyEcore1.AndRule
	 * @generated
	 */
	EClass getAndRule();

	/**
	 * Returns the meta object for the containment reference list '{@link editPolicyEcore1.AndRule#getRules <em>Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rules</em>'.
	 * @see editPolicyEcore1.AndRule#getRules()
	 * @see #getAndRule()
	 * @generated
	 */
	EReference getAndRule_Rules();

	/**
	 * Returns the meta object for class '{@link editPolicyEcore1.RelationNameRule <em>Relation Name Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relation Name Rule</em>'.
	 * @see editPolicyEcore1.RelationNameRule
	 * @generated
	 */
	EClass getRelationNameRule();

	/**
	 * Returns the meta object for the attribute '{@link editPolicyEcore1.RelationNameRule#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see editPolicyEcore1.RelationNameRule#getName()
	 * @see #getRelationNameRule()
	 * @generated
	 */
	EAttribute getRelationNameRule_Name();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EditPolicyEcore1Factory getEditPolicyEcore1Factory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link editPolicyEcore1.impl.ModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see editPolicyEcore1.impl.ModelImpl
		 * @see editPolicyEcore1.impl.EditPolicyEcore1PackageImpl#getModel()
		 * @generated
		 */
		EClass MODEL = eINSTANCE.getModel();

		/**
		 * The meta object literal for the '<em><b>Policies</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__POLICIES = eINSTANCE.getModel_Policies();

		/**
		 * The meta object literal for the '<em><b>Configuration</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__CONFIGURATION = eINSTANCE.getModel_Configuration();

		/**
		 * The meta object literal for the '{@link editPolicyEcore1.impl.PolicyImpl <em>Policy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see editPolicyEcore1.impl.PolicyImpl
		 * @see editPolicyEcore1.impl.EditPolicyEcore1PackageImpl#getPolicy()
		 * @generated
		 */
		EClass POLICY = eINSTANCE.getPolicy();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLICY__NAME = eINSTANCE.getPolicy_Name();

		/**
		 * The meta object literal for the '<em><b>Rule</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POLICY__RULE = eINSTANCE.getPolicy_Rule();

		/**
		 * The meta object literal for the '{@link editPolicyEcore1.impl.ConfigurationImpl <em>Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see editPolicyEcore1.impl.ConfigurationImpl
		 * @see editPolicyEcore1.impl.EditPolicyEcore1PackageImpl#getConfiguration()
		 * @generated
		 */
		EClass CONFIGURATION = eINSTANCE.getConfiguration();

		/**
		 * The meta object literal for the '<em><b>Mappings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION__MAPPINGS = eINSTANCE.getConfiguration_Mappings();

		/**
		 * The meta object literal for the '{@link editPolicyEcore1.impl.AbstractMappingRuleImpl <em>Abstract Mapping Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see editPolicyEcore1.impl.AbstractMappingRuleImpl
		 * @see editPolicyEcore1.impl.EditPolicyEcore1PackageImpl#getAbstractMappingRule()
		 * @generated
		 */
		EClass ABSTRACT_MAPPING_RULE = eINSTANCE.getAbstractMappingRule();

		/**
		 * The meta object literal for the '{@link editPolicyEcore1.impl.MappingImpl <em>Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see editPolicyEcore1.impl.MappingImpl
		 * @see editPolicyEcore1.impl.EditPolicyEcore1PackageImpl#getMapping()
		 * @generated
		 */
		EClass MAPPING = eINSTANCE.getMapping();

		/**
		 * The meta object literal for the '<em><b>Policy Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAPPING__POLICY_NAME = eINSTANCE.getMapping_PolicyName();

		/**
		 * The meta object literal for the '<em><b>Rule</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPING__RULE = eINSTANCE.getMapping_Rule();

		/**
		 * The meta object literal for the '{@link editPolicyEcore1.impl.FeatureNameMappingRuleImpl <em>Feature Name Mapping Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see editPolicyEcore1.impl.FeatureNameMappingRuleImpl
		 * @see editPolicyEcore1.impl.EditPolicyEcore1PackageImpl#getFeatureNameMappingRule()
		 * @generated
		 */
		EClass FEATURE_NAME_MAPPING_RULE = eINSTANCE.getFeatureNameMappingRule();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE_NAME_MAPPING_RULE__NAME = eINSTANCE.getFeatureNameMappingRule_Name();

		/**
		 * The meta object literal for the '{@link editPolicyEcore1.impl.AndMappingRuleImpl <em>And Mapping Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see editPolicyEcore1.impl.AndMappingRuleImpl
		 * @see editPolicyEcore1.impl.EditPolicyEcore1PackageImpl#getAndMappingRule()
		 * @generated
		 */
		EClass AND_MAPPING_RULE = eINSTANCE.getAndMappingRule();

		/**
		 * The meta object literal for the '<em><b>Rules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AND_MAPPING_RULE__RULES = eINSTANCE.getAndMappingRule_Rules();

		/**
		 * The meta object literal for the '{@link editPolicyEcore1.impl.AbstractRuleImpl <em>Abstract Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see editPolicyEcore1.impl.AbstractRuleImpl
		 * @see editPolicyEcore1.impl.EditPolicyEcore1PackageImpl#getAbstractRule()
		 * @generated
		 */
		EClass ABSTRACT_RULE = eINSTANCE.getAbstractRule();

		/**
		 * The meta object literal for the '{@link editPolicyEcore1.impl.AndRuleImpl <em>And Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see editPolicyEcore1.impl.AndRuleImpl
		 * @see editPolicyEcore1.impl.EditPolicyEcore1PackageImpl#getAndRule()
		 * @generated
		 */
		EClass AND_RULE = eINSTANCE.getAndRule();

		/**
		 * The meta object literal for the '<em><b>Rules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AND_RULE__RULES = eINSTANCE.getAndRule_Rules();

		/**
		 * The meta object literal for the '{@link editPolicyEcore1.impl.RelationNameRuleImpl <em>Relation Name Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see editPolicyEcore1.impl.RelationNameRuleImpl
		 * @see editPolicyEcore1.impl.EditPolicyEcore1PackageImpl#getRelationNameRule()
		 * @generated
		 */
		EClass RELATION_NAME_RULE = eINSTANCE.getRelationNameRule();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATION_NAME_RULE__NAME = eINSTANCE.getRelationNameRule_Name();

	}

} //EditPolicyEcore1Package
