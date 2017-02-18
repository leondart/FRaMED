package org.framed.orm.ui.command.AttributeOperationCommands;

import org.eclipse.gef.commands.Command;
import org.framed.orm.model.NamedElement;
import org.framed.orm.model.Segment;
import org.framed.orm.model.Shape;
import org.framed.orm.ui.factory.ORMAttributeFactory;
import org.framed.orm.ui.factory.ORMOperationFactory;

/**
 * Through this command a attribute or operation can be created(invoked into the model tree).
 *
 * @author Kay Bierzynski
 * */
public class ORMAttributeOperationCreateCommand extends Command {

  /** The attribute or operation, which will be created/invoked in this command. */
  private NamedElement element;
  /**
   * The parent {@link Segment} to which the attribute or operation is added.
   */
  private Segment segment;

  /**
   * Constructor of this command, where the label is set, which describes this command to the user.
   *
   */
  public ORMAttributeOperationCreateCommand() {
    super.setLabel("ORMAttributeOperationCreate");
  }

  /**
   * This method tests if the conditions for executing this command are fulfilled,
   *
   * @return true when the parent segment and the attribute or operation are set.
   */
  @Override
  public boolean canExecute() {
    return segment != null && element != null;
  }

  /**
   * {@inheritDoc} In this methode the name for the attribute or operation is initialized with the
   * name <...> and the attribute or operation is added to named element list of it's parent.
   */
  @Override
  public void execute() {
    element.setName("<...>");
    segment.getElements().add(element);
  }

  /**
   * {@inheritDoc} To undo this command the attribute or operation is removed from named element
   * list of it's parent {@link Segment}. Through this the attribute or operation is removed from
   * the model tree.
   */
  @Override
  public void undo() {
    segment.getElements().remove(element);
  }

  /**
   * Setter of the parent {@link Segment}
   *
   * @param Segment org.framed.orm.model.Segment
   */
  public void setParentSegment(final Segment segment) {
    this.segment = segment;
  }

  /**
   * Getter for parent model for editpolicyhandler
   *
   */
  public Shape getParent() {
    return ((Shape) this.segment.eContainer());
  }

  /**
   * Setter of the attribute or operation, which should be created/invoked. The basis attribute or
   * operation class is given by {@link ORMAttributeFactory} or {@link ORMOperationFactory}.
   *
   * @param element org.framed.orm.model.NamedElement
   */
  public void setElement(final NamedElement element) {
    this.element = element;
  }
}
