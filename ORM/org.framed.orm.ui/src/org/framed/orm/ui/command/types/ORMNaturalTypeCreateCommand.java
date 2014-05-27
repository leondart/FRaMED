package org.framed.orm.ui.command.types;

import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.commands.Command;

import org.framed.orm.model.CompartmentDiagram;
import org.framed.orm.model.NaturalType;
import org.framed.orm.model.Rolemodel;

/**
 * @author Kay Bierzynski
 * */
public class ORMNaturalTypeCreateCommand extends Command {
	
		private NaturalType naturalType;
		private Rectangle   constraints;
		private Rolemodel   parentrolemodel;
		private CompartmentDiagram   cd;
		
		public ORMNaturalTypeCreateCommand(){
		  super.setLabel("ORMNaturalTypeCreate");
		}
		
		/** 
		 * The command can be executed if all parameters have been set.
		 */
		@Override
		public boolean canExecute() {
			
		    return  naturalType!=null && constraints != null;
		}
		
		/**
		 * Set the constraints for the {@link NaturalType} and add it to the container 
		 * {@link CompartmentDiagram} or Rolemodel.
		 */
		@Override public void execute() {
			
			naturalType.setConstraints(constraints);
			// for Attribute/Methode list expanding 
			naturalType.setIsExpand(true);
		   if(parentrolemodel != null) naturalType.setParentRolemodel(parentrolemodel);
		   if(cd != null) naturalType.setCompartmentDiagram(cd);
		}
		
		/**
		 * Remove the {@link NaturalType} from the container {@link CompartmentDiagram} or Rolemodel.
		 */
		@Override public void undo() {
			naturalType.setParentRolemodel(null);
			naturalType.setCompartmentDiagram(null);
		}

	
		public void setConstraints(final Rectangle constraints) {
		    this.constraints = constraints;
		}
		
		
		
		public void setNaturalType(final NaturalType node) {
			this.naturalType = node;
		}
		
		
		public void setParentRolemodel(final Rolemodel rm) {
			this.parentrolemodel = rm;
		}
		
		public void setCd(final CompartmentDiagram cd) {
			this.cd = cd;
		}
	
}
