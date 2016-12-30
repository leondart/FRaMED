package testgeneration;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import org.framed.orm.transformation.test.model.test.TestCase;

/**
 * This generates test cases in the folder "Generated" based on baseTest.xmi 
 */
public class TestGenerator {
	
	/**
	 * This takes the basic test case to generate test cases influeced by an feature configuration.
	 * @param testcase
	 * @throws IOException 
	 */
	public void generateTestCases(TestCase testcase) throws IOException {
		List<String> configList = new ArrayList<String>();
		
		ConfigGenerator configGenerator = new ConfigGenerator();
		configList = configGenerator.generateConfigurations(100);
		
		for(String config : configList) {
		    Path currentDir = Paths.get("./testcases/Generated/" + config);
		    File file = new File(currentDir.toAbsolutePath().toString());
		    try { file.createNewFile(); }
		    catch(IOException e) {System.err.println(e);}
		}
	}   
}
