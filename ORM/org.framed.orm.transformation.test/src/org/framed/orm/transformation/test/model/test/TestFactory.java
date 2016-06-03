/**
 */
package org.framed.orm.transformation.test.model.test;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc --> The <b>Factory</b> for the model. It provides a create method for each
 * non-abstract class of the model. <!-- end-user-doc -->
 * 
 * @see org.framed.orm.transformation.test.model.test.TestPackage
 * @generated
 */
public interface TestFactory extends EFactory {
  /**
   * The singleton instance of the factory. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  TestFactory eINSTANCE = org.framed.orm.transformation.test.model.test.impl.TestFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Case</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return a new object of class '<em>Case</em>'.
   * @generated
   */
  TestCase createTestCase();

  /**
   * Returns the package supported by this factory. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the package supported by this factory.
   * @generated
   */
  TestPackage getTestPackage();

} // TestFactory
