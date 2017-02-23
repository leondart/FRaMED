/**
 */
package model.tests;

import junit.textui.TestRunner;

import model.ModelFactory;
import model.TypeExistsRule;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Type Exists Rule</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TypeExistsRuleTest extends AbstractNameRuleTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TypeExistsRuleTest.class);
	}

	/**
	 * Constructs a new Type Exists Rule test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeExistsRuleTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Type Exists Rule test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected TypeExistsRule getFixture() {
		return (TypeExistsRule)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ModelFactory.eINSTANCE.createTypeExistsRule());
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

} //TypeExistsRuleTest
