package org.framed.orm.transformation.test;

import static org.junit.Assert.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.Map;

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
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.framed.orm.model.NamedElement;
import org.framed.orm.model.OrmFactory;
import org.framed.orm.model.Segment;
import org.framed.orm.model.Shape;
import org.framed.orm.model.Type;
import org.framed.orm.transformation.TransformationExecutor;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import crom_l1_composed.Attribute;
import crom_l1_composed.CompartmentType;
import crom_l1_composed.Crom_l1_composedFactory;
import crom_l1_composed.Model;
import crom_l1_composed.NaturalType;
import crom_l1_composed.impl.Crom_l1_composedFactoryImpl;

public class NaturalTypeTransformationTest {

	private static final URI CROM_FILE_URI = URI
			.createFileURI("crom_model.xmi");
	private static final URI FRAMED_FILE_URI = URI
			.createFileURI("framed_model.xmi");

	@Test
	public void testOnlyNaturalTypesAreTransformed() throws IOException {
		ResourceSetImpl impl = new ResourceSetImpl();
		
		// create crom model and resource
		Resource cromResource = impl.createResource(CROM_FILE_URI);		
		Model model = setupExpectedModel();
		//cromResource.getContents().add(model);
		cromResource.save(Collections.EMPTY_MAP);
		
		// setup framed model
		Resource framedResource = impl.createResource(FRAMED_FILE_URI);
		org.framed.orm.model.Model framedModel = OrmFactory.eINSTANCE.createModel();
		
		Shape shape = OrmFactory.eINSTANCE.createShape();
		shape.setType(Type.NATURAL_TYPE);
		shape.setName("Natural Type 1");
		
		Segment seg = OrmFactory.eINSTANCE.createSegment();
		shape.setFirstSegment(seg);
		
		for(int i=0;i<5;i++) {
			NamedElement ele = OrmFactory.eINSTANCE.createNamedElement();
			ele.setName("Named Element " + i);
			seg.getElements().add(ele);
		}
		
		Shape shape2 = OrmFactory.eINSTANCE.createShape();
		shape2.setType(Type.NATURAL_TYPE);
		shape2.setName("Natural Type 2");
		
		
		framedModel.getElements().add(shape);
		framedModel.getElements().add(shape2);
		
		framedResource.getContents().add(framedModel);
		framedResource.save(Collections.EMPTY_MAP);
		
		TransformationExecutor exe = new TransformationExecutor();
		exe.setSourceModelFile(framedResource);
		exe.setTargetModelFile(cromResource);
		
		//exe.setForcedTransformation("NaturalType.etl");
		
		try {
			exe.execute();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		cromResource.load(Collections.EMPTY_MAP);
		System.out.println(cromResource.getContents());
		
		IEObjectMatcher matcher = DefaultMatchEngine.createDefaultEObjectMatcher(UseIdentifiers.NEVER);
		IComparisonFactory comparisonFactory = new DefaultComparisonFactory(new DefaultEqualityHelperFactory());
		IMatchEngine.Factory matchEngineFactory = new MatchEngineFactoryImpl(matcher, comparisonFactory);
	    matchEngineFactory.setRanking(20);
	    IMatchEngine.Factory.Registry matchEngineRegistry = new MatchEngineFactoryRegistryImpl();
	    matchEngineRegistry.add(matchEngineFactory);
		EMFCompare comparator = EMFCompare.builder().setMatchEngineFactoryRegistry(matchEngineRegistry).build();
		
		
		EObject toCompare = cromResource.getContents().get(0);
		IComparisonScope scope = new DefaultComparisonScope(model, toCompare, null);
		Comparison comp =  comparator.compare(scope);
		
		assertEquals(comp.getDifferences().toString(), 0, comp.getDifferences().size());
	}

	/**
	 * creates one {@link Model} and adds one {@link NaturalType} and one
	 * {@link CompartmentType} to it
	 * 
	 * @return
	 */
	private Model setupExpectedModel() {
		Crom_l1_composedFactory modelFactory = Crom_l1_composedFactoryImpl.eINSTANCE;

		// setup model
		Model model = modelFactory.createModel();

		// setup one natural type
		NaturalType naturalType = modelFactory.createNaturalType();
		naturalType.setName("Natural Type 1");

		for (int i = 0; i < 5; i++) {
			Attribute ele = modelFactory.createAttribute();
			ele.setName("Named Element " + i);
			naturalType.getAttributes().add(ele);
		}

		// setup one compartment type
		NaturalType compType = modelFactory.createNaturalType();
		compType.setName("Natural Type 2");

		// connect everything
		model.getElements().add(naturalType);
		model.getElements().add(compType);

		return model;
	}

	@Before
	public void before() {

		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("xmi", new XMIResourceFactoryImpl());
	}

	@After
	public void deleteModelFiles() throws IOException {
		Files.delete(Paths.get(CROM_FILE_URI.toFileString()));
		Files.delete(Paths.get(FRAMED_FILE_URI.toFileString()));
	}
}
