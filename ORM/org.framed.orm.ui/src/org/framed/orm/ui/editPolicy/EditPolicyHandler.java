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

public class EditPolicyHandler {

	/**
	 * current configuration
	 */
	private FRaMEDConfiguration configuration;

	/**
	 * xmi model
	 */
	private editPolicyEcore1.Model model;

	/**
	 * list of Policy-Rules which need to be evaluated
	 */
	private Set<editPolicyEcore1.Policy> policies;

	public EditPolicyHandler(FRaMEDConfiguration configuration)
	{
		this.configuration = configuration;
		model = this.loadModel();

		this.loadPolicyRules();
	}

	/**
	 * loads all Policies which are activated by current configuration
	 */
	private void loadPolicyRules()
	{
		policies = new HashSet<>();

		EditPolicyConfigurationVisitor editPolicyConfigurationVisitor = new EditPolicyConfigurationVisitor(configuration);
		for(editPolicyEcore1.Mapping mapping : (editPolicyEcore1.Mapping[]) model.getConfiguration().getMappings().toArray()) {
			if(editPolicyConfigurationVisitor.abstractMappingRuleVisitor(mapping.getRule()))
				policies.add(mapping.getPolicy());
		}
	}


	public boolean canExecute(Command cmd)
	{
		this.loadPolicyRules();

		// Accessing the model information
		System.out.println("EditPolicyHandler CanExecuteq: " + cmd.getClass().toString());
		System.out.println("CanExecute XMI returns: " + canExecute(model, cmd));

		if (cmd instanceof ORMRelationCreateCommand)
			return canExecute((ORMRelationCreateCommand) cmd);

		return true;
	}

	private boolean canExecute(editPolicyEcore1.Model model, Command cmd)
	{
		System.out.println("List of Policies: " + policies.toString());

		EditPolicyRuleVisitor editPolicyRuleVisitor = new EditPolicyRuleVisitor(cmd);


		for(editPolicyEcore1.Policy policy: policies) {
			if(!editPolicyRuleVisitor.abstractRuleVisitor(policy.getRule()))
				return false;
		}
		return true;
	}

	public boolean canExecute(ORMRelationCreateCommand relationCommand)
	{
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


	private editPolicyEcore1.Model loadModel() {

		String filename = new String("platform:/plugin/org.framed.orm.ui.EditPolicyModel/model/Model.xmi");
		try {
			ResourceSet set = new ResourceSetImpl();
			Resource res = set.createResource(URI.createURI(filename));
			res.load(Collections.EMPTY_MAP);
			// if there are file contents in this directory
			if (res.getContents().size() > 0
					&& res.getContents().get(0) instanceof editPolicyEcore1.Model) {
				// load test file and add it to test list

				return (editPolicyEcore1.Model) res.getContents().get(0);
			}
		} catch (Exception e) {
			System.err.println("Was not able to load xmi:  \"" + filename + "\" due : " + e.toString());
			for (StackTraceElement el : e.getStackTrace())
				System.err.println(el.toString());
		}
		return null;
	}
}


