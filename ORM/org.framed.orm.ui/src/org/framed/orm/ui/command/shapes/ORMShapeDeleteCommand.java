package org.framed.orm.ui.command.shapes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.gef.commands.Command;
import org.framed.orm.model.Model;
import org.framed.orm.model.ModelElement;
import org.framed.orm.model.Relation;
import org.framed.orm.model.Shape;

/**
 * Through this command all {@link Shape}s can be deleted(removed from
 * the model tree).
 * 
 * @author Kay Bierzynski
 * */
public class ORMShapeDeleteCommand extends Command {

  /** The {@link Shape} to be removed. */
  protected Shape shape;
  
  /** The {@link Model} from which the {@link Shape} should be removed. */
  protected Model parent;
  
  /**
   * A list, which contains all {@link Relation}s that are connected to the {@link Shape} to be
   * removed. This list necessary for the case that the user wants to undo this command.
   */
  protected List<Relation> relations;
  
  /**
   * Sources for the {@link Relation}s that start or end at this {@link Shape}. This list necessary
   * for the case that the user wants to undo this command.
   */
  private Map<Relation, ModelElement> sourceLinks;
  
  /**
   * Targets for the {@link Relation}s that start or end at this {@link Shape}. This list necessary
   * for the case that the user wants to undo this command.
   */
  private Map<Relation, ModelElement> targetLinks;

  /**
   * Constructor of this command, where the label is set, which describes this command to the user
   * and the relations list is initialized.
   * 
   */
  public ORMShapeDeleteCommand() {
    super.setLabel("ORMShapeDelete");
    relations = new ArrayList<Relation>();
  }

  /**
   * {@inheritDoc} In this method the {@link Shape} is deleted/removed from the model tree through
   * setting the parent {@link Model} reference on null and through the deletion of all
   * {@link Relation}s which connected to this {@link Shape}.
   */
  @Override
  public void execute() {
    detachLinks();
    shape.setContainer(null);
  }

  /**
   * {@inheritDoc} This command is undone though resetting of the parent {@link Model} reference on the
   * initial value and through the recreation of all {@link Relation}s which connected to this
   * {@link Shape}.
   */
  @Override
  public void undo() {
    reattachLinks();
    shape.setContainer(parent);
  }

  /**
   * Detach/Delete all {@link Relation}s from this {@link Shape} and their source/target {@link Shape}
   * and storing the connection information in local data structures.
   */
  protected void detachLinks() {
    sourceLinks = new HashMap<Relation, ModelElement>();
    targetLinks = new HashMap<Relation, ModelElement>();
    relations.addAll(shape.getIncomingRelations());
    relations.addAll(shape.getOutgoingRelations());
    for (Relation relation : relations) {
      sourceLinks.put(relation, relation.getSource());
      targetLinks.put(relation, relation.getTarget());
      relation.setSource(null);
      relation.setTarget(null);
      relation.setContainer(null);
    }
  }

  /**
   * Reattach/Recreate all {@link Relation}s to this {@link Shape} and their source/target
   * {@link Shape}.
   */
  private void reattachLinks() {
    for (Relation relation : relations) {
      relation.setSource(sourceLinks.get(relation));
      relation.setTarget(targetLinks.get(relation));
      relation.setContainer(parent);
    }
  }

  /**
   * Setter for the {@link Shape}, which is to be removed in this command. The local parent variable
   * is set here as well.
   * 
   * @param shape org.framed.orm.model.Shape
   * */
  public void setShape(final Shape shape) {
    this.shape = shape;
    this.parent = shape.getContainer();
  }
}
