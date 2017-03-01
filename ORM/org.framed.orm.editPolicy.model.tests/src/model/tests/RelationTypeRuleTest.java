/**
 */
package model.tests;

import junit.textui.TestRunner;

import model.ModelFactory;
import model.RelationTypeRule;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Relation Type Rule</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RelationTypeRuleTest extends AbstractNameRuleTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RelationTypeRuleTest.class);
	}

	/**
	 * Constructs a new Relation Type Rule test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationTypeRuleTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Relation Type Rule test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected RelationTypeRule getFixture() {
		return (RelationTypeRule)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ModelFactory.eINSTANCE.createRelationTypeRule());
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

} //RelationTypeRuleTest
