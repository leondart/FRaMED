/**
 */
package org.framed.orm.model.tests;

import junit.textui.TestRunner;

import org.framed.orm.model.OrmFactory;
import org.framed.orm.model.Total;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Total</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TotalTest extends RelationshipConstraintTest {

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static void main(String[] args) {
    TestRunner.run(TotalTest.class);
  }

  /**
   * Constructs a new Total test case with the given name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TotalTest(String name) {
    super(name);
  }

  /**
   * Returns the fixture for this Total test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected Total getFixture() {
    return (Total)fixture;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see junit.framework.TestCase#setUp()
   * @generated
   */
  @Override
  protected void setUp() throws Exception {
    setFixture(OrmFactory.eINSTANCE.createTotal());
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

} //TotalTest
