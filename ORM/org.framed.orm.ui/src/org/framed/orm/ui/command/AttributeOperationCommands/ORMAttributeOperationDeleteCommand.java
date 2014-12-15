package org.framed.orm.ui.command.AttributeOperationCommands;

import org.eclipse.gef.commands.Command;
import org.framed.orm.model.NamedElement;
import org.framed.orm.model.Segment;

/**
 * Through this command attributes and operations(in the graphical model both are NamedElements) can
 * be deleted( removed from the model tree).
 * 
 * @author Kay Bierzynski
 * @author Lars Schuetze
 * */
public class ORMAttributeOperationDeleteCommand extends Command {

  /** The attribute or operation, which will be deleted/removed in this command. */
  private NamedElement element;
  /** The parent {@link Segment} from which the attribute or operation is deleted/removed. */
  private Segment segment;
  /**
   * The position of the attribute or operation in the named element list of the parent
   * {@link Segment}. This variable is needed to put the attribute or operation at the correct
   * position in the named element list when this command should be undone.
   */
  private int position;

  /**
   * Constructor of this command, where the label is set, which describes this command to the user.
   * 
   */
  public ORMAttributeOperationDeleteCommand() {
    super.setLabel("ORMAttributeOperationDelete");
  }

  /**
   * {@inheritDoc} In this method the attribute or operation is removed from the named element list
   * of the parent {@link Segment} and it's initial position in the named element list is saved for
   * the case that the user wants to undone this command. Through this the attribute or operation is
   * removed from the model tree.
   */
  @Override
  public void execute() {
    position = segment.getElements().indexOf(element);
    segment.getElements().remove(element);
  }

  /**
   * {@inheritDoc} To undo this command the attribute or operation is readded to the named element
   * list of the parent {@link Segment}. Through the position variable we can add the attribute or
   * operation at it's initial position.
   */
  @Override
  public void undo() {
    segment.getElements().add(position, element);
  }

  /**
   * Setter of the attribute or operation, which should be deleted/removed.
   * 
   * @param element org.framed.orm.model.NamedElement
   */
  public void setElement(final NamedElement element) {
    this.element = element;
  }

  /**
   * Setter for parent {@link Segment} from which the attribute or operation should be
   * deleted/removed.
   * 
   * @param element org.framed.orm.model.Segment
   */
  public void setParentSegment(final Segment segment) {
    this.segment = segment;
  }


}
