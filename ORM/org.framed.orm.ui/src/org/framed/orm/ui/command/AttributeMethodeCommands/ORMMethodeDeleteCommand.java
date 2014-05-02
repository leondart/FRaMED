package org.framed.orm.ui.command.AttributeMethodeCommands;

import org.eclipse.gef.commands.Command;
import org.framed.orm.model.Methode;
import org.framed.orm.model.Type;


/**
 * @author Kay Bierzynski
 * @author Lars Schuetze
 * */
public class ORMMethodeDeleteCommand extends Command {

  private Methode met;
  private Type type;
  private int position;

  public ORMMethodeDeleteCommand(){
    super.setLabel("ORMMethodeDeleteCommand");
  }
  
  @Override
  public void execute() {
    met.setType(null);
  }

  @Override
  public void undo() {
    met.setType(type);
    type.getOperations().remove(met);
    type.getOperations().add(position, met);
  }

  public void setMethode(Methode met) {
    this.met = met;
    this.type = met.getType();
    position = type.getOperations().indexOf(met);
  }
}
