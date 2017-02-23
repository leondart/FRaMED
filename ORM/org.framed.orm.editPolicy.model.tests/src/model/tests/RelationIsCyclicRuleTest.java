/**
 */
package model.tests;

import junit.textui.TestRunner;

import model.ModelFactory;
import model.RelationIsCyclicRule;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Relation Is Cyclic Rule</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RelationIsCyclicRuleTest extends AbstractRuleTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RelationIsCyclicRuleTest.class);
	}

	/**
	 * Constructs a new Relation Is Cyclic Rule test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationIsCyclicRuleTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Relation Is Cyclic Rule test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected RelationIsCyclicRule getFixture() {
		return (RelationIsCyclicRule)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ModelFactory.eINSTANCE.createRelationIsCyclicRule());
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

} //RelationIsCyclicRuleTest
