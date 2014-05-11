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
 *   <li>{@link org.framed.orm.model.Grouping#getCd <em>Cd</em>}</li>
 *   <li>{@link org.framed.orm.model.Grouping#getRolemodel <em>Rolemodel</em>}</li>
 *   <li>{@link org.framed.orm.model.Grouping#getParentRolemodel <em>Parent Rolemodel</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.framed.orm.model.OrmPackage#getGrouping()
 * @model
 * @generated
 */
public interface Grouping extends Node {
  /**
   * Returns the value of the '<em><b>Cd</b></em>' container reference.
   * It is bidirectional and its opposite is '{@link org.framed.orm.model.CompartmentDiagram#getGroups <em>Groups</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cd</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cd</em>' container reference.
   * @see #setCd(CompartmentDiagram)
   * @see org.framed.orm.model.OrmPackage#getGrouping_Cd()
   * @see org.framed.orm.model.CompartmentDiagram#getGroups
   * @model opposite="groups" transient="false" derived="true"
   * @generated
   */
  CompartmentDiagram getCompartmentDiagram();

  /**
   * Sets the value of the '{@link org.framed.orm.model.Grouping#getCd <em>Cd</em>}' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cd</em>' container reference.
   * @see #getCompartmentDiagram()
   * @generated
   */
  void setCd(CompartmentDiagram value);

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

  /**
   * Returns the value of the '<em><b>Parent Rolemodel</b></em>' container reference.
   * It is bidirectional and its opposite is '{@link org.framed.orm.model.Rolemodel#getGroups <em>Groups</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parent Rolemodel</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parent Rolemodel</em>' container reference.
   * @see #setParentRolemodel(Rolemodel)
   * @see org.framed.orm.model.OrmPackage#getGrouping_ParentRolemodel()
   * @see org.framed.orm.model.Rolemodel#getGroups
   * @model opposite="groups" transient="false"
   * @generated
   */
  Rolemodel getParentRolemodel();

  /**
   * Sets the value of the '{@link org.framed.orm.model.Grouping#getParentRolemodel <em>Parent Rolemodel</em>}' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parent Rolemodel</em>' container reference.
   * @see #getParentRolemodel()
   * @generated
   */
  void setParentRolemodel(Rolemodel value);

} // Grouping
