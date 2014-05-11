/**
 */
package org.framed.orm.model;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fulfilment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.framed.orm.model.Fulfilment#getFufilledRole <em>Fufilled Role</em>}</li>
 *   <li>{@link org.framed.orm.model.Fulfilment#getFulfilledRoles <em>Fulfilled Roles</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.framed.orm.model.OrmPackage#getFulfilment()
 * @model
 * @generated
 */
public interface Fulfilment extends Relation {
  /**
   * Returns the value of the '<em><b>Fufilled Role</b></em>' attribute.
   * The default value is <code>"<...>"</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fufilled Role</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fufilled Role</em>' attribute.
   * @see #setFufilledRole(String)
   * @see org.framed.orm.model.OrmPackage#getFulfilment_FufilledRole()
   * @model default="<...>"
   * @generated
   */
  String getFufilledRole();

  /**
   * Sets the value of the '{@link org.framed.orm.model.Fulfilment#getFufilledRole <em>Fufilled Role</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fufilled Role</em>' attribute.
   * @see #getFufilledRole()
   * @generated
   */
  void setFufilledRole(String value);

  /**
   * Returns the value of the '<em><b>Fulfilled Roles</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fulfilled Roles</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fulfilled Roles</em>' attribute list.
   * @see org.framed.orm.model.OrmPackage#getFulfilment_FulfilledRoles()
   * @model
   * @generated
   */
  EList<String> getFulfilledRoles();

} // Fulfilment
