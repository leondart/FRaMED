/**
 */
package org.framed.orm.geometry;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Relative Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.framed.orm.geometry.RelativePoint#getReferencePoints <em>Reference Points</em>}</li>
 *   <li>{@link org.framed.orm.geometry.RelativePoint#getDistances <em>Distances</em>}</li>
 * </ul>
 *
 * @see org.framed.orm.geometry.GeometryPackage#getRelativePoint()
 * @model
 * @generated
 */
public interface RelativePoint extends EObject {
  /**
   * Returns the value of the '<em><b>Reference Points</b></em>' containment reference list.
   * The list contents are of type {@link org.framed.orm.geometry.Point}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Reference Points</em>' reference list isn't clear, there really
   * should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Reference Points</em>' containment reference list.
   * @see org.framed.orm.geometry.GeometryPackage#getRelativePoint_ReferencePoints()
   * @model containment="true" lower="2" upper="2"
   * @generated
   */
  EList<Point> getReferencePoints();

  /**
   * Returns the value of the '<em><b>Distances</b></em>' containment reference list.
   * The list contents are of type {@link org.framed.orm.geometry.Point}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Distances</em>' containment reference list isn't clear, there really
   * should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Distances</em>' containment reference list.
   * @see org.framed.orm.geometry.GeometryPackage#getRelativePoint_Distances()
   * @model containment="true" lower="2" upper="2"
   * @generated
   */
  EList<Point> getDistances();

} // RelativePoint
