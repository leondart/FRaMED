package org.framed.orm.ui.editPolicy;

import java.lang.reflect.Method;

import org.eclipse.gef.commands.Command;
import org.framed.orm.model.Model;
import org.framed.orm.model.ModelElement;
import org.framed.orm.model.Relation;
import org.framed.orm.model.Shape;
import org.framed.orm.model.Type;

/**
 * This class provides the rule-parse for the command-rules. Using VisitorPattern
 *
 * @author Christian Deussen
 *
 */
public class EditPolicyRuleVisitor {

	/**
	 * command to check rules against
	 */
	private Command cmd;

	/**
	 * whether editor is in StepIn/StepOut-View
	 */
	private boolean isStepOut;

	public EditPolicyRuleVisitor(Command cmd, boolean isStepOut) {
		this.cmd = cmd;
		this.isStepOut = isStepOut;
	}

	/**
	 * dispatch abstract rule
	 *
	 * returns whether this.cmd is allowed according to @param rule
	 *
	 * @param rule
	 * @return Boolean
	 */
	public boolean abstractRuleVisitor(model.AbstractRule rule) {
		if (rule instanceof model.AndRule)
			return andRuleVisitor((model.AndRule) rule);

		if (rule instanceof model.OrRule)
			return orRuleVisitor((model.OrRule) rule);

		if (rule instanceof model.NotRule)
			return notRuleVisitor((model.NotRule) rule);

		if (rule instanceof model.ImplicationRule)
			return implicationRuleVisitor((model.ImplicationRule) rule);

		// if (rule instanceof model.ShapeNameRule)
		// return shapeNameRuleVisitor((model.ShapeNameRule)rule);

		if (rule instanceof model.ShapeTypeRule)
			return shapeTypeRuleVisitor((model.ShapeTypeRule) rule);

		if (rule instanceof model.TypeExistsRule)
			return typeExistsRule((model.TypeExistsRule) rule);

		if (rule instanceof model.RelationTypesAreEqualRule)
			return relationTypesAreEqualRuleVisitor((model.RelationTypesAreEqualRule) rule);

		if (rule instanceof model.RelationIsCyclicRule)
			return relationIsCyclicRuleVisitor((model.RelationIsCyclicRule) rule);

		if (rule instanceof model.RelationIsReflexivRule)
			return relationIsReflexivRuleVisitor((model.RelationIsReflexivRule) rule);

		if (rule instanceof model.TargetTypeRule)
			return targetTypeRuleVisitor((model.TargetTypeRule) rule);

		if (rule instanceof model.SourceTypeRule)
			return sourceTypeRuleVisitor((model.SourceTypeRule) rule);

		if (rule instanceof model.ParentTypeRule)
			return parentTypeRuleVisitor((model.ParentTypeRule) rule);

		if (rule instanceof model.StepInRule)
			return stepInRule((model.StepInRule) rule);

		if (rule instanceof model.CommandNameRule)
			return commandNameRuleVisitor((model.CommandNameRule) rule);

		if (rule instanceof model.RelationTypeRule)
			return relationTypeRuleVisitor((model.RelationTypeRule) rule);

		if (rule instanceof model.TrueRule)
			return true;

		if (rule instanceof model.FalseRule)
			return false;

		System.out.println("NodeVisitor for " + rule.getClass().toString() + " not implemented");
		return false;
	}

	/**
	 * logical AND
	 *
	 * @param rule
	 * @return
	 */
	private boolean andRuleVisitor(model.AndRule rule) {
		for (model.AbstractRule abstractRule : rule.getRules()) {
			if (!abstractRuleVisitor(abstractRule))
				return false;
		}
		return true;
	}

	/**
	 * logical NOT
	 *
	 * @param rule
	 * @return
	 */
	private boolean notRuleVisitor(model.NotRule rule) {
		return !abstractRuleVisitor(rule.getRule());
	}

