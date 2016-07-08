/**
 */
package org.framed.orm.model.impl;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.framed.orm.featuremodel.FRaMEDConfiguration;
import org.framed.orm.model.Model;
import org.framed.orm.model.ModelElement;
import org.framed.orm.model.OrmPackage;
import org.framed.orm.model.Shape;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.framed.orm.model.impl.ModelImpl#getElements <em>Elements</em>}</li>
 *   <li>{@link org.framed.orm.model.impl.ModelImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link org.framed.orm.model.impl.ModelImpl#getFramedConfiguration <em>Framed Configuration</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModelImpl extends MinimalEObjectImpl.Container implements Model {
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ModelImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return OrmPackage.Literals.MODEL;
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
  public EList<ModelElement> getElements() {
    return (EList<ModelElement>) eGet(OrmPackage.Literals.MODEL__ELEMENTS, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Shape getParent() {
    return (Shape) eGet(OrmPackage.Literals.MODEL__PARENT, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setParent(Shape newParent) {
    eSet(OrmPackage.Literals.MODEL__PARENT, newParent);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FRaMEDConfiguration getFramedConfiguration() {
    return (FRaMEDConfiguration) eGet(OrmPackage.Literals.MODEL__FRAMED_CONFIGURATION, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFramedConfiguration(FRaMEDConfiguration newFramedConfiguration) {
    eSet(OrmPackage.Literals.MODEL__FRAMED_CONFIGURATION, newFramedConfiguration);
  }

} //ModelImpl
