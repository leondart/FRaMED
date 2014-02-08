/**
 */
package orm.model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relation Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link orm.model.RelationContainer#getRelations <em>Relations</em>}</li>
 * </ul>
 * </p>
 *
 * @see orm.model.OrmPackage#getRelationContainer()
 * @model
 * @generated
 */
public interface RelationContainer extends EObject {
	/**
	 * Returns the value of the '<em><b>Relations</b></em>' containment reference list.
	 * The list contents are of type {@link orm.model.Relation}.
	 * It is bidirectional and its opposite is '{@link orm.model.Relation#getRelationContainer <em>Relation Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relations</em>' containment reference list.
	 * @see orm.model.OrmPackage#getRelationContainer_Relations()
	 * @see orm.model.Relation#getRelationContainer
	 * @model opposite="relationContainer" containment="true"
	 * @generated
	 */
	EList<Relation> getRelations();

} // RelationContainer
