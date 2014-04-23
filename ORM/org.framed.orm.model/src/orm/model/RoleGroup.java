/**
 */
package orm.model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Role Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link orm.model.RoleGroup#getLower <em>Lower</em>}</li>
 *   <li>{@link orm.model.RoleGroup#getItems <em>Items</em>}</li>
 *   <li>{@link orm.model.RoleGroup#getUpper <em>Upper</em>}</li>
 * </ul>
 * </p>
 *
 * @see orm.model.OrmPackage#getRoleGroup()
 * @model
 * @generated
 */
public interface RoleGroup extends AbstractRole, Node, RelationContainer {
	/**
	 * Returns the value of the '<em><b>Lower</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lower</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lower</em>' attribute.
	 * @see #setLower(int)
	 * @see orm.model.OrmPackage#getRoleGroup_Lower()
	 * @model default="0" required="true"
	 * @generated
	 */
	int getLower();

	/**
	 * Sets the value of the '{@link orm.model.RoleGroup#getLower <em>Lower</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lower</em>' attribute.
	 * @see #getLower()
	 * @generated
	 */
	void setLower(int value);

	/**
	 * Returns the value of the '<em><b>Items</b></em>' containment reference list.
	 * The list contents are of type {@link orm.model.AbstractRole}.
	 * It is bidirectional and its opposite is '{@link orm.model.AbstractRole#getParentRoleGroup <em>Parent Role Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Items</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Items</em>' containment reference list.
	 * @see orm.model.OrmPackage#getRoleGroup_Items()
	 * @see orm.model.AbstractRole#getParentRoleGroup
	 * @model opposite="parentRoleGroup" containment="true"
	 * @generated
	 */
	EList<AbstractRole> getItems();

	/**
	 * Returns the value of the '<em><b>Upper</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Upper</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upper</em>' attribute.
	 * @see #setUpper(int)
	 * @see orm.model.OrmPackage#getRoleGroup_Upper()
	 * @model default="-1" required="true"
	 * @generated
	 */
	int getUpper();

	/**
	 * Sets the value of the '{@link orm.model.RoleGroup#getUpper <em>Upper</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upper</em>' attribute.
	 * @see #getUpper()
	 * @generated
	 */
	void setUpper(int value);

} // RoleGroup
