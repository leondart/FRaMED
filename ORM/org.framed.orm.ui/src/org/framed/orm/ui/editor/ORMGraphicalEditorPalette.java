package org.framed.orm.ui.editor;


import java.util.HashMap;
import java.util.Map;

import javax.script.ScriptException;

import org.eclipse.gef.palette.CombinedTemplateCreationEntry;
import org.eclipse.gef.palette.ConnectionCreationToolEntry;
import org.eclipse.gef.palette.CreationToolEntry;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.SelectionToolEntry;
import org.eclipse.gef.tools.SelectionTool;
import org.framed.orm.featuremodel.FRaMEDConfiguration;
import org.framed.orm.model.Model;
import org.framed.orm.model.NamedElement;
import org.framed.orm.model.Relation;
import org.framed.orm.model.Shape;
import org.framed.orm.model.Type;
import org.framed.orm.ui.editor.ORMGraphicalEditor.EditorType;
import org.framed.orm.ui.editor.palette.CreationConstraintToolEntry;
import org.framed.orm.ui.expression.FeatureExpression;
import org.framed.orm.ui.factory.ORMAcyclicFactory;
import org.framed.orm.ui.factory.ORMAttributeFactory;
import org.framed.orm.ui.factory.ORMCompartmentTypeFactory;
import org.framed.orm.ui.factory.ORMCyclicFactory;
import org.framed.orm.ui.factory.ORMDataTypeFactory;
import org.framed.orm.ui.factory.ORMFulfillmentFactory;
import org.framed.orm.ui.factory.ORMGroupFactory;
import org.framed.orm.ui.factory.ORMInheritanceFactory;
import org.framed.orm.ui.factory.ORMIrreflexiveFactory;
import org.framed.orm.ui.factory.ORMNaturalTypeFactory;
import org.framed.orm.ui.factory.ORMOperationFactory;
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
  /** A {@link HashMap}, which contains all visibility flags of the palette entries. */
  private final Map<String, Boolean> entryVisibility;
  /** A {@link HashMap}, which matches to every palette entry a string id. */
  private final Map<PaletteEntry, CreationToolEntry> entries;

  /**
   * The model of the currently used file.
   * 
   */
  private Model rootmodel;

  /**
   * In this editor only used to pass on as parameter.
   * A Map to store the Palette Entries (Key) and the respective {@link FeatureExpression} which has to be evaluated to true
   * for the entry to be visible in the step-OUT perspective.
   */
  private Map<PaletteEntry, FeatureExpression> stepOUTPaletteVisibility;

  /**
   * In this editor only used to pass on as parameter.
   * A Map to store the Palette Entries (Key) and the respective {@link FeatureExpression} which has to be evaluated to true
   * for the entry to be visible in the step-IN perspective.
   */
  private Map<PaletteEntry, FeatureExpression> stepINPaletteVisibility;

  /**
  * This palette belongs to a {@link ORMGraphicalEditor} and represents the palette of possible editor elements to choose from.
  * In this constructor all Palette Entries are created and the visibility of the palette elements is set according to the configuration.
  * 
  * @param stepOUTPaletteVisibility Pre-filled map with the Palette Entry and the {@link FeatureExpression} which makes this entry visible in the editor in the step-OUT state. 
  * @param stepINPaletteVisibility Pre-filled map with the Palette Entry and the {@link FeatureExpression} which makes this entry visible in the editor in the step-IN state.
  * @param rootmodel
  * @throws ScriptException
  */
  public ORMGraphicalEditorPalette(Map<PaletteEntry, FeatureExpression> stepOUTPaletteVisibility,
      Map<PaletteEntry, FeatureExpression> stepINPaletteVisibility, Model rootmodel)
      throws ScriptException {
    entryVisibility = new HashMap<String, Boolean>();
    entries = new HashMap<PaletteEntry, CreationToolEntry>();

    this.stepOUTPaletteVisibility = stepOUTPaletteVisibility;
    this.stepINPaletteVisibility = stepINPaletteVisibility;
    this.rootmodel = rootmodel;

    setPaletteEntriesVisibility(true);

    addGroup();
    addSelectionTool();
    createComponentsDrawer();
    createComponentPartsDrawer();
    createConnectionsDrawer();
  }

  /**
   * This method add a palette entry with sting id/name to the entries map.
   * */
  private void addEntry(final PaletteEntry paletteEntry, final CreationToolEntry entry,
      final Boolean visibility) {
    entries.put(paletteEntry, entry);
  }

  /**
   * A getter for the visibility of a palette entry.
   * 
   * @return boolean
   * */
  private boolean getEntryVisisbility(final String name) {
    return entryVisibility.get(name).booleanValue();
  }

  /**
   * This method sets the visibility of the palette entries according to the current configuration as well as the state of the editor
   * (step-IN vs. step-OUT).
   * 
   * @param topLevelPage True if the current state of the editor is the step-OUT view. Otherwise false.
   */
  public void setPaletteEntriesVisibility(final boolean topLevelPage) {
    Map<PaletteEntry, FeatureExpression> mapToUse = new HashMap<PaletteEntry, FeatureExpression>();
    // At this point we decide which of the two maps we are going to use
    mapToUse = topLevelPage ? stepOUTPaletteVisibility : stepINPaletteVisibility;
    FRaMEDConfiguration fRaMEDConfiguration = rootmodel.getFramedConfiguration();

    // Go through all palette entries
    for (PaletteEntry paletteEntry : entries.keySet()) {
      // if the current palette entry is not in the map which we use to determine visibility (i.e.
      // it is never visible)
      if (!mapToUse.containsKey(paletteEntry)) {
        // set this entry's visibility to false
        entryVisibility.put(paletteEntry.getName(), false);
        if (entries.size() != 0 && entries.get(paletteEntry) != null) {
          entries.get(paletteEntry).setVisible(false);
        }
      } else {
        // if the current palette entry IS in the visibility map, we have to evaluate the
        // corresponding expression
        FeatureExpression expression = mapToUse.get(paletteEntry);
        boolean visibility = false;
        try {
          visibility = expression.evaluate(fRaMEDConfiguration);
        } catch (ScriptException e) {
          // TODO Auto-generated catch block
          e.printStackTrace();
        }
        entryVisibility.put(paletteEntry.getName(), visibility);
        if (entries.size() != 0 && entries.get(paletteEntry) != null) {
          entries.get(paletteEntry).setVisible(visibility);
        }
      }
    }
  }


  /** This method updates the visibility of the all palette entries
   *  according to the current configuration.
   **/
  public void update(final ORMGraphicalEditor.EditorType type) {
    if (type.equals(EditorType.COMPARTMENT)) {
      setPaletteEntriesVisibility(true);
    } else {
      setPaletteEntriesVisibility(false);
    }
  }

  /** ! Update function for EditorChangeNotifier 
   *   This method updates the visibility of the all palette entries
   *  according to the current configuration.
   **/
  public void update(final String type) {
    if (type.equals("StepOutNewPage")) {
      setPaletteEntriesVisibility(true);
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
        new CombinedTemplateCreationEntry(PaletteEntry.COMPARTMENT.getName(),
            "Create a new Compartment", new ORMCompartmentTypeFactory(), null, null);
    entry.setToolClass(CreationAndDirectEditTool.class);
    entry.setSmallIcon(Activator.imageDescriptorFromPlugin(Activator.PLUGIN_ID,
        "icons/compartment.png"));
    drawer.add(entry);
    addEntry(PaletteEntry.COMPARTMENT, entry, true);

    entry =
        new CombinedTemplateCreationEntry(PaletteEntry.NATURAL_TYPE.getName(),
            "Create a new NaturalType", new ORMNaturalTypeFactory(), null, null);
    entry.setToolClass(CreationAndDirectEditTool.class);
    entry.setSmallIcon(Activator.imageDescriptorFromPlugin(Activator.PLUGIN_ID,
        "icons/naturaltype.png"));
    drawer.add(entry);
    addEntry(PaletteEntry.NATURAL_TYPE, entry, true);

    entry =
        new CombinedTemplateCreationEntry(PaletteEntry.DATA_TYPE.getName(),
            "Create a new DataType", new ORMDataTypeFactory(), null, null);
    entry.setToolClass(CreationAndDirectEditTool.class);
    entry.setSmallIcon(Activator.imageDescriptorFromPlugin(Activator.PLUGIN_ID,
        "icons/datatype.png"));
    drawer.add(entry);
    addEntry(PaletteEntry.DATA_TYPE, entry, true);

    entry =
        new CombinedTemplateCreationEntry(PaletteEntry.ROLE_TYPE.getName(),
            "Create a new RoleType", new ORMRoleTypeFactory(), null, null);
    entry.setToolClass(CreationAndDirectEditTool.class);
    entry.setSmallIcon(Activator.imageDescriptorFromPlugin(Activator.PLUGIN_ID,
        "icons/roletype.png"));
    drawer.add(entry);
    addEntry(PaletteEntry.ROLE_TYPE, entry, false);

    entry =
        new CombinedTemplateCreationEntry(PaletteEntry.ROLE_GROUP.getName(),
            "Create a new RoleGroup", new ORMRoleGroupFactory(), null, null);
    entry.setToolClass(CreationAndDirectEditTool.class);
    entry.setSmallIcon(Activator.imageDescriptorFromPlugin(Activator.PLUGIN_ID,
        "icons/rolegroup.png"));
    drawer.add(entry);
    addEntry(PaletteEntry.ROLE_GROUP, entry, false);

    entry =
        new CombinedTemplateCreationEntry(PaletteEntry.GROUP.getName(), "Create a new Group",
            new ORMGroupFactory(), null, null);
    entry.setToolClass(CreationAndDirectEditTool.class);
    entry.setSmallIcon(Activator.imageDescriptorFromPlugin(Activator.PLUGIN_ID, "icons/group.png"));
    drawer.add(entry);
    addEntry(PaletteEntry.GROUP, entry, true);

    group.add(drawer);
  }


  /**
   * This method creates the palett entrys for the creation of {@link NamedElement}s (Attributes and
   * Operations) and adds them to palett.
   */
  private void createComponentPartsDrawer() {

    PaletteDrawer drawer = new PaletteDrawer("Parts");

    CreationToolEntry entry1 =
        new CreationToolEntry(PaletteEntry.OPERATION.getName(), "Create a new Operation",
            new ORMOperationFactory(), null, null);
    entry1.setToolClass(CreationAndDirectEditTool.class);
    entry1.setSmallIcon(Activator.imageDescriptorFromPlugin(Activator.PLUGIN_ID,
        "icons/EOperation.gif"));
    drawer.add(entry1);
    addEntry(PaletteEntry.OPERATION, entry1, true);

    CreationToolEntry entry2 =
        new CreationToolEntry(PaletteEntry.ATTRIBUTE.getName(), "Create a new Attribute",
            new ORMAttributeFactory(), null, null);
    entry2.setToolClass(CreationAndDirectEditTool.class);
    entry2.setSmallIcon(Activator.imageDescriptorFromPlugin(Activator.PLUGIN_ID,
        "icons/EAttribute.gif"));
    drawer.add(entry2);
    addEntry(PaletteEntry.ATTRIBUTE, entry2, true);

    group.add(drawer);
  }

  /**
   * This method creates the palette entries for the creation of all {@link Relation} kinds and adds
   * them to palette.
   */
  private void createConnectionsDrawer() {

    PaletteDrawer drawer = new PaletteDrawer("Connections");
    CreationToolEntry entry1 =
        new ConnectionCreationToolEntry(PaletteEntry.FULFILLMENT.getName(),
            "Create a new Fulfillment Relation", new ORMFulfillmentFactory(), null, null);
    entry1.setSmallIcon(Activator.imageDescriptorFromPlugin(Activator.PLUGIN_ID,
        "icons/fulfilment.png"));
    drawer.add(entry1);
    addEntry(PaletteEntry.FULFILLMENT, entry1, true);

    CreationToolEntry entry2 =
        new ConnectionCreationToolEntry(PaletteEntry.ROLE_IMPLICATION.getName(),
            "Create a new Role Implication Relation", new ORMRoleImplicationFactory(), null, null);
    entry2.setSmallIcon(Activator.imageDescriptorFromPlugin(Activator.PLUGIN_ID,
        "icons/roleimplication.png"));
    drawer.add(entry2);
    addEntry(PaletteEntry.ROLE_IMPLICATION, entry2, false);

    CreationToolEntry entry3 =
        new ConnectionCreationToolEntry(PaletteEntry.ROLE_EQUIVALENCE.getName(),
            "Create a new Role Equivalence Relation", new ORMRoleEquivalenceFactory(), null, null);
    entry3.setSmallIcon(Activator.imageDescriptorFromPlugin(Activator.PLUGIN_ID,
        "icons/roleequivalence.png"));
    drawer.add(entry3);
    addEntry(PaletteEntry.ROLE_EQUIVALENCE, entry3, false);

    CreationToolEntry entry4 =
        new ConnectionCreationToolEntry(PaletteEntry.ROLE_PROHIBITION.getName(),
            "Create a new Role Prohibition Relation", new ORMRoleProhibitionFactory(), null, null);
    entry4.setSmallIcon(Activator.imageDescriptorFromPlugin(Activator.PLUGIN_ID,
        "icons/roleprohibition.png"));
    drawer.add(entry4);
    addEntry(PaletteEntry.ROLE_PROHIBITION, entry4, false);

    CreationToolEntry entry5 =
        new ConnectionCreationToolEntry(PaletteEntry.INHERITANCE.getName(),
            "Create a new Inheritance Relation", new ORMInheritanceFactory(), null, null);
    entry5.setSmallIcon(Activator.imageDescriptorFromPlugin(Activator.PLUGIN_ID,
        "icons/inheritance.png"));
    drawer.add(entry5);
    addEntry(PaletteEntry.INHERITANCE, entry5, true);

    CreationToolEntry entry6 =
        new ConnectionCreationToolEntry(PaletteEntry.RELATIONSHIP.getName(),
            "Create a new Relationship Relation", new ORMRelationshipFactory(), null, null);
    entry6.setSmallIcon(Activator.imageDescriptorFromPlugin(Activator.PLUGIN_ID,
        "icons/relationship.png"));
    drawer.add(entry6);
    addEntry(PaletteEntry.RELATIONSHIP, entry6, false);

    CreationToolEntry entry7 =
        new ConnectionCreationToolEntry(PaletteEntry.RELATIONSHIP_IMPLICATION.getName(),
            "Create a new Relationship Implication Relation",
            new ORMRelationshipImplicationFactory(), null, null);
    entry7.setSmallIcon(Activator.imageDescriptorFromPlugin(Activator.PLUGIN_ID,
        "icons/relationshipimplication.png"));
    drawer.add(entry7);
    addEntry(PaletteEntry.RELATIONSHIP_IMPLICATION, entry7, false);

    CreationToolEntry entry13 =
        new ConnectionCreationToolEntry(PaletteEntry.RELATIONSHIP_EXCLUSION.getName(),
            "Create a new Relationship Exclusion Relation", new ORMRelationshipExclusionFactory(),
            null, null);
    // TODO: create new icon for relationship exclusion relation
    entry13.setSmallIcon(Activator.imageDescriptorFromPlugin(Activator.PLUGIN_ID,
        "icons/relationshipprohibition.png"));
    drawer.add(entry13);
    addEntry(PaletteEntry.RELATIONSHIP_EXCLUSION, entry13, false);

    CreationConstraintToolEntry entry =
        new CreationConstraintToolEntry(PaletteEntry.REFLEXIVE.getName(),
            "Create a new Reflexive Relation", new ORMReflexiveFactory(), null, null,
            Type.REFLEXIVE_VALUE);
    // TODO: create new icon for reflexive relation
    entry.setSmallIcon(Activator.imageDescriptorFromPlugin(Activator.PLUGIN_ID,
        "icons/reflexive.png"));
    drawer.add(entry);
    addEntry(PaletteEntry.REFLEXIVE, entry, false);

    entry =
        new CreationConstraintToolEntry(PaletteEntry.IRREFLEXIVE.getName(),
            "Create a new Irreflexive Relation", new ORMIrreflexiveFactory(), null, null,
            Type.IRREFLEXIVE_VALUE);
    entry.setSmallIcon(Activator.imageDescriptorFromPlugin(Activator.PLUGIN_ID,
        "icons/irreflexive.png"));
    drawer.add(entry);
    addEntry(PaletteEntry.IRREFLEXIVE, entry, false);

    entry =
        new CreationConstraintToolEntry(PaletteEntry.TOTAL.getName(),
            "Create a new Total Relation", new ORMTotalFactory(), null, null, Type.TOTAL_VALUE);
    entry.setSmallIcon(Activator.imageDescriptorFromPlugin(Activator.PLUGIN_ID, "icons/total.png"));
    drawer.add(entry);
    addEntry(PaletteEntry.TOTAL, entry, false);

    entry =
        new CreationConstraintToolEntry(PaletteEntry.CYCLIC.getName(),
            "Create a new Cyclic Relation", new ORMCyclicFactory(), null, null, Type.CYCLIC_VALUE);
    entry
        .setSmallIcon(Activator.imageDescriptorFromPlugin(Activator.PLUGIN_ID, "icons/cyclic.png"));
    drawer.add(entry);
    addEntry(PaletteEntry.CYCLIC, entry, false);

    entry =
        new CreationConstraintToolEntry(PaletteEntry.ACYCLIC.getName(),
            "Create a new Acyclic Relation", new ORMAcyclicFactory(), null, null,
            Type.ACYCLIC_VALUE);
    // TODO: create new icon for acyclic relation
    entry.setSmallIcon(Activator
        .imageDescriptorFromPlugin(Activator.PLUGIN_ID, "icons/acyclic.png"));
    drawer.add(entry);
    addEntry(PaletteEntry.ACYCLIC, entry, false);

    // Currently Entry 1 to 13
    group.add(drawer);
  }
}
