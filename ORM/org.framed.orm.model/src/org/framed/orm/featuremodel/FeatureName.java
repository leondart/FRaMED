/**
 */
package org.framed.orm.featuremodel;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Feature Name</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.framed.orm.featuremodel.FeaturemodelPackage#getFeatureName()
 * @model
 * @generated
 */
public enum FeatureName implements Enumerator {
  /**
   * The '<em><b>RML Feature Model</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #RML_FEATURE_MODEL_VALUE
   * @generated
   * @ordered
   */
  RML_FEATURE_MODEL(0, "RML_Feature_Model", "RML_Feature_Model"),

  /**
   * The '<em><b>Role Types</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ROLE_TYPES_VALUE
   * @generated
   * @ordered
   */
  ROLE_TYPES(1, "Role_Types", "Role_Types"),

  /**
   * The '<em><b>Role Structure</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ROLE_STRUCTURE_VALUE
   * @generated
   * @ordered
   */
  ROLE_STRUCTURE(2, "Role_Structure", "Role_Structure"),

  /**
   * The '<em><b>Role Properties</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ROLE_PROPERTIES_VALUE
   * @generated
   * @ordered
   */
  ROLE_PROPERTIES(3, "Role_Properties", "Role_Properties"),

  /**
   * The '<em><b>Role Behavior</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ROLE_BEHAVIOR_VALUE
   * @generated
   * @ordered
   */
  ROLE_BEHAVIOR(4, "Role_Behavior", "Role_Behavior"),

  /**
   * The '<em><b>Role Inheritance</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ROLE_INHERITANCE_VALUE
   * @generated
   * @ordered
   */
  ROLE_INHERITANCE(5, "Role_Inheritance", "Role_Inheritance"),

  /**
   * The '<em><b>Playable</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #PLAYABLE_VALUE
   * @generated
   * @ordered
   */
  PLAYABLE(6, "Playable", "Playable"),

  /**
   * The '<em><b>Players</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #PLAYERS_VALUE
   * @generated
   * @ordered
   */
  PLAYERS(7, "Players", "Players"),

  /**
   * The '<em><b>Naturals</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #NATURALS_VALUE
   * @generated
   * @ordered
   */
  NATURALS(8, "Naturals", "Naturals"),

  /**
   * The '<em><b>Roles</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ROLES_VALUE
   * @generated
   * @ordered
   */
  ROLES(9, "Roles", "Roles"),

  /**
   * The '<em><b>Compartments</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #COMPARTMENTS_VALUE
   * @generated
   * @ordered
   */
  COMPARTMENTS(10, "Compartments", "Compartments"),

  /**
   * The '<em><b>Dates</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #DATES_VALUE
   * @generated
   * @ordered
   */
  DATES(11, "Dates", "Dates"),

  /**
   * The '<em><b>Dependent</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #DEPENDENT_VALUE
   * @generated
   * @ordered
   */
  DEPENDENT(12, "Dependent", "Dependent"),

  /**
   * The '<em><b>On Compartments</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ON_COMPARTMENTS_VALUE
   * @generated
   * @ordered
   */
  ON_COMPARTMENTS(13, "On_Compartments", "On_Compartments"),

  /**
   * The '<em><b>On Relationships</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ON_RELATIONSHIPS_VALUE
   * @generated
   * @ordered
   */
  ON_RELATIONSHIPS(14, "On_Relationships", "On_Relationships"),

  /**
   * The '<em><b>Role Constraints</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ROLE_CONSTRAINTS_VALUE
   * @generated
   * @ordered
   */
  ROLE_CONSTRAINTS(15, "Role_Constraints", "Role_Constraints"),

  /**
   * The '<em><b>Role Implication</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ROLE_IMPLICATION_VALUE
   * @generated
   * @ordered
   */
  ROLE_IMPLICATION(16, "Role_Implication", "Role_Implication"),

  /**
   * The '<em><b>Role Prohibition</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ROLE_PROHIBITION_VALUE
   * @generated
   * @ordered
   */
  ROLE_PROHIBITION(17, "Role_Prohibition", "Role_Prohibition"),

