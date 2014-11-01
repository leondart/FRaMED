/**
 */
package org.framed.orm.model.tests;

import junit.textui.TestRunner;

import org.framed.orm.model.IntraRelationshipConstraint;
import org.framed.orm.model.OrmFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Intra Relationship Constraint</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class IntraRelationshipConstraintTest extends RelationshipConstraintTest {

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static void main(String[] args) {
    TestRunner.run(IntraRelationshipConstraintTest.class);
  }

  /**
   * Constructs a new Intra Relationship Constraint test case with the given name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntraRelationshipConstraintTest(String name) {
    super(name);
  }

  /**
   * Returns the fixture for this Intra Relationship Constraint test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected IntraRelationshipConstraint getFixture() {
    return (IntraRelationshipConstraint) fixture;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see junit.framework.TestCase#setUp()
   * @generated
   */
  @Override
  protected void setUp() throws Exception {
    setFixture(OrmFactory.eINSTANCE.createIntraRelationshipConstraint());
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

} //IntraRelationshipConstraintTest
