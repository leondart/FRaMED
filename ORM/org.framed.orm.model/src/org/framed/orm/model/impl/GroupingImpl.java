/**
 */
package org.framed.orm.model.impl;

import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.framed.orm.model.CompartmentDiagram;
import org.framed.orm.model.Grouping;
import org.framed.orm.model.OrmPackage;
import org.framed.orm.model.Relation;
import org.framed.orm.model.Rolemodel;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Grouping</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.framed.orm.model.impl.GroupingImpl#getIncomingLinks <em>Incoming Links</em>}</li>
 *   <li>{@link org.framed.orm.model.impl.GroupingImpl#getOutgoingLinks <em>Outgoing Links</em>}</li>
 *   <li>{@link org.framed.orm.model.impl.GroupingImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.framed.orm.model.impl.GroupingImpl#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link org.framed.orm.model.impl.GroupingImpl#getCompartmentDiagram <em>Compartment Diagram</em>}</li>
 *   <li>{@link org.framed.orm.model.impl.GroupingImpl#getRolemodel <em>Rolemodel</em>}</li>
 *   <li>{@link org.framed.orm.model.impl.GroupingImpl#getParentRolemodel <em>Parent Rolemodel</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GroupingImpl extends MinimalEObjectImpl.Container implements Grouping {
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected GroupingImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return OrmPackage.Literals.GROUPING;
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
  public EList<Relation> getIncomingLinks() {
    return (EList<Relation>) eGet(OrmPackage.Literals.NODE__INCOMING_LINKS, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  public EList<Relation> getOutgoingLinks() {
    return (EList<Relation>) eGet(OrmPackage.Literals.NODE__OUTGOING_LINKS, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName() {
    return (String) eGet(OrmPackage.Literals.NODE__NAME, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName) {
    eSet(OrmPackage.Literals.NODE__NAME, newName);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Rectangle getConstraints() {
    return (Rectangle) eGet(OrmPackage.Literals.NODE__CONSTRAINTS, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setConstraints(Rectangle newConstraints) {
    eSet(OrmPackage.Literals.NODE__CONSTRAINTS, newConstraints);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CompartmentDiagram getCompartmentDiagram() {
    return (CompartmentDiagram) eGet(OrmPackage.Literals.GROUPING__COMPARTMENT_DIAGRAM, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCompartmentDiagram(CompartmentDiagram newCompartmentDiagram) {
    eSet(OrmPackage.Literals.GROUPING__COMPARTMENT_DIAGRAM, newCompartmentDiagram);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Rolemodel getRolemodel() {
    return (Rolemodel) eGet(OrmPackage.Literals.GROUPING__ROLEMODEL, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRolemodel(Rolemodel newRolemodel) {
    eSet(OrmPackage.Literals.GROUPING__ROLEMODEL, newRolemodel);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Rolemodel getParentRolemodel() {
    return (Rolemodel) eGet(OrmPackage.Literals.GROUPING__PARENT_ROLEMODEL, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setParentRolemodel(Rolemodel newParentRolemodel) {
    eSet(OrmPackage.Literals.GROUPING__PARENT_ROLEMODEL, newParentRolemodel);
  }

} //GroupingImpl
