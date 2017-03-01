package org.framed.orm.ui.editPolicy;

import java.util.ArrayList;
import java.util.List;

import org.framed.orm.featuremodel.FRaMEDConfiguration;
import org.framed.orm.featuremodel.FRaMEDFeature;

/**
 * This class provides the rule-parse for the editPolicy-Mapping-configuration. Using VisitorPattern
 *
 * @author Christian Deussen
 *
 */
public class EditPolicyConfigurationVisitor {

	/**
	 * current configuration of editor
	 */
	private FRaMEDConfiguration configuration;

	public EditPolicyConfigurationVisitor(FRaMEDConfiguration framedConfiguration)
	{
		this.configuration = framedConfiguration;
	}

	/**
	 * root Visitor of mappingRule:
	 * dispatches to specific rule
	 *
	 * returns whether the given rule is enabled according to configuration
	 *
	 * @param rule
	 * @return Boolean
	 */
	public boolean abstractMappingRuleVisitor(model.AbstractMappingRule rule)
	{
		if (rule instanceof model.AndMappingRule)
			return andMappingRuleVisitor((model.AndMappingRule)rule);
		if (rule instanceof model.OrMappingRule)
			return orMappingRuleVisitor((model.OrMappingRule)rule);
		if (rule instanceof model.NotMappingRule)
			return notMappingRuleVisitor((model.NotMappingRule)rule);
		if (rule instanceof model.ImplicationMappingRule)
			return implicationMappingRuleVisitor((model.ImplicationMappingRule)rule);
		if (rule instanceof model.FeatureNameMappingRule)
			return featureNameMappingRuleVisitor((model.FeatureNameMappingRule)rule);
		if (rule instanceof model.TrueMappingRule)
			return true;

		System.out.println("NodeMappingVisitor for " + rule.getClass().toString() + " not implemented");
		return false;
	}

	/**
	 * logical AND
	 * @param rule
	 * @return Boolean
	 */
	private boolean andMappingRuleVisitor(model.AndMappingRule rule)
	{
		for(model.AbstractMappingRule abstractMappingRule : rule.getRules()) {
			if(!abstractMappingRuleVisitor(abstractMappingRule)) return false;
		}
		return true;
	}

	/**
	 * Logical NOT
	 * @param rule
	 * @return Boolean
	 */
	private boolean notMappingRuleVisitor(model.NotMappingRule rule)
	{
		return !abstractMappingRuleVisitor(rule.getRule());
	}

	/**
	 * Logical OR
	 * @param rule
	 * @return
	 */
	private boolean orMappingRuleVisitor(model.OrMappingRule rule)
	{
		for(model.AbstractMappingRule abstractMappingRule : rule.getRules()) {
			if(abstractMappingRuleVisitor(abstractMappingRule)) return true;
		}
		return false;
	}

	/**
	 * logical implication
	 * @param rule
	 * @return Boolean
	 */
	private boolean implicationMappingRuleVisitor(model.ImplicationMappingRule rule)
	{
		if(abstractMappingRuleVisitor(rule.getAntecedent())) {
			return abstractMappingRuleVisitor(rule.getConsequent());
		}
		return true;
	}

	/**
	 * checks whether feature is enabled in configuration
	 * @param rule
	 * @return Boolean
	 */
	private boolean featureNameMappingRuleVisitor(model.FeatureNameMappingRule rule)
	{
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
