/**
 */
package org.framed.orm.model;

import org.eclipse.draw2d.geometry.Point;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.framed.orm.model.Relation#getRelationContainer <em>Relation Container</em>}</li>
 *   <li>{@link org.framed.orm.model.Relation#getTarget <em>Target</em>}</li>
 *   <li>{@link org.framed.orm.model.Relation#getSource <em>Source</em>}</li>
 *   <li>{@link org.framed.orm.model.Relation#getDim1BP <em>Dim1 BP</em>}</li>
 *   <li>{@link org.framed.orm.model.Relation#getDim2BP <em>Dim2 BP</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.framed.orm.model.OrmPackage#getRelation()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Relation extends EObject {
  /**
   * Returns the value of the '<em><b>Relation Container</b></em>' container reference.
   * It is bidirectional and its opposite is '{@link org.framed.orm.model.RelationContainer#getRelations <em>Relations</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Relation Container</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Relation Container</em>' container reference.
   * @see #setRelationContainer(RelationContainer)
   * @see org.framed.orm.model.OrmPackage#getRelation_RelationContainer()
   * @see org.framed.orm.model.RelationContainer#getRelations
   * @model opposite="relations" transient="false"
   * @generated
   */
  RelationContainer getRelationContainer();

  /**
   * Sets the value of the '{@link org.framed.orm.model.Relation#getRelationContainer <em>Relation Container</em>}' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Relation Container</em>' container reference.
   * @see #getRelationContainer()
   * @generated
   */
  void setRelationContainer(RelationContainer value);

  /**
   * Returns the value of the '<em><b>Target</b></em>' reference.
   * It is bidirectional and its opposite is '{@link org.framed.orm.model.Node#getIncomingLinks <em>Incoming Links</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Target</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target</em>' reference.
   * @see #setTarget(Node)
   * @see org.framed.orm.model.OrmPackage#getRelation_Target()
   * @see org.framed.orm.model.Node#getIncomingLinks
   * @model opposite="incomingLinks"
   * @generated
   */
  Node getTarget();

  /**
   * Sets the value of the '{@link org.framed.orm.model.Relation#getTarget <em>Target</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target</em>' reference.
   * @see #getTarget()
   * @generated
   */
  void setTarget(Node value);

  /**
   * Returns the value of the '<em><b>Source</b></em>' reference.
   * It is bidirectional and its opposite is '{@link org.framed.orm.model.Node#getOutgoingLinks <em>Outgoing Links</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Source</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Source</em>' reference.
   * @see #setSource(Node)
   * @see org.framed.orm.model.OrmPackage#getRelation_Source()
   * @see org.framed.orm.model.Node#getOutgoingLinks
   * @model opposite="outgoingLinks"
   * @generated
   */
  Node getSource();

  /**
   * Sets the value of the '{@link org.framed.orm.model.Relation#getSource <em>Source</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Source</em>' reference.
   * @see #getSource()
   * @generated
   */
  void setSource(Node value);

  /**
   * Returns the value of the '<em><b>Dim1 BP</b></em>' attribute list.
   * The list contents are of type {@link org.eclipse.draw2d.geometry.Point}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dim1 BP</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dim1 BP</em>' attribute list.
   * @see org.framed.orm.model.OrmPackage#getRelation_Dim1BP()
   * @model dataType="org.framed.orm.model.Point"
   * @generated
   */
  EList<Point> getDim1BP();

  /**
   * Returns the value of the '<em><b>Dim2 BP</b></em>' attribute list.
   * The list contents are of type {@link org.eclipse.draw2d.geometry.Point}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dim2 BP</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dim2 BP</em>' attribute list.
   * @see org.framed.orm.model.OrmPackage#getRelation_Dim2BP()
   * @model dataType="org.framed.orm.model.Point"
   * @generated
   */
  EList<Point> getDim2BP();

} // Relation
