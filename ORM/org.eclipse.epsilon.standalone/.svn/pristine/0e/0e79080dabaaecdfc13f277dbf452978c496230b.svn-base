package org.eclipse.epsilon.standalone.handlers;

import java.io.IOException;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResourceRuleFactory;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.jobs.ISchedulingRule;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.epsilon.standalone.attributes.EtlExtensionAttribute;
import org.eclipse.epsilon.standalone.jobs.EtlTransformOperationJob;
import org.eclipse.epsilon.standalone.util.ExtensionUtil;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ITreeSelection;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;

public abstract class AbstractTransformationHandler extends AbstractHandler {

	private EtlTransformOperationJob job;

	public AbstractTransformationHandler() {
		job = new EtlTransformOperationJob("ETL Transform Job");
	}

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		String pluginID = getPluginID();
		IFile selectedModelFile = getSelectedModelFile(event);
		EtlTransformOperationJob job = initializeJob(pluginID,
				selectedModelFile);
		executeJob(selectedModelFile, job);
		return null;
	}

	private IFile getSelectedModelFile(ExecutionEvent event)
			throws ExecutionException {
		IWorkbenchWindow window = HandlerUtil
				.getActiveWorkbenchWindowChecked(event);
		ISelection selection = window.getSelectionService().getSelection();
		ITreeSelection structuredSelection = (ITreeSelection) selection;
		Object element = structuredSelection.getFirstElement();
		IFile selectedModelFile = (IFile) element;
		return selectedModelFile;
	}

	private EtlTransformOperationJob initializeJob(String pluginID,
			IFile selectedModelFile) {
		IConfigurationElement configurationElement = ExtensionUtil
				.findConfigurationElementForPlugin(pluginID);
		EtlTransformOperationJob job = buildJob(configurationElement);
		String sourceModelFilePath = selectedModelFile.getLocation()
				.toOSString();
		job.setsourceModelFilePath(sourceModelFilePath);
		String targetModelFile = createTargetFile(selectedModelFile,
				configurationElement);
		job.setTargetModelFile(targetModelFile);
		job.setContributer(getPluginID());
		return job;
	}

	private void executeJob(IFile selectedModelFile,
			EtlTransformOperationJob job) {
		IWorkspace workspace = ResourcesPlugin.getWorkspace();
		IResourceRuleFactory ruleFactory = workspace.getRuleFactory();
		ISchedulingRule rule = ruleFactory.modifyRule(selectedModelFile
				.getProject());
		job.setUser(true);
		job.setPriority(Job.INTERACTIVE);
		job.setRule(rule);
		job.schedule();
	}

	private EtlTransformOperationJob buildJob(
			IConfigurationElement configurationElement) {
		for (EtlExtensionAttribute attribute : EtlExtensionAttribute.values()) {
			String attributeValue = configurationElement.getAttribute(attribute
					.getName());
			attribute.setAttributeFor(job, attributeValue);
		}
		return job;
	}

	private String createTargetFile(IFile selectedModelFile,
			IConfigurationElement configurationElement) {
		String targetMetaModelURI = configurationElement
				.getAttribute(EtlExtensionAttribute.TARGET_META_MODEL_URI
						.getName());
		String modelFileExtension = EPackage.Registry.INSTANCE.getEPackage(
				targetMetaModelURI).getNsPrefix();
		int index = selectedModelFile.getName().indexOf(
				selectedModelFile.getFileExtension());
		String fileName = selectedModelFile.getName().substring(0, index);
		String targetModelFile = selectedModelFile.getProject().getLocation()
				.toOSString()
				+ "/" + fileName + modelFileExtension;

		ResourceSet resourceSet = new ResourceSetImpl();
		org.eclipse.emf.common.util.URI orocosModelURI = org.eclipse.emf.common.util.URI
				.createFileURI(targetModelFile);
		Resource resource = resourceSet.createResource(orocosModelURI);
		try {
			resource.save(null);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return targetModelFile;
	}

	public abstract String getPluginID();

}
