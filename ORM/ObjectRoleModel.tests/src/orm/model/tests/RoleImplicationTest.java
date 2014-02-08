/**
 */
package orm.model.tests;

import junit.textui.TestRunner;

import orm.model.OrmFactory;
import orm.model.RoleImplication;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Role Implication</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RoleImplicationTest extends RoleConstraintTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RoleImplicationTest.class);
	}

	/**
	 * Constructs a new Role Implication test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleImplicationTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Role Implication test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected RoleImplication getFixture() {
		return (RoleImplication)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(OrmFactory.eINSTANCE.createRoleImplication());
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

} //RoleImplicationTest
