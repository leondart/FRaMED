package org.framed.orm.transformation.test.model.test.testgeneration;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Platform;
import org.osgi.framework.Bundle;


/**
 * @author Kevin Kassin
 * This generates test cases in the folder "Generated" based on baseTest.xmi 
 */
public class TestGenerator {
	
	/**
	 * This method takes the basic test case to generate test cases influenced by an feature configuration.
	 * @param testcase
	 * @throws IOException 
	 * @throws URISyntaxException 
	 */
	public void generateTestCases() throws IOException, URISyntaxException {
		List<String> configList = new ArrayList<String>();
		ConfigGenerator configGenerator = new ConfigGenerator();
		Bundle bundle = Platform.getBundle("org.framed.orm.transformation.test");
		File file;
	    
		URL fileURL = bundle.getEntry("testcases/Generated/baseTest.xmi");
		byte[] byte_baseContent = Files.readAllBytes(Paths.get(FileLocator.resolve(fileURL).toURI()));
		String str_baseContent = new String(byte_baseContent, StandardCharsets.UTF_8);
		
		configList = configGenerator.generateConfigurations(500);
		for(String config : configList) {
		    String specificContent = new String(str_baseContent);
		    //delete feature entries in framed model depending on configuration
		    specificContent = editFeatureConfiguration(specificContent, config);
		    //change crom model depending on configuration
		    specificContent = editCromModel(specificContent, config);
		    //delete empty lines
		    specificContent = specificContent.replaceAll("(?m)^[ \t]*\r?\n", "");
		    try { 
				Files.write(Paths.get(bundle.getLocation().substring(16) + "testcases/Generated/" + config + ".xmi"), 
					specificContent.getBytes(StandardCharsets.UTF_8), 
					StandardOpenOption.CREATE);
		    } catch(Exception e) {System.err.println(e);}	
		}	    
	}
	
	/**
	 * This method deletes features entries in the framed model of the generated test cases
	 * @param specificContent
	 */
	public String editFeatureConfiguration(String specificContent, String config) {
		if(config.charAt(0)=='0' && config.charAt(1)=='0') 
			specificContent = specificContent.replaceAll("<features name=\"Role_Structure\"/>", " ");
		if(config.charAt(0)=='0') {
			specificContent = specificContent.replaceAll("<features name=\"Role_Behavior\"/>", " ");
			specificContent = specificContent.replaceAll("<features name=\"Role_Properties\" manuallySelected=\"true\"/>", " ");
			}	
		if(config.charAt(1)=='0') 
			specificContent = specificContent.replaceAll("<features name=\"Role_Inheritance\" manuallySelected=\"true\"/>", " ");
		if(config.charAt(2)=='0') 
			specificContent = specificContent.replaceAll("<features name=\"Compartments\" manuallySelected=\"true\"/>", " ");
		if(config.charAt(3)=='0') 
			specificContent = specificContent.replaceAll("<features name=\"Dates\" manuallySelected=\"true\"/>", " ");
		if(config.charAt(13)=='0' && config.charAt(9)=='0') 
			specificContent = specificContent.replaceAll("<features name=\"Dependent\"/>", " ");
		if(config.charAt(13)=='0') 
			specificContent = specificContent.replaceAll("<features name=\"On_Compartments\"/>", " ");
		if(config.charAt(9)=='0') 
			specificContent = specificContent.replaceAll("<features name=\"On_Relationships\"/>", " ");
		if(config.charAt(4)=='0' && config.charAt(5)=='0' && config.charAt(6)=='0' && config.charAt(7)=='0' && config.charAt(8)=='0') 
			specificContent = specificContent.replaceAll("<features name=\"Role_Constraints\"/>", " ");
		if(config.charAt(4)=='0') 
			specificContent = specificContent.replaceAll("<features name=\"Role_Implication\" manuallySelected=\"true\"/>", " ");
		if(config.charAt(5)=='0') 
			specificContent = specificContent.replaceAll("<features name=\"Role_Prohibition\" manuallySelected=\"true\"/>", " ");
		if(config.charAt(6)=='0') 
			specificContent = specificContent.replaceAll("<features name=\"Role_Equivalence\"/>", " ");
		if(config.charAt(7)=='0') 
			specificContent = specificContent.replaceAll("<features name=\"Group_Constraints\" manuallySelected=\"true\"/>", " ");
		if(config.charAt(8)=='0') 
			specificContent = specificContent.replaceAll("<features name=\"Occurrence_Constraints\" manuallySelected=\"true\"/>", " ");
		if(config.charAt(9)=='0') 
			specificContent = specificContent.replaceAll("<features name=\"Relationships\"/>", " ");
		if(config.charAt(10)=='0' && config.charAt(11)=='0' && config.charAt(12)=='0') 
			specificContent = specificContent.replaceAll("<features name=\"Relationship_Constraints\"/>", " ");
		if(config.charAt(10)=='0') 
			specificContent = specificContent.replaceAll("<features name=\"Relationship_Cardinality\" manuallySelected=\"true\"/>", " ");
		if(config.charAt(11)=='0') {
			specificContent = specificContent.replaceAll("<features name=\"Intra_Relationship_Constraints\"/>", " ");
			specificContent = specificContent.replaceAll("<features name=\"Parthood_Constraints\" manuallySelected=\"true\"/>", " "); }
		if(config.charAt(12)=='0') 
			specificContent = specificContent.replaceAll("<features name=\"Inter_Relationship_Constraints\" manuallySelected=\"true\"/>", " ");
		if(config.charAt(13)=='0') 
			specificContent = specificContent.replaceAll("<features name=\"Compartment_Types\"/>", " ");
		if(config.charAt(14)=='0' && config.charAt(15)=='0') 
			specificContent = specificContent.replaceAll("<features name=\"Compartment_Structure\"/>", " ");
		if(config.charAt(14)=='0') {
			specificContent = specificContent.replaceAll("<features name=\"Compartment_Properties\" manuallySelected=\"true\"/>", " ");
			specificContent = specificContent.replaceAll("<features name=\"Compartment_Behavior\"/>", " "); }
		if(config.charAt(15)=='0') 
			specificContent = specificContent.replaceAll("<features name=\"Compartment_Inheritance\" manuallySelected=\"true\"/>", " ");
		if(config.charAt(16)=='0') { 
			specificContent = specificContent.replaceAll("<features name=\"Participants\"/>", " ");
			specificContent = specificContent.replaceAll("<features name=\"Playable_by_Defining_Compartment\" manuallySelected=\"true\"/>", " "); }
		if(config.charAt(17)=='0') 
			specificContent = specificContent.replaceAll("<features name=\"Data_Types\"/>", " ");
		if(config.charAt(18)=='0') 
			specificContent = specificContent.replaceAll("<features name=\"Data_Type_Inheritance\" manuallySelected=\"true\"/>", " ");
		return specificContent;
	}
	
