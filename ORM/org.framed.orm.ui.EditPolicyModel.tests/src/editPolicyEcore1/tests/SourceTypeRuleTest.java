/**
 */
package editPolicyEcore1.tests;

import editPolicyEcore1.EditPolicyEcore1Factory;
import editPolicyEcore1.SourceTypeRule;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Source Type Rule</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SourceTypeRuleTest extends AbstractNameRuleTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SourceTypeRuleTest.class);
	}

	/**
	 * Constructs a new Source Type Rule test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SourceTypeRuleTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Source Type Rule test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected SourceTypeRule getFixture() {
		return (SourceTypeRule)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(EditPolicyEcore1Factory.eINSTANCE.createSourceTypeRule());
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

} //SourceTypeRuleTest
