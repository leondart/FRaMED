package org.framed.orm.transformation.test.model.test.testgeneration;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.List;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.framed.orm.featuremodel.FRaMEDFeature;
import org.framed.orm.transformation.test.model.test.TestCase;
import org.osgi.framework.Bundle;
import crom_l1_composed.*;
import de.ovgu.featureide.fm.core.io.UnsupportedModelException;

/**
 * @author Kevin Kassin
 * This generates test cases in the folder "Generated" based on baseTest.xmi 
 */
public class TestGenerator {
	
	public ConfigGenerator configGenerator;
	
	/**
	 * This method takes the basic test case to generate test cases influenced by an feature configuration.
	 * @param testcase
	 * @throws IOException 
	 * @throws URISyntaxException 
	 * @throws UnsupportedModelException 
	 */
	public void generateTestCases() throws IOException, URISyntaxException, UnsupportedModelException {
		List<BitSet> configList = new ArrayList<BitSet>();
		configGenerator = new ConfigGenerator();
		Bundle bundle = Platform.getBundle("org.framed.orm.transformation.test");
	    URL fileURL = bundle.getEntry("testcases/Generated/baseTest.xmi");
		File file = new File(FileLocator.resolve(fileURL).toURI());
		String str_config;
		
		TestCase testCase = loadTestCase(file);
		configList = configGenerator.generateConfigurations();
		for(BitSet config : configList) {
			testCase = loadTestCase(file);
		  
			//delete feature entries in framed model depending on configuration
		    testCase = editFeatureConfiguration(testCase, config);
		    //change crom model depending on configuration
		    testCase = editCromModel(testCase, config);
		    //change title and description of the generated testcase
			testCase = editTitle(testCase, config);
			testCase = editDescription(testCase, config);
		    
		    str_config=configGenerator.bitSetToString(config);
		
			URI a = URI.createFileURI("testcases/Generated/" + str_config + ".xmi");
			createTestFile(testCase, a);
		}      
	}
	
	public TestCase editTitle(TestCase testCase, BitSet config) {
		testCase.setTitle("Generated test " + configGenerator.bitSetToString(config));
		return testCase;
	}
	
	public TestCase editDescription(TestCase testCase, BitSet config) {
		String description;
		boolean firstFeature=true; 
		description = "This test was generated. The following features are choosen: ";
		for(FRaMEDFeature feature : testCase.getFramedModel().getFramedConfiguration().getFeatures()) {
			if(!firstFeature) description = description + ", ";
			description = description + feature.getName();
			firstFeature=false;
		}
		testCase.setDescription(description);
		return testCase;
	}

