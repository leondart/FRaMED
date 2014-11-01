/**
 */
package org.framed.orm.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.framed.orm.model.Parameter#getOwneroperation <em>Owneroperation</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.framed.orm.model.OrmPackage#getParameter()
 * @model
 * @generated
 */
public interface Parameter extends TypedElement {
  /**
   * Returns the value of the '<em><b>Owneroperation</b></em>' container reference.
   * It is bidirectional and its opposite is '{@link org.framed.orm.model.Operation#getParams <em>Params</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Owneroperation</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Owneroperation</em>' container reference.
   * @see #setOwneroperation(Operation)
   * @see org.framed.orm.model.OrmPackage#getParameter_Owneroperation()
   * @see org.framed.orm.model.Operation#getParams
   * @model opposite="params" required="true" transient="false"
   * @generated
   */
  Operation getOwneroperation();

  /**
   * Sets the value of the '{@link org.framed.orm.model.Parameter#getOwneroperation <em>Owneroperation</em>}' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Owneroperation</em>' container reference.
   * @see #getOwneroperation()
   * @generated
   */
  void setOwneroperation(Operation value);

} // Parameter
