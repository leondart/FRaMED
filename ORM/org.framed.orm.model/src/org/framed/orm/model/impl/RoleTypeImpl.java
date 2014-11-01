/**
 */
package org.framed.orm.model.impl;

import org.eclipse.draw2d.geometry.Rectangle;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.framed.orm.model.AbstractRoleModel;
import org.framed.orm.model.AntiRigidType;
import org.framed.orm.model.Attribute;
import org.framed.orm.model.Fulfillment;
import org.framed.orm.model.NamedElement;
import org.framed.orm.model.Operation;
import org.framed.orm.model.OrmPackage;
import org.framed.orm.model.Relation;
import org.framed.orm.model.RelationTarget;
import org.framed.orm.model.RoleType;
import org.framed.orm.model.Type;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Role Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.framed.orm.model.impl.RoleTypeImpl#getFulfillment <em>Fulfillment</em>}</li>
 *   <li>{@link org.framed.orm.model.impl.RoleTypeImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link org.framed.orm.model.impl.RoleTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.framed.orm.model.impl.RoleTypeImpl#getIncoming <em>Incoming</em>}</li>
 *   <li>{@link org.framed.orm.model.impl.RoleTypeImpl#getOutgoing <em>Outgoing</em>}</li>
 *   <li>{@link org.framed.orm.model.impl.RoleTypeImpl#getBoundaries <em>Boundaries</em>}</li>
 *   <li>{@link org.framed.orm.model.impl.RoleTypeImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link org.framed.orm.model.impl.RoleTypeImpl#getOperations <em>Operations</em>}</li>
 *   <li>{@link org.framed.orm.model.impl.RoleTypeImpl#getTr_extends <em>Tr extends</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RoleTypeImpl extends RoleGroupElementImpl implements RoleType {
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RoleTypeImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return OrmPackage.Literals.ROLE_TYPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Fulfillment getFulfillment() {
    return (Fulfillment) eGet(OrmPackage.Literals.ABSTRACT_ROLE__FULFILLMENT, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFulfillment(Fulfillment newFulfillment) {
    eSet(OrmPackage.Literals.ABSTRACT_ROLE__FULFILLMENT, newFulfillment);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbstractRoleModel getParent() {
    return (AbstractRoleModel) eGet(OrmPackage.Literals.ABSTRACT_ROLE__PARENT, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setParent(AbstractRoleModel newParent) {
    eSet(OrmPackage.Literals.ABSTRACT_ROLE__PARENT, newParent);
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
  public RoleType getTr_extends() {
    return (RoleType) eGet(OrmPackage.Literals.ROLE_TYPE__TR_EXTENDS, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTr_extends(RoleType newTr_extends) {
    eSet(OrmPackage.Literals.ROLE_TYPE__TR_EXTENDS, newTr_extends);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
    if (baseClass == NamedElement.class) {
      switch (derivedFeatureID) {
        case OrmPackage.ROLE_TYPE__NAME:
          return OrmPackage.NAMED_ELEMENT__NAME;
        default:
          return -1;
      }
    }
    if (baseClass == RelationTarget.class) {
      switch (derivedFeatureID) {
        case OrmPackage.ROLE_TYPE__INCOMING:
          return OrmPackage.RELATION_TARGET__INCOMING;
        case OrmPackage.ROLE_TYPE__OUTGOING:
          return OrmPackage.RELATION_TARGET__OUTGOING;
        case OrmPackage.ROLE_TYPE__BOUNDARIES:
          return OrmPackage.RELATION_TARGET__BOUNDARIES;
        default:
          return -1;
      }
    }
    if (baseClass == Type.class) {
      switch (derivedFeatureID) {
        case OrmPackage.ROLE_TYPE__ATTRIBUTES:
          return OrmPackage.TYPE__ATTRIBUTES;
        case OrmPackage.ROLE_TYPE__OPERATIONS:
          return OrmPackage.TYPE__OPERATIONS;
        default:
          return -1;
      }
    }
    if (baseClass == AntiRigidType.class) {
      switch (derivedFeatureID) {
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
    if (baseClass == NamedElement.class) {
      switch (baseFeatureID) {
        case OrmPackage.NAMED_ELEMENT__NAME:
          return OrmPackage.ROLE_TYPE__NAME;
        default:
          return -1;
      }
    }
    if (baseClass == RelationTarget.class) {
      switch (baseFeatureID) {
        case OrmPackage.RELATION_TARGET__INCOMING:
          return OrmPackage.ROLE_TYPE__INCOMING;
        case OrmPackage.RELATION_TARGET__OUTGOING:
          return OrmPackage.ROLE_TYPE__OUTGOING;
        case OrmPackage.RELATION_TARGET__BOUNDARIES:
          return OrmPackage.ROLE_TYPE__BOUNDARIES;
        default:
          return -1;
      }
    }
    if (baseClass == Type.class) {
      switch (baseFeatureID) {
        case OrmPackage.TYPE__ATTRIBUTES:
          return OrmPackage.ROLE_TYPE__ATTRIBUTES;
        case OrmPackage.TYPE__OPERATIONS:
          return OrmPackage.ROLE_TYPE__OPERATIONS;
        default:
          return -1;
      }
    }
    if (baseClass == AntiRigidType.class) {
      switch (baseFeatureID) {
        default:
          return -1;
      }
    }
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
  }

} //RoleTypeImpl
