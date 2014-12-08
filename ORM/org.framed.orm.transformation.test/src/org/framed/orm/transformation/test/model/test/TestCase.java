/**
 */
package org.framed.orm.transformation.test.model.test;

import org.eclipse.emf.ecore.EObject;

import org.framed.orm.model.Model;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Case</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.framed.orm.transformation.test.model.test.TestCase#getTitle <em>Title</em>}</li>
 *   <li>{@link org.framed.orm.transformation.test.model.test.TestCase#getDescription <em>Description</em>}</li>
 *   <li>{@link org.framed.orm.transformation.test.model.test.TestCase#getFramedModel <em>Framed Model</em>}</li>
 *   <li>{@link org.framed.orm.transformation.test.model.test.TestCase#getCromModel <em>Crom Model</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.framed.orm.transformation.test.model.test.TestPackage#getTestCase()
 * @model
 * @generated
 */
public interface TestCase extends EObject {
	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Title</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see org.framed.orm.transformation.test.model.test.TestPackage#getTestCase_Title()
	 * @model
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link org.framed.orm.transformation.test.model.test.TestCase#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.framed.orm.transformation.test.model.test.TestPackage#getTestCase_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.framed.orm.transformation.test.model.test.TestCase#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Framed Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Framed Model</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Framed Model</em>' containment reference.
	 * @see #setFramedModel(Model)
	 * @see org.framed.orm.transformation.test.model.test.TestPackage#getTestCase_FramedModel()
	 * @model containment="true"
	 * @generated
	 */
	Model getFramedModel();

	/**
	 * Sets the value of the '{@link org.framed.orm.transformation.test.model.test.TestCase#getFramedModel <em>Framed Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Framed Model</em>' containment reference.
	 * @see #getFramedModel()
	 * @generated
	 */
	void setFramedModel(Model value);

	/**
	 * Returns the value of the '<em><b>Crom Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Crom Model</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Crom Model</em>' containment reference.
	 * @see #setCromModel(crom_l1_composed.Model)
	 * @see org.framed.orm.transformation.test.model.test.TestPackage#getTestCase_CromModel()
	 * @model containment="true"
	 * @generated
	 */
	crom_l1_composed.Model getCromModel();

	/**
	 * Sets the value of the '{@link org.framed.orm.transformation.test.model.test.TestCase#getCromModel <em>Crom Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Crom Model</em>' containment reference.
	 * @see #getCromModel()
	 * @generated
	 */
	void setCromModel(crom_l1_composed.Model value);

} // TestCase