	/**
	 * logical OR
	 *
	 * @param rule
	 * @return
	 */
	private boolean orRuleVisitor(model.OrRule rule) {
		for (model.AbstractRule abstractRule : rule.getRules()) {
			if (abstractRuleVisitor(abstractRule))
				return true;
		}
		return false;
	}

	/**
	 * logical implication
	 *
	 * @param rule
	 * @return
	 */
	private boolean implicationRuleVisitor(model.ImplicationRule rule)
	{
		if (abstractRuleVisitor(rule.getAntecedent())) {
			return abstractRuleVisitor(rule.getConsequent());
		}
		return true;
	}

	/**
	 * check for commandName-String
	 *
	 * @param rule
	 * @return
	 */
	private boolean commandNameRuleVisitor(model.CommandNameRule rule)
	{
		//System.out.println("testing: " + rule.getName() + " === " + cmd.getLabel());

		if (rule.getName().equals(cmd.getLabel())) {
			return true;
		}
		return false;
	}

	/**
	 * check for relationType-string
	 *
	 * has to be done via reflection, since we do not know which commands
	 * provide getRelation() method
	 *
	 * @param rule
	 * @return
	 */
	private boolean relationTypeRuleVisitor(model.RelationTypeRule rule)
	{
		Relation relation;
		Method method;

		try {
			method = cmd.getClass().getMethod("getRelation");
			relation = (Relation) method.invoke(cmd);
		} catch (Exception e) {
			return false;
		}

		// System.out.println("string: " + relation.getType().getLiteral() + " name is " + rule.getName());

		if (rule.getName().equals(relation.getType().getLiteral())) {
			return true;
		}
		return false;
	}

	/**
	 * check whether ModelElement target and source have a cycle in
	 * inheritance-relation
	 *
	 * @param target
	 * @param source
	 * @return
	 */
	private final boolean isAcyclic(ModelElement target, ModelElement source)
	{
		if (source.equals(target))
			return false;

		for (Relation relation : source.getIncomingRelations()) {
			if (relation.getType().getValue() == Type.INHERITANCE_VALUE) {
				if (!isAcyclic(target, relation.getSource())) {
					return false;
				}
			}
		}
		return true;
	}

	/**
	 * has to be done via reflection, since we do not know which commands
	 * provide getRelation() method
	 * @param rule
	 * @return
	 */
	private boolean relationIsCyclicRuleVisitor(model.RelationIsCyclicRule rule)
	{
		Method method;
		ModelElement target;
		ModelElement source;

		try {
			method = cmd.getClass().getMethod("getTarget");
			target = (ModelElement) method.invoke(cmd);
			method = cmd.getClass().getMethod("getSource");
			source = (ModelElement) method.invoke(cmd);
		} catch (Exception e) {
			return false;
		}

		return !isAcyclic(target, source);
	}

	/**
	 * has to be done via reflection, since we do not know which commands
	 * provide getRelation() method
	 * @param rule
	 * @return
	 */
	private boolean relationTypesAreEqualRuleVisitor(
			model.RelationTypesAreEqualRule rule)
	{
		Method method;
		ModelElement target;
		ModelElement source;

		try {
			method = cmd.getClass().getMethod("getTarget");
			target = (ModelElement) method.invoke(cmd);
			method = cmd.getClass().getMethod("getSource");
			source = (ModelElement) method.invoke(cmd);
		} catch (Exception e) {
			return false;
		}

		if (target.getType().getLiteral().equals(source.getType().getLiteral())) {
			return true;
		}
		return false;
	}

	/**
	 * has to be done via reflection, since we do not know which commands
	 * provide getRelation() method
	 * @param rule
	 * @return
	 */
	private boolean relationIsReflexivRuleVisitor(
			model.RelationIsReflexivRule rule)
	{
		Method method;
		ModelElement target;
		ModelElement source;

		try {
			method = cmd.getClass().getMethod("getTarget");
			target = (ModelElement) method.invoke(cmd);
			method = cmd.getClass().getMethod("getSource");
			source = (ModelElement) method.invoke(cmd);
		} catch (Exception e) {
			return false;
		}

		if (target.equals(source)) {
			return true;
		}
		return false;
	}