	public TestCase editFeatureConfiguration(TestCase testCase, BitSet config) {
		EList<FRaMEDFeature> featureList = testCase.getFramedModel().getFramedConfiguration().getFeatures();
	
		if(!config.get(0) && !config.get(1)) featureList.remove(getFeatureNumber("Role_Structure", featureList));
		if(!config.get(0)) { 
			featureList.remove(getFeatureNumber("Role_Properties", featureList)); 
			featureList.remove(getFeatureNumber("Role_Behavior", featureList)); }
		if(!config.get(1)) featureList.remove(getFeatureNumber("Role_Inheritance", featureList));
		if(!config.get(2)) featureList.remove(getFeatureNumber("Compartments", featureList));
		if(!config.get(3)) featureList.remove(getFeatureNumber("Dates", featureList));	
		if(!config.get(4) && !config.get(5) && !config.get(6) && !config.get(7) && !config.get(8))
			featureList.remove(getFeatureNumber("Role_Constraints", featureList));	
		if(!config.get(4)) featureList.remove(getFeatureNumber("Role_Implication", featureList));	
		if(!config.get(5)) featureList.remove(getFeatureNumber("Role_Prohibition", featureList));	
		if(!config.get(6)) featureList.remove(getFeatureNumber("Role_Equivalence", featureList));	
		if(!config.get(7)) featureList.remove(getFeatureNumber("Group_Constraints", featureList));	
		if(!config.get(8)) featureList.remove(getFeatureNumber("Occurrence_Constraints", featureList));
		if(!config.get(9) && !config.get(13)) featureList.remove(getFeatureNumber("Dependent", featureList));	
		if(!config.get(9)) {
			featureList.remove(getFeatureNumber("On_Relationships", featureList));	
			featureList.remove(getFeatureNumber("Relationships", featureList)); }
		if(!config.get(10) && !config.get(11) && !config.get(12)) 
			featureList.remove(getFeatureNumber("Relationship_Constraints", featureList));	
		if(!config.get(10)) featureList.remove(getFeatureNumber("Relationship_Cardinality", featureList));	
		if(!config.get(11)) {
			featureList.remove(getFeatureNumber("Intra_Relationship_Constraints", featureList));
			featureList.remove(getFeatureNumber("Parthood_Constraints", featureList)); }
		if(!config.get(12)) featureList.remove(getFeatureNumber("Inter_Relationship_Constraints", featureList));	
		if(!config.get(13)) {
			featureList.remove(getFeatureNumber("On_Compartments", featureList));	
			featureList.remove(getFeatureNumber("Compartment_Types", featureList));}
		if(!config.get(14) && !config.get(15)) {
			featureList.remove(getFeatureNumber("Compartment_Structure", featureList));	
		}
		if(!config.get(14)) {
			featureList.remove(getFeatureNumber("Compartment_Properties", featureList));
			featureList.remove(getFeatureNumber("Compartment_Behavior", featureList));
		}
		if(!config.get(15)) featureList.remove(getFeatureNumber("Compartment_Inheritance", featureList));
		if(!config.get(16)) {
			featureList.remove(getFeatureNumber("Participants", featureList));
			featureList.remove(getFeatureNumber("Playable_by_Defining_Compartment", featureList));}
		if(!config.get(17)) featureList.remove(getFeatureNumber("Data_Types", featureList));
		if(!config.get(18)) featureList.remove(getFeatureNumber("Data_Type_Inheritance", featureList));
		return testCase;
	}
	
	public TestCase editCromModel(TestCase testCase, BitSet config) {
		EList<crom_l1_composed.ModelElement> cromElements = testCase.getCromModel().getElements();
		
		//Role_Properties, Role_Behavior  TO FIX FOR ROLE_GROUPS
		if(!config.get(0)) {
			//find compartment types
			for(crom_l1_composed.ModelElement element : cromElements) {
				if(element instanceof crom_l1_composed.CompartmentType) {
					//find roles
					for(Part part : ((crom_l1_composed.CompartmentType) element).getParts()) {
						if(part.getRole() instanceof crom_l1_composed.RoleType) 
							DeleteAttributesAndOperationFromRole((crom_l1_composed.RoleType) part.getRole());
						if(part.getRole() instanceof crom_l1_composed.RoleGroup) {
							//iterate over RoleGroup elements
							for(RoleGroupElement roleGroupElement : ((crom_l1_composed.RoleGroup) part.getRole()).getElements()) {
								if(roleGroupElement instanceof crom_l1_composed.RoleType)
									DeleteAttributesAndOperationFromRole((crom_l1_composed.RoleType) roleGroupElement);
								if(roleGroupElement instanceof crom_l1_composed.RoleGroup)
									TraverseInRoleGroups((crom_l1_composed.RoleGroup) roleGroupElement);
		}}}}}}	
		
		//Role_Inheritance
		if(!config.get(1)) {
			//RoleInheritance transformation to implement correct
		}
		
		//Compartments
		if(!config.get(2)) {
			//find compartment types
			for(crom_l1_composed.ModelElement element : cromElements) {
				if(element instanceof crom_l1_composed.CompartmentType) {
					//delete attributes and operation
					((crom_l1_composed.CompartmentType) element).getAttributes().clear();
					((crom_l1_composed.CompartmentType) element).getOperations().clear();
		}}}
		
		//Dates
		if(!config.get(3)) {
			//find fulfillments
			for(crom_l1_composed.ModelElement element : cromElements) {
				if(element instanceof crom_l1_composed.Fulfillment) {
					//delete fulfilment if filler is data type
					if(((crom_l1_composed.Fulfillment) element).getFiller() instanceof crom_l1_composed.DataType)
						cromElements.remove(cromElements.indexOf(element));
		}}}
		
		//Role_Implication
		if(!config.get(4)) {
			changeRoleConstraints("RoleImplication", cromElements);
		}	
				
		//Role_Prohibition
		if(!config.get(5)) {
			changeRoleConstraints("RoleProhibition", cromElements);
		}	
				
		//Role_Equivalence
		if(!config.get(6)) {
			changeRoleConstraints("RoleEquivalence", cromElements);
		}	
		
		return testCase;
	}
	
