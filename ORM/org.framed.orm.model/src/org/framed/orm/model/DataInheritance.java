/**
 */
package org.framed.orm.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Inheritance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.framed.orm.model.DataInheritance#getSuper <em>Super</em>}</li>
 *   <li>{@link org.framed.orm.model.DataInheritance#getSub <em>Sub</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.framed.orm.model.OrmPackage#getDataInheritance()
 * @model
 * @generated
 */
public interface DataInheritance extends Inheritance {
  /**
   * Returns the value of the '<em><b>Super</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Super</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Super</em>' reference.
   * @see #setSuper(DataType)
   * @see org.framed.orm.model.OrmPackage#getDataInheritance_Super()
   * @model required="true"
   * @generated
   */
  DataType getSuper();

  /**
   * Sets the value of the '{@link org.framed.orm.model.DataInheritance#getSuper <em>Super</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Super</em>' reference.
   * @see #getSuper()
   * @generated
   */
  void setSuper(DataType value);

  /**
   * Returns the value of the '<em><b>Sub</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sub</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sub</em>' reference.
   * @see #setSub(DataType)
   * @see org.framed.orm.model.OrmPackage#getDataInheritance_Sub()
   * @model required="true"
   * @generated
   */
  DataType getSub();

  /**
   * Sets the value of the '{@link org.framed.orm.model.DataInheritance#getSub <em>Sub</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sub</em>' reference.
   * @see #getSub()
   * @generated
   */
  void setSub(DataType value);

} // DataInheritance
