/**
 */
package model.tests;

import junit.textui.TestRunner;

import model.ModelFactory;
import model.TrueRule;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>True Rule</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TrueRuleTest extends AbstractRuleTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TrueRuleTest.class);
	}

	/**
	 * Constructs a new True Rule test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrueRuleTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this True Rule test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected TrueRule getFixture() {
		return (TrueRule)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ModelFactory.eINSTANCE.createTrueRule());
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

} //TrueRuleTest
