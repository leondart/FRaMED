/**
 */
package org.framed.orm.model.tests;

import junit.textui.TestRunner;

import org.framed.orm.model.OrmFactory;
import org.framed.orm.model.RoleProhibition;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Role Prohibition</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RoleProhibitionTest extends RoleConstraintTest {

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static void main(String[] args) {
    TestRunner.run(RoleProhibitionTest.class);
  }

  /**
   * Constructs a new Role Prohibition test case with the given name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RoleProhibitionTest(String name) {
    super(name);
  }

  /**
   * Returns the fixture for this Role Prohibition test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected RoleProhibition getFixture() {
    return (RoleProhibition) fixture;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see junit.framework.TestCase#setUp()
   * @generated
   */
  @Override
  protected void setUp() throws Exception {
    setFixture(OrmFactory.eINSTANCE.createRoleProhibition());
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

} //RoleProhibitionTest
