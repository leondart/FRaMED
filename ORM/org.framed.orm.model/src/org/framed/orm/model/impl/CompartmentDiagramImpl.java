/**
 */
package org.framed.orm.model.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.framed.orm.model.Compartment;
import org.framed.orm.model.CompartmentDiagram;
import org.framed.orm.model.Grouping;
import org.framed.orm.model.NaturalType;
import org.framed.orm.model.OrmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Compartment Diagram</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.framed.orm.model.impl.CompartmentDiagramImpl#getCompartments <em>Compartments</em>}</li>
 *   <li>{@link org.framed.orm.model.impl.CompartmentDiagramImpl#getGroups <em>Groups</em>}</li>
 *   <li>{@link org.framed.orm.model.impl.CompartmentDiagramImpl#getPlayers <em>Players</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CompartmentDiagramImpl extends RelationContainerImpl implements CompartmentDiagram {
  /**
   * The cached value of the '{@link #getCompartments() <em>Compartments</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCompartments()
   * @generated
   * @ordered
   */
  protected EList<Compartment> compartments;

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
   * The cached value of the '{@link #getPlayers() <em>Players</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPlayers()
   * @generated
   * @ordered
   */
  protected EList<NaturalType> players;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CompartmentDiagramImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return OrmPackage.Literals.COMPARTMENT_DIAGRAM;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Compartment> getCompartments() {
    if (compartments == null) {
      compartments = new EObjectContainmentWithInverseEList<Compartment>(Compartment.class, this, OrmPackage.COMPARTMENT_DIAGRAM__COMPARTMENTS, OrmPackage.COMPARTMENT__COMPARTMENT_DIAGRAM);
    }
    return compartments;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Grouping> getGroups() {
    if (groups == null) {
      groups = new EObjectContainmentWithInverseEList<Grouping>(Grouping.class, this, OrmPackage.COMPARTMENT_DIAGRAM__GROUPS, OrmPackage.GROUPING__COMPARTMENT_DIAGRAM);
    }
    return groups;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<NaturalType> getPlayers() {
    if (players == null) {
      players = new EObjectContainmentWithInverseEList<NaturalType>(NaturalType.class, this, OrmPackage.COMPARTMENT_DIAGRAM__PLAYERS, OrmPackage.NATURAL_TYPE__CD);
    }
    return players;
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
      case OrmPackage.COMPARTMENT_DIAGRAM__COMPARTMENTS:
        return ((InternalEList<InternalEObject>)(InternalEList<?>)getCompartments()).basicAdd(otherEnd, msgs);
      case OrmPackage.COMPARTMENT_DIAGRAM__GROUPS:
        return ((InternalEList<InternalEObject>)(InternalEList<?>)getGroups()).basicAdd(otherEnd, msgs);
      case OrmPackage.COMPARTMENT_DIAGRAM__PLAYERS:
        return ((InternalEList<InternalEObject>)(InternalEList<?>)getPlayers()).basicAdd(otherEnd, msgs);
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
      case OrmPackage.COMPARTMENT_DIAGRAM__COMPARTMENTS:
        return ((InternalEList<?>)getCompartments()).basicRemove(otherEnd, msgs);
      case OrmPackage.COMPARTMENT_DIAGRAM__GROUPS:
        return ((InternalEList<?>)getGroups()).basicRemove(otherEnd, msgs);
      case OrmPackage.COMPARTMENT_DIAGRAM__PLAYERS:
        return ((InternalEList<?>)getPlayers()).basicRemove(otherEnd, msgs);
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
      case OrmPackage.COMPARTMENT_DIAGRAM__COMPARTMENTS:
        return getCompartments();
      case OrmPackage.COMPARTMENT_DIAGRAM__GROUPS:
        return getGroups();
      case OrmPackage.COMPARTMENT_DIAGRAM__PLAYERS:
        return getPlayers();
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
      case OrmPackage.COMPARTMENT_DIAGRAM__COMPARTMENTS:
        getCompartments().clear();
        getCompartments().addAll((Collection<? extends Compartment>)newValue);
        return;
      case OrmPackage.COMPARTMENT_DIAGRAM__GROUPS:
        getGroups().clear();
        getGroups().addAll((Collection<? extends Grouping>)newValue);
        return;
      case OrmPackage.COMPARTMENT_DIAGRAM__PLAYERS:
        getPlayers().clear();
        getPlayers().addAll((Collection<? extends NaturalType>)newValue);
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
      case OrmPackage.COMPARTMENT_DIAGRAM__COMPARTMENTS:
        getCompartments().clear();
        return;
      case OrmPackage.COMPARTMENT_DIAGRAM__GROUPS:
        getGroups().clear();
        return;
      case OrmPackage.COMPARTMENT_DIAGRAM__PLAYERS:
        getPlayers().clear();
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
      case OrmPackage.COMPARTMENT_DIAGRAM__COMPARTMENTS:
        return compartments != null && !compartments.isEmpty();
      case OrmPackage.COMPARTMENT_DIAGRAM__GROUPS:
        return groups != null && !groups.isEmpty();
      case OrmPackage.COMPARTMENT_DIAGRAM__PLAYERS:
        return players != null && !players.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //CompartmentDiagramImpl
