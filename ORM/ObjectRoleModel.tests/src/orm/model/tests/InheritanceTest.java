/**
 */
package orm.model.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import orm.model.Inheritance;
import orm.model.OrmFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Inheritance</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class InheritanceTest extends TestCase {

	/**
	 * The fixture for this Inheritance test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Inheritance fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(InheritanceTest.class);
	}

	/**
	 * Constructs a new Inheritance test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InheritanceTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Inheritance test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Inheritance fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Inheritance test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Inheritance getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(OrmFactory.eINSTANCE.createInheritance());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //InheritanceTest
