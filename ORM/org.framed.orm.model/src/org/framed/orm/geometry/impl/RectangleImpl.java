/**
 */
package org.framed.orm.geometry.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.framed.orm.geometry.GeometryPackage;
import org.framed.orm.geometry.Point;
import org.framed.orm.geometry.Rectangle;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rectangle</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.framed.orm.geometry.impl.RectangleImpl#getTopLeft <em>Top Left</em>}</li>
 *   <li>{@link org.framed.orm.geometry.impl.RectangleImpl#getBottomRight <em>Bottom Right</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RectangleImpl extends MinimalEObjectImpl.Container implements
		Rectangle {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RectangleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeometryPackage.Literals.RECTANGLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Point getTopLeft() {
		return (Point) eGet(GeometryPackage.Literals.RECTANGLE__TOP_LEFT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTopLeft(Point newTopLeft) {
		eSet(GeometryPackage.Literals.RECTANGLE__TOP_LEFT, newTopLeft);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Point getBottomRight() {
		return (Point) eGet(GeometryPackage.Literals.RECTANGLE__BOTTOM_RIGHT,
				true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBottomRight(Point newBottomRight) {
		eSet(GeometryPackage.Literals.RECTANGLE__BOTTOM_RIGHT, newBottomRight);
	}

} //RectangleImpl
