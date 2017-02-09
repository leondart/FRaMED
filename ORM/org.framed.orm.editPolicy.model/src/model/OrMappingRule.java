/**
 */
package model;

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
 *   <li>{@link model.OrMappingRule#getRules <em>Rules</em>}</li>
 * </ul>
 *
 * @see model.ModelPackage#getOrMappingRule()
 * @model
 * @generated
 */
public interface OrMappingRule extends AbstractMappingRule {
	/**
	 * Returns the value of the '<em><b>Rules</b></em>' containment reference list.
	 * The list contents are of type {@link model.AbstractMappingRule}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rules</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rules</em>' containment reference list.
	 * @see model.ModelPackage#getOrMappingRule_Rules()
	 * @model containment="true" lower="2"
	 * @generated
	 */
	EList<AbstractMappingRule> getRules();

} // OrMappingRule
