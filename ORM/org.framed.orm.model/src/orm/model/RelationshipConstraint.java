/**
 */
package orm.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relationship Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link orm.model.RelationshipConstraint#getRelation <em>Relation</em>}</li>
 * </ul>
 * </p>
 *
 * @see orm.model.OrmPackage#getRelationshipConstraint()
 * @model abstract="true"
 * @generated
 */
public interface RelationshipConstraint extends Constraint {
	/**
	 * Returns the value of the '<em><b>Relation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relation</em>' reference.
	 * @see #setRelation(Relationship)
	 * @see orm.model.OrmPackage#getRelationshipConstraint_Relation()
	 * @model required="true"
	 * @generated
	 */
	Relationship getRelation();

	/**
	 * Sets the value of the '{@link orm.model.RelationshipConstraint#getRelation <em>Relation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relation</em>' reference.
	 * @see #getRelation()
	 * @generated
	 */
	void setRelation(Relationship value);

} // RelationshipConstraint
