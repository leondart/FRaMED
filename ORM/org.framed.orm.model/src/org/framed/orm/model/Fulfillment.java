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
 *   <li>{@link org.framed.orm.model.Fulfillment#getFiller <em>Filler</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.framed.orm.model.OrmPackage#getFulfillment()
 * @model
 * @generated
 */
public interface Fulfillment extends Relation {
  /**
   * Returns the value of the '<em><b>Fulfilled Roles</b></em>' reference list.
   * The list contents are of type {@link org.framed.orm.model.AbstractRole}.
   * It is bidirectional and its opposite is '{@link org.framed.orm.model.AbstractRole#getFulfillment <em>Fulfillment</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fulfilled Roles</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fulfilled Roles</em>' reference list.
   * @see org.framed.orm.model.OrmPackage#getFulfillment_FulfilledRoles()
   * @see org.framed.orm.model.AbstractRole#getFulfillment
   * @model opposite="fulfillment"
   * @generated
   */
  EList<AbstractRole> getFulfilledRoles();

  /**
   * Returns the value of the '<em><b>Filler</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Filler</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Filler</em>' reference.
   * @see #setFiller(RigidType)
   * @see org.framed.orm.model.OrmPackage#getFulfillment_Filler()
   * @model required="true"
   * @generated
   */
  RigidType getFiller();

  /**
   * Sets the value of the '{@link org.framed.orm.model.Fulfillment#getFiller <em>Filler</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Filler</em>' reference.
   * @see #getFiller()
   * @generated
   */
  void setFiller(RigidType value);

} // Fulfillment
