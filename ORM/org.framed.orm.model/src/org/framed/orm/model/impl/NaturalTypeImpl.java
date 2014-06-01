/**
 */
package org.framed.orm.model.impl;

import org.eclipse.emf.ecore.EClass;
import org.framed.orm.model.CompartmentDiagram;
import org.framed.orm.model.NaturalType;
import org.framed.orm.model.OrmPackage;
import org.framed.orm.model.Rolemodel;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Natural Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.framed.orm.model.impl.NaturalTypeImpl#getParentRolemodel <em>Parent Rolemodel</em>}</li>
 *   <li>{@link org.framed.orm.model.impl.NaturalTypeImpl#getCompartmentDiagram <em>Compartment Diagram</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NaturalTypeImpl extends TypeImpl implements NaturalType {
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NaturalTypeImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return OrmPackage.Literals.NATURAL_TYPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Rolemodel getParentRolemodel() {
    return (Rolemodel) eGet(OrmPackage.Literals.NATURAL_TYPE__PARENT_ROLEMODEL, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setParentRolemodel(Rolemodel newParentRolemodel) {
    eSet(OrmPackage.Literals.NATURAL_TYPE__PARENT_ROLEMODEL, newParentRolemodel);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CompartmentDiagram getCompartmentDiagram() {
    return (CompartmentDiagram) eGet(OrmPackage.Literals.NATURAL_TYPE__COMPARTMENT_DIAGRAM, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCompartmentDiagram(CompartmentDiagram newCompartmentDiagram) {
    eSet(OrmPackage.Literals.NATURAL_TYPE__COMPARTMENT_DIAGRAM, newCompartmentDiagram);
  }

} //NaturalTypeImpl
