/**
 */
package org.framed.orm.model.tests;

import junit.textui.TestRunner;

import org.framed.orm.model.OrmFactory;
import org.framed.orm.model.ParthoodConstraint;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Parthood Constraint</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ParthoodConstraintTest extends IntraRelationshipConstraintTest {

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static void main(String[] args) {
    TestRunner.run(ParthoodConstraintTest.class);
  }

  /**
   * Constructs a new Parthood Constraint test case with the given name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParthoodConstraintTest(String name) {
    super(name);
  }

  /**
   * Returns the fixture for this Parthood Constraint test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected ParthoodConstraint getFixture() {
    return (ParthoodConstraint) fixture;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see junit.framework.TestCase#setUp()
   * @generated
   */
  @Override
  protected void setUp() throws Exception {
    setFixture(OrmFactory.eINSTANCE.createParthoodConstraint());
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

} //ParthoodConstraintTest