	/**
	 * check command shapeType
	 * has to be done via reflection, since we do not know which commands
	 * provide getRelation() method
	 * @param rule
	 * @return
	 */
	private boolean shapeTypeRuleVisitor(model.ShapeTypeRule rule)
	{
		String str;
		Method method;

		try {
			method = cmd.getClass().getMethod("getParentType");
			str = (String) method.invoke(cmd);
		} catch (Exception e) {
			try {
				method = cmd.getClass().getMethod("getShape");
				Shape shape = (Shape) method.invoke(cmd);
				str = shape.getType().getLiteral();
			} catch (Exception e1) {
				return false;
			}
		}

		//System.out.println("ShapeTypeRule: String is: " + str + "name is " + rule.getName());

		if (rule.getName().equals(str)) {
			return true;
		}
		return false;
	}

	/**
	 * check command parentType
	 * has to be done via reflection, since we do not know which commands
	 * provide getRelation() method
	 * @param rule
	 * @return
	 */
	private boolean parentTypeRuleVisitor(model.ParentTypeRule rule)
	{
		Shape shape;
		Method method;

		try {
			method = cmd.getClass().getMethod("getParent");
			shape = (Shape) method.invoke(cmd);
		} catch (Exception e) {
			return false;
		}

		if (shape == null)
			return false;

		String type = shape.getType().getLiteral();
		//System.out.println("parentTypeRUle: Type is: " + type + " rulename is: " + rule.getName());

		if (rule.getName().equals(type)) {
			return true;
		}
		return false;
	}

	/**
	 * checks whether given type is already in editor(e.g exists instance of ROLE_TYPE in editor view)
	 * has to be done via reflection, since we do not know which commands
	 * provide getRelation() method
	 * @param rule
	 * @return
	 */
	private boolean typeExistsRule(model.TypeExistsRule rule)
	{
		Model model;
		Method method;

		try {
			method = cmd.getClass().getMethod("getParent");
			model = (Model) method.invoke(cmd);
		} catch (Exception e) {
			return false;
		}

		if (model == null)
			return false;

		for (ModelElement element : model.getElements()) {
			String type = element.getType().getLiteral();
			if (type.equals(rule.getName()))
				return true;
		}
		return false;
	}

	/**
	 * checks for target type of command
	 * has to be done via reflection, since we do not know which commands
	 * provide getRelation() method
	 * @param rule
	 * @return
	 */
	private boolean targetTypeRuleVisitor(model.TargetTypeRule rule)
	{
		ModelElement element;
		Method method;

		try {
			method = cmd.getClass().getMethod("getTarget");
			element = (ModelElement) method.invoke(cmd);
		} catch (Exception e) {
			return false;
		}

		if (element == null)
			return false;

		String type = element.getType().getLiteral();
		//System.out.println("targetTypeRUle :Type is: " + type + " rulename is: " + rule.getName());

		if (rule.getName().equals(type)) {
			return true;
		}
		return false;
	}

	/**
	 * checks for sourceType of command
	 * has to be done via reflection, since we do not know which commands
	 * provide getRelation() method
	 *
	 * @param rule
	 * @return
	 */
	private boolean sourceTypeRuleVisitor(model.SourceTypeRule rule)
	{
		ModelElement element;
		Method method;

		try {
			method = cmd.getClass().getMethod("getSource");
			element = (ModelElement) method.invoke(cmd);
		} catch (Exception e) {
			return false;
		}

		if (element == null)
			return false;

		String type = element.getType().getLiteral();
		//System.out.println("sourceTypeRUle :Type is: " + type + " rulename is: " + rule.getName());

		if (rule.getName().equals(type)) {
			return true;
		}
		return false;
	}

	/**
	 * checks whether editor is in StepIn/StepOut
	 * @param rule
	 * @return
	 */
	private boolean stepInRule(model.StepInRule rule)
	{
		return this.isStepOut;
	}
}
