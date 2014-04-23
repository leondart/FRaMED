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

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.framed.orm.model.Attribute;
import org.framed.orm.model.Methode;
import org.framed.orm.model.OrmPackage;
import org.framed.orm.model.Relation;
import org.framed.orm.model.Type;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.framed.orm.model.impl.TypeImpl#getIncomingLinks <em>Incoming Links</em>}</li>
 *   <li>{@link org.framed.orm.model.impl.TypeImpl#getOutgoingLinks <em>Outgoing Links</em>}</li>
 *   <li>{@link org.framed.orm.model.impl.TypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.framed.orm.model.impl.TypeImpl#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link org.framed.orm.model.impl.TypeImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link org.framed.orm.model.impl.TypeImpl#getOperations <em>Operations</em>}</li>
 *   <li>{@link org.framed.orm.model.impl.TypeImpl#isIsExpand <em>Is Expand</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class TypeImpl extends MinimalEObjectImpl.Container implements Type {
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
   * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAttributes()
   * @generated
   * @ordered
   */
  protected EList<Attribute> attributes;

  /**
   * The cached value of the '{@link #getOperations() <em>Operations</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperations()
   * @generated
   * @ordered
   */
  protected EList<Methode> operations;

  /**
   * The default value of the '{@link #isIsExpand() <em>Is Expand</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsExpand()
   * @generated
   * @ordered
   */
  protected static final boolean IS_EXPAND_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isIsExpand() <em>Is Expand</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsExpand()
   * @generated
   * @ordered
   */
  protected boolean isExpand = IS_EXPAND_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TypeImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return OrmPackage.Literals.TYPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Relation> getIncomingLinks() {
    if (incomingLinks == null) {
      incomingLinks = new EObjectWithInverseResolvingEList<Relation>(Relation.class, this, OrmPackage.TYPE__INCOMING_LINKS, OrmPackage.RELATION__TARGET);
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
      outgoingLinks = new EObjectWithInverseResolvingEList<Relation>(Relation.class, this, OrmPackage.TYPE__OUTGOING_LINKS, OrmPackage.RELATION__SOURCE);
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
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.TYPE__NAME, oldName, name));
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
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.TYPE__CONSTRAINTS, oldConstraints, constraints));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Attribute> getAttributes() {
    if (attributes == null) {
      attributes = new EObjectContainmentWithInverseEList<Attribute>(Attribute.class, this, OrmPackage.TYPE__ATTRIBUTES, OrmPackage.ATTRIBUTE__TYPE);
    }
    return attributes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Methode> getOperations() {
    if (operations == null) {
      operations = new EObjectContainmentWithInverseEList<Methode>(Methode.class, this, OrmPackage.TYPE__OPERATIONS, OrmPackage.METHODE__TYPE);
    }
    return operations;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isIsExpand() {
    return isExpand;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIsExpand(boolean newIsExpand) {
    boolean oldIsExpand = isExpand;
    isExpand = newIsExpand;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.TYPE__IS_EXPAND, oldIsExpand, isExpand));
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
      case OrmPackage.TYPE__INCOMING_LINKS:
        return ((InternalEList<InternalEObject>)(InternalEList<?>)getIncomingLinks()).basicAdd(otherEnd, msgs);
      case OrmPackage.TYPE__OUTGOING_LINKS:
        return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutgoingLinks()).basicAdd(otherEnd, msgs);
      case OrmPackage.TYPE__ATTRIBUTES:
        return ((InternalEList<InternalEObject>)(InternalEList<?>)getAttributes()).basicAdd(otherEnd, msgs);
      case OrmPackage.TYPE__OPERATIONS:
        return ((InternalEList<InternalEObject>)(InternalEList<?>)getOperations()).basicAdd(otherEnd, msgs);
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
      case OrmPackage.TYPE__INCOMING_LINKS:
        return ((InternalEList<?>)getIncomingLinks()).basicRemove(otherEnd, msgs);
      case OrmPackage.TYPE__OUTGOING_LINKS:
        return ((InternalEList<?>)getOutgoingLinks()).basicRemove(otherEnd, msgs);
      case OrmPackage.TYPE__ATTRIBUTES:
        return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
      case OrmPackage.TYPE__OPERATIONS:
        return ((InternalEList<?>)getOperations()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID) {
      case OrmPackage.TYPE__INCOMING_LINKS:
        return getIncomingLinks();
      case OrmPackage.TYPE__OUTGOING_LINKS:
        return getOutgoingLinks();
      case OrmPackage.TYPE__NAME:
        return getName();
      case OrmPackage.TYPE__CONSTRAINTS:
        return getConstraints();
      case OrmPackage.TYPE__ATTRIBUTES:
        return getAttributes();
      case OrmPackage.TYPE__OPERATIONS:
        return getOperations();
      case OrmPackage.TYPE__IS_EXPAND:
        return isIsExpand();
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
      case OrmPackage.TYPE__INCOMING_LINKS:
        getIncomingLinks().clear();
        getIncomingLinks().addAll((Collection<? extends Relation>)newValue);
        return;
      case OrmPackage.TYPE__OUTGOING_LINKS:
        getOutgoingLinks().clear();
        getOutgoingLinks().addAll((Collection<? extends Relation>)newValue);
        return;
      case OrmPackage.TYPE__NAME:
        setName((String)newValue);
        return;
      case OrmPackage.TYPE__CONSTRAINTS:
        setConstraints((Rectangle)newValue);
        return;
      case OrmPackage.TYPE__ATTRIBUTES:
        getAttributes().clear();
        getAttributes().addAll((Collection<? extends Attribute>)newValue);
        return;
      case OrmPackage.TYPE__OPERATIONS:
        getOperations().clear();
        getOperations().addAll((Collection<? extends Methode>)newValue);
        return;
      case OrmPackage.TYPE__IS_EXPAND:
        setIsExpand((Boolean)newValue);
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
      case OrmPackage.TYPE__INCOMING_LINKS:
        getIncomingLinks().clear();
        return;
      case OrmPackage.TYPE__OUTGOING_LINKS:
        getOutgoingLinks().clear();
        return;
      case OrmPackage.TYPE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case OrmPackage.TYPE__CONSTRAINTS:
        setConstraints(CONSTRAINTS_EDEFAULT);
        return;
      case OrmPackage.TYPE__ATTRIBUTES:
        getAttributes().clear();
        return;
      case OrmPackage.TYPE__OPERATIONS:
        getOperations().clear();
        return;
      case OrmPackage.TYPE__IS_EXPAND:
        setIsExpand(IS_EXPAND_EDEFAULT);
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
      case OrmPackage.TYPE__INCOMING_LINKS:
        return incomingLinks != null && !incomingLinks.isEmpty();
      case OrmPackage.TYPE__OUTGOING_LINKS:
        return outgoingLinks != null && !outgoingLinks.isEmpty();
      case OrmPackage.TYPE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case OrmPackage.TYPE__CONSTRAINTS:
        return CONSTRAINTS_EDEFAULT == null ? constraints != null : !CONSTRAINTS_EDEFAULT.equals(constraints);
      case OrmPackage.TYPE__ATTRIBUTES:
        return attributes != null && !attributes.isEmpty();
      case OrmPackage.TYPE__OPERATIONS:
        return operations != null && !operations.isEmpty();
      case OrmPackage.TYPE__IS_EXPAND:
        return isExpand != IS_EXPAND_EDEFAULT;
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
    result.append(", isExpand: ");
    result.append(isExpand);
    result.append(')');
    return result.toString();
  }

} //TypeImpl
