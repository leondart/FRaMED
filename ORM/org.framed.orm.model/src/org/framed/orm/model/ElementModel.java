/**
 */
package org.framed.orm.model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.framed.orm.model.ElementModel#getElements <em>Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.framed.orm.model.OrmPackage#getElementModel()
 * @model
 * @generated
 */
public interface ElementModel extends Model {
  /**
   * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
   * The list contents are of type {@link org.framed.orm.model.ModelElement}.
   * It is bidirectional and its opposite is '{@link org.framed.orm.model.ModelElement#getContainer <em>Container</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elements</em>' containment reference list.
   * @see org.framed.orm.model.OrmPackage#getElementModel_Elements()
   * @see org.framed.orm.model.ModelElement#getContainer
   * @model opposite="container" containment="true"
   * @generated
   */
  EList<ModelElement> getElements();

} // ElementModel
