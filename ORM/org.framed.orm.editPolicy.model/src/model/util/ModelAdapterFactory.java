/**
 */
package model.util;

import model.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see model.ModelPackage
 * @generated
 */
public class ModelAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ModelPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ModelPackage.eINSTANCE;
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
	protected ModelSwitch<Adapter> modelSwitch =
		new ModelSwitch<Adapter>() {
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
			public Adapter caseRelationTypeRule(RelationTypeRule object) {
				return createRelationTypeRuleAdapter();
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
			public Adapter caseRelationIsCyclicRule(RelationIsCyclicRule object) {
				return createRelationIsCyclicRuleAdapter();
			}
			@Override
			public Adapter caseRelationIsReflexivRule(RelationIsReflexivRule object) {
				return createRelationIsReflexivRuleAdapter();
			}
			@Override
			public Adapter caseRelationTypesAreEqualRule(RelationTypesAreEqualRule object) {
				return createRelationTypesAreEqualRuleAdapter();
			}
			@Override
			public Adapter caseTypeExistsRule(TypeExistsRule object) {
				return createTypeExistsRuleAdapter();
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
	 * Creates a new adapter for an object of class '{@link model.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.Model
	 * @generated
	 */
	public Adapter createModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.Policy <em>Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.Policy
	 * @generated
	 */
	public Adapter createPolicyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.Configuration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.Configuration
	 * @generated
	 */
	public Adapter createConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.AbstractMappingRule <em>Abstract Mapping Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.AbstractMappingRule
	 * @generated
	 */
	public Adapter createAbstractMappingRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.Mapping <em>Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.Mapping
	 * @generated
	 */
	public Adapter createMappingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.FeatureNameMappingRule <em>Feature Name Mapping Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.FeatureNameMappingRule
	 * @generated
	 */
	public Adapter createFeatureNameMappingRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.AndMappingRule <em>And Mapping Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.AndMappingRule
	 * @generated
	 */
	public Adapter createAndMappingRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.AbstractRule <em>Abstract Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.AbstractRule
	 * @generated
	 */
	public Adapter createAbstractRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.AndRule <em>And Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.AndRule
	 * @generated
	 */
	public Adapter createAndRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.RelationTypeRule <em>Relation Type Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.RelationTypeRule
	 * @generated
	 */
	public Adapter createRelationTypeRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.NotMappingRule <em>Not Mapping Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.NotMappingRule
	 * @generated
	 */
	public Adapter createNotMappingRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.OrMappingRule <em>Or Mapping Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.OrMappingRule
	 * @generated
	 */
	public Adapter createOrMappingRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.ImplicationMappingRule <em>Implication Mapping Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.ImplicationMappingRule
	 * @generated
	 */
	public Adapter createImplicationMappingRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.OrRule <em>Or Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.OrRule
	 * @generated
	 */
	public Adapter createOrRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.NotRule <em>Not Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.NotRule
	 * @generated
	 */
	public Adapter createNotRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.ImplicationRule <em>Implication Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.ImplicationRule
	 * @generated
	 */
	public Adapter createImplicationRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.AbstractNameRule <em>Abstract Name Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.AbstractNameRule
	 * @generated
	 */
	public Adapter createAbstractNameRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.SourceTypeRule <em>Source Type Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.SourceTypeRule
	 * @generated
	 */
	public Adapter createSourceTypeRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.TargetTypeRule <em>Target Type Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.TargetTypeRule
	 * @generated
	 */
	public Adapter createTargetTypeRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.CommandNameRule <em>Command Name Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.CommandNameRule
	 * @generated
	 */
	public Adapter createCommandNameRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.ShapeTypeRule <em>Shape Type Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.ShapeTypeRule
	 * @generated
	 */
	public Adapter createShapeTypeRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.ParentTypeRule <em>Parent Type Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.ParentTypeRule
	 * @generated
	 */
	public Adapter createParentTypeRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.StepInRule <em>Step In Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.StepInRule
	 * @generated
	 */
	public Adapter createStepInRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.TrueRule <em>True Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.TrueRule
	 * @generated
	 */
	public Adapter createTrueRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.FalseRule <em>False Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.FalseRule
	 * @generated
	 */
	public Adapter createFalseRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.ShapeNameRule <em>Shape Name Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.ShapeNameRule
	 * @generated
	 */
	public Adapter createShapeNameRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.TrueMappingRule <em>True Mapping Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.TrueMappingRule
	 * @generated
	 */
	public Adapter createTrueMappingRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.RelationIsCyclicRule <em>Relation Is Cyclic Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.RelationIsCyclicRule
	 * @generated
	 */
	public Adapter createRelationIsCyclicRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.RelationIsReflexivRule <em>Relation Is Reflexiv Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.RelationIsReflexivRule
	 * @generated
	 */
	public Adapter createRelationIsReflexivRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.RelationTypesAreEqualRule <em>Relation Types Are Equal Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.RelationTypesAreEqualRule
	 * @generated
	 */
	public Adapter createRelationTypesAreEqualRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.TypeExistsRule <em>Type Exists Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.TypeExistsRule
	 * @generated
	 */
	public Adapter createTypeExistsRuleAdapter() {
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

} //ModelAdapterFactory