  /**
   * The '<em><b>Role Equivalence</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ROLE_EQUIVALENCE_VALUE
   * @generated
   * @ordered
   */
  ROLE_EQUIVALENCE(18, "Role_Equivalence", "Role_Equivalence"),

  /**
   * The '<em><b>Group Constraints</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #GROUP_CONSTRAINTS_VALUE
   * @generated
   * @ordered
   */
  GROUP_CONSTRAINTS(19, "Group_Constraints", "Group_Constraints"),

  /**
   * The '<em><b>Occurrence Constraints</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #OCCURRENCE_CONSTRAINTS_VALUE
   * @generated
   * @ordered
   */
  OCCURRENCE_CONSTRAINTS(20, "Occurrence_Constraints", "Occurrence_Constraints"),

  /**
   * The '<em><b>Relationships</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #RELATIONSHIPS_VALUE
   * @generated
   * @ordered
   */
  RELATIONSHIPS(21, "Relationships", "Relationships"),

  /**
   * The '<em><b>Relationship Constraints</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #RELATIONSHIP_CONSTRAINTS_VALUE
   * @generated
   * @ordered
   */
  RELATIONSHIP_CONSTRAINTS(22, "Relationship_Constraints", "Relationship_Constraints"),

  /**
   * The '<em><b>Relationship Cardinality</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #RELATIONSHIP_CARDINALITY_VALUE
   * @generated
   * @ordered
   */
  RELATIONSHIP_CARDINALITY(23, "Relationship_Cardinality", "Relationship_Cardinality"),

  /**
   * The '<em><b>Intra Relationship Constraints</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #INTRA_RELATIONSHIP_CONSTRAINTS_VALUE
   * @generated
   * @ordered
   */
  INTRA_RELATIONSHIP_CONSTRAINTS(24, "Intra_Relationship_Constraints",
      "Intra_Relationship_Constraints"),

  /**
   * The '<em><b>Parthood Constraints</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #PARTHOOD_CONSTRAINTS_VALUE
   * @generated
   * @ordered
   */
  PARTHOOD_CONSTRAINTS(25, "Parthood_Constraints", "Parthood_Constraints"),

  /**
   * The '<em><b>Inter Relationship Constraints</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #INTER_RELATIONSHIP_CONSTRAINTS_VALUE
   * @generated
   * @ordered
   */
  INTER_RELATIONSHIP_CONSTRAINTS(26, "Inter_Relationship_Constraints",
      "Inter_Relationship_Constraints"),

  /**
   * The '<em><b>Compartment Types</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #COMPARTMENT_TYPES_VALUE
   * @generated
   * @ordered
   */
  COMPARTMENT_TYPES(27, "Compartment_Types", "Compartment_Types"),

  /**
   * The '<em><b>Compartment Structure</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #COMPARTMENT_STRUCTURE_VALUE
   * @generated
   * @ordered
   */
  COMPARTMENT_STRUCTURE(28, "Compartment_Structure", "Compartment_Structure"),

  /**
   * The '<em><b>Compartment Properties</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #COMPARTMENT_PROPERTIES_VALUE
   * @generated
   * @ordered
   */
  COMPARTMENT_PROPERTIES(29, "Compartment_Properties", "Compartment_Properties"),

  /**
   * The '<em><b>Compartment Behavior</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #COMPARTMENT_BEHAVIOR_VALUE
   * @generated
   * @ordered
   */
  COMPARTMENT_BEHAVIOR(30, "Compartment_Behavior", "Compartment_Behavior"),

  /**
   * The '<em><b>Compartment Inheritance</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #COMPARTMENT_INHERITANCE_VALUE
   * @generated
   * @ordered
   */
  COMPARTMENT_INHERITANCE(31, "Compartment_Inheritance", "Compartment_Inheritance"),

  /**
   * The '<em><b>Participants</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #PARTICIPANTS_VALUE
   * @generated
   * @ordered
   */
  PARTICIPANTS(32, "Participants", "Participants"),

