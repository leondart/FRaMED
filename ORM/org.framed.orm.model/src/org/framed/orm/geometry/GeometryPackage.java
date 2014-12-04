/**
 */
package org.framed.orm.geometry;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.framed.orm.geometry.GeometryFactory
 * @model kind="package"
 * @generated
 */
public interface GeometryPackage extends EPackage {
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "geometry";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://orm.geometry/1.0";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "org.framed.orm.model.geometry";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  GeometryPackage eINSTANCE = org.framed.orm.geometry.impl.GeometryPackageImpl.init();

  /**
   * The meta object id for the '{@link org.framed.orm.geometry.impl.PointImpl <em>Point</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.framed.orm.geometry.impl.PointImpl
   * @see org.framed.orm.geometry.impl.GeometryPackageImpl#getPoint()
   * @generated
   */
  int POINT = 0;

  /**
   * The feature id for the '<em><b>X</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POINT__X = 0;

  /**
   * The feature id for the '<em><b>Y</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POINT__Y = 1;

  /**
   * The number of structural features of the '<em>Point</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POINT_FEATURE_COUNT = 2;

  /**
   * The number of operations of the '<em>Point</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POINT_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link org.framed.orm.geometry.impl.RectangleImpl <em>Rectangle</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.framed.orm.geometry.impl.RectangleImpl
   * @see org.framed.orm.geometry.impl.GeometryPackageImpl#getRectangle()
   * @generated
   */
  int RECTANGLE = 1;

  /**
   * The feature id for the '<em><b>Top Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECTANGLE__TOP_LEFT = 0;

  /**
   * The feature id for the '<em><b>Bottom Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECTANGLE__BOTTOM_RIGHT = 1;

  /**
   * The number of structural features of the '<em>Rectangle</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECTANGLE_FEATURE_COUNT = 2;

  /**
   * The number of operations of the '<em>Rectangle</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECTANGLE_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link org.framed.orm.geometry.impl.RelativePointImpl <em>Relative Point</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.framed.orm.geometry.impl.RelativePointImpl
   * @see org.framed.orm.geometry.impl.GeometryPackageImpl#getRelativePoint()
   * @generated
   */
  int RELATIVE_POINT = 2;

  /**
   * The feature id for the '<em><b>Reference Points</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIVE_POINT__REFERENCE_POINTS = 0;

  /**
   * The feature id for the '<em><b>Distances</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIVE_POINT__DISTANCES = 1;

  /**
   * The number of structural features of the '<em>Relative Point</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIVE_POINT_FEATURE_COUNT = 2;

  /**
   * The number of operations of the '<em>Relative Point</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIVE_POINT_OPERATION_COUNT = 0;

  /**
   * Returns the meta object for class '{@link org.framed.orm.geometry.Point <em>Point</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Point</em>'.
   * @see org.framed.orm.geometry.Point
   * @generated
   */
  EClass getPoint();

  /**
   * Returns the meta object for the attribute '{@link org.framed.orm.geometry.Point#getX <em>X</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>X</em>'.
   * @see org.framed.orm.geometry.Point#getX()
   * @see #getPoint()
   * @generated
   */
  EAttribute getPoint_X();

  /**
   * Returns the meta object for the attribute '{@link org.framed.orm.geometry.Point#getY <em>Y</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Y</em>'.
   * @see org.framed.orm.geometry.Point#getY()
   * @see #getPoint()
   * @generated
   */
  EAttribute getPoint_Y();

  /**
   * Returns the meta object for class '{@link org.framed.orm.geometry.Rectangle <em>Rectangle</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Rectangle</em>'.
   * @see org.framed.orm.geometry.Rectangle
   * @generated
   */
  EClass getRectangle();

  /**
   * Returns the meta object for the containment reference '{@link org.framed.orm.geometry.Rectangle#getTopLeft <em>Top Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Top Left</em>'.
   * @see org.framed.orm.geometry.Rectangle#getTopLeft()
   * @see #getRectangle()
   * @generated
   */
  EReference getRectangle_TopLeft();

  /**
   * Returns the meta object for the containment reference '{@link org.framed.orm.geometry.Rectangle#getBottomRight <em>Bottom Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Bottom Right</em>'.
   * @see org.framed.orm.geometry.Rectangle#getBottomRight()
   * @see #getRectangle()
   * @generated
   */
  EReference getRectangle_BottomRight();

  /**
   * Returns the meta object for class '{@link org.framed.orm.geometry.RelativePoint <em>Relative Point</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Relative Point</em>'.
   * @see org.framed.orm.geometry.RelativePoint
   * @generated
   */
  EClass getRelativePoint();

  /**
   * Returns the meta object for the reference list '{@link org.framed.orm.geometry.RelativePoint#getReferencePoints <em>Reference Points</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Reference Points</em>'.
   * @see org.framed.orm.geometry.RelativePoint#getReferencePoints()
   * @see #getRelativePoint()
   * @generated
   */
  EReference getRelativePoint_ReferencePoints();

  /**
   * Returns the meta object for the containment reference list '{@link org.framed.orm.geometry.RelativePoint#getDistances <em>Distances</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Distances</em>'.
   * @see org.framed.orm.geometry.RelativePoint#getDistances()
   * @see #getRelativePoint()
   * @generated
   */
  EReference getRelativePoint_Distances();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  GeometryFactory getGeometryFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each operation of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals {
    /**
     * The meta object literal for the '{@link org.framed.orm.geometry.impl.PointImpl <em>Point</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.framed.orm.geometry.impl.PointImpl
     * @see org.framed.orm.geometry.impl.GeometryPackageImpl#getPoint()
     * @generated
     */
    EClass POINT = eINSTANCE.getPoint();

    /**
     * The meta object literal for the '<em><b>X</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute POINT__X = eINSTANCE.getPoint_X();

    /**
     * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute POINT__Y = eINSTANCE.getPoint_Y();

    /**
     * The meta object literal for the '{@link org.framed.orm.geometry.impl.RectangleImpl <em>Rectangle</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.framed.orm.geometry.impl.RectangleImpl
     * @see org.framed.orm.geometry.impl.GeometryPackageImpl#getRectangle()
     * @generated
     */
    EClass RECTANGLE = eINSTANCE.getRectangle();

    /**
     * The meta object literal for the '<em><b>Top Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RECTANGLE__TOP_LEFT = eINSTANCE.getRectangle_TopLeft();

    /**
     * The meta object literal for the '<em><b>Bottom Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RECTANGLE__BOTTOM_RIGHT = eINSTANCE.getRectangle_BottomRight();

    /**
     * The meta object literal for the '{@link org.framed.orm.geometry.impl.RelativePointImpl <em>Relative Point</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.framed.orm.geometry.impl.RelativePointImpl
     * @see org.framed.orm.geometry.impl.GeometryPackageImpl#getRelativePoint()
     * @generated
     */
    EClass RELATIVE_POINT = eINSTANCE.getRelativePoint();

    /**
     * The meta object literal for the '<em><b>Reference Points</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RELATIVE_POINT__REFERENCE_POINTS = eINSTANCE.getRelativePoint_ReferencePoints();

    /**
     * The meta object literal for the '<em><b>Distances</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RELATIVE_POINT__DISTANCES = eINSTANCE.getRelativePoint_Distances();

  }

} //GeometryPackage
