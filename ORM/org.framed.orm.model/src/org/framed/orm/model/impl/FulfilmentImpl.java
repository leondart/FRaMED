/**
 */
package org.framed.orm.model.impl;

import java.util.Collection;

import org.eclipse.draw2d.geometry.Point;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EcoreUtil;

import org.framed.orm.model.Fulfilment;
import org.framed.orm.model.Node;
import org.framed.orm.model.OrmPackage;
import org.framed.orm.model.RelationContainer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fulfilment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.framed.orm.model.impl.FulfilmentImpl#getRelationContainer <em>Relation Container</em>}</li>
 *   <li>{@link org.framed.orm.model.impl.FulfilmentImpl#getBendpoints <em>Bendpoints</em>}</li>
 *   <li>{@link org.framed.orm.model.impl.FulfilmentImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.framed.orm.model.impl.FulfilmentImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.framed.orm.model.impl.FulfilmentImpl#getFufilledRole <em>Fufilled Role</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FulfilmentImpl extends MinimalEObjectImpl.Container implements Fulfilment {
  /**
   * The cached value of the '{@link #getBendpoints() <em>Bendpoints</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBendpoints()
   * @generated
   * @ordered
   */
  protected EList<Point> bendpoints;

  /**
   * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTarget()
   * @generated
   * @ordered
   */
  protected Node target;

  /**
   * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSource()
   * @generated
   * @ordered
   */
  protected Node source;

  /**
   * The default value of the '{@link #getFufilledRole() <em>Fufilled Role</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFufilledRole()
   * @generated
   * @ordered
   */
  protected static final String FUFILLED_ROLE_EDEFAULT = "<...>";

  /**
   * The cached value of the '{@link #getFufilledRole() <em>Fufilled Role</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFufilledRole()
   * @generated
   * @ordered
   */
  protected String fufilledRole = FUFILLED_ROLE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FulfilmentImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return OrmPackage.Literals.FULFILMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RelationContainer getRelationContainer() {
    if (eContainerFeatureID() != OrmPackage.FULFILMENT__RELATION_CONTAINER) return null;
    return (RelationContainer)eInternalContainer();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRelationContainer(RelationContainer newRelationContainer, NotificationChain msgs) {
    msgs = eBasicSetContainer((InternalEObject)newRelationContainer, OrmPackage.FULFILMENT__RELATION_CONTAINER, msgs);
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRelationContainer(RelationContainer newRelationContainer) {
    if (newRelationContainer != eInternalContainer() || (eContainerFeatureID() != OrmPackage.FULFILMENT__RELATION_CONTAINER && newRelationContainer != null)) {
      if (EcoreUtil.isAncestor(this, newRelationContainer))
        throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
      NotificationChain msgs = null;
      if (eInternalContainer() != null)
        msgs = eBasicRemoveFromContainer(msgs);
      if (newRelationContainer != null)
        msgs = ((InternalEObject)newRelationContainer).eInverseAdd(this, OrmPackage.RELATION_CONTAINER__RELATIONS, RelationContainer.class, msgs);
      msgs = basicSetRelationContainer(newRelationContainer, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.FULFILMENT__RELATION_CONTAINER, newRelationContainer, newRelationContainer));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Point> getBendpoints() {
    if (bendpoints == null) {
      bendpoints = new EDataTypeUniqueEList<Point>(Point.class, this, OrmPackage.FULFILMENT__BENDPOINTS);
    }
    return bendpoints;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Node getTarget() {
    if (target != null && target.eIsProxy()) {
      InternalEObject oldTarget = (InternalEObject)target;
      target = (Node)eResolveProxy(oldTarget);
      if (target != oldTarget) {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, OrmPackage.FULFILMENT__TARGET, oldTarget, target));
      }
    }
    return target;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Node basicGetTarget() {
    return target;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTarget(Node newTarget, NotificationChain msgs) {
    Node oldTarget = target;
    target = newTarget;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.FULFILMENT__TARGET, oldTarget, newTarget);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTarget(Node newTarget) {
    if (newTarget != target) {
      NotificationChain msgs = null;
      if (target != null)
        msgs = ((InternalEObject)target).eInverseRemove(this, OrmPackage.NODE__INCOMING_LINKS, Node.class, msgs);
      if (newTarget != null)
        msgs = ((InternalEObject)newTarget).eInverseAdd(this, OrmPackage.NODE__INCOMING_LINKS, Node.class, msgs);
      msgs = basicSetTarget(newTarget, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.FULFILMENT__TARGET, newTarget, newTarget));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Node getSource() {
    if (source != null && source.eIsProxy()) {
      InternalEObject oldSource = (InternalEObject)source;
      source = (Node)eResolveProxy(oldSource);
      if (source != oldSource) {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, OrmPackage.FULFILMENT__SOURCE, oldSource, source));
      }
    }
    return source;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Node basicGetSource() {
    return source;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSource(Node newSource, NotificationChain msgs) {
    Node oldSource = source;
    source = newSource;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.FULFILMENT__SOURCE, oldSource, newSource);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSource(Node newSource) {
    if (newSource != source) {
      NotificationChain msgs = null;
      if (source != null)
        msgs = ((InternalEObject)source).eInverseRemove(this, OrmPackage.NODE__OUTGOING_LINKS, Node.class, msgs);
      if (newSource != null)
        msgs = ((InternalEObject)newSource).eInverseAdd(this, OrmPackage.NODE__OUTGOING_LINKS, Node.class, msgs);
      msgs = basicSetSource(newSource, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.FULFILMENT__SOURCE, newSource, newSource));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getFufilledRole() {
    return fufilledRole;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFufilledRole(String newFufilledRole) {
    String oldFufilledRole = fufilledRole;
    fufilledRole = newFufilledRole;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.FULFILMENT__FUFILLED_ROLE, oldFufilledRole, fufilledRole));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID) {
      case OrmPackage.FULFILMENT__RELATION_CONTAINER:
        if (eInternalContainer() != null)
          msgs = eBasicRemoveFromContainer(msgs);
        return basicSetRelationContainer((RelationContainer)otherEnd, msgs);
      case OrmPackage.FULFILMENT__TARGET:
        if (target != null)
          msgs = ((InternalEObject)target).eInverseRemove(this, OrmPackage.NODE__INCOMING_LINKS, Node.class, msgs);
        return basicSetTarget((Node)otherEnd, msgs);
      case OrmPackage.FULFILMENT__SOURCE:
        if (source != null)
          msgs = ((InternalEObject)source).eInverseRemove(this, OrmPackage.NODE__OUTGOING_LINKS, Node.class, msgs);
        return basicSetSource((Node)otherEnd, msgs);
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
      case OrmPackage.FULFILMENT__RELATION_CONTAINER:
        return basicSetRelationContainer(null, msgs);
      case OrmPackage.FULFILMENT__TARGET:
        return basicSetTarget(null, msgs);
      case OrmPackage.FULFILMENT__SOURCE:
        return basicSetSource(null, msgs);
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
      case OrmPackage.FULFILMENT__RELATION_CONTAINER:
        return eInternalContainer().eInverseRemove(this, OrmPackage.RELATION_CONTAINER__RELATIONS, RelationContainer.class, msgs);
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
      case OrmPackage.FULFILMENT__RELATION_CONTAINER:
        return getRelationContainer();
      case OrmPackage.FULFILMENT__BENDPOINTS:
        return getBendpoints();
      case OrmPackage.FULFILMENT__TARGET:
        if (resolve) return getTarget();
        return basicGetTarget();
      case OrmPackage.FULFILMENT__SOURCE:
        if (resolve) return getSource();
        return basicGetSource();
      case OrmPackage.FULFILMENT__FUFILLED_ROLE:
        return getFufilledRole();
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
      case OrmPackage.FULFILMENT__RELATION_CONTAINER:
        setRelationContainer((RelationContainer)newValue);
        return;
      case OrmPackage.FULFILMENT__BENDPOINTS:
        getBendpoints().clear();
        getBendpoints().addAll((Collection<? extends Point>)newValue);
        return;
      case OrmPackage.FULFILMENT__TARGET:
        setTarget((Node)newValue);
        return;
      case OrmPackage.FULFILMENT__SOURCE:
        setSource((Node)newValue);
        return;
      case OrmPackage.FULFILMENT__FUFILLED_ROLE:
        setFufilledRole((String)newValue);
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
      case OrmPackage.FULFILMENT__RELATION_CONTAINER:
        setRelationContainer((RelationContainer)null);
        return;
      case OrmPackage.FULFILMENT__BENDPOINTS:
        getBendpoints().clear();
        return;
      case OrmPackage.FULFILMENT__TARGET:
        setTarget((Node)null);
        return;
      case OrmPackage.FULFILMENT__SOURCE:
        setSource((Node)null);
        return;
      case OrmPackage.FULFILMENT__FUFILLED_ROLE:
        setFufilledRole(FUFILLED_ROLE_EDEFAULT);
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
      case OrmPackage.FULFILMENT__RELATION_CONTAINER:
        return getRelationContainer() != null;
      case OrmPackage.FULFILMENT__BENDPOINTS:
        return bendpoints != null && !bendpoints.isEmpty();
      case OrmPackage.FULFILMENT__TARGET:
        return target != null;
      case OrmPackage.FULFILMENT__SOURCE:
        return source != null;
      case OrmPackage.FULFILMENT__FUFILLED_ROLE:
        return FUFILLED_ROLE_EDEFAULT == null ? fufilledRole != null : !FUFILLED_ROLE_EDEFAULT.equals(fufilledRole);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString() {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (bendpoints: ");
    result.append(bendpoints);
    result.append(", fufilledRole: ");
    result.append(fufilledRole);
    result.append(')');
    return result.toString();
  }

} //FulfilmentImpl
