/**
 */
package editPolicyEcore1.impl;

import editPolicyEcore1.AbstractMappingRule;
import editPolicyEcore1.AbstractNameRule;
import editPolicyEcore1.AbstractRule;
import editPolicyEcore1.AndMappingRule;
import editPolicyEcore1.AndRule;
import editPolicyEcore1.CommandNameRule;
import editPolicyEcore1.Configuration;
import editPolicyEcore1.EditPolicyEcore1Factory;
import editPolicyEcore1.EditPolicyEcore1Package;
import editPolicyEcore1.FalseRule;
import editPolicyEcore1.FeatureNameMappingRule;
import editPolicyEcore1.ImplicationMappingRule;
import editPolicyEcore1.ImplicationRule;
import editPolicyEcore1.Mapping;
import editPolicyEcore1.Model;
import editPolicyEcore1.NotMappingRule;
import editPolicyEcore1.NotRule;
import editPolicyEcore1.OrMappingRule;
import editPolicyEcore1.OrRule;
import editPolicyEcore1.ParentTypeRule;
import editPolicyEcore1.Policy;
import editPolicyEcore1.RelationNameRule;

import editPolicyEcore1.ShapeNameRule;
import editPolicyEcore1.ShapeTypeRule;
import editPolicyEcore1.SourceTypeRule;
import editPolicyEcore1.StepInRule;
import editPolicyEcore1.TargetTypeRule;
import editPolicyEcore1.TrueRule;
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
public class EditPolicyEcore1PackageImpl extends EPackageImpl implements EditPolicyEcore1Package {
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
	private EClass relationNameRuleEClass = null;

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
	 * @see editPolicyEcore1.EditPolicyEcore1Package#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private EditPolicyEcore1PackageImpl() {
		super(eNS_URI, EditPolicyEcore1Factory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link EditPolicyEcore1Package#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static EditPolicyEcore1Package init() {
		if (isInited) return (EditPolicyEcore1Package)EPackage.Registry.INSTANCE.getEPackage(EditPolicyEcore1Package.eNS_URI);

		// Obtain or create and register package
		EditPolicyEcore1PackageImpl theEditPolicyEcore1Package = (EditPolicyEcore1PackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof EditPolicyEcore1PackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new EditPolicyEcore1PackageImpl());

		isInited = true;

		// Create package meta-data objects
		theEditPolicyEcore1Package.createPackageContents();

		// Initialize created meta-data
		theEditPolicyEcore1Package.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theEditPolicyEcore1Package.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(EditPolicyEcore1Package.eNS_URI, theEditPolicyEcore1Package);
		return theEditPolicyEcore1Package;
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
	public EReference getModel_Policies() {
		return (EReference)modelEClass.getEStructuralFeatures().get(1);
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
	public EAttribute getMapping_PolicyName() {
		return (EAttribute)mappingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMapping_Rule() {
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
	public EClass getRelationNameRule() {
		return relationNameRuleEClass;
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
	public EditPolicyEcore1Factory getEditPolicyEcore1Factory() {
		return (EditPolicyEcore1Factory)getEFactoryInstance();
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
		createEAttribute(mappingEClass, MAPPING__POLICY_NAME);
		createEReference(mappingEClass, MAPPING__RULE);

		featureNameMappingRuleEClass = createEClass(FEATURE_NAME_MAPPING_RULE);
		createEAttribute(featureNameMappingRuleEClass, FEATURE_NAME_MAPPING_RULE__NAME);

		andMappingRuleEClass = createEClass(AND_MAPPING_RULE);
		createEReference(andMappingRuleEClass, AND_MAPPING_RULE__RULES);

		abstractRuleEClass = createEClass(ABSTRACT_RULE);

		andRuleEClass = createEClass(AND_RULE);
		createEReference(andRuleEClass, AND_RULE__RULES);

		relationNameRuleEClass = createEClass(RELATION_NAME_RULE);

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
		relationNameRuleEClass.getESuperTypes().add(this.getAbstractNameRule());
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

		// Initialize classes and features; add operations and parameters
		initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModel_Configuration(), this.getConfiguration(), null, "configuration", null, 1, 1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModel_Policies(), this.getPolicy(), null, "policies", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(policyEClass, Policy.class, "Policy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPolicy_Name(), ecorePackage.getEString(), "name", null, 0, 1, Policy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPolicy_Rule(), this.getAbstractRule(), null, "rule", null, 0, 1, Policy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(configurationEClass, Configuration.class, "Configuration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConfiguration_Mappings(), this.getMapping(), null, "mappings", null, 0, -1, Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractMappingRuleEClass, AbstractMappingRule.class, "AbstractMappingRule", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mappingEClass, Mapping.class, "Mapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMapping_PolicyName(), ecorePackage.getEString(), "policyName", null, 0, 1, Mapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMapping_Rule(), this.getAbstractMappingRule(), null, "rule", null, 1, 1, Mapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(featureNameMappingRuleEClass, FeatureNameMappingRule.class, "FeatureNameMappingRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFeatureNameMappingRule_Name(), ecorePackage.getEString(), "name", null, 0, 1, FeatureNameMappingRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(andMappingRuleEClass, AndMappingRule.class, "AndMappingRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAndMappingRule_Rules(), this.getAbstractMappingRule(), null, "rules", null, 2, -1, AndMappingRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractRuleEClass, AbstractRule.class, "AbstractRule", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(andRuleEClass, AndRule.class, "AndRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAndRule_Rules(), this.getAbstractRule(), null, "rules", null, 2, -1, AndRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relationNameRuleEClass, RelationNameRule.class, "RelationNameRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

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

		// Create resource
		createResource(eNS_URI);
	}

} //EditPolicyEcore1PackageImpl
