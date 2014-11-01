/**
 */
package org.framed.orm.model;

import org.eclipse.draw2d.geometry.Rectangle;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relation Target</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.framed.orm.model.RelationTarget#getIncoming <em>Incoming</em>}</li>
 *   <li>{@link org.framed.orm.model.RelationTarget#getOutgoing <em>Outgoing</em>}</li>
 *   <li>{@link org.framed.orm.model.RelationTarget#getBoundaries <em>Boundaries</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.framed.orm.model.OrmPackage#getRelationTarget()
 * @model
 * @generated
 */
public interface RelationTarget extends NamedElement {
  /**
   * Returns the value of the '<em><b>Incoming</b></em>' reference list.
   * The list contents are of type {@link org.framed.orm.model.Relation}.
   * It is bidirectional and its opposite is '{@link org.framed.orm.model.Relation#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Incoming</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Incoming</em>' reference list.
   * @see org.framed.orm.model.OrmPackage#getRelationTarget_Incoming()
   * @see org.framed.orm.model.Relation#getTarget
   * @model opposite="target"
   * @generated
   */
  EList<Relation> getIncoming();

  /**
   * Returns the value of the '<em><b>Outgoing</b></em>' reference list.
   * The list contents are of type {@link org.framed.orm.model.Relation}.
   * It is bidirectional and its opposite is '{@link org.framed.orm.model.Relation#getSource <em>Source</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Outgoing</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Outgoing</em>' reference list.
   * @see org.framed.orm.model.OrmPackage#getRelationTarget_Outgoing()
   * @see org.framed.orm.model.Relation#getSource
   * @model opposite="source"
   * @generated
   */
  EList<Relation> getOutgoing();

  /**
   * Returns the value of the '<em><b>Boundaries</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Boundaries</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Boundaries</em>' attribute.
   * @see #setBoundaries(Rectangle)
   * @see org.framed.orm.model.OrmPackage#getRelationTarget_Boundaries()
   * @model dataType="org.framed.orm.model.Rectangle"
   * @generated
   */
  Rectangle getBoundaries();

  /**
   * Sets the value of the '{@link org.framed.orm.model.RelationTarget#getBoundaries <em>Boundaries</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Boundaries</em>' attribute.
   * @see #getBoundaries()
   * @generated
   */
  void setBoundaries(Rectangle value);

} // RelationTarget
