/**
 */
package org.framed.orm.geometry.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.framed.orm.geometry.GeometryPackage;
import org.framed.orm.geometry.Point;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Point</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.framed.orm.geometry.impl.PointImpl#getX <em>X</em>}</li>
 *   <li>{@link org.framed.orm.geometry.impl.PointImpl#getY <em>Y</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PointImpl extends MinimalEObjectImpl.Container implements Point {
  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected PointImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return GeometryPackage.Literals.POINT;
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
  public int getX() {
    return (Integer) eGet(GeometryPackage.Literals.POINT__X, true);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setX(int newX) {
    eSet(GeometryPackage.Literals.POINT__X, newX);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public int getY() {
    return (Integer) eGet(GeometryPackage.Literals.POINT__Y, true);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setY(int newY) {
    eSet(GeometryPackage.Literals.POINT__Y, newY);
  }

} // PointImpl
