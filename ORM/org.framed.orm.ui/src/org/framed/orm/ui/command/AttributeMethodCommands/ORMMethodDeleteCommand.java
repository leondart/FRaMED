package org.framed.orm.ui.command.AttributeMethodCommands;

import org.eclipse.gef.commands.Command;
import org.framed.orm.model.Method;
import org.framed.orm.model.Type;


/**
 * @author Kay Bierzynski
 * @author Lars Schuetze
 * */
public class ORMMethodDeleteCommand extends Command {

  private Method met;
  private Type type;
  private int position;

  public ORMMethodDeleteCommand(){
    super.setLabel("ORMMethodDeleteCommand");
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

  public void setMethod(Method met) {
    this.met = met;
    this.type = met.getType();
    position = type.getOperations().indexOf(met);
  }
}
