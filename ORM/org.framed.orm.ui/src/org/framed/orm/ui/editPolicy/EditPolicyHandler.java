package org.framed.orm.ui.editPolicy;

import org.eclipse.gef.commands.Command;
import org.framed.orm.model.Type;
import org.framed.orm.ui.command.connectionkinds.ORMRelationCreateCommand;


public class EditPolicyHandler {
	
	public boolean canExecute(Command cmd) {
	    //System.out.println("EditPolicyHandler CanExecute: " + cmd.getClass().toString());
	    
	    if(cmd instanceof ORMRelationCreateCommand) {
	    	ORMRelationCreateCommand relationCommand = (ORMRelationCreateCommand) cmd;
	        int val = relationCommand.getRelation().getType().getValue();
	        switch (val) {
	          case Type.RELATIONSHIP_VALUE:
	        	  return true;
	          case Type.IRREFLEXIVE_VALUE:
	          case Type.TOTAL_VALUE:
	          case Type.CYCLIC_VALUE:
	          case Type.ACYCLIC_VALUE:
	          case Type.REFLEXIVE_VALUE:	        	
	              return relationCommand.getReferencedRelations().size() == 1;
	          case Type.INHERITANCE_VALUE:
	        	  return relationCommand.checkCycle(relationCommand.getTarget(), relationCommand.getSource());
	        }
	    }
		return true;
	}

	public boolean test() {
	    //System.out.println("EditPolicyHandler Test");

		return true;
	}
}