  /**
   * The '<em><b>Contains Compartments</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #CONTAINS_COMPARTMENTS_VALUE
   * @generated
   * @ordered
   */
  CONTAINS_COMPARTMENTS(33, "Contains_Compartments", "Contains_Compartments"),

  /**
   * The '<em><b>Playable by Defining Compartment</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #PLAYABLE_BY_DEFINING_COMPARTMENT_VALUE
   * @generated
   * @ordered
   */
  PLAYABLE_BY_DEFINING_COMPARTMENT(34, "Playable_by_Defining_Compartment",
      "Playable_by_Defining_Compartment"),

  /**
   * The '<em><b>Data Types</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #DATA_TYPES_VALUE
   * @generated
   * @ordered
   */
  DATA_TYPES(35, "Data_Types", "Data_Types"),

  /**
   * The '<em><b>Data Type Inheritance</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #DATA_TYPE_INHERITANCE_VALUE
   * @generated
   * @ordered
   */
  DATA_TYPE_INHERITANCE(36, "Data_Type_Inheritance", "Data_Type_Inheritance");

  /**
   * The '<em><b>RML Feature Model</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>RML Feature Model</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #RML_FEATURE_MODEL
   * @model name="RML_Feature_Model"
   * @generated
   * @ordered
   */
  public static final int RML_FEATURE_MODEL_VALUE = 0;

  /**
   * The '<em><b>Role Types</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Role Types</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ROLE_TYPES
   * @model name="Role_Types"
   * @generated
   * @ordered
   */
  public static final int ROLE_TYPES_VALUE = 1;

  /**
   * The '<em><b>Role Structure</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Role Structure</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ROLE_STRUCTURE
   * @model name="Role_Structure"
   * @generated
   * @ordered
   */
  public static final int ROLE_STRUCTURE_VALUE = 2;

  /**
   * The '<em><b>Role Properties</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Role Properties</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ROLE_PROPERTIES
   * @model name="Role_Properties"
   * @generated
   * @ordered
   */
  public static final int ROLE_PROPERTIES_VALUE = 3;

  /**
   * The '<em><b>Role Behavior</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Role Behavior</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ROLE_BEHAVIOR
   * @model name="Role_Behavior"
   * @generated
   * @ordered
   */
  public static final int ROLE_BEHAVIOR_VALUE = 4;

  /**
   * The '<em><b>Role Inheritance</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Role Inheritance</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ROLE_INHERITANCE
   * @model name="Role_Inheritance"
   * @generated
   * @ordered
   */
  public static final int ROLE_INHERITANCE_VALUE = 5;

  /**
   * The '<em><b>Playable</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Playable</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #PLAYABLE
   * @model name="Playable"
   * @generated
   * @ordered
   */
  public static final int PLAYABLE_VALUE = 6;

  /**
   * The '<em><b>Players</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Players</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #PLAYERS
   * @model name="Players"
   * @generated
   * @ordered
   */
  public static final int PLAYERS_VALUE = 7;

  /**
   * The '<em><b>Naturals</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Naturals</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #NATURALS
   * @model name="Naturals"
   * @generated
   * @ordered
   */
  public static final int NATURALS_VALUE = 8;

  /**
   * The '<em><b>Roles</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Roles</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ROLES
   * @model name="Roles"
   * @generated
   * @ordered
   */
  public static final int ROLES_VALUE = 9;

  /**
   * The '<em><b>Compartments</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Compartments</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #COMPARTMENTS
   * @model name="Compartments"
   * @generated
   * @ordered
   */
  public static final int COMPARTMENTS_VALUE = 10;

  /**
   * The '<em><b>Dates</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Dates</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #DATES
   * @model name="Dates"
   * @generated
   * @ordered
   */
  public static final int DATES_VALUE = 11;

  /**
   * The '<em><b>Dependent</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Dependent</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #DEPENDENT
   * @model name="Dependent"
   * @generated
   * @ordered
   */
  public static final int DEPENDENT_VALUE = 12;

  /**
   * The '<em><b>On Compartments</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>On Compartments</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ON_COMPARTMENTS
   * @model name="On_Compartments"
   * @generated
   * @ordered
   */
  public static final int ON_COMPARTMENTS_VALUE = 13;

