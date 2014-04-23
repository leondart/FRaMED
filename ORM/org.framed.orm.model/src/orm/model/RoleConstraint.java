/**
 */
package orm.model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Role Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link orm.model.RoleConstraint#getEnds <em>Ends</em>}</li>
 *   <li>{@link orm.model.RoleConstraint#getSecond <em>Second</em>}</li>
 *   <li>{@link orm.model.RoleConstraint#getFirst <em>First</em>}</li>
 * </ul>
 * </p>
 *
 * @see orm.model.OrmPackage#getRoleConstraint()
 * @model abstract="true"
 * @generated
 */
public interface RoleConstraint extends Constraint {
	/**
	 * Returns the value of the '<em><b>Ends</b></em>' reference list.
	 * The list contents are of type {@link orm.model.RoleType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ends</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ends</em>' reference list.
	 * @see orm.model.OrmPackage#getRoleConstraint_Ends()
	 * @model lower="2" upper="2"
	 * @generated
	 */
	EList<RoleType> getEnds();

	/**
	 * Returns the value of the '<em><b>Second</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Second</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Second</em>' reference.
	 * @see #setSecond(AbstractRole)
	 * @see orm.model.OrmPackage#getRoleConstraint_Second()
	 * @model required="true"
	 * @generated
	 */
	AbstractRole getSecond();

	/**
	 * Sets the value of the '{@link orm.model.RoleConstraint#getSecond <em>Second</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Second</em>' reference.
	 * @see #getSecond()
	 * @generated
	 */
	void setSecond(AbstractRole value);

	/**
	 * Returns the value of the '<em><b>First</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>First</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First</em>' reference.
	 * @see #setFirst(AbstractRole)
	 * @see orm.model.OrmPackage#getRoleConstraint_First()
	 * @model required="true"
	 * @generated
	 */
	AbstractRole getFirst();

	/**
	 * Sets the value of the '{@link orm.model.RoleConstraint#getFirst <em>First</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First</em>' reference.
	 * @see #getFirst()
	 * @generated
	 */
	void setFirst(AbstractRole value);

} // RoleConstraint
