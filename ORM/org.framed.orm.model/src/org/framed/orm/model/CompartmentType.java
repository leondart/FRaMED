/**
 */
package org.framed.orm.model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Compartment Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.framed.orm.model.CompartmentType#isIsExpand <em>Is Expand</em>}</li>
 *   <li>{@link org.framed.orm.model.CompartmentType#getParts <em>Parts</em>}</li>
 *   <li>{@link org.framed.orm.model.CompartmentType#getRelationships <em>Relationships</em>}</li>
 *   <li>{@link org.framed.orm.model.CompartmentType#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link org.framed.orm.model.CompartmentType#getTr_extends <em>Tr extends</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.framed.orm.model.OrmPackage#getCompartmentType()
 * @model
 * @generated
 */
public interface CompartmentType extends RigidType, AbstractRoleModel {
  /**
   * Returns the value of the '<em><b>Is Expand</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Is Expand</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Is Expand</em>' attribute.
   * @see #setIsExpand(boolean)
   * @see org.framed.orm.model.OrmPackage#getCompartmentType_IsExpand()
   * @model
   * @generated
   */
  boolean isIsExpand();

  /**
   * Sets the value of the '{@link org.framed.orm.model.CompartmentType#isIsExpand <em>Is Expand</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Is Expand</em>' attribute.
   * @see #isIsExpand()
   * @generated
   */
  void setIsExpand(boolean value);

  /**
   * Returns the value of the '<em><b>Parts</b></em>' reference list.
   * The list contents are of type {@link org.framed.orm.model.Part}.
   * It is bidirectional and its opposite is '{@link org.framed.orm.model.Part#getWhole <em>Whole</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parts</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parts</em>' reference list.
   * @see org.framed.orm.model.OrmPackage#getCompartmentType_Parts()
   * @see org.framed.orm.model.Part#getWhole
   * @model opposite="whole"
   * @generated
   */
  EList<Part> getParts();

  /**
   * Returns the value of the '<em><b>Relationships</b></em>' reference list.
   * The list contents are of type {@link org.framed.orm.model.Relationship}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Relationships</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Relationships</em>' reference list.
   * @see org.framed.orm.model.OrmPackage#getCompartmentType_Relationships()
   * @model
   * @generated
   */
  EList<Relationship> getRelationships();

  /**
   * Returns the value of the '<em><b>Constraints</b></em>' reference list.
   * The list contents are of type {@link org.framed.orm.model.Constraint}.
   * It is bidirectional and its opposite is '{@link org.framed.orm.model.Constraint#getOwnerCompartment <em>Owner Compartment</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Constraints</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Constraints</em>' reference list.
   * @see org.framed.orm.model.OrmPackage#getCompartmentType_Constraints()
   * @see org.framed.orm.model.Constraint#getOwnerCompartment
   * @model opposite="ownerCompartment"
   * @generated
   */
  EList<Constraint> getConstraints();

  /**
   * Returns the value of the '<em><b>Tr extends</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tr extends</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tr extends</em>' reference.
   * @see #setTr_extends(CompartmentType)
   * @see org.framed.orm.model.OrmPackage#getCompartmentType_Tr_extends()
   * @model
   * @generated
   */
  CompartmentType getTr_extends();

  /**
   * Sets the value of the '{@link org.framed.orm.model.CompartmentType#getTr_extends <em>Tr extends</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Tr extends</em>' reference.
   * @see #getTr_extends()
   * @generated
   */
  void setTr_extends(CompartmentType value);

} // CompartmentType
