/**
 */
package org.framed.orm.model.impl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.framed.orm.model.Direction;
import org.framed.orm.model.NamedElement;
import org.framed.orm.model.OrmPackage;
import org.framed.orm.model.Parthood;
import org.framed.orm.model.Place;
import org.framed.orm.model.RelationLabel;
import org.framed.orm.model.Relationship;
import org.framed.orm.model.RelationshipConstraint;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relationship</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.framed.orm.model.impl.RelationshipImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.framed.orm.model.impl.RelationshipImpl#getSecondParthood <em>Second Parthood</em>}</li>
 *   <li>{@link org.framed.orm.model.impl.RelationshipImpl#getSecondLower <em>Second Lower</em>}</li>
 *   <li>{@link org.framed.orm.model.impl.RelationshipImpl#getFirstLower <em>First Lower</em>}</li>
 *   <li>{@link org.framed.orm.model.impl.RelationshipImpl#getFirstUpper <em>First Upper</em>}</li>
 *   <li>{@link org.framed.orm.model.impl.RelationshipImpl#getSecondUpper <em>Second Upper</em>}</li>
 *   <li>{@link org.framed.orm.model.impl.RelationshipImpl#getFirstParthood <em>First Parthood</em>}</li>
 *   <li>{@link org.framed.orm.model.impl.RelationshipImpl#getSourceLabel <em>Source Label</em>}</li>
 *   <li>{@link org.framed.orm.model.impl.RelationshipImpl#getTargetLabel <em>Target Label</em>}</li>
 *   <li>{@link org.framed.orm.model.impl.RelationshipImpl#getFirstLowerUpper <em>First Lower Upper</em>}</li>
 *   <li>{@link org.framed.orm.model.impl.RelationshipImpl#getSecondLowerUpper <em>Second Lower Upper</em>}</li>
 *   <li>{@link org.framed.orm.model.impl.RelationshipImpl#getRlshipConstraints <em>Rlship Constraints</em>}</li>
 *   <li>{@link org.framed.orm.model.impl.RelationshipImpl#getDirection <em>Direction</em>}</li>
 *   <li>{@link org.framed.orm.model.impl.RelationshipImpl#getFirst <em>First</em>}</li>
 *   <li>{@link org.framed.orm.model.impl.RelationshipImpl#getSecond <em>Second</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RelationshipImpl extends RelationImpl implements Relationship {
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RelationshipImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return OrmPackage.Literals.RELATIONSHIP;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName() {
    return (String) eGet(OrmPackage.Literals.NAMED_ELEMENT__NAME, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName) {
    eSet(OrmPackage.Literals.NAMED_ELEMENT__NAME, newName);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Parthood getSecondParthood() {
    return (Parthood) eGet(OrmPackage.Literals.RELATIONSHIP__SECOND_PARTHOOD, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSecondParthood(Parthood newSecondParthood) {
    eSet(OrmPackage.Literals.RELATIONSHIP__SECOND_PARTHOOD, newSecondParthood);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getSecondLower() {
    return (Integer) eGet(OrmPackage.Literals.RELATIONSHIP__SECOND_LOWER, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSecondLower(int newSecondLower) {
    eSet(OrmPackage.Literals.RELATIONSHIP__SECOND_LOWER, newSecondLower);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getFirstLower() {
    return (Integer) eGet(OrmPackage.Literals.RELATIONSHIP__FIRST_LOWER, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFirstLower(int newFirstLower) {
    eSet(OrmPackage.Literals.RELATIONSHIP__FIRST_LOWER, newFirstLower);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getFirstUpper() {
    return (Integer) eGet(OrmPackage.Literals.RELATIONSHIP__FIRST_UPPER, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFirstUpper(int newFirstUpper) {
    eSet(OrmPackage.Literals.RELATIONSHIP__FIRST_UPPER, newFirstUpper);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getSecondUpper() {
    return (Integer) eGet(OrmPackage.Literals.RELATIONSHIP__SECOND_UPPER, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSecondUpper(int newSecondUpper) {
    eSet(OrmPackage.Literals.RELATIONSHIP__SECOND_UPPER, newSecondUpper);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Parthood getFirstParthood() {
    return (Parthood) eGet(OrmPackage.Literals.RELATIONSHIP__FIRST_PARTHOOD, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFirstParthood(Parthood newFirstParthood) {
    eSet(OrmPackage.Literals.RELATIONSHIP__FIRST_PARTHOOD, newFirstParthood);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RelationLabel getSourceLabel() {
    return (RelationLabel) eGet(OrmPackage.Literals.RELATIONSHIP__SOURCE_LABEL, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSourceLabel(RelationLabel newSourceLabel) {
    eSet(OrmPackage.Literals.RELATIONSHIP__SOURCE_LABEL, newSourceLabel);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RelationLabel getTargetLabel() {
    return (RelationLabel) eGet(OrmPackage.Literals.RELATIONSHIP__TARGET_LABEL, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTargetLabel(RelationLabel newTargetLabel) {
    eSet(OrmPackage.Literals.RELATIONSHIP__TARGET_LABEL, newTargetLabel);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getFirstLowerUpper() {
    return (String) eGet(OrmPackage.Literals.RELATIONSHIP__FIRST_LOWER_UPPER, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFirstLowerUpper(String newFirstLowerUpper) {
    eSet(OrmPackage.Literals.RELATIONSHIP__FIRST_LOWER_UPPER, newFirstLowerUpper);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getSecondLowerUpper() {
    return (String) eGet(OrmPackage.Literals.RELATIONSHIP__SECOND_LOWER_UPPER, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSecondLowerUpper(String newSecondLowerUpper) {
    eSet(OrmPackage.Literals.RELATIONSHIP__SECOND_LOWER_UPPER, newSecondLowerUpper);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  public EList<RelationshipConstraint> getRlshipConstraints() {
    return (EList<RelationshipConstraint>) eGet(
        OrmPackage.Literals.RELATIONSHIP__RLSHIP_CONSTRAINTS, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Direction getDirection() {
    return (Direction) eGet(OrmPackage.Literals.RELATIONSHIP__DIRECTION, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDirection(Direction newDirection) {
    eSet(OrmPackage.Literals.RELATIONSHIP__DIRECTION, newDirection);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Place getFirst() {
    return (Place) eGet(OrmPackage.Literals.RELATIONSHIP__FIRST, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFirst(Place newFirst) {
    eSet(OrmPackage.Literals.RELATIONSHIP__FIRST, newFirst);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Place getSecond() {
    return (Place) eGet(OrmPackage.Literals.RELATIONSHIP__SECOND, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSecond(Place newSecond) {
    eSet(OrmPackage.Literals.RELATIONSHIP__SECOND, newSecond);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
    if (baseClass == NamedElement.class) {
      switch (derivedFeatureID) {
        case OrmPackage.RELATIONSHIP__NAME:
          return OrmPackage.NAMED_ELEMENT__NAME;
        default:
          return -1;
      }
    }
    return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
    if (baseClass == NamedElement.class) {
      switch (baseFeatureID) {
        case OrmPackage.NAMED_ELEMENT__NAME:
          return OrmPackage.RELATIONSHIP__NAME;
        default:
          return -1;
      }
    }
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
  }

} //RelationshipImpl
