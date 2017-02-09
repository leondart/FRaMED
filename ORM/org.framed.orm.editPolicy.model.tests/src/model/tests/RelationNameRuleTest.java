/**
 */
package model.tests;

import junit.textui.TestRunner;

import model.ModelFactory;
import model.RelationNameRule;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Relation Name Rule</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RelationNameRuleTest extends AbstractNameRuleTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RelationNameRuleTest.class);
	}

	/**
	 * Constructs a new Relation Name Rule test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationNameRuleTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Relation Name Rule test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected RelationNameRule getFixture() {
		return (RelationNameRule)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ModelFactory.eINSTANCE.createRelationNameRule());
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

} //RelationNameRuleTest
