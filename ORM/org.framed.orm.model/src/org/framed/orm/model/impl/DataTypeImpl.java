/**
 */
package org.framed.orm.model.impl;

import org.eclipse.emf.ecore.EClass;

import org.framed.orm.model.DataType;
import org.framed.orm.model.OrmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.framed.orm.model.impl.DataTypeImpl#isSerializable <em>Serializable</em>}</li>
 *   <li>{@link org.framed.orm.model.impl.DataTypeImpl#getTr_extends <em>Tr extends</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DataTypeImpl extends RigidTypeImpl implements DataType {
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DataTypeImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return OrmPackage.Literals.DATA_TYPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isSerializable() {
    return (Boolean) eGet(OrmPackage.Literals.DATA_TYPE__SERIALIZABLE, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSerializable(boolean newSerializable) {
    eSet(OrmPackage.Literals.DATA_TYPE__SERIALIZABLE, newSerializable);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataType getTr_extends() {
    return (DataType) eGet(OrmPackage.Literals.DATA_TYPE__TR_EXTENDS, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTr_extends(DataType newTr_extends) {
    eSet(OrmPackage.Literals.DATA_TYPE__TR_EXTENDS, newTr_extends);
  }

} //DataTypeImpl
