/**
 */
package org.framed.orm.model.impl;

import org.eclipse.draw2d.geometry.Rectangle;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.framed.orm.model.AbstractRole;
import org.framed.orm.model.AbstractRoleModel;
import org.framed.orm.model.Fulfillment;
import org.framed.orm.model.Model;
import org.framed.orm.model.NamedElement;
import org.framed.orm.model.OrmPackage;
import org.framed.orm.model.Relation;
import org.framed.orm.model.RelationTarget;
import org.framed.orm.model.RoleGroup;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Role Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.framed.orm.model.impl.RoleGroupImpl#getFulfillment <em>Fulfillment</em>}</li>
 *   <li>{@link org.framed.orm.model.impl.RoleGroupImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link org.framed.orm.model.impl.RoleGroupImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.framed.orm.model.impl.RoleGroupImpl#getIncoming <em>Incoming</em>}</li>
 *   <li>{@link org.framed.orm.model.impl.RoleGroupImpl#getOutgoing <em>Outgoing</em>}</li>
 *   <li>{@link org.framed.orm.model.impl.RoleGroupImpl#getBoundaries <em>Boundaries</em>}</li>
 *   <li>{@link org.framed.orm.model.impl.RoleGroupImpl#getRelations <em>Relations</em>}</li>
 *   <li>{@link org.framed.orm.model.impl.RoleGroupImpl#getAbstractroles <em>Abstractroles</em>}</li>
 *   <li>{@link org.framed.orm.model.impl.RoleGroupImpl#getLower <em>Lower</em>}</li>
 *   <li>{@link org.framed.orm.model.impl.RoleGroupImpl#getUpper <em>Upper</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RoleGroupImpl extends RoleGroupElementImpl implements RoleGroup {
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RoleGroupImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return OrmPackage.Literals.ROLE_GROUP;
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
  public EList<Relation> getRelations() {
    return (EList<Relation>) eGet(OrmPackage.Literals.MODEL__RELATIONS, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  public EList<AbstractRole> getAbstractroles() {
    return (EList<AbstractRole>) eGet(OrmPackage.Literals.ABSTRACT_ROLE_MODEL__ABSTRACTROLES, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getLower() {
    return (Integer) eGet(OrmPackage.Literals.ROLE_GROUP__LOWER, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLower(int newLower) {
    eSet(OrmPackage.Literals.ROLE_GROUP__LOWER, newLower);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getUpper() {
    return (Integer) eGet(OrmPackage.Literals.ROLE_GROUP__UPPER, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUpper(int newUpper) {
    eSet(OrmPackage.Literals.ROLE_GROUP__UPPER, newUpper);
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
        case OrmPackage.ROLE_GROUP__NAME:
          return OrmPackage.NAMED_ELEMENT__NAME;
        default:
          return -1;
      }
    }
    if (baseClass == RelationTarget.class) {
      switch (derivedFeatureID) {
        case OrmPackage.ROLE_GROUP__INCOMING:
          return OrmPackage.RELATION_TARGET__INCOMING;
        case OrmPackage.ROLE_GROUP__OUTGOING:
          return OrmPackage.RELATION_TARGET__OUTGOING;
        case OrmPackage.ROLE_GROUP__BOUNDARIES:
          return OrmPackage.RELATION_TARGET__BOUNDARIES;
        default:
          return -1;
      }
    }
    if (baseClass == Model.class) {
      switch (derivedFeatureID) {
        case OrmPackage.ROLE_GROUP__RELATIONS:
          return OrmPackage.MODEL__RELATIONS;
        default:
          return -1;
      }
    }
    if (baseClass == AbstractRoleModel.class) {
      switch (derivedFeatureID) {
        case OrmPackage.ROLE_GROUP__ABSTRACTROLES:
          return OrmPackage.ABSTRACT_ROLE_MODEL__ABSTRACTROLES;
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
          return OrmPackage.ROLE_GROUP__NAME;
        default:
          return -1;
      }
    }
    if (baseClass == RelationTarget.class) {
      switch (baseFeatureID) {
        case OrmPackage.RELATION_TARGET__INCOMING:
          return OrmPackage.ROLE_GROUP__INCOMING;
        case OrmPackage.RELATION_TARGET__OUTGOING:
          return OrmPackage.ROLE_GROUP__OUTGOING;
        case OrmPackage.RELATION_TARGET__BOUNDARIES:
          return OrmPackage.ROLE_GROUP__BOUNDARIES;
        default:
          return -1;
      }
    }
    if (baseClass == Model.class) {
      switch (baseFeatureID) {
        case OrmPackage.MODEL__RELATIONS:
          return OrmPackage.ROLE_GROUP__RELATIONS;
        default:
          return -1;
      }
    }
    if (baseClass == AbstractRoleModel.class) {
      switch (baseFeatureID) {
        case OrmPackage.ABSTRACT_ROLE_MODEL__ABSTRACTROLES:
          return OrmPackage.ROLE_GROUP__ABSTRACTROLES;
        default:
          return -1;
      }
    }
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
  }

} //RoleGroupImpl
