/**
 */
package orm.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class Inheritance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link orm.model.ClassInheritance#getSuper <em>Super</em>}</li>
 *   <li>{@link orm.model.ClassInheritance#getSub <em>Sub</em>}</li>
 * </ul>
 * </p>
 *
 * @see orm.model.OrmPackage#getClassInheritance()
 * @model
 * @generated
 */
public interface ClassInheritance extends Inheritance {
	/**
	 * Returns the value of the '<em><b>Super</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Super</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Super</em>' reference.
	 * @see #setSuper(NaturalType)
	 * @see orm.model.OrmPackage#getClassInheritance_Super()
	 * @model required="true"
	 * @generated
	 */
	NaturalType getSuper();

	/**
	 * Sets the value of the '{@link orm.model.ClassInheritance#getSuper <em>Super</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Super</em>' reference.
	 * @see #getSuper()
	 * @generated
	 */
	void setSuper(NaturalType value);

	/**
	 * Returns the value of the '<em><b>Sub</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub</em>' reference.
	 * @see #setSub(NaturalType)
	 * @see orm.model.OrmPackage#getClassInheritance_Sub()
	 * @model required="true"
	 * @generated
	 */
	NaturalType getSub();

	/**
	 * Sets the value of the '{@link orm.model.ClassInheritance#getSub <em>Sub</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sub</em>' reference.
	 * @see #getSub()
	 * @generated
	 */
	void setSub(NaturalType value);

} // ClassInheritance
