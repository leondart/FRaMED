/**
 */
package orm.model.tests;

import junit.textui.TestRunner;

import orm.model.OrmFactory;
import orm.model.Rolemodel;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Rolemodel</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RolemodelTest extends RelationContainerTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RolemodelTest.class);
	}

	/**
	 * Constructs a new Rolemodel test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RolemodelTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Rolemodel test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Rolemodel getFixture() {
		return (Rolemodel)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(OrmFactory.eINSTANCE.createRolemodel());
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

} //RolemodelTest
