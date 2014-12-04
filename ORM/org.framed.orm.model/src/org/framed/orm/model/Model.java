/**
 */
package org.framed.orm.model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.framed.orm.model.Model#getElements <em>Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.framed.orm.model.OrmPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject {
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
   * @see org.framed.orm.model.OrmPackage#getModel_Elements()
   * @see org.framed.orm.model.ModelElement#getContainer
   * @model opposite="container" containment="true"
   * @generated
   */
  EList<ModelElement> getElements();

} // Model
