/**
 */
package model.tests;

import junit.textui.TestRunner;

import model.ModelFactory;
import model.TrueMappingRule;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>True Mapping Rule</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TrueMappingRuleTest extends AbstractMappingRuleTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TrueMappingRuleTest.class);
	}

	/**
	 * Constructs a new True Mapping Rule test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrueMappingRuleTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this True Mapping Rule test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected TrueMappingRule getFixture() {
		return (TrueMappingRule)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ModelFactory.eINSTANCE.createTrueMappingRule());
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

} //TrueMappingRuleTest
