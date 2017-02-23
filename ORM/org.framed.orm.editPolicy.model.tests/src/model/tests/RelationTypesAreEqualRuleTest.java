/**
 */
package model.tests;

import junit.textui.TestRunner;

import model.ModelFactory;
import model.RelationTypesAreEqualRule;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Relation Types Are Equal Rule</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RelationTypesAreEqualRuleTest extends AbstractRuleTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RelationTypesAreEqualRuleTest.class);
	}

	/**
	 * Constructs a new Relation Types Are Equal Rule test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationTypesAreEqualRuleTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Relation Types Are Equal Rule test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected RelationTypesAreEqualRule getFixture() {
		return (RelationTypesAreEqualRule)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ModelFactory.eINSTANCE.createRelationTypesAreEqualRule());
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

} //RelationTypesAreEqualRuleTest
