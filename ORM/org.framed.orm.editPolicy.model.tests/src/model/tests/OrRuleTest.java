/**
 */
package model.tests;

import junit.textui.TestRunner;

import model.ModelFactory;
import model.OrRule;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Or Rule</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class OrRuleTest extends AbstractRuleTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(OrRuleTest.class);
	}

	/**
	 * Constructs a new Or Rule test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrRuleTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Or Rule test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected OrRule getFixture() {
		return (OrRule)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ModelFactory.eINSTANCE.createOrRule());
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

} //OrRuleTest
