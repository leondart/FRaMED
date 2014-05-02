package org.framed.orm.ui.command.connectionkinds;

import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.gef.commands.Command;
import org.framed.orm.model.Relation;


/**
 * Move a link bendpoint. This class is declared final since it has a very specific functionality.
 * 
 * @author Kay Bierzynski
 */
public class ORMRelationMoveBendpointCommand extends Command {

  /** Index of the bendpoint in the relations's bendpoint list. */
  private int index;
  /** Relation that contains the bendpoint. */
  private Relation relation;

  private Point oldDim1, oldDim2;
  private Dimension newDim1, newDim2;

  public ORMRelationMoveBendpointCommand(){
    super.setLabel("ORMRelationMoveBendpoint");
  }
  
  /** Move the bendpoint to the new location. */
  public void execute() {
    if (oldDim1 == null && oldDim2 == null) {
      oldDim1 = relation.getDim1BP().get(index);
      oldDim2 = relation.getDim2BP().get(index);
    }

    Point source = new Point(newDim1.width, newDim1.height);
    Point target = new Point(newDim2.width, newDim2.height);
    relation.getDim1BP().set(index, source);
    relation.getDim2BP().set(index, target);
  }

  /** Restore the old location of the bendpoint. */
  @Override
  public void undo() {
    relation.getDim1BP().set(index, oldDim1);
    relation.getDim2BP().set(index, oldDim2);
  }

  /**
   * Set the index where the bendpoint is located in the bendpoint list.
   * 
   * @param index the index where the bendpoint is located.
   */
  public void setIndex(final int index) {
    this.index = index;
  }

  /**
   * Set the relation where the bendpoint is located.
   * 
   * @param relation the relation where the bendpoint is located.
   */
  public void setRelation(final Relation relation) {
    this.relation = relation;
  }


  public void setNewDimension(Dimension dim1, Dimension dim2) {
    this.newDim1 = dim1;
    this.newDim2 = dim2;
  }
}
