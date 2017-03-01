/**
 */
package model.impl;

import model.AbstractMappingRule;
import model.AbstractNameRule;
import model.AbstractRule;
import model.AndMappingRule;
import model.AndRule;
import model.CommandNameRule;
import model.Configuration;
import model.FalseRule;
import model.FeatureNameMappingRule;
import model.ImplicationMappingRule;
import model.ImplicationRule;
import model.Mapping;
import model.Model;
import model.ModelFactory;
import model.ModelPackage;
import model.NotMappingRule;
import model.NotRule;
import model.OrMappingRule;
import model.OrRule;
import model.ParentTypeRule;
import model.Policy;
import model.RelationIsCyclicRule;
import model.RelationIsReflexivRule;
import model.RelationNameRule;
import model.RelationTypeRule;
import model.RelationTypesAreEqualRule;
import model.ShapeNameRule;
import model.ShapeTypeRule;
import model.SourceTypeRule;
import model.StepInRule;
import model.TargetTypeRule;
import model.TrueMappingRule;
import model.TrueRule;

import model.TypeExistsRule;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ModelPackageImpl extends EPackageImpl implements ModelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass policyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass configurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractMappingRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mappingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featureNameMappingRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass andMappingRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass andRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationTypeRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass notMappingRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orMappingRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass implicationMappingRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass notRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass implicationRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractNameRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sourceTypeRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass targetTypeRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass commandNameRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass shapeTypeRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parentTypeRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stepInRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trueRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass falseRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass shapeNameRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trueMappingRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationIsCyclicRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationIsReflexivRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationTypesAreEqualRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeExistsRuleEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see model.ModelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ModelPackageImpl() {
		super(eNS_URI, ModelFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ModelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ModelPackage init() {
		if (isInited) return (ModelPackage)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI);

		// Obtain or create and register package
		ModelPackageImpl theModelPackage = (ModelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ModelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ModelPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theModelPackage.createPackageContents();

		// Initialize created meta-data
		theModelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theModelPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ModelPackage.eNS_URI, theModelPackage);
		return theModelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModel() {
		return modelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModel_Configuration() {
		return (EReference)modelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModel_Policies() {
		return (EReference)modelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPolicy() {
		return policyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolicy_Name() {
		return (EAttribute)policyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPolicy_Rule() {
		return (EReference)policyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConfiguration() {
		return configurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfiguration_Mappings() {
		return (EReference)configurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractMappingRule() {
		return abstractMappingRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMapping() {
		return mappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMapping_Rule() {
		return (EReference)mappingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMapping_Policy() {
		return (EReference)mappingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFeatureNameMappingRule() {
		return featureNameMappingRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFeatureNameMappingRule_Name() {
		return (EAttribute)featureNameMappingRuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAndMappingRule() {
		return andMappingRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAndMappingRule_Rules() {
		return (EReference)andMappingRuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractRule() {
		return abstractRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAndRule() {
		return andRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAndRule_Rules() {
		return (EReference)andRuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelationTypeRule() {
		return relationTypeRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNotMappingRule() {
		return notMappingRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNotMappingRule_Rule() {
		return (EReference)notMappingRuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrMappingRule() {
		return orMappingRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrMappingRule_Rules() {
		return (EReference)orMappingRuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImplicationMappingRule() {
		return implicationMappingRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImplicationMappingRule_Antecedent() {
		return (EReference)implicationMappingRuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImplicationMappingRule_Consequent() {
		return (EReference)implicationMappingRuleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrRule() {
		return orRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrRule_Rules() {
		return (EReference)orRuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNotRule() {
		return notRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNotRule_Rule() {
		return (EReference)notRuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImplicationRule() {
		return implicationRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImplicationRule_Antecedent() {
		return (EReference)implicationRuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImplicationRule_Consequent() {
		return (EReference)implicationRuleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractNameRule() {
		return abstractNameRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractNameRule_Name() {
		return (EAttribute)abstractNameRuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSourceTypeRule() {
		return sourceTypeRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTargetTypeRule() {
		return targetTypeRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCommandNameRule() {
		return commandNameRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getShapeTypeRule() {
		return shapeTypeRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParentTypeRule() {
		return parentTypeRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStepInRule() {
		return stepInRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrueRule() {
		return trueRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFalseRule() {
		return falseRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getShapeNameRule() {
		return shapeNameRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrueMappingRule() {
		return trueMappingRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelationIsCyclicRule() {
		return relationIsCyclicRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelationIsReflexivRule() {
		return relationIsReflexivRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelationTypesAreEqualRule() {
		return relationTypesAreEqualRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypeExistsRule() {
		return typeExistsRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelFactory getModelFactory() {
		return (ModelFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		modelEClass = createEClass(MODEL);
		createEReference(modelEClass, MODEL__CONFIGURATION);
		createEReference(modelEClass, MODEL__POLICIES);

		policyEClass = createEClass(POLICY);
		createEAttribute(policyEClass, POLICY__NAME);
		createEReference(policyEClass, POLICY__RULE);

		configurationEClass = createEClass(CONFIGURATION);
		createEReference(configurationEClass, CONFIGURATION__MAPPINGS);

		abstractMappingRuleEClass = createEClass(ABSTRACT_MAPPING_RULE);

		mappingEClass = createEClass(MAPPING);
		createEReference(mappingEClass, MAPPING__RULE);
		createEReference(mappingEClass, MAPPING__POLICY);

		featureNameMappingRuleEClass = createEClass(FEATURE_NAME_MAPPING_RULE);
		createEAttribute(featureNameMappingRuleEClass, FEATURE_NAME_MAPPING_RULE__NAME);

		andMappingRuleEClass = createEClass(AND_MAPPING_RULE);
		createEReference(andMappingRuleEClass, AND_MAPPING_RULE__RULES);

		abstractRuleEClass = createEClass(ABSTRACT_RULE);

		andRuleEClass = createEClass(AND_RULE);
		createEReference(andRuleEClass, AND_RULE__RULES);

		relationTypeRuleEClass = createEClass(RELATION_TYPE_RULE);

		notMappingRuleEClass = createEClass(NOT_MAPPING_RULE);
		createEReference(notMappingRuleEClass, NOT_MAPPING_RULE__RULE);

		orMappingRuleEClass = createEClass(OR_MAPPING_RULE);
		createEReference(orMappingRuleEClass, OR_MAPPING_RULE__RULES);

		implicationMappingRuleEClass = createEClass(IMPLICATION_MAPPING_RULE);
		createEReference(implicationMappingRuleEClass, IMPLICATION_MAPPING_RULE__ANTECEDENT);
		createEReference(implicationMappingRuleEClass, IMPLICATION_MAPPING_RULE__CONSEQUENT);

		orRuleEClass = createEClass(OR_RULE);
		createEReference(orRuleEClass, OR_RULE__RULES);

		notRuleEClass = createEClass(NOT_RULE);
		createEReference(notRuleEClass, NOT_RULE__RULE);

		implicationRuleEClass = createEClass(IMPLICATION_RULE);
		createEReference(implicationRuleEClass, IMPLICATION_RULE__ANTECEDENT);
		createEReference(implicationRuleEClass, IMPLICATION_RULE__CONSEQUENT);

		abstractNameRuleEClass = createEClass(ABSTRACT_NAME_RULE);
		createEAttribute(abstractNameRuleEClass, ABSTRACT_NAME_RULE__NAME);

		sourceTypeRuleEClass = createEClass(SOURCE_TYPE_RULE);

		targetTypeRuleEClass = createEClass(TARGET_TYPE_RULE);

		commandNameRuleEClass = createEClass(COMMAND_NAME_RULE);

		shapeTypeRuleEClass = createEClass(SHAPE_TYPE_RULE);

		parentTypeRuleEClass = createEClass(PARENT_TYPE_RULE);

		stepInRuleEClass = createEClass(STEP_IN_RULE);

		trueRuleEClass = createEClass(TRUE_RULE);

		falseRuleEClass = createEClass(FALSE_RULE);

		shapeNameRuleEClass = createEClass(SHAPE_NAME_RULE);

		trueMappingRuleEClass = createEClass(TRUE_MAPPING_RULE);

		relationIsCyclicRuleEClass = createEClass(RELATION_IS_CYCLIC_RULE);

		relationIsReflexivRuleEClass = createEClass(RELATION_IS_REFLEXIV_RULE);

		relationTypesAreEqualRuleEClass = createEClass(RELATION_TYPES_ARE_EQUAL_RULE);

		typeExistsRuleEClass = createEClass(TYPE_EXISTS_RULE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		featureNameMappingRuleEClass.getESuperTypes().add(this.getAbstractMappingRule());
		andMappingRuleEClass.getESuperTypes().add(this.getAbstractMappingRule());
		andRuleEClass.getESuperTypes().add(this.getAbstractRule());
		relationTypeRuleEClass.getESuperTypes().add(this.getAbstractNameRule());
		notMappingRuleEClass.getESuperTypes().add(this.getAbstractMappingRule());
		orMappingRuleEClass.getESuperTypes().add(this.getAbstractMappingRule());
		implicationMappingRuleEClass.getESuperTypes().add(this.getAbstractMappingRule());
		orRuleEClass.getESuperTypes().add(this.getAbstractRule());
		notRuleEClass.getESuperTypes().add(this.getAbstractRule());
		implicationRuleEClass.getESuperTypes().add(this.getAbstractRule());
		abstractNameRuleEClass.getESuperTypes().add(this.getAbstractRule());
		sourceTypeRuleEClass.getESuperTypes().add(this.getAbstractNameRule());
		targetTypeRuleEClass.getESuperTypes().add(this.getAbstractNameRule());
		commandNameRuleEClass.getESuperTypes().add(this.getAbstractNameRule());
		shapeTypeRuleEClass.getESuperTypes().add(this.getAbstractNameRule());
		parentTypeRuleEClass.getESuperTypes().add(this.getAbstractNameRule());
		stepInRuleEClass.getESuperTypes().add(this.getAbstractRule());
		trueRuleEClass.getESuperTypes().add(this.getAbstractRule());
		falseRuleEClass.getESuperTypes().add(this.getAbstractRule());
		shapeNameRuleEClass.getESuperTypes().add(this.getAbstractNameRule());
		trueMappingRuleEClass.getESuperTypes().add(this.getAbstractMappingRule());
		relationIsCyclicRuleEClass.getESuperTypes().add(this.getAbstractRule());
		relationIsReflexivRuleEClass.getESuperTypes().add(this.getAbstractRule());
		relationTypesAreEqualRuleEClass.getESuperTypes().add(this.getAbstractRule());
		typeExistsRuleEClass.getESuperTypes().add(this.getAbstractNameRule());

		// Initialize classes and features; add operations and parameters
		initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModel_Configuration(), this.getConfiguration(), null, "configuration", null, 1, 1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModel_Policies(), this.getPolicy(), null, "policies", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(policyEClass, Policy.class, "Policy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPolicy_Name(), ecorePackage.getEString(), "name", null, 0, 1, Policy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPolicy_Rule(), this.getAbstractRule(), null, "rule", null, 1, 1, Policy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(configurationEClass, Configuration.class, "Configuration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConfiguration_Mappings(), this.getMapping(), null, "mappings", null, 0, -1, Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractMappingRuleEClass, AbstractMappingRule.class, "AbstractMappingRule", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mappingEClass, Mapping.class, "Mapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMapping_Rule(), this.getAbstractMappingRule(), null, "rule", null, 1, 1, Mapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMapping_Policy(), this.getPolicy(), null, "policy", null, 1, 1, Mapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(featureNameMappingRuleEClass, FeatureNameMappingRule.class, "FeatureNameMappingRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFeatureNameMappingRule_Name(), ecorePackage.getEString(), "name", null, 0, 1, FeatureNameMappingRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(andMappingRuleEClass, AndMappingRule.class, "AndMappingRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAndMappingRule_Rules(), this.getAbstractMappingRule(), null, "rules", null, 2, -1, AndMappingRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractRuleEClass, AbstractRule.class, "AbstractRule", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(andRuleEClass, AndRule.class, "AndRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAndRule_Rules(), this.getAbstractRule(), null, "rules", null, 2, -1, AndRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relationTypeRuleEClass, RelationTypeRule.class, "RelationTypeRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(notMappingRuleEClass, NotMappingRule.class, "NotMappingRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNotMappingRule_Rule(), this.getAbstractMappingRule(), null, "rule", null, 1, 1, NotMappingRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(orMappingRuleEClass, OrMappingRule.class, "OrMappingRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOrMappingRule_Rules(), this.getAbstractMappingRule(), null, "rules", null, 2, -1, OrMappingRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(implicationMappingRuleEClass, ImplicationMappingRule.class, "ImplicationMappingRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getImplicationMappingRule_Antecedent(), this.getAbstractMappingRule(), null, "antecedent", null, 1, 1, ImplicationMappingRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getImplicationMappingRule_Consequent(), this.getAbstractMappingRule(), null, "consequent", null, 1, 1, ImplicationMappingRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(orRuleEClass, OrRule.class, "OrRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOrRule_Rules(), this.getAbstractRule(), null, "rules", null, 2, -1, OrRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(notRuleEClass, NotRule.class, "NotRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNotRule_Rule(), this.getAbstractRule(), null, "rule", null, 1, 1, NotRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(implicationRuleEClass, ImplicationRule.class, "ImplicationRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getImplicationRule_Antecedent(), this.getAbstractRule(), null, "antecedent", null, 1, 1, ImplicationRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getImplicationRule_Consequent(), this.getAbstractRule(), null, "consequent", null, 1, 1, ImplicationRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractNameRuleEClass, AbstractNameRule.class, "AbstractNameRule", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAbstractNameRule_Name(), ecorePackage.getEString(), "name", null, 0, 1, AbstractNameRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sourceTypeRuleEClass, SourceTypeRule.class, "SourceTypeRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(targetTypeRuleEClass, TargetTypeRule.class, "TargetTypeRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(commandNameRuleEClass, CommandNameRule.class, "CommandNameRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(shapeTypeRuleEClass, ShapeTypeRule.class, "ShapeTypeRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(parentTypeRuleEClass, ParentTypeRule.class, "ParentTypeRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(stepInRuleEClass, StepInRule.class, "StepInRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(trueRuleEClass, TrueRule.class, "TrueRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(falseRuleEClass, FalseRule.class, "FalseRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(shapeNameRuleEClass, ShapeNameRule.class, "ShapeNameRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(trueMappingRuleEClass, TrueMappingRule.class, "TrueMappingRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(relationIsCyclicRuleEClass, RelationIsCyclicRule.class, "RelationIsCyclicRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(relationIsReflexivRuleEClass, RelationIsReflexivRule.class, "RelationIsReflexivRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(relationTypesAreEqualRuleEClass, RelationTypesAreEqualRule.class, "RelationTypesAreEqualRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(typeExistsRuleEClass, TypeExistsRule.class, "TypeExistsRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //ModelPackageImpl
