/**
 */
package org.framed.orm.model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relation Label</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.framed.orm.model.RelationLabel#getLabel <em>Label</em>}</li>
 *   <li>{@link org.framed.orm.model.RelationLabel#isIsRelationEnd <em>Is Relation End</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.framed.orm.model.OrmPackage#getRelationLabel()
 * @model
 * @generated
 */
public interface RelationLabel extends EObject {
  /**
   * Returns the value of the '<em><b>Label</b></em>' attribute.
   * The default value is <code>"0..1"</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Label</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Label</em>' attribute.
   * @see #setLabel(String)
   * @see org.framed.orm.model.OrmPackage#getRelationLabel_Label()
   * @model default="0..1" required="true"
   * @generated
   */
  String getLabel();

  /**
   * Sets the value of the '{@link org.framed.orm.model.RelationLabel#getLabel <em>Label</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Label</em>' attribute.
   * @see #getLabel()
   * @generated
   */
  void setLabel(String value);

  /**
   * Returns the value of the '<em><b>Is Relation End</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Is Relation End</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Is Relation End</em>' attribute.
   * @see #setIsRelationEnd(boolean)
   * @see org.framed.orm.model.OrmPackage#getRelationLabel_IsRelationEnd()
   * @model required="true"
   * @generated
   */
  boolean isIsRelationEnd();

  /**
   * Sets the value of the '{@link org.framed.orm.model.RelationLabel#isIsRelationEnd <em>Is Relation End</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Is Relation End</em>' attribute.
   * @see #isIsRelationEnd()
   * @generated
   */
  void setIsRelationEnd(boolean value);

} // RelationLabel
