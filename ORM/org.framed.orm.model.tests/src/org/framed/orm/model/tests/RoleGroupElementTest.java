/**
 */
package org.framed.orm.model.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.framed.orm.model.OrmFactory;
import org.framed.orm.model.RoleGroupElement;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Role Group Element</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RoleGroupElementTest extends TestCase {

  /**
   * The fixture for this Role Group Element test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RoleGroupElement fixture = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static void main(String[] args) {
    TestRunner.run(RoleGroupElementTest.class);
  }

  /**
   * Constructs a new Role Group Element test case with the given name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RoleGroupElementTest(String name) {
    super(name);
  }

  /**
   * Sets the fixture for this Role Group Element test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void setFixture(RoleGroupElement fixture) {
    this.fixture = fixture;
  }

  /**
   * Returns the fixture for this Role Group Element test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RoleGroupElement getFixture() {
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
    setFixture(OrmFactory.eINSTANCE.createRoleGroupElement());
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

} //RoleGroupElementTest
