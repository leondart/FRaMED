/**
 */
package org.framed.orm.model.impl;

import org.eclipse.emf.ecore.EClass;
import org.framed.orm.model.AbstractRole;
import org.framed.orm.model.OrmPackage;
import org.framed.orm.model.RoleInvariant;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Role Invariant</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.framed.orm.model.impl.RoleInvariantImpl#getSubject <em>Subject</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class RoleInvariantImpl extends ConstraintImpl implements RoleInvariant {
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RoleInvariantImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return OrmPackage.Literals.ROLE_INVARIANT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbstractRole getSubject() {
    return (AbstractRole) eGet(OrmPackage.Literals.ROLE_INVARIANT__SUBJECT, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSubject(AbstractRole newSubject) {
    eSet(OrmPackage.Literals.ROLE_INVARIANT__SUBJECT, newSubject);
  }

} //RoleInvariantImpl
