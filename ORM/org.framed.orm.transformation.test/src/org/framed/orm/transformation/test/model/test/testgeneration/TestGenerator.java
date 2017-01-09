package org.framed.orm.transformation.test.model.test.testgeneration;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Platform;
import org.osgi.framework.Bundle;
import de.ovgu.featureide.fm.core.io.UnsupportedModelException;

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
	 * @throws UnsupportedModelException 
	 */
	public void generateTestCases() throws IOException, URISyntaxException, UnsupportedModelException {
		List<BitSet> configList = new ArrayList<BitSet>();
		ConfigGenerator configGenerator = new ConfigGenerator();
		Bundle bundle = Platform.getBundle("org.framed.orm.transformation.test");
	    
		URL fileURL = bundle.getEntry("testcases/Generated/baseTest.xmi");
		byte[] byte_baseContent = Files.readAllBytes(Paths.get(FileLocator.resolve(fileURL).toURI()));
		String str_baseContent = new String(byte_baseContent, StandardCharsets.UTF_8);
		
		configList = configGenerator.generateConfigurations();
		for(BitSet config : configList) {
			//copy baseContent
		    String specificContent = new String(str_baseContent);
		    //delete feature entries in framed model depending on configuration
		    specificContent = editFeatureConfiguration(specificContent, config);
		    //change crom model depending on configuration
		    specificContent = editCromModel(specificContent, config);
		    //delete empty lines
		    specificContent = specificContent.replaceAll("(?m)^[ \t]*\r?\n", "");
		    String str_config = configGenerator.bitSetToString(config);
		    try { 
				Files.write(Paths.get(bundle.getLocation().substring(16) + "testcases/Generated/" + str_config + ".xmi"), 
					specificContent.getBytes(StandardCharsets.UTF_8), 
					StandardOpenOption.CREATE);
		    } catch(Exception e) {System.err.println(e);}	
		}	    
	}
	
	public String editFeatureConfiguration(String specificContent, BitSet config) {
		if(!config.get(0) && !config.get(1)) 
			specificContent = specificContent.replaceAll("<features name=\"Role_Structure\"/>", " ");
		if(!config.get(0)) {
			specificContent = specificContent.replaceAll("<features name=\"Role_Behavior\"/>", " ");
			specificContent = specificContent.replaceAll("<features name=\"Role_Properties\" manuallySelected=\"true\"/>", " ");
			}	
		if(!config.get(1)) 
			specificContent = specificContent.replaceAll("<features name=\"Role_Inheritance\" manuallySelected=\"true\"/>", " ");
		if(!config.get(2)) 
			specificContent = specificContent.replaceAll("<features name=\"Compartments\" manuallySelected=\"true\"/>", " ");
		if(!config.get(3)) 
			specificContent = specificContent.replaceAll("<features name=\"Dates\" manuallySelected=\"true\"/>", " ");
		if(!config.get(13) && !config.get(9)) 
			specificContent = specificContent.replaceAll("<features name=\"Dependent\"/>", " ");
		if(!config.get(13)) 
			specificContent = specificContent.replaceAll("<features name=\"On_Compartments\"/>", " ");
		if(!config.get(9)) 
			specificContent = specificContent.replaceAll("<features name=\"On_Relationships\"/>", " ");
		if(!config.get(4) && !config.get(5) && !config.get(6) && !config.get(7) && !config.get(8)) 
			specificContent = specificContent.replaceAll("<features name=\"Role_Constraints\"/>", " ");
		if(!config.get(4)) 
			specificContent = specificContent.replaceAll("<features name=\"Role_Implication\" manuallySelected=\"true\"/>", " ");
		if(!config.get(5)) 
			specificContent = specificContent.replaceAll("<features name=\"Role_Prohibition\" manuallySelected=\"true\"/>", " ");
		if(!config.get(6)) 
			specificContent = specificContent.replaceAll("<features name=\"Role_Equivalence\"/>", " ");
		if(!config.get(7)) 
			specificContent = specificContent.replaceAll("<features name=\"Group_Constraints\" manuallySelected=\"true\"/>", " ");
		if(!config.get(8)) 
			specificContent = specificContent.replaceAll("<features name=\"Occurrence_Constraints\" manuallySelected=\"true\"/>", " ");
		if(!config.get(9)) 
			specificContent = specificContent.replaceAll("<features name=\"Relationships\"/>", " ");
		if(!config.get(10) && !config.get(11) && !config.get(12)) 
			specificContent = specificContent.replaceAll("<features name=\"Relationship_Constraints\"/>", " ");
		if(!config.get(10)) 
			specificContent = specificContent.replaceAll("<features name=\"Relationship_Cardinality\" manuallySelected=\"true\"/>", " ");
		if(!config.get(11)) {
			specificContent = specificContent.replaceAll("<features name=\"Intra_Relationship_Constraints\"/>", " ");
			specificContent = specificContent.replaceAll("<features name=\"Parthood_Constraints\" manuallySelected=\"true\"/>", " "); }
		if(!config.get(12)) 
			specificContent = specificContent.replaceAll("<features name=\"Inter_Relationship_Constraints\" manuallySelected=\"true\"/>", " ");
		if(!config.get(13)) 
			specificContent = specificContent.replaceAll("<features name=\"Compartment_Types\"/>", " ");
		if(!config.get(14) && !config.get(15)) 
			specificContent = specificContent.replaceAll("<features name=\"Compartment_Structure\"/>", " ");
		if(!config.get(14)) {
			specificContent = specificContent.replaceAll("<features name=\"Compartment_Properties\" manuallySelected=\"true\"/>", " ");
			specificContent = specificContent.replaceAll("<features name=\"Compartment_Behavior\"/>", " "); }
		if(!config.get(15)) 
			specificContent = specificContent.replaceAll("<features name=\"Compartment_Inheritance\" manuallySelected=\"true\"/>", " ");
		if(!config.get(16)) { 
			specificContent = specificContent.replaceAll("<features name=\"Participants\"/>", " ");
			specificContent = specificContent.replaceAll("<features name=\"Playable_by_Defining_Compartment\" manuallySelected=\"true\"/>", " "); }
		if(!config.get(17)) 
			specificContent = specificContent.replaceAll("<features name=\"Data_Types\"/>", " ");
		if(!config.get(18)) 
			specificContent = specificContent.replaceAll("<features name=\"Data_Type_Inheritance\" manuallySelected=\"true\"/>", " ");
		return specificContent;
	}
	
	public String editCromModel(String specificContent, BitSet config) {
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
