/**
 */
package orm.model.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>orm</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class OrmTests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new OrmTests("orm Tests");
		suite.addTestSuite(NaturalTypeTest.class);
		suite.addTestSuite(CompartmentTest.class);
		suite.addTestSuite(GroupingTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrmTests(String name) {
		super(name);
	}

} //OrmTests
