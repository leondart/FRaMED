/**
 */
package org.framed.orm.featuremodel.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.framed.orm.featuremodel.Configuration;
import org.framed.orm.featuremodel.Feature;
import org.framed.orm.featuremodel.FeaturemodelFactory;
import org.framed.orm.featuremodel.FeaturemodelPackage;

import org.framed.orm.geometry.GeometryPackage;

import org.framed.orm.geometry.impl.GeometryPackageImpl;

import org.framed.orm.model.OrmPackage;

import org.framed.orm.model.impl.OrmPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FeaturemodelPackageImpl extends EPackageImpl implements
		FeaturemodelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass configurationEClass = null;

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
	 * @see org.framed.orm.featuremodel.FeaturemodelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private FeaturemodelPackageImpl() {
		super(eNS_URI, FeaturemodelFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link FeaturemodelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static FeaturemodelPackage init() {
		if (isInited)
			return (FeaturemodelPackage) EPackage.Registry.INSTANCE
					.getEPackage(FeaturemodelPackage.eNS_URI);

		// Obtain or create and register package
		FeaturemodelPackageImpl theFeaturemodelPackage = (FeaturemodelPackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof FeaturemodelPackageImpl ? EPackage.Registry.INSTANCE
				.get(eNS_URI) : new FeaturemodelPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		OrmPackageImpl theOrmPackage = (OrmPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(OrmPackage.eNS_URI) instanceof OrmPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(OrmPackage.eNS_URI) : OrmPackage.eINSTANCE);
		GeometryPackageImpl theGeometryPackage = (GeometryPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(GeometryPackage.eNS_URI) instanceof GeometryPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(GeometryPackage.eNS_URI)
				: GeometryPackage.eINSTANCE);

		// Create package meta-data objects
		theFeaturemodelPackage.createPackageContents();
		theOrmPackage.createPackageContents();
		theGeometryPackage.createPackageContents();

		// Initialize created meta-data
		theFeaturemodelPackage.initializePackageContents();
		theOrmPackage.initializePackageContents();
		theGeometryPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theFeaturemodelPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(FeaturemodelPackage.eNS_URI,
				theFeaturemodelPackage);
		return theFeaturemodelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFeature() {
		return featureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFeature_Name() {
		return (EAttribute) featureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConfiguration() {
		return configurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfiguration_Features() {
		return (EReference) configurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeaturemodelFactory getFeaturemodelFactory() {
		return (FeaturemodelFactory) getEFactoryInstance();
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
		featureEClass = createEClass(FEATURE);
		createEAttribute(featureEClass, FEATURE__NAME);

		configurationEClass = createEClass(CONFIGURATION);
		createEReference(configurationEClass, CONFIGURATION__FEATURES);
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
		initEClass(featureEClass, Feature.class, "Feature", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFeature_Name(), ecorePackage.getEString(), "name",
				"", 0, 1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(configurationEClass, Configuration.class, "Configuration",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConfiguration_Features(), this.getFeature(), null,
				"features", null, 0, -1, Configuration.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //FeaturemodelPackageImpl
