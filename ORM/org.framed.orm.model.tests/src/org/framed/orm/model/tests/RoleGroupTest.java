/**
 */
package org.framed.orm.model.tests;

import junit.textui.TestRunner;

import org.framed.orm.model.OrmFactory;
import org.framed.orm.model.RoleGroup;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Role Group</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RoleGroupTest extends RoleGroupElementTest {

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static void main(String[] args) {
    TestRunner.run(RoleGroupTest.class);
  }

  /**
   * Constructs a new Role Group test case with the given name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RoleGroupTest(String name) {
    super(name);
  }

  /**
   * Returns the fixture for this Role Group test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected RoleGroup getFixture() {
    return (RoleGroup) fixture;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see junit.framework.TestCase#setUp()
   * @generated
   */
  @Override
  protected void setUp() throws Exception {
    setFixture(OrmFactory.eINSTANCE.createRoleGroup());
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

} //RoleGroupTest
