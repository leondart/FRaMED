/**
 */
package model.tests;

import junit.textui.TestRunner;

import model.ModelFactory;
import model.OrMappingRule;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Or Mapping Rule</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class OrMappingRuleTest extends AbstractMappingRuleTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(OrMappingRuleTest.class);
	}

	/**
	 * Constructs a new Or Mapping Rule test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrMappingRuleTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Or Mapping Rule test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected OrMappingRule getFixture() {
		return (OrMappingRule)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ModelFactory.eINSTANCE.createOrMappingRule());
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

} //OrMappingRuleTest
