package org.framed.orm.ui.editPolicy;

import java.util.ArrayList;
import java.util.List;

import org.framed.orm.featuremodel.FRaMEDConfiguration;
import org.framed.orm.featuremodel.FRaMEDFeature;

public class EditPolicyConfigurationVisitor {

	public EditPolicyConfigurationVisitor(FRaMEDConfiguration framedConfiguration)
	{
		this.configuration = framedConfiguration;

	}
	private FRaMEDConfiguration configuration;

	public boolean abstractMappingRuleVisitor(editPolicyEcore1.AbstractMappingRule rule)
	{
		if (rule instanceof editPolicyEcore1.AndMappingRule)
			return andMappingRuleVisitor((editPolicyEcore1.AndMappingRule)rule);
		if (rule instanceof editPolicyEcore1.OrMappingRule)
			return orMappingRuleVisitor((editPolicyEcore1.OrMappingRule)rule);
		if (rule instanceof editPolicyEcore1.NotMappingRule)
			return notMappingRuleVisitor((editPolicyEcore1.NotMappingRule)rule);
		if (rule instanceof editPolicyEcore1.ImplicationMappingRule)
			return implicationMappingRuleVisitor((editPolicyEcore1.ImplicationMappingRule)rule);
		if (rule instanceof editPolicyEcore1.FeatureNameMappingRule)
			return featureNameMappingRuleVisitor((editPolicyEcore1.FeatureNameMappingRule)rule);

		System.out.println("NodeVisitor for type not implemented");
		return false;
	}

	private boolean andMappingRuleVisitor(editPolicyEcore1.AndMappingRule rule)
	{
		for(editPolicyEcore1.AbstractMappingRule abstractMappingRule : rule.getRules()) {
			if(!abstractMappingRuleVisitor(abstractMappingRule)) return false;
		}
		return true;
	}

	private boolean notMappingRuleVisitor(editPolicyEcore1.NotMappingRule rule)
	{
		return !abstractMappingRuleVisitor(rule.getRule());
	}

	private boolean orMappingRuleVisitor(editPolicyEcore1.OrMappingRule rule)
	{
		for(editPolicyEcore1.AbstractMappingRule abstractMappingRule : rule.getRules()) {
			if(abstractMappingRuleVisitor(abstractMappingRule)) return true;
		}
		return false;
	}

	private boolean implicationMappingRuleVisitor(editPolicyEcore1.ImplicationMappingRule rule)
	{
		if(abstractMappingRuleVisitor(rule.getAntecedent())) {
			return abstractMappingRuleVisitor(rule.getConsequent());
		}
		return true;
	}


	private boolean featureNameMappingRuleVisitor(editPolicyEcore1.FeatureNameMappingRule rule)
	{
		//test for terminal-symbol "true"
		if(rule.getName().equals("true"))
			return true;

 		List<String> features = new ArrayList<String>();

 		for (FRaMEDFeature feature : this.configuration.getFeatures()) {
 			features.add(feature.getName().getName());
 			//System.out.println("EditPolicyHandler feature: " + feature.getName().getName());
 		}

		if(features.contains(rule.getName())) {
			return true;
		}
		return false;
	}

}
