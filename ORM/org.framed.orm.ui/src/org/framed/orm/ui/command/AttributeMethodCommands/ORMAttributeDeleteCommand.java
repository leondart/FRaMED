package org.framed.orm.ui.command.AttributeMethodCommands;

import org.eclipse.gef.commands.Command;
import org.framed.orm.model.Attribute;
import org.framed.orm.model.Type;

/**
 * Through this command the model element {@link Attribute} can be deleted( removed from the model
 * tree).
 * 
 * @author Kay Bierzynski
 * @author Lars Schuetze
 * */
public class ORMAttributeDeleteCommand extends Command {

  /** The {@link Attribute}, which will be deleted/removed in this command. */
  private Attribute att;
  /** The parent {@link Type} to which the {@link Attribute} is deleted/removed from. */
  private Type type;
  /**
   * The position of the {@link Attribute} in the attributes list of the parent {@link Type}. This
   * variable is needed to put the {@link Attribute} at the correct position in the attributes list
   * when this command should be undone.
   */
  private int position;

  /**
   * Constructor of this command, where the label is set, which describes this command to the user.
   * 
   */
  public ORMAttributeDeleteCommand() {
    super.setLabel("ORMAttributeDelete");
  }

  /**
   * {@inheritDoc} In this method the reference to the parent {@link Type} is set on null. Through
   * setting the parent refrence on null the {@link Attribute} is removed from the model tree.
   */
  @Override
  public void execute() {
    att.setType(null);
  }

  /**
   * {@inheritDoc} To undo this command the reference to the parent {@link Type} of the
   * {@link Attribute} is set. The setting of the parent reference adds the {@link Attribute} at end
   * of the attributes list of the parent {@link Type}. So when we want to put the {@link Attribute}
   * at the correct position we need to remove the {@link Attribute} from the list and add it with
   * the position variable again to the list.
   */
  @Override
  public void undo() {
    att.setType(type);
    type.getAttributes().remove(att);
    type.getAttributes().add(position, att);
  }

  /**
   * Setter of the {@link Attribute}, which should be deleted/removed. From given {@link Attribute}
   * the parent {@link Type} and the position are derived.
   * 
   * @param att org.framed.orm.model.Attribute
   */
  public void setAttribute(final Attribute att) {
    this.att = att;
    this.type = att.getType();
    this.position = type.getAttributes().indexOf(att);
  }


}
