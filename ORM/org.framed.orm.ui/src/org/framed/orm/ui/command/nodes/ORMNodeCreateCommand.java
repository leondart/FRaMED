package org.framed.orm.ui.command.nodes;

import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.commands.Command;
import org.framed.orm.model.Compartment;
import org.framed.orm.model.Container;
import org.framed.orm.model.Grouping;
import org.framed.orm.model.Node;

/**
 * Through this command all {@link Node}s except the {@link Compartment}s and the {@link Grouping}s
 * can be created(invoked into the model tree). The {@link Compartment}s and the {@link Grouping}s need a extra command,
 * because for their creation their child {@link Rolemodel} must be setted as well.
 * 
 * @author Kay Bierzynski
 * */
public class ORMNodeCreateCommand extends Command {

  /** The {@link Container} to which the {@link Node} should be added. */
  private Container parent;
  /**
   * The {@link Node} to be created. The basis class of the {@link Node} is given by a factory.
   */
  protected Node node;
  /**
   * A {@link Rectangle}, which represents the boundaries of the {@link Node}. The boundaries describes the width
   * and heigth of the {@link Node} in the viewer.
   */
  private Rectangle boundaries;

  /**
   * Constructor of this command, where the label is set, which describes this command to the user.
   * 
   */
  public ORMNodeCreateCommand() {
    super.setLabel("ORMNodeCreate");
  }


  /**
   * This method tests if the conditions for executing this command are fulfilled,
   * 
   * @return true if the parameter boundaries, node and parent are set.
   */
  @Override
  public boolean canExecute() {

    return boundaries != null && parent != null && node != null;
  }


  /**
   * {@inheritDoc} In this method the {@link Node} is created/ invoked into the model tree through
   * setting it's boundaries and {@link Container}.
   */
  @Override
  public void execute() {

    node.setConstraints(boundaries);
    node.setContainer(parent);
  }

  /**
   * {@inheritDoc} This command is undone through removing the created {@link Node} from the the
   * {@link Container} and deleting it's boundaries.
   * 
   */
  @Override
  public void undo() {

    node.setConstraints(null);
    node.setContainer(null);
  }


  /**
   * Setter for the boundaries of the {@link Node}, which is to be created.
   * 
   * @param boundaries org.eclipse.draw2d.geometry.Rectangle
   * */
  public void setBoundaries(final Rectangle boundaries) {
    this.boundaries = boundaries;
  }
  
  /**
   * Setter for the {@link Node}, which is created/invoked in this command.
   * 
   * @param node org.framed.orm.model.Node
   * */
  public void setNode(final Node node) {
    this.node = node;
  }

  /**
   * Setter for the {@link Container} to which the {@link Node} should be added.
   * 
   * @param parent org.framed.orm.model.Container
   * */
  public void setContainer(final Container parent) {
    this.parent = parent;
  }
}
