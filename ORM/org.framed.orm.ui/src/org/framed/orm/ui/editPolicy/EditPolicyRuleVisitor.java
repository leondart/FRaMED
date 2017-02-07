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

		public boolean abstractRuleVisitor(editPolicyEcore1.AbstractRule rule)
		{

			if (rule instanceof editPolicyEcore1.AndRule)
				return andRuleVisitor((editPolicyEcore1.AndRule)rule);

			if (rule instanceof editPolicyEcore1.OrRule)
				return orRuleVisitor((editPolicyEcore1.OrRule)rule);

			if (rule instanceof editPolicyEcore1.NotRule)
				return notRuleVisitor((editPolicyEcore1.NotRule)rule);

			if (rule instanceof editPolicyEcore1.ImplicationRule)
				return implicationRuleVisitor((editPolicyEcore1.ImplicationRule)rule);

			/*
			if (rule instanceof editPolicyEcore1.ShapeNameRule)
				return shapeNameRuleVisitor((editPolicyEcore1.ShapeNameRule)rule);

			if (rule instanceof editPolicyEcore1.ShapeTypeRule)
				return shapeTypeRuleVisitor((editPolicyEcore1.ShapeTypeRule)rule);
*/
			if (rule instanceof editPolicyEcore1.StepInRule)
				return stepInRule((editPolicyEcore1.StepInRule)rule);

			if (rule instanceof editPolicyEcore1.CommandNameRule)
				return commandNameRuleVisitor((editPolicyEcore1.CommandNameRule)rule);

			if (rule instanceof editPolicyEcore1.RelationNameRule)
				return relationNameRuleVisitor((editPolicyEcore1.RelationNameRule)rule);

			if (rule instanceof editPolicyEcore1.TrueRule)
				return true;

			if (rule instanceof editPolicyEcore1.FalseRule)
				return false;

			System.out.println("NodeVisitor for type not implemented");
			return false;
		}

		private boolean andRuleVisitor(editPolicyEcore1.AndRule rule)
		{
			for(editPolicyEcore1.AbstractRule abstractRule : rule.getRules()) {
				if(!abstractRuleVisitor(abstractRule)) return false;
			}
			return true;
		}


		private boolean notRuleVisitor(editPolicyEcore1.NotRule rule)
		{
			return !abstractRuleVisitor(rule.getRule());
		}

		private boolean orRuleVisitor(editPolicyEcore1.OrRule rule)
		{
			for(editPolicyEcore1.AbstractRule abstractRule : rule.getRules()) {
				if(abstractRuleVisitor(abstractRule)) return true;
			}
			return false;
		}

		private boolean implicationRuleVisitor(editPolicyEcore1.ImplicationRule rule)
		{
			if(abstractRuleVisitor(rule.getAntecedent())) {
				return abstractRuleVisitor(rule.getConsequent());
			}
			return true;
		}

		private boolean commandNameRuleVisitor(editPolicyEcore1.CommandNameRule rule)
		{

			System.out.println("stepInRule not implemented");


			if(rule.getName().equals(cmd.getLabel())) {
				return true;
			}
			return false;
		}

		private boolean relationNameRuleVisitor(editPolicyEcore1.RelationNameRule rule)
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

		private boolean stepInRule(editPolicyEcore1.StepInRule rule)
		{
			System.out.println("stepInRule not implemented");
			/*
			if(editorIsInStepIn())
				return true;*/
			return false;
		}

}
