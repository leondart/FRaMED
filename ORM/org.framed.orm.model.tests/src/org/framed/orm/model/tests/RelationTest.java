/**
 */
package org.framed.orm.model.tests;

import junit.textui.TestRunner;
import org.framed.orm.model.OrmFactory;
import org.framed.orm.model.Relation;

/**
 * <!-- begin-user-doc --> A test case for the model object '<em><b>Relation</b></em>'. <!--
 * end-user-doc -->
 * 
 * @generated
 */
public class RelationTest extends ModelElementTest {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static void main(String[] args) {
    TestRunner.run(RelationTest.class);
  }

  /**
   * Constructs a new Relation test case with the given name. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  public RelationTest(String name) {
    super(name);
  }

  /**
   * Returns the fixture for this Relation test case. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Override
  protected Relation getFixture() {
    return (Relation) fixture;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see junit.framework.TestCase#setUp()
   * @generated
   */
  @Override
  protected void setUp() throws Exception {
    setFixture(OrmFactory.eINSTANCE.createRelation());
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see junit.framework.TestCase#tearDown()
   * @generated
   */
  @Override
  protected void tearDown() throws Exception {
    setFixture(null);
  }

} // RelationTest
