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
	 * The meta object id for the '{@link editPolicyEcore1.impl.AbstractNameRuleImpl <em>Abstract Name Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see editPolicyEcore1.impl.AbstractNameRuleImpl
	 * @see editPolicyEcore1.impl.EditPolicyEcore1PackageImpl#getAbstractNameRule()
	 * @generated
	 */
	int ABSTRACT_NAME_RULE = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NAME_RULE__NAME = ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Abstract Name Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NAME_RULE_FEATURE_COUNT = ABSTRACT_RULE_FEATURE_COUNT + 1;

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
	int RELATION_NAME_RULE__NAME = ABSTRACT_NAME_RULE__NAME;

	/**
	 * The number of structural features of the '<em>Relation Name Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_NAME_RULE_FEATURE_COUNT = ABSTRACT_NAME_RULE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link editPolicyEcore1.impl.NotMappingRuleImpl <em>Not Mapping Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see editPolicyEcore1.impl.NotMappingRuleImpl
	 * @see editPolicyEcore1.impl.EditPolicyEcore1PackageImpl#getNotMappingRule()
	 * @generated
	 */
	int NOT_MAPPING_RULE = 10;

	/**
	 * The feature id for the '<em><b>Rule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_MAPPING_RULE__RULE = ABSTRACT_MAPPING_RULE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Not Mapping Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_MAPPING_RULE_FEATURE_COUNT = ABSTRACT_MAPPING_RULE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link editPolicyEcore1.impl.OrMappingRuleImpl <em>Or Mapping Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see editPolicyEcore1.impl.OrMappingRuleImpl
	 * @see editPolicyEcore1.impl.EditPolicyEcore1PackageImpl#getOrMappingRule()
	 * @generated
	 */
	int OR_MAPPING_RULE = 11;

	/**
	 * The feature id for the '<em><b>Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_MAPPING_RULE__RULES = ABSTRACT_MAPPING_RULE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Or Mapping Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_MAPPING_RULE_FEATURE_COUNT = ABSTRACT_MAPPING_RULE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link editPolicyEcore1.impl.ImplicationMappingRuleImpl <em>Implication Mapping Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see editPolicyEcore1.impl.ImplicationMappingRuleImpl
	 * @see editPolicyEcore1.impl.EditPolicyEcore1PackageImpl#getImplicationMappingRule()
	 * @generated
	 */
	int IMPLICATION_MAPPING_RULE = 12;

	/**
	 * The feature id for the '<em><b>Antecedent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLICATION_MAPPING_RULE__ANTECEDENT = ABSTRACT_MAPPING_RULE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Consequent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLICATION_MAPPING_RULE__CONSEQUENT = ABSTRACT_MAPPING_RULE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Implication Mapping Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLICATION_MAPPING_RULE_FEATURE_COUNT = ABSTRACT_MAPPING_RULE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link editPolicyEcore1.impl.OrRuleImpl <em>Or Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see editPolicyEcore1.impl.OrRuleImpl
	 * @see editPolicyEcore1.impl.EditPolicyEcore1PackageImpl#getOrRule()
	 * @generated
	 */
	int OR_RULE = 13;

	/**
	 * The feature id for the '<em><b>Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_RULE__RULES = ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Or Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_RULE_FEATURE_COUNT = ABSTRACT_RULE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link editPolicyEcore1.impl.NotRuleImpl <em>Not Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see editPolicyEcore1.impl.NotRuleImpl
	 * @see editPolicyEcore1.impl.EditPolicyEcore1PackageImpl#getNotRule()
	 * @generated
	 */
	int NOT_RULE = 14;

	/**
	 * The feature id for the '<em><b>Rule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_RULE__RULE = ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Not Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_RULE_FEATURE_COUNT = ABSTRACT_RULE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link editPolicyEcore1.impl.ImplicationRuleImpl <em>Implication Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see editPolicyEcore1.impl.ImplicationRuleImpl
	 * @see editPolicyEcore1.impl.EditPolicyEcore1PackageImpl#getImplicationRule()
	 * @generated
	 */
	int IMPLICATION_RULE = 15;

	/**
	 * The feature id for the '<em><b>Antecedent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLICATION_RULE__ANTECEDENT = ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Consequent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLICATION_RULE__CONSEQUENT = ABSTRACT_RULE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Implication Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLICATION_RULE_FEATURE_COUNT = ABSTRACT_RULE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link editPolicyEcore1.impl.SourceTypeRuleImpl <em>Source Type Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see editPolicyEcore1.impl.SourceTypeRuleImpl
	 * @see editPolicyEcore1.impl.EditPolicyEcore1PackageImpl#getSourceTypeRule()
	 * @generated
	 */
	int SOURCE_TYPE_RULE = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_TYPE_RULE__NAME = ABSTRACT_NAME_RULE__NAME;

	/**
	 * The number of structural features of the '<em>Source Type Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_TYPE_RULE_FEATURE_COUNT = ABSTRACT_NAME_RULE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link editPolicyEcore1.impl.TargetTypeRuleImpl <em>Target Type Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see editPolicyEcore1.impl.TargetTypeRuleImpl
	 * @see editPolicyEcore1.impl.EditPolicyEcore1PackageImpl#getTargetTypeRule()
	 * @generated
	 */
	int TARGET_TYPE_RULE = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_TYPE_RULE__NAME = ABSTRACT_NAME_RULE__NAME;

	/**
	 * The number of structural features of the '<em>Target Type Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_TYPE_RULE_FEATURE_COUNT = ABSTRACT_NAME_RULE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link editPolicyEcore1.impl.CommandNameRuleImpl <em>Command Name Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see editPolicyEcore1.impl.CommandNameRuleImpl
	 * @see editPolicyEcore1.impl.EditPolicyEcore1PackageImpl#getCommandNameRule()
	 * @generated
	 */
	int COMMAND_NAME_RULE = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_NAME_RULE__NAME = ABSTRACT_NAME_RULE__NAME;

	/**
	 * The number of structural features of the '<em>Command Name Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_NAME_RULE_FEATURE_COUNT = ABSTRACT_NAME_RULE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link editPolicyEcore1.impl.ShapeTypeRuleImpl <em>Shape Type Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see editPolicyEcore1.impl.ShapeTypeRuleImpl
	 * @see editPolicyEcore1.impl.EditPolicyEcore1PackageImpl#getShapeTypeRule()
	 * @generated
	 */
	int SHAPE_TYPE_RULE = 20;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE_TYPE_RULE__NAME = ABSTRACT_NAME_RULE__NAME;

	/**
	 * The number of structural features of the '<em>Shape Type Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE_TYPE_RULE_FEATURE_COUNT = ABSTRACT_NAME_RULE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link editPolicyEcore1.impl.ParentTypeRuleImpl <em>Parent Type Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see editPolicyEcore1.impl.ParentTypeRuleImpl
	 * @see editPolicyEcore1.impl.EditPolicyEcore1PackageImpl#getParentTypeRule()
	 * @generated
	 */
	int PARENT_TYPE_RULE = 21;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARENT_TYPE_RULE__NAME = ABSTRACT_NAME_RULE__NAME;

	/**
	 * The number of structural features of the '<em>Parent Type Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARENT_TYPE_RULE_FEATURE_COUNT = ABSTRACT_NAME_RULE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link editPolicyEcore1.impl.StepInRuleImpl <em>Step In Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see editPolicyEcore1.impl.StepInRuleImpl
	 * @see editPolicyEcore1.impl.EditPolicyEcore1PackageImpl#getStepInRule()
	 * @generated
	 */
	int STEP_IN_RULE = 22;

	/**
	 * The number of structural features of the '<em>Step In Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_IN_RULE_FEATURE_COUNT = ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link editPolicyEcore1.impl.TrueRuleImpl <em>True Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see editPolicyEcore1.impl.TrueRuleImpl
	 * @see editPolicyEcore1.impl.EditPolicyEcore1PackageImpl#getTrueRule()
	 * @generated
	 */
	int TRUE_RULE = 23;

	/**
	 * The number of structural features of the '<em>True Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUE_RULE_FEATURE_COUNT = ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link editPolicyEcore1.impl.FalseRuleImpl <em>False Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see editPolicyEcore1.impl.FalseRuleImpl
	 * @see editPolicyEcore1.impl.EditPolicyEcore1PackageImpl#getFalseRule()
	 * @generated
	 */
	int FALSE_RULE = 24;

	/**
	 * The number of structural features of the '<em>False Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FALSE_RULE_FEATURE_COUNT = ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link editPolicyEcore1.impl.ShapeNameRuleImpl <em>Shape Name Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see editPolicyEcore1.impl.ShapeNameRuleImpl
	 * @see editPolicyEcore1.impl.EditPolicyEcore1PackageImpl#getShapeNameRule()
	 * @generated
	 */
	int SHAPE_NAME_RULE = 25;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE_NAME_RULE__NAME = ABSTRACT_NAME_RULE__NAME;

	/**
	 * The number of structural features of the '<em>Shape Name Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE_NAME_RULE_FEATURE_COUNT = ABSTRACT_NAME_RULE_FEATURE_COUNT + 0;

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
	 * Returns the meta object for class '{@link editPolicyEcore1.NotMappingRule <em>Not Mapping Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Not Mapping Rule</em>'.
	 * @see editPolicyEcore1.NotMappingRule
	 * @generated
	 */
	EClass getNotMappingRule();

	/**
	 * Returns the meta object for the containment reference '{@link editPolicyEcore1.NotMappingRule#getRule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rule</em>'.
	 * @see editPolicyEcore1.NotMappingRule#getRule()
	 * @see #getNotMappingRule()
	 * @generated
	 */
	EReference getNotMappingRule_Rule();

	/**
	 * Returns the meta object for class '{@link editPolicyEcore1.OrMappingRule <em>Or Mapping Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Or Mapping Rule</em>'.
	 * @see editPolicyEcore1.OrMappingRule
	 * @generated
	 */
	EClass getOrMappingRule();

	/**
	 * Returns the meta object for the containment reference list '{@link editPolicyEcore1.OrMappingRule#getRules <em>Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rules</em>'.
	 * @see editPolicyEcore1.OrMappingRule#getRules()
	 * @see #getOrMappingRule()
	 * @generated
	 */
	EReference getOrMappingRule_Rules();

	/**
	 * Returns the meta object for class '{@link editPolicyEcore1.ImplicationMappingRule <em>Implication Mapping Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Implication Mapping Rule</em>'.
	 * @see editPolicyEcore1.ImplicationMappingRule
	 * @generated
	 */
	EClass getImplicationMappingRule();

	/**
	 * Returns the meta object for the containment reference '{@link editPolicyEcore1.ImplicationMappingRule#getAntecedent <em>Antecedent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Antecedent</em>'.
	 * @see editPolicyEcore1.ImplicationMappingRule#getAntecedent()
	 * @see #getImplicationMappingRule()
	 * @generated
	 */
	EReference getImplicationMappingRule_Antecedent();

	/**
	 * Returns the meta object for the containment reference '{@link editPolicyEcore1.ImplicationMappingRule#getConsequent <em>Consequent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Consequent</em>'.
	 * @see editPolicyEcore1.ImplicationMappingRule#getConsequent()
	 * @see #getImplicationMappingRule()
	 * @generated
	 */
	EReference getImplicationMappingRule_Consequent();

	/**
	 * Returns the meta object for class '{@link editPolicyEcore1.OrRule <em>Or Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Or Rule</em>'.
	 * @see editPolicyEcore1.OrRule
	 * @generated
	 */
	EClass getOrRule();

	/**
	 * Returns the meta object for the containment reference list '{@link editPolicyEcore1.OrRule#getRules <em>Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rules</em>'.
	 * @see editPolicyEcore1.OrRule#getRules()
	 * @see #getOrRule()
	 * @generated
	 */
	EReference getOrRule_Rules();

	/**
	 * Returns the meta object for class '{@link editPolicyEcore1.NotRule <em>Not Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Not Rule</em>'.
	 * @see editPolicyEcore1.NotRule
	 * @generated
	 */
	EClass getNotRule();

	/**
	 * Returns the meta object for the containment reference '{@link editPolicyEcore1.NotRule#getRule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rule</em>'.
	 * @see editPolicyEcore1.NotRule#getRule()
	 * @see #getNotRule()
	 * @generated
	 */
	EReference getNotRule_Rule();

	/**
	 * Returns the meta object for class '{@link editPolicyEcore1.ImplicationRule <em>Implication Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Implication Rule</em>'.
	 * @see editPolicyEcore1.ImplicationRule
	 * @generated
	 */
	EClass getImplicationRule();

	/**
	 * Returns the meta object for the containment reference '{@link editPolicyEcore1.ImplicationRule#getAntecedent <em>Antecedent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Antecedent</em>'.
	 * @see editPolicyEcore1.ImplicationRule#getAntecedent()
	 * @see #getImplicationRule()
	 * @generated
	 */
	EReference getImplicationRule_Antecedent();

	/**
	 * Returns the meta object for the containment reference '{@link editPolicyEcore1.ImplicationRule#getConsequent <em>Consequent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Consequent</em>'.
	 * @see editPolicyEcore1.ImplicationRule#getConsequent()
	 * @see #getImplicationRule()
	 * @generated
	 */
	EReference getImplicationRule_Consequent();

	/**
	 * Returns the meta object for class '{@link editPolicyEcore1.AbstractNameRule <em>Abstract Name Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Name Rule</em>'.
	 * @see editPolicyEcore1.AbstractNameRule
	 * @generated
	 */
	EClass getAbstractNameRule();

	/**
	 * Returns the meta object for the attribute '{@link editPolicyEcore1.AbstractNameRule#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see editPolicyEcore1.AbstractNameRule#getName()
	 * @see #getAbstractNameRule()
	 * @generated
	 */
	EAttribute getAbstractNameRule_Name();

	/**
	 * Returns the meta object for class '{@link editPolicyEcore1.SourceTypeRule <em>Source Type Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Source Type Rule</em>'.
	 * @see editPolicyEcore1.SourceTypeRule
	 * @generated
	 */
	EClass getSourceTypeRule();

	/**
	 * Returns the meta object for class '{@link editPolicyEcore1.TargetTypeRule <em>Target Type Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Target Type Rule</em>'.
	 * @see editPolicyEcore1.TargetTypeRule
	 * @generated
	 */
	EClass getTargetTypeRule();

	/**
	 * Returns the meta object for class '{@link editPolicyEcore1.CommandNameRule <em>Command Name Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Command Name Rule</em>'.
	 * @see editPolicyEcore1.CommandNameRule
	 * @generated
	 */
	EClass getCommandNameRule();

	/**
	 * Returns the meta object for class '{@link editPolicyEcore1.ShapeTypeRule <em>Shape Type Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shape Type Rule</em>'.
	 * @see editPolicyEcore1.ShapeTypeRule
	 * @generated
	 */
	EClass getShapeTypeRule();

	/**
	 * Returns the meta object for class '{@link editPolicyEcore1.ParentTypeRule <em>Parent Type Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parent Type Rule</em>'.
	 * @see editPolicyEcore1.ParentTypeRule
	 * @generated
	 */
	EClass getParentTypeRule();

	/**
	 * Returns the meta object for class '{@link editPolicyEcore1.StepInRule <em>Step In Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Step In Rule</em>'.
	 * @see editPolicyEcore1.StepInRule
	 * @generated
	 */
	EClass getStepInRule();

	/**
	 * Returns the meta object for class '{@link editPolicyEcore1.TrueRule <em>True Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>True Rule</em>'.
	 * @see editPolicyEcore1.TrueRule
	 * @generated
	 */
	EClass getTrueRule();

	/**
	 * Returns the meta object for class '{@link editPolicyEcore1.FalseRule <em>False Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>False Rule</em>'.
	 * @see editPolicyEcore1.FalseRule
	 * @generated
	 */
	EClass getFalseRule();

	/**
	 * Returns the meta object for class '{@link editPolicyEcore1.ShapeNameRule <em>Shape Name Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shape Name Rule</em>'.
	 * @see editPolicyEcore1.ShapeNameRule
	 * @generated
	 */
	EClass getShapeNameRule();

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
		 * The meta object literal for the '{@link editPolicyEcore1.impl.NotMappingRuleImpl <em>Not Mapping Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see editPolicyEcore1.impl.NotMappingRuleImpl
		 * @see editPolicyEcore1.impl.EditPolicyEcore1PackageImpl#getNotMappingRule()
		 * @generated
		 */
		EClass NOT_MAPPING_RULE = eINSTANCE.getNotMappingRule();

		/**
		 * The meta object literal for the '<em><b>Rule</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NOT_MAPPING_RULE__RULE = eINSTANCE.getNotMappingRule_Rule();

		/**
		 * The meta object literal for the '{@link editPolicyEcore1.impl.OrMappingRuleImpl <em>Or Mapping Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see editPolicyEcore1.impl.OrMappingRuleImpl
		 * @see editPolicyEcore1.impl.EditPolicyEcore1PackageImpl#getOrMappingRule()
		 * @generated
		 */
		EClass OR_MAPPING_RULE = eINSTANCE.getOrMappingRule();

		/**
		 * The meta object literal for the '<em><b>Rules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OR_MAPPING_RULE__RULES = eINSTANCE.getOrMappingRule_Rules();

		/**
		 * The meta object literal for the '{@link editPolicyEcore1.impl.ImplicationMappingRuleImpl <em>Implication Mapping Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see editPolicyEcore1.impl.ImplicationMappingRuleImpl
		 * @see editPolicyEcore1.impl.EditPolicyEcore1PackageImpl#getImplicationMappingRule()
		 * @generated
		 */
		EClass IMPLICATION_MAPPING_RULE = eINSTANCE.getImplicationMappingRule();

		/**
		 * The meta object literal for the '<em><b>Antecedent</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPLICATION_MAPPING_RULE__ANTECEDENT = eINSTANCE.getImplicationMappingRule_Antecedent();

		/**
		 * The meta object literal for the '<em><b>Consequent</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPLICATION_MAPPING_RULE__CONSEQUENT = eINSTANCE.getImplicationMappingRule_Consequent();

		/**
		 * The meta object literal for the '{@link editPolicyEcore1.impl.OrRuleImpl <em>Or Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see editPolicyEcore1.impl.OrRuleImpl
		 * @see editPolicyEcore1.impl.EditPolicyEcore1PackageImpl#getOrRule()
		 * @generated
		 */
		EClass OR_RULE = eINSTANCE.getOrRule();

		/**
		 * The meta object literal for the '<em><b>Rules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OR_RULE__RULES = eINSTANCE.getOrRule_Rules();

		/**
		 * The meta object literal for the '{@link editPolicyEcore1.impl.NotRuleImpl <em>Not Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see editPolicyEcore1.impl.NotRuleImpl
		 * @see editPolicyEcore1.impl.EditPolicyEcore1PackageImpl#getNotRule()
		 * @generated
		 */
		EClass NOT_RULE = eINSTANCE.getNotRule();

		/**
		 * The meta object literal for the '<em><b>Rule</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NOT_RULE__RULE = eINSTANCE.getNotRule_Rule();

		/**
		 * The meta object literal for the '{@link editPolicyEcore1.impl.ImplicationRuleImpl <em>Implication Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see editPolicyEcore1.impl.ImplicationRuleImpl
		 * @see editPolicyEcore1.impl.EditPolicyEcore1PackageImpl#getImplicationRule()
		 * @generated
		 */
		EClass IMPLICATION_RULE = eINSTANCE.getImplicationRule();

		/**
		 * The meta object literal for the '<em><b>Antecedent</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPLICATION_RULE__ANTECEDENT = eINSTANCE.getImplicationRule_Antecedent();

		/**
		 * The meta object literal for the '<em><b>Consequent</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPLICATION_RULE__CONSEQUENT = eINSTANCE.getImplicationRule_Consequent();

		/**
		 * The meta object literal for the '{@link editPolicyEcore1.impl.AbstractNameRuleImpl <em>Abstract Name Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see editPolicyEcore1.impl.AbstractNameRuleImpl
		 * @see editPolicyEcore1.impl.EditPolicyEcore1PackageImpl#getAbstractNameRule()
		 * @generated
		 */
		EClass ABSTRACT_NAME_RULE = eINSTANCE.getAbstractNameRule();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_NAME_RULE__NAME = eINSTANCE.getAbstractNameRule_Name();

		/**
		 * The meta object literal for the '{@link editPolicyEcore1.impl.SourceTypeRuleImpl <em>Source Type Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see editPolicyEcore1.impl.SourceTypeRuleImpl
		 * @see editPolicyEcore1.impl.EditPolicyEcore1PackageImpl#getSourceTypeRule()
		 * @generated
		 */
		EClass SOURCE_TYPE_RULE = eINSTANCE.getSourceTypeRule();

		/**
		 * The meta object literal for the '{@link editPolicyEcore1.impl.TargetTypeRuleImpl <em>Target Type Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see editPolicyEcore1.impl.TargetTypeRuleImpl
		 * @see editPolicyEcore1.impl.EditPolicyEcore1PackageImpl#getTargetTypeRule()
		 * @generated
		 */
		EClass TARGET_TYPE_RULE = eINSTANCE.getTargetTypeRule();

		/**
		 * The meta object literal for the '{@link editPolicyEcore1.impl.CommandNameRuleImpl <em>Command Name Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see editPolicyEcore1.impl.CommandNameRuleImpl
		 * @see editPolicyEcore1.impl.EditPolicyEcore1PackageImpl#getCommandNameRule()
		 * @generated
		 */
		EClass COMMAND_NAME_RULE = eINSTANCE.getCommandNameRule();

		/**
		 * The meta object literal for the '{@link editPolicyEcore1.impl.ShapeTypeRuleImpl <em>Shape Type Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see editPolicyEcore1.impl.ShapeTypeRuleImpl
		 * @see editPolicyEcore1.impl.EditPolicyEcore1PackageImpl#getShapeTypeRule()
		 * @generated
		 */
		EClass SHAPE_TYPE_RULE = eINSTANCE.getShapeTypeRule();

		/**
		 * The meta object literal for the '{@link editPolicyEcore1.impl.ParentTypeRuleImpl <em>Parent Type Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see editPolicyEcore1.impl.ParentTypeRuleImpl
		 * @see editPolicyEcore1.impl.EditPolicyEcore1PackageImpl#getParentTypeRule()
		 * @generated
		 */
		EClass PARENT_TYPE_RULE = eINSTANCE.getParentTypeRule();

		/**
		 * The meta object literal for the '{@link editPolicyEcore1.impl.StepInRuleImpl <em>Step In Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see editPolicyEcore1.impl.StepInRuleImpl
		 * @see editPolicyEcore1.impl.EditPolicyEcore1PackageImpl#getStepInRule()
		 * @generated
		 */
		EClass STEP_IN_RULE = eINSTANCE.getStepInRule();

		/**
		 * The meta object literal for the '{@link editPolicyEcore1.impl.TrueRuleImpl <em>True Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see editPolicyEcore1.impl.TrueRuleImpl
		 * @see editPolicyEcore1.impl.EditPolicyEcore1PackageImpl#getTrueRule()
		 * @generated
		 */
		EClass TRUE_RULE = eINSTANCE.getTrueRule();

		/**
		 * The meta object literal for the '{@link editPolicyEcore1.impl.FalseRuleImpl <em>False Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see editPolicyEcore1.impl.FalseRuleImpl
		 * @see editPolicyEcore1.impl.EditPolicyEcore1PackageImpl#getFalseRule()
		 * @generated
		 */
		EClass FALSE_RULE = eINSTANCE.getFalseRule();

		/**
		 * The meta object literal for the '{@link editPolicyEcore1.impl.ShapeNameRuleImpl <em>Shape Name Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see editPolicyEcore1.impl.ShapeNameRuleImpl
		 * @see editPolicyEcore1.impl.EditPolicyEcore1PackageImpl#getShapeNameRule()
		 * @generated
		 */
		EClass SHAPE_NAME_RULE = eINSTANCE.getShapeNameRule();

	}

} //EditPolicyEcore1Package
