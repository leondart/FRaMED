/**
 */
package org.framed.orm.model;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.framed.orm.model.OrmPackage#getType()
 * @model
 * @generated
 */
public enum Type implements Enumerator {
  /**
   * The '<em><b>Compartment Type</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #COMPARTMENT_TYPE_VALUE
   * @generated
   * @ordered
   */
  COMPARTMENT_TYPE(0, "CompartmentType", "CompartmentType"),

  /**
   * The '<em><b>Natural Type</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #NATURAL_TYPE_VALUE
   * @generated
   * @ordered
   */
  NATURAL_TYPE(1, "NaturalType", "NaturalType"),

  /**
   * The '<em><b>Role Type</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ROLE_TYPE_VALUE
   * @generated
   * @ordered
   */
  ROLE_TYPE(2, "RoleType", "RoleType"),

  /**
   * The '<em><b>Data Type</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #DATA_TYPE_VALUE
   * @generated
   * @ordered
   */
  DATA_TYPE(3, "DataType", "DataType"),

  /**
   * The '<em><b>Role Implication</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ROLE_IMPLICATION_VALUE
   * @generated
   * @ordered
   */
  ROLE_IMPLICATION(4, "RoleImplication", "RoleImplication"),

  /**
   * The '<em><b>Role Equivalence</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ROLE_EQUIVALENCE_VALUE
   * @generated
   * @ordered
   */
  ROLE_EQUIVALENCE(5, "RoleEquivalence", "RoleEquivalence"),

  /**
   * The '<em><b>Inheritance</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #INHERITANCE_VALUE
   * @generated
   * @ordered
   */
  INHERITANCE(6, "Inheritance", "Inheritance"),

  /**
   * The '<em><b>Relationship</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #RELATIONSHIP_VALUE
   * @generated
   * @ordered
   */
  RELATIONSHIP(7, "Relationship", "Relationship"),

  /**
   * The '<em><b>Total</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #TOTAL_VALUE
   * @generated
   * @ordered
   */
  TOTAL(8, "Total", "Total"),

  /**
   * The '<em><b>Cyclic</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #CYCLIC_VALUE
   * @generated
   * @ordered
   */
  CYCLIC(9, "Cyclic", "Cyclic"),

  /**
   * The '<em><b>Irreflexive</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #IRREFLEXIVE_VALUE
   * @generated
   * @ordered
   */
  IRREFLEXIVE(10, "Irreflexive", "Irreflexive"),

  /**
   * The '<em><b>Role Prohibition</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ROLE_PROHIBITION_VALUE
   * @generated
   * @ordered
   */
  ROLE_PROHIBITION(11, "RoleProhibition", "RoleProhibition"),

  /**
   * The '<em><b>Role Group</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ROLE_GROUP_VALUE
   * @generated
   * @ordered
   */
  ROLE_GROUP(12, "RoleGroup", "RoleGroup"),

  /**
   * The '<em><b>Group</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #GROUP_VALUE
   * @generated
   * @ordered
   */
  GROUP(13, "Group", "Group"),

  /**
   * The '<em><b>Fulfillment</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #FULFILLMENT_VALUE
   * @generated
   * @ordered
   */
  FULFILLMENT(14, "Fulfillment", "Fulfillment");

  /**
   * The '<em><b>Compartment Type</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Compartment Type</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #COMPARTMENT_TYPE
   * @model name="CompartmentType"
   * @generated
   * @ordered
   */
  public static final int COMPARTMENT_TYPE_VALUE = 0;

  /**
   * The '<em><b>Natural Type</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Natural Type</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #NATURAL_TYPE
   * @model name="NaturalType"
   * @generated
   * @ordered
   */
  public static final int NATURAL_TYPE_VALUE = 1;

  /**
   * The '<em><b>Role Type</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Role Type</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ROLE_TYPE
   * @model name="RoleType"
   * @generated
   * @ordered
   */
  public static final int ROLE_TYPE_VALUE = 2;

  /**
   * The '<em><b>Data Type</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Data Type</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #DATA_TYPE
   * @model name="DataType"
   * @generated
   * @ordered
   */
  public static final int DATA_TYPE_VALUE = 3;

  /**
   * The '<em><b>Role Implication</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Role Implication</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ROLE_IMPLICATION
   * @model name="RoleImplication"
   * @generated
   * @ordered
   */
  public static final int ROLE_IMPLICATION_VALUE = 4;