	public String editCromModel(String specificContent, String config) {
		/*if(config.charAt(0)=='0') { //Role_Behavior, Role_Properties
			specificContent = specificContent.substring(0, specificContent.indexOf("<role xsi:type=\"crom_l1_composed:RoleType\" name=\"RoleA\""))
				+ "<role xsi:type=\"crom_l1_composed:RoleType\" name=\"RoleA\" outgoing=\"//@elements.4/@relationships.0 //@elements.4/@relationships.3 //@elements.4/@relationships.4\"/>\n \t\t\t"	
				+ specificContent.substring(specificContent.indexOf("</parts>", specificContent.indexOf("<role xsi:type=\"crom_l1_composed:RoleType\" name=\"RoleA\"")));
			specificContent = specificContent.substring(0, specificContent.indexOf("<role xsi:type=\"crom_l1_composed:RoleType\" name=\"RoleB\""))
					+ "<role xsi:type=\"crom_l1_composed:RoleType\" name=\"RoleB\" incoming=\"//@cromModel/@elements.6/@relationships.0\" outgoing=\"//@cromModel/@elements.6/@relationships.1\"/>\n \t\t\t"	
					+ specificContent.substring(specificContent.indexOf("</parts>", specificContent.indexOf("<role xsi:type=\"crom_l1_composed:RoleType\" name=\"RoleB\"")));
			specificContent = specificContent.substring(0, specificContent.indexOf("<role xsi:type=\"crom_l1_composed:RoleType\" name=\"RoleD\""))
					+ "<role xsi:type=\"crom_l1_composed:RoleType\" name=\"RoleD\" incoming=\"//@cromModel/@elements.6/@relationships.1 //@cromModel/@elements.6/@relationships.4\" outgoing=\"//@cromModel/@elements.6/@relationships.2\"/>\n \t\t\t"	
					+ specificContent.substring(specificContent.indexOf("</parts>", specificContent.indexOf("<role xsi:type=\"crom_l1_composed:RoleType\" name=\"RoleE\"")));
			specificContent = specificContent.substring(0, specificContent.indexOf("<role xsi:type=\"crom_l1_composed:RoleType\" name=\"RoleE\""))
					+ "<role xsi:type=\"crom_l1_composed:RoleType\" name=\"RoleE\"/>\n \t\t\t"	
					+ specificContent.substring(specificContent.indexOf("</parts>", specificContent.indexOf("<role xsi:type=\"crom_l1_composed:RoleType\" name=\"RoleE\"")));
			specificContent = specificContent.substring(0, specificContent.indexOf("<role xsi:type=\"crom_l1_composed:RoleType\" name=\"RoleF\""))
					+ "<role xsi:type=\"crom_l1_composed:RoleType\" name=\"RoleF\"/>\n \t\t\t"	
					+ specificContent.substring(specificContent.indexOf("</parts>", specificContent.indexOf("<role xsi:type=\"crom_l1_composed:RoleType\" name=\"RoleF\"")));
		}*/
		return specificContent;
	}
	
}
