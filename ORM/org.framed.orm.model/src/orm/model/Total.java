/**
 */
package orm.model;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Total</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link orm.model.Total#getGroups <em>Groups</em>}</li>
 * </ul>
 * </p>
 *
 * @see orm.model.OrmPackage#getTotal()
 * @model
 * @generated
 */
public interface Total extends RelationshipConstraint {

	/**
	 * Returns the value of the '<em><b>Groups</b></em>' containment reference list.
	 * The list contents are of type {@link orm.model.Grouping}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Groups</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Groups</em>' containment reference list.
	 * @see orm.model.OrmPackage#getTotal_Groups()
	 * @model containment="true"
	 * @generated
	 */
	EList<Grouping> getGroups();
} // Total
