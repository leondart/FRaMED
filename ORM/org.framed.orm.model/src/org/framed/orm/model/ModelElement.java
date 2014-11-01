/**
 */
package org.framed.orm.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.framed.orm.model.ModelElement#getContainer <em>Container</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.framed.orm.model.OrmPackage#getModelElement()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface ModelElement extends NamedElement {
  /**
   * Returns the value of the '<em><b>Container</b></em>' container reference.
   * It is bidirectional and its opposite is '{@link org.framed.orm.model.ElementModel#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Container</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Container</em>' container reference.
   * @see #setContainer(ElementModel)
   * @see org.framed.orm.model.OrmPackage#getModelElement_Container()
   * @see org.framed.orm.model.ElementModel#getElements
   * @model opposite="elements" required="true" transient="false"
   * @generated
   */
  ElementModel getContainer();

  /**
   * Sets the value of the '{@link org.framed.orm.model.ModelElement#getContainer <em>Container</em>}' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Container</em>' container reference.
   * @see #getContainer()
   * @generated
   */
  void setContainer(ElementModel value);

} // ModelElement
