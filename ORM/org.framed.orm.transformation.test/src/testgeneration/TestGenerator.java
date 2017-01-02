package testgeneration;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

import org.framed.orm.transformation.test.model.test.TestCase;

/**
 * This generates test cases in the folder "Generated" based on baseTest.xmi 
 */
public class TestGenerator {
	
	/**
	 * This method takes the basic test case to generate test cases influenced by an feature configuration.
	 * @param testcase
	 * @throws IOException 
	 */
	public void generateTestCases() throws IOException {
		List<String> configList = new ArrayList<String>();
		
		ConfigGenerator configGenerator = new ConfigGenerator();
		configList = configGenerator.generateConfigurations(500);
		
		byte[] byte_baseContent = Files.readAllBytes(Paths.get("./testcases/Generated/baseTest.xmi"));
		String str_baseContent = new String(byte_baseContent, StandardCharsets.UTF_8);
		
		for(String config : configList) {
		    String specificContent = new String(str_baseContent);
		    specificContent = editFeatureConfiguration(specificContent, config);
		    //delete empty lines
		    specificContent = specificContent.replaceAll("(?m)^[ \t]*\r?\n", "");
		    try { 
		    	Files.write(Paths.get("./testcases/Generated/" + config + ".xmi"), 
		    	specificContent.getBytes(StandardCharsets.UTF_8), 
		    	StandardOpenOption.CREATE);
		    } catch(IOException e) {System.err.println(e);}	
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
			specificContent = specificContent.replaceAll("<features name=\"Role_Properties\" manuallySelected=\"true\"/>", " "); }	
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
		if(config.charAt(11)=='0') 
			specificContent = specificContent.replaceAll("<features name=\"Intra_Relationship_Constraints\"/>", " ");
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
}
