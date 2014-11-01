/**
 */
package org.framed.orm.model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Role Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.framed.orm.model.AbstractRoleModel#getAbstractroles <em>Abstractroles</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.framed.orm.model.OrmPackage#getAbstractRoleModel()
 * @model
 * @generated
 */
public interface AbstractRoleModel extends Model {
  /**
   * Returns the value of the '<em><b>Abstractroles</b></em>' containment reference list.
   * The list contents are of type {@link org.framed.orm.model.AbstractRole}.
   * It is bidirectional and its opposite is '{@link org.framed.orm.model.AbstractRole#getParent <em>Parent</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Abstractroles</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Abstractroles</em>' containment reference list.
   * @see org.framed.orm.model.OrmPackage#getAbstractRoleModel_Abstractroles()
   * @see org.framed.orm.model.AbstractRole#getParent
   * @model opposite="parent" containment="true"
   * @generated
   */
  EList<AbstractRole> getAbstractroles();

} // AbstractRoleModel
