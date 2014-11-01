/**
 */
package org.framed.orm.model.impl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.framed.orm.model.AbstractRole;
import org.framed.orm.model.AbstractRoleModel;
import org.framed.orm.model.OrmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Role Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.framed.orm.model.impl.AbstractRoleModelImpl#getAbstractroles <em>Abstractroles</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AbstractRoleModelImpl extends ModelImpl implements AbstractRoleModel {
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AbstractRoleModelImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return OrmPackage.Literals.ABSTRACT_ROLE_MODEL;
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

} //AbstractRoleModelImpl
