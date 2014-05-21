package org.framed.orm.ui.editor;


import java.util.HashMap;
import java.util.Map;

import org.eclipse.gef.palette.ConnectionCreationToolEntry;
import org.eclipse.gef.palette.CreationToolEntry;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.SelectionToolEntry;
import org.eclipse.jface.resource.ImageDescriptor;
import org.framed.orm.ui.editor.ORMGraphicalEditor.EditorType;
import org.framed.orm.ui.factory.ORMAcyclicFactory;
import org.framed.orm.ui.factory.ORMAttributeFactory;
import org.framed.orm.ui.factory.ORMCompartmentFactory;
import org.framed.orm.ui.factory.ORMFulfilmentFactory;
import org.framed.orm.ui.factory.ORMGroupingFactory;
import org.framed.orm.ui.factory.ORMInheritanceFactory;
import org.framed.orm.ui.factory.ORMIrreflexiveFactory;
import org.framed.orm.ui.factory.ORMMethodeFactory;
import org.framed.orm.ui.factory.ORMNaturalTypeFactory;
import org.framed.orm.ui.factory.ORMRelationshipFactory;
import org.framed.orm.ui.factory.ORMRoleEquivalenceFactory;
import org.framed.orm.ui.factory.ORMRoleGroupFactory;
import org.framed.orm.ui.factory.ORMRoleImplicationFactory;
import org.framed.orm.ui.factory.ORMRoleProhibitionFactory;
import org.framed.orm.ui.factory.ORMRoleTypeFactory;
import org.framed.orm.ui.factory.ORMTotalFactory;
import org.framed.orm.ui.tool.CreationAndDirectEditTool;


/**
 * @author Kay Bierzynski
 * */
public class ORMGraphicalEditorPalette extends PaletteRoot {

  PaletteGroup group;

  // private boolean RoleTypeVisible = false;
  private Map<String, Boolean> entryVisibility = new HashMap<String, Boolean>();
  private Map<String, CreationToolEntry> entries = new HashMap<String, CreationToolEntry>();

  public ORMGraphicalEditorPalette() {

    addGroup();
    addSelectionTool();
    createComponentsDrawer();
    createComponentPartsDrawer();
    createConnectionsDrawer();
    
//    EditorChangeNotifier.instance().register(this); // get notified when changes in the editor occur
  }

  /* adds a palette entry to the maps */
  private void addEntry(String name, CreationToolEntry entry, Boolean visibility) {
    entries.put(name, entry);
    setEntryVisibility(name, visibility);
  }

  /* sets the visibility of an entry in the map and in the palette */
  private void setEntryVisibility(String name, Boolean visibility) {
    entryVisibility.put(name, visibility);
    entries.get(name).setVisible(visibility.booleanValue());
  }

  private boolean getEntryVisisbility(String name) {
    return entryVisibility.get(name).booleanValue();
  }

//  @Override
//  public boolean equals(Object other) {
//    return this.getClass().equals(other.getClass());
//  }

  public void setRoleEntriesVisibility(boolean visible){
    if(visible){
      setEntryVisibility("RoleType", true);
      setEntryVisibility("RoleGroup", true);
      setEntryVisibility("Role Implication", true);
      setEntryVisibility("Role Equivalence", true);
      setEntryVisibility("Role Prohibition", true);
      setEntryVisibility("Relationship", true);
      setEntryVisibility("Irreflexive", true);
      setEntryVisibility("Total", true);
      setEntryVisibility("Acyclic", true);

      setEntryVisibility("Compartment", false);
      setEntryVisibility("NaturalType", false);
      setEntryVisibility("Group", false);
      setEntryVisibility("Fulfilment", false);
    }else{
      setEntryVisibility("RoleType", false);
      setEntryVisibility("RoleGroup", false);
      setEntryVisibility("Role Implication", false);
      setEntryVisibility("Role Equivalence", false);
      setEntryVisibility("Role Prohibition", false);
      setEntryVisibility("Relationship", false);
      setEntryVisibility("Irreflexive", false);
      setEntryVisibility("Total", false);
      setEntryVisibility("Acyclic", false);

      setEntryVisibility("Compartment", true);
      setEntryVisibility("NaturalType", true);
      setEntryVisibility("Group", true);
      setEntryVisibility("Fulfilment", true);
    }
  }
  
  
  
