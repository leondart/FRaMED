/**
 */
package org.framed.orm.model.tests;

import junit.textui.TestRunner;

import org.framed.orm.model.OrmFactory;
import org.framed.orm.model.RoleType;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Role Type</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RoleTypeTest extends TypeTest {

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static void main(String[] args) {
    TestRunner.run(RoleTypeTest.class);
  }

  /**
   * Constructs a new Role Type test case with the given name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RoleTypeTest(String name) {
    super(name);
  }

  /**
   * Returns the fixture for this Role Type test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected RoleType getFixture() {
    return (RoleType)fixture;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see junit.framework.TestCase#setUp()
   * @generated
   */
  @Override
  protected void setUp() throws Exception {
    setFixture(OrmFactory.eINSTANCE.createRoleType());
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

} //RoleTypeTest
