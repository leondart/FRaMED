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
   * @model default="0..1"
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

} // RelationLabel
