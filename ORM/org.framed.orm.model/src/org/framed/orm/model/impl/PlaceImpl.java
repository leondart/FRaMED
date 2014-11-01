/**
 */
package org.framed.orm.model.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.framed.orm.model.OrmPackage;
import org.framed.orm.model.Place;
import org.framed.orm.model.RoleType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Place</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.framed.orm.model.impl.PlaceImpl#getLower <em>Lower</em>}</li>
 *   <li>{@link org.framed.orm.model.impl.PlaceImpl#getUpper <em>Upper</em>}</li>
 *   <li>{@link org.framed.orm.model.impl.PlaceImpl#getHolder <em>Holder</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PlaceImpl extends MinimalEObjectImpl.Container implements Place {
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PlaceImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return OrmPackage.Literals.PLACE;
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
  public int getLower() {
    return (Integer) eGet(OrmPackage.Literals.PLACE__LOWER, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLower(int newLower) {
    eSet(OrmPackage.Literals.PLACE__LOWER, newLower);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getUpper() {
    return (Integer) eGet(OrmPackage.Literals.PLACE__UPPER, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUpper(int newUpper) {
    eSet(OrmPackage.Literals.PLACE__UPPER, newUpper);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RoleType getHolder() {
    return (RoleType) eGet(OrmPackage.Literals.PLACE__HOLDER, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHolder(RoleType newHolder) {
    eSet(OrmPackage.Literals.PLACE__HOLDER, newHolder);
  }

} //PlaceImpl
