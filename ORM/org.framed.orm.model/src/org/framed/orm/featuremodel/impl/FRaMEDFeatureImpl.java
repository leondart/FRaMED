/**
 */
package org.framed.orm.featuremodel.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.framed.orm.featuremodel.FRaMEDFeature;
import org.framed.orm.featuremodel.FeatureName;
import org.framed.orm.featuremodel.FeaturemodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>FRa MED Feature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.framed.orm.featuremodel.impl.FRaMEDFeatureImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.framed.orm.featuremodel.impl.FRaMEDFeatureImpl#isManuallySelected <em>Manually Selected</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FRaMEDFeatureImpl extends MinimalEObjectImpl.Container implements FRaMEDFeature {
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FRaMEDFeatureImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return FeaturemodelPackage.Literals.FRA_MED_FEATURE;
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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FeatureName getName() {
    return (FeatureName) eGet(FeaturemodelPackage.Literals.FRA_MED_FEATURE__NAME, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(FeatureName newName) {
    eSet(FeaturemodelPackage.Literals.FRA_MED_FEATURE__NAME, newName);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isManuallySelected() {
    return (Boolean) eGet(FeaturemodelPackage.Literals.FRA_MED_FEATURE__MANUALLY_SELECTED, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setManuallySelected(boolean newManuallySelected) {
    eSet(FeaturemodelPackage.Literals.FRA_MED_FEATURE__MANUALLY_SELECTED, newManuallySelected);
  }

} //FRaMEDFeatureImpl
