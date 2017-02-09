/**
 */
package editPolicyEcore1;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Implication Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link editPolicyEcore1.ImplicationRule#getAntecedent <em>Antecedent</em>}</li>
 *   <li>{@link editPolicyEcore1.ImplicationRule#getConsequent <em>Consequent</em>}</li>
 * </ul>
 *
 * @see editPolicyEcore1.EditPolicyEcore1Package#getImplicationRule()
 * @model
 * @generated
 */
public interface ImplicationRule extends AbstractRule {
	/**
	 * Returns the value of the '<em><b>Antecedent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Antecedent</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Antecedent</em>' containment reference.
	 * @see #setAntecedent(AbstractRule)
	 * @see editPolicyEcore1.EditPolicyEcore1Package#getImplicationRule_Antecedent()
	 * @model containment="true" required="true"
	 * @generated
	 */
	AbstractRule getAntecedent();

	/**
	 * Sets the value of the '{@link editPolicyEcore1.ImplicationRule#getAntecedent <em>Antecedent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Antecedent</em>' containment reference.
	 * @see #getAntecedent()
	 * @generated
	 */
	void setAntecedent(AbstractRule value);

	/**
	 * Returns the value of the '<em><b>Consequent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Consequent</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Consequent</em>' containment reference.
	 * @see #setConsequent(AbstractRule)
	 * @see editPolicyEcore1.EditPolicyEcore1Package#getImplicationRule_Consequent()
	 * @model containment="true" required="true"
	 * @generated
	 */
	AbstractRule getConsequent();

	/**
	 * Sets the value of the '{@link editPolicyEcore1.ImplicationRule#getConsequent <em>Consequent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Consequent</em>' containment reference.
	 * @see #getConsequent()
	 * @generated
	 */
	void setConsequent(AbstractRule value);

} // ImplicationRule
