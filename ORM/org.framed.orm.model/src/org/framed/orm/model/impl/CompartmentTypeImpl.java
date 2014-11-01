/**
 */
package org.framed.orm.model.impl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.framed.orm.model.AbstractRole;
import org.framed.orm.model.AbstractRoleModel;
import org.framed.orm.model.CompartmentType;
import org.framed.orm.model.Constraint;
import org.framed.orm.model.Model;
import org.framed.orm.model.OrmPackage;
import org.framed.orm.model.Part;
import org.framed.orm.model.Relation;
import org.framed.orm.model.Relationship;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Compartment Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.framed.orm.model.impl.CompartmentTypeImpl#getRelations <em>Relations</em>}</li>
 *   <li>{@link org.framed.orm.model.impl.CompartmentTypeImpl#getAbstractroles <em>Abstractroles</em>}</li>
 *   <li>{@link org.framed.orm.model.impl.CompartmentTypeImpl#isIsExpand <em>Is Expand</em>}</li>
 *   <li>{@link org.framed.orm.model.impl.CompartmentTypeImpl#getParts <em>Parts</em>}</li>
 *   <li>{@link org.framed.orm.model.impl.CompartmentTypeImpl#getRelationships <em>Relationships</em>}</li>
 *   <li>{@link org.framed.orm.model.impl.CompartmentTypeImpl#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link org.framed.orm.model.impl.CompartmentTypeImpl#getTr_extends <em>Tr extends</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CompartmentTypeImpl extends RigidTypeImpl implements CompartmentType {
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CompartmentTypeImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return OrmPackage.Literals.COMPARTMENT_TYPE;
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
  public boolean isIsExpand() {
    return (Boolean) eGet(OrmPackage.Literals.COMPARTMENT_TYPE__IS_EXPAND, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIsExpand(boolean newIsExpand) {
    eSet(OrmPackage.Literals.COMPARTMENT_TYPE__IS_EXPAND, newIsExpand);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  public EList<Part> getParts() {
    return (EList<Part>) eGet(OrmPackage.Literals.COMPARTMENT_TYPE__PARTS, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  public EList<Relationship> getRelationships() {
    return (EList<Relationship>) eGet(OrmPackage.Literals.COMPARTMENT_TYPE__RELATIONSHIPS, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  public EList<Constraint> getConstraints() {
    return (EList<Constraint>) eGet(OrmPackage.Literals.COMPARTMENT_TYPE__CONSTRAINTS, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CompartmentType getTr_extends() {
    return (CompartmentType) eGet(OrmPackage.Literals.COMPARTMENT_TYPE__TR_EXTENDS, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTr_extends(CompartmentType newTr_extends) {
    eSet(OrmPackage.Literals.COMPARTMENT_TYPE__TR_EXTENDS, newTr_extends);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
    if (baseClass == Model.class) {
      switch (derivedFeatureID) {
        case OrmPackage.COMPARTMENT_TYPE__RELATIONS:
          return OrmPackage.MODEL__RELATIONS;
        default:
          return -1;
      }
    }
    if (baseClass == AbstractRoleModel.class) {
      switch (derivedFeatureID) {
        case OrmPackage.COMPARTMENT_TYPE__ABSTRACTROLES:
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
    if (baseClass == Model.class) {
      switch (baseFeatureID) {
        case OrmPackage.MODEL__RELATIONS:
          return OrmPackage.COMPARTMENT_TYPE__RELATIONS;
        default:
          return -1;
      }
    }
    if (baseClass == AbstractRoleModel.class) {
      switch (baseFeatureID) {
        case OrmPackage.ABSTRACT_ROLE_MODEL__ABSTRACTROLES:
          return OrmPackage.COMPARTMENT_TYPE__ABSTRACTROLES;
        default:
          return -1;
      }
    }
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
  }

} //CompartmentTypeImpl
