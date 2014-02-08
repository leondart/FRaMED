/**
 */
package orm.model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Compartment Diagram</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link orm.model.CompartmentDiagram#getCompartments <em>Compartments</em>}</li>
 *   <li>{@link orm.model.CompartmentDiagram#getGroups <em>Groups</em>}</li>
 *   <li>{@link orm.model.CompartmentDiagram#getPlayers <em>Players</em>}</li>
 * </ul>
 * </p>
 *
 * @see orm.model.OrmPackage#getCompartmentDiagram()
 * @model
 * @generated
 */
public interface CompartmentDiagram extends RelationContainer {
	/**
	 * Returns the value of the '<em><b>Compartments</b></em>' containment reference list.
	 * The list contents are of type {@link orm.model.Compartment}.
	 * It is bidirectional and its opposite is '{@link orm.model.Compartment#getCd <em>Cd</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compartments</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compartments</em>' containment reference list.
	 * @see orm.model.OrmPackage#getCompartmentDiagram_Compartments()
	 * @see orm.model.Compartment#getCd
	 * @model opposite="cd" containment="true"
	 * @generated
	 */
	EList<Compartment> getCompartments();

	/**
	 * Returns the value of the '<em><b>Groups</b></em>' containment reference list.
	 * The list contents are of type {@link orm.model.Grouping}.
	 * It is bidirectional and its opposite is '{@link orm.model.Grouping#getCd <em>Cd</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Groups</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Groups</em>' containment reference list.
	 * @see orm.model.OrmPackage#getCompartmentDiagram_Groups()
	 * @see orm.model.Grouping#getCd
	 * @model opposite="cd" containment="true"
	 * @generated
	 */
	EList<Grouping> getGroups();

	/**
	 * Returns the value of the '<em><b>Players</b></em>' containment reference list.
	 * The list contents are of type {@link orm.model.NaturalType}.
	 * It is bidirectional and its opposite is '{@link orm.model.NaturalType#getCd <em>Cd</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Players</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Players</em>' containment reference list.
	 * @see orm.model.OrmPackage#getCompartmentDiagram_Players()
	 * @see orm.model.NaturalType#getCd
	 * @model opposite="cd" containment="true"
	 * @generated
	 */
	EList<NaturalType> getPlayers();

} // CompartmentDiagram
