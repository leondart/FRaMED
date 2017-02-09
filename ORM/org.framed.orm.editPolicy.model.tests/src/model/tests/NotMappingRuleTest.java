/**
 */
package model.tests;

import junit.textui.TestRunner;

import model.ModelFactory;
import model.NotMappingRule;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Not Mapping Rule</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class NotMappingRuleTest extends AbstractMappingRuleTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(NotMappingRuleTest.class);
	}

	/**
	 * Constructs a new Not Mapping Rule test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotMappingRuleTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Not Mapping Rule test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected NotMappingRule getFixture() {
		return (NotMappingRule)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ModelFactory.eINSTANCE.createNotMappingRule());
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

} //NotMappingRuleTest
