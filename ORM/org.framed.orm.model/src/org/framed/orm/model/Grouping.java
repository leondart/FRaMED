/**
 */
package org.framed.orm.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Grouping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.framed.orm.model.Grouping#getRolemodel <em>Rolemodel</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.framed.orm.model.OrmPackage#getGrouping()
 * @model
 * @generated
 */
public interface Grouping extends Node {
  /**
   * Returns the value of the '<em><b>Rolemodel</b></em>' containment reference.
   * It is bidirectional and its opposite is '{@link org.framed.orm.model.Rolemodel#getParentGroup <em>Parent Group</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rolemodel</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rolemodel</em>' containment reference.
   * @see #setRolemodel(Rolemodel)
   * @see org.framed.orm.model.OrmPackage#getGrouping_Rolemodel()
   * @see org.framed.orm.model.Rolemodel#getParentGroup
   * @model opposite="parentGroup" containment="true" required="true"
   * @generated
   */
  Rolemodel getRolemodel();

  /**
   * Sets the value of the '{@link org.framed.orm.model.Grouping#getRolemodel <em>Rolemodel</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Rolemodel</em>' containment reference.
   * @see #getRolemodel()
   * @generated
   */
  void setRolemodel(Rolemodel value);

} // Grouping
