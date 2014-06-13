/**
 */
package org.framed.orm.model.impl;

import org.eclipse.draw2d.geometry.Point;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.framed.orm.model.Fulfillment;
import org.framed.orm.model.Node;
import org.framed.orm.model.OrmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fulfillment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.framed.orm.model.impl.FulfillmentImpl#getRelationContainer <em>Relation Container</em>}</li>
 *   <li>{@link org.framed.orm.model.impl.FulfillmentImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.framed.orm.model.impl.FulfillmentImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.framed.orm.model.impl.FulfillmentImpl#getDim1BP <em>Dim1 BP</em>}</li>
 *   <li>{@link org.framed.orm.model.impl.FulfillmentImpl#getDim2BP <em>Dim2 BP</em>}</li>
 *   <li>{@link org.framed.orm.model.impl.FulfillmentImpl#getFulfilledRoles <em>Fulfilled Roles</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FulfillmentImpl extends MinimalEObjectImpl.Container implements Fulfillment {
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FulfillmentImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return OrmPackage.Literals.FULFILLMENT;
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
  @SuppressWarnings("unchecked")
  public EList<String> getFulfilledRoles() {
    return (EList<String>) eGet(OrmPackage.Literals.FULFILLMENT__FULFILLED_ROLES, true);
  }

} //FulfillmentImpl
