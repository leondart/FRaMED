/**
 */
package org.framed.orm.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Compartment Inheritance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.framed.orm.model.CompartmentInheritance#getSub <em>Sub</em>}</li>
 *   <li>{@link org.framed.orm.model.CompartmentInheritance#getSuper <em>Super</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.framed.orm.model.OrmPackage#getCompartmentInheritance()
 * @model
 * @generated
 */
public interface CompartmentInheritance extends Inheritance {
  /**
   * Returns the value of the '<em><b>Sub</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sub</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sub</em>' reference.
   * @see #setSub(CompartmentType)
   * @see org.framed.orm.model.OrmPackage#getCompartmentInheritance_Sub()
   * @model required="true"
   * @generated
   */
  CompartmentType getSub();

  /**
   * Sets the value of the '{@link org.framed.orm.model.CompartmentInheritance#getSub <em>Sub</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sub</em>' reference.
   * @see #getSub()
   * @generated
   */
  void setSub(CompartmentType value);

  /**
   * Returns the value of the '<em><b>Super</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Super</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Super</em>' reference.
   * @see #setSuper(CompartmentType)
   * @see org.framed.orm.model.OrmPackage#getCompartmentInheritance_Super()
   * @model required="true"
   * @generated
   */
  CompartmentType getSuper();

  /**
   * Sets the value of the '{@link org.framed.orm.model.CompartmentInheritance#getSuper <em>Super</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Super</em>' reference.
   * @see #getSuper()
   * @generated
   */
  void setSuper(CompartmentType value);

} // CompartmentInheritance
