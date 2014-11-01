/**
 */
package org.framed.orm.model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.framed.orm.model.Type#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link org.framed.orm.model.Type#getOperations <em>Operations</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.framed.orm.model.OrmPackage#getType()
 * @model abstract="true"
 * @generated
 */
public interface Type extends RelationTarget {
  /**
   * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
   * The list contents are of type {@link org.framed.orm.model.Attribute}.
   * It is bidirectional and its opposite is '{@link org.framed.orm.model.Attribute#getOwner <em>Owner</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Attributes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attributes</em>' containment reference list.
   * @see org.framed.orm.model.OrmPackage#getType_Attributes()
   * @see org.framed.orm.model.Attribute#getOwner
   * @model opposite="owner" containment="true"
   * @generated
   */
  EList<Attribute> getAttributes();

  /**
   * Returns the value of the '<em><b>Operations</b></em>' containment reference list.
   * The list contents are of type {@link org.framed.orm.model.Operation}.
   * It is bidirectional and its opposite is '{@link org.framed.orm.model.Operation#getOwner <em>Owner</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Operations</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operations</em>' containment reference list.
   * @see org.framed.orm.model.OrmPackage#getType_Operations()
   * @see org.framed.orm.model.Operation#getOwner
   * @model opposite="owner" containment="true"
   * @generated
   */
  EList<Operation> getOperations();

} // Type
