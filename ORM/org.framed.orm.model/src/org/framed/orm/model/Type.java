/**
 */
package org.framed.orm.model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.framed.orm.model.Type#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link org.framed.orm.model.Type#getOperations <em>Operations</em>}</li>
 *   <li>{@link org.framed.orm.model.Type#isIsExpand <em>Is Expand</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.framed.orm.model.OrmPackage#getType()
 * @model abstract="true"
 * @generated
 */
public interface Type extends Node {
  /**
   * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
   * The list contents are of type {@link org.framed.orm.model.Attribute}.
   * It is bidirectional and its opposite is '{@link org.framed.orm.model.Attribute#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Attributes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attributes</em>' containment reference list.
   * @see org.framed.orm.model.OrmPackage#getType_Attributes()
   * @see org.framed.orm.model.Attribute#getType
   * @model opposite="type" containment="true"
   * @generated
   */
  EList<Attribute> getAttributes();

  /**
   * Returns the value of the '<em><b>Operations</b></em>' containment reference list.
   * The list contents are of type {@link org.framed.orm.model.Method}.
   * It is bidirectional and its opposite is '{@link org.framed.orm.model.Method#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Operations</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operations</em>' containment reference list.
   * @see org.framed.orm.model.OrmPackage#getType_Operations()
   * @see org.framed.orm.model.Method#getType
   * @model opposite="type" containment="true"
   * @generated
   */
  EList<Method> getOperations();

  /**
   * Returns the value of the '<em><b>Is Expand</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Is Expand</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Is Expand</em>' attribute.
   * @see #setIsExpand(boolean)
   * @see org.framed.orm.model.OrmPackage#getType_IsExpand()
   * @model
   * @generated
   */
  boolean isIsExpand();

  /**
   * Sets the value of the '{@link org.framed.orm.model.Type#isIsExpand <em>Is Expand</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Is Expand</em>' attribute.
   * @see #isIsExpand()
   * @generated
   */
  void setIsExpand(boolean value);

} // Type
