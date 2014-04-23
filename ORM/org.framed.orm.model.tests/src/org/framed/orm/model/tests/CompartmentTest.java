/**
 */
package org.framed.orm.model.tests;

import junit.textui.TestRunner;

import org.framed.orm.model.Compartment;
import org.framed.orm.model.OrmFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Compartment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link org.framed.orm.model.Compartment#getCd() <em>Cd</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class CompartmentTest extends TypeTest {

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static void main(String[] args) {
    TestRunner.run(CompartmentTest.class);
  }

  /**
   * Constructs a new Compartment test case with the given name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CompartmentTest(String name) {
    super(name);
  }

  /**
   * Returns the fixture for this Compartment test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected Compartment getFixture() {
    return (Compartment)fixture;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see junit.framework.TestCase#setUp()
   * @generated
   */
  @Override
  protected void setUp() throws Exception {
    setFixture(OrmFactory.eINSTANCE.createCompartment());
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

  /**
   * Tests the '{@link org.framed.orm.model.Compartment#getCd() <em>Cd</em>}' feature getter.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.framed.orm.model.Compartment#getCd()
   * @generated
   */
  public void testGetCd() {
    // TODO: implement this feature getter test method
    // Ensure that you remove @generated or mark it @generated NOT
    fail();
  }

  /**
   * Tests the '{@link org.framed.orm.model.Compartment#setCd(org.framed.orm.model.CompartmentDiagram) <em>Cd</em>}' feature setter.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.framed.orm.model.Compartment#setCd(org.framed.orm.model.CompartmentDiagram)
   * @generated
   */
  public void testSetCd() {
    // TODO: implement this feature setter test method
    // Ensure that you remove @generated or mark it @generated NOT
    fail();
  }

} //CompartmentTest
