package org.framed.orm.ui.editor;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.script.ScriptException;

import org.eclipse.emf.common.util.EList;
import org.eclipse.gef.palette.CombinedTemplateCreationEntry;
import org.eclipse.gef.palette.ConnectionCreationToolEntry;
import org.eclipse.gef.palette.CreationToolEntry;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.SelectionToolEntry;
import org.eclipse.gef.tools.SelectionTool;
import org.framed.orm.featuremodel.FRaMEDFeature;
import org.framed.orm.featuremodel.FeaturemodelFactory;
import org.framed.orm.model.Model;
import org.framed.orm.model.NamedElement;
import org.framed.orm.model.Shape;
import org.framed.orm.model.Type;
import org.framed.orm.ui.editor.ORMGraphicalEditor.EditorType;
import org.framed.orm.ui.editor.palette.CreationConstraintToolEntry;
import org.framed.orm.ui.expression.FeatureExpression;
import org.framed.orm.ui.factory.ORMAcyclicFactory;
import org.framed.orm.ui.factory.ORMCyclicFactory;
import org.framed.orm.ui.factory.ORMAttributeFactory;
import org.framed.orm.ui.factory.ORMCompartmentTypeFactory;
import org.framed.orm.ui.factory.ORMDataTypeFactory;
import org.framed.orm.ui.factory.ORMFulfillmentFactory;
import org.framed.orm.ui.factory.ORMGroupFactory;
import org.framed.orm.ui.factory.ORMInheritanceFactory;
import org.framed.orm.ui.factory.ORMIrreflexiveFactory;
import org.framed.orm.ui.factory.ORMOperationFactory;
import org.framed.orm.ui.factory.ORMNaturalTypeFactory;
import org.framed.orm.ui.factory.ORMReflexiveFactory;
import org.framed.orm.ui.factory.ORMRelationshipExclusionFactory;
import org.framed.orm.ui.factory.ORMRelationshipFactory;
import org.framed.orm.ui.factory.ORMRelationshipImplicationFactory;
import org.framed.orm.ui.factory.ORMRoleEquivalenceFactory;
import org.framed.orm.ui.factory.ORMRoleGroupFactory;
import org.framed.orm.ui.factory.ORMRoleImplicationFactory;
import org.framed.orm.ui.factory.ORMRoleProhibitionFactory;
import org.framed.orm.ui.factory.ORMRoleTypeFactory;
import org.framed.orm.ui.factory.ORMTotalFactory;
import org.framed.orm.ui.tool.CreationAndDirectEditTool;


/**
 * This class provides the palette and its entries for the {@link ORMGraphicalEditor}.
 * 
 * @author Kay Bierzynski
 * @author Marc Kandler
 * */
public class ORMGraphicalEditorPalette extends PaletteRoot {

  /** The {@link PaletteGroup} to which all {@link PaletteDrawer}s are added. */
  private PaletteGroup group;
  /** A {@link HashMap}, which contains all visibility flags of the palette entry. */
  private final Map<String, Boolean> entryVisibility;
  /** A {@link HashMap}, which matches to every palette entry a string id. */
  private final Map<String, CreationToolEntry> entries;
  
  private final Map<FeatureExpression, Set<String>> configToPaletteMapping;
  private Model rootmodel;
  
  /**
   * A {@link Set} of the names of palette elements, which are visible according to the current {@link org.framed.orm.featuremodel.FRaMEDConfiguration <em>FRaMEDConfiguration</em>}.
   */
  private Set<String> paletteElementsVisibleAccordingToConfig;

  /**
   * The constructor of this class, where the palette is build with its entries, and the entryVisibility is set.
   * 
   * @param configToPaletteMapping 
   * @param rootmodel 
   * @throws ScriptException 
   * */
  public ORMGraphicalEditorPalette(Map<FeatureExpression, Set<String>> configToPaletteMapping, Model rootmodel) throws ScriptException {
    entryVisibility = new HashMap<String, Boolean>();
    entries = new HashMap<String, CreationToolEntry>();
    
    this.configToPaletteMapping = configToPaletteMapping;
    this.rootmodel = rootmodel;
    paletteElementsVisibleAccordingToConfig = new HashSet<String>();
    
    fillpaletteElementsVisibleAccordingToConfig();
    
    addGroup();
    addSelectionTool();
    createComponentsDrawer();
    createComponentPartsDrawer();
    createConnectionsDrawer();
  }


