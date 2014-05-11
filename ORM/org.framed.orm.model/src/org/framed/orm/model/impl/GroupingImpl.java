/**
 */
package org.framed.orm.model.impl;

import java.util.Collection;

import org.eclipse.draw2d.geometry.Rectangle;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.framed.orm.model.CompartmentDiagram;
import org.framed.orm.model.Grouping;
import org.framed.orm.model.OrmPackage;
import org.framed.orm.model.Relation;
import org.framed.orm.model.Rolemodel;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Grouping</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.framed.orm.model.impl.GroupingImpl#getIncomingLinks <em>Incoming Links</em>}</li>
 *   <li>{@link org.framed.orm.model.impl.GroupingImpl#getOutgoingLinks <em>Outgoing Links</em>}</li>
 *   <li>{@link org.framed.orm.model.impl.GroupingImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.framed.orm.model.impl.GroupingImpl#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link org.framed.orm.model.impl.GroupingImpl#getCd <em>Cd</em>}</li>
 *   <li>{@link org.framed.orm.model.impl.GroupingImpl#getRolemodel <em>Rolemodel</em>}</li>
 *   <li>{@link org.framed.orm.model.impl.GroupingImpl#getParentRolemodel <em>Parent Rolemodel</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GroupingImpl extends MinimalEObjectImpl.Container implements Grouping {
  /**
   * The cached value of the '{@link #getIncomingLinks() <em>Incoming Links</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIncomingLinks()
   * @generated
   * @ordered
   */
  protected EList<Relation> incomingLinks;

  /**
   * The cached value of the '{@link #getOutgoingLinks() <em>Outgoing Links</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOutgoingLinks()
   * @generated
   * @ordered
   */
  protected EList<Relation> outgoingLinks;

  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = "<...>";

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getConstraints() <em>Constraints</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConstraints()
   * @generated
   * @ordered
   */
  protected static final Rectangle CONSTRAINTS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getConstraints() <em>Constraints</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConstraints()
   * @generated
   * @ordered
   */
  protected Rectangle constraints = CONSTRAINTS_EDEFAULT;

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
  protected GroupingImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return OrmPackage.Literals.GROUPING;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Relation> getIncomingLinks() {
    if (incomingLinks == null) {
      incomingLinks = new EObjectWithInverseResolvingEList<Relation>(Relation.class, this, OrmPackage.GROUPING__INCOMING_LINKS, OrmPackage.RELATION__TARGET);
    }
    return incomingLinks;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Relation> getOutgoingLinks() {
    if (outgoingLinks == null) {
      outgoingLinks = new EObjectWithInverseResolvingEList<Relation>(Relation.class, this, OrmPackage.GROUPING__OUTGOING_LINKS, OrmPackage.RELATION__SOURCE);
    }
    return outgoingLinks;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName() {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName) {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.GROUPING__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Rectangle getConstraints() {
    return constraints;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setConstraints(Rectangle newConstraints) {
    Rectangle oldConstraints = constraints;
    constraints = newConstraints;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.GROUPING__CONSTRAINTS, oldConstraints, constraints));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CompartmentDiagram getCompartmentDiagram() {
    if (eContainerFeatureID() != OrmPackage.GROUPING__CD) return null;
    return (CompartmentDiagram)eInternalContainer();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCd(CompartmentDiagram newCd, NotificationChain msgs) {
    msgs = eBasicSetContainer((InternalEObject)newCd, OrmPackage.GROUPING__CD, msgs);
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCd(CompartmentDiagram newCd) {
    if (newCd != eInternalContainer() || (eContainerFeatureID() != OrmPackage.GROUPING__CD && newCd != null)) {
      if (EcoreUtil.isAncestor(this, newCd))
        throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
      NotificationChain msgs = null;
      if (eInternalContainer() != null)
        msgs = eBasicRemoveFromContainer(msgs);
      if (newCd != null)
        msgs = ((InternalEObject)newCd).eInverseAdd(this, OrmPackage.COMPARTMENT_DIAGRAM__GROUPS, CompartmentDiagram.class, msgs);
      msgs = basicSetCd(newCd, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.GROUPING__CD, newCd, newCd));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.GROUPING__ROLEMODEL, oldRolemodel, newRolemodel);
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
        msgs = ((InternalEObject)rolemodel).eInverseRemove(this, OrmPackage.ROLEMODEL__PARENT_GROUP, Rolemodel.class, msgs);
      if (newRolemodel != null)
        msgs = ((InternalEObject)newRolemodel).eInverseAdd(this, OrmPackage.ROLEMODEL__PARENT_GROUP, Rolemodel.class, msgs);
      msgs = basicSetRolemodel(newRolemodel, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.GROUPING__ROLEMODEL, newRolemodel, newRolemodel));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Rolemodel getParentRolemodel() {
    if (eContainerFeatureID() != OrmPackage.GROUPING__PARENT_ROLEMODEL) return null;
    return (Rolemodel)eInternalContainer();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetParentRolemodel(Rolemodel newParentRolemodel, NotificationChain msgs) {
    msgs = eBasicSetContainer((InternalEObject)newParentRolemodel, OrmPackage.GROUPING__PARENT_ROLEMODEL, msgs);
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setParentRolemodel(Rolemodel newParentRolemodel) {
    if (newParentRolemodel != eInternalContainer() || (eContainerFeatureID() != OrmPackage.GROUPING__PARENT_ROLEMODEL && newParentRolemodel != null)) {
      if (EcoreUtil.isAncestor(this, newParentRolemodel))
        throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
      NotificationChain msgs = null;
      if (eInternalContainer() != null)
        msgs = eBasicRemoveFromContainer(msgs);
      if (newParentRolemodel != null)
        msgs = ((InternalEObject)newParentRolemodel).eInverseAdd(this, OrmPackage.ROLEMODEL__GROUPS, Rolemodel.class, msgs);
      msgs = basicSetParentRolemodel(newParentRolemodel, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.GROUPING__PARENT_ROLEMODEL, newParentRolemodel, newParentRolemodel));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID) {
      case OrmPackage.GROUPING__INCOMING_LINKS:
        return ((InternalEList<InternalEObject>)(InternalEList<?>)getIncomingLinks()).basicAdd(otherEnd, msgs);
      case OrmPackage.GROUPING__OUTGOING_LINKS:
        return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutgoingLinks()).basicAdd(otherEnd, msgs);
      case OrmPackage.GROUPING__CD:
        if (eInternalContainer() != null)
          msgs = eBasicRemoveFromContainer(msgs);
        return basicSetCd((CompartmentDiagram)otherEnd, msgs);
      case OrmPackage.GROUPING__ROLEMODEL:
        if (rolemodel != null)
          msgs = ((InternalEObject)rolemodel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmPackage.GROUPING__ROLEMODEL, null, msgs);
        return basicSetRolemodel((Rolemodel)otherEnd, msgs);
      case OrmPackage.GROUPING__PARENT_ROLEMODEL:
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
      case OrmPackage.GROUPING__INCOMING_LINKS:
        return ((InternalEList<?>)getIncomingLinks()).basicRemove(otherEnd, msgs);
      case OrmPackage.GROUPING__OUTGOING_LINKS:
        return ((InternalEList<?>)getOutgoingLinks()).basicRemove(otherEnd, msgs);
      case OrmPackage.GROUPING__CD:
        return basicSetCd(null, msgs);
      case OrmPackage.GROUPING__ROLEMODEL:
        return basicSetRolemodel(null, msgs);
      case OrmPackage.GROUPING__PARENT_ROLEMODEL:
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
      case OrmPackage.GROUPING__CD:
        return eInternalContainer().eInverseRemove(this, OrmPackage.COMPARTMENT_DIAGRAM__GROUPS, CompartmentDiagram.class, msgs);
      case OrmPackage.GROUPING__PARENT_ROLEMODEL:
        return eInternalContainer().eInverseRemove(this, OrmPackage.ROLEMODEL__GROUPS, Rolemodel.class, msgs);
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
      case OrmPackage.GROUPING__INCOMING_LINKS:
        return getIncomingLinks();
      case OrmPackage.GROUPING__OUTGOING_LINKS:
        return getOutgoingLinks();
      case OrmPackage.GROUPING__NAME:
        return getName();
      case OrmPackage.GROUPING__CONSTRAINTS:
        return getConstraints();
      case OrmPackage.GROUPING__CD:
        return getCompartmentDiagram();
      case OrmPackage.GROUPING__ROLEMODEL:
        return getRolemodel();
      case OrmPackage.GROUPING__PARENT_ROLEMODEL:
        return getParentRolemodel();
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
      case OrmPackage.GROUPING__INCOMING_LINKS:
        getIncomingLinks().clear();
        getIncomingLinks().addAll((Collection<? extends Relation>)newValue);
        return;
      case OrmPackage.GROUPING__OUTGOING_LINKS:
        getOutgoingLinks().clear();
        getOutgoingLinks().addAll((Collection<? extends Relation>)newValue);
        return;
      case OrmPackage.GROUPING__NAME:
        setName((String)newValue);
        return;
      case OrmPackage.GROUPING__CONSTRAINTS:
        setConstraints((Rectangle)newValue);
        return;
      case OrmPackage.GROUPING__CD:
        setCd((CompartmentDiagram)newValue);
        return;
      case OrmPackage.GROUPING__ROLEMODEL:
        setRolemodel((Rolemodel)newValue);
        return;
      case OrmPackage.GROUPING__PARENT_ROLEMODEL:
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
      case OrmPackage.GROUPING__INCOMING_LINKS:
        getIncomingLinks().clear();
        return;
      case OrmPackage.GROUPING__OUTGOING_LINKS:
        getOutgoingLinks().clear();
        return;
      case OrmPackage.GROUPING__NAME:
        setName(NAME_EDEFAULT);
        return;
      case OrmPackage.GROUPING__CONSTRAINTS:
        setConstraints(CONSTRAINTS_EDEFAULT);
        return;
      case OrmPackage.GROUPING__CD:
        setCd((CompartmentDiagram)null);
        return;
      case OrmPackage.GROUPING__ROLEMODEL:
        setRolemodel((Rolemodel)null);
        return;
      case OrmPackage.GROUPING__PARENT_ROLEMODEL:
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
      case OrmPackage.GROUPING__INCOMING_LINKS:
        return incomingLinks != null && !incomingLinks.isEmpty();
      case OrmPackage.GROUPING__OUTGOING_LINKS:
        return outgoingLinks != null && !outgoingLinks.isEmpty();
      case OrmPackage.GROUPING__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case OrmPackage.GROUPING__CONSTRAINTS:
        return CONSTRAINTS_EDEFAULT == null ? constraints != null : !CONSTRAINTS_EDEFAULT.equals(constraints);
      case OrmPackage.GROUPING__CD:
        return getCompartmentDiagram() != null;
      case OrmPackage.GROUPING__ROLEMODEL:
        return rolemodel != null;
      case OrmPackage.GROUPING__PARENT_ROLEMODEL:
        return getParentRolemodel() != null;
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
    result.append(" (Name: ");
    result.append(name);
    result.append(", constraints: ");
    result.append(constraints);
    result.append(')');
    return result.toString();
  }

} //GroupingImpl
