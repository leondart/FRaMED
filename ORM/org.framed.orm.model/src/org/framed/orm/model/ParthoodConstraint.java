/**
 */
package org.framed.orm.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parthood Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.framed.orm.model.ParthoodConstraint#getKind <em>Kind</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.framed.orm.model.OrmPackage#getParthoodConstraint()
 * @model
 * @generated
 */
public interface ParthoodConstraint extends IntraRelationshipConstraint {
  /**
   * Returns the value of the '<em><b>Kind</b></em>' attribute.
   * The literals are from the enumeration {@link org.framed.orm.model.Parthood}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Kind</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Kind</em>' attribute.
   * @see org.framed.orm.model.Parthood
   * @see #setKind(Parthood)
   * @see org.framed.orm.model.OrmPackage#getParthoodConstraint_Kind()
   * @model required="true"
   * @generated
   */
  Parthood getKind();

  /**
   * Sets the value of the '{@link org.framed.orm.model.ParthoodConstraint#getKind <em>Kind</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Kind</em>' attribute.
   * @see org.framed.orm.model.Parthood
   * @see #getKind()
   * @generated
   */
  void setKind(Parthood value);

} // ParthoodConstraint
