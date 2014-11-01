/**
 */
package org.framed.orm.model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Place</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.framed.orm.model.Place#getLower <em>Lower</em>}</li>
 *   <li>{@link org.framed.orm.model.Place#getUpper <em>Upper</em>}</li>
 *   <li>{@link org.framed.orm.model.Place#getHolder <em>Holder</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.framed.orm.model.OrmPackage#getPlace()
 * @model
 * @generated
 */
public interface Place extends EObject {
  /**
   * Returns the value of the '<em><b>Lower</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Lower</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Lower</em>' attribute.
   * @see #setLower(int)
   * @see org.framed.orm.model.OrmPackage#getPlace_Lower()
   * @model required="true"
   * @generated
   */
  int getLower();

  /**
   * Sets the value of the '{@link org.framed.orm.model.Place#getLower <em>Lower</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Lower</em>' attribute.
   * @see #getLower()
   * @generated
   */
  void setLower(int value);

  /**
   * Returns the value of the '<em><b>Upper</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Upper</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Upper</em>' attribute.
   * @see #setUpper(int)
   * @see org.framed.orm.model.OrmPackage#getPlace_Upper()
   * @model required="true"
   * @generated
   */
  int getUpper();

  /**
   * Sets the value of the '{@link org.framed.orm.model.Place#getUpper <em>Upper</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Upper</em>' attribute.
   * @see #getUpper()
   * @generated
   */
  void setUpper(int value);

  /**
   * Returns the value of the '<em><b>Holder</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Holder</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Holder</em>' reference.
   * @see #setHolder(RoleType)
   * @see org.framed.orm.model.OrmPackage#getPlace_Holder()
   * @model required="true"
   * @generated
   */
  RoleType getHolder();

  /**
   * Sets the value of the '{@link org.framed.orm.model.Place#getHolder <em>Holder</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Holder</em>' reference.
   * @see #getHolder()
   * @generated
   */
  void setHolder(RoleType value);

} // Place
