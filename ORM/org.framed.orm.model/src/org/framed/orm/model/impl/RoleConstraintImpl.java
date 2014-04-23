/**
 */
package org.framed.orm.model.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.framed.orm.model.AbstractRole;
import org.framed.orm.model.OrmPackage;
import org.framed.orm.model.RoleConstraint;
import org.framed.orm.model.RoleType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Role Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.framed.orm.model.impl.RoleConstraintImpl#getEnds <em>Ends</em>}</li>
 *   <li>{@link org.framed.orm.model.impl.RoleConstraintImpl#getSecond <em>Second</em>}</li>
 *   <li>{@link org.framed.orm.model.impl.RoleConstraintImpl#getFirst <em>First</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class RoleConstraintImpl extends ConstraintImpl implements RoleConstraint {
  /**
   * The cached value of the '{@link #getEnds() <em>Ends</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEnds()
   * @generated
   * @ordered
   */
  protected EList<RoleType> ends;

  /**
   * The cached value of the '{@link #getSecond() <em>Second</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSecond()
   * @generated
   * @ordered
   */
  protected AbstractRole second;

  /**
   * The cached value of the '{@link #getFirst() <em>First</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFirst()
   * @generated
   * @ordered
   */
  protected AbstractRole first;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RoleConstraintImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return OrmPackage.Literals.ROLE_CONSTRAINT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<RoleType> getEnds() {
    if (ends == null) {
      ends = new EObjectResolvingEList<RoleType>(RoleType.class, this, OrmPackage.ROLE_CONSTRAINT__ENDS);
    }
    return ends;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbstractRole getSecond() {
    if (second != null && second.eIsProxy()) {
      InternalEObject oldSecond = (InternalEObject)second;
      second = (AbstractRole)eResolveProxy(oldSecond);
      if (second != oldSecond) {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, OrmPackage.ROLE_CONSTRAINT__SECOND, oldSecond, second));
      }
    }
    return second;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbstractRole basicGetSecond() {
    return second;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSecond(AbstractRole newSecond) {
    AbstractRole oldSecond = second;
    second = newSecond;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ROLE_CONSTRAINT__SECOND, oldSecond, second));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbstractRole getFirst() {
    if (first != null && first.eIsProxy()) {
      InternalEObject oldFirst = (InternalEObject)first;
      first = (AbstractRole)eResolveProxy(oldFirst);
      if (first != oldFirst) {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, OrmPackage.ROLE_CONSTRAINT__FIRST, oldFirst, first));
      }
    }
    return first;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbstractRole basicGetFirst() {
    return first;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFirst(AbstractRole newFirst) {
    AbstractRole oldFirst = first;
    first = newFirst;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ROLE_CONSTRAINT__FIRST, oldFirst, first));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID) {
      case OrmPackage.ROLE_CONSTRAINT__ENDS:
        return getEnds();
      case OrmPackage.ROLE_CONSTRAINT__SECOND:
        if (resolve) return getSecond();
        return basicGetSecond();
      case OrmPackage.ROLE_CONSTRAINT__FIRST:
        if (resolve) return getFirst();
        return basicGetFirst();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue) {
    switch (featureID) {
      case OrmPackage.ROLE_CONSTRAINT__ENDS:
        getEnds().clear();
        getEnds().addAll((Collection<? extends RoleType>)newValue);
        return;
      case OrmPackage.ROLE_CONSTRAINT__SECOND:
        setSecond((AbstractRole)newValue);
        return;
      case OrmPackage.ROLE_CONSTRAINT__FIRST:
        setFirst((AbstractRole)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID) {
    switch (featureID) {
      case OrmPackage.ROLE_CONSTRAINT__ENDS:
        getEnds().clear();
        return;
      case OrmPackage.ROLE_CONSTRAINT__SECOND:
        setSecond((AbstractRole)null);
        return;
      case OrmPackage.ROLE_CONSTRAINT__FIRST:
        setFirst((AbstractRole)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID) {
    switch (featureID) {
      case OrmPackage.ROLE_CONSTRAINT__ENDS:
        return ends != null && !ends.isEmpty();
      case OrmPackage.ROLE_CONSTRAINT__SECOND:
        return second != null;
      case OrmPackage.ROLE_CONSTRAINT__FIRST:
        return first != null;
    }
    return super.eIsSet(featureID);
  }

} //RoleConstraintImpl
