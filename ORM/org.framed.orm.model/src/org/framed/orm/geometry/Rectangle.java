/**
 */
package org.framed.orm.geometry;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Rectangle</b></em>'. <!--
 * end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.framed.orm.geometry.Rectangle#getTopLeft <em>Top Left</em>}</li>
 * <li>{@link org.framed.orm.geometry.Rectangle#getBottomRight <em>Bottom Right</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.framed.orm.geometry.GeometryPackage#getRectangle()
 * @model
 * @generated
 */
public interface Rectangle extends EObject {
  /**
   * Returns the value of the '<em><b>Top Left</b></em>' containment reference. <!-- begin-user-doc
   * -->
   * <p>
   * If the meaning of the '<em>Top Left</em>' containment reference isn't clear, there really
   * should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @return the value of the '<em>Top Left</em>' containment reference.
   * @see #setTopLeft(Point)
   * @see org.framed.orm.geometry.GeometryPackage#getRectangle_TopLeft()
   * @model containment="true"
   * @generated
   */
  Point getTopLeft();

  /**
   * Sets the value of the '{@link org.framed.orm.geometry.Rectangle#getTopLeft <em>Top Left</em>}'
   * containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value the new value of the '<em>Top Left</em>' containment reference.
   * @see #getTopLeft()
   * @generated
   */
  void setTopLeft(Point value);

  /**
   * Returns the value of the '<em><b>Bottom Right</b></em>' containment reference. <!--
   * begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Bottom Right</em>' containment reference isn't clear, there really
   * should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @return the value of the '<em>Bottom Right</em>' containment reference.
   * @see #setBottomRight(Point)
   * @see org.framed.orm.geometry.GeometryPackage#getRectangle_BottomRight()
   * @model containment="true"
   * @generated
   */
  Point getBottomRight();

  /**
   * Sets the value of the '{@link org.framed.orm.geometry.Rectangle#getBottomRight
   * <em>Bottom Right</em>}' containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value the new value of the '<em>Bottom Right</em>' containment reference.
   * @see #getBottomRight()
   * @generated
   */
  void setBottomRight(Point value);

} // Rectangle
