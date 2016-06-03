/**
 */
package org.framed.orm.model.tests;

import junit.textui.TestRunner;

import org.framed.orm.model.OrmFactory;
import org.framed.orm.model.Shape;

/**
 * <!-- begin-user-doc --> A test case for the model object '<em><b>Shape</b></em>'. <!--
 * end-user-doc -->
 * @generated
 */
public class ShapeTest extends ModelElementTest {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public static void main(String[] args) {
    TestRunner.run(ShapeTest.class);
  }

  /**
   * Constructs a new Shape test case with the given name. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   */
  public ShapeTest(String name) {
    super(name);
  }

  /**
   * Returns the fixture for this Shape test case.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected Shape getFixture() {
    return (Shape) fixture;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see junit.framework.TestCase#setUp()
   * @generated
   */
  @Override
  protected void setUp() throws Exception {
    setFixture(OrmFactory.eINSTANCE.createShape());
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

} // ShapeTest
