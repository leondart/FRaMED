/**
 */
package editPolicyEcore1;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Policy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link editPolicyEcore1.Policy#getName <em>Name</em>}</li>
 *   <li>{@link editPolicyEcore1.Policy#getRule <em>Rule</em>}</li>
 * </ul>
 *
 * @see editPolicyEcore1.EditPolicyEcore1Package#getPolicy()
 * @model
 * @generated
 */
public interface Policy extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see editPolicyEcore1.EditPolicyEcore1Package#getPolicy_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link editPolicyEcore1.Policy#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Rule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rule</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule</em>' containment reference.
	 * @see #setRule(AbstractRule)
	 * @see editPolicyEcore1.EditPolicyEcore1Package#getPolicy_Rule()
	 * @model containment="true"
	 * @generated
	 */
	AbstractRule getRule();

	/**
	 * Sets the value of the '{@link editPolicyEcore1.Policy#getRule <em>Rule</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rule</em>' containment reference.
	 * @see #getRule()
	 * @generated
	 */
	void setRule(AbstractRule value);

} // Policy
