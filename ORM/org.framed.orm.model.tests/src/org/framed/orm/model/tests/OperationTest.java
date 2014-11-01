/**
 */
package org.framed.orm.model.tests;

import junit.textui.TestRunner;

import org.framed.orm.model.Operation;
import org.framed.orm.model.OrmFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class OperationTest extends TypedElementTest {

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static void main(String[] args) {
    TestRunner.run(OperationTest.class);
  }

  /**
   * Constructs a new Operation test case with the given name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OperationTest(String name) {
    super(name);
  }

  /**
   * Returns the fixture for this Operation test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected Operation getFixture() {
    return (Operation) fixture;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see junit.framework.TestCase#setUp()
   * @generated
   */
  @Override
  protected void setUp() throws Exception {
    setFixture(OrmFactory.eINSTANCE.createOperation());
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

} //OperationTest
