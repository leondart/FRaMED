/**
 */
package org.framed.orm.model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fulfillment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.framed.orm.model.Fulfillment#getFulfilledRoles <em>Fulfilled Roles</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.framed.orm.model.OrmPackage#getFulfillment()
 * @model
 * @generated
 */
public interface Fulfillment extends Relation {
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
   * @see org.framed.orm.model.OrmPackage#getFulfillment_FulfilledRoles()
   * @model
   * @generated
   */
  EList<String> getFulfilledRoles();

} // Fulfillment
