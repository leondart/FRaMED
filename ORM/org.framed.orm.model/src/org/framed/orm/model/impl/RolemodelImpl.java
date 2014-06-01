/**
 */
package org.framed.orm.model.impl;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.framed.orm.model.AbstractRole;
import org.framed.orm.model.Compartment;
import org.framed.orm.model.Grouping;
import org.framed.orm.model.NaturalType;
import org.framed.orm.model.OrmPackage;
import org.framed.orm.model.Rolemodel;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rolemodel</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.framed.orm.model.impl.RolemodelImpl#getSubcontexts <em>Subcontexts</em>}</li>
 *   <li>{@link org.framed.orm.model.impl.RolemodelImpl#getParticipants <em>Participants</em>}</li>
 *   <li>{@link org.framed.orm.model.impl.RolemodelImpl#getPlayers <em>Players</em>}</li>
 *   <li>{@link org.framed.orm.model.impl.RolemodelImpl#getCompartment <em>Compartment</em>}</li>
 *   <li>{@link org.framed.orm.model.impl.RolemodelImpl#getParentGroup <em>Parent Group</em>}</li>
 *   <li>{@link org.framed.orm.model.impl.RolemodelImpl#getGroups <em>Groups</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RolemodelImpl extends RelationContainerImpl implements Rolemodel {
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RolemodelImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return OrmPackage.Literals.ROLEMODEL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  public EList<Compartment> getSubcontexts() {
    return (EList<Compartment>) eGet(OrmPackage.Literals.ROLEMODEL__SUBCONTEXTS, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  public EList<AbstractRole> getParticipants() {
    return (EList<AbstractRole>) eGet(OrmPackage.Literals.ROLEMODEL__PARTICIPANTS, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  public EList<NaturalType> getPlayers() {
    return (EList<NaturalType>) eGet(OrmPackage.Literals.ROLEMODEL__PLAYERS, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Compartment getCompartment() {
    return (Compartment) eGet(OrmPackage.Literals.ROLEMODEL__COMPARTMENT, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCompartment(Compartment newCompartment) {
    eSet(OrmPackage.Literals.ROLEMODEL__COMPARTMENT, newCompartment);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Grouping getParentGroup() {
    return (Grouping) eGet(OrmPackage.Literals.ROLEMODEL__PARENT_GROUP, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setParentGroup(Grouping newParentGroup) {
    eSet(OrmPackage.Literals.ROLEMODEL__PARENT_GROUP, newParentGroup);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  public EList<Grouping> getGroups() {
    return (EList<Grouping>) eGet(OrmPackage.Literals.ROLEMODEL__GROUPS, true);
  }

} //RolemodelImpl
