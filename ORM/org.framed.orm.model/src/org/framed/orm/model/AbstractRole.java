/**
 */
package org.framed.orm.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Role</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.framed.orm.model.AbstractRole#getFirst <em>First</em>}</li>
 *   <li>{@link org.framed.orm.model.AbstractRole#getSecond <em>Second</em>}</li>
 *   <li>{@link org.framed.orm.model.AbstractRole#getParentRolemodel <em>Parent Rolemodel</em>}</li>
 *   <li>{@link org.framed.orm.model.AbstractRole#getParentRoleGroup <em>Parent Role Group</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.framed.orm.model.OrmPackage#getAbstractRole()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface AbstractRole extends Constraint {
  /**
   * Returns the value of the '<em><b>First</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>First</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>First</em>' reference.
   * @see #setFirst(RoleType)
   * @see org.framed.orm.model.OrmPackage#getAbstractRole_First()
   * @model required="true"
   * @generated
   */
  RoleType getFirst();

  /**
   * Sets the value of the '{@link org.framed.orm.model.AbstractRole#getFirst <em>First</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>First</em>' reference.
   * @see #getFirst()
   * @generated
   */
  void setFirst(RoleType value);

  /**
   * Returns the value of the '<em><b>Second</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Second</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Second</em>' reference.
   * @see #setSecond(RoleType)
   * @see org.framed.orm.model.OrmPackage#getAbstractRole_Second()
   * @model required="true"
   * @generated
   */
  RoleType getSecond();

  /**
   * Sets the value of the '{@link org.framed.orm.model.AbstractRole#getSecond <em>Second</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Second</em>' reference.
   * @see #getSecond()
   * @generated
   */
  void setSecond(RoleType value);

  /**
   * Returns the value of the '<em><b>Parent Rolemodel</b></em>' container reference.
   * It is bidirectional and its opposite is '{@link org.framed.orm.model.Rolemodel#getParticipants <em>Participants</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parent Rolemodel</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parent Rolemodel</em>' container reference.
   * @see #setParentRolemodel(Rolemodel)
   * @see org.framed.orm.model.OrmPackage#getAbstractRole_ParentRolemodel()
   * @see org.framed.orm.model.Rolemodel#getParticipants
   * @model opposite="participants" transient="false"
   * @generated
   */
  Rolemodel getParentRolemodel();

  /**
   * Sets the value of the '{@link org.framed.orm.model.AbstractRole#getParentRolemodel <em>Parent Rolemodel</em>}' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parent Rolemodel</em>' container reference.
   * @see #getParentRolemodel()
   * @generated
   */
  void setParentRolemodel(Rolemodel value);

  /**
   * Returns the value of the '<em><b>Parent Role Group</b></em>' container reference.
   * It is bidirectional and its opposite is '{@link org.framed.orm.model.RoleGroup#getItems <em>Items</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parent Role Group</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parent Role Group</em>' container reference.
   * @see #setParentRoleGroup(RoleGroup)
   * @see org.framed.orm.model.OrmPackage#getAbstractRole_ParentRoleGroup()
   * @see org.framed.orm.model.RoleGroup#getItems
   * @model opposite="items" transient="false"
   * @generated
   */
  RoleGroup getParentRoleGroup();

  /**
   * Sets the value of the '{@link org.framed.orm.model.AbstractRole#getParentRoleGroup <em>Parent Role Group</em>}' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parent Role Group</em>' container reference.
   * @see #getParentRoleGroup()
   * @generated
   */
  void setParentRoleGroup(RoleGroup value);

} // AbstractRole
