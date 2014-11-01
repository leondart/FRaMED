/**
 */
package org.framed.orm.model.impl;

import org.eclipse.emf.ecore.EClass;

import org.framed.orm.model.DataInheritance;
import org.framed.orm.model.DataType;
import org.framed.orm.model.OrmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Inheritance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.framed.orm.model.impl.DataInheritanceImpl#getSuper <em>Super</em>}</li>
 *   <li>{@link org.framed.orm.model.impl.DataInheritanceImpl#getSub <em>Sub</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DataInheritanceImpl extends InheritanceImpl implements DataInheritance {
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DataInheritanceImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return OrmPackage.Literals.DATA_INHERITANCE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataType getSuper() {
    return (DataType) eGet(OrmPackage.Literals.DATA_INHERITANCE__SUPER, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSuper(DataType newSuper) {
    eSet(OrmPackage.Literals.DATA_INHERITANCE__SUPER, newSuper);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataType getSub() {
    return (DataType) eGet(OrmPackage.Literals.DATA_INHERITANCE__SUB, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSub(DataType newSub) {
    eSet(OrmPackage.Literals.DATA_INHERITANCE__SUB, newSub);
  }

} //DataInheritanceImpl
