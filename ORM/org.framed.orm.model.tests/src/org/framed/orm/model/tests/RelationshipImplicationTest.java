/**
 */
package org.framed.orm.model.tests;

import junit.textui.TestRunner;

import org.framed.orm.model.OrmFactory;
import org.framed.orm.model.RelationshipImplication;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Relationship Implication</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RelationshipImplicationTest extends InterRelationshipConstraintTest {

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static void main(String[] args) {
    TestRunner.run(RelationshipImplicationTest.class);
  }

  /**
   * Constructs a new Relationship Implication test case with the given name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RelationshipImplicationTest(String name) {
    super(name);
  }

  /**
   * Returns the fixture for this Relationship Implication test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected RelationshipImplication getFixture() {
    return (RelationshipImplication) fixture;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see junit.framework.TestCase#setUp()
   * @generated
   */
  @Override
  protected void setUp() throws Exception {
    setFixture(OrmFactory.eINSTANCE.createRelationshipImplication());
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

} //RelationshipImplicationTest
