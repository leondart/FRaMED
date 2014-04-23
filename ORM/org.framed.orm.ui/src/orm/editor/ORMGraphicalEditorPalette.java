package orm.editor;


import org.eclipse.gef.palette.ConnectionCreationToolEntry;
import org.eclipse.gef.palette.CreationToolEntry;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.SelectionToolEntry;

import orm.factory.ORMAcyclicFactory;
import orm.factory.ORMAttributeFactory;
import orm.factory.ORMCompartmentFactory;
import orm.factory.ORMFulfilmentFactory;
import orm.factory.ORMGroupingFactory;
import orm.factory.ORMInheritanceFactory;
import orm.factory.ORMIrreflexiveFactory;
import orm.factory.ORMMethodeFactory;
import orm.factory.ORMNaturalTypeFactory;
import orm.factory.ORMRelationshipFactory;
import orm.factory.ORMRoleEquivalenceFactory;
import orm.factory.ORMRoleGroupFactory;
import orm.factory.ORMRoleImplicationFactory;
import orm.factory.ORMRoleProhibitionFactory;
import orm.factory.ORMRoleTypeFactory;
import orm.factory.ORMTotalFactory;
import orm.tool.CreationAndDirectEditTool;


/**
 * @author Kay Bierzynski
 * */
public class ORMGraphicalEditorPalette extends PaletteRoot {
	
	PaletteGroup group;
	 
	  public ORMGraphicalEditorPalette() {
		  
	    addGroup();
	    addSelectionTool();
	    createComponentsDrawer();
	    createComponentPartsDrawer();
	    createConnectionsDrawer();
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
			CreationToolEntry entry = new CreationToolEntry("Compartment", "Create a new Compartment", new ORMCompartmentFactory(), null, null);
			entry.setToolClass(CreationAndDirectEditTool.class);
			drawer.add(entry);
			entry = new CreationToolEntry("NaturalType", "Create a new NaturalType", new ORMNaturalTypeFactory(), null, null);
			entry.setToolClass(CreationAndDirectEditTool.class);
			drawer.add(entry);
			entry = new CreationToolEntry("RoleType", "Create a new RoleType", new ORMRoleTypeFactory(), null, null);
			entry.setToolClass(CreationAndDirectEditTool.class);
			drawer.add(entry);
			entry = new CreationToolEntry("RoleGroup", "Create a new RoleGroup", new ORMRoleGroupFactory(), null, null);
			entry.setToolClass(CreationAndDirectEditTool.class);
			drawer.add(entry);
			entry = new CreationToolEntry("Group", "Create a new Group", new ORMGroupingFactory(), null, null);
			entry.setToolClass(CreationAndDirectEditTool.class);
			drawer.add(entry);
			group.add(drawer);
	}
	

	  
	  private void createComponentPartsDrawer() {

			PaletteDrawer drawer = new PaletteDrawer("Parts");
			
			CreationToolEntry entry1 = new CreationToolEntry("Methode", "Create a new Methode", new ORMMethodeFactory(), null, null);
		    entry1.setToolClass(CreationAndDirectEditTool.class); 
			drawer.add(entry1);
			
			CreationToolEntry entry2 = new CreationToolEntry("Attribute", "Create a new Attribute", new ORMAttributeFactory(), null, null);
		    entry2.setToolClass(CreationAndDirectEditTool.class); 
			drawer.add(entry2);
			group.add(drawer);
	  }
	  
	  private void createConnectionsDrawer() {

			PaletteDrawer drawer = new PaletteDrawer("Connections");
			CreationToolEntry entry1 = new ConnectionCreationToolEntry("Fulfilment", "Create a new Fulfilment Relation", new ORMFulfilmentFactory(), null, null);
			drawer.add(entry1);
	
			CreationToolEntry  entry2 = new ConnectionCreationToolEntry("Role Implication", "Create a new Role Implication Relation", new ORMRoleImplicationFactory(), null, null);
			drawer.add(entry2);
			
			CreationToolEntry  entry3 = new ConnectionCreationToolEntry("Role Equivalence", "Create a new Role Equivalence Relation", new ORMRoleEquivalenceFactory(), null, null);
			drawer.add(entry3);
			
			CreationToolEntry  entry4 = new ConnectionCreationToolEntry("Role Prohibition", "Create a new Role Prohibition Relation", new ORMRoleProhibitionFactory(), null, null);
			drawer.add(entry4);
			
			CreationToolEntry  entry5 = new ConnectionCreationToolEntry("Inheritance", "Create a new Inheritance Relation", new ORMInheritanceFactory(), null, null);
			drawer.add(entry5);
			
			CreationToolEntry  entry6 = new ConnectionCreationToolEntry("Relationship", "Create a new Relationship Relation", new ORMRelationshipFactory(), null, null);
			drawer.add(entry6);

			CreationToolEntry  entry7 = new ConnectionCreationToolEntry("Irreflexive", "Create a new Irreflexive Relation", new ORMIrreflexiveFactory(), null, null);
			drawer.add(entry7);
			
			CreationToolEntry  entry8 = new ConnectionCreationToolEntry("Total", "Create a new Total Relation", new ORMTotalFactory(), null, null);
			drawer.add(entry8);
			
			CreationToolEntry  entry9 = new ConnectionCreationToolEntry("Acyclic", "Create a new Acyclic Relation", new ORMAcyclicFactory(), null, null);
			drawer.add(entry9);
			group.add(drawer);
	  }
}


