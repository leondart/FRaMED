/**
 */
package org.framed.orm.model.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import org.framed.orm.model.Compartment;
import org.framed.orm.model.CompartmentDiagram;
import org.framed.orm.model.OrmPackage;
import org.framed.orm.model.Rolemodel;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Compartment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.framed.orm.model.impl.CompartmentImpl#getCd <em>Cd</em>}</li>
 *   <li>{@link org.framed.orm.model.impl.CompartmentImpl#getRolemodel <em>Rolemodel</em>}</li>
 *   <li>{@link org.framed.orm.model.impl.CompartmentImpl#getParentRolemodel <em>Parent Rolemodel</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CompartmentImpl extends TypeImpl implements Compartment {
  /**
   * The cached value of the '{@link #getRolemodel() <em>Rolemodel</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRolemodel()
   * @generated
   * @ordered
   */
  protected Rolemodel rolemodel;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CompartmentImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return OrmPackage.Literals.COMPARTMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CompartmentDiagram getCd() {
    if (eContainerFeatureID() != OrmPackage.COMPARTMENT__CD) return null;
    return (CompartmentDiagram)eInternalContainer();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCd(CompartmentDiagram newCd, NotificationChain msgs) {
    msgs = eBasicSetContainer((InternalEObject)newCd, OrmPackage.COMPARTMENT__CD, msgs);
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCd(CompartmentDiagram newCd) {
    if (newCd != eInternalContainer() || (eContainerFeatureID() != OrmPackage.COMPARTMENT__CD && newCd != null)) {
      if (EcoreUtil.isAncestor(this, newCd))
        throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
      NotificationChain msgs = null;
      if (eInternalContainer() != null)
        msgs = eBasicRemoveFromContainer(msgs);
      if (newCd != null)
        msgs = ((InternalEObject)newCd).eInverseAdd(this, OrmPackage.COMPARTMENT_DIAGRAM__COMPARTMENTS, CompartmentDiagram.class, msgs);
      msgs = basicSetCd(newCd, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.COMPARTMENT__CD, newCd, newCd));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Rolemodel getRolemodel() {
    return rolemodel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRolemodel(Rolemodel newRolemodel, NotificationChain msgs) {
    Rolemodel oldRolemodel = rolemodel;
    rolemodel = newRolemodel;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.COMPARTMENT__ROLEMODEL, oldRolemodel, newRolemodel);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRolemodel(Rolemodel newRolemodel) {
    if (newRolemodel != rolemodel) {
      NotificationChain msgs = null;
      if (rolemodel != null)
        msgs = ((InternalEObject)rolemodel).eInverseRemove(this, OrmPackage.ROLEMODEL__CT, Rolemodel.class, msgs);
      if (newRolemodel != null)
        msgs = ((InternalEObject)newRolemodel).eInverseAdd(this, OrmPackage.ROLEMODEL__CT, Rolemodel.class, msgs);
      msgs = basicSetRolemodel(newRolemodel, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.COMPARTMENT__ROLEMODEL, newRolemodel, newRolemodel));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Rolemodel getParentRolemodel() {
    if (eContainerFeatureID() != OrmPackage.COMPARTMENT__PARENT_ROLEMODEL) return null;
    return (Rolemodel)eInternalContainer();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetParentRolemodel(Rolemodel newParentRolemodel, NotificationChain msgs) {
    msgs = eBasicSetContainer((InternalEObject)newParentRolemodel, OrmPackage.COMPARTMENT__PARENT_ROLEMODEL, msgs);
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setParentRolemodel(Rolemodel newParentRolemodel) {
    if (newParentRolemodel != eInternalContainer() || (eContainerFeatureID() != OrmPackage.COMPARTMENT__PARENT_ROLEMODEL && newParentRolemodel != null)) {
      if (EcoreUtil.isAncestor(this, newParentRolemodel))
        throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
      NotificationChain msgs = null;
      if (eInternalContainer() != null)
        msgs = eBasicRemoveFromContainer(msgs);
      if (newParentRolemodel != null)
        msgs = ((InternalEObject)newParentRolemodel).eInverseAdd(this, OrmPackage.ROLEMODEL__SUBCONTEXTS, Rolemodel.class, msgs);
      msgs = basicSetParentRolemodel(newParentRolemodel, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.COMPARTMENT__PARENT_ROLEMODEL, newParentRolemodel, newParentRolemodel));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID) {
      case OrmPackage.COMPARTMENT__CD:
        if (eInternalContainer() != null)
          msgs = eBasicRemoveFromContainer(msgs);
        return basicSetCd((CompartmentDiagram)otherEnd, msgs);
      case OrmPackage.COMPARTMENT__ROLEMODEL:
        if (rolemodel != null)
          msgs = ((InternalEObject)rolemodel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmPackage.COMPARTMENT__ROLEMODEL, null, msgs);
        return basicSetRolemodel((Rolemodel)otherEnd, msgs);
      case OrmPackage.COMPARTMENT__PARENT_ROLEMODEL:
        if (eInternalContainer() != null)
          msgs = eBasicRemoveFromContainer(msgs);
        return basicSetParentRolemodel((Rolemodel)otherEnd, msgs);
    }
    return super.eInverseAdd(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID) {
      case OrmPackage.COMPARTMENT__CD:
        return basicSetCd(null, msgs);
      case OrmPackage.COMPARTMENT__ROLEMODEL:
        return basicSetRolemodel(null, msgs);
      case OrmPackage.COMPARTMENT__PARENT_ROLEMODEL:
        return basicSetParentRolemodel(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
    switch (eContainerFeatureID()) {
      case OrmPackage.COMPARTMENT__CD:
        return eInternalContainer().eInverseRemove(this, OrmPackage.COMPARTMENT_DIAGRAM__COMPARTMENTS, CompartmentDiagram.class, msgs);
      case OrmPackage.COMPARTMENT__PARENT_ROLEMODEL:
        return eInternalContainer().eInverseRemove(this, OrmPackage.ROLEMODEL__SUBCONTEXTS, Rolemodel.class, msgs);
    }
    return super.eBasicRemoveFromContainerFeature(msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID) {
      case OrmPackage.COMPARTMENT__CD:
        return getCd();
      case OrmPackage.COMPARTMENT__ROLEMODEL:
        return getRolemodel();
      case OrmPackage.COMPARTMENT__PARENT_ROLEMODEL:
        return getParentRolemodel();
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
      case OrmPackage.COMPARTMENT__CD:
        setCd((CompartmentDiagram)newValue);
        return;
      case OrmPackage.COMPARTMENT__ROLEMODEL:
        setRolemodel((Rolemodel)newValue);
        return;
      case OrmPackage.COMPARTMENT__PARENT_ROLEMODEL:
        setParentRolemodel((Rolemodel)newValue);
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
      case OrmPackage.COMPARTMENT__CD:
        setCd((CompartmentDiagram)null);
        return;
      case OrmPackage.COMPARTMENT__ROLEMODEL:
        setRolemodel((Rolemodel)null);
        return;
      case OrmPackage.COMPARTMENT__PARENT_ROLEMODEL:
        setParentRolemodel((Rolemodel)null);
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
      case OrmPackage.COMPARTMENT__CD:
        return getCd() != null;
      case OrmPackage.COMPARTMENT__ROLEMODEL:
        return rolemodel != null;
      case OrmPackage.COMPARTMENT__PARENT_ROLEMODEL:
        return getParentRolemodel() != null;
    }
    return super.eIsSet(featureID);
  }

} //CompartmentImpl