  /**
   * The '<em><b>On Relationships</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>On Relationships</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ON_RELATIONSHIPS
   * @model name="On_Relationships"
   * @generated
   * @ordered
   */
  public static final int ON_RELATIONSHIPS_VALUE = 14;

  /**
   * The '<em><b>Role Constraints</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Role Constraints</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ROLE_CONSTRAINTS
   * @model name="Role_Constraints"
   * @generated
   * @ordered
   */
  public static final int ROLE_CONSTRAINTS_VALUE = 15;

  /**
   * The '<em><b>Role Implication</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Role Implication</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ROLE_IMPLICATION
   * @model name="Role_Implication"
   * @generated
   * @ordered
   */
  public static final int ROLE_IMPLICATION_VALUE = 16;

  /**
   * The '<em><b>Role Prohibition</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Role Prohibition</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ROLE_PROHIBITION
   * @model name="Role_Prohibition"
   * @generated
   * @ordered
   */
  public static final int ROLE_PROHIBITION_VALUE = 17;

  /**
   * The '<em><b>Role Equivalence</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Role Equivalence</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ROLE_EQUIVALENCE
   * @model name="Role_Equivalence"
   * @generated
   * @ordered
   */
  public static final int ROLE_EQUIVALENCE_VALUE = 18;

  /**
   * The '<em><b>Group Constraints</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Group Constraints</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #GROUP_CONSTRAINTS
   * @model name="Group_Constraints"
   * @generated
   * @ordered
   */
  public static final int GROUP_CONSTRAINTS_VALUE = 19;

  /**
   * The '<em><b>Occurrence Constraints</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Occurrence Constraints</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #OCCURRENCE_CONSTRAINTS
   * @model name="Occurrence_Constraints"
   * @generated
   * @ordered
   */
  public static final int OCCURRENCE_CONSTRAINTS_VALUE = 20;

  /**
   * The '<em><b>Relationships</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Relationships</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #RELATIONSHIPS
   * @model name="Relationships"
   * @generated
   * @ordered
   */
  public static final int RELATIONSHIPS_VALUE = 21;

  /**
   * The '<em><b>Relationship Constraints</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Relationship Constraints</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #RELATIONSHIP_CONSTRAINTS
   * @model name="Relationship_Constraints"
   * @generated
   * @ordered
   */
  public static final int RELATIONSHIP_CONSTRAINTS_VALUE = 22;

  /**
   * The '<em><b>Relationship Cardinality</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Relationship Cardinality</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #RELATIONSHIP_CARDINALITY
   * @model name="Relationship_Cardinality"
   * @generated
   * @ordered
   */
  public static final int RELATIONSHIP_CARDINALITY_VALUE = 23;

  /**
   * The '<em><b>Intra Relationship Constraints</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Intra Relationship Constraints</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #INTRA_RELATIONSHIP_CONSTRAINTS
   * @model name="Intra_Relationship_Constraints"
   * @generated
   * @ordered
   */
  public static final int INTRA_RELATIONSHIP_CONSTRAINTS_VALUE = 24;

  /**
   * The '<em><b>Parthood Constraints</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Parthood Constraints</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #PARTHOOD_CONSTRAINTS
   * @model name="Parthood_Constraints"
   * @generated
   * @ordered
   */
  public static final int PARTHOOD_CONSTRAINTS_VALUE = 25;

  /**
   * The '<em><b>Inter Relationship Constraints</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Inter Relationship Constraints</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #INTER_RELATIONSHIP_CONSTRAINTS
   * @model name="Inter_Relationship_Constraints"
   * @generated
   * @ordered
   */
  public static final int INTER_RELATIONSHIP_CONSTRAINTS_VALUE = 26;

  /**
   * The '<em><b>Compartment Types</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Compartment Types</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #COMPARTMENT_TYPES
   * @model name="Compartment_Types"
   * @generated
   * @ordered
   */
  public static final int COMPARTMENT_TYPES_VALUE = 27;

