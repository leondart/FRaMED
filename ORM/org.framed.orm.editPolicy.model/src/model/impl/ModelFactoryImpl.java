/**
 */
package model.impl;

import model.*;

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
public class ModelFactoryImpl extends EFactoryImpl implements ModelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ModelFactory init() {
		try {
			ModelFactory theModelFactory = (ModelFactory)EPackage.Registry.INSTANCE.getEFactory(ModelPackage.eNS_URI);
			if (theModelFactory != null) {
				return theModelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ModelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelFactoryImpl() {
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
			case ModelPackage.MODEL: return createModel();
			case ModelPackage.POLICY: return createPolicy();
			case ModelPackage.CONFIGURATION: return createConfiguration();
			case ModelPackage.MAPPING: return createMapping();
			case ModelPackage.FEATURE_NAME_MAPPING_RULE: return createFeatureNameMappingRule();
			case ModelPackage.AND_MAPPING_RULE: return createAndMappingRule();
			case ModelPackage.AND_RULE: return createAndRule();
			case ModelPackage.RELATION_TYPE_RULE: return createRelationTypeRule();
			case ModelPackage.NOT_MAPPING_RULE: return createNotMappingRule();
			case ModelPackage.OR_MAPPING_RULE: return createOrMappingRule();
			case ModelPackage.IMPLICATION_MAPPING_RULE: return createImplicationMappingRule();
			case ModelPackage.OR_RULE: return createOrRule();
			case ModelPackage.NOT_RULE: return createNotRule();
			case ModelPackage.IMPLICATION_RULE: return createImplicationRule();
			case ModelPackage.SOURCE_TYPE_RULE: return createSourceTypeRule();
			case ModelPackage.TARGET_TYPE_RULE: return createTargetTypeRule();
			case ModelPackage.COMMAND_NAME_RULE: return createCommandNameRule();
			case ModelPackage.SHAPE_TYPE_RULE: return createShapeTypeRule();
			case ModelPackage.PARENT_TYPE_RULE: return createParentTypeRule();
			case ModelPackage.STEP_IN_RULE: return createStepInRule();
			case ModelPackage.TRUE_RULE: return createTrueRule();
			case ModelPackage.FALSE_RULE: return createFalseRule();
			case ModelPackage.SHAPE_NAME_RULE: return createShapeNameRule();
			case ModelPackage.TRUE_MAPPING_RULE: return createTrueMappingRule();
			case ModelPackage.RELATION_IS_CYCLIC_RULE: return createRelationIsCyclicRule();
			case ModelPackage.RELATION_IS_REFLEXIV_RULE: return createRelationIsReflexivRule();
			case ModelPackage.RELATION_TYPES_ARE_EQUAL_RULE: return createRelationTypesAreEqualRule();
			case ModelPackage.TYPE_EXISTS_RULE: return createTypeExistsRule();
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
	public RelationTypeRule createRelationTypeRule() {
		RelationTypeRuleImpl relationTypeRule = new RelationTypeRuleImpl();
		return relationTypeRule;
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
	public RelationIsCyclicRule createRelationIsCyclicRule() {
		RelationIsCyclicRuleImpl relationIsCyclicRule = new RelationIsCyclicRuleImpl();
		return relationIsCyclicRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationIsReflexivRule createRelationIsReflexivRule() {
		RelationIsReflexivRuleImpl relationIsReflexivRule = new RelationIsReflexivRuleImpl();
		return relationIsReflexivRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationTypesAreEqualRule createRelationTypesAreEqualRule() {
		RelationTypesAreEqualRuleImpl relationTypesAreEqualRule = new RelationTypesAreEqualRuleImpl();
		return relationTypesAreEqualRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeExistsRule createTypeExistsRule() {
		TypeExistsRuleImpl typeExistsRule = new TypeExistsRuleImpl();
		return typeExistsRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelPackage getModelPackage() {
		return (ModelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ModelPackage getPackage() {
		return ModelPackage.eINSTANCE;
	}

} //ModelFactoryImpl