  public void update(ORMGraphicalEditor.EditorType type){
    if(type.equals(EditorType.COMPARTMENT))
      setRoleEntriesVisibility(false);
    else
      setRoleEntriesVisibility(true);
  }
  
  // ! Update function for EditorChangeNotifier
  public void update(String type) {
//    System.out.println("Update "+type);
//    if (type.equals("StepInNewPage"))
//      setRoleEntriesVisibility(true);
    /*else*/ if(type.equals("StepOutNewPage"))
      setRoleEntriesVisibility(false);
  }

  private void addSelectionTool() {
    SelectionToolEntry entry = new SelectionToolEntry();
    group.add(entry);
    setDefaultEntry(entry);
  }

  private void addGroup() {
    group = new PaletteGroup("Framed Controls");
    add(group);
  }
  
  private void createComponentsDrawer() {
    PaletteDrawer drawer = new PaletteDrawer("Componenten");
    CreationToolEntry entry =
        new CreationToolEntry("Compartment", "Create a new Compartment",
            new ORMCompartmentFactory(), null, null);
    entry.setToolClass(CreationAndDirectEditTool.class);
    entry.setSmallIcon(Activator.imageDescriptorFromPlugin(Activator.PLUGIN_ID,
        "icons/compartment.png"));
    drawer.add(entry);
    addEntry("Compartment", entry, true);

    entry =
        new CreationToolEntry("NaturalType", "Create a new NaturalType",
            new ORMNaturalTypeFactory(), null, null);
    entry.setToolClass(CreationAndDirectEditTool.class);
    entry.setSmallIcon(Activator.imageDescriptorFromPlugin(Activator.PLUGIN_ID,
        "icons/naturaltype.png"));
    drawer.add(entry);
    addEntry("NaturalType", entry, true);

    entry =
        new CreationToolEntry("RoleType", "Create a new RoleType", new ORMRoleTypeFactory(), null,
            null);
    entry.setToolClass(CreationAndDirectEditTool.class);
    entry.setSmallIcon(Activator.imageDescriptorFromPlugin(Activator.PLUGIN_ID,
        "icons/roletype.png"));
    drawer.add(entry);
    addEntry("RoleType", entry, false);

    entry =
        new CreationToolEntry("RoleGroup", "Create a new RoleGroup", new ORMRoleGroupFactory(),
            null, null);
    entry.setToolClass(CreationAndDirectEditTool.class);
    entry.setSmallIcon(Activator.imageDescriptorFromPlugin(Activator.PLUGIN_ID,
        "icons/rolegroup.png"));
    drawer.add(entry);
    addEntry("RoleGroup", entry, false);

    entry =
        new CreationToolEntry("Group", "Create a new Group", new ORMGroupingFactory(), null, null);
    entry.setToolClass(CreationAndDirectEditTool.class);
    entry.setSmallIcon(Activator.imageDescriptorFromPlugin(Activator.PLUGIN_ID,
        "icons/group.png"));
    drawer.add(entry);
    addEntry("Group", entry, true);

    group.add(drawer);
  }



  private void createComponentPartsDrawer() {

    PaletteDrawer drawer = new PaletteDrawer("Parts");

    CreationToolEntry entry1 =
        new CreationToolEntry("Methode", "Create a new Methode", new ORMMethodeFactory(), null,
            null);
    entry1.setToolClass(CreationAndDirectEditTool.class);
    entry1.setSmallIcon(Activator.imageDescriptorFromPlugin(Activator.PLUGIN_ID,
        "icons/EOperation.gif"));
    drawer.add(entry1);
    addEntry("Methode", entry1, true);

    CreationToolEntry entry2 =
        new CreationToolEntry("Attribute", "Create a new Attribute", new ORMAttributeFactory(),
            null, null);
    entry2.setToolClass(CreationAndDirectEditTool.class);
    entry2.setSmallIcon(Activator.imageDescriptorFromPlugin(Activator.PLUGIN_ID,
        "icons/EAttribute.gif"));
    drawer.add(entry2);
    addEntry("Attribute", entry2, true);

    group.add(drawer);
  }

