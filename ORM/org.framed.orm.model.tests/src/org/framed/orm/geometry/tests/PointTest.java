/**
 */
package org.framed.orm.geometry.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.framed.orm.geometry.GeometryFactory;
import org.framed.orm.geometry.Point;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Point</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PointTest extends TestCase {

  /**
   * The fixture for this Point test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Point fixture = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static void main(String[] args) {
    TestRunner.run(PointTest.class);
  }

  /**
   * Constructs a new Point test case with the given name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PointTest(String name) {
    super(name);
  }

  /**
   * Sets the fixture for this Point test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void setFixture(Point fixture) {
    this.fixture = fixture;
  }

  /**
   * Returns the fixture for this Point test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Point getFixture() {
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
    setFixture(GeometryFactory.eINSTANCE.createPoint());
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

} //PointTest
