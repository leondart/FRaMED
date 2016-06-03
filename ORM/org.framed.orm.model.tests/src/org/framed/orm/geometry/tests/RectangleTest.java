/**
 */
package org.framed.orm.geometry.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.framed.orm.geometry.GeometryFactory;
import org.framed.orm.geometry.Rectangle;

/**
 * <!-- begin-user-doc --> A test case for the model object '<em><b>Rectangle</b></em>'. <!--
 * end-user-doc -->
 * @generated
 */
public class RectangleTest extends TestCase {

  /**
   * The fixture for this Rectangle test case.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected Rectangle fixture = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public static void main(String[] args) {
    TestRunner.run(RectangleTest.class);
  }

  /**
   * Constructs a new Rectangle test case with the given name.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   */
  public RectangleTest(String name) {
    super(name);
  }

  /**
   * Sets the fixture for this Rectangle test case.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected void setFixture(Rectangle fixture) {
    this.fixture = fixture;
  }

  /**
   * Returns the fixture for this Rectangle test case.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected Rectangle getFixture() {
    return fixture;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see junit.framework.TestCase#setUp()
   * @generated
   */
  @Override
  protected void setUp() throws Exception {
    setFixture(GeometryFactory.eINSTANCE.createRectangle());
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see junit.framework.TestCase#tearDown()
   * @generated
   */
  @Override
  protected void tearDown() throws Exception {
    setFixture(null);
  }

} // RectangleTest
