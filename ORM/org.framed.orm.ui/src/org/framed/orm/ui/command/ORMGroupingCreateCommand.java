package org.framed.orm.ui.command;

import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.commands.Command;

import org.framed.orm.model.CompartmentDiagram;
import org.framed.orm.model.Grouping;
import org.framed.orm.model.Rolemodel;

/**
 * @author Kay Bierzynski
 * */
public class ORMGroupingCreateCommand extends Command {
	
	
		private Grouping grouping;
		private Rectangle constraints;
		
		private CompartmentDiagram cd;
		private Rolemodel rm, parentrolemodel;
		/** 
		 * The command can be executed if all parameters have been set.
		 */
		@Override
		public boolean canExecute() {
			
		    return cd!=null || parentrolemodel != null;
		}
		
		/**
		 * Set the constraints for the {@link Grouping} and add it to the container 
		 * {@link CompartmentDiagramDiagram} or Parentrolemodel .
		 */
		@Override public void execute() {
			
			grouping.setConstraints(constraints);
			if(cd != null) grouping.setCd(cd);
			grouping.setRolemodel(rm);
			if(parentrolemodel != null) grouping.setParentRolemodel(parentrolemodel);
		}
		
		/**
		 * Remove the {@link Grouping} from the container {@link CompartmentDiagramDiagram}.
		 */
		@Override public void undo() {
			if(cd != null) grouping.setCd(null);
			if(parentrolemodel != null) grouping.setParentRolemodel(null);
		}

		
		public void setConstraints(final Rectangle constraints) {
		    this.constraints = constraints;
		}
		
		public void setContainer(final CompartmentDiagram opd) {
			this.cd = opd;
		}
		
		public void setGrouping(final Grouping node) {
			this.grouping = node;
		}
		
		public void setRolemodel(final Rolemodel rm) {
			this.rm = rm;
		}
		
		public void setParentRolemodel(final Rolemodel rm) {
			this.parentrolemodel = rm;
		}
	
}
