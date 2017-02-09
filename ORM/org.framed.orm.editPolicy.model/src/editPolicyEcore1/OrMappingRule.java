/**
 */
package editPolicyEcore1;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Or Mapping Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link editPolicyEcore1.OrMappingRule#getRules <em>Rules</em>}</li>
 * </ul>
 *
 * @see editPolicyEcore1.EditPolicyEcore1Package#getOrMappingRule()
 * @model
 * @generated
 */
public interface OrMappingRule extends AbstractMappingRule {
	/**
	 * Returns the value of the '<em><b>Rules</b></em>' containment reference list.
	 * The list contents are of type {@link editPolicyEcore1.AbstractMappingRule}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rules</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rules</em>' containment reference list.
	 * @see editPolicyEcore1.EditPolicyEcore1Package#getOrMappingRule_Rules()
	 * @model containment="true" lower="2"
	 * @generated
	 */
	EList<AbstractMappingRule> getRules();

} // OrMappingRule
