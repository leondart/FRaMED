/**
 */
package editPolicyEcore1;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link editPolicyEcore1.Model#getConfiguration <em>Configuration</em>}</li>
 *   <li>{@link editPolicyEcore1.Model#getPolicies <em>Policies</em>}</li>
 * </ul>
 *
 * @see editPolicyEcore1.EditPolicyEcore1Package#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject {
	/**
	 * Returns the value of the '<em><b>Policies</b></em>' containment reference list.
	 * The list contents are of type {@link editPolicyEcore1.Policy}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Policies</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Policies</em>' containment reference list.
	 * @see editPolicyEcore1.EditPolicyEcore1Package#getModel_Policies()
	 * @model containment="true"
	 * @generated
	 */
	EList<Policy> getPolicies();

	/**
	 * Returns the value of the '<em><b>Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Configuration</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configuration</em>' containment reference.
	 * @see #setConfiguration(Configuration)
	 * @see editPolicyEcore1.EditPolicyEcore1Package#getModel_Configuration()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Configuration getConfiguration();

	/**
	 * Sets the value of the '{@link editPolicyEcore1.Model#getConfiguration <em>Configuration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Configuration</em>' containment reference.
	 * @see #getConfiguration()
	 * @generated
	 */
	void setConfiguration(Configuration value);

} // Model
