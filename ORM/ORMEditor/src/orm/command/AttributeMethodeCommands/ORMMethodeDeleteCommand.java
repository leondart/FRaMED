package orm.command.AttributeMethodeCommands;

import org.eclipse.gef.commands.Command;

import org.framed.orm.model.Methode;
import org.framed.orm.model.Type;


/**
 * @author Kay Bierzynski
 * */
public class ORMMethodeDeleteCommand extends Command {

	  private Methode met;
	  private Type type;
	 
	  @Override
	  public void execute() {
		  met.setType(null);
	  }
	 
	  @Override
	  public void undo() {
	    met.setType(type);
	  }
	 
	  public void setMethode(Methode met) {
	    this.met = met;
	    this.type = met.getType();
	  }
}
