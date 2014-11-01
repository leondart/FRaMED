/**
 */
package org.framed.orm.model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Part</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.framed.orm.model.Part#getLower <em>Lower</em>}</li>
 *   <li>{@link org.framed.orm.model.Part#getUpper <em>Upper</em>}</li>
 *   <li>{@link org.framed.orm.model.Part#getWhole <em>Whole</em>}</li>
 *   <li>{@link org.framed.orm.model.Part#getRole <em>Role</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.framed.orm.model.OrmPackage#getPart()
 * @model
 * @generated
 */
public interface Part extends EObject {
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
   * @see org.framed.orm.model.OrmPackage#getPart_Lower()
   * @model required="true"
   * @generated
   */
  int getLower();

  /**
   * Sets the value of the '{@link org.framed.orm.model.Part#getLower <em>Lower</em>}' attribute.
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
   * @see org.framed.orm.model.OrmPackage#getPart_Upper()
   * @model required="true"
   * @generated
   */
  int getUpper();

  /**
   * Sets the value of the '{@link org.framed.orm.model.Part#getUpper <em>Upper</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Upper</em>' attribute.
   * @see #getUpper()
   * @generated
   */
  void setUpper(int value);

  /**
   * Returns the value of the '<em><b>Whole</b></em>' reference.
   * It is bidirectional and its opposite is '{@link org.framed.orm.model.CompartmentType#getParts <em>Parts</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Whole</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Whole</em>' reference.
   * @see #setWhole(CompartmentType)
   * @see org.framed.orm.model.OrmPackage#getPart_Whole()
   * @see org.framed.orm.model.CompartmentType#getParts
   * @model opposite="parts" required="true"
   * @generated
   */
  CompartmentType getWhole();

  /**
   * Sets the value of the '{@link org.framed.orm.model.Part#getWhole <em>Whole</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Whole</em>' reference.
   * @see #getWhole()
   * @generated
   */
  void setWhole(CompartmentType value);

  /**
   * Returns the value of the '<em><b>Role</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Role</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Role</em>' reference.
   * @see #setRole(AbstractRole)
   * @see org.framed.orm.model.OrmPackage#getPart_Role()
   * @model required="true"
   * @generated
   */
  AbstractRole getRole();

  /**
   * Sets the value of the '{@link org.framed.orm.model.Part#getRole <em>Role</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Role</em>' reference.
   * @see #getRole()
   * @generated
   */
  void setRole(AbstractRole value);

} // Part
