/**
 */
package org.framed.orm.model.impl;

import org.eclipse.draw2d.geometry.Rectangle;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.framed.orm.model.OrmPackage;
import org.framed.orm.model.Relation;
import org.framed.orm.model.RelationTarget;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relation Target</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.framed.orm.model.impl.RelationTargetImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.framed.orm.model.impl.RelationTargetImpl#getIncoming <em>Incoming</em>}</li>
 *   <li>{@link org.framed.orm.model.impl.RelationTargetImpl#getOutgoing <em>Outgoing</em>}</li>
 *   <li>{@link org.framed.orm.model.impl.RelationTargetImpl#getBoundaries <em>Boundaries</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RelationTargetImpl extends MinimalEObjectImpl.Container implements RelationTarget {
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RelationTargetImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return OrmPackage.Literals.RELATION_TARGET;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected int eStaticFeatureCount() {
    return 0;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName() {
    return (String) eGet(OrmPackage.Literals.NAMED_ELEMENT__NAME, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName) {
    eSet(OrmPackage.Literals.NAMED_ELEMENT__NAME, newName);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  public EList<Relation> getIncoming() {
    return (EList<Relation>) eGet(OrmPackage.Literals.RELATION_TARGET__INCOMING, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  public EList<Relation> getOutgoing() {
    return (EList<Relation>) eGet(OrmPackage.Literals.RELATION_TARGET__OUTGOING, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Rectangle getBoundaries() {
    return (Rectangle) eGet(OrmPackage.Literals.RELATION_TARGET__BOUNDARIES, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBoundaries(Rectangle newBoundaries) {
    eSet(OrmPackage.Literals.RELATION_TARGET__BOUNDARIES, newBoundaries);
  }

} //RelationTargetImpl
