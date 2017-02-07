package org.framed.orm.ui.editPolicy;

import org.eclipse.gef.commands.Command;

public class EditPolicyRuleVisitor {

		private Command cmd;

		public void setCommand(Command cmd)
		{
			this.cmd = cmd;
		}

		public boolean abstractRuleVisitor(editPolicyEcore1.AbstractRule rule)
		{
			if (rule instanceof editPolicyEcore1.AndRule)
				return andRuleVisitor((editPolicyEcore1.AndRule)rule);
			if (rule instanceof editPolicyEcore1.RelationNameRule)
				return relationNameRuleVisitor((editPolicyEcore1.RelationNameRule)rule);

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

		private boolean relationNameRuleVisitor(editPolicyEcore1.RelationNameRule rule)
		{
			if(rule.getName().equals("testName")) {
				return true;
			}
			return false;
		}

}
