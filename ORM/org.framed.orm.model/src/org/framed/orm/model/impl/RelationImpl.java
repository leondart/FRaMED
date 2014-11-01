/**
 */
package org.framed.orm.model.impl;

import org.eclipse.draw2d.geometry.Point;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.framed.orm.model.Model;
import org.framed.orm.model.OrmPackage;
import org.framed.orm.model.Relation;
import org.framed.orm.model.RelationTarget;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.framed.orm.model.impl.RelationImpl#getRelationContainer <em>Relation Container</em>}</li>
 *   <li>{@link org.framed.orm.model.impl.RelationImpl#getDim1BP <em>Dim1 BP</em>}</li>
 *   <li>{@link org.framed.orm.model.impl.RelationImpl#getDim2BP <em>Dim2 BP</em>}</li>
 *   <li>{@link org.framed.orm.model.impl.RelationImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.framed.orm.model.impl.RelationImpl#getSource <em>Source</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class RelationImpl extends MinimalEObjectImpl.Container implements Relation {
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RelationImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return OrmPackage.Literals.RELATION;
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
  public Model getRelationContainer() {
    return (Model) eGet(OrmPackage.Literals.RELATION__RELATION_CONTAINER, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRelationContainer(Model newRelationContainer) {
    eSet(OrmPackage.Literals.RELATION__RELATION_CONTAINER, newRelationContainer);
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
  public RelationTarget getTarget() {
    return (RelationTarget) eGet(OrmPackage.Literals.RELATION__TARGET, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTarget(RelationTarget newTarget) {
    eSet(OrmPackage.Literals.RELATION__TARGET, newTarget);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RelationTarget getSource() {
    return (RelationTarget) eGet(OrmPackage.Literals.RELATION__SOURCE, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSource(RelationTarget newSource) {
    eSet(OrmPackage.Literals.RELATION__SOURCE, newSource);
  }

} //RelationImpl
