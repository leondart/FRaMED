/**
 */
package org.framed.orm.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Natural Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.framed.orm.model.NaturalType#getParentRolemodel <em>Parent Rolemodel</em>}</li>
 *   <li>{@link org.framed.orm.model.NaturalType#getCd <em>Cd</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.framed.orm.model.OrmPackage#getNaturalType()
 * @model
 * @generated
 */
public interface NaturalType extends Type {
  /**
   * Returns the value of the '<em><b>Parent Rolemodel</b></em>' container reference.
   * It is bidirectional and its opposite is '{@link org.framed.orm.model.Rolemodel#getPlayers <em>Players</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parent Rolemodel</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parent Rolemodel</em>' container reference.
   * @see #setParentRolemodel(Rolemodel)
   * @see org.framed.orm.model.OrmPackage#getNaturalType_ParentRolemodel()
   * @see org.framed.orm.model.Rolemodel#getPlayers
   * @model opposite="players" transient="false"
   * @generated
   */
  Rolemodel getParentRolemodel();

  /**
   * Sets the value of the '{@link org.framed.orm.model.NaturalType#getParentRolemodel <em>Parent Rolemodel</em>}' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parent Rolemodel</em>' container reference.
   * @see #getParentRolemodel()
   * @generated
   */
  void setParentRolemodel(Rolemodel value);

  /**
   * Returns the value of the '<em><b>Cd</b></em>' container reference.
   * It is bidirectional and its opposite is '{@link org.framed.orm.model.CompartmentDiagram#getPlayers <em>Players</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cd</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cd</em>' container reference.
   * @see #setCd(CompartmentDiagram)
   * @see org.framed.orm.model.OrmPackage#getNaturalType_Cd()
   * @see org.framed.orm.model.CompartmentDiagram#getPlayers
   * @model opposite="players" transient="false" derived="true"
   * @generated
   */
  CompartmentDiagram getCd();

  /**
   * Sets the value of the '{@link org.framed.orm.model.NaturalType#getCd <em>Cd</em>}' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cd</em>' container reference.
   * @see #getCd()
   * @generated
   */
  void setCd(CompartmentDiagram value);

} // NaturalType
