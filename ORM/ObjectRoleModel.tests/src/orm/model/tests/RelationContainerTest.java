/**
 */
package orm.model.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import orm.model.OrmFactory;
import orm.model.RelationContainer;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Relation Container</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RelationContainerTest extends TestCase {

	/**
	 * The fixture for this Relation Container test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelationContainer fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RelationContainerTest.class);
	}

	/**
	 * Constructs a new Relation Container test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationContainerTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Relation Container test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(RelationContainer fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Relation Container test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelationContainer getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(OrmFactory.eINSTANCE.createRelationContainer());
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

} //RelationContainerTest
