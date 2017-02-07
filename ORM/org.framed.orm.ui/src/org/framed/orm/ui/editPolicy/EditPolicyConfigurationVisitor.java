package org.framed.orm.ui.editPolicy;

import org.framed.orm.featuremodel.FRaMEDConfiguration;

public class EditPolicyConfigurationVisitor {

	private FRaMEDConfiguration framedConfiguration;

	public void setConfiguration(FRaMEDConfiguration framedConfiguration)
	{
		this.framedConfiguration = framedConfiguration;
	}


	public boolean abstractMappingRuleVisitor(editPolicyEcore1.AbstractMappingRule rule)
	{
		if (rule instanceof editPolicyEcore1.AndMappingRule)
			return andMappingRuleVisitor((editPolicyEcore1.AndMappingRule)rule);
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

	private boolean featureNameMappingRuleVisitor(editPolicyEcore1.FeatureNameMappingRule rule)
	{
		if(rule.getName().equals("FeatureConfigurationSettingTEST")) {
			return true;
		}
		return false;
	}

}
