/**
 */
package org.framed.orm.model.impl;

import org.eclipse.emf.ecore.EClass;

import org.framed.orm.model.CompartmentInheritance;
import org.framed.orm.model.CompartmentType;
import org.framed.orm.model.OrmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Compartment Inheritance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.framed.orm.model.impl.CompartmentInheritanceImpl#getSub <em>Sub</em>}</li>
 *   <li>{@link org.framed.orm.model.impl.CompartmentInheritanceImpl#getSuper <em>Super</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CompartmentInheritanceImpl extends InheritanceImpl implements CompartmentInheritance {
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CompartmentInheritanceImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return OrmPackage.Literals.COMPARTMENT_INHERITANCE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CompartmentType getSub() {
    return (CompartmentType) eGet(OrmPackage.Literals.COMPARTMENT_INHERITANCE__SUB, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSub(CompartmentType newSub) {
    eSet(OrmPackage.Literals.COMPARTMENT_INHERITANCE__SUB, newSub);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CompartmentType getSuper() {
    return (CompartmentType) eGet(OrmPackage.Literals.COMPARTMENT_INHERITANCE__SUPER, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSuper(CompartmentType newSuper) {
    eSet(OrmPackage.Literals.COMPARTMENT_INHERITANCE__SUPER, newSuper);
  }

} //CompartmentInheritanceImpl
