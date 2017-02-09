/**
 */
package editPolicyEcore1.util;

import editPolicyEcore1.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see editPolicyEcore1.EditPolicyEcore1Package
 * @generated
 */
public class EditPolicyEcore1AdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static EditPolicyEcore1Package modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EditPolicyEcore1AdapterFactory() {
		if (modelPackage == null) {
			modelPackage = EditPolicyEcore1Package.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EditPolicyEcore1Switch<Adapter> modelSwitch =
		new EditPolicyEcore1Switch<Adapter>() {
			@Override
			public Adapter caseModel(Model object) {
				return createModelAdapter();
			}
			@Override
			public Adapter casePolicy(Policy object) {
				return createPolicyAdapter();
			}
			@Override
			public Adapter caseConfiguration(Configuration object) {
				return createConfigurationAdapter();
			}
			@Override
			public Adapter caseAbstractMappingRule(AbstractMappingRule object) {
				return createAbstractMappingRuleAdapter();
			}
			@Override
			public Adapter caseMapping(Mapping object) {
				return createMappingAdapter();
			}
			@Override
			public Adapter caseFeatureNameMappingRule(FeatureNameMappingRule object) {
				return createFeatureNameMappingRuleAdapter();
			}
			@Override
			public Adapter caseAndMappingRule(AndMappingRule object) {
				return createAndMappingRuleAdapter();
			}
			@Override
			public Adapter caseAbstractRule(AbstractRule object) {
				return createAbstractRuleAdapter();
			}
			@Override
			public Adapter caseAndRule(AndRule object) {
				return createAndRuleAdapter();
			}
			@Override
			public Adapter caseRelationNameRule(RelationNameRule object) {
				return createRelationNameRuleAdapter();
			}
			@Override
			public Adapter caseNotMappingRule(NotMappingRule object) {
				return createNotMappingRuleAdapter();
			}
			@Override
			public Adapter caseOrMappingRule(OrMappingRule object) {
				return createOrMappingRuleAdapter();
			}
			@Override
			public Adapter caseImplicationMappingRule(ImplicationMappingRule object) {
				return createImplicationMappingRuleAdapter();
			}
			@Override
			public Adapter caseOrRule(OrRule object) {
				return createOrRuleAdapter();
			}
			@Override
			public Adapter caseNotRule(NotRule object) {
				return createNotRuleAdapter();
			}
			@Override
			public Adapter caseImplicationRule(ImplicationRule object) {
				return createImplicationRuleAdapter();
			}
			@Override
			public Adapter caseAbstractNameRule(AbstractNameRule object) {
				return createAbstractNameRuleAdapter();
			}
			@Override
			public Adapter caseSourceTypeRule(SourceTypeRule object) {
				return createSourceTypeRuleAdapter();
			}
			@Override
			public Adapter caseTargetTypeRule(TargetTypeRule object) {
				return createTargetTypeRuleAdapter();
			}
			@Override
			public Adapter caseCommandNameRule(CommandNameRule object) {
				return createCommandNameRuleAdapter();
			}
			@Override
			public Adapter caseShapeTypeRule(ShapeTypeRule object) {
				return createShapeTypeRuleAdapter();
			}
			@Override
			public Adapter caseParentTypeRule(ParentTypeRule object) {
				return createParentTypeRuleAdapter();
			}
			@Override
			public Adapter caseStepInRule(StepInRule object) {
				return createStepInRuleAdapter();
			}
			@Override
			public Adapter caseTrueRule(TrueRule object) {
				return createTrueRuleAdapter();
			}
			@Override
			public Adapter caseFalseRule(FalseRule object) {
				return createFalseRuleAdapter();
			}
			@Override
			public Adapter caseShapeNameRule(ShapeNameRule object) {
				return createShapeNameRuleAdapter();
			}
			@Override
			public Adapter caseTrueMappingRule(TrueMappingRule object) {
				return createTrueMappingRuleAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link editPolicyEcore1.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see editPolicyEcore1.Model
	 * @generated
	 */
	public Adapter createModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link editPolicyEcore1.Policy <em>Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see editPolicyEcore1.Policy
	 * @generated
	 */
	public Adapter createPolicyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link editPolicyEcore1.Configuration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see editPolicyEcore1.Configuration
	 * @generated
	 */
	public Adapter createConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link editPolicyEcore1.AbstractMappingRule <em>Abstract Mapping Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see editPolicyEcore1.AbstractMappingRule
	 * @generated
	 */
	public Adapter createAbstractMappingRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link editPolicyEcore1.Mapping <em>Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see editPolicyEcore1.Mapping
	 * @generated
	 */
	public Adapter createMappingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link editPolicyEcore1.FeatureNameMappingRule <em>Feature Name Mapping Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see editPolicyEcore1.FeatureNameMappingRule
	 * @generated
	 */
	public Adapter createFeatureNameMappingRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link editPolicyEcore1.AndMappingRule <em>And Mapping Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see editPolicyEcore1.AndMappingRule
	 * @generated
	 */
	public Adapter createAndMappingRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link editPolicyEcore1.AbstractRule <em>Abstract Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see editPolicyEcore1.AbstractRule
	 * @generated
	 */
	public Adapter createAbstractRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link editPolicyEcore1.AndRule <em>And Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see editPolicyEcore1.AndRule
	 * @generated
	 */
	public Adapter createAndRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link editPolicyEcore1.RelationNameRule <em>Relation Name Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see editPolicyEcore1.RelationNameRule
	 * @generated
	 */
	public Adapter createRelationNameRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link editPolicyEcore1.NotMappingRule <em>Not Mapping Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see editPolicyEcore1.NotMappingRule
	 * @generated
	 */
	public Adapter createNotMappingRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link editPolicyEcore1.OrMappingRule <em>Or Mapping Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see editPolicyEcore1.OrMappingRule
	 * @generated
	 */
	public Adapter createOrMappingRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link editPolicyEcore1.ImplicationMappingRule <em>Implication Mapping Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see editPolicyEcore1.ImplicationMappingRule
	 * @generated
	 */
	public Adapter createImplicationMappingRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link editPolicyEcore1.OrRule <em>Or Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see editPolicyEcore1.OrRule
	 * @generated
	 */
	public Adapter createOrRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link editPolicyEcore1.NotRule <em>Not Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see editPolicyEcore1.NotRule
	 * @generated
	 */
	public Adapter createNotRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link editPolicyEcore1.ImplicationRule <em>Implication Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see editPolicyEcore1.ImplicationRule
	 * @generated
	 */
	public Adapter createImplicationRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link editPolicyEcore1.AbstractNameRule <em>Abstract Name Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see editPolicyEcore1.AbstractNameRule
	 * @generated
	 */
	public Adapter createAbstractNameRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link editPolicyEcore1.SourceTypeRule <em>Source Type Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see editPolicyEcore1.SourceTypeRule
	 * @generated
	 */
	public Adapter createSourceTypeRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link editPolicyEcore1.TargetTypeRule <em>Target Type Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see editPolicyEcore1.TargetTypeRule
	 * @generated
	 */
	public Adapter createTargetTypeRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link editPolicyEcore1.CommandNameRule <em>Command Name Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see editPolicyEcore1.CommandNameRule
	 * @generated
	 */
	public Adapter createCommandNameRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link editPolicyEcore1.ShapeTypeRule <em>Shape Type Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see editPolicyEcore1.ShapeTypeRule
	 * @generated
	 */
	public Adapter createShapeTypeRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link editPolicyEcore1.ParentTypeRule <em>Parent Type Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see editPolicyEcore1.ParentTypeRule
	 * @generated
	 */
	public Adapter createParentTypeRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link editPolicyEcore1.StepInRule <em>Step In Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see editPolicyEcore1.StepInRule
	 * @generated
	 */
	public Adapter createStepInRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link editPolicyEcore1.TrueRule <em>True Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see editPolicyEcore1.TrueRule
	 * @generated
	 */
	public Adapter createTrueRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link editPolicyEcore1.FalseRule <em>False Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see editPolicyEcore1.FalseRule
	 * @generated
	 */
	public Adapter createFalseRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link editPolicyEcore1.ShapeNameRule <em>Shape Name Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see editPolicyEcore1.ShapeNameRule
	 * @generated
	 */
	public Adapter createShapeNameRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link editPolicyEcore1.TrueMappingRule <em>True Mapping Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see editPolicyEcore1.TrueMappingRule
	 * @generated
	 */
	public Adapter createTrueMappingRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //EditPolicyEcore1AdapterFactory
