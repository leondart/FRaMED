package org.framed.orm.ui.command.nodes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.gef.commands.Command;
import org.framed.orm.model.Container;
import org.framed.orm.model.Node;
import org.framed.orm.model.Relation;
import org.framed.orm.model.RoleGroup;

/**
 * Through this command all {@link Node}s except the {@link RoleGroup}s can be created(invoked into
 * the model tree). The {@link RoleGroup}s need a extra command, because in their case the
 * {@link Relation}, which are connected to role group, need to be gathered in a speical way. This
 * is so, because a {@link RoleGroup} is a {@link Container}
 * 
 * @author Kay Bierzynski
 * */
public class ORMNodeDeleteCommand extends Command {

  /** The {@link Node} to be removed. */
  protected Node node;
  /** The {@link Container} from which the {@link Node} should be removed. */
  protected Container parent;
  /**
   * A list, which contains all {@link Relation}s that are connected to the {@link Node} to be
   * removed. This list necessary for the case that the user wants to undo this command.
   */
  protected List<Relation> relations;
  /**
   * Sources for the {@link Relation}s that start or end at this {@link Node}. This list necessary
   * for the case that the user wants to undo this command.
   */
  private Map<Relation, Node> sourceLinks;
  /**
   * Targets for the {@link Relation}s that start or end at this {@link Node}. This list necessary
   * for the case that the user wants to undo this command.
   */
  private Map<Relation, Node> targetLinks;

  /**
   * Constructor of this command, where the label is set, which describes this command to the user
   * and the relations list is initialized.
   * 
   */
  public ORMNodeDeleteCommand() {
    super.setLabel("ORMNodeDelete");
    relations = new ArrayList<Relation>();
  }

  /**
   * {@inheritDoc} In this method the {@link Node} is deleted/removed from the model tree through
   * setting the {@link Container} reference on null and through the deletion of all
   * {@link Relation}s which connected to this {@link Node}.
   */
  @Override
  public void execute() {
    detachLinks();
    node.setContainer(null);
  }

  /**
   * {@inheritDoc} This command is undone though resetting of the {@link Container} reference on the
   * initial value and through the recreation of all {@link Relation}s which connected to this
   * {@link Node}.
   */
  @Override
  public void undo() {
    reattachLinks();
    node.setContainer(parent);
  }

  /**
   * Detach/Delete all {@link Relation}s from this {@link Node} and their source/target {@link Node}
   * and storing the connection information in local data structures.
   */
  protected void detachLinks() {
    sourceLinks = new HashMap<Relation, Node>();
    targetLinks = new HashMap<Relation, Node>();
    relations.addAll(node.getIncomingLinks());
    relations.addAll(node.getOutgoingLinks());
    for (Relation link : relations) {
      sourceLinks.put(link, link.getSource());
      targetLinks.put(link, link.getTarget());
      link.setSource(null);
      link.setTarget(null);
      link.setRelationContainer(null);
    }
  }

  /**
   * Reattach/Recreate all {@link Relation}s to this {@link Node} and their source/target
   * {@link Node}.
   */
  private void reattachLinks() {
    for (Relation link : relations) {
      link.setSource(sourceLinks.get(link));
      link.setTarget(targetLinks.get(link));
      link.setRelationContainer(parent);
    }
  }

  /**
   * Setter for the {@link Node}, which is tobe removed in this command. The local parent variable
   * is set here as well.
   * 
   * @param node org.framed.orm.model.Node
   * */
  public void setNode(final Node node) {
    this.node = node;
    this.parent = node.getContainer();
  }
}
