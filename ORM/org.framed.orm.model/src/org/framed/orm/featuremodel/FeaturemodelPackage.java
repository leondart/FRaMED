/**
 */
package org.framed.orm.featuremodel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.framed.orm.featuremodel.FeaturemodelFactory
 * @model kind="package"
 * @generated
 */
public interface FeaturemodelPackage extends EPackage {
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "featuremodel";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://orm.featuremodel/1.0";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "org.framed.orm.model.featuremodel";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  FeaturemodelPackage eINSTANCE = org.framed.orm.featuremodel.impl.FeaturemodelPackageImpl.init();

  /**
   * The meta object id for the '{@link org.framed.orm.featuremodel.impl.FRaMEDFeatureImpl <em>FRa MED Feature</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.framed.orm.featuremodel.impl.FRaMEDFeatureImpl
   * @see org.framed.orm.featuremodel.impl.FeaturemodelPackageImpl#getFRaMEDFeature()
   * @generated
   */
  int FRA_MED_FEATURE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FRA_MED_FEATURE__NAME = 0;

  /**
   * The feature id for the '<em><b>Manually Selected</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FRA_MED_FEATURE__MANUALLY_SELECTED = 1;

  /**
   * The number of structural features of the '<em>FRa MED Feature</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FRA_MED_FEATURE_FEATURE_COUNT = 2;

  /**
   * The number of operations of the '<em>FRa MED Feature</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FRA_MED_FEATURE_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link org.framed.orm.featuremodel.impl.FRaMEDConfigurationImpl <em>FRa MED Configuration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.framed.orm.featuremodel.impl.FRaMEDConfigurationImpl
   * @see org.framed.orm.featuremodel.impl.FeaturemodelPackageImpl#getFRaMEDConfiguration()
   * @generated
   */
  int FRA_MED_CONFIGURATION = 1;

  /**
   * The feature id for the '<em><b>Features</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FRA_MED_CONFIGURATION__FEATURES = 0;

  /**
   * The number of structural features of the '<em>FRa MED Configuration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FRA_MED_CONFIGURATION_FEATURE_COUNT = 1;

  /**
   * The number of operations of the '<em>FRa MED Configuration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FRA_MED_CONFIGURATION_OPERATION_COUNT = 0;


  /**
   * Returns the meta object for class '{@link org.framed.orm.featuremodel.FRaMEDFeature <em>FRa MED Feature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>FRa MED Feature</em>'.
   * @see org.framed.orm.featuremodel.FRaMEDFeature
   * @generated
   */
  EClass getFRaMEDFeature();

  /**
   * Returns the meta object for the attribute '{@link org.framed.orm.featuremodel.FRaMEDFeature#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.framed.orm.featuremodel.FRaMEDFeature#getName()
   * @see #getFRaMEDFeature()
   * @generated
   */
  EAttribute getFRaMEDFeature_Name();

  /**
   * Returns the meta object for the attribute '{@link org.framed.orm.featuremodel.FRaMEDFeature#isManuallySelected <em>Manually Selected</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Manually Selected</em>'.
   * @see org.framed.orm.featuremodel.FRaMEDFeature#isManuallySelected()
   * @see #getFRaMEDFeature()
   * @generated
   */
  EAttribute getFRaMEDFeature_ManuallySelected();

  /**
   * Returns the meta object for class '{@link org.framed.orm.featuremodel.FRaMEDConfiguration <em>FRa MED Configuration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>FRa MED Configuration</em>'.
   * @see org.framed.orm.featuremodel.FRaMEDConfiguration
   * @generated
   */
  EClass getFRaMEDConfiguration();

  /**
   * Returns the meta object for the containment reference list '{@link org.framed.orm.featuremodel.FRaMEDConfiguration#getFeatures <em>Features</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Features</em>'.
   * @see org.framed.orm.featuremodel.FRaMEDConfiguration#getFeatures()
   * @see #getFRaMEDConfiguration()
   * @generated
   */
  EReference getFRaMEDConfiguration_Features();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  FeaturemodelFactory getFeaturemodelFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each operation of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals {
    /**
     * The meta object literal for the '{@link org.framed.orm.featuremodel.impl.FRaMEDFeatureImpl <em>FRa MED Feature</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.framed.orm.featuremodel.impl.FRaMEDFeatureImpl
     * @see org.framed.orm.featuremodel.impl.FeaturemodelPackageImpl#getFRaMEDFeature()
     * @generated
     */
    EClass FRA_MED_FEATURE = eINSTANCE.getFRaMEDFeature();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FRA_MED_FEATURE__NAME = eINSTANCE.getFRaMEDFeature_Name();

    /**
     * The meta object literal for the '<em><b>Manually Selected</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FRA_MED_FEATURE__MANUALLY_SELECTED = eINSTANCE.getFRaMEDFeature_ManuallySelected();

    /**
     * The meta object literal for the '{@link org.framed.orm.featuremodel.impl.FRaMEDConfigurationImpl <em>FRa MED Configuration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.framed.orm.featuremodel.impl.FRaMEDConfigurationImpl
     * @see org.framed.orm.featuremodel.impl.FeaturemodelPackageImpl#getFRaMEDConfiguration()
     * @generated
     */
    EClass FRA_MED_CONFIGURATION = eINSTANCE.getFRaMEDConfiguration();

    /**
     * The meta object literal for the '<em><b>Features</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FRA_MED_CONFIGURATION__FEATURES = eINSTANCE.getFRaMEDConfiguration_Features();

  }

} //FeaturemodelPackage
