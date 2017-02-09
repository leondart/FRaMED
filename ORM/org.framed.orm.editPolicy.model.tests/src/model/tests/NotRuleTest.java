/**
 */
package model.tests;

import junit.textui.TestRunner;

import model.ModelFactory;
import model.NotRule;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Not Rule</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class NotRuleTest extends AbstractRuleTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(NotRuleTest.class);
	}

	/**
	 * Constructs a new Not Rule test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotRuleTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Not Rule test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected NotRule getFixture() {
		return (NotRule)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ModelFactory.eINSTANCE.createNotRule());
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

} //NotRuleTest
