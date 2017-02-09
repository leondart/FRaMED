package org.framed.orm.ui.editPolicy;

import java.lang.reflect.Method;

import org.eclipse.gef.commands.Command;
import org.framed.orm.model.Relation;

public class EditPolicyRuleVisitor {

		private Command cmd;

		public EditPolicyRuleVisitor(Command cmd)
		{
			this.cmd = cmd;
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

			/*
			if (rule instanceof model.ShapeNameRule)
				return shapeNameRuleVisitor((model.ShapeNameRule)rule);

			if (rule instanceof model.ShapeTypeRule)
				return shapeTypeRuleVisitor((model.ShapeTypeRule)rule);
*/
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
			System.out.println("stepInRule not implemented");

			if(rule.getName().equals(cmd.getLabel())) {
				return true;
			}
			return false;
		}

		private boolean relationNameRuleVisitor(model.RelationNameRule rule)
		{
			Relation relation;
			Method getRelationNameMethod;
			try {
				getRelationNameMethod = cmd.getClass().getMethod("getRelation");
			} catch (SecurityException e) { return false; }
			catch (NoSuchMethodException e) { return false; }
			try {
				relation = (Relation) getRelationNameMethod.invoke(cmd);
			} catch (Exception e) {return false;}
			System.out.println("got RelationName with reflection: type: " + relation.getType());

			relation.getType();
			if(rule.getName().equals(relation.getType())) {
				return true;
			}
			return false;
		}

		private boolean stepInRule(model.StepInRule rule)
		{
			System.out.println("stepInRule not implemented");
			/*
			if(editorIsInStepIn())
				return true;*/
			return false;
		}

}
