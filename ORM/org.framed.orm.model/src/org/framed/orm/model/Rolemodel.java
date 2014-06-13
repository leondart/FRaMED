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
 *   <li>{@link org.framed.orm.model.Rolemodel#getCompartment <em>Compartment</em>}</li>
 *   <li>{@link org.framed.orm.model.Rolemodel#getParentGroup <em>Parent Group</em>}</li>
 *   <li>{@link org.framed.orm.model.Rolemodel#getGroups <em>Groups</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.framed.orm.model.OrmPackage#getRolemodel()
 * @model
 * @generated
 */
public interface Rolemodel extends Container {
  /**
   * Returns the value of the '<em><b>Subcontexts</b></em>' containment reference list.
   * The list contents are of type {@link org.framed.orm.model.Compartment}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Subcontexts</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Subcontexts</em>' containment reference list.
   * @see org.framed.orm.model.OrmPackage#getRolemodel_Subcontexts()
   * @model containment="true"
   * @generated
   */
  EList<Compartment> getSubcontexts();

  /**
   * Returns the value of the '<em><b>Participants</b></em>' containment reference list.
   * The list contents are of type {@link org.framed.orm.model.AbstractRole}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Participants</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Participants</em>' containment reference list.
   * @see org.framed.orm.model.OrmPackage#getRolemodel_Participants()
   * @model containment="true"
   * @generated
   */
  EList<AbstractRole> getParticipants();

  /**
   * Returns the value of the '<em><b>Players</b></em>' containment reference list.
   * The list contents are of type {@link org.framed.orm.model.NaturalType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Players</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Players</em>' containment reference list.
   * @see org.framed.orm.model.OrmPackage#getRolemodel_Players()
   * @model containment="true"
   * @generated
   */
  EList<NaturalType> getPlayers();

  /**
   * Returns the value of the '<em><b>Compartment</b></em>' container reference.
   * It is bidirectional and its opposite is '{@link org.framed.orm.model.Compartment#getRolemodel <em>Rolemodel</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Compartment</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Compartment</em>' container reference.
   * @see #setCompartment(Compartment)
   * @see org.framed.orm.model.OrmPackage#getRolemodel_Compartment()
   * @see org.framed.orm.model.Compartment#getRolemodel
   * @model opposite="rolemodel" transient="false"
   * @generated
   */
  Compartment getCompartment();

  /**
   * Sets the value of the '{@link org.framed.orm.model.Rolemodel#getCompartment <em>Compartment</em>}' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Compartment</em>' container reference.
   * @see #getCompartment()
   * @generated
   */
  void setCompartment(Compartment value);

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
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Groups</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Groups</em>' containment reference list.
   * @see org.framed.orm.model.OrmPackage#getRolemodel_Groups()
   * @model containment="true"
   * @generated
   */
  EList<Grouping> getGroups();

} // Rolemodel
