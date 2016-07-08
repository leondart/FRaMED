/**
 */
package org.framed.orm.featuremodel.impl;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.framed.orm.featuremodel.FRaMEDConfiguration;
import org.framed.orm.featuremodel.FRaMEDFeature;
import org.framed.orm.featuremodel.FeaturemodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>FRa MED Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.framed.orm.featuremodel.impl.FRaMEDConfigurationImpl#getFeatures <em>Features</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FRaMEDConfigurationImpl extends MinimalEObjectImpl.Container implements
    FRaMEDConfiguration {
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FRaMEDConfigurationImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return FeaturemodelPackage.Literals.FRA_MED_CONFIGURATION;
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
  @SuppressWarnings("unchecked")
  public EList<FRaMEDFeature> getFeatures() {
    return (EList<FRaMEDFeature>) eGet(
        FeaturemodelPackage.Literals.FRA_MED_CONFIGURATION__FEATURES, true);
  }

} //FRaMEDConfigurationImpl