  /**
   * This method evaluates the provided {@link FeatureExpression}s in order to determine which palette entries are to be set visible.
   * @throws ScriptException
   */
  private void fillpaletteElementsVisibleAccordingToConfig() throws ScriptException {
    paletteElementsVisibleAccordingToConfig.clear();
   // EList<FRaMEDFeature> framedFeatures = rootmodel.getFramedConfiguration().getFeatures();
    long gesamt = 0;
    for (FeatureExpression ex : configToPaletteMapping.keySet()) {
      long startTime = System.nanoTime();
      if (ex.evaluate(rootmodel.getFramedConfiguration())) {
        for (String s : configToPaletteMapping.get(ex)) {
          paletteElementsVisibleAccordingToConfig.add(s);
        }
      }
      long endTime = System.nanoTime();

      long duration = (endTime - startTime); 
      gesamt += duration;
      System.out.println(ex.toString() + ": " + duration/1000000);
    }
      System.out.println("Gesamt: " + gesamt/1000000);
//    for (FRaMEDFeature feature : rootmodel.getFramedConfiguration().getFeatures()) {
////      for (String s : configToPaletteMapping.get(feature.getName())) {
////        paletteElementsVisibleAccordingToConfig.add(s);
////      }
//      }    
  }


  /**
   * This method add a palette entry with sting id/name to the entries map.
   * */
  private void addEntry(final String name, final CreationToolEntry entry, final Boolean visibility) {
    entries.put(name, entry);
    setEntryVisibility(name, visibility);
  }

  /** This method sets the visibility of an entry in the entryVisibility map and in the palette. */
  private void setEntryVisibility(final String name, final Boolean visibility) {
    boolean wert =  paletteElementsVisibleAccordingToConfig.contains(name);
    entryVisibility.put(name, visibility && paletteElementsVisibleAccordingToConfig.contains(name));
    if (entries.size() != 0 && entries.get(name) != null) {
      entries.get(name).setVisible(visibility.booleanValue() && paletteElementsVisibleAccordingToConfig.contains(name));
    }
  }

  /**
   * A getter for the visibility of a palette entry.
   * 
   * @return boolean
   * */
  private boolean getEntryVisisbility(final String name) {
    return entryVisibility.get(name).booleanValue();
  }


