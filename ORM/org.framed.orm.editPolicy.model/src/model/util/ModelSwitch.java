/**
 */
package model.util;

import model.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see model.ModelPackage
 * @generated
 */
public class ModelSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ModelPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelSwitch() {
		if (modelPackage == null) {
			modelPackage = ModelPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ModelPackage.MODEL: {
				Model model = (Model)theEObject;
				T result = caseModel(model);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.POLICY: {
				Policy policy = (Policy)theEObject;
				T result = casePolicy(policy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.CONFIGURATION: {
				Configuration configuration = (Configuration)theEObject;
				T result = caseConfiguration(configuration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.ABSTRACT_MAPPING_RULE: {
				AbstractMappingRule abstractMappingRule = (AbstractMappingRule)theEObject;
				T result = caseAbstractMappingRule(abstractMappingRule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.MAPPING: {
				Mapping mapping = (Mapping)theEObject;
				T result = caseMapping(mapping);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.FEATURE_NAME_MAPPING_RULE: {
				FeatureNameMappingRule featureNameMappingRule = (FeatureNameMappingRule)theEObject;
				T result = caseFeatureNameMappingRule(featureNameMappingRule);
				if (result == null) result = caseAbstractMappingRule(featureNameMappingRule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.AND_MAPPING_RULE: {
				AndMappingRule andMappingRule = (AndMappingRule)theEObject;
				T result = caseAndMappingRule(andMappingRule);
				if (result == null) result = caseAbstractMappingRule(andMappingRule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.ABSTRACT_RULE: {
				AbstractRule abstractRule = (AbstractRule)theEObject;
				T result = caseAbstractRule(abstractRule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.AND_RULE: {
				AndRule andRule = (AndRule)theEObject;
				T result = caseAndRule(andRule);
				if (result == null) result = caseAbstractRule(andRule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.RELATION_TYPE_RULE: {
				RelationTypeRule relationTypeRule = (RelationTypeRule)theEObject;
				T result = caseRelationTypeRule(relationTypeRule);
				if (result == null) result = caseAbstractNameRule(relationTypeRule);
				if (result == null) result = caseAbstractRule(relationTypeRule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.NOT_MAPPING_RULE: {
				NotMappingRule notMappingRule = (NotMappingRule)theEObject;
				T result = caseNotMappingRule(notMappingRule);
				if (result == null) result = caseAbstractMappingRule(notMappingRule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.OR_MAPPING_RULE: {
				OrMappingRule orMappingRule = (OrMappingRule)theEObject;
				T result = caseOrMappingRule(orMappingRule);
				if (result == null) result = caseAbstractMappingRule(orMappingRule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.IMPLICATION_MAPPING_RULE: {
				ImplicationMappingRule implicationMappingRule = (ImplicationMappingRule)theEObject;
				T result = caseImplicationMappingRule(implicationMappingRule);
				if (result == null) result = caseAbstractMappingRule(implicationMappingRule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.OR_RULE: {
				OrRule orRule = (OrRule)theEObject;
				T result = caseOrRule(orRule);
				if (result == null) result = caseAbstractRule(orRule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.NOT_RULE: {
				NotRule notRule = (NotRule)theEObject;
				T result = caseNotRule(notRule);
				if (result == null) result = caseAbstractRule(notRule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.IMPLICATION_RULE: {
				ImplicationRule implicationRule = (ImplicationRule)theEObject;
				T result = caseImplicationRule(implicationRule);
				if (result == null) result = caseAbstractRule(implicationRule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.ABSTRACT_NAME_RULE: {
				AbstractNameRule abstractNameRule = (AbstractNameRule)theEObject;
				T result = caseAbstractNameRule(abstractNameRule);
				if (result == null) result = caseAbstractRule(abstractNameRule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.SOURCE_TYPE_RULE: {
				SourceTypeRule sourceTypeRule = (SourceTypeRule)theEObject;
				T result = caseSourceTypeRule(sourceTypeRule);
				if (result == null) result = caseAbstractNameRule(sourceTypeRule);
				if (result == null) result = caseAbstractRule(sourceTypeRule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.TARGET_TYPE_RULE: {
				TargetTypeRule targetTypeRule = (TargetTypeRule)theEObject;
				T result = caseTargetTypeRule(targetTypeRule);
				if (result == null) result = caseAbstractNameRule(targetTypeRule);
				if (result == null) result = caseAbstractRule(targetTypeRule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.COMMAND_NAME_RULE: {
				CommandNameRule commandNameRule = (CommandNameRule)theEObject;
				T result = caseCommandNameRule(commandNameRule);
				if (result == null) result = caseAbstractNameRule(commandNameRule);
				if (result == null) result = caseAbstractRule(commandNameRule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.SHAPE_TYPE_RULE: {
				ShapeTypeRule shapeTypeRule = (ShapeTypeRule)theEObject;
				T result = caseShapeTypeRule(shapeTypeRule);
				if (result == null) result = caseAbstractNameRule(shapeTypeRule);
				if (result == null) result = caseAbstractRule(shapeTypeRule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.PARENT_TYPE_RULE: {
				ParentTypeRule parentTypeRule = (ParentTypeRule)theEObject;
				T result = caseParentTypeRule(parentTypeRule);
				if (result == null) result = caseAbstractNameRule(parentTypeRule);
				if (result == null) result = caseAbstractRule(parentTypeRule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.STEP_IN_RULE: {
				StepInRule stepInRule = (StepInRule)theEObject;
				T result = caseStepInRule(stepInRule);
				if (result == null) result = caseAbstractRule(stepInRule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.TRUE_RULE: {
				TrueRule trueRule = (TrueRule)theEObject;
				T result = caseTrueRule(trueRule);
				if (result == null) result = caseAbstractRule(trueRule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.FALSE_RULE: {
				FalseRule falseRule = (FalseRule)theEObject;
				T result = caseFalseRule(falseRule);
				if (result == null) result = caseAbstractRule(falseRule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.SHAPE_NAME_RULE: {
				ShapeNameRule shapeNameRule = (ShapeNameRule)theEObject;
				T result = caseShapeNameRule(shapeNameRule);
				if (result == null) result = caseAbstractNameRule(shapeNameRule);
				if (result == null) result = caseAbstractRule(shapeNameRule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.TRUE_MAPPING_RULE: {
				TrueMappingRule trueMappingRule = (TrueMappingRule)theEObject;
				T result = caseTrueMappingRule(trueMappingRule);
				if (result == null) result = caseAbstractMappingRule(trueMappingRule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.RELATION_IS_CYCLIC_RULE: {
				RelationIsCyclicRule relationIsCyclicRule = (RelationIsCyclicRule)theEObject;
				T result = caseRelationIsCyclicRule(relationIsCyclicRule);
				if (result == null) result = caseAbstractRule(relationIsCyclicRule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.RELATION_IS_REFLEXIV_RULE: {
				RelationIsReflexivRule relationIsReflexivRule = (RelationIsReflexivRule)theEObject;
				T result = caseRelationIsReflexivRule(relationIsReflexivRule);
				if (result == null) result = caseAbstractRule(relationIsReflexivRule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.RELATION_TYPES_ARE_EQUAL_RULE: {
				RelationTypesAreEqualRule relationTypesAreEqualRule = (RelationTypesAreEqualRule)theEObject;
				T result = caseRelationTypesAreEqualRule(relationTypesAreEqualRule);
				if (result == null) result = caseAbstractRule(relationTypesAreEqualRule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.TYPE_EXISTS_RULE: {
				TypeExistsRule typeExistsRule = (TypeExistsRule)theEObject;
				T result = caseTypeExistsRule(typeExistsRule);
				if (result == null) result = caseAbstractNameRule(typeExistsRule);
				if (result == null) result = caseAbstractRule(typeExistsRule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModel(Model object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Policy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Policy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePolicy(Policy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConfiguration(Configuration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Mapping Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Mapping Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractMappingRule(AbstractMappingRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mapping</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMapping(Mapping object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature Name Mapping Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature Name Mapping Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeatureNameMappingRule(FeatureNameMappingRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>And Mapping Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>And Mapping Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAndMappingRule(AndMappingRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractRule(AbstractRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>And Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>And Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAndRule(AndRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relation Type Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relation Type Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelationTypeRule(RelationTypeRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Not Mapping Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Not Mapping Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNotMappingRule(NotMappingRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Or Mapping Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Or Mapping Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrMappingRule(OrMappingRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Implication Mapping Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Implication Mapping Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImplicationMappingRule(ImplicationMappingRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Or Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Or Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrRule(OrRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Not Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Not Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNotRule(NotRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Implication Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Implication Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImplicationRule(ImplicationRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Name Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Name Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractNameRule(AbstractNameRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Source Type Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Source Type Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSourceTypeRule(SourceTypeRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Target Type Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Target Type Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTargetTypeRule(TargetTypeRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Command Name Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Command Name Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommandNameRule(CommandNameRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Shape Type Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Shape Type Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseShapeTypeRule(ShapeTypeRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parent Type Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parent Type Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParentTypeRule(ParentTypeRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Step In Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Step In Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStepInRule(StepInRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>True Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>True Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrueRule(TrueRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>False Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>False Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFalseRule(FalseRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Shape Name Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Shape Name Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseShapeNameRule(ShapeNameRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>True Mapping Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>True Mapping Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrueMappingRule(TrueMappingRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relation Is Cyclic Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relation Is Cyclic Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelationIsCyclicRule(RelationIsCyclicRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relation Is Reflexiv Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relation Is Reflexiv Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelationIsReflexivRule(RelationIsReflexivRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relation Types Are Equal Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relation Types Are Equal Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelationTypesAreEqualRule(RelationTypesAreEqualRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Exists Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Exists Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeExistsRule(TypeExistsRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //ModelSwitch
