/**
 */
package org.framed.orm.model;

import org.eclipse.emf.common.util.EList;

import org.framed.orm.geometry.RelativePoint;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.framed.orm.model.Relation#getTarget <em>Target</em>}</li>
 *   <li>{@link org.framed.orm.model.Relation#getSource <em>Source</em>}</li>
 *   <li>{@link org.framed.orm.model.Relation#getBendpoints <em>Bendpoints</em>}</li>
 *   <li>{@link org.framed.orm.model.Relation#getSourceLabel <em>Source Label</em>}</li>
 *   <li>{@link org.framed.orm.model.Relation#getTargetLabel <em>Target Label</em>}</li>
 *   <li>{@link org.framed.orm.model.Relation#getReferencedRelation <em>Referenced Relation</em>}</li>
 *   <li>{@link org.framed.orm.model.Relation#getReferencedRoles <em>Referenced Roles</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.framed.orm.model.OrmPackage#getRelation()
 * @model
 * @generated
 */
public interface Relation extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.framed.orm.model.ModelElement#getIncomingRelations <em>Incoming Relations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(ModelElement)
	 * @see org.framed.orm.model.OrmPackage#getRelation_Target()
	 * @see org.framed.orm.model.ModelElement#getIncomingRelations
	 * @model opposite="incomingRelations"
	 * @generated
	 */
	ModelElement getTarget();

	/**
	 * Sets the value of the '{@link org.framed.orm.model.Relation#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(ModelElement value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.framed.orm.model.ModelElement#getOutgoingRelations <em>Outgoing Relations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(ModelElement)
	 * @see org.framed.orm.model.OrmPackage#getRelation_Source()
	 * @see org.framed.orm.model.ModelElement#getOutgoingRelations
	 * @model opposite="outgoingRelations"
	 * @generated
	 */
	ModelElement getSource();

	/**
	 * Sets the value of the '{@link org.framed.orm.model.Relation#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(ModelElement value);

	/**
	 * Returns the value of the '<em><b>Bendpoints</b></em>' containment reference list.
	 * The list contents are of type {@link org.framed.orm.geometry.RelativePoint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bendpoints</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bendpoints</em>' containment reference list.
	 * @see org.framed.orm.model.OrmPackage#getRelation_Bendpoints()
	 * @model containment="true"
	 * @generated
	 */
	EList<RelativePoint> getBendpoints();

	/**
	 * Returns the value of the '<em><b>Source Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Label</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Label</em>' containment reference.
	 * @see #setSourceLabel(NamedElement)
	 * @see org.framed.orm.model.OrmPackage#getRelation_SourceLabel()
	 * @model containment="true"
	 * @generated
	 */
	NamedElement getSourceLabel();

	/**
	 * Sets the value of the '{@link org.framed.orm.model.Relation#getSourceLabel <em>Source Label</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Label</em>' containment reference.
	 * @see #getSourceLabel()
	 * @generated
	 */
	void setSourceLabel(NamedElement value);

	/**
	 * Returns the value of the '<em><b>Target Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Label</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Label</em>' containment reference.
	 * @see #setTargetLabel(NamedElement)
	 * @see org.framed.orm.model.OrmPackage#getRelation_TargetLabel()
	 * @model containment="true"
	 * @generated
	 */
	NamedElement getTargetLabel();

	/**
	 * Sets the value of the '{@link org.framed.orm.model.Relation#getTargetLabel <em>Target Label</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Label</em>' containment reference.
	 * @see #getTargetLabel()
	 * @generated
	 */
	void setTargetLabel(NamedElement value);

	/**
	 * Returns the value of the '<em><b>Referenced Relation</b></em>' reference list.
	 * The list contents are of type {@link org.framed.orm.model.Relation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Referenced Relation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced Relation</em>' reference list.
	 * @see org.framed.orm.model.OrmPackage#getRelation_ReferencedRelation()
	 * @model
	 * @generated
	 */
	EList<Relation> getReferencedRelation();

	/**
	 * Returns the value of the '<em><b>Referenced Roles</b></em>' reference list.
	 * The list contents are of type {@link org.framed.orm.model.Shape}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Referenced Roles</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced Roles</em>' reference list.
	 * @see org.framed.orm.model.OrmPackage#getRelation_ReferencedRoles()
	 * @model
	 * @generated
	 */
	EList<Shape> getReferencedRoles();

} // Relation
