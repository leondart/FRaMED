/**
 */
package orm.model.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import orm.model.Methode;
import orm.model.OrmFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Methode</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MethodeTest extends TestCase {

	/**
	 * The fixture for this Methode test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Methode fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(MethodeTest.class);
	}

	/**
	 * Constructs a new Methode test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MethodeTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Methode test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Methode fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Methode test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Methode getFixture() {
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
		setFixture(OrmFactory.eINSTANCE.createMethode());
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

} //MethodeTest
