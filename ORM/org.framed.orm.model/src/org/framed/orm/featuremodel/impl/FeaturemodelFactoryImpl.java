/**
 */
package org.framed.orm.featuremodel.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.framed.orm.featuremodel.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FeaturemodelFactoryImpl extends EFactoryImpl implements FeaturemodelFactory {
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static FeaturemodelFactory init() {
    try {
      FeaturemodelFactory theFeaturemodelFactory =
          (FeaturemodelFactory) EPackage.Registry.INSTANCE.getEFactory(FeaturemodelPackage.eNS_URI);
      if (theFeaturemodelFactory != null) {
        return theFeaturemodelFactory;
      }
    } catch (Exception exception) {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new FeaturemodelFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FeaturemodelFactoryImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass) {
    switch (eClass.getClassifierID()) {
      case FeaturemodelPackage.FRA_MED_FEATURE:
        return createFRaMEDFeature();
      case FeaturemodelPackage.FRA_MED_CONFIGURATION:
        return createFRaMEDConfiguration();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName()
            + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue) {
    switch (eDataType.getClassifierID()) {
      case FeaturemodelPackage.FEATURE_NAME:
        return createFeatureNameFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName()
            + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue) {
    switch (eDataType.getClassifierID()) {
      case FeaturemodelPackage.FEATURE_NAME:
        return convertFeatureNameToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName()
            + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FRaMEDFeature createFRaMEDFeature() {
    FRaMEDFeatureImpl fRaMEDFeature = new FRaMEDFeatureImpl();
    return fRaMEDFeature;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FRaMEDConfiguration createFRaMEDConfiguration() {
    FRaMEDConfigurationImpl fRaMEDConfiguration = new FRaMEDConfigurationImpl();
    return fRaMEDConfiguration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FeatureName createFeatureNameFromString(EDataType eDataType, String initialValue) {
    FeatureName result = FeatureName.get(initialValue);
    if (result == null)
      throw new IllegalArgumentException("The value '" + initialValue
          + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertFeatureNameToString(EDataType eDataType, Object instanceValue) {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FeaturemodelPackage getFeaturemodelPackage() {
    return (FeaturemodelPackage) getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static FeaturemodelPackage getPackage() {
    return FeaturemodelPackage.eINSTANCE;
  }

} //FeaturemodelFactoryImpl
