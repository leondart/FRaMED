/**
 */
package org.framed.orm.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Role Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.framed.orm.model.RoleGroup#getLower <em>Lower</em>}</li>
 *   <li>{@link org.framed.orm.model.RoleGroup#getUpper <em>Upper</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.framed.orm.model.OrmPackage#getRoleGroup()
 * @model
 * @generated
 */
public interface RoleGroup extends AbstractRole, RelationTarget, AbstractRoleModel {
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
   * @see org.framed.orm.model.OrmPackage#getRoleGroup_Lower()
   * @model default="0" required="true"
   * @generated
   */
  int getLower();

  /**
   * Sets the value of the '{@link org.framed.orm.model.RoleGroup#getLower <em>Lower</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Lower</em>' attribute.
   * @see #getLower()
   * @generated
   */
  void setLower(int value);

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
   * @see org.framed.orm.model.OrmPackage#getRoleGroup_Upper()
   * @model default="-1" required="true"
   * @generated
   */
  int getUpper();

  /**
   * Sets the value of the '{@link org.framed.orm.model.RoleGroup#getUpper <em>Upper</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Upper</em>' attribute.
   * @see #getUpper()
   * @generated
   */
  void setUpper(int value);

} // RoleGroup
