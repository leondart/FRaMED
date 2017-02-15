/*
 * generated by Xtext 2.10.0
 */
package org.framed.orm.editPolicy.model.dsl.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import model.Policy
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.xmi.XMIResource
import java.util.HashMap
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import java.io.ByteArrayOutputStream
import java.util.Collections

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class DslGenerator extends AbstractGenerator {
	
	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {		
				/*
				fsa.generateFile('greetings.txt', 'People to greet: ' + resource.allContents
				.filter(typeof(Policy))
				.map[name]
				.join(', '));
				*/
		val registry = Resource.Factory.Registry.INSTANCE
		val extensionToFactoryMap = registry.extensionToFactoryMap
		extensionToFactoryMap.put("editpolicy", new XMIResourceFactoryImpl)
		
		val xmiUri = resource.URI.trimFileExtension.appendFileExtension("xmi")
		val outResourceSet = new ResourceSetImpl
		val outResource = outResourceSet.createResource(xmiUri)
		outResource.contents.addAll(resource.contents)
		
		val outBuffer = new ByteArrayOutputStream
		outResource.save(outBuffer, Collections.EMPTY_MAP)
		fsa.generateFile(xmiUri.lastSegment, outBuffer.toString)	
		
	}
}
