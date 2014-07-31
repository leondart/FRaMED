/**
 */
package org.framed.orm.model.impl;

import org.eclipse.draw2d.geometry.Point;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.framed.orm.model.Node;
import org.framed.orm.model.OrmPackage;
import org.framed.orm.model.Parthood;
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
 *   <li>{@link org.framed.orm.model.impl.RelationshipImpl#getFirstLowerUpper <em>First Lower Upper</em>}</li>
 *   <li>{@link org.framed.orm.model.impl.RelationshipImpl#getSecondLowerUpper <em>Second Lower Upper</em>}</li>
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
   * <!-- begin-user-doc --> <!-- end-user-doc -->
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
  public org.framed.orm.model.Container getRelationContainer() {
    return (org.framed.orm.model.Container) eGet(OrmPackage.Literals.RELATION__RELATION_CONTAINER,
        true);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setRelationContainer(org.framed.orm.model.Container newRelationContainer) {
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
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setSecondUpper(int newSecondUpper) {
    eSet(OrmPackage.Literals.RELATIONSHIP__SECOND_UPPER, newSecondUpper);
  }

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
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public RelationLabel getSourceLabel() {
    return (RelationLabel) eGet(OrmPackage.Literals.RELATIONSHIP__SOURCE_LABEL, true);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setSourceLabel(RelationLabel newSourceLabel) {
    eSet(OrmPackage.Literals.RELATIONSHIP__SOURCE_LABEL, newSourceLabel);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public RelationLabel getTargetLabel() {
    return (RelationLabel) eGet(OrmPackage.Literals.RELATIONSHIP__TARGET_LABEL, true);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated NOT
   */
  @Override
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

  private void updateCardinalityLabel(int featureID, String label) {

    if (featureID == OrmPackage.RELATIONSHIP__FIRST_LOWER_UPPER) {
//            System.out.println("Setting source label to " + label);
      getSourceLabel().eSet(OrmPackage.Literals.RELATION_LABEL__LABEL, label);
    }

    if(featureID == OrmPackage.RELATIONSHIP__SECOND_LOWER_UPPER) {
      getTargetLabel().eSet(OrmPackage.Literals.RELATION_LABEL__LABEL, label);
    }

  }

  /**
   * Resets the cardinality labels. This function is deprecated because useless but for compatibility still here.
   * 
   * @param FeatureID
   * @param cardinality
   */
  private void updateCardinality(int FeatureID, int cardinality) {
    String newLabel = null;

   

    // to group the setting
    switch (FeatureID) {
      case OrmPackage.RELATIONSHIP__SECOND_LOWER:
      case OrmPackage.RELATIONSHIP__SECOND_UPPER:
        getTargetLabel().eSet(OrmPackage.Literals.RELATION_LABEL__LABEL, newLabel);
        break;
      case OrmPackage.RELATIONSHIP__FIRST_LOWER:
      case OrmPackage.RELATIONSHIP__FIRST_UPPER:
      case OrmPackage.RELATIONSHIP__FIRST_LOWER_UPPER:
        getSourceLabel().eSet(OrmPackage.Literals.RELATION_LABEL__LABEL, newLabel);
        break;
    }
  }

  @Override
  public void eNotify(Notification notification) {
    super.eNotify(notification);
    if (notification.getEventType() == Notification.SET) {
      int feature = notification.getFeatureID(Relationship.class);
      if (feature != Notification.NO_FEATURE_ID) {
        try {
          updateCardinalityLabel(feature, notification.getNewStringValue());
        } catch (IllegalStateException e) {
          // do nothing
        }
      }
    }
  }
} // RelationshipImpl
