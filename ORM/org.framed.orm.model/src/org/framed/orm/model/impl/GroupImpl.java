/**
 */
package org.framed.orm.model.impl;

import org.eclipse.draw2d.geometry.Rectangle;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.framed.orm.model.ElementModel;
import org.framed.orm.model.Group;
import org.framed.orm.model.Model;
import org.framed.orm.model.ModelElement;
import org.framed.orm.model.OrmPackage;
import org.framed.orm.model.Relation;
import org.framed.orm.model.RelationTarget;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.framed.orm.model.impl.GroupImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.framed.orm.model.impl.GroupImpl#getContainer <em>Container</em>}</li>
 *   <li>{@link org.framed.orm.model.impl.GroupImpl#getRelations <em>Relations</em>}</li>
 *   <li>{@link org.framed.orm.model.impl.GroupImpl#getElements <em>Elements</em>}</li>
 *   <li>{@link org.framed.orm.model.impl.GroupImpl#getIncoming <em>Incoming</em>}</li>
 *   <li>{@link org.framed.orm.model.impl.GroupImpl#getOutgoing <em>Outgoing</em>}</li>
 *   <li>{@link org.framed.orm.model.impl.GroupImpl#getBoundaries <em>Boundaries</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GroupImpl extends MinimalEObjectImpl.Container implements Group {
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected GroupImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return OrmPackage.Literals.GROUP;
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
  public EList<Relation> getRelations() {
    return (EList<Relation>) eGet(OrmPackage.Literals.MODEL__RELATIONS, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  public EList<ModelElement> getElements() {
    return (EList<ModelElement>) eGet(OrmPackage.Literals.ELEMENT_MODEL__ELEMENTS, true);
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
  @Override
  public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
    if (baseClass == Model.class) {
      switch (derivedFeatureID) {
        case OrmPackage.GROUP__RELATIONS:
          return OrmPackage.MODEL__RELATIONS;
        default:
          return -1;
      }
    }
    if (baseClass == ElementModel.class) {
      switch (derivedFeatureID) {
        case OrmPackage.GROUP__ELEMENTS:
          return OrmPackage.ELEMENT_MODEL__ELEMENTS;
        default:
          return -1;
      }
    }
    if (baseClass == RelationTarget.class) {
      switch (derivedFeatureID) {
        case OrmPackage.GROUP__INCOMING:
          return OrmPackage.RELATION_TARGET__INCOMING;
        case OrmPackage.GROUP__OUTGOING:
          return OrmPackage.RELATION_TARGET__OUTGOING;
        case OrmPackage.GROUP__BOUNDARIES:
          return OrmPackage.RELATION_TARGET__BOUNDARIES;
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
          return OrmPackage.GROUP__RELATIONS;
        default:
          return -1;
      }
    }
    if (baseClass == ElementModel.class) {
      switch (baseFeatureID) {
        case OrmPackage.ELEMENT_MODEL__ELEMENTS:
          return OrmPackage.GROUP__ELEMENTS;
        default:
          return -1;
      }
    }
    if (baseClass == RelationTarget.class) {
      switch (baseFeatureID) {
        case OrmPackage.RELATION_TARGET__INCOMING:
          return OrmPackage.GROUP__INCOMING;
        case OrmPackage.RELATION_TARGET__OUTGOING:
          return OrmPackage.GROUP__OUTGOING;
        case OrmPackage.RELATION_TARGET__BOUNDARIES:
          return OrmPackage.GROUP__BOUNDARIES;
        default:
          return -1;
      }
    }
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
  }

} //GroupImpl
