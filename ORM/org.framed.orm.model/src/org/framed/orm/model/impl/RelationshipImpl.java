/**
 */
package org.framed.orm.model.impl;

import org.eclipse.draw2d.geometry.Point;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.framed.orm.model.Node;
import org.framed.orm.model.OrmPackage;
import org.framed.orm.model.Parthood;
import org.framed.orm.model.RelationContainer;
import org.framed.orm.model.RelationLabel;
import org.framed.orm.model.Relationship;
import org.framed.orm.model.RelationshipConstraint;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Relationship</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.framed.orm.model.impl.RelationshipImpl#getRelationContainer <em>Relation Container</em>}</li>
 *   <li>{@link org.framed.orm.model.impl.RelationshipImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.framed.orm.model.impl.RelationshipImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.framed.orm.model.impl.RelationshipImpl#getDim1BP <em>Dim1 BP</em>}</li>
 *   <li>{@link org.framed.orm.model.impl.RelationshipImpl#getDim2BP <em>Dim2 BP</em>}</li>
 *   <li>{@link org.framed.orm.model.impl.RelationshipImpl#getSecondParthood <em>Second Parthood</em>}</li>
 *   <li>{@link org.framed.orm.model.impl.RelationshipImpl#getSecondLower <em>Second Lower</em>}</li>
 *   <li>{@link org.framed.orm.model.impl.RelationshipImpl#getFirstLower <em>First Lower</em>}</li>
 *   <li>{@link org.framed.orm.model.impl.RelationshipImpl#getFirstUpper <em>First Upper</em>}</li>
 *   <li>{@link org.framed.orm.model.impl.RelationshipImpl#getSecondUpper <em>Second Upper</em>}</li>
 *   <li>{@link org.framed.orm.model.impl.RelationshipImpl#getFirstParthood <em>First Parthood</em>}</li>
 *   <li>{@link org.framed.orm.model.impl.RelationshipImpl#getRlshipConstraints <em>Rlship Constraints</em>}</li>
 *   <li>{@link org.framed.orm.model.impl.RelationshipImpl#getSourceLabel <em>Source Label</em>}</li>
 *   <li>{@link org.framed.orm.model.impl.RelationshipImpl#getTargetLabel <em>Target Label</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RelationshipImpl extends MinimalEObjectImpl.Container implements Relationship {
  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected RelationshipImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
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
  @Override
  protected int eStaticFeatureCount() {
    return 0;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public RelationContainer getRelationContainer() {
    return (RelationContainer) eGet(OrmPackage.Literals.RELATION__RELATION_CONTAINER, true);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setRelationContainer(RelationContainer newRelationContainer) {
    eSet(OrmPackage.Literals.RELATION__RELATION_CONTAINER, newRelationContainer);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Node getTarget() {
    return (Node) eGet(OrmPackage.Literals.RELATION__TARGET, true);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setTarget(Node newTarget) {
    eSet(OrmPackage.Literals.RELATION__TARGET, newTarget);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Node getSource() {
    return (Node) eGet(OrmPackage.Literals.RELATION__SOURCE, true);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setSource(Node newSource) {
    eSet(OrmPackage.Literals.RELATION__SOURCE, newSource);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public EList<Point> getDim1BP() {
    return (EList<Point>) eGet(OrmPackage.Literals.RELATION__DIM1_BP, true);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public EList<Point> getDim2BP() {
    return (EList<Point>) eGet(OrmPackage.Literals.RELATION__DIM2_BP, true);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Parthood getSecondParthood() {
    return (Parthood) eGet(OrmPackage.Literals.RELATIONSHIP__SECOND_PARTHOOD, true);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setSecondParthood(Parthood newSecondParthood) {
    eSet(OrmPackage.Literals.RELATIONSHIP__SECOND_PARTHOOD, newSecondParthood);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getSecondLower() {
    return (Integer) eGet(OrmPackage.Literals.RELATIONSHIP__SECOND_LOWER, true);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setSecondLower(int newSecondLower) {
    eSet(OrmPackage.Literals.RELATIONSHIP__SECOND_LOWER, newSecondLower);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getFirstLower() {
    return (Integer) eGet(OrmPackage.Literals.RELATIONSHIP__FIRST_LOWER, true);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setFirstLower(int newFirstLower) {
    eSet(OrmPackage.Literals.RELATIONSHIP__FIRST_LOWER, newFirstLower);
  }

  // private void updateSourceLabel() {
  // if(firstUpper == -1) {
  // if(firstLower == -1) {
  // //there is an arbitrary multiplicity
  // setSourceLabelValue("*");
  // }
  // else {
  // setSourceLabelValue(firstLower + "..*");
  // }
  // }
  // else {
  // setSourceLabelValue(firstLower + ".." + firstUpper);
  // }
  // }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getFirstUpper() {
    return (Integer) eGet(OrmPackage.Literals.RELATIONSHIP__FIRST_UPPER, true);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setFirstUpper(int newFirstUpper) {
    eSet(OrmPackage.Literals.RELATIONSHIP__FIRST_UPPER, newFirstUpper);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getSecondUpper() {
    return (Integer) eGet(OrmPackage.Literals.RELATIONSHIP__SECOND_UPPER, true);
  }

  /**
   * <!-- begin-user-doc -->
   * 
   * @param newSecondUpper If the value is -1 it indicates that there is no bound <!-- end-user-doc
   *        -->
   * @author Lars Schuetze
   * @generated
   */
  @Override
  public void setSecondUpper(int newSecondUpper) {
    eSet(OrmPackage.Literals.RELATIONSHIP__SECOND_UPPER, newSecondUpper);
  }

  // private void updateTargetLabel() {
  // if (secondUpper == -1) {
  // if (secondLower == -1) {
  // // there is an arbitrary multiplicity
  // setTargetLabelValue("*");
  // } else {
  // setTargetLabelValue(secondLower + "..*");
  // }
  // } else {
  // setTargetLabelValue(secondLower + ".." + secondUpper);
  // }
  // }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Parthood getFirstParthood() {
    return (Parthood) eGet(OrmPackage.Literals.RELATIONSHIP__FIRST_PARTHOOD, true);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setFirstParthood(Parthood newFirstParthood) {
    eSet(OrmPackage.Literals.RELATIONSHIP__FIRST_PARTHOOD, newFirstParthood);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public EList<RelationshipConstraint> getRlshipConstraints() {
    return (EList<RelationshipConstraint>) eGet(
        OrmPackage.Literals.RELATIONSHIP__RLSHIP_CONSTRAINTS, true);
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

} // RelationshipImpl