  /** This method sets the visibility of all palett entrys depending on the variable visible. */
  public void setRoleEntriesVisibility(final boolean visible) {
    if (visible) {
    setEntryVisibility(PaletteEntry.ROLE_TYPE.getName(), true); //2x
    setEntryVisibility(PaletteEntry.ROLE_GROUP.getName(), true); //12x
    setEntryVisibility(PaletteEntry.ROLE_IMPLICATION.getName(), true); //4x
    setEntryVisibility(PaletteEntry.RELATIONSHIP_IMPLICATION.getName(), true);//15x
    setEntryVisibility(PaletteEntry.RELATIONSHIP_EXCLUSION.getName(), true);//19x
    setEntryVisibility(PaletteEntry.ROLE_EQUIVALENCE.getName(), true);//5x
    setEntryVisibility(PaletteEntry.ROLE_PROHIBITION.getName(), true);//11x
    setEntryVisibility(PaletteEntry.RELATIONSHIP.getName(), true);//7x
    setEntryVisibility(PaletteEntry.REFLEXIVE.getName(), true);//18x
    setEntryVisibility(PaletteEntry.IRREFLEXIVE.getName(), true);//10x
    setEntryVisibility(PaletteEntry.TOTAL.getName(), true);//8x
    setEntryVisibility(PaletteEntry.CYCLIC.getName(), true);//9x
    setEntryVisibility(PaletteEntry.ACYCLIC.getName(), true);//17x


    setEntryVisibility(PaletteEntry.COMPARTMENT.getName(), false);//0x
    setEntryVisibility(PaletteEntry.NATURAL_TYPE.getName(), false);//1x
    setEntryVisibility(PaletteEntry.DATA_TYPE.getName(), false);//3x
    setEntryVisibility(PaletteEntry.GROUP.getName(), false);//13x
    setEntryVisibility(PaletteEntry.FULFILLMENT.getName(), false);//14x
    } else {
      setEntryVisibility(PaletteEntry.ROLE_TYPE.getName(), false);
      setEntryVisibility(PaletteEntry.ROLE_GROUP.getName(), false);
      setEntryVisibility(PaletteEntry.ROLE_IMPLICATION.getName(), false);
      setEntryVisibility(PaletteEntry.RELATIONSHIP_IMPLICATION.getName(), false);
      setEntryVisibility(PaletteEntry.RELATIONSHIP_EXCLUSION.getName(), false);
      setEntryVisibility(PaletteEntry.ROLE_EQUIVALENCE.getName(), false);
      setEntryVisibility(PaletteEntry.ROLE_PROHIBITION.getName(), false);
      setEntryVisibility(PaletteEntry.RELATIONSHIP.getName(), false);
      setEntryVisibility(PaletteEntry.REFLEXIVE.getName(), false);
      setEntryVisibility(PaletteEntry.IRREFLEXIVE.getName(), false);
      setEntryVisibility(PaletteEntry.TOTAL.getName(), false);
      setEntryVisibility(PaletteEntry.CYCLIC.getName(), false);
      setEntryVisibility(PaletteEntry.ACYCLIC.getName(), false);

      setEntryVisibility(PaletteEntry.COMPARTMENT.getName(), true);
      setEntryVisibility(PaletteEntry.NATURAL_TYPE.getName(), true);
      setEntryVisibility(PaletteEntry.DATA_TYPE.getName(), true);
      setEntryVisibility(PaletteEntry.GROUP.getName(), true);
      setEntryVisibility(PaletteEntry.FULFILLMENT.getName(), true);
    }
    //We need to set them true here, so these entries can be checked by the setEntryVisibility method against the 
    //configuration-evaluation results
    setEntryVisibility(PaletteEntry.ATTRIBUTE.getName(), true);
    setEntryVisibility(PaletteEntry.OPERATION.getName(), true);
    setEntryVisibility(PaletteEntry.INHERITANCE.getName(), true);
    System.out.println("------------ Ende1 SetRolesEntryVisibility----------");
    for (CreationToolEntry c : entries.values())
      System.out.println(c.getLabel()+" visible: "+ c.isVisible());
    System.out.println("------------ Ende1 SetRolesEntryVisibility----------");
  }


