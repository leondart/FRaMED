/**
 */
package org.framed.orm.transformation.test.model.test;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc --> The <b>Package</b> for the model. It contains accessors for the meta
 * objects to represent
 * <ul>
 * <li>each class,</li>
 * <li>each feature of each class,</li>
 * <li>each operation of each class,</li>
 * <li>each enum,</li>
 * <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * 
 * @see org.framed.orm.transformation.test.model.test.TestFactory
 * @model kind="package"
 * @generated
 */
public interface TestPackage extends EPackage {
  /**
   * The package name. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  String eNAME = "test";

  /**
   * The package namespace URI. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  String eNS_URI = "http://org.framed/testmodel";

  /**
   * The package namespace name. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  String eNS_PREFIX = "ts";

  /**
   * The singleton instance of the package. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  TestPackage eINSTANCE = org.framed.orm.transformation.test.model.test.impl.TestPackageImpl.init();

  /**
   * The meta object id for the '
   * {@link org.framed.orm.transformation.test.model.test.impl.TestCaseImpl <em>Case</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see org.framed.orm.transformation.test.model.test.impl.TestCaseImpl
   * @see org.framed.orm.transformation.test.model.test.impl.TestPackageImpl#getTestCase()
   * @generated
   */
  int TEST_CASE = 0;

  /**
   * The feature id for the '<em><b>Title</b></em>' attribute. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   * @ordered
   */
  int TEST_CASE__TITLE = 0;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   * @ordered
   */
  int TEST_CASE__DESCRIPTION = 1;

  /**
   * The feature id for the '<em><b>Framed Model</b></em>' containment reference. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   * @ordered
   */
  int TEST_CASE__FRAMED_MODEL = 2;

  /**
   * The feature id for the '<em><b>Crom Model</b></em>' containment reference. <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * 
   * @generated
   * @ordered
   */
  int TEST_CASE__CROM_MODEL = 3;

  /**
   * The number of structural features of the '<em>Case</em>' class. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   * @ordered
   */
  int TEST_CASE_FEATURE_COUNT = 4;

  /**
   * The number of operations of the '<em>Case</em>' class. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   * @ordered
   */
  int TEST_CASE_OPERATION_COUNT = 0;


  /**
   * Returns the meta object for class '
   * {@link org.framed.orm.transformation.test.model.test.TestCase <em>Case</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for class '<em>Case</em>'.
   * @see org.framed.orm.transformation.test.model.test.TestCase
   * @generated
   */
  EClass getTestCase();

  /**
   * Returns the meta object for the attribute '
   * {@link org.framed.orm.transformation.test.model.test.TestCase#getTitle <em>Title</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Title</em>'.
   * @see org.framed.orm.transformation.test.model.test.TestCase#getTitle()
   * @see #getTestCase()
   * @generated
   */
  EAttribute getTestCase_Title();

  /**
   * Returns the meta object for the attribute '
   * {@link org.framed.orm.transformation.test.model.test.TestCase#getDescription
   * <em>Description</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see org.framed.orm.transformation.test.model.test.TestCase#getDescription()
   * @see #getTestCase()
   * @generated
   */
  EAttribute getTestCase_Description();

  /**
   * Returns the meta object for the containment reference '
   * {@link org.framed.orm.transformation.test.model.test.TestCase#getFramedModel
   * <em>Framed Model</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Framed Model</em>'.
   * @see org.framed.orm.transformation.test.model.test.TestCase#getFramedModel()
   * @see #getTestCase()
   * @generated
   */
  EReference getTestCase_FramedModel();

  /**
   * Returns the meta object for the containment reference '
   * {@link org.framed.orm.transformation.test.model.test.TestCase#getCromModel <em>Crom Model</em>}
   * '. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Crom Model</em>'.
   * @see org.framed.orm.transformation.test.model.test.TestCase#getCromModel()
   * @see #getTestCase()
   * @generated
   */
  EReference getTestCase_CromModel();

  /**
   * Returns the factory that creates the instances of the model. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @return the factory that creates the instances of the model.
   * @generated
   */
  TestFactory getTestFactory();

  /**
   * <!-- begin-user-doc --> Defines literals for the meta objects that represent
   * <ul>
   * <li>each class,</li>
   * <li>each feature of each class,</li>
   * <li>each operation of each class,</li>
   * <li>each enum,</li>
   * <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * 
   * @generated
   */
  interface Literals {
    /**
     * The meta object literal for the '
     * {@link org.framed.orm.transformation.test.model.test.impl.TestCaseImpl <em>Case</em>}' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see org.framed.orm.transformation.test.model.test.impl.TestCaseImpl
     * @see org.framed.orm.transformation.test.model.test.impl.TestPackageImpl#getTestCase()
     * @generated
     */
    EClass TEST_CASE = eINSTANCE.getTestCase();

    /**
     * The meta object literal for the '<em><b>Title</b></em>' attribute feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    EAttribute TEST_CASE__TITLE = eINSTANCE.getTestCase_Title();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    EAttribute TEST_CASE__DESCRIPTION = eINSTANCE.getTestCase_Description();

    /**
     * The meta object literal for the '<em><b>Framed Model</b></em>' containment reference feature.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    EReference TEST_CASE__FRAMED_MODEL = eINSTANCE.getTestCase_FramedModel();

    /**
     * The meta object literal for the '<em><b>Crom Model</b></em>' containment reference feature.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    EReference TEST_CASE__CROM_MODEL = eINSTANCE.getTestCase_CromModel();

  }

} // TestPackage
