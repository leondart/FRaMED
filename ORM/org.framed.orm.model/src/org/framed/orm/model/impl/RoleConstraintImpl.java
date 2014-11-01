/**
 */
package org.framed.orm.model.impl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.framed.orm.model.AbstractRole;
import org.framed.orm.model.OrmPackage;
import org.framed.orm.model.RoleConstraint;
import org.framed.orm.model.RoleType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Role Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.framed.orm.model.impl.RoleConstraintImpl#getEnds <em>Ends</em>}</li>
 *   <li>{@link org.framed.orm.model.impl.RoleConstraintImpl#getSecond <em>Second</em>}</li>
 *   <li>{@link org.framed.orm.model.impl.RoleConstraintImpl#getFirst <em>First</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class RoleConstraintImpl extends ConstraintImpl implements RoleConstraint {
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RoleConstraintImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return OrmPackage.Literals.ROLE_CONSTRAINT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  public EList<RoleType> getEnds() {
    return (EList<RoleType>) eGet(OrmPackage.Literals.ROLE_CONSTRAINT__ENDS, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbstractRole getSecond() {
    return (AbstractRole) eGet(OrmPackage.Literals.ROLE_CONSTRAINT__SECOND, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSecond(AbstractRole newSecond) {
    eSet(OrmPackage.Literals.ROLE_CONSTRAINT__SECOND, newSecond);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbstractRole getFirst() {
    return (AbstractRole) eGet(OrmPackage.Literals.ROLE_CONSTRAINT__FIRST, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFirst(AbstractRole newFirst) {
    eSet(OrmPackage.Literals.ROLE_CONSTRAINT__FIRST, newFirst);
  }

} //RoleConstraintImpl
