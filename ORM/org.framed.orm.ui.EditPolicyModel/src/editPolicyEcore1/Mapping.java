/**
 */
package editPolicyEcore1;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link editPolicyEcore1.Mapping#getRule <em>Rule</em>}</li>
 *   <li>{@link editPolicyEcore1.Mapping#getPolicy <em>Policy</em>}</li>
 * </ul>
 *
 * @see editPolicyEcore1.EditPolicyEcore1Package#getMapping()
 * @model
 * @generated
 */
public interface Mapping extends EObject {
	/**
	 * Returns the value of the '<em><b>Rule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rule</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule</em>' containment reference.
	 * @see #setRule(AbstractMappingRule)
	 * @see editPolicyEcore1.EditPolicyEcore1Package#getMapping_Rule()
	 * @model containment="true" required="true"
	 * @generated
	 */
	AbstractMappingRule getRule();

	/**
	 * Sets the value of the '{@link editPolicyEcore1.Mapping#getRule <em>Rule</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rule</em>' containment reference.
	 * @see #getRule()
	 * @generated
	 */
	void setRule(AbstractMappingRule value);

	/**
	 * Returns the value of the '<em><b>Policy</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Policy</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Policy</em>' reference.
	 * @see #setPolicy(Policy)
	 * @see editPolicyEcore1.EditPolicyEcore1Package#getMapping_Policy()
	 * @model required="true"
	 * @generated
	 */
	Policy getPolicy();

	/**
	 * Sets the value of the '{@link editPolicyEcore1.Mapping#getPolicy <em>Policy</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Policy</em>' reference.
	 * @see #getPolicy()
	 * @generated
	 */
	void setPolicy(Policy value);

} // Mapping
