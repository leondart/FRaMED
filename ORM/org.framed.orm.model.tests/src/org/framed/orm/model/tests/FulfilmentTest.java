/**
 */
package org.framed.orm.model.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.framed.orm.model.Fulfilment;
import org.framed.orm.model.OrmFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Fulfilment</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class FulfilmentTest extends TestCase {

  /**
   * The fixture for this Fulfilment test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Fulfilment fixture = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static void main(String[] args) {
    TestRunner.run(FulfilmentTest.class);
  }

  /**
   * Constructs a new Fulfilment test case with the given name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FulfilmentTest(String name) {
    super(name);
  }

  /**
   * Sets the fixture for this Fulfilment test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void setFixture(Fulfilment fixture) {
    this.fixture = fixture;
  }

  /**
   * Returns the fixture for this Fulfilment test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Fulfilment getFixture() {
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
    setFixture(OrmFactory.eINSTANCE.createFulfilment());
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

} //FulfilmentTest
