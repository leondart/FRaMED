/*
 * generated by Xtext 2.10.0
 */
package org.framed.orm.editPolicy.model.dsl.serializer;

import com.google.inject.Inject;
import java.util.Set;
import model.AndMappingRule;
import model.AndRule;
import model.CommandNameRule;
import model.Configuration;
import model.FalseRule;
import model.FeatureNameMappingRule;
import model.ImplicationMappingRule;
import model.ImplicationRule;
import model.Mapping;
import model.Model;
import model.ModelPackage;
import model.NotMappingRule;
import model.NotRule;
import model.OrMappingRule;
import model.OrRule;
import model.ParentTypeRule;
import model.Policy;
import model.RelationIsCyclicRule;
import model.RelationIsReflexivRule;
import model.RelationNameRule;
import model.RelationTypesAreEqualRule;
import model.ShapeNameRule;
import model.ShapeTypeRule;
import model.SourceTypeRule;
import model.StepInRule;
import model.TargetTypeRule;
import model.TrueMappingRule;
import model.TrueRule;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.framed.orm.editPolicy.model.dsl.services.DslGrammarAccess;

@SuppressWarnings("all")
public class DslSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private DslGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == ModelPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case ModelPackage.AND_MAPPING_RULE:
				if (rule == grammarAccess.getAbstractMappingRuleRule()
						|| rule == grammarAccess.getAndMappingRuleRule()) {
					sequence_AndMappingRule(context, (AndMappingRule) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getMappingExpressionRule()
						|| rule == grammarAccess.getAndMappingRule()
						|| action == grammarAccess.getAndMappingAccess().getAndMappingRuleRulesAction_1_0()
						|| rule == grammarAccess.getOrMappingRule()
						|| action == grammarAccess.getOrMappingAccess().getOrMappingRuleRulesAction_1_0()
						|| rule == grammarAccess.getPrimaryRule()) {
					sequence_AndMapping(context, (AndMappingRule) semanticObject); 
					return; 
				}
				else break;
			case ModelPackage.AND_RULE:
				sequence_AndRule(context, (AndRule) semanticObject); 
				return; 
			case ModelPackage.COMMAND_NAME_RULE:
				sequence_CommandNameRule(context, (CommandNameRule) semanticObject); 
				return; 
			case ModelPackage.CONFIGURATION:
				sequence_Configuration(context, (Configuration) semanticObject); 
				return; 
			case ModelPackage.FALSE_RULE:
				sequence_FalseRule(context, (FalseRule) semanticObject); 
				return; 
			case ModelPackage.FEATURE_NAME_MAPPING_RULE:
				sequence_FeatureNameMappingRule(context, (FeatureNameMappingRule) semanticObject); 
				return; 
			case ModelPackage.IMPLICATION_MAPPING_RULE:
				sequence_ImplicationMappingRule(context, (ImplicationMappingRule) semanticObject); 
				return; 
			case ModelPackage.IMPLICATION_RULE:
				sequence_ImplicationRule(context, (ImplicationRule) semanticObject); 
				return; 
			case ModelPackage.MAPPING:
				sequence_Mapping(context, (Mapping) semanticObject); 
				return; 
			case ModelPackage.MODEL:
				sequence_Model(context, (Model) semanticObject); 
				return; 
			case ModelPackage.NOT_MAPPING_RULE:
				if (rule == grammarAccess.getMappingExpressionRule()
						|| rule == grammarAccess.getAndMappingRule()
						|| action == grammarAccess.getAndMappingAccess().getAndMappingRuleRulesAction_1_0()
						|| rule == grammarAccess.getOrMappingRule()
						|| action == grammarAccess.getOrMappingAccess().getOrMappingRuleRulesAction_1_0()
						|| rule == grammarAccess.getPrimaryRule()) {
					sequence_MappingExpression(context, (NotMappingRule) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getAbstractMappingRuleRule()
						|| rule == grammarAccess.getNotMappingRuleRule()) {
					sequence_NotMappingRule(context, (NotMappingRule) semanticObject); 
					return; 
				}
				else break;
			case ModelPackage.NOT_RULE:
				sequence_NotRule(context, (NotRule) semanticObject); 
				return; 
			case ModelPackage.OR_MAPPING_RULE:
				if (rule == grammarAccess.getAbstractMappingRuleRule()
						|| rule == grammarAccess.getOrMappingRuleRule()) {
					sequence_OrMappingRule(context, (OrMappingRule) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getMappingExpressionRule()
						|| rule == grammarAccess.getAndMappingRule()
						|| action == grammarAccess.getAndMappingAccess().getAndMappingRuleRulesAction_1_0()
						|| rule == grammarAccess.getOrMappingRule()
						|| action == grammarAccess.getOrMappingAccess().getOrMappingRuleRulesAction_1_0()
						|| rule == grammarAccess.getPrimaryRule()) {
					sequence_OrMapping(context, (OrMappingRule) semanticObject); 
					return; 
				}
				else break;
			case ModelPackage.OR_RULE:
				sequence_OrRule(context, (OrRule) semanticObject); 
				return; 
			case ModelPackage.PARENT_TYPE_RULE:
				sequence_ParentTypeRule(context, (ParentTypeRule) semanticObject); 
				return; 
			case ModelPackage.POLICY:
				sequence_Policy(context, (Policy) semanticObject); 
				return; 
			case ModelPackage.RELATION_IS_CYCLIC_RULE:
				sequence_RelationIsCyclicRule(context, (RelationIsCyclicRule) semanticObject); 
				return; 
			case ModelPackage.RELATION_IS_REFLEXIV_RULE:
				sequence_RelationIsReflexivRule(context, (RelationIsReflexivRule) semanticObject); 
				return; 
			case ModelPackage.RELATION_NAME_RULE:
				sequence_RelationNameRule(context, (RelationNameRule) semanticObject); 
				return; 
			case ModelPackage.RELATION_TYPES_ARE_EQUAL_RULE:
				sequence_RelationTypesAreEqualRule(context, (RelationTypesAreEqualRule) semanticObject); 
				return; 
			case ModelPackage.SHAPE_NAME_RULE:
				sequence_ShapeNameRule(context, (ShapeNameRule) semanticObject); 
				return; 
			case ModelPackage.SHAPE_TYPE_RULE:
				sequence_ShapeTypeRule(context, (ShapeTypeRule) semanticObject); 
				return; 
			case ModelPackage.SOURCE_TYPE_RULE:
				sequence_SourceTypeRule(context, (SourceTypeRule) semanticObject); 
				return; 
			case ModelPackage.STEP_IN_RULE:
				sequence_StepInRule(context, (StepInRule) semanticObject); 
				return; 
			case ModelPackage.TARGET_TYPE_RULE:
				sequence_TargetTypeRule(context, (TargetTypeRule) semanticObject); 
				return; 
			case ModelPackage.TRUE_MAPPING_RULE:
				sequence_TrueMappingRule(context, (TrueMappingRule) semanticObject); 
				return; 
			case ModelPackage.TRUE_RULE:
				sequence_TrueRule(context, (TrueRule) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     AbstractMappingRule returns AndMappingRule
	 *     AndMappingRule returns AndMappingRule
	 *
	 * Constraint:
	 *     (rules+=AbstractMappingRule rules+=AbstractMappingRule*)
	 */
	protected void sequence_AndMappingRule(ISerializationContext context, AndMappingRule semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     MappingExpression returns AndMappingRule
	 *     AndMapping returns AndMappingRule
	 *     AndMapping.AndMappingRule_1_0 returns AndMappingRule
	 *     OrMapping returns AndMappingRule
	 *     OrMapping.OrMappingRule_1_0 returns AndMappingRule
	 *     Primary returns AndMappingRule
	 *
	 * Constraint:
	 *     (rules+=AndMapping_AndMappingRule_1_0 rules+=OrMapping)
	 */
	protected void sequence_AndMapping(ISerializationContext context, AndMappingRule semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     AbstractRule returns AndRule
	 *     AndRule returns AndRule
	 *
	 * Constraint:
	 *     (rules+=AbstractRule rules+=AbstractRule*)
	 */
	protected void sequence_AndRule(ISerializationContext context, AndRule semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     AbstractRule returns CommandNameRule
	 *     CommandNameRule returns CommandNameRule
	 *
	 * Constraint:
	 *     name=EString
	 */
	protected void sequence_CommandNameRule(ISerializationContext context, CommandNameRule semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ModelPackage.Literals.ABSTRACT_NAME_RULE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ModelPackage.Literals.ABSTRACT_NAME_RULE__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getCommandNameRuleAccess().getNameEStringParserRuleCall_2_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Configuration returns Configuration
	 *
	 * Constraint:
	 *     (mappings+=Mapping mappings+=Mapping*)?
	 */
	protected void sequence_Configuration(ISerializationContext context, Configuration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     AbstractRule returns FalseRule
	 *     FalseRule returns FalseRule
	 *
	 * Constraint:
	 *     {FalseRule}
	 */
	protected void sequence_FalseRule(ISerializationContext context, FalseRule semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     AbstractMappingRule returns FeatureNameMappingRule
	 *     FeatureNameMappingRule returns FeatureNameMappingRule
	 *     MappingExpression returns FeatureNameMappingRule
	 *     AndMapping returns FeatureNameMappingRule
	 *     AndMapping.AndMappingRule_1_0 returns FeatureNameMappingRule
	 *     OrMapping returns FeatureNameMappingRule
	 *     OrMapping.OrMappingRule_1_0 returns FeatureNameMappingRule
	 *     Primary returns FeatureNameMappingRule
	 *
	 * Constraint:
	 *     name=EString
	 */
	protected void sequence_FeatureNameMappingRule(ISerializationContext context, FeatureNameMappingRule semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ModelPackage.Literals.FEATURE_NAME_MAPPING_RULE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ModelPackage.Literals.FEATURE_NAME_MAPPING_RULE__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getFeatureNameMappingRuleAccess().getNameEStringParserRuleCall_2_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     AbstractMappingRule returns ImplicationMappingRule
	 *     ImplicationMappingRule returns ImplicationMappingRule
	 *
	 * Constraint:
	 *     (antecedent=AbstractMappingRule consequent=AbstractMappingRule)
	 */
	protected void sequence_ImplicationMappingRule(ISerializationContext context, ImplicationMappingRule semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ModelPackage.Literals.IMPLICATION_MAPPING_RULE__ANTECEDENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ModelPackage.Literals.IMPLICATION_MAPPING_RULE__ANTECEDENT));
			if (transientValues.isValueTransient(semanticObject, ModelPackage.Literals.IMPLICATION_MAPPING_RULE__CONSEQUENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ModelPackage.Literals.IMPLICATION_MAPPING_RULE__CONSEQUENT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getImplicationMappingRuleAccess().getAntecedentAbstractMappingRuleParserRuleCall_3_0(), semanticObject.getAntecedent());
		feeder.accept(grammarAccess.getImplicationMappingRuleAccess().getConsequentAbstractMappingRuleParserRuleCall_5_0(), semanticObject.getConsequent());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     AbstractRule returns ImplicationRule
	 *     ImplicationRule returns ImplicationRule
	 *
	 * Constraint:
	 *     (antecedent=AbstractRule consequent=AbstractRule)
	 */
	protected void sequence_ImplicationRule(ISerializationContext context, ImplicationRule semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ModelPackage.Literals.IMPLICATION_RULE__ANTECEDENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ModelPackage.Literals.IMPLICATION_RULE__ANTECEDENT));
			if (transientValues.isValueTransient(semanticObject, ModelPackage.Literals.IMPLICATION_RULE__CONSEQUENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ModelPackage.Literals.IMPLICATION_RULE__CONSEQUENT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getImplicationRuleAccess().getAntecedentAbstractRuleParserRuleCall_3_0(), semanticObject.getAntecedent());
		feeder.accept(grammarAccess.getImplicationRuleAccess().getConsequentAbstractRuleParserRuleCall_5_0(), semanticObject.getConsequent());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     MappingExpression returns NotMappingRule
	 *     AndMapping returns NotMappingRule
	 *     AndMapping.AndMappingRule_1_0 returns NotMappingRule
	 *     OrMapping returns NotMappingRule
	 *     OrMapping.OrMappingRule_1_0 returns NotMappingRule
	 *     Primary returns NotMappingRule
	 *
	 * Constraint:
	 *     rule=AndMapping
	 */
	protected void sequence_MappingExpression(ISerializationContext context, NotMappingRule semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ModelPackage.Literals.NOT_MAPPING_RULE__RULE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ModelPackage.Literals.NOT_MAPPING_RULE__RULE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getMappingExpressionAccess().getRuleAndMappingParserRuleCall_1_2_0(), semanticObject.getRule());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Mapping returns Mapping
	 *
	 * Constraint:
	 *     ((rule=AbstractMappingRule | rule=MappingExpression) policy=[Policy|ID])
	 */
	protected void sequence_Mapping(ISerializationContext context, Mapping semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Model returns Model
	 *
	 * Constraint:
	 *     (configuration=Configuration (policies+=Policy policies+=Policy*)?)
	 */
	protected void sequence_Model(ISerializationContext context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     AbstractMappingRule returns NotMappingRule
	 *     NotMappingRule returns NotMappingRule
	 *
	 * Constraint:
	 *     rule=AbstractMappingRule
	 */
	protected void sequence_NotMappingRule(ISerializationContext context, NotMappingRule semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ModelPackage.Literals.NOT_MAPPING_RULE__RULE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ModelPackage.Literals.NOT_MAPPING_RULE__RULE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getNotMappingRuleAccess().getRuleAbstractMappingRuleParserRuleCall_1_0(), semanticObject.getRule());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     AbstractRule returns NotRule
	 *     NotRule returns NotRule
	 *
	 * Constraint:
	 *     rule=AbstractRule
	 */
	protected void sequence_NotRule(ISerializationContext context, NotRule semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ModelPackage.Literals.NOT_RULE__RULE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ModelPackage.Literals.NOT_RULE__RULE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getNotRuleAccess().getRuleAbstractRuleParserRuleCall_2_0(), semanticObject.getRule());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     AbstractMappingRule returns OrMappingRule
	 *     OrMappingRule returns OrMappingRule
	 *
	 * Constraint:
	 *     (rules+=AbstractMappingRule rules+=AbstractMappingRule*)
	 */
	protected void sequence_OrMappingRule(ISerializationContext context, OrMappingRule semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     MappingExpression returns OrMappingRule
	 *     AndMapping returns OrMappingRule
	 *     AndMapping.AndMappingRule_1_0 returns OrMappingRule
	 *     OrMapping returns OrMappingRule
	 *     OrMapping.OrMappingRule_1_0 returns OrMappingRule
	 *     Primary returns OrMappingRule
	 *
	 * Constraint:
	 *     (rules+=OrMapping_OrMappingRule_1_0 rules+=Primary)
	 */
	protected void sequence_OrMapping(ISerializationContext context, OrMappingRule semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     AbstractRule returns OrRule
	 *     OrRule returns OrRule
	 *
	 * Constraint:
	 *     (rules+=AbstractRule rules+=AbstractRule*)
	 */
	protected void sequence_OrRule(ISerializationContext context, OrRule semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     AbstractRule returns ParentTypeRule
	 *     ParentTypeRule returns ParentTypeRule
	 *
	 * Constraint:
	 *     name=EString
	 */
	protected void sequence_ParentTypeRule(ISerializationContext context, ParentTypeRule semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ModelPackage.Literals.ABSTRACT_NAME_RULE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ModelPackage.Literals.ABSTRACT_NAME_RULE__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getParentTypeRuleAccess().getNameEStringParserRuleCall_2_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Policy returns Policy
	 *
	 * Constraint:
	 *     (name=ID rule=AbstractRule)
	 */
	protected void sequence_Policy(ISerializationContext context, Policy semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ModelPackage.Literals.POLICY__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ModelPackage.Literals.POLICY__NAME));
			if (transientValues.isValueTransient(semanticObject, ModelPackage.Literals.POLICY__RULE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ModelPackage.Literals.POLICY__RULE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getPolicyAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getPolicyAccess().getRuleAbstractRuleParserRuleCall_3_0(), semanticObject.getRule());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     AbstractRule returns RelationIsCyclicRule
	 *     RelationIsCyclicRule returns RelationIsCyclicRule
	 *
	 * Constraint:
	 *     {RelationIsCyclicRule}
	 */
	protected void sequence_RelationIsCyclicRule(ISerializationContext context, RelationIsCyclicRule semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     AbstractRule returns RelationIsReflexivRule
	 *     RelationIsReflexivRule returns RelationIsReflexivRule
	 *
	 * Constraint:
	 *     {RelationIsReflexivRule}
	 */
	protected void sequence_RelationIsReflexivRule(ISerializationContext context, RelationIsReflexivRule semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     AbstractRule returns RelationNameRule
	 *     RelationNameRule returns RelationNameRule
	 *
	 * Constraint:
	 *     name=EString
	 */
	protected void sequence_RelationNameRule(ISerializationContext context, RelationNameRule semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ModelPackage.Literals.ABSTRACT_NAME_RULE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ModelPackage.Literals.ABSTRACT_NAME_RULE__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getRelationNameRuleAccess().getNameEStringParserRuleCall_2_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     AbstractRule returns RelationTypesAreEqualRule
	 *     RelationTypesAreEqualRule returns RelationTypesAreEqualRule
	 *
	 * Constraint:
	 *     {RelationTypesAreEqualRule}
	 */
	protected void sequence_RelationTypesAreEqualRule(ISerializationContext context, RelationTypesAreEqualRule semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     AbstractRule returns ShapeNameRule
	 *     ShapeNameRule returns ShapeNameRule
	 *
	 * Constraint:
	 *     name=EString
	 */
	protected void sequence_ShapeNameRule(ISerializationContext context, ShapeNameRule semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ModelPackage.Literals.ABSTRACT_NAME_RULE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ModelPackage.Literals.ABSTRACT_NAME_RULE__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getShapeNameRuleAccess().getNameEStringParserRuleCall_2_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     AbstractRule returns ShapeTypeRule
	 *     ShapeTypeRule returns ShapeTypeRule
	 *
	 * Constraint:
	 *     name=EString
	 */
	protected void sequence_ShapeTypeRule(ISerializationContext context, ShapeTypeRule semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ModelPackage.Literals.ABSTRACT_NAME_RULE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ModelPackage.Literals.ABSTRACT_NAME_RULE__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getShapeTypeRuleAccess().getNameEStringParserRuleCall_2_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     AbstractRule returns SourceTypeRule
	 *     SourceTypeRule returns SourceTypeRule
	 *
	 * Constraint:
	 *     name=EString
	 */
	protected void sequence_SourceTypeRule(ISerializationContext context, SourceTypeRule semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ModelPackage.Literals.ABSTRACT_NAME_RULE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ModelPackage.Literals.ABSTRACT_NAME_RULE__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSourceTypeRuleAccess().getNameEStringParserRuleCall_2_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     AbstractRule returns StepInRule
	 *     StepInRule returns StepInRule
	 *
	 * Constraint:
	 *     {StepInRule}
	 */
	protected void sequence_StepInRule(ISerializationContext context, StepInRule semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     AbstractRule returns TargetTypeRule
	 *     TargetTypeRule returns TargetTypeRule
	 *
	 * Constraint:
	 *     name=EString
	 */
	protected void sequence_TargetTypeRule(ISerializationContext context, TargetTypeRule semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ModelPackage.Literals.ABSTRACT_NAME_RULE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ModelPackage.Literals.ABSTRACT_NAME_RULE__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getTargetTypeRuleAccess().getNameEStringParserRuleCall_2_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     AbstractMappingRule returns TrueMappingRule
	 *     TrueMappingRule returns TrueMappingRule
	 *     MappingExpression returns TrueMappingRule
	 *     AndMapping returns TrueMappingRule
	 *     AndMapping.AndMappingRule_1_0 returns TrueMappingRule
	 *     OrMapping returns TrueMappingRule
	 *     OrMapping.OrMappingRule_1_0 returns TrueMappingRule
	 *     Primary returns TrueMappingRule
	 *
	 * Constraint:
	 *     {TrueMappingRule}
	 */
	protected void sequence_TrueMappingRule(ISerializationContext context, TrueMappingRule semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     AbstractRule returns TrueRule
	 *     TrueRule returns TrueRule
	 *
	 * Constraint:
	 *     {TrueRule}
	 */
	protected void sequence_TrueRule(ISerializationContext context, TrueRule semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}