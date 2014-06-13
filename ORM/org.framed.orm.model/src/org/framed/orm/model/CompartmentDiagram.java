/**
 */
package org.framed.orm.model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Compartment Diagram</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.framed.orm.model.CompartmentDiagram#getCompartments <em>Compartments</em>}</li>
 *   <li>{@link org.framed.orm.model.CompartmentDiagram#getGroups <em>Groups</em>}</li>
 *   <li>{@link org.framed.orm.model.CompartmentDiagram#getPlayers <em>Players</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.framed.orm.model.OrmPackage#getCompartmentDiagram()
 * @model
 * @generated
 */
public interface CompartmentDiagram extends Container {
  /**
   * Returns the value of the '<em><b>Compartments</b></em>' containment reference list.
   * The list contents are of type {@link org.framed.orm.model.Compartment}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Compartments</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Compartments</em>' containment reference list.
   * @see org.framed.orm.model.OrmPackage#getCompartmentDiagram_Compartments()
   * @model containment="true"
   * @generated
   */
  EList<Compartment> getCompartments();

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
   * @see org.framed.orm.model.OrmPackage#getCompartmentDiagram_Groups()
   * @model containment="true"
   * @generated
   */
  EList<Grouping> getGroups();

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
   * @see org.framed.orm.model.OrmPackage#getCompartmentDiagram_Players()
   * @model containment="true"
   * @generated
   */
  EList<NaturalType> getPlayers();

} // CompartmentDiagram
