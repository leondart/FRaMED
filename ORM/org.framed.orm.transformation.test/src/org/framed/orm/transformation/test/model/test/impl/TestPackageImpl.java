/**
 */
package org.framed.orm.transformation.test.model.test.impl;

import crom_l1_composed.Crom_l1_composedPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.framed.orm.model.OrmPackage;

import org.framed.orm.transformation.test.model.test.TestCase;
import org.framed.orm.transformation.test.model.test.TestFactory;
import org.framed.orm.transformation.test.model.test.TestPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Package</b>. <!-- end-user-doc -->
 * 
 * @generated
 */
public class TestPackageImpl extends EPackageImpl implements TestPackage {
  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private EClass testCaseEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package package URI
   * value.
   * <p>
   * Note: the correct way to create the package is via the static factory method {@link #init
   * init()}, which also performs initialization of the package, or returns the registered package,
   * if one already exists. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see org.framed.orm.transformation.test.model.test.TestPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private TestPackageImpl() {
    super(eNS_URI, TestFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon
   * which it depends.
   * 
   * <p>
   * This method is used to initialize {@link TestPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain
   * the package. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static TestPackage init() {
    if (isInited)
      return (TestPackage) EPackage.Registry.INSTANCE.getEPackage(TestPackage.eNS_URI);

    // Obtain or create and register package
    TestPackageImpl theTestPackage =
        (TestPackageImpl) (EPackage.Registry.INSTANCE.get(eNS_URI) instanceof TestPackageImpl ? EPackage.Registry.INSTANCE
            .get(eNS_URI) : new TestPackageImpl());

    isInited = true;

    // Initialize simple dependencies
    Crom_l1_composedPackage.eINSTANCE.eClass();
    OrmPackage.eINSTANCE.eClass();

    // Create package meta-data objects
    theTestPackage.createPackageContents();

    // Initialize created meta-data
    theTestPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theTestPackage.freeze();


    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(TestPackage.eNS_URI, theTestPackage);
    return theTestPackage;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EClass getTestCase() {
    return testCaseEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getTestCase_Title() {
    return (EAttribute) testCaseEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getTestCase_Description() {
    return (EAttribute) testCaseEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getTestCase_FramedModel() {
    return (EReference) testCaseEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getTestCase_CromModel() {
    return (EReference) testCaseEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public TestFactory getTestFactory() {
    return (TestFactory) getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package. This method is guarded to have no affect on any
   * invocation but its first. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public void createPackageContents() {
    if (isCreated)
      return;
    isCreated = true;

    // Create classes and their features
    testCaseEClass = createEClass(TEST_CASE);
    createEAttribute(testCaseEClass, TEST_CASE__TITLE);
    createEAttribute(testCaseEClass, TEST_CASE__DESCRIPTION);
    createEReference(testCaseEClass, TEST_CASE__FRAMED_MODEL);
    createEReference(testCaseEClass, TEST_CASE__CROM_MODEL);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model. This method is guarded to have
   * no affect on any invocation but its first. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public void initializePackageContents() {
    if (isInitialized)
      return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Obtain other dependent packages
    OrmPackage theOrmPackage =
        (OrmPackage) EPackage.Registry.INSTANCE.getEPackage(OrmPackage.eNS_URI);
    Crom_l1_composedPackage theCrom_l1_composedPackage =
        (Crom_l1_composedPackage) EPackage.Registry.INSTANCE
            .getEPackage(Crom_l1_composedPackage.eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes

    // Initialize classes, features, and operations; add parameters
    initEClass(testCaseEClass, TestCase.class, "TestCase", !IS_ABSTRACT, !IS_INTERFACE,
        IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTestCase_Title(), ecorePackage.getEString(), "title", null, 0, 1,
        TestCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
        IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTestCase_Description(), ecorePackage.getEString(), "description", null, 0, 1,
        TestCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
        IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTestCase_FramedModel(), theOrmPackage.getModel(), null, "framedModel", null,
        0, 1, TestCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
        !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTestCase_CromModel(), theCrom_l1_composedPackage.getModel(), null,
        "cromModel", null, 0, 1, TestCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
        IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} // TestPackageImpl
