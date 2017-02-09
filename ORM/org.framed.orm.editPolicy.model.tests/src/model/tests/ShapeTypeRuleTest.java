/**
 */
package model.tests;

import junit.textui.TestRunner;

import model.ModelFactory;
import model.ShapeTypeRule;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Shape Type Rule</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ShapeTypeRuleTest extends AbstractNameRuleTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ShapeTypeRuleTest.class);
	}

	/**
	 * Constructs a new Shape Type Rule test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShapeTypeRuleTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Shape Type Rule test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ShapeTypeRule getFixture() {
		return (ShapeTypeRule)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ModelFactory.eINSTANCE.createShapeTypeRule());
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

} //ShapeTypeRuleTest
