package org.framed.orm.ui.command.AttributeMethodCommands;

import org.eclipse.gef.commands.Command;
import org.framed.orm.model.Method;
import org.framed.orm.model.Type;


/**
 * Through this command the model element {@link Method} can be deleted( removed from the model
 * tree).
 * 
 * @author Kay Bierzynski
 * @author Lars Schuetze
 * */
public class ORMMethodDeleteCommand extends Command {

  /** The {@link Method}, which will be deleted/removed in this command. */
  private Method met;
  /** The parent {@link Type} to which the {@link Method} is deleted/removed from. */
  private Type type;
  /**
   * The position of the {@link Method} in the operations list of the parent {@link Type}. This
   * variable is needed to put the {@link Method} at the correct position in the operations list
   * when this command should be undone.
   */
  private int position;

  /**
   * Constructor of this command, where the label is set, which describes this command to the user.
   * 
   */
  public ORMMethodDeleteCommand() {
    super.setLabel("ORMMethodDeleteCommand");
  }

  /**
   * {@inheritDoc} In this method the reference to the parent {@link Type} is set on null. Through
   * setting the parent refrence on null the {@link Method} is removed from the model tree.
   */
  @Override
  public void execute() {
    met.setType(null);
  }

  /**
   * {@inheritDoc} To undo this command the reference to the parent {@link Type} of the
   * {@link Method} is set. The setting of the parent reference adds the {@link Method} at end of
   * the operations list of the parent {@link Type}. So when we want to put the {@link Method} at
   * the correct position we need to remove the {@link Method} from the list and add it with the
   * position variable again to the list.
   */
  @Override
  public void undo() {
    met.setType(type);
    type.getOperations().remove(met);
    type.getOperations().add(position, met);
  }

  /**
   * Setter of the {@link Method}, which should be deleted/removed. From given {@link Method} the
   * parent {@link Type} and the position are derived.
   * 
   * @param met org.framed.orm.model.Method
   */
  public void setMethod(final Method met) {
    this.met = met;
    this.type = met.getType();
    position = type.getOperations().indexOf(met);
  }
}
