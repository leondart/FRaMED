/**
 */
package model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Not Mapping Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link model.NotMappingRule#getRule <em>Rule</em>}</li>
 * </ul>
 *
 * @see model.ModelPackage#getNotMappingRule()
 * @model
 * @generated
 */
public interface NotMappingRule extends AbstractMappingRule {
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
	 * @see model.ModelPackage#getNotMappingRule_Rule()
	 * @model containment="true" required="true"
	 * @generated
	 */
	AbstractMappingRule getRule();

	/**
	 * Sets the value of the '{@link model.NotMappingRule#getRule <em>Rule</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rule</em>' containment reference.
	 * @see #getRule()
	 * @generated
	 */
	void setRule(AbstractMappingRule value);

} // NotMappingRule
