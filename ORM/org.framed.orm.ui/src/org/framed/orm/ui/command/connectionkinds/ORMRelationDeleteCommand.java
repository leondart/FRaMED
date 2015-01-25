package org.framed.orm.ui.command.connectionkinds;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.draw2d.Bendpoint;
import org.eclipse.gef.commands.Command;
import org.framed.orm.geometry.RelativePoint;
import org.framed.orm.model.Model;
import org.framed.orm.model.ModelElement;
import org.framed.orm.model.Relation;
import org.framed.orm.model.Type;
import org.framed.orm.ui.editPart.connectionkinds.ORMRelationshipConstraintEditPart;

/**
 * Through this command all {@link Relation}s except the {@link Relation}s from type cyclic, total
 * and irreflexive(relationshipConstraints) can be deleted(removed from the model tree). The
 * relationshipConstraints need an extra command, because after every deletion of a
 * relationshipConstraint the {@link ORMRelationshipConstraintEditPart} of the other
 * relationshipConstraints from the same {@link Relation} from type relationship muste be refreshed.
 * 
 * @author Kay Bierzynski
 * */
public class ORMRelationDeleteCommand extends Command {

  /** The {@link Relation} to be removed. */
  private Relation relation;
  /** The {@link Model} from which the {@link Relation} should be removed. */
  private Model parent;
  /** The source/start {@link ModelElement} of the {@link Relation} to be removed. */
  private ModelElement source;
  /** The target/end {@link ModelElement} of the {@link Relation} to be removed. */
  private ModelElement target;
  /**
   * A list, which stores the {@link Bendpoint}s positions for the case that the user wants to undo
   * this command.
   */
  private ArrayList<RelativePoint> bendpoints = new ArrayList<RelativePoint>();

  /**
   * A list, which contains all {@link Relation}s that are connected to the {@link Relation} to be
   * removed. This list necessary for the case that the user wants to undo this command.
   */
  protected List<Relation> relations;

  /**
   * Sources for the {@link Relation}s that start or end at this {@link Relation}. This list necessary
   * for the case that the user wants to undo this command.
   */
  private Map<Relation, ModelElement> sourceLinks;

  /**
   * Targets for the {@link Relation}s that start or end at this {@link Relation}. This list necessary
   * for the case that the user wants to undo this command.
   */
  private Map<Relation, ModelElement> targetLinks;


  /**
   * Constructor of this command, where the label is set, which describes this command to the user.
   * 
   */
  public ORMRelationDeleteCommand() {
    super.setLabel("ORMRelationDelete");
    relations = new ArrayList<Relation>();
  }

  /**
   * This method tests if the conditions for executing this command are fulfilled,
   * 
   * @return true if the parameter relation is set.
   */
  @Override
  public boolean canExecute() {
    return relation != null;
  }

  /**
   * {@inheritDoc} In this method all the attributes of the {@link Relation} to be removed are
   * stored in variables in case that the user wants to undone this command. After this part the
   * {@link Relation} is removed from the source, the {@link Model} and the target and all of
   * it's {@link Bendpoint}s are deleted.
   * 
   */
  @Override
  public void execute() {
    parent = relation.getContainer();
    source = relation.getSource();
    target = relation.getTarget();
    bendpoints.addAll(relation.getBendpoints());
    if(relation.getType().equals(Type.RELATIONSHIP)){
      detachLinks();
      relation.getReferencedRoles().get(0).setContainer(null);
    }

    relation.setSource(null);
    relation.setTarget(null);
    relation.setContainer(null);
    relation.getBendpoints().clear();
  }

  /**
   * {@inheritDoc} This command is undone through the recreation/ invoking of the {@link Relation}
   * into the model tree through setting it's attributes.
   */
  @Override
  public void undo() {
    relation.setSource(source);
    relation.setTarget(target);
    relation.setContainer(parent);
    relation.getBendpoints().addAll(bendpoints);
    if(relation.getType().equals(Type.RELATIONSHIP)){
      reattachLinks();
      relation.getReferencedRoles().get(0).setContainer(parent);
    }
  }
  
  
  /**
   * Detach/Delete all {@link Relation}s from this {@link Relation} and their source/target
   * {@link Relation} and storing the connection information in local data structures.
   */
  protected void detachLinks() {
    sourceLinks = new HashMap<Relation, ModelElement>();
    targetLinks = new HashMap<Relation, ModelElement>();
    relations.addAll(relation.getReferencedRoles().get(0).getIncomingRelations());
    relations.addAll(relation.getReferencedRoles().get(0).getOutgoingRelations());
    for (Relation relation : relations) {
      sourceLinks.put(relation, relation.getSource());
      targetLinks.put(relation, relation.getTarget());
      relation.setSource(null);
      relation.setTarget(null);
      relation.setContainer(null);
    }
  }

  /**
   * Reattach/Recreate all {@link Relation}s to this {@link Relation} and their source/target
   * {@link Relation}.
   */
  private void reattachLinks() {
    for (Relation relation : relations) {
      relation.setSource(sourceLinks.get(relation));
      relation.setTarget(targetLinks.get(relation));
      relation.setContainer(parent);
    }
  }
  
  /**
   * Setter for the {@link Relation}, which is deleted/removed in this command.
   * 
   * @param relation org.framed.orm.model.Relation
   * */
  public void setRelation(final Relation relaiton) {
    relation = relaiton;
  }

}
