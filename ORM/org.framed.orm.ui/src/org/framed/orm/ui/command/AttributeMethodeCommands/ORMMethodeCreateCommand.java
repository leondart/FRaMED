package org.framed.orm.ui.command.AttributeMethodeCommands;


import org.eclipse.gef.commands.Command;

import org.framed.orm.model.Methode;
import org.framed.orm.model.Type;

/**
 * @author Kay Bierzynski
 * */
public class ORMMethodeCreateCommand extends Command {
	
		private Methode methode;
		private Type type;

		/** 
		 * The command can be executed if all parameters have been set.
		 */
		@Override
		public boolean canExecute() {
		    return type != null  && methode != null;
		}
		
		/**
		 * Set the name for the {@link Methode} and add it to the container 
		 * {@link Type}.
		 */
		@Override public void execute() {
			
			methode.setName("<new Methode>");
			methode.setType(type);
			
		}
	
		/**
		 * Remove the {@link Methode} from the container {@link Type}.
		 */
		@Override public void undo() {
			methode.setType(null);
		}

	
		
		public void setContainer(final Type type) {
			this.type = type;
		}
		
		public void setMethode(final Methode methode) {
			this.methode = methode;
		}
	
}
