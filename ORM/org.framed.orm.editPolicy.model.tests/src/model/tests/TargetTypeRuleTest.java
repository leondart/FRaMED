/**
 */
package model.tests;

import junit.textui.TestRunner;

import model.ModelFactory;
import model.TargetTypeRule;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Target Type Rule</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TargetTypeRuleTest extends AbstractNameRuleTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TargetTypeRuleTest.class);
	}

	/**
	 * Constructs a new Target Type Rule test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TargetTypeRuleTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Target Type Rule test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected TargetTypeRule getFixture() {
		return (TargetTypeRule)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ModelFactory.eINSTANCE.createTargetTypeRule());
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

} //TargetTypeRuleTest
