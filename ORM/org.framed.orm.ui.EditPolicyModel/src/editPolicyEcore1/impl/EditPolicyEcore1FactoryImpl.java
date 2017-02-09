/**
 */
package editPolicyEcore1.impl;

import editPolicyEcore1.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EditPolicyEcore1FactoryImpl extends EFactoryImpl implements EditPolicyEcore1Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EditPolicyEcore1Factory init() {
		try {
			EditPolicyEcore1Factory theEditPolicyEcore1Factory = (EditPolicyEcore1Factory)EPackage.Registry.INSTANCE.getEFactory(EditPolicyEcore1Package.eNS_URI);
			if (theEditPolicyEcore1Factory != null) {
				return theEditPolicyEcore1Factory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EditPolicyEcore1FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EditPolicyEcore1FactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case EditPolicyEcore1Package.MODEL: return createModel();
			case EditPolicyEcore1Package.POLICY: return createPolicy();
			case EditPolicyEcore1Package.CONFIGURATION: return createConfiguration();
			case EditPolicyEcore1Package.MAPPING: return createMapping();
			case EditPolicyEcore1Package.FEATURE_NAME_MAPPING_RULE: return createFeatureNameMappingRule();
			case EditPolicyEcore1Package.AND_MAPPING_RULE: return createAndMappingRule();
			case EditPolicyEcore1Package.AND_RULE: return createAndRule();
			case EditPolicyEcore1Package.RELATION_NAME_RULE: return createRelationNameRule();
			case EditPolicyEcore1Package.NOT_MAPPING_RULE: return createNotMappingRule();
			case EditPolicyEcore1Package.OR_MAPPING_RULE: return createOrMappingRule();
			case EditPolicyEcore1Package.IMPLICATION_MAPPING_RULE: return createImplicationMappingRule();
			case EditPolicyEcore1Package.OR_RULE: return createOrRule();
			case EditPolicyEcore1Package.NOT_RULE: return createNotRule();
			case EditPolicyEcore1Package.IMPLICATION_RULE: return createImplicationRule();
			case EditPolicyEcore1Package.SOURCE_TYPE_RULE: return createSourceTypeRule();
			case EditPolicyEcore1Package.TARGET_TYPE_RULE: return createTargetTypeRule();
			case EditPolicyEcore1Package.COMMAND_NAME_RULE: return createCommandNameRule();
			case EditPolicyEcore1Package.SHAPE_TYPE_RULE: return createShapeTypeRule();
			case EditPolicyEcore1Package.PARENT_TYPE_RULE: return createParentTypeRule();
			case EditPolicyEcore1Package.STEP_IN_RULE: return createStepInRule();
			case EditPolicyEcore1Package.TRUE_RULE: return createTrueRule();
			case EditPolicyEcore1Package.FALSE_RULE: return createFalseRule();
			case EditPolicyEcore1Package.SHAPE_NAME_RULE: return createShapeNameRule();
			case EditPolicyEcore1Package.TRUE_MAPPING_RULE: return createTrueMappingRule();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Model createModel() {
		ModelImpl model = new ModelImpl();
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Policy createPolicy() {
		PolicyImpl policy = new PolicyImpl();
		return policy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Configuration createConfiguration() {
		ConfigurationImpl configuration = new ConfigurationImpl();
		return configuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mapping createMapping() {
		MappingImpl mapping = new MappingImpl();
		return mapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureNameMappingRule createFeatureNameMappingRule() {
		FeatureNameMappingRuleImpl featureNameMappingRule = new FeatureNameMappingRuleImpl();
		return featureNameMappingRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AndMappingRule createAndMappingRule() {
		AndMappingRuleImpl andMappingRule = new AndMappingRuleImpl();
		return andMappingRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AndRule createAndRule() {
		AndRuleImpl andRule = new AndRuleImpl();
		return andRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationNameRule createRelationNameRule() {
		RelationNameRuleImpl relationNameRule = new RelationNameRuleImpl();
		return relationNameRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotMappingRule createNotMappingRule() {
		NotMappingRuleImpl notMappingRule = new NotMappingRuleImpl();
		return notMappingRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrMappingRule createOrMappingRule() {
		OrMappingRuleImpl orMappingRule = new OrMappingRuleImpl();
		return orMappingRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImplicationMappingRule createImplicationMappingRule() {
		ImplicationMappingRuleImpl implicationMappingRule = new ImplicationMappingRuleImpl();
		return implicationMappingRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrRule createOrRule() {
		OrRuleImpl orRule = new OrRuleImpl();
		return orRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotRule createNotRule() {
		NotRuleImpl notRule = new NotRuleImpl();
		return notRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImplicationRule createImplicationRule() {
		ImplicationRuleImpl implicationRule = new ImplicationRuleImpl();
		return implicationRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SourceTypeRule createSourceTypeRule() {
		SourceTypeRuleImpl sourceTypeRule = new SourceTypeRuleImpl();
		return sourceTypeRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TargetTypeRule createTargetTypeRule() {
		TargetTypeRuleImpl targetTypeRule = new TargetTypeRuleImpl();
		return targetTypeRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommandNameRule createCommandNameRule() {
		CommandNameRuleImpl commandNameRule = new CommandNameRuleImpl();
		return commandNameRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShapeTypeRule createShapeTypeRule() {
		ShapeTypeRuleImpl shapeTypeRule = new ShapeTypeRuleImpl();
		return shapeTypeRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParentTypeRule createParentTypeRule() {
		ParentTypeRuleImpl parentTypeRule = new ParentTypeRuleImpl();
		return parentTypeRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StepInRule createStepInRule() {
		StepInRuleImpl stepInRule = new StepInRuleImpl();
		return stepInRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrueRule createTrueRule() {
		TrueRuleImpl trueRule = new TrueRuleImpl();
		return trueRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FalseRule createFalseRule() {
		FalseRuleImpl falseRule = new FalseRuleImpl();
		return falseRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShapeNameRule createShapeNameRule() {
		ShapeNameRuleImpl shapeNameRule = new ShapeNameRuleImpl();
		return shapeNameRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrueMappingRule createTrueMappingRule() {
		TrueMappingRuleImpl trueMappingRule = new TrueMappingRuleImpl();
		return trueMappingRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EditPolicyEcore1Package getEditPolicyEcore1Package() {
		return (EditPolicyEcore1Package)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EditPolicyEcore1Package getPackage() {
		return EditPolicyEcore1Package.eINSTANCE;
	}

} //EditPolicyEcore1FactoryImpl
