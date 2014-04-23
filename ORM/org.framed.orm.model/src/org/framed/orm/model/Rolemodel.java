/**
 */
package org.framed.orm.model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rolemodel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.framed.orm.model.Rolemodel#getSubcontexts <em>Subcontexts</em>}</li>
 *   <li>{@link org.framed.orm.model.Rolemodel#getParticipants <em>Participants</em>}</li>
 *   <li>{@link org.framed.orm.model.Rolemodel#getPlayers <em>Players</em>}</li>
 *   <li>{@link org.framed.orm.model.Rolemodel#getCt <em>Ct</em>}</li>
 *   <li>{@link org.framed.orm.model.Rolemodel#getParentGroup <em>Parent Group</em>}</li>
 *   <li>{@link org.framed.orm.model.Rolemodel#getGroups <em>Groups</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.framed.orm.model.OrmPackage#getRolemodel()
 * @model
 * @generated
 */
public interface Rolemodel extends RelationContainer {
  /**
   * Returns the value of the '<em><b>Subcontexts</b></em>' containment reference list.
   * The list contents are of type {@link org.framed.orm.model.Compartment}.
   * It is bidirectional and its opposite is '{@link org.framed.orm.model.Compartment#getParentRolemodel <em>Parent Rolemodel</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Subcontexts</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Subcontexts</em>' containment reference list.
   * @see org.framed.orm.model.OrmPackage#getRolemodel_Subcontexts()
   * @see org.framed.orm.model.Compartment#getParentRolemodel
   * @model opposite="parentRolemodel" containment="true"
   * @generated
   */
  EList<Compartment> getSubcontexts();

  /**
   * Returns the value of the '<em><b>Participants</b></em>' containment reference list.
   * The list contents are of type {@link org.framed.orm.model.AbstractRole}.
   * It is bidirectional and its opposite is '{@link org.framed.orm.model.AbstractRole#getParentRolemodel <em>Parent Rolemodel</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Participants</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Participants</em>' containment reference list.
   * @see org.framed.orm.model.OrmPackage#getRolemodel_Participants()
   * @see org.framed.orm.model.AbstractRole#getParentRolemodel
   * @model opposite="parentRolemodel" containment="true"
   * @generated
   */
  EList<AbstractRole> getParticipants();

  /**
   * Returns the value of the '<em><b>Players</b></em>' containment reference list.
   * The list contents are of type {@link org.framed.orm.model.NaturalType}.
   * It is bidirectional and its opposite is '{@link org.framed.orm.model.NaturalType#getParentRolemodel <em>Parent Rolemodel</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Players</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Players</em>' containment reference list.
   * @see org.framed.orm.model.OrmPackage#getRolemodel_Players()
   * @see org.framed.orm.model.NaturalType#getParentRolemodel
   * @model opposite="parentRolemodel" containment="true"
   * @generated
   */
  EList<NaturalType> getPlayers();

  /**
   * Returns the value of the '<em><b>Ct</b></em>' container reference.
   * It is bidirectional and its opposite is '{@link org.framed.orm.model.Compartment#getRolemodel <em>Rolemodel</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ct</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ct</em>' container reference.
   * @see #setCt(Compartment)
   * @see org.framed.orm.model.OrmPackage#getRolemodel_Ct()
   * @see org.framed.orm.model.Compartment#getRolemodel
   * @model opposite="rolemodel" transient="false"
   * @generated
   */
  Compartment getCt();

  /**
   * Sets the value of the '{@link org.framed.orm.model.Rolemodel#getCt <em>Ct</em>}' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ct</em>' container reference.
   * @see #getCt()
   * @generated
   */
  void setCt(Compartment value);

  /**
   * Returns the value of the '<em><b>Parent Group</b></em>' container reference.
   * It is bidirectional and its opposite is '{@link org.framed.orm.model.Grouping#getRolemodel <em>Rolemodel</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parent Group</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parent Group</em>' container reference.
   * @see #setParentGroup(Grouping)
   * @see org.framed.orm.model.OrmPackage#getRolemodel_ParentGroup()
   * @see org.framed.orm.model.Grouping#getRolemodel
   * @model opposite="rolemodel" transient="false"
   * @generated
   */
  Grouping getParentGroup();

  /**
   * Sets the value of the '{@link org.framed.orm.model.Rolemodel#getParentGroup <em>Parent Group</em>}' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parent Group</em>' container reference.
   * @see #getParentGroup()
   * @generated
   */
  void setParentGroup(Grouping value);

  /**
   * Returns the value of the '<em><b>Groups</b></em>' containment reference list.
   * The list contents are of type {@link org.framed.orm.model.Grouping}.
   * It is bidirectional and its opposite is '{@link org.framed.orm.model.Grouping#getParentRolemodel <em>Parent Rolemodel</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Groups</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Groups</em>' containment reference list.
   * @see org.framed.orm.model.OrmPackage#getRolemodel_Groups()
   * @see org.framed.orm.model.Grouping#getParentRolemodel
   * @model opposite="parentRolemodel" containment="true"
   * @generated
   */
  EList<Grouping> getGroups();

} // Rolemodel
