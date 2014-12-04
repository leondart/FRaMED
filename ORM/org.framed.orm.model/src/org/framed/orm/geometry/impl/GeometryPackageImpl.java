/**
 */
package org.framed.orm.geometry.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.framed.orm.geometry.GeometryFactory;
import org.framed.orm.geometry.GeometryPackage;
import org.framed.orm.geometry.Point;
import org.framed.orm.geometry.Rectangle;
import org.framed.orm.geometry.RelativePoint;

import org.framed.orm.model.OrmPackage;

import org.framed.orm.model.impl.OrmPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GeometryPackageImpl extends EPackageImpl implements GeometryPackage {
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass pointEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass rectangleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass relativePointEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see org.framed.orm.geometry.GeometryPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private GeometryPackageImpl() {
    super(eNS_URI, GeometryFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link GeometryPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static GeometryPackage init() {
    if (isInited)
      return (GeometryPackage) EPackage.Registry.INSTANCE.getEPackage(GeometryPackage.eNS_URI);

    // Obtain or create and register package
    GeometryPackageImpl theGeometryPackage =
        (GeometryPackageImpl) (EPackage.Registry.INSTANCE.get(eNS_URI) instanceof GeometryPackageImpl ? EPackage.Registry.INSTANCE
            .get(eNS_URI) : new GeometryPackageImpl());

    isInited = true;

    // Obtain or create and register interdependencies
    OrmPackageImpl theOrmPackage =
        (OrmPackageImpl) (EPackage.Registry.INSTANCE.getEPackage(OrmPackage.eNS_URI) instanceof OrmPackageImpl ? EPackage.Registry.INSTANCE
            .getEPackage(OrmPackage.eNS_URI) : OrmPackage.eINSTANCE);

    // Create package meta-data objects
    theGeometryPackage.createPackageContents();
    theOrmPackage.createPackageContents();

    // Initialize created meta-data
    theGeometryPackage.initializePackageContents();
    theOrmPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theGeometryPackage.freeze();


    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(GeometryPackage.eNS_URI, theGeometryPackage);
    return theGeometryPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPoint() {
    return pointEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPoint_X() {
    return (EAttribute) pointEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPoint_Y() {
    return (EAttribute) pointEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRectangle() {
    return rectangleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRectangle_TopLeft() {
    return (EReference) rectangleEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRectangle_BottomRight() {
    return (EReference) rectangleEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRelativePoint() {
    return relativePointEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRelativePoint_ReferencePoints() {
    return (EReference) relativePointEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRelativePoint_Distances() {
    return (EReference) relativePointEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GeometryFactory getGeometryFactory() {
    return (GeometryFactory) getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents() {
    if (isCreated)
      return;
    isCreated = true;

    // Create classes and their features
    pointEClass = createEClass(POINT);
    createEAttribute(pointEClass, POINT__X);
    createEAttribute(pointEClass, POINT__Y);

    rectangleEClass = createEClass(RECTANGLE);
    createEReference(rectangleEClass, RECTANGLE__TOP_LEFT);
    createEReference(rectangleEClass, RECTANGLE__BOTTOM_RIGHT);

    relativePointEClass = createEClass(RELATIVE_POINT);
    createEReference(relativePointEClass, RELATIVE_POINT__REFERENCE_POINTS);
    createEReference(relativePointEClass, RELATIVE_POINT__DISTANCES);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
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

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes

    // Initialize classes, features, and operations; add parameters
    initEClass(pointEClass, Point.class, "Point", !IS_ABSTRACT, !IS_INTERFACE,
        IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPoint_X(), ecorePackage.getEInt(), "x", null, 0, 1, Point.class,
        !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
        IS_ORDERED);
    initEAttribute(getPoint_Y(), ecorePackage.getEInt(), "y", null, 0, 1, Point.class,
        !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
        IS_ORDERED);

    initEClass(rectangleEClass, Rectangle.class, "Rectangle", !IS_ABSTRACT, !IS_INTERFACE,
        IS_GENERATED_INSTANCE_CLASS);
    initEReference(getRectangle_TopLeft(), this.getPoint(), null, "topLeft", null, 0, 1,
        Rectangle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
        !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRectangle_BottomRight(), this.getPoint(), null, "bottomRight", null, 0, 1,
        Rectangle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
        !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(relativePointEClass, RelativePoint.class, "RelativePoint", !IS_ABSTRACT,
        !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getRelativePoint_ReferencePoints(), this.getPoint(), null, "referencePoints",
        null, 2, 2, RelativePoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
        IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRelativePoint_Distances(), this.getPoint(), null, "distances", null, 2, 2,
        RelativePoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
        !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
  }

} //GeometryPackageImpl
