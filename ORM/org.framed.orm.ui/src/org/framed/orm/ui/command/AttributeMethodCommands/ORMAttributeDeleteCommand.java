package org.framed.orm.ui.command.AttributeMethodCommands;

import org.eclipse.gef.commands.Command;
import org.framed.orm.model.Attribute;
import org.framed.orm.model.Type;

/**
 * @author Kay Bierzynski
 * */
public class ORMAttributeDeleteCommand extends Command {

  private Attribute att;
  private Type type;
  private int position;

  public ORMAttributeDeleteCommand(){
    super.setLabel("ORMAttributeDelete");
  }
  
  @Override
  public void execute() {
    att.setType(null);
  }

  @Override
  public void undo() {
    att.setType(type);
    type.getAttributes().remove(att);
    type.getAttributes().add(position, att);
  }

  public void setAttribute(Attribute att) {
    this.att = att;
    this.type = att.getType();
    position = type.getAttributes().indexOf(att);
  }


}