	public static void changeRoleConstraints(String constraintType, EList<crom_l1_composed.ModelElement> cromElements) {
		EList<Constraint> constraints;
		ArrayList<Constraint> toDelete;
		
		//find compartment types
		for(crom_l1_composed.ModelElement element : cromElements) {
			if(element instanceof crom_l1_composed.CompartmentType) {
				//find constraints
				constraints = ((crom_l1_composed.CompartmentType) element).getConstraints();
				toDelete = new ArrayList<Constraint>();
				for(Constraint constraint : constraints) {
					//find role implications
					if(constraint instanceof crom_l1_composed.RoleImplication && constraintType.equals("RoleImplication"))
						toDelete.add(constraint);
					if(constraint instanceof crom_l1_composed.RoleProhibition && constraintType.equals("RoleProhibition"))
						toDelete.add(constraint);
					if(constraint instanceof crom_l1_composed.RoleEquivalence && constraintType.equals("RoleEquivalence"))
						toDelete.add(constraint);
				}
				//delete role implication
				for(Constraint constraint : toDelete) constraints.remove(constraints.indexOf(constraint));
	}}}

	public static void DeleteAttributesAndOperationFromRole(crom_l1_composed.RoleType role) {
		role.getAttributes().clear();
		role.getOperations().clear();
	}
	
	public static void TraverseInRoleGroups(crom_l1_composed.RoleGroup roleGroup) {
		for(RoleGroupElement roleGroupElement : roleGroup.getElements()) {
			if(roleGroupElement instanceof crom_l1_composed.RoleType)
				DeleteAttributesAndOperationFromRole((crom_l1_composed.RoleType) roleGroupElement);
			if(roleGroupElement instanceof crom_l1_composed.RoleGroup)
				TraverseInRoleGroups((crom_l1_composed.RoleGroup) roleGroupElement);
		}	
	}
	
	/**
	 * loads the {@link TestCase} of the specified {@link File}.
	 * @param file
	 * @return testcase of file
	 */
	private static TestCase loadTestCase(File file) {
		ResourceSet resSet = new ResourceSetImpl();
		Resource res = resSet.createResource(URI.createFileURI(file.toString()));
		
		try {
		res.load(Collections.EMPTY_MAP);
		// if there are file contents in this directory
		if (res.getContents().size() > 0
				&& res.getContents().get(0) instanceof TestCase) {
			// load test file and add it to test list
			return (TestCase) res.getContents().get(0);
		}
			} catch (Exception e) {
				System.err.println("Was not able to load testcase \""
						+ file.toString() + "\" due : " + e.toString());
				for (StackTraceElement el: e.getStackTrace()) System.err.println(el.toString());
			}
		return null;
	}
	
	/**
	   * Stores the given test case inside the specified {@link URI}
	   * 
	   * @param object {@link EObject} to be stored
	   * @param file {@link URI} of destination file
	   * @return created {@link Resource}
	   */
	  private Resource createTestFile(TestCase testCase, URI file) {
	    ResourceSet set1 = new ResourceSetImpl();
	    Resource res1 = set1.createResource(file);
	    
	    if (testCase != null)
	    	res1.getContents().add(EcoreUtil.copy(testCase));

	    try {
	      res1.save(Collections.EMPTY_MAP);
	    } catch (IOException e) {
	      e.printStackTrace();
	    }
	    
	    return res1;
	  }
	 
	/**
	 * This method calculates the  
	 * @param featureName
	 * @param featureList
	 * @return
	 */
	private static int getFeatureNumber(String featureName, EList<FRaMEDFeature> featureList) {
		for(FRaMEDFeature feature : featureList) {
			if(featureName.equals(feature.getName().getLiteral())) return featureList.indexOf(feature);
		}
		return -1;
	}
	
}
