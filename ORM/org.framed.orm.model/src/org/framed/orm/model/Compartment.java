/**
 */
package org.framed.orm.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Compartment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.framed.orm.model.Compartment#getRolemodel <em>Rolemodel</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.framed.orm.model.OrmPackage#getCompartment()
 * @model
 * @generated
 */
public interface Compartment extends Type {
  /**
   * Returns the value of the '<em><b>Rolemodel</b></em>' containment reference.
   * It is bidirectional and its opposite is '{@link org.framed.orm.model.Rolemodel#getCompartment <em>Compartment</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rolemodel</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rolemodel</em>' containment reference.
   * @see #setRolemodel(Rolemodel)
   * @see org.framed.orm.model.OrmPackage#getCompartment_Rolemodel()
   * @see org.framed.orm.model.Rolemodel#getCompartment
   * @model opposite="compartment" containment="true" required="true"
   * @generated
   */
  Rolemodel getRolemodel();

  /**
   * Sets the value of the '{@link org.framed.orm.model.Compartment#getRolemodel <em>Rolemodel</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Rolemodel</em>' containment reference.
   * @see #getRolemodel()
   * @generated
   */
  void setRolemodel(Rolemodel value);

} // Compartment
