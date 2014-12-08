package org.framed.orm.transformation.test;

import static org.junit.Assert.fail;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.compare.Comparison;
import org.eclipse.emf.compare.EMFCompare;
import org.eclipse.emf.compare.match.DefaultComparisonFactory;
import org.eclipse.emf.compare.match.DefaultEqualityHelperFactory;
import org.eclipse.emf.compare.match.DefaultMatchEngine;
import org.eclipse.emf.compare.match.IComparisonFactory;
import org.eclipse.emf.compare.match.IMatchEngine;
import org.eclipse.emf.compare.match.eobject.IEObjectMatcher;
import org.eclipse.emf.compare.match.impl.MatchEngineFactoryImpl;
import org.eclipse.emf.compare.match.impl.MatchEngineFactoryRegistryImpl;
import org.eclipse.emf.compare.scope.DefaultComparisonScope;
import org.eclipse.emf.compare.scope.IComparisonScope;
import org.eclipse.emf.compare.utils.UseIdentifiers;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.framed.orm.transformation.TransformationExecutor;
import org.framed.orm.transformation.test.model.test.TestCase;
import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.osgi.framework.Bundle;

import crom_l1_composed.Model;

/**
 * Parameterized test to run all test cases inside "testcases" directory
 * 
 * @author Johannes Tandler
 *
 */
@RunWith(Parameterized.class)
public class ParameterizedTestRunner {

	/**
	 * File uri of crom model. This file is created during tests and delete
	 * afterwards.
	 */
	private static final URI CROM_FILE_URI = URI
			.createFileURI("crom_model.xmi");

	/**
	 * File uri of crom model. This file is created during tests and delete
	 * afterwards.
	 */
	private static final URI FRAMED_FILE_URI = URI
			.createFileURI("framed_model.xmi");

	/**
	 * Loads all {@link TestCase}s from the "testcases" directory of this
	 * plugin.
	 * 
	 * @return {@link List} of {@link TestCase}
	 * @throws Exception
	 */
	@Parameters
	public static Iterable<TestCase[]> getTestCases() throws Exception {
		List<TestCase[]> list = new LinkedList<TestCase[]>();

		File file = null;

		// if bundle is available this test runs as plugin junit test
		Bundle bundle = Platform
				.getBundle("org.framed.orm.transformation.test");
		if (bundle != null) {
			// get dir out of bundle
			URL fileURL = bundle.getEntry("testcases");
			file = new File(FileLocator.resolve(fileURL).toURI());
		} else {
			// otherwise just load it from the working directory
			file = new File("testcases");
		}
		// load all test cases in this directory
		loadDirectory(list, file);
		return list;
	}

	/**
	 * Loads all {@link TestCase} of the given directory
	 * 
	 * @param list
	 *            List of {@link TestCase}
	 * @param file
	 *            Current directory
	 */
	private static void loadDirectory(List<TestCase[]> list, File file) {
		for (File testFile : file.listFiles()) {
			// if entry is directory load it recursively
			if (testFile.isDirectory()) {
				loadDirectory(list, testFile);
			} else {
				// if entry is file try to load test file
				TestCase testCase = loadTestCase(testFile);
				if (testCase != null) {
					list.add(new TestCase[] { testCase, null });
				}
			}
		}
	}

	/**
	 * loads the {@link TestCase} of the specified {@link File}.
	 * 
	 * @param list
	 *            List of {@link TestCase}
	 * @param testFile
	 */
	private static TestCase loadTestCase(File testFile) {
		try {
			// load each testcase
			ResourceSet set = new ResourceSetImpl();
			Resource res = set.createResource(URI.createFileURI(testFile
					.toString()));
			res.load(Collections.EMPTY_MAP);

			// if there are file contents in this directory
			if (res.getContents().size() > 0
					&& res.getContents().get(0) instanceof TestCase) {
				// load test file and add it to test list
				return (TestCase) res.getContents().get(0);
			}
		} catch (Exception e) {
			System.err.println("Was not able to load testcase \""
					+ testFile.toString() + "\" due : " + e.toString());
		}
		return null;
	}

	/**
	 * current {@link TestCase}
	 */
	private TestCase testCase;

