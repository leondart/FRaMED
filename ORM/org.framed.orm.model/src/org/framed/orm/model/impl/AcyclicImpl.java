/**
 */
package org.framed.orm.model.impl;

import org.eclipse.emf.ecore.EClass;

import org.framed.orm.model.Acyclic;
import org.framed.orm.model.OrmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Acyclic</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class AcyclicImpl extends RelationshipConstraintImpl implements Acyclic {
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AcyclicImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return OrmPackage.Literals.ACYCLIC;
  }

} //AcyclicImpl
