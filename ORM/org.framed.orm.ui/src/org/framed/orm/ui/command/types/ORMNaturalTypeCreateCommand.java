package org.framed.orm.ui.command.types;

import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.commands.Command;

import org.framed.orm.model.Container;
import org.framed.orm.model.NaturalType;

/**
 * @author Kay Bierzynski
 * */
public class ORMNaturalTypeCreateCommand extends Command {
	
		private NaturalType naturalType;
		private Rectangle   constraints;
		private Container   parent;
		
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
			naturalType.setContainer(parent);
		}
		
		/**
		 * Remove the {@link NaturalType} from the container {@link CompartmentDiagram} or Rolemodel.
		 */
		@Override public void undo() {
			naturalType.setContainer(null);
		}

	
		public void setConstraints(final Rectangle constraints) {
		    this.constraints = constraints;
		}
		
		
		
		public void setNaturalType(final NaturalType node) {
			this.naturalType = node;
		}
		
		public void setContainer(final Container parent) {
			this.parent = parent;
		}
	
}
