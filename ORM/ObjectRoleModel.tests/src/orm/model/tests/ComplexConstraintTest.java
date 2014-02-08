/**
 */
package orm.model.tests;

import junit.textui.TestRunner;

import orm.model.ComplexConstraint;
import orm.model.OrmFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Complex Constraint</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ComplexConstraintTest extends ConstraintTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ComplexConstraintTest.class);
	}

	/**
	 * Constructs a new Complex Constraint test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComplexConstraintTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Complex Constraint test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ComplexConstraint getFixture() {
		return (ComplexConstraint)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(OrmFactory.eINSTANCE.createComplexConstraint());
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

} //ComplexConstraintTest
