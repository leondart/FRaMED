/**
 */
package org.framed.orm.geometry.impl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.framed.orm.geometry.GeometryPackage;
import org.framed.orm.geometry.Point;
import org.framed.orm.geometry.RelativePoint;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relative Point</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.framed.orm.geometry.impl.RelativePointImpl#getReferencePoints <em>Reference Points</em>}</li>
 *   <li>{@link org.framed.orm.geometry.impl.RelativePointImpl#getDistances <em>Distances</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RelativePointImpl extends MinimalEObjectImpl.Container implements RelativePoint {
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RelativePointImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return GeometryPackage.Literals.RELATIVE_POINT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected int eStaticFeatureCount() {
    return 0;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  public EList<Point> getReferencePoints() {
    return (EList<Point>) eGet(GeometryPackage.Literals.RELATIVE_POINT__REFERENCE_POINTS, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  public EList<Point> getDistances() {
    return (EList<Point>) eGet(GeometryPackage.Literals.RELATIVE_POINT__DISTANCES, true);
  }

} //RelativePointImpl