  /**
   * The '<em><b>Compartment Structure</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Compartment Structure</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #COMPARTMENT_STRUCTURE
   * @model name="Compartment_Structure"
   * @generated
   * @ordered
   */
  public static final int COMPARTMENT_STRUCTURE_VALUE = 28;

  /**
   * The '<em><b>Compartment Properties</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Compartment Properties</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #COMPARTMENT_PROPERTIES
   * @model name="Compartment_Properties"
   * @generated
   * @ordered
   */
  public static final int COMPARTMENT_PROPERTIES_VALUE = 29;

  /**
   * The '<em><b>Compartment Behavior</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Compartment Behavior</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #COMPARTMENT_BEHAVIOR
   * @model name="Compartment_Behavior"
   * @generated
   * @ordered
   */
  public static final int COMPARTMENT_BEHAVIOR_VALUE = 30;

  /**
   * The '<em><b>Compartment Inheritance</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Compartment Inheritance</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #COMPARTMENT_INHERITANCE
   * @model name="Compartment_Inheritance"
   * @generated
   * @ordered
   */
  public static final int COMPARTMENT_INHERITANCE_VALUE = 31;

  /**
   * The '<em><b>Participants</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Participants</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #PARTICIPANTS
   * @model name="Participants"
   * @generated
   * @ordered
   */
  public static final int PARTICIPANTS_VALUE = 32;

  /**
   * The '<em><b>Contains Compartments</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Contains Compartments</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #CONTAINS_COMPARTMENTS
   * @model name="Contains_Compartments"
   * @generated
   * @ordered
   */
  public static final int CONTAINS_COMPARTMENTS_VALUE = 33;

  /**
   * The '<em><b>Playable by Defining Compartment</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Playable by Defining Compartment</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #PLAYABLE_BY_DEFINING_COMPARTMENT
   * @model name="Playable_by_Defining_Compartment"
   * @generated
   * @ordered
   */
  public static final int PLAYABLE_BY_DEFINING_COMPARTMENT_VALUE = 34;

  /**
   * The '<em><b>Data Types</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Data Types</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #DATA_TYPES
   * @model name="Data_Types"
   * @generated
   * @ordered
   */
  public static final int DATA_TYPES_VALUE = 35;

  /**
   * The '<em><b>Data Type Inheritance</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Data Type Inheritance</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #DATA_TYPE_INHERITANCE
   * @model name="Data_Type_Inheritance"
   * @generated
   * @ordered
   */
  public static final int DATA_TYPE_INHERITANCE_VALUE = 36;

