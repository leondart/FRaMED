/**
 */
package orm.model;

import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link orm.model.Node#getIncomingLinks <em>Incoming Links</em>}</li>
 *   <li>{@link orm.model.Node#getOutgoingLinks <em>Outgoing Links</em>}</li>
 *   <li>{@link orm.model.Node#getName <em>Name</em>}</li>
 *   <li>{@link orm.model.Node#getConstraints <em>Constraints</em>}</li>
 * </ul>
 * </p>
 *
 * @see orm.model.OrmPackage#getNode()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Node extends EObject {
	/**
	 * Returns the value of the '<em><b>Incoming Links</b></em>' reference list.
	 * The list contents are of type {@link orm.model.Relation}.
	 * It is bidirectional and its opposite is '{@link orm.model.Relation#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incoming Links</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming Links</em>' reference list.
	 * @see orm.model.OrmPackage#getNode_IncomingLinks()
	 * @see orm.model.Relation#getTarget
	 * @model opposite="target"
	 * @generated
	 */
	EList<Relation> getIncomingLinks();

	/**
	 * Returns the value of the '<em><b>Outgoing Links</b></em>' reference list.
	 * The list contents are of type {@link orm.model.Relation}.
	 * It is bidirectional and its opposite is '{@link orm.model.Relation#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoing Links</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing Links</em>' reference list.
	 * @see orm.model.OrmPackage#getNode_OutgoingLinks()
	 * @see orm.model.Relation#getSource
	 * @model opposite="source"
	 * @generated
	 */
	EList<Relation> getOutgoingLinks();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>"<...>"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see orm.model.OrmPackage#getNode_Name()
	 * @model default="<...>"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link orm.model.Node#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Constraints</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constraints</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraints</em>' attribute.
	 * @see #setConstraints(Rectangle)
	 * @see orm.model.OrmPackage#getNode_Constraints()
	 * @model dataType="orm.model.Rectangle"
	 * @generated
	 */
	Rectangle getConstraints();

	/**
	 * Sets the value of the '{@link orm.model.Node#getConstraints <em>Constraints</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constraints</em>' attribute.
	 * @see #getConstraints()
	 * @generated
	 */
	void setConstraints(Rectangle value);

} // Node
