/**
 */
package org.framed.orm.model.impl;

import org.eclipse.emf.ecore.EClass;

import org.framed.orm.model.OrmPackage;
import org.framed.orm.model.Parthood;
import org.framed.orm.model.ParthoodConstraint;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parthood Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.framed.orm.model.impl.ParthoodConstraintImpl#getKind <em>Kind</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ParthoodConstraintImpl extends IntraRelationshipConstraintImpl implements
    ParthoodConstraint {
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ParthoodConstraintImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return OrmPackage.Literals.PARTHOOD_CONSTRAINT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Parthood getKind() {
    return (Parthood) eGet(OrmPackage.Literals.PARTHOOD_CONSTRAINT__KIND, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setKind(Parthood newKind) {
    eSet(OrmPackage.Literals.PARTHOOD_CONSTRAINT__KIND, newKind);
  }

} //ParthoodConstraintImpl
