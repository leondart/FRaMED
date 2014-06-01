/**
 */
package org.framed.orm.model.impl;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.framed.orm.model.ComplexConstraint;
import org.framed.orm.model.OrmPackage;
import org.framed.orm.model.RoleGroup;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Complex Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.framed.orm.model.impl.ComplexConstraintImpl#getGroups <em>Groups</em>}</li>
 *   <li>{@link org.framed.orm.model.impl.ComplexConstraintImpl#getExpression <em>Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ComplexConstraintImpl extends ConstraintImpl implements ComplexConstraint {
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ComplexConstraintImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return OrmPackage.Literals.COMPLEX_CONSTRAINT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  public EList<RoleGroup> getGroups() {
    return (EList<RoleGroup>) eGet(OrmPackage.Literals.COMPLEX_CONSTRAINT__GROUPS, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getExpression() {
    return (String) eGet(OrmPackage.Literals.COMPLEX_CONSTRAINT__EXPRESSION, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpression(String newExpression) {
    eSet(OrmPackage.Literals.COMPLEX_CONSTRAINT__EXPRESSION, newExpression);
  }

} //ComplexConstraintImpl
