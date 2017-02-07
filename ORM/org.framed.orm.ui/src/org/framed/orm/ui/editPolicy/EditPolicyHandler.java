package org.framed.orm.ui.editPolicy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.gef.commands.Command;
import org.framed.orm.featuremodel.FRaMEDConfiguration;
import org.framed.orm.featuremodel.FRaMEDFeature;
import org.framed.orm.model.Type;
import org.framed.orm.ui.command.connectionkinds.ORMRelationCreateCommand;

public class EditPolicyHandler {

	public boolean canExecute(Command cmd) {
		editPolicyEcore1.Model model = this.getModel();
		System.out.println("xmi loaded. ");

		// Accessing the model information
		System.out.println("EditPolicyHandler CanExecuteq: " + cmd.getClass().toString());
		System.out.println("canExecuteECORE returns: " + canExecute(model, null, cmd));

		if (cmd instanceof ORMRelationCreateCommand)
			return canExecute((ORMRelationCreateCommand) cmd);

		return true;
	}

	private boolean canExecute(editPolicyEcore1.Model model, FRaMEDConfiguration framedConfiguration, Command cmd)
	{
		Set<String> policies = new HashSet<>();
		//get list of policies for configuration

		EditPolicyConfigurationVisitor editPolicyConfigurationVisitor = new EditPolicyConfigurationVisitor();
		editPolicyConfigurationVisitor.setConfiguration(framedConfiguration);

		for(editPolicyEcore1.Mapping mapping : (editPolicyEcore1.Mapping[]) model.getConfiguration().getMappings().toArray()) {
			if(editPolicyConfigurationVisitor.abstractMappingRuleVisitor(mapping.getRule()))
				policies.add(mapping.getPolicyName());
		}
		//System.out.println("List of Policies: " + policies.toString());

		EditPolicyRuleVisitor editPolicyRuleVisitor = new EditPolicyRuleVisitor();
		editPolicyRuleVisitor.setCommand(cmd);

		for(editPolicyEcore1.Policy policy: model.getPolicies()) {
			if(policies.contains(policy.getName())) {
				if(!editPolicyRuleVisitor.abstractRuleVisitor(policy.getRule()))
					return false;
			}
		}
		return true;
	}

	public boolean canExecute(ORMRelationCreateCommand relationCommand)
	{

		FRaMEDConfiguration framedConfiguration = relationCommand.getSource()
				.getContainer().getFramedConfiguration();

		List<String> fRaMEDConfigurationFeatureNames = new ArrayList<String>();
		// create a list of all Feature Names as Strings within the
		// framedConfiguration
		for (FRaMEDFeature feature : framedConfiguration.getFeatures()) {
			fRaMEDConfigurationFeatureNames.add(feature.getName().getName());
			// System.out.println("EditPolicyHandler feature: " +
			// feature.getName().getName());
		}

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


	private editPolicyEcore1.Model getModel() {

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


