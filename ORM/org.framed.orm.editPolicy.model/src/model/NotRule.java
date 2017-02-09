/**
 */
package model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Not Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link model.NotRule#getRule <em>Rule</em>}</li>
 * </ul>
 *
 * @see model.ModelPackage#getNotRule()
 * @model
 * @generated
 */
public interface NotRule extends AbstractRule {
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
	 * @see model.ModelPackage#getNotRule_Rule()
	 * @model containment="true" required="true"
	 * @generated
	 */
	AbstractRule getRule();

	/**
	 * Sets the value of the '{@link model.NotRule#getRule <em>Rule</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rule</em>' containment reference.
	 * @see #getRule()
	 * @generated
	 */
	void setRule(AbstractRule value);

} // NotRule
