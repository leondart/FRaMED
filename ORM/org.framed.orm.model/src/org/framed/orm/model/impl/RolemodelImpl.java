/**
 */
package org.framed.orm.model.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.framed.orm.model.AbstractRole;
import org.framed.orm.model.Compartment;
import org.framed.orm.model.Grouping;
import org.framed.orm.model.NaturalType;
import org.framed.orm.model.OrmPackage;
import org.framed.orm.model.Rolemodel;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rolemodel</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.framed.orm.model.impl.RolemodelImpl#getSubcontexts <em>Subcontexts</em>}</li>
 *   <li>{@link org.framed.orm.model.impl.RolemodelImpl#getParticipants <em>Participants</em>}</li>
 *   <li>{@link org.framed.orm.model.impl.RolemodelImpl#getPlayers <em>Players</em>}</li>
 *   <li>{@link org.framed.orm.model.impl.RolemodelImpl#getCt <em>Ct</em>}</li>
 *   <li>{@link org.framed.orm.model.impl.RolemodelImpl#getParentGroup <em>Parent Group</em>}</li>
 *   <li>{@link org.framed.orm.model.impl.RolemodelImpl#getGroups <em>Groups</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RolemodelImpl extends RelationContainerImpl implements Rolemodel {
  /**
   * The cached value of the '{@link #getSubcontexts() <em>Subcontexts</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSubcontexts()
   * @generated
   * @ordered
   */
  protected EList<Compartment> subcontexts;

  /**
   * The cached value of the '{@link #getParticipants() <em>Participants</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParticipants()
   * @generated
   * @ordered
   */
  protected EList<AbstractRole> participants;

  /**
   * The cached value of the '{@link #getPlayers() <em>Players</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPlayers()
   * @generated
   * @ordered
   */
  protected EList<NaturalType> players;

  /**
   * The cached value of the '{@link #getGroups() <em>Groups</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGroups()
   * @generated
   * @ordered
   */
  protected EList<Grouping> groups;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RolemodelImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return OrmPackage.Literals.ROLEMODEL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Compartment> getSubcontexts() {
    if (subcontexts == null) {
      subcontexts = new EObjectContainmentWithInverseEList<Compartment>(Compartment.class, this, OrmPackage.ROLEMODEL__SUBCONTEXTS, OrmPackage.COMPARTMENT__PARENT_ROLEMODEL);
    }
    return subcontexts;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<AbstractRole> getParticipants() {
    if (participants == null) {
      participants = new EObjectContainmentWithInverseEList<AbstractRole>(AbstractRole.class, this, OrmPackage.ROLEMODEL__PARTICIPANTS, OrmPackage.ABSTRACT_ROLE__PARENT_ROLEMODEL);
    }
    return participants;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<NaturalType> getPlayers() {
    if (players == null) {
      players = new EObjectContainmentWithInverseEList<NaturalType>(NaturalType.class, this, OrmPackage.ROLEMODEL__PLAYERS, OrmPackage.NATURAL_TYPE__PARENT_ROLEMODEL);
    }
    return players;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Compartment getCompartment() {
    if (eContainerFeatureID() != OrmPackage.ROLEMODEL__CT) return null;
    return (Compartment)eInternalContainer();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCt(Compartment newCt, NotificationChain msgs) {
    msgs = eBasicSetContainer((InternalEObject)newCt, OrmPackage.ROLEMODEL__CT, msgs);
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCt(Compartment newCt) {
    if (newCt != eInternalContainer() || (eContainerFeatureID() != OrmPackage.ROLEMODEL__CT && newCt != null)) {
      if (EcoreUtil.isAncestor(this, newCt))
        throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
      NotificationChain msgs = null;
      if (eInternalContainer() != null)
        msgs = eBasicRemoveFromContainer(msgs);
      if (newCt != null)
        msgs = ((InternalEObject)newCt).eInverseAdd(this, OrmPackage.COMPARTMENT__ROLEMODEL, Compartment.class, msgs);
      msgs = basicSetCt(newCt, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ROLEMODEL__CT, newCt, newCt));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Grouping getParentGroup() {
    if (eContainerFeatureID() != OrmPackage.ROLEMODEL__PARENT_GROUP) return null;
    return (Grouping)eInternalContainer();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetParentGroup(Grouping newParentGroup, NotificationChain msgs) {
    msgs = eBasicSetContainer((InternalEObject)newParentGroup, OrmPackage.ROLEMODEL__PARENT_GROUP, msgs);
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setParentGroup(Grouping newParentGroup) {
    if (newParentGroup != eInternalContainer() || (eContainerFeatureID() != OrmPackage.ROLEMODEL__PARENT_GROUP && newParentGroup != null)) {
      if (EcoreUtil.isAncestor(this, newParentGroup))
        throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
      NotificationChain msgs = null;
      if (eInternalContainer() != null)
        msgs = eBasicRemoveFromContainer(msgs);
      if (newParentGroup != null)
        msgs = ((InternalEObject)newParentGroup).eInverseAdd(this, OrmPackage.GROUPING__ROLEMODEL, Grouping.class, msgs);
      msgs = basicSetParentGroup(newParentGroup, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ROLEMODEL__PARENT_GROUP, newParentGroup, newParentGroup));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Grouping> getGroups() {
    if (groups == null) {
      groups = new EObjectContainmentWithInverseEList<Grouping>(Grouping.class, this, OrmPackage.ROLEMODEL__GROUPS, OrmPackage.GROUPING__PARENT_ROLEMODEL);
    }
    return groups;
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
      case OrmPackage.ROLEMODEL__SUBCONTEXTS:
        return ((InternalEList<InternalEObject>)(InternalEList<?>)getSubcontexts()).basicAdd(otherEnd, msgs);
      case OrmPackage.ROLEMODEL__PARTICIPANTS:
        return ((InternalEList<InternalEObject>)(InternalEList<?>)getParticipants()).basicAdd(otherEnd, msgs);
      case OrmPackage.ROLEMODEL__PLAYERS:
        return ((InternalEList<InternalEObject>)(InternalEList<?>)getPlayers()).basicAdd(otherEnd, msgs);
      case OrmPackage.ROLEMODEL__CT:
        if (eInternalContainer() != null)
          msgs = eBasicRemoveFromContainer(msgs);
        return basicSetCt((Compartment)otherEnd, msgs);
      case OrmPackage.ROLEMODEL__PARENT_GROUP:
        if (eInternalContainer() != null)
          msgs = eBasicRemoveFromContainer(msgs);
        return basicSetParentGroup((Grouping)otherEnd, msgs);
      case OrmPackage.ROLEMODEL__GROUPS:
        return ((InternalEList<InternalEObject>)(InternalEList<?>)getGroups()).basicAdd(otherEnd, msgs);
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
      case OrmPackage.ROLEMODEL__SUBCONTEXTS:
        return ((InternalEList<?>)getSubcontexts()).basicRemove(otherEnd, msgs);
      case OrmPackage.ROLEMODEL__PARTICIPANTS:
        return ((InternalEList<?>)getParticipants()).basicRemove(otherEnd, msgs);
      case OrmPackage.ROLEMODEL__PLAYERS:
        return ((InternalEList<?>)getPlayers()).basicRemove(otherEnd, msgs);
      case OrmPackage.ROLEMODEL__CT:
        return basicSetCt(null, msgs);
      case OrmPackage.ROLEMODEL__PARENT_GROUP:
        return basicSetParentGroup(null, msgs);
      case OrmPackage.ROLEMODEL__GROUPS:
        return ((InternalEList<?>)getGroups()).basicRemove(otherEnd, msgs);
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
      case OrmPackage.ROLEMODEL__CT:
        return eInternalContainer().eInverseRemove(this, OrmPackage.COMPARTMENT__ROLEMODEL, Compartment.class, msgs);
      case OrmPackage.ROLEMODEL__PARENT_GROUP:
        return eInternalContainer().eInverseRemove(this, OrmPackage.GROUPING__ROLEMODEL, Grouping.class, msgs);
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
      case OrmPackage.ROLEMODEL__SUBCONTEXTS:
        return getSubcontexts();
      case OrmPackage.ROLEMODEL__PARTICIPANTS:
        return getParticipants();
      case OrmPackage.ROLEMODEL__PLAYERS:
        return getPlayers();
      case OrmPackage.ROLEMODEL__CT:
        return getCompartment();
      case OrmPackage.ROLEMODEL__PARENT_GROUP:
        return getParentGroup();
      case OrmPackage.ROLEMODEL__GROUPS:
        return getGroups();
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
      case OrmPackage.ROLEMODEL__SUBCONTEXTS:
        getSubcontexts().clear();
        getSubcontexts().addAll((Collection<? extends Compartment>)newValue);
        return;
      case OrmPackage.ROLEMODEL__PARTICIPANTS:
        getParticipants().clear();
        getParticipants().addAll((Collection<? extends AbstractRole>)newValue);
        return;
      case OrmPackage.ROLEMODEL__PLAYERS:
        getPlayers().clear();
        getPlayers().addAll((Collection<? extends NaturalType>)newValue);
        return;
      case OrmPackage.ROLEMODEL__CT:
        setCt((Compartment)newValue);
        return;
      case OrmPackage.ROLEMODEL__PARENT_GROUP:
        setParentGroup((Grouping)newValue);
        return;
      case OrmPackage.ROLEMODEL__GROUPS:
        getGroups().clear();
        getGroups().addAll((Collection<? extends Grouping>)newValue);
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
      case OrmPackage.ROLEMODEL__SUBCONTEXTS:
        getSubcontexts().clear();
        return;
      case OrmPackage.ROLEMODEL__PARTICIPANTS:
        getParticipants().clear();
        return;
      case OrmPackage.ROLEMODEL__PLAYERS:
        getPlayers().clear();
        return;
      case OrmPackage.ROLEMODEL__CT:
        setCt((Compartment)null);
        return;
      case OrmPackage.ROLEMODEL__PARENT_GROUP:
        setParentGroup((Grouping)null);
        return;
      case OrmPackage.ROLEMODEL__GROUPS:
        getGroups().clear();
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
      case OrmPackage.ROLEMODEL__SUBCONTEXTS:
        return subcontexts != null && !subcontexts.isEmpty();
      case OrmPackage.ROLEMODEL__PARTICIPANTS:
        return participants != null && !participants.isEmpty();
      case OrmPackage.ROLEMODEL__PLAYERS:
        return players != null && !players.isEmpty();
      case OrmPackage.ROLEMODEL__CT:
        return getCompartment() != null;
      case OrmPackage.ROLEMODEL__PARENT_GROUP:
        return getParentGroup() != null;
      case OrmPackage.ROLEMODEL__GROUPS:
        return groups != null && !groups.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //RolemodelImpl
