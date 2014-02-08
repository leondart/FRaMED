/**
 */
package orm.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Compartment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link orm.model.Compartment#getCd <em>Cd</em>}</li>
 *   <li>{@link orm.model.Compartment#getRolemodel <em>Rolemodel</em>}</li>
 *   <li>{@link orm.model.Compartment#getParentRolemodel <em>Parent Rolemodel</em>}</li>
 * </ul>
 * </p>
 *
 * @see orm.model.OrmPackage#getCompartment()
 * @model
 * @generated
 */
public interface Compartment extends Type {
	/**
	 * Returns the value of the '<em><b>Cd</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link orm.model.CompartmentDiagram#getCompartments <em>Compartments</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cd</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cd</em>' container reference.
	 * @see #setCd(CompartmentDiagram)
	 * @see orm.model.OrmPackage#getCompartment_Cd()
	 * @see orm.model.CompartmentDiagram#getCompartments
	 * @model opposite="compartments" transient="false" derived="true"
	 * @generated
	 */
	CompartmentDiagram getCd();

	/**
	 * Sets the value of the '{@link orm.model.Compartment#getCd <em>Cd</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cd</em>' container reference.
	 * @see #getCd()
	 * @generated
	 */
	void setCd(CompartmentDiagram value);

	/**
	 * Returns the value of the '<em><b>Rolemodel</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link orm.model.Rolemodel#getCt <em>Ct</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rolemodel</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rolemodel</em>' containment reference.
	 * @see #setRolemodel(Rolemodel)
	 * @see orm.model.OrmPackage#getCompartment_Rolemodel()
	 * @see orm.model.Rolemodel#getCt
	 * @model opposite="ct" containment="true" required="true"
	 * @generated
	 */
	Rolemodel getRolemodel();

	/**
	 * Sets the value of the '{@link orm.model.Compartment#getRolemodel <em>Rolemodel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rolemodel</em>' containment reference.
	 * @see #getRolemodel()
	 * @generated
	 */
	void setRolemodel(Rolemodel value);

	/**
	 * Returns the value of the '<em><b>Parent Rolemodel</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link orm.model.Rolemodel#getSubcontexts <em>Subcontexts</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Rolemodel</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Rolemodel</em>' container reference.
	 * @see #setParentRolemodel(Rolemodel)
	 * @see orm.model.OrmPackage#getCompartment_ParentRolemodel()
	 * @see orm.model.Rolemodel#getSubcontexts
	 * @model opposite="subcontexts" transient="false"
	 * @generated
	 */
	Rolemodel getParentRolemodel();

	/**
	 * Sets the value of the '{@link orm.model.Compartment#getParentRolemodel <em>Parent Rolemodel</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Rolemodel</em>' container reference.
	 * @see #getParentRolemodel()
	 * @generated
	 */
	void setParentRolemodel(Rolemodel value);

} // Compartment
