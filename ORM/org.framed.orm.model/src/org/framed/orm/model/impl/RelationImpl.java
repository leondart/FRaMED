/**
 */
package org.framed.orm.model.impl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.framed.orm.geometry.RelativePoint;

import org.framed.orm.model.ModelElement;
import org.framed.orm.model.NamedElement;
import org.framed.orm.model.OrmPackage;
import org.framed.orm.model.Relation;
import org.framed.orm.model.Shape;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.framed.orm.model.impl.RelationImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.framed.orm.model.impl.RelationImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.framed.orm.model.impl.RelationImpl#getBendpoints <em>Bendpoints</em>}</li>
 *   <li>{@link org.framed.orm.model.impl.RelationImpl#getSourceLabel <em>Source Label</em>}</li>
 *   <li>{@link org.framed.orm.model.impl.RelationImpl#getTargetLabel <em>Target Label</em>}</li>
 *   <li>{@link org.framed.orm.model.impl.RelationImpl#getReferencedRelation <em>Referenced Relation</em>}</li>
 *   <li>{@link org.framed.orm.model.impl.RelationImpl#getReferencedRoles <em>Referenced Roles</em>}</li>
 *   <li>{@link org.framed.orm.model.impl.RelationImpl#getConnectionAnchor <em>Connection Anchor</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RelationImpl extends ModelElementImpl implements Relation {
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RelationImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return OrmPackage.Literals.RELATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ModelElement getTarget() {
    return (ModelElement) eGet(OrmPackage.Literals.RELATION__TARGET, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTarget(ModelElement newTarget) {
    eSet(OrmPackage.Literals.RELATION__TARGET, newTarget);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ModelElement getSource() {
    return (ModelElement) eGet(OrmPackage.Literals.RELATION__SOURCE, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSource(ModelElement newSource) {
    eSet(OrmPackage.Literals.RELATION__SOURCE, newSource);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  public EList<RelativePoint> getBendpoints() {
    return (EList<RelativePoint>) eGet(OrmPackage.Literals.RELATION__BENDPOINTS, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NamedElement getSourceLabel() {
    return (NamedElement) eGet(OrmPackage.Literals.RELATION__SOURCE_LABEL, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSourceLabel(NamedElement newSourceLabel) {
    eSet(OrmPackage.Literals.RELATION__SOURCE_LABEL, newSourceLabel);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NamedElement getTargetLabel() {
    return (NamedElement) eGet(OrmPackage.Literals.RELATION__TARGET_LABEL, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTargetLabel(NamedElement newTargetLabel) {
    eSet(OrmPackage.Literals.RELATION__TARGET_LABEL, newTargetLabel);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  public EList<Relation> getReferencedRelation() {
    return (EList<Relation>) eGet(OrmPackage.Literals.RELATION__REFERENCED_RELATION, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  public EList<Shape> getReferencedRoles() {
    return (EList<Shape>) eGet(OrmPackage.Literals.RELATION__REFERENCED_ROLES, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Shape getConnectionAnchor() {
    return (Shape) eGet(OrmPackage.Literals.RELATION__CONNECTION_ANCHOR, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setConnectionAnchor(Shape newConnectionAnchor) {
    eSet(OrmPackage.Literals.RELATION__CONNECTION_ANCHOR, newConnectionAnchor);
  }

} //RelationImpl
