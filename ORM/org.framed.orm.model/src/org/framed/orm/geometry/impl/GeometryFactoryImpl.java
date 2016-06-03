/**
 */
package org.framed.orm.geometry.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.framed.orm.geometry.*;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!-- end-user-doc -->
 * 
 * @generated
 */
public class GeometryFactoryImpl extends EFactoryImpl implements GeometryFactory {
  /**
   * Creates the default factory implementation. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static GeometryFactory init() {
    try {
      GeometryFactory theGeometryFactory =
          (GeometryFactory) EPackage.Registry.INSTANCE.getEFactory(GeometryPackage.eNS_URI);
      if (theGeometryFactory != null) {
        return theGeometryFactory;
      }
    } catch (Exception exception) {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new GeometryFactoryImpl();
  }

  /**
   * Creates an instance of the factory. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public GeometryFactoryImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Override
  public EObject create(EClass eClass) {
    switch (eClass.getClassifierID()) {
      case GeometryPackage.POINT:
        return createPoint();
      case GeometryPackage.RECTANGLE:
        return createRectangle();
      case GeometryPackage.RELATIVE_POINT:
        return createRelativePoint();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName()
            + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public Point createPoint() {
    PointImpl point = new PointImpl();
    return point;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public Rectangle createRectangle() {
    RectangleImpl rectangle = new RectangleImpl();
    return rectangle;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public RelativePoint createRelativePoint() {
    RelativePointImpl relativePoint = new RelativePointImpl();
    return relativePoint;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public GeometryPackage getGeometryPackage() {
    return (GeometryPackage) getEPackage();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @deprecated
   * @generated
   */
  @Deprecated
  public static GeometryPackage getPackage() {
    return GeometryPackage.eINSTANCE;
  }

} // GeometryFactoryImpl
