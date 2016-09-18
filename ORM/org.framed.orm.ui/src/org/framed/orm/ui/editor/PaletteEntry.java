package org.framed.orm.ui.editor;

/**
 * An enum representing the names of all Palette Entries
 * @author Marc Kandler
 *
 */
public enum PaletteEntry {

  ROLE_TYPE ("RoleType"),
  ROLE_GROUP ("RoleGroup"),
  ROLE_IMPLICATION ("Role Implication"),
  RELATIONSHIP_IMPLICATION ("Relationship Implication"),
  RELATIONSHIP_EXCLUSION ("Relationship Exclusion"),
  ROLE_EQUIVALENCE ("Role Equivalence"),
  ROLE_PROHIBITION ("Role Prohibition"),
  RELATIONSHIP ("Relationship"),
  REFLEXIVE ("Reflexive"),
  IRREFLEXIVE ("Irreflexive"),
  TOTAL ("Total"),
  CYCLIC ("Cyclic"),
  ACYCLIC ("Acyclic"),
  COMPARTMENT ("Compartment"),
  NATURAL_TYPE ("Natural Type"),
  DATA_TYPE ("Data_Type"),
  GROUP ("Group"),
  FULFILLMENT ("Fulfillment"),
  OPERATION ("Operation"),
  ATTRIBUTE ("Attribute"),
  INHERITANCE ("Inheritance");
  
  private String name;
  
  PaletteEntry(String name) {
    this.name = name;
  }
  
  public String getName() {
    return name;
  }
  
  @Override
  public String toString() {
    return name;
  }
}

