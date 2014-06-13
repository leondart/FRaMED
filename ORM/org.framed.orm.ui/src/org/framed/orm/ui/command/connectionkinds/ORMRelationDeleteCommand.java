package org.framed.orm.ui.command.connectionkinds;

import java.util.ArrayList;

import org.eclipse.draw2d.geometry.Point;
import org.eclipse.gef.commands.Command;
import org.framed.orm.model.Node;
import org.framed.orm.model.Relation;
import org.framed.orm.model.Container;

/**
 * @author Kay Bierzynski
 * */
public class ORMRelationDeleteCommand extends Command {

  /** Relation to be deleted. */
  private Relation relation;
  /** RelationContainer that owns the relatiob. */
  private Container parent;
  /** Source of the relation. */
  private Node source;
  /** Target of the relation. */
  private Node target;
  
  private ArrayList<Point> dim1BPList = new ArrayList<Point>();
  
  private ArrayList<Point> dim2BPList = new ArrayList<Point>();
  
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
    parent = relation.getRelationContainer();
    source = relation.getSource();
    target = relation.getTarget();
    dim1BPList.addAll(relation.getDim1BP());
    dim2BPList.addAll(relation.getDim2BP());
    
    relation.setSource(null);
    relation.setTarget(null);
    relation.setRelationContainer(null);
    relation.getDim1BP().clear();
    relation.getDim2BP().clear();
  }

  /**
   * Reconnect the relation to the source and target and add it to the owner RelationContainer.
   */
  @Override
  public void undo() {
    relation.setSource(source);
    relation.setTarget(target);
    relation.setRelationContainer(parent);
    relation.getDim1BP().addAll(dim1BPList);
    relation.getDim2BP().addAll(dim2BPList);
    
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
