/**
 */
package org.framed.orm.model.impl;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.framed.orm.model.AbstractRole;
import org.framed.orm.model.Compartment;
import org.framed.orm.model.Grouping;
import org.framed.orm.model.NaturalType;
import org.framed.orm.model.Node;
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
public class RolemodelImpl extends ContainerImpl implements Rolemodel {
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
   * @generated NOT
   */
  public EList<Compartment> getSubcontexts() {
    EList<Compartment> subcontexts = new BasicEList<Compartment>();
    for (Node node : getNodes()) {
      if (node instanceof Compartment) {
        subcontexts.add((Compartment) node);
      }
    }
    return subcontexts;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated NOT
   */
  public EList<AbstractRole> getParticipants() {
    EList<AbstractRole> participants = new BasicEList<AbstractRole>();
    for (Node node : getNodes()) {
      if (node instanceof AbstractRole) {
        participants.add((AbstractRole) node);
      }
    }
    return participants;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated NOT
   */
  public EList<NaturalType> getPlayers() {
    EList<NaturalType> players = new BasicEList<NaturalType>();
    for (Node node : getNodes()) {
      if (node instanceof NaturalType) {
        players.add((NaturalType) node);
      }
    }
    return players;
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
   * @generated NOT
   */
  public EList<Grouping> getGroups() {
    EList<Grouping> groups = new BasicEList<Grouping>();
    for (Node node : getNodes()) {
      if (node instanceof Grouping) {
        groups.add((Grouping) node);
      }
    }
    return groups;
  }

} //RolemodelImpl
