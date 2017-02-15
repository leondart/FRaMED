/*
 * generated by Xtext 2.10.0
 */
package org.framed.orm.editPolicy.model.dsl.ide.contentassist.antlr;

import com.google.inject.Inject;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.framed.orm.editPolicy.model.dsl.ide.contentassist.antlr.internal.InternalDslParser;
import org.framed.orm.editPolicy.model.dsl.services.DslGrammarAccess;

public class DslParser extends AbstractContentAssistParser {

	@Inject
	private DslGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalDslParser createParser() {
		InternalDslParser result = new InternalDslParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getAbstractRuleAccess().getAlternatives(), "rule__AbstractRule__Alternatives");
					put(grammarAccess.getAbstractMappingRuleAccess().getAlternatives(), "rule__AbstractMappingRule__Alternatives");
					put(grammarAccess.getEStringAccess().getAlternatives(), "rule__EString__Alternatives");
					put(grammarAccess.getModelAccess().getGroup(), "rule__Model__Group__0");
					put(grammarAccess.getModelAccess().getGroup_4(), "rule__Model__Group_4__0");
					put(grammarAccess.getModelAccess().getGroup_4_3(), "rule__Model__Group_4_3__0");
					put(grammarAccess.getConfigurationAccess().getGroup(), "rule__Configuration__Group__0");
					put(grammarAccess.getConfigurationAccess().getGroup_3(), "rule__Configuration__Group_3__0");
					put(grammarAccess.getConfigurationAccess().getGroup_3_3(), "rule__Configuration__Group_3_3__0");
					put(grammarAccess.getPolicyAccess().getGroup(), "rule__Policy__Group__0");
					put(grammarAccess.getMappingAccess().getGroup(), "rule__Mapping__Group__0");
					put(grammarAccess.getFeatureNameMappingRuleAccess().getGroup(), "rule__FeatureNameMappingRule__Group__0");
					put(grammarAccess.getAndMappingRuleAccess().getGroup(), "rule__AndMappingRule__Group__0");
					put(grammarAccess.getAndMappingRuleAccess().getGroup_5(), "rule__AndMappingRule__Group_5__0");
					put(grammarAccess.getNotMappingRuleAccess().getGroup(), "rule__NotMappingRule__Group__0");
					put(grammarAccess.getOrMappingRuleAccess().getGroup(), "rule__OrMappingRule__Group__0");
					put(grammarAccess.getOrMappingRuleAccess().getGroup_5(), "rule__OrMappingRule__Group_5__0");
					put(grammarAccess.getImplicationMappingRuleAccess().getGroup(), "rule__ImplicationMappingRule__Group__0");
					put(grammarAccess.getTrueMappingRuleAccess().getGroup(), "rule__TrueMappingRule__Group__0");
					put(grammarAccess.getAndRuleAccess().getGroup(), "rule__AndRule__Group__0");
					put(grammarAccess.getAndRuleAccess().getGroup_5(), "rule__AndRule__Group_5__0");
					put(grammarAccess.getRelationNameRuleAccess().getGroup(), "rule__RelationNameRule__Group__0");
					put(grammarAccess.getOrRuleAccess().getGroup(), "rule__OrRule__Group__0");
					put(grammarAccess.getOrRuleAccess().getGroup_5(), "rule__OrRule__Group_5__0");
					put(grammarAccess.getNotRuleAccess().getGroup(), "rule__NotRule__Group__0");
					put(grammarAccess.getImplicationRuleAccess().getGroup(), "rule__ImplicationRule__Group__0");
					put(grammarAccess.getSourceTypeRuleAccess().getGroup(), "rule__SourceTypeRule__Group__0");
					put(grammarAccess.getTargetTypeRuleAccess().getGroup(), "rule__TargetTypeRule__Group__0");
					put(grammarAccess.getCommandNameRuleAccess().getGroup(), "rule__CommandNameRule__Group__0");
					put(grammarAccess.getShapeTypeRuleAccess().getGroup(), "rule__ShapeTypeRule__Group__0");
					put(grammarAccess.getParentTypeRuleAccess().getGroup(), "rule__ParentTypeRule__Group__0");
					put(grammarAccess.getStepInRuleAccess().getGroup(), "rule__StepInRule__Group__0");
					put(grammarAccess.getTrueRuleAccess().getGroup(), "rule__TrueRule__Group__0");
					put(grammarAccess.getFalseRuleAccess().getGroup(), "rule__FalseRule__Group__0");
					put(grammarAccess.getShapeNameRuleAccess().getGroup(), "rule__ShapeNameRule__Group__0");
					put(grammarAccess.getModelAccess().getConfigurationAssignment_3(), "rule__Model__ConfigurationAssignment_3");
					put(grammarAccess.getModelAccess().getPoliciesAssignment_4_2(), "rule__Model__PoliciesAssignment_4_2");
					put(grammarAccess.getModelAccess().getPoliciesAssignment_4_3_1(), "rule__Model__PoliciesAssignment_4_3_1");
					put(grammarAccess.getConfigurationAccess().getMappingsAssignment_3_2(), "rule__Configuration__MappingsAssignment_3_2");
					put(grammarAccess.getConfigurationAccess().getMappingsAssignment_3_3_1(), "rule__Configuration__MappingsAssignment_3_3_1");
					put(grammarAccess.getPolicyAccess().getNameAssignment_1(), "rule__Policy__NameAssignment_1");
					put(grammarAccess.getPolicyAccess().getRuleAssignment_4(), "rule__Policy__RuleAssignment_4");
					put(grammarAccess.getMappingAccess().getPolicyAssignment_3(), "rule__Mapping__PolicyAssignment_3");
					put(grammarAccess.getMappingAccess().getRuleAssignment_5(), "rule__Mapping__RuleAssignment_5");
					put(grammarAccess.getFeatureNameMappingRuleAccess().getNameAssignment_2(), "rule__FeatureNameMappingRule__NameAssignment_2");
					put(grammarAccess.getAndMappingRuleAccess().getRulesAssignment_4(), "rule__AndMappingRule__RulesAssignment_4");
					put(grammarAccess.getAndMappingRuleAccess().getRulesAssignment_5_1(), "rule__AndMappingRule__RulesAssignment_5_1");
					put(grammarAccess.getNotMappingRuleAccess().getRuleAssignment_3(), "rule__NotMappingRule__RuleAssignment_3");
					put(grammarAccess.getOrMappingRuleAccess().getRulesAssignment_4(), "rule__OrMappingRule__RulesAssignment_4");
					put(grammarAccess.getOrMappingRuleAccess().getRulesAssignment_5_1(), "rule__OrMappingRule__RulesAssignment_5_1");
					put(grammarAccess.getImplicationMappingRuleAccess().getAntecedentAssignment_3(), "rule__ImplicationMappingRule__AntecedentAssignment_3");
					put(grammarAccess.getImplicationMappingRuleAccess().getConsequentAssignment_5(), "rule__ImplicationMappingRule__ConsequentAssignment_5");
					put(grammarAccess.getAndRuleAccess().getRulesAssignment_4(), "rule__AndRule__RulesAssignment_4");
					put(grammarAccess.getAndRuleAccess().getRulesAssignment_5_1(), "rule__AndRule__RulesAssignment_5_1");
					put(grammarAccess.getRelationNameRuleAccess().getNameAssignment_2(), "rule__RelationNameRule__NameAssignment_2");
					put(grammarAccess.getOrRuleAccess().getRulesAssignment_4(), "rule__OrRule__RulesAssignment_4");
					put(grammarAccess.getOrRuleAccess().getRulesAssignment_5_1(), "rule__OrRule__RulesAssignment_5_1");
					put(grammarAccess.getNotRuleAccess().getRuleAssignment_3(), "rule__NotRule__RuleAssignment_3");
					put(grammarAccess.getImplicationRuleAccess().getAntecedentAssignment_3(), "rule__ImplicationRule__AntecedentAssignment_3");
					put(grammarAccess.getImplicationRuleAccess().getConsequentAssignment_5(), "rule__ImplicationRule__ConsequentAssignment_5");
					put(grammarAccess.getSourceTypeRuleAccess().getNameAssignment_2(), "rule__SourceTypeRule__NameAssignment_2");
					put(grammarAccess.getTargetTypeRuleAccess().getNameAssignment_2(), "rule__TargetTypeRule__NameAssignment_2");
					put(grammarAccess.getCommandNameRuleAccess().getNameAssignment_2(), "rule__CommandNameRule__NameAssignment_2");
					put(grammarAccess.getShapeTypeRuleAccess().getNameAssignment_2(), "rule__ShapeTypeRule__NameAssignment_2");
					put(grammarAccess.getParentTypeRuleAccess().getNameAssignment_2(), "rule__ParentTypeRule__NameAssignment_2");
					put(grammarAccess.getShapeNameRuleAccess().getNameAssignment_2(), "rule__ShapeNameRule__NameAssignment_2");
				}
			};
		}
		return nameMappings.get(element);
	}

	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			InternalDslParser typedParser = (InternalDslParser) parser;
			typedParser.entryRuleModel();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public DslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(DslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
