/**
 */
package org.framed.orm.model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.framed.orm.model.Attribute#getType <em>Type</em>}</li>
 *   <li>{@link org.framed.orm.model.Attribute#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.framed.orm.model.OrmPackage#getAttribute()
 * @model
 * @generated
 */
public interface Attribute extends EObject {
  /**
   * Returns the value of the '<em><b>Type</b></em>' container reference.
   * It is bidirectional and its opposite is '{@link org.framed.orm.model.Type#getAttributes <em>Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' container reference.
   * @see #setType(Type)
   * @see org.framed.orm.model.OrmPackage#getAttribute_Type()
   * @see org.framed.orm.model.Type#getAttributes
   * @model opposite="attributes" transient="false"
   * @generated
   */
  Type getType();

  /**
   * Sets the value of the '{@link org.framed.orm.model.Attribute#getType <em>Type</em>}' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' container reference.
   * @see #getType()
   * @generated
   */
  void setType(Type value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * The default value is <code>"<...>"</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.framed.orm.model.OrmPackage#getAttribute_Name()
   * @model default="<...>"
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.framed.orm.model.Attribute#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

} // Attribute
