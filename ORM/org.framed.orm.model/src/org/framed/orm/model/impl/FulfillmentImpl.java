/**
 */
package org.framed.orm.model.impl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.framed.orm.model.AbstractRole;
import org.framed.orm.model.Fulfillment;
import org.framed.orm.model.OrmPackage;
import org.framed.orm.model.RigidType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fulfillment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.framed.orm.model.impl.FulfillmentImpl#getFulfilledRoles <em>Fulfilled Roles</em>}</li>
 *   <li>{@link org.framed.orm.model.impl.FulfillmentImpl#getFiller <em>Filler</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FulfillmentImpl extends RelationImpl implements Fulfillment {
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
  @SuppressWarnings("unchecked")
  public EList<AbstractRole> getFulfilledRoles() {
    return (EList<AbstractRole>) eGet(OrmPackage.Literals.FULFILLMENT__FULFILLED_ROLES, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RigidType getFiller() {
    return (RigidType) eGet(OrmPackage.Literals.FULFILLMENT__FILLER, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFiller(RigidType newFiller) {
    eSet(OrmPackage.Literals.FULFILLMENT__FILLER, newFiller);
  }

} //FulfillmentImpl
