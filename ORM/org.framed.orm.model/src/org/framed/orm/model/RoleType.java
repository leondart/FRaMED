/**
 */
package org.framed.orm.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Role Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.framed.orm.model.RoleType#getTr_extends <em>Tr extends</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.framed.orm.model.OrmPackage#getRoleType()
 * @model
 * @generated
 */
public interface RoleType extends AbstractRole, AntiRigidType {
  /**
   * Returns the value of the '<em><b>Tr extends</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tr extends</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tr extends</em>' reference.
   * @see #setTr_extends(RoleType)
   * @see org.framed.orm.model.OrmPackage#getRoleType_Tr_extends()
   * @model
   * @generated
   */
  RoleType getTr_extends();

  /**
   * Sets the value of the '{@link org.framed.orm.model.RoleType#getTr_extends <em>Tr extends</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Tr extends</em>' reference.
   * @see #getTr_extends()
   * @generated
   */
  void setTr_extends(RoleType value);

} // RoleType
