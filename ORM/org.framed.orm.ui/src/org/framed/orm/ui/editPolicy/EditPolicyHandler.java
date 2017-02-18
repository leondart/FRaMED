package org.framed.orm.ui.editPolicy;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.gef.commands.Command;
import org.framed.orm.featuremodel.FRaMEDConfiguration;
import org.framed.orm.model.Type;
import org.framed.orm.ui.command.connectionkinds.ORMRelationCreateCommand;
import org.framed.orm.ui.editor.ORMGraphicalEditor;
import org.framed.orm.ui.editor.ORMGraphicalEditor.EditorType;
import org.framed.orm.ui.editor.ORMGraphicalEditorObserver;

public class EditPolicyHandler implements ORMGraphicalEditorObserver {

	/**
	 * current configuration
	 */
	private FRaMEDConfiguration configuration;

	/**
	 * whether editor is in stepOut or stepIn-View
	 */
	private boolean isStepOut;
	/**
	 * xmi model
	 */
	private model.Model model;

	/**
	 * list of Policy-Rules which need to be evaluated
	 */
	private Set<model.Policy> policies;

	public EditPolicyHandler(FRaMEDConfiguration configuration) {
		this.configuration = configuration;
		model = this.loadModel();

		this.loadPolicyRules();
	}

	/**
	 * loads all Policies which are activated by current configuration
	 */
	private void loadPolicyRules() {
		/*
		 * System.out.println("-------------------------------"); for
		 * (FRaMEDFeature feature : this.configuration.getFeatures()) {
		 * System.out.println("EditPolicyHandler feature: " +
		 * feature.getName().getName()); }
		 * System.out.println("-------------------------------");
		 */
		policies = new HashSet<>();

		EditPolicyConfigurationVisitor editPolicyConfigurationVisitor = new EditPolicyConfigurationVisitor(
				configuration);
		for (model.Mapping mapping : (model.Mapping[]) model.getConfiguration()
				.getMappings().toArray()) {
			if (editPolicyConfigurationVisitor
					.abstractMappingRuleVisitor(mapping.getRule()))
				policies.add(mapping.getPolicy());
		}
	}

	public boolean canExecute(Command cmd) {
		// Accessing the model information
		System.out.println("EditPolicyHandler CanExecuteq: "
				+ cmd.getClass().toString());
		System.out.println("CanExecute XMI returns: " + canExecute(model, cmd));

		if (cmd instanceof ORMRelationCreateCommand)
			return canExecute((ORMRelationCreateCommand) cmd);

		return true;
	}

	private boolean canExecute(model.Model model, Command cmd) {
		System.out.println("List of Policies: " + policies.toString());

		EditPolicyRuleVisitor editPolicyRuleVisitor = new EditPolicyRuleVisitor(cmd, this.isStepOut);

		for (model.Policy policy : policies) {
			if (!editPolicyRuleVisitor.abstractRuleVisitor(policy.getRule()))
				return false;
		}
		return true;
	}

	public boolean canExecute(ORMRelationCreateCommand relationCommand) {
		int val = relationCommand.getRelation().getType().getValue();
		switch (val) {
		case Type.RELATIONSHIP_VALUE:
			return true;
		case Type.IRREFLEXIVE_VALUE:
		case Type.TOTAL_VALUE:
		case Type.CYCLIC_VALUE:
		case Type.ACYCLIC_VALUE:
		case Type.REFLEXIVE_VALUE:
			return relationCommand.getReferencedRelations().size() == 1;
		case Type.INHERITANCE_VALUE:
			return relationCommand.checkCycle(relationCommand.getTarget(),
					relationCommand.getSource());
		}
		return true;
	}

	private model.Model loadModel() {

		// String filename = new
		// String("platform:/plugin/org.framed.orm.editPolicy.model/model/EditPolicy_noRules.xmi");
		String filename = new String(
				"platform:/plugin/org.framed.orm.editPolicy.model/model/EditPolicy.xmi");
		try {
			ResourceSet set = new ResourceSetImpl();
			Resource res = set.createResource(URI.createURI(filename));
			res.load(Collections.EMPTY_MAP);
			// if there are file contents in this directory
			if (res.getContents().size() > 0
					&& res.getContents().get(0) instanceof model.Model) {
				// load test file and add it to test list

				return (model.Model) res.getContents().get(0);
			}
		} catch (Exception e) {
			System.err.println("Was not able to load xmi:  \"" + filename
					+ "\" due : " + e.toString());
			for (StackTraceElement el : e.getStackTrace())
				System.err.println(el.toString());
		}
		return null;
	}

	/**
	 * This method updates the reloads the configuration it is called when
	 * configuration has changed.
	 *
	 **/
	public void update(final ORMGraphicalEditor.EditorType type) {
		this.isStepOut = false;
		if (type.equals(EditorType.COMPARTMENT)) {
			this.isStepOut = true;
		}
		this.loadPolicyRules();
	}

	/**
	 * This method updates the reloads the configuration it is called when
	 * configuration has changed.
	 *
	 **/
	public void update(final String type) {
		this.isStepOut = false;
		if (type.equals("StepOutNewPage")) {
			this.isStepOut = true;
		}
		this.loadPolicyRules();
	}
}
