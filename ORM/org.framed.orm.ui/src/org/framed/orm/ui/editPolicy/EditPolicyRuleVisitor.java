package org.framed.orm.ui.editPolicy;

import java.lang.reflect.Method;

import org.eclipse.gef.commands.Command;
import org.framed.orm.model.ModelElement;
import org.framed.orm.model.Relation;
import org.framed.orm.model.Shape;

public class EditPolicyRuleVisitor {

		private Command cmd;

		private boolean isStepOut;

		public EditPolicyRuleVisitor(Command cmd, boolean isStepOut)
		{
			this.cmd = cmd;
			this.isStepOut = isStepOut;
		}

		public boolean abstractRuleVisitor(model.AbstractRule rule)
		{
			if (rule instanceof model.AndRule)
				return andRuleVisitor((model.AndRule)rule);

			if (rule instanceof model.OrRule)
				return orRuleVisitor((model.OrRule)rule);

			if (rule instanceof model.NotRule)
				return notRuleVisitor((model.NotRule)rule);

			if (rule instanceof model.ImplicationRule)
				return implicationRuleVisitor((model.ImplicationRule)rule);

//			if (rule instanceof model.ShapeNameRule)
//				return shapeNameRuleVisitor((model.ShapeNameRule)rule);

			if (rule instanceof model.ShapeTypeRule)
				return shapeTypeRuleVisitor((model.ShapeTypeRule)rule);

			if (rule instanceof model.TargetTypeRule)
				return targetTypeRuleVisitor((model.TargetTypeRule)rule);

			if (rule instanceof model.SourceTypeRule)
				return sourceTypeRuleVisitor((model.SourceTypeRule)rule);

			if (rule instanceof model.ParentTypeRule)
				return parentTypeRuleVisitor((model.ParentTypeRule)rule);

			if (rule instanceof model.StepInRule)
				return stepInRule((model.StepInRule)rule);

			if (rule instanceof model.CommandNameRule)
				return commandNameRuleVisitor((model.CommandNameRule)rule);

			if (rule instanceof model.RelationNameRule)
				return relationNameRuleVisitor((model.RelationNameRule)rule);

			if (rule instanceof model.TrueRule)
				return true;

			if (rule instanceof model.FalseRule)
				return false;

			System.out.println("NodeVisitor for type not implemented");
			return false;
		}

		private boolean andRuleVisitor(model.AndRule rule)
		{
			for(model.AbstractRule abstractRule : rule.getRules()) {
				if(!abstractRuleVisitor(abstractRule)) return false;
			}
			return true;
		}


		private boolean notRuleVisitor(model.NotRule rule)
		{
			return !abstractRuleVisitor(rule.getRule());
		}

		private boolean orRuleVisitor(model.OrRule rule)
		{
			for(model.AbstractRule abstractRule : rule.getRules()) {
				if(abstractRuleVisitor(abstractRule)) return true;
			}
			return false;
		}

		private boolean implicationRuleVisitor(model.ImplicationRule rule)
		{
			if(abstractRuleVisitor(rule.getAntecedent())) {
				return abstractRuleVisitor(rule.getConsequent());
			}
			return true;
		}

		private boolean commandNameRuleVisitor(model.CommandNameRule rule)
		{
			//System.out.println("testing: " + rule.getName() + " === " + cmd.getLabel());

			if(rule.getName().equals(cmd.getLabel())) {
				return true;
			}
			return false;
		}

		private boolean relationNameRuleVisitor(model.RelationNameRule rule)
		{
			Relation relation;
			Method method;

			try {
				method = cmd.getClass().getMethod("getRelation");
				relation =  (Relation) method.invoke(cmd);
			} catch (Exception e) { return false; }

			//System.out.println("string: " + relation.getType().getLiteral() + " name is " + rule.getName());

			if(rule.getName().equals(relation.getType().getLiteral())) {
				return true;
			}
			return false;
		}

		private boolean shapeTypeRuleVisitor(model.ShapeTypeRule rule)
		{
			String str;
			Method method;

			try {
				method = cmd.getClass().getMethod("getParentType");
				str =  (String) method.invoke(cmd);
			} catch (Exception e) { return false; }

			System.out.println("ShapeTypeRule: String is: " + str + "name is " + rule.getName());

			if(rule.getName().equals(str)) {
				return true;
			}
			return false;
		}

		private boolean parentTypeRuleVisitor(model.ParentTypeRule rule)
		{
			Shape shape;
			Method method;

			try {
				method = cmd.getClass().getMethod("getParent");
				shape =  (Shape) method.invoke(cmd);
			} catch (Exception e) { return false; }

			if(shape == null) return false;

			String type = shape.getType().getLiteral();
			System.out.println("parentTypeRUle: Type is: " + type + " rulename is: " + rule.getName());

			if(rule.getName().equals(type)) {
				return true;
			}
			return false;
		}

		private boolean targetTypeRuleVisitor(model.TargetTypeRule rule)
		{
			ModelElement element;
			Method method;

			try {
				method = cmd.getClass().getMethod("getTarget");
				element = (ModelElement) method.invoke(cmd);
			} catch (Exception e) { return false; }

			if(element == null) return false;

			String type = element.getType().getLiteral();
			System.out.println("targetTypeRUle :Type is: " + type + " rulename is: " + rule.getName());

			if(rule.getName().equals(type)) {
				return true;
			}
			return false;
		}

		private boolean sourceTypeRuleVisitor(model.SourceTypeRule rule)
		{
			ModelElement element;
			Method method;

			try {
				method = cmd.getClass().getMethod("getSource");
				element = (ModelElement) method.invoke(cmd);
			} catch (Exception e) { return false; }

			if(element == null) return false;

			String type = element.getType().getLiteral();
			System.out.println("sourceTypeRUle :Type is: " + type + " rulename is: " + rule.getName());

			if(rule.getName().equals(type)) {
				return true;
			}
			return false;
		}

		private boolean stepInRule(model.StepInRule rule)
		{
			return this.isStepOut;
		}
}
