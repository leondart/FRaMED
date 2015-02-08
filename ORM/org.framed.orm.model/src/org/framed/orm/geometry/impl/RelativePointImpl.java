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
 * The first entry in the refernce points list is the refrencePoint to the source of
 * {@link Relation} to which this relative point belong and the second entry is the refrencePoint to
 * the target of the relation to which this relative point belong to. In correspondence to that is
 * the first entry in the distance list the distance(a Point where x describes the width and y the
 * height) to the source refence point and the second entry is the distance to target refence
 * point.
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
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected RelativePointImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return GeometryPackage.Literals.RELATIVE_POINT;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected int eStaticFeatureCount() {
    return 0;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  public EList<Point> getReferencePoints() {
    return (EList<Point>) eGet(GeometryPackage.Literals.RELATIVE_POINT__REFERENCE_POINTS, true);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  public EList<Point> getDistances() {
    return (EList<Point>) eGet(GeometryPackage.Literals.RELATIVE_POINT__DISTANCES, true);
  }

} // RelativePointImpl
