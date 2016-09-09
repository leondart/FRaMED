/**
 */
package org.framed.orm.featuremodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>FRa MED Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.framed.orm.featuremodel.FRaMEDFeature#getName <em>Name</em>}</li>
 *   <li>{@link org.framed.orm.featuremodel.FRaMEDFeature#isManuallySelected <em>Manually Selected</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.framed.orm.featuremodel.FeaturemodelPackage#getFRaMEDFeature()
 * @model
 * @generated
 */
public interface FRaMEDFeature extends EObject {
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * The default value is <code>"RML_Feature_Model"</code>.
   * The literals are from the enumeration {@link org.framed.orm.featuremodel.FeatureName}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see org.framed.orm.featuremodel.FeatureName
   * @see #setName(FeatureName)
   * @see org.framed.orm.featuremodel.FeaturemodelPackage#getFRaMEDFeature_Name()
   * @model default="RML_Feature_Model" id="true" required="true"
   * @generated
   */
  FeatureName getName();

  /**
   * Sets the value of the '{@link org.framed.orm.featuremodel.FRaMEDFeature#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see org.framed.orm.featuremodel.FeatureName
   * @see #getName()
   * @generated
   */
  void setName(FeatureName value);

  /**
   * Returns the value of the '<em><b>Manually Selected</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Manually Selected</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Manually Selected</em>' attribute.
   * @see #setManuallySelected(boolean)
   * @see org.framed.orm.featuremodel.FeaturemodelPackage#getFRaMEDFeature_ManuallySelected()
   * @model required="true"
   * @generated
   */
  boolean isManuallySelected();

  /**
   * Sets the value of the '{@link org.framed.orm.featuremodel.FRaMEDFeature#isManuallySelected <em>Manually Selected</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Manually Selected</em>' attribute.
   * @see #isManuallySelected()
   * @generated
   */
  void setManuallySelected(boolean value);

} // FRaMEDFeature
