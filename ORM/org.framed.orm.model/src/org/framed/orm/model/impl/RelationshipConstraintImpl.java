/**
 */
package org.framed.orm.model.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.framed.orm.model.OrmPackage;
import org.framed.orm.model.Relationship;
import org.framed.orm.model.RelationshipConstraint;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relationship Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.framed.orm.model.impl.RelationshipConstraintImpl#getRelation <em>Relation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class RelationshipConstraintImpl extends ConstraintImpl implements RelationshipConstraint {
  /**
   * The cached value of the '{@link #getRelation() <em>Relation</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRelation()
   * @generated
   * @ordered
   */
  protected Relationship relation;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RelationshipConstraintImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return OrmPackage.Literals.RELATIONSHIP_CONSTRAINT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Relationship getRelation() {
    if (relation != null && relation.eIsProxy()) {
      InternalEObject oldRelation = (InternalEObject)relation;
      relation = (Relationship)eResolveProxy(oldRelation);
      if (relation != oldRelation) {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, OrmPackage.RELATIONSHIP_CONSTRAINT__RELATION, oldRelation, relation));
      }
    }
    return relation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Relationship basicGetRelation() {
    return relation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRelation(Relationship newRelation) {
    Relationship oldRelation = relation;
    relation = newRelation;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.RELATIONSHIP_CONSTRAINT__RELATION, oldRelation, relation));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID) {
      case OrmPackage.RELATIONSHIP_CONSTRAINT__RELATION:
        if (resolve) return getRelation();
        return basicGetRelation();
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
      case OrmPackage.RELATIONSHIP_CONSTRAINT__RELATION:
        setRelation((Relationship)newValue);
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
      case OrmPackage.RELATIONSHIP_CONSTRAINT__RELATION:
        setRelation((Relationship)null);
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
      case OrmPackage.RELATIONSHIP_CONSTRAINT__RELATION:
        return relation != null;
    }
    return super.eIsSet(featureID);
  }

} //RelationshipConstraintImpl