  /** This method updates the visibility of the all palette entries
   *  according to the current configuration.
   **/
  public void update(final ORMGraphicalEditor.EditorType type) {
    try {
      fillpaletteElementsVisibleAccordingToConfig();
    } catch (ScriptException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    if (type.equals(EditorType.COMPARTMENT)) {
      setRoleEntriesVisibility(false);
    } else {
      setRoleEntriesVisibility(true);
    }
  }

  /** ! Update function for EditorChangeNotifier 
   *   This method updates the visibility of the all palette entries
   *  according to the current configuration.
   **/
  public void update(final String type) {
    try {
      fillpaletteElementsVisibleAccordingToConfig();
    } catch (ScriptException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    if (type.equals("StepOutNewPage")) {
      setRoleEntriesVisibility(false);
    }
  }

  /** This method add the {@link SelectionTool} to the palette. */
  private void addSelectionTool() {
    SelectionToolEntry entry = new SelectionToolEntry();
    group.add(entry);
    setDefaultEntry(entry);
  }

  /** This method initializes the {@link PaletteGroup} and adds the group to the palett. */
  private void addGroup() {
    group = new PaletteGroup("Framed Controls");
    add(group);
  }

  /**
   * This method creates the palette entries for the creation of all {@link Shape} kinds and adds them
   * to palette.
   */
  private void createComponentsDrawer() {
    PaletteDrawer drawer = new PaletteDrawer("Componenten");

    /*
     * CreationToolEntry entry = new CreationToolEntry("Compartment", "Create a new Compartment",
     * new ORMCompartmentTypeFactory(), null, null);
     */
    CombinedTemplateCreationEntry entry =
        new CombinedTemplateCreationEntry(PaletteEntry.COMPARTMENT.getName(), "Create a new Compartment",
            new ORMCompartmentTypeFactory(), null, null);
    entry.setToolClass(CreationAndDirectEditTool.class);
    entry.setSmallIcon(Activator.imageDescriptorFromPlugin(Activator.PLUGIN_ID,
        "icons/compartment.png"));
    drawer.add(entry);
    addEntry(PaletteEntry.COMPARTMENT.getName(), entry, true);

    entry =
        new CombinedTemplateCreationEntry(PaletteEntry.NATURAL_TYPE.getName(), "Create a new NaturalType",
            new ORMNaturalTypeFactory(), null, null);
    entry.setToolClass(CreationAndDirectEditTool.class);
    entry.setSmallIcon(Activator.imageDescriptorFromPlugin(Activator.PLUGIN_ID,
        "icons/naturaltype.png"));
    drawer.add(entry);
    addEntry(PaletteEntry.NATURAL_TYPE.getName(), entry, true);

    entry =
        new CombinedTemplateCreationEntry(PaletteEntry.DATA_TYPE.getName(), "Create a new DataType",
            new ORMDataTypeFactory(), null, null);
    entry.setToolClass(CreationAndDirectEditTool.class);
    entry.setSmallIcon(Activator.imageDescriptorFromPlugin(Activator.PLUGIN_ID,
        "icons/datatype.png"));
    drawer.add(entry);
    addEntry(PaletteEntry.DATA_TYPE.getName(), entry, true);

    entry =
        new CombinedTemplateCreationEntry(PaletteEntry.ROLE_TYPE.getName(), "Create a new RoleType",
            new ORMRoleTypeFactory(), null, null);
    entry.setToolClass(CreationAndDirectEditTool.class);
    entry.setSmallIcon(Activator.imageDescriptorFromPlugin(Activator.PLUGIN_ID,
        "icons/roletype.png"));
    drawer.add(entry);
    addEntry(PaletteEntry.ROLE_TYPE.getName(), entry, false);

    entry =
        new CombinedTemplateCreationEntry(PaletteEntry.ROLE_GROUP.getName(), "Create a new RoleGroup",
            new ORMRoleGroupFactory(), null, null);
    entry.setToolClass(CreationAndDirectEditTool.class);
    entry.setSmallIcon(Activator.imageDescriptorFromPlugin(Activator.PLUGIN_ID,
        "icons/rolegroup.png"));
    drawer.add(entry);
    addEntry(PaletteEntry.ROLE_GROUP.getName(), entry, false);

    entry =
        new CombinedTemplateCreationEntry(PaletteEntry.GROUP.getName(), "Create a new Group", new ORMGroupFactory(),
            null, null);
    entry.setToolClass(CreationAndDirectEditTool.class);
    entry.setSmallIcon(Activator.imageDescriptorFromPlugin(Activator.PLUGIN_ID, "icons/group.png"));
    drawer.add(entry);
    addEntry(PaletteEntry.GROUP.getName(), entry, true);

    group.add(drawer);
  }


  /**
   * This method creates the palett entrys for the creation of {@link NamedElement}s (Attributes and
   * Operations) and adds them to palett.
   */
  private void createComponentPartsDrawer() {

    PaletteDrawer drawer = new PaletteDrawer("Parts");

    CreationToolEntry entry1 =
        new CreationToolEntry(PaletteEntry.OPERATION.getName(), "Create a new Operation", new ORMOperationFactory(),
            null, null);
    entry1.setToolClass(CreationAndDirectEditTool.class);
    entry1.setSmallIcon(Activator.imageDescriptorFromPlugin(Activator.PLUGIN_ID,
        "icons/EOperation.gif"));
    drawer.add(entry1);
    addEntry(PaletteEntry.OPERATION.getName(), entry1, true);

    CreationToolEntry entry2 =
        new CreationToolEntry(PaletteEntry.ATTRIBUTE.getName(), "Create a new Attribute", new ORMAttributeFactory(),
            null, null);
    entry2.setToolClass(CreationAndDirectEditTool.class);
    entry2.setSmallIcon(Activator.imageDescriptorFromPlugin(Activator.PLUGIN_ID,
        "icons/EAttribute.gif"));
    drawer.add(entry2);
    addEntry(PaletteEntry.ATTRIBUTE.getName(), entry2, true);

    group.add(drawer);
  }

  /**
   * This method creates the palette entries for the creation of all {@link Relation} kinds and adds
   * them to palette.
   */
  private void createConnectionsDrawer() {

    PaletteDrawer drawer = new PaletteDrawer("Connections");
    CreationToolEntry entry1 =
        new ConnectionCreationToolEntry(PaletteEntry.FULFILLMENT.getName(), "Create a new Fulfillment Relation",
            new ORMFulfillmentFactory(), null, null);
    entry1.setSmallIcon(Activator.imageDescriptorFromPlugin(Activator.PLUGIN_ID,
        "icons/fulfilment.png"));
    drawer.add(entry1);
    addEntry(PaletteEntry.FULFILLMENT.getName(), entry1, true);

    CreationToolEntry entry2 =
        new ConnectionCreationToolEntry(PaletteEntry.ROLE_IMPLICATION.getName(),
            "Create a new Role Implication Relation", new ORMRoleImplicationFactory(), null, null);
    entry2.setSmallIcon(Activator.imageDescriptorFromPlugin(Activator.PLUGIN_ID,
        "icons/roleimplication.png"));
    drawer.add(entry2);
    addEntry(PaletteEntry.ROLE_IMPLICATION.getName(), entry2, false);

    CreationToolEntry entry3 =
        new ConnectionCreationToolEntry(PaletteEntry.ROLE_EQUIVALENCE.getName(),
            "Create a new Role Equivalence Relation", new ORMRoleEquivalenceFactory(), null, null);
    entry3.setSmallIcon(Activator.imageDescriptorFromPlugin(Activator.PLUGIN_ID,
        "icons/roleequivalence.png"));
    drawer.add(entry3);
    addEntry(PaletteEntry.ROLE_EQUIVALENCE.getName(), entry3, false);

    CreationToolEntry entry4 =
        new ConnectionCreationToolEntry(PaletteEntry.ROLE_PROHIBITION.getName(),
            "Create a new Role Prohibition Relation", new ORMRoleProhibitionFactory(), null, null);
    entry4.setSmallIcon(Activator.imageDescriptorFromPlugin(Activator.PLUGIN_ID,
        "icons/roleprohibition.png"));
    drawer.add(entry4);
    addEntry(PaletteEntry.ROLE_PROHIBITION.getName(), entry4, false);

    CreationToolEntry entry5 =
        new ConnectionCreationToolEntry(PaletteEntry.INHERITANCE.getName(), "Create a new Inheritance Relation",
            new ORMInheritanceFactory(), null, null);
    entry5.setSmallIcon(Activator.imageDescriptorFromPlugin(Activator.PLUGIN_ID,
        "icons/inheritance.png"));
    drawer.add(entry5);
    addEntry(PaletteEntry.INHERITANCE.getName(), entry5, true);

    CreationToolEntry entry6 =
        new ConnectionCreationToolEntry(PaletteEntry.RELATIONSHIP.getName(), "Create a new Relationship Relation",
            new ORMRelationshipFactory(), null, null);
    entry6.setSmallIcon(Activator.imageDescriptorFromPlugin(Activator.PLUGIN_ID,
        "icons/relationship.png"));
    drawer.add(entry6);
    addEntry(PaletteEntry.RELATIONSHIP.getName(), entry6, false);

    CreationToolEntry entry7 =
        new ConnectionCreationToolEntry(PaletteEntry.RELATIONSHIP_IMPLICATION.getName(),
            "Create a new Relationship Implication Relation",
            new ORMRelationshipImplicationFactory(), null, null);
    entry7.setSmallIcon(Activator.imageDescriptorFromPlugin(Activator.PLUGIN_ID,
        "icons/relationshipimplication.png"));
    drawer.add(entry7);
    addEntry(PaletteEntry.RELATIONSHIP_IMPLICATION.getName(), entry7, false);

    CreationToolEntry entry13 =
        new ConnectionCreationToolEntry(PaletteEntry.RELATIONSHIP_EXCLUSION.getName(),
            "Create a new Relationship Exclusion Relation", new ORMRelationshipExclusionFactory(),
            null, null);
    // TODO: create new icon for relationship exclusion relation
    entry13.setSmallIcon(Activator.imageDescriptorFromPlugin(Activator.PLUGIN_ID,
        "icons/relationshipprohibition.png"));
    drawer.add(entry13);
    addEntry(PaletteEntry.RELATIONSHIP_EXCLUSION.getName(), entry13, false);

    CreationConstraintToolEntry entry =
        new CreationConstraintToolEntry(PaletteEntry.REFLEXIVE.getName(), "Create a new Reflexive Relation",
            new ORMReflexiveFactory(), null, null, Type.REFLEXIVE_VALUE);
    // TODO: create new icon for reflexive relation
    entry.setSmallIcon(Activator.imageDescriptorFromPlugin(Activator.PLUGIN_ID,
        "icons/reflexive.png"));
    drawer.add(entry);
    addEntry(PaletteEntry.REFLEXIVE.getName(), entry, false);

    entry =
        new CreationConstraintToolEntry(PaletteEntry.IRREFLEXIVE.getName(), "Create a new Irreflexive Relation",
            new ORMIrreflexiveFactory(), null, null, Type.IRREFLEXIVE_VALUE);
    entry.setSmallIcon(Activator.imageDescriptorFromPlugin(Activator.PLUGIN_ID,
        "icons/irreflexive.png"));
    drawer.add(entry);
    addEntry(PaletteEntry.IRREFLEXIVE.getName(), entry, false);

    entry =
        new CreationConstraintToolEntry(PaletteEntry.TOTAL.getName(), "Create a new Total Relation",
            new ORMTotalFactory(), null, null, Type.TOTAL_VALUE);
    entry.setSmallIcon(Activator.imageDescriptorFromPlugin(Activator.PLUGIN_ID, "icons/total.png"));
    drawer.add(entry);
    addEntry(PaletteEntry.TOTAL.getName(), entry, false);

    entry =
        new CreationConstraintToolEntry(PaletteEntry.CYCLIC.getName(), "Create a new Cyclic Relation",
            new ORMCyclicFactory(), null, null, Type.CYCLIC_VALUE);
    entry
        .setSmallIcon(Activator.imageDescriptorFromPlugin(Activator.PLUGIN_ID, "icons/cyclic.png"));
    drawer.add(entry);
    addEntry(PaletteEntry.CYCLIC.getName(), entry, false);

    entry =
        new CreationConstraintToolEntry(PaletteEntry.ACYCLIC.getName(), "Create a new Acyclic Relation",
            new ORMAcyclicFactory(), null, null, Type.ACYCLIC_VALUE);
    // TODO: create new icon for acyclic relation
    entry.setSmallIcon(Activator
        .imageDescriptorFromPlugin(Activator.PLUGIN_ID, "icons/acyclic.png"));
    drawer.add(entry);
    addEntry(PaletteEntry.ACYCLIC.getName(), entry, false);

    // Currently Entry 1 to 13
    group.add(drawer);
  }
}