	/**
	 * default constructor
	 * 
	 * @param testCase
	 *            current {@link TestCase}
	 * @param _bla
	 *            JUnit needs this, but we dont use it.
	 */
	public ParameterizedTestRunner(TestCase testCase, TestCase _bla) {
		this.testCase = testCase;
	}

	/**
	 * test method
	 * 
	 * @throws IOException
	 */
	@Test
	public void doTest() throws IOException {
		TransformationExecutor exe = new TransformationExecutor();

		// setup tmp resource
		Resource[] resources = initResources(testCase);
		exe.setSourceModelFile(resources[0]);
		exe.setTargetModelFile(resources[1]);

		// get expected model
		EObject expectedModel = EcoreUtil.copy(testCase.getCromModel());

		// execute transformation
		try {
			exe.execute();
		} catch (Exception e) {
			fail("Error at transformation execution :\n" + e.toString());
		}
		// reload all resources
		for (Resource res : resources) {
			res.load(Collections.EMPTY_MAP);
		}

		// get transformed model
		EObject toCompare = resources[1].getContents().get(0);

		// create emf comparator
		IComparisonScope scope = new DefaultComparisonScope(expectedModel,
				toCompare, null);
		EMFCompare comparator = setupComparator();

		// compare both models
		Comparison comp = comparator.compare(scope);

		int diffs = comp.getDifferences().size();

		// if there are diffs this test failed
		if (diffs > 0) {
			// build error message
			StringBuilder builder = new StringBuilder();
			builder.append("Test \"");
			builder.append(testCase.toString());
			builder.append("\" failed :\n");
			builder.append("\tDescription: ");
			builder.append(testCase.getDescription());
			builder.append("\n");
			builder.append("\tDifferences: ");
			builder.append(comp.getDifferences());
			builder.append("\n");

			// Fail it!
			fail(builder.toString());
		}
	}

	/**
	 * setups a default emf comparator. This is just copy & paste from the
	 * EMFCompare tutorial.
	 * 
	 * @return default emf comparator.
	 */
	private EMFCompare setupComparator() {
		IEObjectMatcher matcher = DefaultMatchEngine
				.createDefaultEObjectMatcher(UseIdentifiers.NEVER);
		IComparisonFactory comparisonFactory = new DefaultComparisonFactory(
				new DefaultEqualityHelperFactory());
		IMatchEngine.Factory matchEngineFactory = new MatchEngineFactoryImpl(
				matcher, comparisonFactory);
		matchEngineFactory.setRanking(20);
		IMatchEngine.Factory.Registry matchEngineRegistry = new MatchEngineFactoryRegistryImpl();
		matchEngineRegistry.add(matchEngineFactory);
		EMFCompare comparator = EMFCompare.builder()
				.setMatchEngineFactoryRegistry(matchEngineRegistry).build();

		return comparator;
	}

	/**
	 * Initializes all {@link Resource}s which are necessary for this
	 * {@link TestCase}
	 * 
	 * @param testCase
	 *            current {@link TestCase}
	 * @return Array of {@link Resource}s which were created. First contains
	 *         {@link Model} and second {@link org.framed.orm.model.Model}.
	 */
	private Resource[] initResources(TestCase testCase) {
		Resource res2 = saveEObject(null, CROM_FILE_URI);
		Resource res1 = saveEObject(testCase.getFramedModel(), FRAMED_FILE_URI);

		return new Resource[] { res1, res2 };
	}

	/**
	 * Stores the given {@link EObject} inside the specified {@link URI}
	 * 
	 * @param object
	 *            {@link EObject} to be stored
	 * @param file
	 *            {@link URI} of destination file
	 * @return created {@link Resource}
	 */
	private Resource saveEObject(EObject object, URI file) {
		ResourceSet set1 = new ResourceSetImpl();
		Resource res1 = set1.createResource(file);

		if (object != null)
			res1.getContents().add(EcoreUtil.copy(object));

		try {
			res1.save(Collections.EMPTY_MAP);
		} catch (IOException e) {
			e.printStackTrace();
		}

		return res1;
	}

	@After
	public void deleteFiles() throws Exception {
		// delete created files after test
		Files.delete(Paths.get(CROM_FILE_URI.toFileString()));
		Files.delete(Paths.get(FRAMED_FILE_URI.toFileString()));
	}
}
