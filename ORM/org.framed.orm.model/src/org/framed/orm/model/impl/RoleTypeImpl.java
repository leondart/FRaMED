/**
 */
package org.framed.orm.model.impl;

import org.eclipse.draw2d.geometry.Point;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.framed.orm.model.AbstractRole;
import org.framed.orm.model.Constraint;
import org.framed.orm.model.Node;
import org.framed.orm.model.OrmPackage;
import org.framed.orm.model.Relation;
import org.framed.orm.model.RoleType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Role Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.framed.orm.model.impl.RoleTypeImpl#getRelationContainer <em>Relation Container</em>}</li>
 *   <li>{@link org.framed.orm.model.impl.RoleTypeImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.framed.orm.model.impl.RoleTypeImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.framed.orm.model.impl.RoleTypeImpl#getDim1BP <em>Dim1 BP</em>}</li>
 *   <li>{@link org.framed.orm.model.impl.RoleTypeImpl#getDim2BP <em>Dim2 BP</em>}</li>
 *   <li>{@link org.framed.orm.model.impl.RoleTypeImpl#getFirst <em>First</em>}</li>
 *   <li>{@link org.framed.orm.model.impl.RoleTypeImpl#getSecond <em>Second</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RoleTypeImpl extends TypeImpl implements RoleType {
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
  public org.framed.orm.model.Container getRelationContainer() {
    return (org.framed.orm.model.Container) eGet(OrmPackage.Literals.RELATION__RELATION_CONTAINER,
        true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRelationContainer(org.framed.orm.model.Container newRelationContainer) {
    eSet(OrmPackage.Literals.RELATION__RELATION_CONTAINER, newRelationContainer);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Node getTarget() {
    return (Node) eGet(OrmPackage.Literals.RELATION__TARGET, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTarget(Node newTarget) {
    eSet(OrmPackage.Literals.RELATION__TARGET, newTarget);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Node getSource() {
    return (Node) eGet(OrmPackage.Literals.RELATION__SOURCE, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSource(Node newSource) {
    eSet(OrmPackage.Literals.RELATION__SOURCE, newSource);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  public EList<Point> getDim1BP() {
    return (EList<Point>) eGet(OrmPackage.Literals.RELATION__DIM1_BP, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  public EList<Point> getDim2BP() {
    return (EList<Point>) eGet(OrmPackage.Literals.RELATION__DIM2_BP, true);
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
  @Override
  public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
    if (baseClass == Relation.class) {
      switch (derivedFeatureID) {
        case OrmPackage.ROLE_TYPE__RELATION_CONTAINER:
          return OrmPackage.RELATION__RELATION_CONTAINER;
        case OrmPackage.ROLE_TYPE__TARGET:
          return OrmPackage.RELATION__TARGET;
        case OrmPackage.ROLE_TYPE__SOURCE:
          return OrmPackage.RELATION__SOURCE;
        case OrmPackage.ROLE_TYPE__DIM1_BP:
          return OrmPackage.RELATION__DIM1_BP;
        case OrmPackage.ROLE_TYPE__DIM2_BP:
          return OrmPackage.RELATION__DIM2_BP;
        default:
          return -1;
      }
    }
    if (baseClass == Constraint.class) {
      switch (derivedFeatureID) {
        default:
          return -1;
      }
    }
    if (baseClass == AbstractRole.class) {
      switch (derivedFeatureID) {
        case OrmPackage.ROLE_TYPE__FIRST:
          return OrmPackage.ABSTRACT_ROLE__FIRST;
        case OrmPackage.ROLE_TYPE__SECOND:
          return OrmPackage.ABSTRACT_ROLE__SECOND;
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
    if (baseClass == Relation.class) {
      switch (baseFeatureID) {
        case OrmPackage.RELATION__RELATION_CONTAINER:
          return OrmPackage.ROLE_TYPE__RELATION_CONTAINER;
        case OrmPackage.RELATION__TARGET:
          return OrmPackage.ROLE_TYPE__TARGET;
        case OrmPackage.RELATION__SOURCE:
          return OrmPackage.ROLE_TYPE__SOURCE;
        case OrmPackage.RELATION__DIM1_BP:
          return OrmPackage.ROLE_TYPE__DIM1_BP;
        case OrmPackage.RELATION__DIM2_BP:
          return OrmPackage.ROLE_TYPE__DIM2_BP;
        default:
          return -1;
      }
    }
    if (baseClass == Constraint.class) {
      switch (baseFeatureID) {
        default:
          return -1;
      }
    }
    if (baseClass == AbstractRole.class) {
      switch (baseFeatureID) {
        case OrmPackage.ABSTRACT_ROLE__FIRST:
          return OrmPackage.ROLE_TYPE__FIRST;
        case OrmPackage.ABSTRACT_ROLE__SECOND:
          return OrmPackage.ROLE_TYPE__SECOND;
        default:
          return -1;
      }
    }
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
  }

} //RoleTypeImpl
