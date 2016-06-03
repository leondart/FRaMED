/**
 */
package org.framed.orm.geometry.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.framed.orm.geometry.GeometryFactory;
import org.framed.orm.geometry.RelativePoint;

/**
 * <!-- begin-user-doc --> A test case for the model object '<em><b>Relative Point</b></em>'. <!--
 * end-user-doc -->
 * 
 * @generated
 */
public class RelativePointTest extends TestCase {

  /**
   * The fixture for this Relative Point test case. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  protected RelativePoint fixture = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static void main(String[] args) {
    TestRunner.run(RelativePointTest.class);
  }

  /**
   * Constructs a new Relative Point test case with the given name. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  public RelativePointTest(String name) {
    super(name);
  }

  /**
   * Sets the fixture for this Relative Point test case. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   */
  protected void setFixture(RelativePoint fixture) {
    this.fixture = fixture;
  }

  /**
   * Returns the fixture for this Relative Point test case. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  protected RelativePoint getFixture() {
    return fixture;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see junit.framework.TestCase#setUp()
   * @generated
   */
  @Override
  protected void setUp() throws Exception {
    setFixture(GeometryFactory.eINSTANCE.createRelativePoint());
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see junit.framework.TestCase#tearDown()
   * @generated
   */
  @Override
  protected void tearDown() throws Exception {
    setFixture(null);
  }

} // RelativePointTest
