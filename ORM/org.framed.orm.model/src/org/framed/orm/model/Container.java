/**
 */
package org.framed.orm.model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.framed.orm.model.Container#getRelations <em>Relations</em>}</li>
 *   <li>{@link org.framed.orm.model.Container#getNodes <em>Nodes</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.framed.orm.model.OrmPackage#getContainer()
 * @model
 * @generated
 */
public interface Container extends EObject {
  /**
   * Returns the value of the '<em><b>Relations</b></em>' containment reference list.
   * The list contents are of type {@link org.framed.orm.model.Relation}.
   * It is bidirectional and its opposite is '{@link org.framed.orm.model.Relation#getRelationContainer <em>Relation Container</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Relations</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Relations</em>' containment reference list.
   * @see org.framed.orm.model.OrmPackage#getContainer_Relations()
   * @see org.framed.orm.model.Relation#getRelationContainer
   * @model opposite="relationContainer" containment="true"
   * @generated
   */
  EList<Relation> getRelations();

  /**
   * Returns the value of the '<em><b>Nodes</b></em>' containment reference list.
   * The list contents are of type {@link org.framed.orm.model.Node}.
   * It is bidirectional and its opposite is '{@link org.framed.orm.model.Node#getContainer <em>Container</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Nodes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Nodes</em>' containment reference list.
   * @see org.framed.orm.model.OrmPackage#getContainer_Nodes()
   * @see org.framed.orm.model.Node#getContainer
   * @model opposite="Container" containment="true"
   * @generated
   */
  EList<Node> getNodes();

} // Container
