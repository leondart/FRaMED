/**
 */
package org.framed.orm.model;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Parthood</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.framed.orm.model.OrmPackage#getParthood()
 * @model
 * @generated
 */
public enum Parthood implements Enumerator {
  /**
   * The '<em><b>Unconstrained</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #UNCONSTRAINED_VALUE
   * @generated
   * @ordered
   */
  UNCONSTRAINED(0, "Unconstrained", "Unconstrained"),

  /**
   * The '<em><b>Exclusive Part</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #EXCLUSIVE_PART_VALUE
   * @generated
   * @ordered
   */
  EXCLUSIVE_PART(1, "ExclusivePart", "ExclusivePart"),

  /**
   * The '<em><b>Sharable Part</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #SHARABLE_PART_VALUE
   * @generated
   * @ordered
   */
  SHARABLE_PART(2, "SharablePart", "SharablePart"),

  /**
   * The '<em><b>Essential Part</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ESSENTIAL_PART_VALUE
   * @generated
   * @ordered
   */
  ESSENTIAL_PART(3, "EssentialPart", "EssentialPart"),

  /**
   * The '<em><b>Mandatory Part</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #MANDATORY_PART_VALUE
   * @generated
   * @ordered
   */
  MANDATORY_PART(4, "MandatoryPart", "MandatoryPart"),

  /**
   * The '<em><b>Inseperable Part</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #INSEPERABLE_PART_VALUE
   * @generated
   * @ordered
   */
  INSEPERABLE_PART(5, "InseperablePart", "InseperablePart");

  /**
   * The '<em><b>Unconstrained</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Unconstrained</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #UNCONSTRAINED
   * @model name="Unconstrained"
   * @generated
   * @ordered
   */
  public static final int UNCONSTRAINED_VALUE = 0;

  /**
   * The '<em><b>Exclusive Part</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Exclusive Part</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #EXCLUSIVE_PART
   * @model name="ExclusivePart"
   * @generated
   * @ordered
   */
  public static final int EXCLUSIVE_PART_VALUE = 1;

  /**
   * The '<em><b>Sharable Part</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Sharable Part</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #SHARABLE_PART
   * @model name="SharablePart"
   * @generated
   * @ordered
   */
  public static final int SHARABLE_PART_VALUE = 2;

  /**
   * The '<em><b>Essential Part</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Essential Part</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ESSENTIAL_PART
   * @model name="EssentialPart"
   * @generated
   * @ordered
   */
  public static final int ESSENTIAL_PART_VALUE = 3;

  /**
   * The '<em><b>Mandatory Part</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Mandatory Part</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #MANDATORY_PART
   * @model name="MandatoryPart"
   * @generated
   * @ordered
   */
  public static final int MANDATORY_PART_VALUE = 4;

  /**
   * The '<em><b>Inseperable Part</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Inseperable Part</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #INSEPERABLE_PART
   * @model name="InseperablePart"
   * @generated
   * @ordered
   */
  public static final int INSEPERABLE_PART_VALUE = 5;

  /**
   * An array of all the '<em><b>Parthood</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final Parthood[] VALUES_ARRAY = new Parthood[] {UNCONSTRAINED, EXCLUSIVE_PART,
      SHARABLE_PART, ESSENTIAL_PART, MANDATORY_PART, INSEPERABLE_PART,};

  /**
   * A public read-only list of all the '<em><b>Parthood</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<Parthood> VALUES = Collections.unmodifiableList(Arrays
      .asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Parthood</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static Parthood get(String literal) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i) {
      Parthood result = VALUES_ARRAY[i];
      if (result.toString().equals(literal)) {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Parthood</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static Parthood getByName(String name) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i) {
      Parthood result = VALUES_ARRAY[i];
      if (result.getName().equals(name)) {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Parthood</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static Parthood get(int value) {
    switch (value) {
      case UNCONSTRAINED_VALUE:
        return UNCONSTRAINED;
      case EXCLUSIVE_PART_VALUE:
        return EXCLUSIVE_PART;
      case SHARABLE_PART_VALUE:
        return SHARABLE_PART;
      case ESSENTIAL_PART_VALUE:
        return ESSENTIAL_PART;
      case MANDATORY_PART_VALUE:
        return MANDATORY_PART;
      case INSEPERABLE_PART_VALUE:
        return INSEPERABLE_PART;
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
  private Parthood(int value, String name, String literal) {
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

} //Parthood
