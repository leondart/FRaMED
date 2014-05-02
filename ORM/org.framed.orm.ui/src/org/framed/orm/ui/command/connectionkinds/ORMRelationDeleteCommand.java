package org.framed.orm.ui.command.connectionkinds;

import org.eclipse.gef.commands.Command;

import org.framed.orm.model.Node;
import org.framed.orm.model.Relation;
import org.framed.orm.model.RelationContainer;

/**
 * @author Kay Bierzynski
 * */
public class ORMRelationDeleteCommand extends Command {

  /** Relation to be deleted. */
  private Relation relation;
  /** RelationContainer that owns the relatiob. */
  private RelationContainer relationCon;
  /** Source of the relation. */
  private Node source;
  /** Target of the relation. */
  private Node target;

  public ORMRelationDeleteCommand() {
    super.setLabel("ORMRelationDelete");
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public boolean canExecute() {
    return relation != null;
  }

  /**
   * Disconnect Relation from source and target things and remove from owner RelationConatiner.
   */
  @Override
  public void execute() {
    relationCon = relation.getRelationContainer();
    source = relation.getSource();
    target = relation.getTarget();

    relation.setSource(null);
    relation.setTarget(null);
    relation.setRelationContainer(null);
  }

  /**
   * Reconnect the relation to the source and target and add it to the owner RelationContainer.
   */
  @Override
  public void undo() {
    relation.setSource(source);
    relation.setTarget(target);
    relation.setRelationContainer(relationCon);
  }

  /**
   * Set the relation that will be delete from the diagram.
   * 
   * @param relaiton the relation to delete from the diagram.
   */
  public void setRelation(final Relation relaiton) {
    relation = relaiton;
  }
}
