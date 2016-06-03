/**
 */
package org.framed.orm.model.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.framed.orm.model.OrmFactory;
import org.framed.orm.model.Segment;

/**
 * <!-- begin-user-doc --> A test case for the model object '<em><b>Segment</b></em>'. <!--
 * end-user-doc -->
 * @generated
 */
public class SegmentTest extends TestCase {

  /**
   * The fixture for this Segment test case.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected Segment fixture = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public static void main(String[] args) {
    TestRunner.run(SegmentTest.class);
  }

  /**
   * Constructs a new Segment test case with the given name.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   */
  public SegmentTest(String name) {
    super(name);
  }

  /**
   * Sets the fixture for this Segment test case.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected void setFixture(Segment fixture) {
    this.fixture = fixture;
  }

  /**
   * Returns the fixture for this Segment test case.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected Segment getFixture() {
    return fixture;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see junit.framework.TestCase#setUp()
   * @generated
   */
  @Override
  protected void setUp() throws Exception {
    setFixture(OrmFactory.eINSTANCE.createSegment());
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

} // SegmentTest
