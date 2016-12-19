package testgenerator;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Writer;
import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.Platform;
import org.framed.orm.transformation.test.TransformationTestSuite;
import org.framed.orm.transformation.test.model.test.TestCase;
import org.osgi.framework.Bundle;

public class TestGenerator {
	
	public void loadBaseTest(TestCase testcase) throws Exception {
		List<Object[]> list = new LinkedList<Object[]>();
	    list=(List<Object[]>) TransformationTestSuite.getTestCases();
	    Bundle bundle = Platform.getBundle("org.framed.orm.transformation.test");
	    //System.out.println(bundle.getEntry("testcases").getPath());	
	    Path currentDir = Paths.get("./testcases/Generated/test.txt");
	    System.out.println(currentDir.toAbsolutePath().toString());
	    File file = new File(currentDir.toAbsolutePath().toString());
	    file.createNewFile();
	          
	}   
	
}
