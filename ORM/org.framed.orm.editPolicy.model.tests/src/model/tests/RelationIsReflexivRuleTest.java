/**
 */
package model.tests;

import junit.textui.TestRunner;

import model.ModelFactory;
import model.RelationIsReflexivRule;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Relation Is Reflexiv Rule</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RelationIsReflexivRuleTest extends AbstractRuleTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RelationIsReflexivRuleTest.class);
	}

	/**
	 * Constructs a new Relation Is Reflexiv Rule test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationIsReflexivRuleTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Relation Is Reflexiv Rule test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected RelationIsReflexivRule getFixture() {
		return (RelationIsReflexivRule)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ModelFactory.eINSTANCE.createRelationIsReflexivRule());
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

} //RelationIsReflexivRuleTest