  /**
   * The '<em><b>Role Equivalence</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Role Equivalence</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ROLE_EQUIVALENCE
   * @model name="RoleEquivalence"
   * @generated
   * @ordered
   */
  public static final int ROLE_EQUIVALENCE_VALUE = 5;

  /**
   * The '<em><b>Inheritance</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Inheritance</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #INHERITANCE
   * @model name="Inheritance"
   * @generated
   * @ordered
   */
  public static final int INHERITANCE_VALUE = 6;

  /**
   * The '<em><b>Relationship</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Relationship</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #RELATIONSHIP
   * @model name="Relationship"
   * @generated
   * @ordered
   */
  public static final int RELATIONSHIP_VALUE = 7;

  /**
   * The '<em><b>Total</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Total</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #TOTAL
   * @model name="Total"
   * @generated
   * @ordered
   */
  public static final int TOTAL_VALUE = 8;

  /**
   * The '<em><b>Cyclic</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Cyclic</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #CYCLIC
   * @model name="Cyclic"
   * @generated
   * @ordered
   */
  public static final int CYCLIC_VALUE = 9;

  /**
   * The '<em><b>Irreflexive</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Irreflexive</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #IRREFLEXIVE
   * @model name="Irreflexive"
   * @generated
   * @ordered
   */
  public static final int IRREFLEXIVE_VALUE = 10;

  /**
   * The '<em><b>Role Prohibition</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Role Prohibition</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ROLE_PROHIBITION
   * @model name="RoleProhibition"
   * @generated
   * @ordered
   */
  public static final int ROLE_PROHIBITION_VALUE = 11;

  /**
   * The '<em><b>Role Group</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Role Group</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ROLE_GROUP
   * @model name="RoleGroup"
   * @generated
   * @ordered
   */
  public static final int ROLE_GROUP_VALUE = 12;

  /**
   * The '<em><b>Group</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Group</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #GROUP
   * @model name="Group"
   * @generated
   * @ordered
   */
  public static final int GROUP_VALUE = 13;

  /**
   * The '<em><b>Fulfillment</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Fulfillment</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #FULFILLMENT
   * @model name="Fulfillment"
   * @generated
   * @ordered
   */
  public static final int FULFILLMENT_VALUE = 14;

  /**
   * An array of all the '<em><b>Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final Type[] VALUES_ARRAY = new Type[] {COMPARTMENT_TYPE, NATURAL_TYPE, ROLE_TYPE,
      DATA_TYPE, ROLE_IMPLICATION, ROLE_EQUIVALENCE, INHERITANCE, RELATIONSHIP, TOTAL, CYCLIC,
      IRREFLEXIVE, ROLE_PROHIBITION, ROLE_GROUP, GROUP, FULFILLMENT,};

  /**
   * A public read-only list of all the '<em><b>Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<Type> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Type</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static Type get(String literal) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i) {
      Type result = VALUES_ARRAY[i];
      if (result.toString().equals(literal)) {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Type</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static Type getByName(String name) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i) {
      Type result = VALUES_ARRAY[i];
      if (result.getName().equals(name)) {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Type</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static Type get(int value) {
    switch (value) {
      case COMPARTMENT_TYPE_VALUE:
        return COMPARTMENT_TYPE;
      case NATURAL_TYPE_VALUE:
        return NATURAL_TYPE;
      case ROLE_TYPE_VALUE:
        return ROLE_TYPE;
      case DATA_TYPE_VALUE:
        return DATA_TYPE;
      case ROLE_IMPLICATION_VALUE:
        return ROLE_IMPLICATION;
      case ROLE_EQUIVALENCE_VALUE:
        return ROLE_EQUIVALENCE;
      case INHERITANCE_VALUE:
        return INHERITANCE;
      case RELATIONSHIP_VALUE:
        return RELATIONSHIP;
      case TOTAL_VALUE:
        return TOTAL;
      case CYCLIC_VALUE:
        return CYCLIC;
      case IRREFLEXIVE_VALUE:
        return IRREFLEXIVE;
      case ROLE_PROHIBITION_VALUE:
        return ROLE_PROHIBITION;
      case ROLE_GROUP_VALUE:
        return ROLE_GROUP;
      case GROUP_VALUE:
        return GROUP;
      case FULFILLMENT_VALUE:
        return FULFILLMENT;
    }
    return null;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final int value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String name;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String literal;

  /**
   * Only this class can construct instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private Type(int value, String name, String literal) {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getValue() {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName() {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLiteral() {
    return literal;
  }

  /**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString() {
    return literal;
  }

} //Type
