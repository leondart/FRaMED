/**
 */
package org.framed.orm.model.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.framed.orm.model.OrmPackage;
import org.framed.orm.model.RelationLabel;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Relation Label</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.framed.orm.model.impl.RelationLabelImpl#getLabel <em>Label</em>}</li>
 * <li>{@link org.framed.orm.model.impl.RelationLabelImpl#isIsRelationEnd <em>Is Relation End</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class RelationLabelImpl extends MinimalEObjectImpl.Container implements RelationLabel {
  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  protected RelationLabelImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return OrmPackage.Literals.RELATION_LABEL;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Override
  protected int eStaticFeatureCount() {
    return 0;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String getLabel() {
    return (String) eGet(OrmPackage.Literals.RELATION_LABEL__LABEL, true);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated NOT
   * @author Lars Schuetze
   */
  @Override
  public void setLabel(String newLabel) {
    int lower, upper;
    String[] split = newLabel.split("[..]");

    if (split.length == 1 && "*".equals(newLabel)) {
      lower = upper = -1;
    } else {
      upper = "*".equals(split[2]) ? -1 : Integer.parseInt(split[2]);
      lower = Integer.parseInt(split[0]);
    }

    eSet(OrmPackage.Literals.RELATION_LABEL__LABEL, newLabel);

    if (isIsRelationEnd()) {
      eContainer().eSet(OrmPackage.Literals.RELATIONSHIP__SECOND_LOWER, lower);
      eContainer().eSet(OrmPackage.Literals.RELATIONSHIP__SECOND_UPPER, upper);
    } else {
      eContainer().eSet(OrmPackage.Literals.RELATIONSHIP__FIRST_LOWER, lower);
      eContainer().eSet(OrmPackage.Literals.RELATIONSHIP__FIRST_UPPER, upper);
    }
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Override
  public boolean isIsRelationEnd() {
    return (Boolean) eGet(OrmPackage.Literals.RELATION_LABEL__IS_RELATION_END, true);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Override
  public void setIsRelationEnd(boolean newIsRelationEnd) {
    eSet(OrmPackage.Literals.RELATION_LABEL__IS_RELATION_END, newIsRelationEnd);
  }

} // RelationLabelImpl
