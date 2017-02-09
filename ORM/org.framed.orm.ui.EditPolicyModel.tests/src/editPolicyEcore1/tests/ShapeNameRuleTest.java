/**
 */
package editPolicyEcore1.tests;

import editPolicyEcore1.EditPolicyEcore1Factory;
import editPolicyEcore1.ShapeNameRule;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Shape Name Rule</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ShapeNameRuleTest extends AbstractNameRuleTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ShapeNameRuleTest.class);
	}

	/**
	 * Constructs a new Shape Name Rule test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShapeNameRuleTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Shape Name Rule test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ShapeNameRule getFixture() {
		return (ShapeNameRule)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(EditPolicyEcore1Factory.eINSTANCE.createShapeNameRule());
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

} //ShapeNameRuleTest
