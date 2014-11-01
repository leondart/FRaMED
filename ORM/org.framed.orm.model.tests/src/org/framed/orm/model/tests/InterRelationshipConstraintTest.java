/**
 */
package org.framed.orm.model.tests;

import junit.textui.TestRunner;

import org.framed.orm.model.InterRelationshipConstraint;
import org.framed.orm.model.OrmFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Inter Relationship Constraint</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class InterRelationshipConstraintTest extends RelationshipConstraintTest {

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static void main(String[] args) {
    TestRunner.run(InterRelationshipConstraintTest.class);
  }

  /**
   * Constructs a new Inter Relationship Constraint test case with the given name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InterRelationshipConstraintTest(String name) {
    super(name);
  }

  /**
   * Returns the fixture for this Inter Relationship Constraint test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected InterRelationshipConstraint getFixture() {
    return (InterRelationshipConstraint) fixture;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see junit.framework.TestCase#setUp()
   * @generated
   */
  @Override
  protected void setUp() throws Exception {
    setFixture(OrmFactory.eINSTANCE.createInterRelationshipConstraint());
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

} //InterRelationshipConstraintTest
