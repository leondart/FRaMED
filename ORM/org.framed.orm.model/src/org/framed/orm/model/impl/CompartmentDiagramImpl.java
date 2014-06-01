/**
 */
package org.framed.orm.model.impl;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.framed.orm.model.Compartment;
import org.framed.orm.model.CompartmentDiagram;
import org.framed.orm.model.Grouping;
import org.framed.orm.model.NaturalType;
import org.framed.orm.model.OrmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Compartment Diagram</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.framed.orm.model.impl.CompartmentDiagramImpl#getCompartments <em>Compartments</em>}</li>
 *   <li>{@link org.framed.orm.model.impl.CompartmentDiagramImpl#getGroups <em>Groups</em>}</li>
 *   <li>{@link org.framed.orm.model.impl.CompartmentDiagramImpl#getPlayers <em>Players</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CompartmentDiagramImpl extends RelationContainerImpl implements CompartmentDiagram {
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CompartmentDiagramImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return OrmPackage.Literals.COMPARTMENT_DIAGRAM;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  public EList<Compartment> getCompartments() {
    return (EList<Compartment>) eGet(OrmPackage.Literals.COMPARTMENT_DIAGRAM__COMPARTMENTS, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  public EList<Grouping> getGroups() {
    return (EList<Grouping>) eGet(OrmPackage.Literals.COMPARTMENT_DIAGRAM__GROUPS, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  public EList<NaturalType> getPlayers() {
    return (EList<NaturalType>) eGet(OrmPackage.Literals.COMPARTMENT_DIAGRAM__PLAYERS, true);
  }

} //CompartmentDiagramImpl
