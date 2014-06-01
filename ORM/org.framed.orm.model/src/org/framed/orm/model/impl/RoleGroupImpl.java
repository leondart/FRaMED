/**
 */
package org.framed.orm.model.impl;

import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.framed.orm.model.AbstractRole;
import org.framed.orm.model.Node;
import org.framed.orm.model.OrmPackage;
import org.framed.orm.model.Relation;
import org.framed.orm.model.RelationContainer;
import org.framed.orm.model.RoleGroup;
import org.framed.orm.model.RoleType;
import org.framed.orm.model.Rolemodel;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Role Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.framed.orm.model.impl.RoleGroupImpl#getFirst <em>First</em>}</li>
 *   <li>{@link org.framed.orm.model.impl.RoleGroupImpl#getSecond <em>Second</em>}</li>
 *   <li>{@link org.framed.orm.model.impl.RoleGroupImpl#getParentRolemodel <em>Parent Rolemodel</em>}</li>
 *   <li>{@link org.framed.orm.model.impl.RoleGroupImpl#getParentRoleGroup <em>Parent Role Group</em>}</li>
 *   <li>{@link org.framed.orm.model.impl.RoleGroupImpl#getIncomingLinks <em>Incoming Links</em>}</li>
 *   <li>{@link org.framed.orm.model.impl.RoleGroupImpl#getOutgoingLinks <em>Outgoing Links</em>}</li>
 *   <li>{@link org.framed.orm.model.impl.RoleGroupImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.framed.orm.model.impl.RoleGroupImpl#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link org.framed.orm.model.impl.RoleGroupImpl#getRelations <em>Relations</em>}</li>
 *   <li>{@link org.framed.orm.model.impl.RoleGroupImpl#getLower <em>Lower</em>}</li>
 *   <li>{@link org.framed.orm.model.impl.RoleGroupImpl#getItems <em>Items</em>}</li>
 *   <li>{@link org.framed.orm.model.impl.RoleGroupImpl#getUpper <em>Upper</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RoleGroupImpl extends ConstraintImpl implements RoleGroup {
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
  public RoleType getFirst() {
    return (RoleType) eGet(OrmPackage.Literals.ABSTRACT_ROLE__FIRST, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFirst(RoleType newFirst) {
    eSet(OrmPackage.Literals.ABSTRACT_ROLE__FIRST, newFirst);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RoleType getSecond() {
    return (RoleType) eGet(OrmPackage.Literals.ABSTRACT_ROLE__SECOND, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSecond(RoleType newSecond) {
    eSet(OrmPackage.Literals.ABSTRACT_ROLE__SECOND, newSecond);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Rolemodel getParentRolemodel() {
    return (Rolemodel) eGet(OrmPackage.Literals.ABSTRACT_ROLE__PARENT_ROLEMODEL, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setParentRolemodel(Rolemodel newParentRolemodel) {
    eSet(OrmPackage.Literals.ABSTRACT_ROLE__PARENT_ROLEMODEL, newParentRolemodel);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RoleGroup getParentRoleGroup() {
    return (RoleGroup) eGet(OrmPackage.Literals.ABSTRACT_ROLE__PARENT_ROLE_GROUP, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setParentRoleGroup(RoleGroup newParentRoleGroup) {
    eSet(OrmPackage.Literals.ABSTRACT_ROLE__PARENT_ROLE_GROUP, newParentRoleGroup);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  public EList<Relation> getIncomingLinks() {
    return (EList<Relation>) eGet(OrmPackage.Literals.NODE__INCOMING_LINKS, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  public EList<Relation> getOutgoingLinks() {
    return (EList<Relation>) eGet(OrmPackage.Literals.NODE__OUTGOING_LINKS, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName() {
    return (String) eGet(OrmPackage.Literals.NODE__NAME, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName) {
    eSet(OrmPackage.Literals.NODE__NAME, newName);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Rectangle getConstraints() {
    return (Rectangle) eGet(OrmPackage.Literals.NODE__CONSTRAINTS, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setConstraints(Rectangle newConstraints) {
    eSet(OrmPackage.Literals.NODE__CONSTRAINTS, newConstraints);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  public EList<Relation> getRelations() {
    return (EList<Relation>) eGet(OrmPackage.Literals.RELATION_CONTAINER__RELATIONS, true);
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
  @SuppressWarnings("unchecked")
  public EList<AbstractRole> getItems() {
    return (EList<AbstractRole>) eGet(OrmPackage.Literals.ROLE_GROUP__ITEMS, true);
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
    if (baseClass == Node.class) {
      switch (derivedFeatureID) {
        case OrmPackage.ROLE_GROUP__INCOMING_LINKS:
          return OrmPackage.NODE__INCOMING_LINKS;
        case OrmPackage.ROLE_GROUP__OUTGOING_LINKS:
          return OrmPackage.NODE__OUTGOING_LINKS;
        case OrmPackage.ROLE_GROUP__NAME:
          return OrmPackage.NODE__NAME;
        case OrmPackage.ROLE_GROUP__CONSTRAINTS:
          return OrmPackage.NODE__CONSTRAINTS;
        default:
          return -1;
      }
    }
    if (baseClass == RelationContainer.class) {
      switch (derivedFeatureID) {
        case OrmPackage.ROLE_GROUP__RELATIONS:
          return OrmPackage.RELATION_CONTAINER__RELATIONS;
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
    if (baseClass == Node.class) {
      switch (baseFeatureID) {
        case OrmPackage.NODE__INCOMING_LINKS:
          return OrmPackage.ROLE_GROUP__INCOMING_LINKS;
        case OrmPackage.NODE__OUTGOING_LINKS:
          return OrmPackage.ROLE_GROUP__OUTGOING_LINKS;
        case OrmPackage.NODE__NAME:
          return OrmPackage.ROLE_GROUP__NAME;
        case OrmPackage.NODE__CONSTRAINTS:
          return OrmPackage.ROLE_GROUP__CONSTRAINTS;
        default:
          return -1;
      }
    }
    if (baseClass == RelationContainer.class) {
      switch (baseFeatureID) {
        case OrmPackage.RELATION_CONTAINER__RELATIONS:
          return OrmPackage.ROLE_GROUP__RELATIONS;
        default:
          return -1;
      }
    }
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
  }

} //RoleGroupImpl
