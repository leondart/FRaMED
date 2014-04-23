/**
 */
package orm.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Role Inheritance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link orm.model.RoleInheritance#getSub <em>Sub</em>}</li>
 *   <li>{@link orm.model.RoleInheritance#getSuper <em>Super</em>}</li>
 * </ul>
 * </p>
 *
 * @see orm.model.OrmPackage#getRoleInheritance()
 * @model
 * @generated
 */
public interface RoleInheritance extends Inheritance {
	/**
	 * Returns the value of the '<em><b>Sub</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub</em>' reference.
	 * @see #setSub(RoleType)
	 * @see orm.model.OrmPackage#getRoleInheritance_Sub()
	 * @model required="true"
	 * @generated
	 */
	RoleType getSub();

	/**
	 * Sets the value of the '{@link orm.model.RoleInheritance#getSub <em>Sub</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sub</em>' reference.
	 * @see #getSub()
	 * @generated
	 */
	void setSub(RoleType value);

	/**
	 * Returns the value of the '<em><b>Super</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Super</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Super</em>' reference.
	 * @see #setSuper(RoleType)
	 * @see orm.model.OrmPackage#getRoleInheritance_Super()
	 * @model required="true"
	 * @generated
	 */
	RoleType getSuper();

	/**
	 * Sets the value of the '{@link orm.model.RoleInheritance#getSuper <em>Super</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Super</em>' reference.
	 * @see #getSuper()
	 * @generated
	 */
	void setSuper(RoleType value);

} // RoleInheritance
