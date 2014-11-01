/**
 */
package org.framed.orm.model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.framed.orm.model.Operation#getOwner <em>Owner</em>}</li>
 *   <li>{@link org.framed.orm.model.Operation#getOperation <em>Operation</em>}</li>
 *   <li>{@link org.framed.orm.model.Operation#getParams <em>Params</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.framed.orm.model.OrmPackage#getOperation()
 * @model
 * @generated
 */
public interface Operation extends TypedElement {
  /**
   * Returns the value of the '<em><b>Owner</b></em>' container reference.
   * It is bidirectional and its opposite is '{@link org.framed.orm.model.Type#getOperations <em>Operations</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Owner</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Owner</em>' container reference.
   * @see #setOwner(Type)
   * @see org.framed.orm.model.OrmPackage#getOperation_Owner()
   * @see org.framed.orm.model.Type#getOperations
   * @model opposite="operations" required="true" transient="false"
   * @generated
   */
  Type getOwner();

  /**
   * Sets the value of the '{@link org.framed.orm.model.Operation#getOwner <em>Owner</em>}' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Owner</em>' container reference.
   * @see #getOwner()
   * @generated
   */
  void setOwner(Type value);

  /**
   * Returns the value of the '<em><b>Operation</b></em>' attribute.
   * The default value is <code>"<...>"</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Operation</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operation</em>' attribute.
   * @see #setOperation(String)
   * @see org.framed.orm.model.OrmPackage#getOperation_Operation()
   * @model default="<...>"
   * @generated
   */
  String getOperation();

  /**
   * Sets the value of the '{@link org.framed.orm.model.Operation#getOperation <em>Operation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Operation</em>' attribute.
   * @see #getOperation()
   * @generated
   */
  void setOperation(String value);

  /**
   * Returns the value of the '<em><b>Params</b></em>' containment reference list.
   * The list contents are of type {@link org.framed.orm.model.Parameter}.
   * It is bidirectional and its opposite is '{@link org.framed.orm.model.Parameter#getOwneroperation <em>Owneroperation</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Params</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Params</em>' containment reference list.
   * @see org.framed.orm.model.OrmPackage#getOperation_Params()
   * @see org.framed.orm.model.Parameter#getOwneroperation
   * @model opposite="owneroperation" containment="true"
   * @generated
   */
  EList<Parameter> getParams();

} // Operation