  private void createConnectionsDrawer() {

    PaletteDrawer drawer = new PaletteDrawer("Connections");
    CreationToolEntry entry1 =
        new ConnectionCreationToolEntry("Fulfilment", "Create a new Fulfilment Relation",
            new ORMFulfilmentFactory(), null, null);
    entry1.setSmallIcon(Activator.imageDescriptorFromPlugin(Activator.PLUGIN_ID,
        "icons/fulfilment.png"));
    drawer.add(entry1);
    addEntry("Fulfilment", entry1, true);

    CreationToolEntry entry2 =
        new ConnectionCreationToolEntry("Role Implication",
            "Create a new Role Implication Relation", new ORMRoleImplicationFactory(), null, null);
    entry2.setSmallIcon(Activator.imageDescriptorFromPlugin(Activator.PLUGIN_ID,
        "icons/roleimplication.png"));
    drawer.add(entry2);
    addEntry("Role Implication", entry2, false);

    CreationToolEntry entry3 =
        new ConnectionCreationToolEntry("Role Equivalence",
            "Create a new Role Equivalence Relation", new ORMRoleEquivalenceFactory(), null, null);
    entry3.setSmallIcon(Activator.imageDescriptorFromPlugin(Activator.PLUGIN_ID,
        "icons/roleequivalence.png"));
    drawer.add(entry3);
    addEntry("Role Equivalence", entry3, false);

    CreationToolEntry entry4 =
        new ConnectionCreationToolEntry("Role Prohibition",
            "Create a new Role Prohibition Relation", new ORMRoleProhibitionFactory(), null, null);
    entry4.setSmallIcon(Activator.imageDescriptorFromPlugin(Activator.PLUGIN_ID,
        "icons/roleprohibition.png"));
    drawer.add(entry4);
    addEntry("Role Prohibition", entry4, false);

    CreationToolEntry entry5 =
        new ConnectionCreationToolEntry("Inheritance", "Create a new Inheritance Relation",
            new ORMInheritanceFactory(), null, null);
    entry5.setSmallIcon(Activator.imageDescriptorFromPlugin(Activator.PLUGIN_ID,
        "icons/inheritance.png"));
    drawer.add(entry5);
    addEntry("Inheritance", entry5, true);

    CreationToolEntry entry6 =
        new ConnectionCreationToolEntry("Relationship", "Create a new Relationship Relation",
            new ORMRelationshipFactory(), null, null);
    entry6.setSmallIcon(Activator.imageDescriptorFromPlugin(Activator.PLUGIN_ID,
        "icons/relationship.png"));
    drawer.add(entry6);
    addEntry("Relationship", entry6, false);

    CreationToolEntry entry7 =
        new ConnectionCreationToolEntry("Irreflexive", "Create a new Irreflexive Relation",
            new ORMIrreflexiveFactory(), null, null);
    entry7.setSmallIcon(Activator.imageDescriptorFromPlugin(Activator.PLUGIN_ID,
        "icons/irreflexive.png"));
    drawer.add(entry7);
    addEntry("Irreflexive", entry7, false);

    CreationToolEntry entry8 =
        new ConnectionCreationToolEntry("Total", "Create a new Total Relation",
            new ORMTotalFactory(), null, null);
    entry8.setSmallIcon(Activator.imageDescriptorFromPlugin(Activator.PLUGIN_ID,
        "icons/total.png"));
    drawer.add(entry8);
    addEntry("Total", entry8, false);

    CreationToolEntry entry9 =
        new ConnectionCreationToolEntry("Acyclic", "Create a new Acyclic Relation",
            new ORMAcyclicFactory(), null, null);
    entry9.setSmallIcon(Activator.imageDescriptorFromPlugin(Activator.PLUGIN_ID,
        "icons/acyclic.png"));
    drawer.add(entry9);
    addEntry("Acyclic", entry9, false);

    group.add(drawer);
  }
}
