/**
 */
package org.framed.orm.model.impl;

import org.eclipse.draw2d.geometry.Rectangle;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.framed.orm.model.Attribute;
import org.framed.orm.model.ElementModel;
import org.framed.orm.model.Operation;
import org.framed.orm.model.OrmPackage;
import org.framed.orm.model.Relation;
import org.framed.orm.model.RelationTarget;
import org.framed.orm.model.RigidType;
import org.framed.orm.model.Type;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rigid Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.framed.orm.model.impl.RigidTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.framed.orm.model.impl.RigidTypeImpl#getContainer <em>Container</em>}</li>
 *   <li>{@link org.framed.orm.model.impl.RigidTypeImpl#getIncoming <em>Incoming</em>}</li>
 *   <li>{@link org.framed.orm.model.impl.RigidTypeImpl#getOutgoing <em>Outgoing</em>}</li>
 *   <li>{@link org.framed.orm.model.impl.RigidTypeImpl#getBoundaries <em>Boundaries</em>}</li>
 *   <li>{@link org.framed.orm.model.impl.RigidTypeImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link org.framed.orm.model.impl.RigidTypeImpl#getOperations <em>Operations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RigidTypeImpl extends MinimalEObjectImpl.Container implements RigidType {
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RigidTypeImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return OrmPackage.Literals.RIGID_TYPE;
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
  public ElementModel getContainer() {
    return (ElementModel) eGet(OrmPackage.Literals.MODEL_ELEMENT__CONTAINER, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setContainer(ElementModel newContainer) {
    eSet(OrmPackage.Literals.MODEL_ELEMENT__CONTAINER, newContainer);
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

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  public EList<Attribute> getAttributes() {
    return (EList<Attribute>) eGet(OrmPackage.Literals.TYPE__ATTRIBUTES, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  public EList<Operation> getOperations() {
    return (EList<Operation>) eGet(OrmPackage.Literals.TYPE__OPERATIONS, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
    if (baseClass == RelationTarget.class) {
      switch (derivedFeatureID) {
        case OrmPackage.RIGID_TYPE__INCOMING:
          return OrmPackage.RELATION_TARGET__INCOMING;
        case OrmPackage.RIGID_TYPE__OUTGOING:
          return OrmPackage.RELATION_TARGET__OUTGOING;
        case OrmPackage.RIGID_TYPE__BOUNDARIES:
          return OrmPackage.RELATION_TARGET__BOUNDARIES;
        default:
          return -1;
      }
    }
    if (baseClass == Type.class) {
      switch (derivedFeatureID) {
        case OrmPackage.RIGID_TYPE__ATTRIBUTES:
          return OrmPackage.TYPE__ATTRIBUTES;
        case OrmPackage.RIGID_TYPE__OPERATIONS:
          return OrmPackage.TYPE__OPERATIONS;
        default:
          return -1;
      }
    }
    return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
    if (baseClass == RelationTarget.class) {
      switch (baseFeatureID) {
        case OrmPackage.RELATION_TARGET__INCOMING:
          return OrmPackage.RIGID_TYPE__INCOMING;
        case OrmPackage.RELATION_TARGET__OUTGOING:
          return OrmPackage.RIGID_TYPE__OUTGOING;
        case OrmPackage.RELATION_TARGET__BOUNDARIES:
          return OrmPackage.RIGID_TYPE__BOUNDARIES;
        default:
          return -1;
      }
    }
    if (baseClass == Type.class) {
      switch (baseFeatureID) {
        case OrmPackage.TYPE__ATTRIBUTES:
          return OrmPackage.RIGID_TYPE__ATTRIBUTES;
        case OrmPackage.TYPE__OPERATIONS:
          return OrmPackage.RIGID_TYPE__OPERATIONS;
        default:
          return -1;
      }
    }
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
  }

} //RigidTypeImpl
