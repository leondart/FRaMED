/**
 */
package org.framed.orm.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Role</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.framed.orm.model.AbstractRole#getFulfillment <em>Fulfillment</em>}</li>
 *   <li>{@link org.framed.orm.model.AbstractRole#getParent <em>Parent</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.framed.orm.model.OrmPackage#getAbstractRole()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface AbstractRole extends RoleGroupElement {
  /**
   * Returns the value of the '<em><b>Fulfillment</b></em>' reference.
   * It is bidirectional and its opposite is '{@link org.framed.orm.model.Fulfillment#getFulfilledRoles <em>Fulfilled Roles</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fulfillment</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fulfillment</em>' reference.
   * @see #setFulfillment(Fulfillment)
   * @see org.framed.orm.model.OrmPackage#getAbstractRole_Fulfillment()
   * @see org.framed.orm.model.Fulfillment#getFulfilledRoles
   * @model opposite="fulfilledRoles" required="true"
   * @generated
   */
  Fulfillment getFulfillment();

  /**
   * Sets the value of the '{@link org.framed.orm.model.AbstractRole#getFulfillment <em>Fulfillment</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fulfillment</em>' reference.
   * @see #getFulfillment()
   * @generated
   */
  void setFulfillment(Fulfillment value);

  /**
   * Returns the value of the '<em><b>Parent</b></em>' container reference.
   * It is bidirectional and its opposite is '{@link org.framed.orm.model.AbstractRoleModel#getAbstractroles <em>Abstractroles</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parent</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parent</em>' container reference.
   * @see #setParent(AbstractRoleModel)
   * @see org.framed.orm.model.OrmPackage#getAbstractRole_Parent()
   * @see org.framed.orm.model.AbstractRoleModel#getAbstractroles
   * @model opposite="abstractroles" required="true" transient="false"
   * @generated
   */
  AbstractRoleModel getParent();

  /**
   * Sets the value of the '{@link org.framed.orm.model.AbstractRole#getParent <em>Parent</em>}' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parent</em>' container reference.
   * @see #getParent()
   * @generated
   */
  void setParent(AbstractRoleModel value);

} // AbstractRole
