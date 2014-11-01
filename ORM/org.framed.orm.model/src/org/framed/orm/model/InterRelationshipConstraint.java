/**
 */
package org.framed.orm.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Inter Relationship Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.framed.orm.model.InterRelationshipConstraint#getFirst <em>First</em>}</li>
 *   <li>{@link org.framed.orm.model.InterRelationshipConstraint#getSecond <em>Second</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.framed.orm.model.OrmPackage#getInterRelationshipConstraint()
 * @model
 * @generated
 */
public interface InterRelationshipConstraint extends RelationshipConstraint {
  /**
   * Returns the value of the '<em><b>First</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>First</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>First</em>' reference.
   * @see #setFirst(Relationship)
   * @see org.framed.orm.model.OrmPackage#getInterRelationshipConstraint_First()
   * @model required="true"
   * @generated
   */
  Relationship getFirst();

  /**
   * Sets the value of the '{@link org.framed.orm.model.InterRelationshipConstraint#getFirst <em>First</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>First</em>' reference.
   * @see #getFirst()
   * @generated
   */
  void setFirst(Relationship value);

  /**
   * Returns the value of the '<em><b>Second</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Second</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Second</em>' reference.
   * @see #setSecond(Relationship)
   * @see org.framed.orm.model.OrmPackage#getInterRelationshipConstraint_Second()
   * @model required="true"
   * @generated
   */
  Relationship getSecond();

  /**
   * Sets the value of the '{@link org.framed.orm.model.InterRelationshipConstraint#getSecond <em>Second</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Second</em>' reference.
   * @see #getSecond()
   * @generated
   */
  void setSecond(Relationship value);

} // InterRelationshipConstraint
