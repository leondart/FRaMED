/**
 */
package org.framed.orm.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Role Invariant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.framed.orm.model.RoleInvariant#getSubject <em>Subject</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.framed.orm.model.OrmPackage#getRoleInvariant()
 * @model abstract="true"
 * @generated
 */
public interface RoleInvariant extends Constraint {
  /**
   * Returns the value of the '<em><b>Subject</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Subject</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Subject</em>' reference.
   * @see #setSubject(AbstractRole)
   * @see org.framed.orm.model.OrmPackage#getRoleInvariant_Subject()
   * @model required="true"
   * @generated
   */
  AbstractRole getSubject();

  /**
   * Sets the value of the '{@link org.framed.orm.model.RoleInvariant#getSubject <em>Subject</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Subject</em>' reference.
   * @see #getSubject()
   * @generated
   */
  void setSubject(AbstractRole value);

} // RoleInvariant
