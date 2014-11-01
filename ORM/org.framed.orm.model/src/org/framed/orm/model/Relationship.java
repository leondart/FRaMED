/**
 */
package org.framed.orm.model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.framed.orm.model.Relationship#getSecondParthood <em>Second Parthood</em>}</li>
 *   <li>{@link org.framed.orm.model.Relationship#getSecondLower <em>Second Lower</em>}</li>
 *   <li>{@link org.framed.orm.model.Relationship#getFirstLower <em>First Lower</em>}</li>
 *   <li>{@link org.framed.orm.model.Relationship#getFirstUpper <em>First Upper</em>}</li>
 *   <li>{@link org.framed.orm.model.Relationship#getSecondUpper <em>Second Upper</em>}</li>
 *   <li>{@link org.framed.orm.model.Relationship#getFirstParthood <em>First Parthood</em>}</li>
 *   <li>{@link org.framed.orm.model.Relationship#getSourceLabel <em>Source Label</em>}</li>
 *   <li>{@link org.framed.orm.model.Relationship#getTargetLabel <em>Target Label</em>}</li>
 *   <li>{@link org.framed.orm.model.Relationship#getFirstLowerUpper <em>First Lower Upper</em>}</li>
 *   <li>{@link org.framed.orm.model.Relationship#getSecondLowerUpper <em>Second Lower Upper</em>}</li>
 *   <li>{@link org.framed.orm.model.Relationship#getRlshipConstraints <em>Rlship Constraints</em>}</li>
 *   <li>{@link org.framed.orm.model.Relationship#getDirection <em>Direction</em>}</li>
 *   <li>{@link org.framed.orm.model.Relationship#getFirst <em>First</em>}</li>
 *   <li>{@link org.framed.orm.model.Relationship#getSecond <em>Second</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.framed.orm.model.OrmPackage#getRelationship()
 * @model
 * @generated
 */
public interface Relationship extends Relation, NamedElement {
  /**
   * Returns the value of the '<em><b>Second Parthood</b></em>' attribute.
   * The default value is <code>"Unconstrained"</code>.
   * The literals are from the enumeration {@link org.framed.orm.model.Parthood}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Second Parthood</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Second Parthood</em>' attribute.
   * @see org.framed.orm.model.Parthood
   * @see #setSecondParthood(Parthood)
   * @see org.framed.orm.model.OrmPackage#getRelationship_SecondParthood()
   * @model default="Unconstrained" required="true"
   * @generated
   */
  Parthood getSecondParthood();

  /**
   * Sets the value of the '{@link org.framed.orm.model.Relationship#getSecondParthood <em>Second Parthood</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Second Parthood</em>' attribute.
   * @see org.framed.orm.model.Parthood
   * @see #getSecondParthood()
   * @generated
   */
  void setSecondParthood(Parthood value);

  /**
   * Returns the value of the '<em><b>Second Lower</b></em>' attribute.
   * The default value is <code>"0"</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Second Lower</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Second Lower</em>' attribute.
   * @see #setSecondLower(int)
   * @see org.framed.orm.model.OrmPackage#getRelationship_SecondLower()
   * @model default="0" required="true"
   * @generated
   */
  int getSecondLower();

  /**
   * Sets the value of the '{@link org.framed.orm.model.Relationship#getSecondLower <em>Second Lower</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Second Lower</em>' attribute.
   * @see #getSecondLower()
   * @generated
   */
  void setSecondLower(int value);

  /**
   * Returns the value of the '<em><b>First Lower</b></em>' attribute.
   * The default value is <code>"0"</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>First Lower</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>First Lower</em>' attribute.
   * @see #setFirstLower(int)
   * @see org.framed.orm.model.OrmPackage#getRelationship_FirstLower()
   * @model default="0" required="true"
   * @generated
   */
  int getFirstLower();

  /**
   * Sets the value of the '{@link org.framed.orm.model.Relationship#getFirstLower <em>First Lower</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>First Lower</em>' attribute.
   * @see #getFirstLower()
   * @generated
   */
  void setFirstLower(int value);

  /**
   * Returns the value of the '<em><b>First Upper</b></em>' attribute.
   * The default value is <code>"1"</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>First Upper</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>First Upper</em>' attribute.
   * @see #setFirstUpper(int)
   * @see org.framed.orm.model.OrmPackage#getRelationship_FirstUpper()
   * @model default="1" required="true"
   * @generated
   */
  int getFirstUpper();

  /**
   * Sets the value of the '{@link org.framed.orm.model.Relationship#getFirstUpper <em>First Upper</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>First Upper</em>' attribute.
   * @see #getFirstUpper()
   * @generated
   */
  void setFirstUpper(int value);

  /**
   * Returns the value of the '<em><b>Second Upper</b></em>' attribute.
   * The default value is <code>"1"</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Second Upper</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Second Upper</em>' attribute.
   * @see #setSecondUpper(int)
   * @see org.framed.orm.model.OrmPackage#getRelationship_SecondUpper()
   * @model default="1" required="true"
   * @generated
   */
  int getSecondUpper();

  /**
   * Sets the value of the '{@link org.framed.orm.model.Relationship#getSecondUpper <em>Second Upper</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Second Upper</em>' attribute.
   * @see #getSecondUpper()
   * @generated
   */
  void setSecondUpper(int value);

  /**
   * Returns the value of the '<em><b>First Parthood</b></em>' attribute.
   * The default value is <code>"Unconstrained"</code>.
   * The literals are from the enumeration {@link org.framed.orm.model.Parthood}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>First Parthood</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>First Parthood</em>' attribute.
   * @see org.framed.orm.model.Parthood
   * @see #setFirstParthood(Parthood)
   * @see org.framed.orm.model.OrmPackage#getRelationship_FirstParthood()
   * @model default="Unconstrained" required="true"
   * @generated
   */
  Parthood getFirstParthood();

  /**
   * Sets the value of the '{@link org.framed.orm.model.Relationship#getFirstParthood <em>First Parthood</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>First Parthood</em>' attribute.
   * @see org.framed.orm.model.Parthood
   * @see #getFirstParthood()
   * @generated
   */
  void setFirstParthood(Parthood value);

  /**
   * Returns the value of the '<em><b>Source Label</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Source Label</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Source Label</em>' containment reference.
   * @see #setSourceLabel(RelationLabel)
   * @see org.framed.orm.model.OrmPackage#getRelationship_SourceLabel()
   * @model containment="true" required="true"
   * @generated
   */
  RelationLabel getSourceLabel();

  /**
   * Sets the value of the '{@link org.framed.orm.model.Relationship#getSourceLabel <em>Source Label</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Source Label</em>' containment reference.
   * @see #getSourceLabel()
   * @generated
   */
  void setSourceLabel(RelationLabel value);

  /**
   * Returns the value of the '<em><b>Target Label</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Target Label</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target Label</em>' containment reference.
   * @see #setTargetLabel(RelationLabel)
   * @see org.framed.orm.model.OrmPackage#getRelationship_TargetLabel()
   * @model containment="true" required="true"
   * @generated
   */
  RelationLabel getTargetLabel();

  /**
   * Sets the value of the '{@link org.framed.orm.model.Relationship#getTargetLabel <em>Target Label</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target Label</em>' containment reference.
   * @see #getTargetLabel()
   * @generated
   */
  void setTargetLabel(RelationLabel value);

  /**
   * Returns the value of the '<em><b>First Lower Upper</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>First Lower Upper</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>First Lower Upper</em>' attribute.
   * @see #setFirstLowerUpper(String)
   * @see org.framed.orm.model.OrmPackage#getRelationship_FirstLowerUpper()
   * @model required="true"
   * @generated
   */
  String getFirstLowerUpper();

  /**
   * Sets the value of the '{@link org.framed.orm.model.Relationship#getFirstLowerUpper <em>First Lower Upper</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>First Lower Upper</em>' attribute.
   * @see #getFirstLowerUpper()
   * @generated
   */
  void setFirstLowerUpper(String value);

  /**
   * Returns the value of the '<em><b>Second Lower Upper</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Second Lower Upper</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Second Lower Upper</em>' attribute.
   * @see #setSecondLowerUpper(String)
   * @see org.framed.orm.model.OrmPackage#getRelationship_SecondLowerUpper()
   * @model required="true"
   * @generated
   */
  String getSecondLowerUpper();

  /**
   * Sets the value of the '{@link org.framed.orm.model.Relationship#getSecondLowerUpper <em>Second Lower Upper</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Second Lower Upper</em>' attribute.
   * @see #getSecondLowerUpper()
   * @generated
   */
  void setSecondLowerUpper(String value);

  /**
   * Returns the value of the '<em><b>Rlship Constraints</b></em>' reference list.
   * The list contents are of type {@link org.framed.orm.model.RelationshipConstraint}.
   * It is bidirectional and its opposite is '{@link org.framed.orm.model.RelationshipConstraint#getRelation <em>Relation</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rlship Constraints</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rlship Constraints</em>' reference list.
   * @see org.framed.orm.model.OrmPackage#getRelationship_RlshipConstraints()
   * @see org.framed.orm.model.RelationshipConstraint#getRelation
   * @model opposite="relation"
   * @generated
   */
  EList<RelationshipConstraint> getRlshipConstraints();

  /**
   * Returns the value of the '<em><b>Direction</b></em>' attribute.
   * The literals are from the enumeration {@link org.framed.orm.model.Direction}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Direction</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Direction</em>' attribute.
   * @see org.framed.orm.model.Direction
   * @see #setDirection(Direction)
   * @see org.framed.orm.model.OrmPackage#getRelationship_Direction()
   * @model required="true"
   * @generated
   */
  Direction getDirection();

  /**
   * Sets the value of the '{@link org.framed.orm.model.Relationship#getDirection <em>Direction</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Direction</em>' attribute.
   * @see org.framed.orm.model.Direction
   * @see #getDirection()
   * @generated
   */
  void setDirection(Direction value);

  /**
   * Returns the value of the '<em><b>First</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>First</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>First</em>' reference.
   * @see #setFirst(Place)
   * @see org.framed.orm.model.OrmPackage#getRelationship_First()
   * @model required="true"
   * @generated
   */
  Place getFirst();

  /**
   * Sets the value of the '{@link org.framed.orm.model.Relationship#getFirst <em>First</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>First</em>' reference.
   * @see #getFirst()
   * @generated
   */
  void setFirst(Place value);

  /**
   * Returns the value of the '<em><b>Second</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Second</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Second</em>' reference.
   * @see #setSecond(Place)
   * @see org.framed.orm.model.OrmPackage#getRelationship_Second()
   * @model required="true"
   * @generated
   */
  Place getSecond();

  /**
   * Sets the value of the '{@link org.framed.orm.model.Relationship#getSecond <em>Second</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Second</em>' reference.
   * @see #getSecond()
   * @generated
   */
  void setSecond(Place value);

} // Relationship
