/**
 */
package model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Implication Mapping Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link model.ImplicationMappingRule#getAntecedent <em>Antecedent</em>}</li>
 *   <li>{@link model.ImplicationMappingRule#getConsequent <em>Consequent</em>}</li>
 * </ul>
 *
 * @see model.ModelPackage#getImplicationMappingRule()
 * @model
 * @generated
 */
public interface ImplicationMappingRule extends AbstractMappingRule {
	/**
	 * Returns the value of the '<em><b>Antecedent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Antecedent</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Antecedent</em>' containment reference.
	 * @see #setAntecedent(AbstractMappingRule)
	 * @see model.ModelPackage#getImplicationMappingRule_Antecedent()
	 * @model containment="true" required="true"
	 * @generated
	 */
	AbstractMappingRule getAntecedent();

	/**
	 * Sets the value of the '{@link model.ImplicationMappingRule#getAntecedent <em>Antecedent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Antecedent</em>' containment reference.
	 * @see #getAntecedent()
	 * @generated
	 */
	void setAntecedent(AbstractMappingRule value);

	/**
	 * Returns the value of the '<em><b>Consequent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Consequent</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Consequent</em>' containment reference.
	 * @see #setConsequent(AbstractMappingRule)
	 * @see model.ModelPackage#getImplicationMappingRule_Consequent()
	 * @model containment="true" required="true"
	 * @generated
	 */
	AbstractMappingRule getConsequent();

	/**
	 * Sets the value of the '{@link model.ImplicationMappingRule#getConsequent <em>Consequent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Consequent</em>' containment reference.
	 * @see #getConsequent()
	 * @generated
	 */
	void setConsequent(AbstractMappingRule value);

} // ImplicationMappingRule
