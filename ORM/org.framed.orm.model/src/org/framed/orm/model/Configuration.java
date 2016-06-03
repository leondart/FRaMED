/**
 */
package org.framed.orm.model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object ' <em><b>Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.framed.orm.model.Configuration#getFeatures <em>Features</em>}</li>
 * </ul>
 *
 * @see org.framed.orm.model.OrmPackage#getConfiguration()
 * @model
 * @generated
 */
public interface Configuration extends EObject {
  /**
   * Returns the value of the '<em><b>Features</b></em>' reference list.
   * The list contents are of type {@link org.framed.orm.model.Feature}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Features</em>' reference list isn't clear, there really should be
   * more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Features</em>' reference list.
   * @see org.framed.orm.model.OrmPackage#getConfiguration_Features()
   * @model
   * @generated
   */
  EList<Feature> getFeatures();

} // Configuration
