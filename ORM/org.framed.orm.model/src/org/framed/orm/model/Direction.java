/**
 */
package org.framed.orm.model;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Direction</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.framed.orm.model.OrmPackage#getDirection()
 * @model
 * @generated
 */
public enum Direction implements Enumerator {
  /**
   * The '<em><b>Undirected</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #UNDIRECTED_VALUE
   * @generated
   * @ordered
   */
  UNDIRECTED(0, "Undirected", "Undirected"),

  /**
   * The '<em><b>First To Second</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #FIRST_TO_SECOND_VALUE
   * @generated
   * @ordered
   */
  FIRST_TO_SECOND(1, "FirstToSecond", "FirstToSecond"),

  /**
   * The '<em><b>Second To First</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #SECOND_TO_FIRST_VALUE
   * @generated
   * @ordered
   */
  SECOND_TO_FIRST(2, "SecondToFirst", "SecondToFirst");

  /**
   * The '<em><b>Undirected</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Undirected</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #UNDIRECTED
   * @model name="Undirected"
   * @generated
   * @ordered
   */
  public static final int UNDIRECTED_VALUE = 0;

  /**
   * The '<em><b>First To Second</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>First To Second</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #FIRST_TO_SECOND
   * @model name="FirstToSecond"
   * @generated
   * @ordered
   */
  public static final int FIRST_TO_SECOND_VALUE = 1;

  /**
   * The '<em><b>Second To First</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Second To First</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #SECOND_TO_FIRST
   * @model name="SecondToFirst"
   * @generated
   * @ordered
   */
  public static final int SECOND_TO_FIRST_VALUE = 2;

  /**
   * An array of all the '<em><b>Direction</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final Direction[] VALUES_ARRAY = new Direction[] {UNDIRECTED, FIRST_TO_SECOND,
      SECOND_TO_FIRST,};

  /**
   * A public read-only list of all the '<em><b>Direction</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<Direction> VALUES = Collections.unmodifiableList(Arrays
      .asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Direction</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static Direction get(String literal) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i) {
      Direction result = VALUES_ARRAY[i];
      if (result.toString().equals(literal)) {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Direction</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static Direction getByName(String name) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i) {
      Direction result = VALUES_ARRAY[i];
      if (result.getName().equals(name)) {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Direction</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static Direction get(int value) {
    switch (value) {
      case UNDIRECTED_VALUE:
        return UNDIRECTED;
      case FIRST_TO_SECOND_VALUE:
        return FIRST_TO_SECOND;
      case SECOND_TO_FIRST_VALUE:
        return SECOND_TO_FIRST;
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
  private Direction(int value, String name, String literal) {
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

} //Direction
