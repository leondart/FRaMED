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
import org.framed.orm.model.Type;

/**
 * Through this command all {@link Shape}s can be deleted(removed from the model tree).
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
   * {@inheritDoc} This command is undone though resetting of the parent {@link Model} reference on
   * the initial value and through the recreation of all {@link Relation}s which connected to this
   * {@link Shape}.
   */
  @Override
  public void undo() {
    reattachLinks();
    shape.setContainer(parent);
  }

  /**
   * Detach/Delete all {@link Relation}s from this {@link Shape} and their source/target
   * {@link Shape} and storing the connection information in local data structures.
   */
  protected void detachLinks() {
    if (shape.getType().equals(Type.ROLE_GROUP)) {
      detachLinksRoleGroup();
    }
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

  /**
   * Because a {@link Relation} from type rolegroup has a child model, which can contain other child models
   * through role groups. Not only the {@link Relation}s connected to this roleGroup must be
   * detached/deleted the {@link Relation}s connected to the children and their children of this
   * roleGroup child model must be detached/deleted as well. For that reason the first thing, which is
   * done in this method is to gather all children and their children of this roleGroup in a
   * single list. After that the {@link Relation}s connected to children are added to relations
   * list.
   *
   */
  private void detachLinksRoleGroup() {
    ArrayList<Shape> items = new ArrayList<Shape>();
    for (ModelElement ele : shape.getModel().getElements()) {
      if (ele instanceof Shape) {
        items.add((Shape) ele);
      }
    }
    gatherRoleGroupsItems(items);
    for (Shape item : items) {
      // add all relations with the source not in the RG and the target in the RG
      for (Relation rel : item.getIncomingRelations()) {
        if (!items.contains(rel.getSource()))
          relations.add(rel);
      }
      // add all relations with the source in the RG and the target not in the RG
      for (Relation rel : item.getOutgoingRelations()) {
        if (!items.contains(rel.getTarget()))
          relations.add(rel);
      }
    }
  }

  /**
   * This method puts adds the children of the children and so on of the {@link Reletion}s from type
   * role group child model to the list, which was given initaily.
   * */
  private void gatherRoleGroupsItems(final List<Shape> items) {
    List<Shape> items2 = new ArrayList<Shape>();
    for (Shape item : items) {
      if (item.getType().equals(Type.ROLE_GROUP)) {
        for (ModelElement ele : item.getModel().getElements()) {
          if (ele instanceof Shape) {
            items2.add((Shape) ele);
          }
        }
        gatherRoleGroupsItems(items2);
      }
    }
    items.addAll(items2);
  }

}
