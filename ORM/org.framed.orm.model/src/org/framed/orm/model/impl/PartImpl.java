/**
 */
package org.framed.orm.model.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.framed.orm.model.AbstractRole;
import org.framed.orm.model.CompartmentType;
import org.framed.orm.model.OrmPackage;
import org.framed.orm.model.Part;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Part</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.framed.orm.model.impl.PartImpl#getLower <em>Lower</em>}</li>
 *   <li>{@link org.framed.orm.model.impl.PartImpl#getUpper <em>Upper</em>}</li>
 *   <li>{@link org.framed.orm.model.impl.PartImpl#getWhole <em>Whole</em>}</li>
 *   <li>{@link org.framed.orm.model.impl.PartImpl#getRole <em>Role</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PartImpl extends MinimalEObjectImpl.Container implements Part {
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PartImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return OrmPackage.Literals.PART;
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
  public int getLower() {
    return (Integer) eGet(OrmPackage.Literals.PART__LOWER, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLower(int newLower) {
    eSet(OrmPackage.Literals.PART__LOWER, newLower);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getUpper() {
    return (Integer) eGet(OrmPackage.Literals.PART__UPPER, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUpper(int newUpper) {
    eSet(OrmPackage.Literals.PART__UPPER, newUpper);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CompartmentType getWhole() {
    return (CompartmentType) eGet(OrmPackage.Literals.PART__WHOLE, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setWhole(CompartmentType newWhole) {
    eSet(OrmPackage.Literals.PART__WHOLE, newWhole);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbstractRole getRole() {
    return (AbstractRole) eGet(OrmPackage.Literals.PART__ROLE, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRole(AbstractRole newRole) {
    eSet(OrmPackage.Literals.PART__ROLE, newRole);
  }

} //PartImpl
