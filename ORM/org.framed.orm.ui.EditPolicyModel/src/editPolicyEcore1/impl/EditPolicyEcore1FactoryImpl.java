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
