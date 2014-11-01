/**
 */
package org.framed.orm.model.impl;

import org.eclipse.emf.ecore.EClass;

import org.framed.orm.model.OrmPackage;
import org.framed.orm.model.RoleInheritance;
import org.framed.orm.model.RoleType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Role Inheritance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.framed.orm.model.impl.RoleInheritanceImpl#getSub <em>Sub</em>}</li>
 *   <li>{@link org.framed.orm.model.impl.RoleInheritanceImpl#getSuper <em>Super</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RoleInheritanceImpl extends InheritanceImpl implements RoleInheritance {
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RoleInheritanceImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return OrmPackage.Literals.ROLE_INHERITANCE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RoleType getSub() {
    return (RoleType) eGet(OrmPackage.Literals.ROLE_INHERITANCE__SUB, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSub(RoleType newSub) {
    eSet(OrmPackage.Literals.ROLE_INHERITANCE__SUB, newSub);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RoleType getSuper() {
    return (RoleType) eGet(OrmPackage.Literals.ROLE_INHERITANCE__SUPER, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSuper(RoleType newSuper) {
    eSet(OrmPackage.Literals.ROLE_INHERITANCE__SUPER, newSuper);
  }

} //RoleInheritanceImpl
