/**
 */
package org.framed.orm.model.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.framed.orm.model.Feature;
import org.framed.orm.model.OrmFactory;

/**
 * <!-- begin-user-doc --> A test case for the model object ' <em><b>Feature</b></em>'. <!--
 * end-user-doc -->
 * @generated
 */
public class FeatureTest extends TestCase {

  /**
   * The fixture for this Feature test case.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected Feature fixture = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public static void main(String[] args) {
    TestRunner.run(FeatureTest.class);
  }

  /**
   * Constructs a new Feature test case with the given name.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   */
  public FeatureTest(String name) {
    super(name);
  }

  /**
   * Sets the fixture for this Feature test case.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected void setFixture(Feature fixture) {
    this.fixture = fixture;
  }

  /**
   * Returns the fixture for this Feature test case.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected Feature getFixture() {
    return fixture;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see junit.framework.TestCase#setUp()
   * @generated
   */
  @Override
  protected void setUp() throws Exception {
    setFixture(OrmFactory.eINSTANCE.createFeature());
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

} // FeatureTest
