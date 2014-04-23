/**
 */
package org.framed.orm.model.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.framed.orm.model.AbstractRole;
import org.framed.orm.model.OrmPackage;
import org.framed.orm.model.RoleInvariant;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Role Invariant</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.framed.orm.model.impl.RoleInvariantImpl#getSubject <em>Subject</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class RoleInvariantImpl extends ConstraintImpl implements RoleInvariant {
  /**
   * The cached value of the '{@link #getSubject() <em>Subject</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSubject()
   * @generated
   * @ordered
   */
  protected AbstractRole subject;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RoleInvariantImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return OrmPackage.Literals.ROLE_INVARIANT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbstractRole getSubject() {
    if (subject != null && subject.eIsProxy()) {
      InternalEObject oldSubject = (InternalEObject)subject;
      subject = (AbstractRole)eResolveProxy(oldSubject);
      if (subject != oldSubject) {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, OrmPackage.ROLE_INVARIANT__SUBJECT, oldSubject, subject));
      }
    }
    return subject;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbstractRole basicGetSubject() {
    return subject;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSubject(AbstractRole newSubject) {
    AbstractRole oldSubject = subject;
    subject = newSubject;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ROLE_INVARIANT__SUBJECT, oldSubject, subject));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID) {
      case OrmPackage.ROLE_INVARIANT__SUBJECT:
        if (resolve) return getSubject();
        return basicGetSubject();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue) {
    switch (featureID) {
      case OrmPackage.ROLE_INVARIANT__SUBJECT:
        setSubject((AbstractRole)newValue);
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
      case OrmPackage.ROLE_INVARIANT__SUBJECT:
        setSubject((AbstractRole)null);
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
      case OrmPackage.ROLE_INVARIANT__SUBJECT:
        return subject != null;
    }
    return super.eIsSet(featureID);
  }

} //RoleInvariantImpl
