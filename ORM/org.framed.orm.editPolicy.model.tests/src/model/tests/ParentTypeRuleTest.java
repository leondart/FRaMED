/**
 */
package model.tests;

import junit.textui.TestRunner;

import model.ModelFactory;
import model.ParentTypeRule;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Parent Type Rule</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ParentTypeRuleTest extends AbstractNameRuleTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ParentTypeRuleTest.class);
	}

	/**
	 * Constructs a new Parent Type Rule test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParentTypeRuleTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Parent Type Rule test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ParentTypeRule getFixture() {
		return (ParentTypeRule)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ModelFactory.eINSTANCE.createParentTypeRule());
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

} //ParentTypeRuleTest
