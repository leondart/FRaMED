/**
 */
package model;

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
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see model.ModelFactory
 * @model kind="package"
 * @generated
 */
public interface ModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "model";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/resource/org.framed.orm.editPolicy.model/";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "model";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModelPackage eINSTANCE = model.impl.ModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link model.impl.ModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.ModelImpl
	 * @see model.impl.ModelPackageImpl#getModel()
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
	 * The meta object id for the '{@link model.impl.PolicyImpl <em>Policy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.PolicyImpl
	 * @see model.impl.ModelPackageImpl#getPolicy()
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
	 * The meta object id for the '{@link model.impl.ConfigurationImpl <em>Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.ConfigurationImpl
	 * @see model.impl.ModelPackageImpl#getConfiguration()
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
	 * The meta object id for the '{@link model.impl.AbstractMappingRuleImpl <em>Abstract Mapping Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.AbstractMappingRuleImpl
	 * @see model.impl.ModelPackageImpl#getAbstractMappingRule()
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
	 * The meta object id for the '{@link model.impl.MappingImpl <em>Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.MappingImpl
	 * @see model.impl.ModelPackageImpl#getMapping()
	 * @generated
	 */
	int MAPPING = 4;

	/**
	 * The feature id for the '<em><b>Rule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING__RULE = 0;

	/**
	 * The feature id for the '<em><b>Policy</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING__POLICY = 1;

	/**
	 * The number of structural features of the '<em>Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link model.impl.FeatureNameMappingRuleImpl <em>Feature Name Mapping Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.FeatureNameMappingRuleImpl
	 * @see model.impl.ModelPackageImpl#getFeatureNameMappingRule()
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
	 * The meta object id for the '{@link model.impl.AndMappingRuleImpl <em>And Mapping Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.AndMappingRuleImpl
	 * @see model.impl.ModelPackageImpl#getAndMappingRule()
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
	 * The meta object id for the '{@link model.impl.AbstractRuleImpl <em>Abstract Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.AbstractRuleImpl
	 * @see model.impl.ModelPackageImpl#getAbstractRule()
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
	 * The meta object id for the '{@link model.impl.AndRuleImpl <em>And Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.AndRuleImpl
	 * @see model.impl.ModelPackageImpl#getAndRule()
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
	 * The meta object id for the '{@link model.impl.AbstractNameRuleImpl <em>Abstract Name Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.AbstractNameRuleImpl
	 * @see model.impl.ModelPackageImpl#getAbstractNameRule()
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
	 * The meta object id for the '{@link model.impl.RelationNameRuleImpl <em>Relation Name Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.RelationNameRuleImpl
	 * @see model.impl.ModelPackageImpl#getRelationNameRule()
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
	 * The meta object id for the '{@link model.impl.NotMappingRuleImpl <em>Not Mapping Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.NotMappingRuleImpl
	 * @see model.impl.ModelPackageImpl#getNotMappingRule()
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
	 * The meta object id for the '{@link model.impl.OrMappingRuleImpl <em>Or Mapping Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.OrMappingRuleImpl
	 * @see model.impl.ModelPackageImpl#getOrMappingRule()
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
	 * The meta object id for the '{@link model.impl.ImplicationMappingRuleImpl <em>Implication Mapping Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.ImplicationMappingRuleImpl
	 * @see model.impl.ModelPackageImpl#getImplicationMappingRule()
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
	 * The meta object id for the '{@link model.impl.OrRuleImpl <em>Or Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.OrRuleImpl
	 * @see model.impl.ModelPackageImpl#getOrRule()
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
	 * The meta object id for the '{@link model.impl.NotRuleImpl <em>Not Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.NotRuleImpl
	 * @see model.impl.ModelPackageImpl#getNotRule()
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
	 * The meta object id for the '{@link model.impl.ImplicationRuleImpl <em>Implication Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.ImplicationRuleImpl
	 * @see model.impl.ModelPackageImpl#getImplicationRule()
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
	 * The meta object id for the '{@link model.impl.SourceTypeRuleImpl <em>Source Type Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.SourceTypeRuleImpl
	 * @see model.impl.ModelPackageImpl#getSourceTypeRule()
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
	 * The meta object id for the '{@link model.impl.TargetTypeRuleImpl <em>Target Type Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.TargetTypeRuleImpl
	 * @see model.impl.ModelPackageImpl#getTargetTypeRule()
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
	 * The meta object id for the '{@link model.impl.CommandNameRuleImpl <em>Command Name Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.CommandNameRuleImpl
	 * @see model.impl.ModelPackageImpl#getCommandNameRule()
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
	 * The meta object id for the '{@link model.impl.ShapeTypeRuleImpl <em>Shape Type Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.ShapeTypeRuleImpl
	 * @see model.impl.ModelPackageImpl#getShapeTypeRule()
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
	 * The meta object id for the '{@link model.impl.ParentTypeRuleImpl <em>Parent Type Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.ParentTypeRuleImpl
	 * @see model.impl.ModelPackageImpl#getParentTypeRule()
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
	 * The meta object id for the '{@link model.impl.StepInRuleImpl <em>Step In Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.StepInRuleImpl
	 * @see model.impl.ModelPackageImpl#getStepInRule()
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
	 * The meta object id for the '{@link model.impl.TrueRuleImpl <em>True Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.TrueRuleImpl
	 * @see model.impl.ModelPackageImpl#getTrueRule()
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
	 * The meta object id for the '{@link model.impl.FalseRuleImpl <em>False Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.FalseRuleImpl
	 * @see model.impl.ModelPackageImpl#getFalseRule()
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
	 * The meta object id for the '{@link model.impl.ShapeNameRuleImpl <em>Shape Name Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.ShapeNameRuleImpl
	 * @see model.impl.ModelPackageImpl#getShapeNameRule()
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
	 * The meta object id for the '{@link model.impl.TrueMappingRuleImpl <em>True Mapping Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.TrueMappingRuleImpl
	 * @see model.impl.ModelPackageImpl#getTrueMappingRule()
	 * @generated
	 */
	int TRUE_MAPPING_RULE = 26;

	/**
	 * The number of structural features of the '<em>True Mapping Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUE_MAPPING_RULE_FEATURE_COUNT = ABSTRACT_MAPPING_RULE_FEATURE_COUNT + 0;


	/**
	 * The meta object id for the '{@link model.impl.RelationIsCyclicRuleImpl <em>Relation Is Cyclic Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.RelationIsCyclicRuleImpl
	 * @see model.impl.ModelPackageImpl#getRelationIsCyclicRule()
	 * @generated
	 */
	int RELATION_IS_CYCLIC_RULE = 27;

	/**
	 * The number of structural features of the '<em>Relation Is Cyclic Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_IS_CYCLIC_RULE_FEATURE_COUNT = ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link model.impl.RelationIsReflexivRuleImpl <em>Relation Is Reflexiv Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.RelationIsReflexivRuleImpl
	 * @see model.impl.ModelPackageImpl#getRelationIsReflexivRule()
	 * @generated
	 */
	int RELATION_IS_REFLEXIV_RULE = 28;

	/**
	 * The number of structural features of the '<em>Relation Is Reflexiv Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_IS_REFLEXIV_RULE_FEATURE_COUNT = ABSTRACT_RULE_FEATURE_COUNT + 0;


	/**
	 * The meta object id for the '{@link model.impl.RelationTypesAreEqualRuleImpl <em>Relation Types Are Equal Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.RelationTypesAreEqualRuleImpl
	 * @see model.impl.ModelPackageImpl#getRelationTypesAreEqualRule()
	 * @generated
	 */
	int RELATION_TYPES_ARE_EQUAL_RULE = 29;

	/**
	 * The number of structural features of the '<em>Relation Types Are Equal Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_TYPES_ARE_EQUAL_RULE_FEATURE_COUNT = ABSTRACT_RULE_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link model.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see model.Model
	 * @generated
	 */
	EClass getModel();

	/**
	 * Returns the meta object for the containment reference '{@link model.Model#getConfiguration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Configuration</em>'.
	 * @see model.Model#getConfiguration()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Configuration();

	/**
	 * Returns the meta object for the containment reference list '{@link model.Model#getPolicies <em>Policies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Policies</em>'.
	 * @see model.Model#getPolicies()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Policies();

	/**
	 * Returns the meta object for class '{@link model.Policy <em>Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Policy</em>'.
	 * @see model.Policy
	 * @generated
	 */
	EClass getPolicy();

	/**
	 * Returns the meta object for the attribute '{@link model.Policy#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see model.Policy#getName()
	 * @see #getPolicy()
	 * @generated
	 */
	EAttribute getPolicy_Name();

	/**
	 * Returns the meta object for the containment reference '{@link model.Policy#getRule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rule</em>'.
	 * @see model.Policy#getRule()
	 * @see #getPolicy()
	 * @generated
	 */
	EReference getPolicy_Rule();

	/**
	 * Returns the meta object for class '{@link model.Configuration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Configuration</em>'.
	 * @see model.Configuration
	 * @generated
	 */
	EClass getConfiguration();

	/**
	 * Returns the meta object for the containment reference list '{@link model.Configuration#getMappings <em>Mappings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mappings</em>'.
	 * @see model.Configuration#getMappings()
	 * @see #getConfiguration()
	 * @generated
	 */
	EReference getConfiguration_Mappings();

	/**
	 * Returns the meta object for class '{@link model.AbstractMappingRule <em>Abstract Mapping Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Mapping Rule</em>'.
	 * @see model.AbstractMappingRule
	 * @generated
	 */
	EClass getAbstractMappingRule();

	/**
	 * Returns the meta object for class '{@link model.Mapping <em>Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mapping</em>'.
	 * @see model.Mapping
	 * @generated
	 */
	EClass getMapping();

	/**
	 * Returns the meta object for the containment reference '{@link model.Mapping#getRule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rule</em>'.
	 * @see model.Mapping#getRule()
	 * @see #getMapping()
	 * @generated
	 */
	EReference getMapping_Rule();

	/**
	 * Returns the meta object for the reference '{@link model.Mapping#getPolicy <em>Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Policy</em>'.
	 * @see model.Mapping#getPolicy()
	 * @see #getMapping()
	 * @generated
	 */
	EReference getMapping_Policy();

	/**
	 * Returns the meta object for class '{@link model.FeatureNameMappingRule <em>Feature Name Mapping Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Name Mapping Rule</em>'.
	 * @see model.FeatureNameMappingRule
	 * @generated
	 */
	EClass getFeatureNameMappingRule();

	/**
	 * Returns the meta object for the attribute '{@link model.FeatureNameMappingRule#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see model.FeatureNameMappingRule#getName()
	 * @see #getFeatureNameMappingRule()
	 * @generated
	 */
	EAttribute getFeatureNameMappingRule_Name();

	/**
	 * Returns the meta object for class '{@link model.AndMappingRule <em>And Mapping Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>And Mapping Rule</em>'.
	 * @see model.AndMappingRule
	 * @generated
	 */
	EClass getAndMappingRule();

	/**
	 * Returns the meta object for the containment reference list '{@link model.AndMappingRule#getRules <em>Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rules</em>'.
	 * @see model.AndMappingRule#getRules()
	 * @see #getAndMappingRule()
	 * @generated
	 */
	EReference getAndMappingRule_Rules();

	/**
	 * Returns the meta object for class '{@link model.AbstractRule <em>Abstract Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Rule</em>'.
	 * @see model.AbstractRule
	 * @generated
	 */
	EClass getAbstractRule();

	/**
	 * Returns the meta object for class '{@link model.AndRule <em>And Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>And Rule</em>'.
	 * @see model.AndRule
	 * @generated
	 */
	EClass getAndRule();

	/**
	 * Returns the meta object for the containment reference list '{@link model.AndRule#getRules <em>Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rules</em>'.
	 * @see model.AndRule#getRules()
	 * @see #getAndRule()
	 * @generated
	 */
	EReference getAndRule_Rules();

	/**
	 * Returns the meta object for class '{@link model.RelationNameRule <em>Relation Name Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relation Name Rule</em>'.
	 * @see model.RelationNameRule
	 * @generated
	 */
	EClass getRelationNameRule();

	/**
	 * Returns the meta object for class '{@link model.NotMappingRule <em>Not Mapping Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Not Mapping Rule</em>'.
	 * @see model.NotMappingRule
	 * @generated
	 */
	EClass getNotMappingRule();

	/**
	 * Returns the meta object for the containment reference '{@link model.NotMappingRule#getRule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rule</em>'.
	 * @see model.NotMappingRule#getRule()
	 * @see #getNotMappingRule()
	 * @generated
	 */
	EReference getNotMappingRule_Rule();

	/**
	 * Returns the meta object for class '{@link model.OrMappingRule <em>Or Mapping Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Or Mapping Rule</em>'.
	 * @see model.OrMappingRule
	 * @generated
	 */
	EClass getOrMappingRule();

	/**
	 * Returns the meta object for the containment reference list '{@link model.OrMappingRule#getRules <em>Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rules</em>'.
	 * @see model.OrMappingRule#getRules()
	 * @see #getOrMappingRule()
	 * @generated
	 */
	EReference getOrMappingRule_Rules();

	/**
	 * Returns the meta object for class '{@link model.ImplicationMappingRule <em>Implication Mapping Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Implication Mapping Rule</em>'.
	 * @see model.ImplicationMappingRule
	 * @generated
	 */
	EClass getImplicationMappingRule();

	/**
	 * Returns the meta object for the containment reference '{@link model.ImplicationMappingRule#getAntecedent <em>Antecedent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Antecedent</em>'.
	 * @see model.ImplicationMappingRule#getAntecedent()
	 * @see #getImplicationMappingRule()
	 * @generated
	 */
	EReference getImplicationMappingRule_Antecedent();

	/**
	 * Returns the meta object for the containment reference '{@link model.ImplicationMappingRule#getConsequent <em>Consequent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Consequent</em>'.
	 * @see model.ImplicationMappingRule#getConsequent()
	 * @see #getImplicationMappingRule()
	 * @generated
	 */
	EReference getImplicationMappingRule_Consequent();

	/**
	 * Returns the meta object for class '{@link model.OrRule <em>Or Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Or Rule</em>'.
	 * @see model.OrRule
	 * @generated
	 */
	EClass getOrRule();

	/**
	 * Returns the meta object for the containment reference list '{@link model.OrRule#getRules <em>Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rules</em>'.
	 * @see model.OrRule#getRules()
	 * @see #getOrRule()
	 * @generated
	 */
	EReference getOrRule_Rules();

	/**
	 * Returns the meta object for class '{@link model.NotRule <em>Not Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Not Rule</em>'.
	 * @see model.NotRule
	 * @generated
	 */
	EClass getNotRule();

	/**
	 * Returns the meta object for the containment reference '{@link model.NotRule#getRule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rule</em>'.
	 * @see model.NotRule#getRule()
	 * @see #getNotRule()
	 * @generated
	 */
	EReference getNotRule_Rule();

	/**
	 * Returns the meta object for class '{@link model.ImplicationRule <em>Implication Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Implication Rule</em>'.
	 * @see model.ImplicationRule
	 * @generated
	 */
	EClass getImplicationRule();

	/**
	 * Returns the meta object for the containment reference '{@link model.ImplicationRule#getAntecedent <em>Antecedent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Antecedent</em>'.
	 * @see model.ImplicationRule#getAntecedent()
	 * @see #getImplicationRule()
	 * @generated
	 */
	EReference getImplicationRule_Antecedent();

	/**
	 * Returns the meta object for the containment reference '{@link model.ImplicationRule#getConsequent <em>Consequent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Consequent</em>'.
	 * @see model.ImplicationRule#getConsequent()
	 * @see #getImplicationRule()
	 * @generated
	 */
	EReference getImplicationRule_Consequent();

	/**
	 * Returns the meta object for class '{@link model.AbstractNameRule <em>Abstract Name Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Name Rule</em>'.
	 * @see model.AbstractNameRule
	 * @generated
	 */
	EClass getAbstractNameRule();

	/**
	 * Returns the meta object for the attribute '{@link model.AbstractNameRule#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see model.AbstractNameRule#getName()
	 * @see #getAbstractNameRule()
	 * @generated
	 */
	EAttribute getAbstractNameRule_Name();

	/**
	 * Returns the meta object for class '{@link model.SourceTypeRule <em>Source Type Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Source Type Rule</em>'.
	 * @see model.SourceTypeRule
	 * @generated
	 */
	EClass getSourceTypeRule();

	/**
	 * Returns the meta object for class '{@link model.TargetTypeRule <em>Target Type Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Target Type Rule</em>'.
	 * @see model.TargetTypeRule
	 * @generated
	 */
	EClass getTargetTypeRule();

	/**
	 * Returns the meta object for class '{@link model.CommandNameRule <em>Command Name Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Command Name Rule</em>'.
	 * @see model.CommandNameRule
	 * @generated
	 */
	EClass getCommandNameRule();

	/**
	 * Returns the meta object for class '{@link model.ShapeTypeRule <em>Shape Type Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shape Type Rule</em>'.
	 * @see model.ShapeTypeRule
	 * @generated
	 */
	EClass getShapeTypeRule();

	/**
	 * Returns the meta object for class '{@link model.ParentTypeRule <em>Parent Type Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parent Type Rule</em>'.
	 * @see model.ParentTypeRule
	 * @generated
	 */
	EClass getParentTypeRule();

	/**
	 * Returns the meta object for class '{@link model.StepInRule <em>Step In Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Step In Rule</em>'.
	 * @see model.StepInRule
	 * @generated
	 */
	EClass getStepInRule();

	/**
	 * Returns the meta object for class '{@link model.TrueRule <em>True Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>True Rule</em>'.
	 * @see model.TrueRule
	 * @generated
	 */
	EClass getTrueRule();

	/**
	 * Returns the meta object for class '{@link model.FalseRule <em>False Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>False Rule</em>'.
	 * @see model.FalseRule
	 * @generated
	 */
	EClass getFalseRule();

	/**
	 * Returns the meta object for class '{@link model.ShapeNameRule <em>Shape Name Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shape Name Rule</em>'.
	 * @see model.ShapeNameRule
	 * @generated
	 */
	EClass getShapeNameRule();

	/**
	 * Returns the meta object for class '{@link model.TrueMappingRule <em>True Mapping Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>True Mapping Rule</em>'.
	 * @see model.TrueMappingRule
	 * @generated
	 */
	EClass getTrueMappingRule();

	/**
	 * Returns the meta object for class '{@link model.RelationIsCyclicRule <em>Relation Is Cyclic Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relation Is Cyclic Rule</em>'.
	 * @see model.RelationIsCyclicRule
	 * @generated
	 */
	EClass getRelationIsCyclicRule();

	/**
	 * Returns the meta object for class '{@link model.RelationIsReflexivRule <em>Relation Is Reflexiv Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relation Is Reflexiv Rule</em>'.
	 * @see model.RelationIsReflexivRule
	 * @generated
	 */
	EClass getRelationIsReflexivRule();

	/**
	 * Returns the meta object for class '{@link model.RelationTypesAreEqualRule <em>Relation Types Are Equal Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relation Types Are Equal Rule</em>'.
	 * @see model.RelationTypesAreEqualRule
	 * @generated
	 */
	EClass getRelationTypesAreEqualRule();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ModelFactory getModelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link model.impl.ModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.ModelImpl
		 * @see model.impl.ModelPackageImpl#getModel()
		 * @generated
		 */
		EClass MODEL = eINSTANCE.getModel();

		/**
		 * The meta object literal for the '<em><b>Configuration</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__CONFIGURATION = eINSTANCE.getModel_Configuration();

		/**
		 * The meta object literal for the '<em><b>Policies</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__POLICIES = eINSTANCE.getModel_Policies();

		/**
		 * The meta object literal for the '{@link model.impl.PolicyImpl <em>Policy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.PolicyImpl
		 * @see model.impl.ModelPackageImpl#getPolicy()
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
		 * The meta object literal for the '{@link model.impl.ConfigurationImpl <em>Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.ConfigurationImpl
		 * @see model.impl.ModelPackageImpl#getConfiguration()
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
		 * The meta object literal for the '{@link model.impl.AbstractMappingRuleImpl <em>Abstract Mapping Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.AbstractMappingRuleImpl
		 * @see model.impl.ModelPackageImpl#getAbstractMappingRule()
		 * @generated
		 */
		EClass ABSTRACT_MAPPING_RULE = eINSTANCE.getAbstractMappingRule();

		/**
		 * The meta object literal for the '{@link model.impl.MappingImpl <em>Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.MappingImpl
		 * @see model.impl.ModelPackageImpl#getMapping()
		 * @generated
		 */
		EClass MAPPING = eINSTANCE.getMapping();

		/**
		 * The meta object literal for the '<em><b>Rule</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPING__RULE = eINSTANCE.getMapping_Rule();

		/**
		 * The meta object literal for the '<em><b>Policy</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPING__POLICY = eINSTANCE.getMapping_Policy();

		/**
		 * The meta object literal for the '{@link model.impl.FeatureNameMappingRuleImpl <em>Feature Name Mapping Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.FeatureNameMappingRuleImpl
		 * @see model.impl.ModelPackageImpl#getFeatureNameMappingRule()
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
		 * The meta object literal for the '{@link model.impl.AndMappingRuleImpl <em>And Mapping Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.AndMappingRuleImpl
		 * @see model.impl.ModelPackageImpl#getAndMappingRule()
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
		 * The meta object literal for the '{@link model.impl.AbstractRuleImpl <em>Abstract Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.AbstractRuleImpl
		 * @see model.impl.ModelPackageImpl#getAbstractRule()
		 * @generated
		 */
		EClass ABSTRACT_RULE = eINSTANCE.getAbstractRule();

		/**
		 * The meta object literal for the '{@link model.impl.AndRuleImpl <em>And Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.AndRuleImpl
		 * @see model.impl.ModelPackageImpl#getAndRule()
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
		 * The meta object literal for the '{@link model.impl.RelationNameRuleImpl <em>Relation Name Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.RelationNameRuleImpl
		 * @see model.impl.ModelPackageImpl#getRelationNameRule()
		 * @generated
		 */
		EClass RELATION_NAME_RULE = eINSTANCE.getRelationNameRule();

		/**
		 * The meta object literal for the '{@link model.impl.NotMappingRuleImpl <em>Not Mapping Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.NotMappingRuleImpl
		 * @see model.impl.ModelPackageImpl#getNotMappingRule()
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
		 * The meta object literal for the '{@link model.impl.OrMappingRuleImpl <em>Or Mapping Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.OrMappingRuleImpl
		 * @see model.impl.ModelPackageImpl#getOrMappingRule()
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
		 * The meta object literal for the '{@link model.impl.ImplicationMappingRuleImpl <em>Implication Mapping Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.ImplicationMappingRuleImpl
		 * @see model.impl.ModelPackageImpl#getImplicationMappingRule()
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
		 * The meta object literal for the '{@link model.impl.OrRuleImpl <em>Or Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.OrRuleImpl
		 * @see model.impl.ModelPackageImpl#getOrRule()
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
		 * The meta object literal for the '{@link model.impl.NotRuleImpl <em>Not Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.NotRuleImpl
		 * @see model.impl.ModelPackageImpl#getNotRule()
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
		 * The meta object literal for the '{@link model.impl.ImplicationRuleImpl <em>Implication Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.ImplicationRuleImpl
		 * @see model.impl.ModelPackageImpl#getImplicationRule()
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
		 * The meta object literal for the '{@link model.impl.AbstractNameRuleImpl <em>Abstract Name Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.AbstractNameRuleImpl
		 * @see model.impl.ModelPackageImpl#getAbstractNameRule()
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
		 * The meta object literal for the '{@link model.impl.SourceTypeRuleImpl <em>Source Type Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.SourceTypeRuleImpl
		 * @see model.impl.ModelPackageImpl#getSourceTypeRule()
		 * @generated
		 */
		EClass SOURCE_TYPE_RULE = eINSTANCE.getSourceTypeRule();

		/**
		 * The meta object literal for the '{@link model.impl.TargetTypeRuleImpl <em>Target Type Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.TargetTypeRuleImpl
		 * @see model.impl.ModelPackageImpl#getTargetTypeRule()
		 * @generated
		 */
		EClass TARGET_TYPE_RULE = eINSTANCE.getTargetTypeRule();

		/**
		 * The meta object literal for the '{@link model.impl.CommandNameRuleImpl <em>Command Name Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.CommandNameRuleImpl
		 * @see model.impl.ModelPackageImpl#getCommandNameRule()
		 * @generated
		 */
		EClass COMMAND_NAME_RULE = eINSTANCE.getCommandNameRule();

		/**
		 * The meta object literal for the '{@link model.impl.ShapeTypeRuleImpl <em>Shape Type Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.ShapeTypeRuleImpl
		 * @see model.impl.ModelPackageImpl#getShapeTypeRule()
		 * @generated
		 */
		EClass SHAPE_TYPE_RULE = eINSTANCE.getShapeTypeRule();

		/**
		 * The meta object literal for the '{@link model.impl.ParentTypeRuleImpl <em>Parent Type Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.ParentTypeRuleImpl
		 * @see model.impl.ModelPackageImpl#getParentTypeRule()
		 * @generated
		 */
		EClass PARENT_TYPE_RULE = eINSTANCE.getParentTypeRule();

		/**
		 * The meta object literal for the '{@link model.impl.StepInRuleImpl <em>Step In Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.StepInRuleImpl
		 * @see model.impl.ModelPackageImpl#getStepInRule()
		 * @generated
		 */
		EClass STEP_IN_RULE = eINSTANCE.getStepInRule();

		/**
		 * The meta object literal for the '{@link model.impl.TrueRuleImpl <em>True Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.TrueRuleImpl
		 * @see model.impl.ModelPackageImpl#getTrueRule()
		 * @generated
		 */
		EClass TRUE_RULE = eINSTANCE.getTrueRule();

		/**
		 * The meta object literal for the '{@link model.impl.FalseRuleImpl <em>False Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.FalseRuleImpl
		 * @see model.impl.ModelPackageImpl#getFalseRule()
		 * @generated
		 */
		EClass FALSE_RULE = eINSTANCE.getFalseRule();

		/**
		 * The meta object literal for the '{@link model.impl.ShapeNameRuleImpl <em>Shape Name Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.ShapeNameRuleImpl
		 * @see model.impl.ModelPackageImpl#getShapeNameRule()
		 * @generated
		 */
		EClass SHAPE_NAME_RULE = eINSTANCE.getShapeNameRule();

		/**
		 * The meta object literal for the '{@link model.impl.TrueMappingRuleImpl <em>True Mapping Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.TrueMappingRuleImpl
		 * @see model.impl.ModelPackageImpl#getTrueMappingRule()
		 * @generated
		 */
		EClass TRUE_MAPPING_RULE = eINSTANCE.getTrueMappingRule();

		/**
		 * The meta object literal for the '{@link model.impl.RelationIsCyclicRuleImpl <em>Relation Is Cyclic Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.RelationIsCyclicRuleImpl
		 * @see model.impl.ModelPackageImpl#getRelationIsCyclicRule()
		 * @generated
		 */
		EClass RELATION_IS_CYCLIC_RULE = eINSTANCE.getRelationIsCyclicRule();

		/**
		 * The meta object literal for the '{@link model.impl.RelationIsReflexivRuleImpl <em>Relation Is Reflexiv Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.RelationIsReflexivRuleImpl
		 * @see model.impl.ModelPackageImpl#getRelationIsReflexivRule()
		 * @generated
		 */
		EClass RELATION_IS_REFLEXIV_RULE = eINSTANCE.getRelationIsReflexivRule();

		/**
		 * The meta object literal for the '{@link model.impl.RelationTypesAreEqualRuleImpl <em>Relation Types Are Equal Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.RelationTypesAreEqualRuleImpl
		 * @see model.impl.ModelPackageImpl#getRelationTypesAreEqualRule()
		 * @generated
		 */
		EClass RELATION_TYPES_ARE_EQUAL_RULE = eINSTANCE.getRelationTypesAreEqualRule();

	}

} //ModelPackage
