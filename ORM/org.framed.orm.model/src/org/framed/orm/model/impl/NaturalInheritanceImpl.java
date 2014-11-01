/**
 */
package org.framed.orm.model.impl;

import org.eclipse.emf.ecore.EClass;

import org.framed.orm.model.NaturalInheritance;
import org.framed.orm.model.NaturalType;
import org.framed.orm.model.OrmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Natural Inheritance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.framed.orm.model.impl.NaturalInheritanceImpl#getSuper <em>Super</em>}</li>
 *   <li>{@link org.framed.orm.model.impl.NaturalInheritanceImpl#getSub <em>Sub</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NaturalInheritanceImpl extends InheritanceImpl implements NaturalInheritance {
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NaturalInheritanceImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return OrmPackage.Literals.NATURAL_INHERITANCE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NaturalType getSuper() {
    return (NaturalType) eGet(OrmPackage.Literals.NATURAL_INHERITANCE__SUPER, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSuper(NaturalType newSuper) {
    eSet(OrmPackage.Literals.NATURAL_INHERITANCE__SUPER, newSuper);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NaturalType getSub() {
    return (NaturalType) eGet(OrmPackage.Literals.NATURAL_INHERITANCE__SUB, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSub(NaturalType newSub) {
    eSet(OrmPackage.Literals.NATURAL_INHERITANCE__SUB, newSub);
  }

} //NaturalInheritanceImpl
