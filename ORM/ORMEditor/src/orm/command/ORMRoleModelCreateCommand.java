package orm.command;


import org.eclipse.gef.commands.Command;

import org.framed.orm.model.Compartment;
import org.framed.orm.model.Grouping;
import org.framed.orm.model.Rolemodel;

/**
 * @author Kay Bierzynski
 * */
public class ORMRoleModelCreateCommand extends Command {
	
	
		private Grouping group;
		private Compartment compartment;
		private Rolemodel rm;

		/** 
		 * The command can be executed if all parameters have been set.
		 */
		@Override
		public boolean canExecute() {
		    return  compartment!= null || group!=null ;
		}
		


		@Override public void execute() {
			if(compartment!=null)rm.setCt(compartment);
			if(group!=null)rm.setParentGroup(group);
		}

	
		@Override public void undo() {
			if(compartment!=null)rm.setCt(null);
			if(group!=null)rm.setParentGroup(null);		}

		
		public void setRolemodel(final Rolemodel rm) {
			this.rm = rm;
		}
		
		public void setCompartment(final Compartment ct) {
			this.compartment = ct;
		}
		
		public void setGroup(final Grouping group) {
			this.group = group;
		}
}
