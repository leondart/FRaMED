/**
 */
package org.framed.orm.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.framed.orm.model.Constraint#getOwnerCompartment <em>Owner Compartment</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.framed.orm.model.OrmPackage#getConstraint()
 * @model
 * @generated
 */
public interface Constraint extends Relation {
  /**
   * Returns the value of the '<em><b>Owner Compartment</b></em>' reference.
   * It is bidirectional and its opposite is '{@link org.framed.orm.model.CompartmentType#getConstraints <em>Constraints</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Owner Compartment</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Owner Compartment</em>' reference.
   * @see #setOwnerCompartment(CompartmentType)
   * @see org.framed.orm.model.OrmPackage#getConstraint_OwnerCompartment()
   * @see org.framed.orm.model.CompartmentType#getConstraints
   * @model opposite="constraints" required="true"
   * @generated
   */
  CompartmentType getOwnerCompartment();

  /**
   * Sets the value of the '{@link org.framed.orm.model.Constraint#getOwnerCompartment <em>Owner Compartment</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Owner Compartment</em>' reference.
   * @see #getOwnerCompartment()
   * @generated
   */
  void setOwnerCompartment(CompartmentType value);

} // Constraint
