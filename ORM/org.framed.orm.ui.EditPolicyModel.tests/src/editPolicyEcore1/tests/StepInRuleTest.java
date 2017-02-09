/**
 */
package editPolicyEcore1.tests;

import editPolicyEcore1.EditPolicyEcore1Factory;
import editPolicyEcore1.StepInRule;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Step In Rule</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class StepInRuleTest extends AbstractRuleTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(StepInRuleTest.class);
	}

	/**
	 * Constructs a new Step In Rule test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StepInRuleTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Step In Rule test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected StepInRule getFixture() {
		return (StepInRule)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(EditPolicyEcore1Factory.eINSTANCE.createStepInRule());
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

} //StepInRuleTest
