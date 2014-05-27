/**
 */
package org.framed.orm.model.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.framed.orm.model.Fulfillment;
import org.framed.orm.model.OrmFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Fulfillment</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class FulfillmentTest extends TestCase {

  /**
   * The fixture for this Fulfillment test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Fulfillment fixture = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static void main(String[] args) {
    TestRunner.run(FulfillmentTest.class);
  }

  /**
   * Constructs a new Fulfillment test case with the given name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FulfillmentTest(String name) {
    super(name);
  }

  /**
   * Sets the fixture for this Fulfillment test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void setFixture(Fulfillment fixture) {
    this.fixture = fixture;
  }

  /**
   * Returns the fixture for this Fulfillment test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Fulfillment getFixture() {
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
    setFixture(OrmFactory.eINSTANCE.createFulfillment());
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

} //FulfillmentTest
