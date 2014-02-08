/**
 */
package orm.model.tests;

import junit.textui.TestRunner;

import orm.model.OrmFactory;
import orm.model.RoleEquivalence;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Role Equivalence</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RoleEquivalenceTest extends RoleConstraintTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RoleEquivalenceTest.class);
	}

	/**
	 * Constructs a new Role Equivalence test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleEquivalenceTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Role Equivalence test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected RoleEquivalence getFixture() {
		return (RoleEquivalence)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(OrmFactory.eINSTANCE.createRoleEquivalence());
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

} //RoleEquivalenceTest
