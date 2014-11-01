/**
 */
package org.framed.orm.model.impl;

import org.eclipse.emf.ecore.EClass;

import org.framed.orm.model.InterRelationshipConstraint;
import org.framed.orm.model.OrmPackage;
import org.framed.orm.model.Relationship;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Inter Relationship Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.framed.orm.model.impl.InterRelationshipConstraintImpl#getFirst <em>First</em>}</li>
 *   <li>{@link org.framed.orm.model.impl.InterRelationshipConstraintImpl#getSecond <em>Second</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InterRelationshipConstraintImpl extends RelationshipConstraintImpl implements
    InterRelationshipConstraint {
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected InterRelationshipConstraintImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return OrmPackage.Literals.INTER_RELATIONSHIP_CONSTRAINT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Relationship getFirst() {
    return (Relationship) eGet(OrmPackage.Literals.INTER_RELATIONSHIP_CONSTRAINT__FIRST, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFirst(Relationship newFirst) {
    eSet(OrmPackage.Literals.INTER_RELATIONSHIP_CONSTRAINT__FIRST, newFirst);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Relationship getSecond() {
    return (Relationship) eGet(OrmPackage.Literals.INTER_RELATIONSHIP_CONSTRAINT__SECOND, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSecond(Relationship newSecond) {
    eSet(OrmPackage.Literals.INTER_RELATIONSHIP_CONSTRAINT__SECOND, newSecond);
  }

} //InterRelationshipConstraintImpl
