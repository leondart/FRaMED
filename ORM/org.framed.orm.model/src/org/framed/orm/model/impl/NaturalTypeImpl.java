/**
 */
package org.framed.orm.model.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import org.framed.orm.model.CompartmentDiagram;
import org.framed.orm.model.NaturalType;
import org.framed.orm.model.OrmPackage;
import org.framed.orm.model.Rolemodel;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Natural Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.framed.orm.model.impl.NaturalTypeImpl#getParentRolemodel <em>Parent Rolemodel</em>}</li>
 *   <li>{@link org.framed.orm.model.impl.NaturalTypeImpl#getCompartmentDiagram <em>Compartment Diagram</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NaturalTypeImpl extends TypeImpl implements NaturalType {
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NaturalTypeImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return OrmPackage.Literals.NATURAL_TYPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Rolemodel getParentRolemodel() {
    if (eContainerFeatureID() != OrmPackage.NATURAL_TYPE__PARENT_ROLEMODEL) return null;
    return (Rolemodel)eInternalContainer();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetParentRolemodel(Rolemodel newParentRolemodel, NotificationChain msgs) {
    msgs = eBasicSetContainer((InternalEObject)newParentRolemodel, OrmPackage.NATURAL_TYPE__PARENT_ROLEMODEL, msgs);
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setParentRolemodel(Rolemodel newParentRolemodel) {
    if (newParentRolemodel != eInternalContainer() || (eContainerFeatureID() != OrmPackage.NATURAL_TYPE__PARENT_ROLEMODEL && newParentRolemodel != null)) {
      if (EcoreUtil.isAncestor(this, newParentRolemodel))
        throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
      NotificationChain msgs = null;
      if (eInternalContainer() != null)
        msgs = eBasicRemoveFromContainer(msgs);
      if (newParentRolemodel != null)
        msgs = ((InternalEObject)newParentRolemodel).eInverseAdd(this, OrmPackage.ROLEMODEL__PLAYERS, Rolemodel.class, msgs);
      msgs = basicSetParentRolemodel(newParentRolemodel, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.NATURAL_TYPE__PARENT_ROLEMODEL, newParentRolemodel, newParentRolemodel));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CompartmentDiagram getCompartmentDiagram() {
    if (eContainerFeatureID() != OrmPackage.NATURAL_TYPE__COMPARTMENT_DIAGRAM) return null;
    return (CompartmentDiagram)eInternalContainer();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCompartmentDiagram(CompartmentDiagram newCompartmentDiagram, NotificationChain msgs) {
    msgs = eBasicSetContainer((InternalEObject)newCompartmentDiagram, OrmPackage.NATURAL_TYPE__COMPARTMENT_DIAGRAM, msgs);
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCompartmentDiagram(CompartmentDiagram newCompartmentDiagram) {
    if (newCompartmentDiagram != eInternalContainer() || (eContainerFeatureID() != OrmPackage.NATURAL_TYPE__COMPARTMENT_DIAGRAM && newCompartmentDiagram != null)) {
      if (EcoreUtil.isAncestor(this, newCompartmentDiagram))
        throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
      NotificationChain msgs = null;
      if (eInternalContainer() != null)
        msgs = eBasicRemoveFromContainer(msgs);
      if (newCompartmentDiagram != null)
        msgs = ((InternalEObject)newCompartmentDiagram).eInverseAdd(this, OrmPackage.COMPARTMENT_DIAGRAM__PLAYERS, CompartmentDiagram.class, msgs);
      msgs = basicSetCompartmentDiagram(newCompartmentDiagram, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.NATURAL_TYPE__COMPARTMENT_DIAGRAM, newCompartmentDiagram, newCompartmentDiagram));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID) {
      case OrmPackage.NATURAL_TYPE__PARENT_ROLEMODEL:
        if (eInternalContainer() != null)
          msgs = eBasicRemoveFromContainer(msgs);
        return basicSetParentRolemodel((Rolemodel)otherEnd, msgs);
      case OrmPackage.NATURAL_TYPE__COMPARTMENT_DIAGRAM:
        if (eInternalContainer() != null)
          msgs = eBasicRemoveFromContainer(msgs);
        return basicSetCompartmentDiagram((CompartmentDiagram)otherEnd, msgs);
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
      case OrmPackage.NATURAL_TYPE__PARENT_ROLEMODEL:
        return basicSetParentRolemodel(null, msgs);
      case OrmPackage.NATURAL_TYPE__COMPARTMENT_DIAGRAM:
        return basicSetCompartmentDiagram(null, msgs);
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
      case OrmPackage.NATURAL_TYPE__PARENT_ROLEMODEL:
        return eInternalContainer().eInverseRemove(this, OrmPackage.ROLEMODEL__PLAYERS, Rolemodel.class, msgs);
      case OrmPackage.NATURAL_TYPE__COMPARTMENT_DIAGRAM:
        return eInternalContainer().eInverseRemove(this, OrmPackage.COMPARTMENT_DIAGRAM__PLAYERS, CompartmentDiagram.class, msgs);
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
      case OrmPackage.NATURAL_TYPE__PARENT_ROLEMODEL:
        return getParentRolemodel();
      case OrmPackage.NATURAL_TYPE__COMPARTMENT_DIAGRAM:
        return getCompartmentDiagram();
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
      case OrmPackage.NATURAL_TYPE__PARENT_ROLEMODEL:
        setParentRolemodel((Rolemodel)newValue);
        return;
      case OrmPackage.NATURAL_TYPE__COMPARTMENT_DIAGRAM:
        setCompartmentDiagram((CompartmentDiagram)newValue);
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
      case OrmPackage.NATURAL_TYPE__PARENT_ROLEMODEL:
        setParentRolemodel((Rolemodel)null);
        return;
      case OrmPackage.NATURAL_TYPE__COMPARTMENT_DIAGRAM:
        setCompartmentDiagram((CompartmentDiagram)null);
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
      case OrmPackage.NATURAL_TYPE__PARENT_ROLEMODEL:
        return getParentRolemodel() != null;
      case OrmPackage.NATURAL_TYPE__COMPARTMENT_DIAGRAM:
        return getCompartmentDiagram() != null;
    }
    return super.eIsSet(featureID);
  }

} //NaturalTypeImpl