  /**
   * An array of all the '<em><b>Feature Name</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final FeatureName[] VALUES_ARRAY = new FeatureName[] {RML_FEATURE_MODEL,
      ROLE_TYPES, ROLE_STRUCTURE, ROLE_PROPERTIES, ROLE_BEHAVIOR, ROLE_INHERITANCE, PLAYABLE,
      PLAYERS, NATURALS, ROLES, COMPARTMENTS, DATES, DEPENDENT, ON_COMPARTMENTS, ON_RELATIONSHIPS,
      ROLE_CONSTRAINTS, ROLE_IMPLICATION, ROLE_PROHIBITION, ROLE_EQUIVALENCE, GROUP_CONSTRAINTS,
      OCCURRENCE_CONSTRAINTS, RELATIONSHIPS, RELATIONSHIP_CONSTRAINTS, RELATIONSHIP_CARDINALITY,
      INTRA_RELATIONSHIP_CONSTRAINTS, PARTHOOD_CONSTRAINTS, INTER_RELATIONSHIP_CONSTRAINTS,
      COMPARTMENT_TYPES, COMPARTMENT_STRUCTURE, COMPARTMENT_PROPERTIES, COMPARTMENT_BEHAVIOR,
      COMPARTMENT_INHERITANCE, PARTICIPANTS, CONTAINS_COMPARTMENTS,
      PLAYABLE_BY_DEFINING_COMPARTMENT, DATA_TYPES, DATA_TYPE_INHERITANCE,};

  /**
   * A public read-only list of all the '<em><b>Feature Name</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<FeatureName> VALUES = Collections.unmodifiableList(Arrays
      .asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Feature Name</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static FeatureName get(String literal) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i) {
      FeatureName result = VALUES_ARRAY[i];
      if (result.toString().equals(literal)) {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Feature Name</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static FeatureName getByName(String name) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i) {
      FeatureName result = VALUES_ARRAY[i];
      if (result.getName().equals(name)) {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Feature Name</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static FeatureName get(int value) {
    switch (value) {
      case RML_FEATURE_MODEL_VALUE:
        return RML_FEATURE_MODEL;
      case ROLE_TYPES_VALUE:
        return ROLE_TYPES;
      case ROLE_STRUCTURE_VALUE:
        return ROLE_STRUCTURE;
      case ROLE_PROPERTIES_VALUE:
        return ROLE_PROPERTIES;
      case ROLE_BEHAVIOR_VALUE:
        return ROLE_BEHAVIOR;
      case ROLE_INHERITANCE_VALUE:
        return ROLE_INHERITANCE;
      case PLAYABLE_VALUE:
        return PLAYABLE;
      case PLAYERS_VALUE:
        return PLAYERS;
      case NATURALS_VALUE:
        return NATURALS;
      case ROLES_VALUE:
        return ROLES;
      case COMPARTMENTS_VALUE:
        return COMPARTMENTS;
      case DATES_VALUE:
        return DATES;
      case DEPENDENT_VALUE:
        return DEPENDENT;
      case ON_COMPARTMENTS_VALUE:
        return ON_COMPARTMENTS;
      case ON_RELATIONSHIPS_VALUE:
        return ON_RELATIONSHIPS;
      case ROLE_CONSTRAINTS_VALUE:
        return ROLE_CONSTRAINTS;
      case ROLE_IMPLICATION_VALUE:
        return ROLE_IMPLICATION;
      case ROLE_PROHIBITION_VALUE:
        return ROLE_PROHIBITION;
      case ROLE_EQUIVALENCE_VALUE:
        return ROLE_EQUIVALENCE;
      case GROUP_CONSTRAINTS_VALUE:
        return GROUP_CONSTRAINTS;
      case OCCURRENCE_CONSTRAINTS_VALUE:
        return OCCURRENCE_CONSTRAINTS;
      case RELATIONSHIPS_VALUE:
        return RELATIONSHIPS;
      case RELATIONSHIP_CONSTRAINTS_VALUE:
        return RELATIONSHIP_CONSTRAINTS;
      case RELATIONSHIP_CARDINALITY_VALUE:
        return RELATIONSHIP_CARDINALITY;
      case INTRA_RELATIONSHIP_CONSTRAINTS_VALUE:
        return INTRA_RELATIONSHIP_CONSTRAINTS;
      case PARTHOOD_CONSTRAINTS_VALUE:
        return PARTHOOD_CONSTRAINTS;
      case INTER_RELATIONSHIP_CONSTRAINTS_VALUE:
        return INTER_RELATIONSHIP_CONSTRAINTS;
      case COMPARTMENT_TYPES_VALUE:
        return COMPARTMENT_TYPES;
      case COMPARTMENT_STRUCTURE_VALUE:
        return COMPARTMENT_STRUCTURE;
      case COMPARTMENT_PROPERTIES_VALUE:
        return COMPARTMENT_PROPERTIES;
      case COMPARTMENT_BEHAVIOR_VALUE:
        return COMPARTMENT_BEHAVIOR;
      case COMPARTMENT_INHERITANCE_VALUE:
        return COMPARTMENT_INHERITANCE;
      case PARTICIPANTS_VALUE:
        return PARTICIPANTS;
      case CONTAINS_COMPARTMENTS_VALUE:
        return CONTAINS_COMPARTMENTS;
      case PLAYABLE_BY_DEFINING_COMPARTMENT_VALUE:
        return PLAYABLE_BY_DEFINING_COMPARTMENT;
      case DATA_TYPES_VALUE:
        return DATA_TYPES;
      case DATA_TYPE_INHERITANCE_VALUE:
        return DATA_TYPE_INHERITANCE;
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
  private FeatureName(int value, String name, String literal) {
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

} //FeatureName
