package org.framed.orm.ui.command.connectionkinds;

import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.gef.commands.Command;
import org.framed.orm.model.Relation;

/**
 * @author Kay Bierzynski
 * */
public class ORMRelationCreateBendpointCommand extends Command {

  /** Index on which the new bendpoint is added. */
  private int index;

  private Dimension dim1, dim2;
  /** Relation to which the bendpoint is added. */
  private Relation relation;

  public ORMRelationCreateBendpointCommand(){
    super.setLabel("ORMRelationCreateBendpoint");
  }
  
  @Override
  public void execute() {
    Point source = new Point(dim1.width, dim1.height);
    Point target = new Point(dim2.width, dim2.height);
    relation.getDim1BP().add(index, source);
    relation.getDim2BP().add(index, target);
  }

  @Override
  public void undo() {
    relation.getDim1BP().remove(index);
    relation.getDim2BP().remove(index);
  }

  /**
   * Set the index on which the bendpoint is added.
   * 
   * @param index Index on which the bendpoint should be added.
   */
  public void setIndex(final int index) {
    this.index = index;
    // TODO:validation checks.
  }

  /**
   * Set the relation on which the new bendpoint is added.
   * 
   * @param relation relation on which the bendpoint is added.
   */
  public void setRelation(final Relation relation) {
    this.relation = relation;
  }

  public void setDimension(Dimension dim1, Dimension dim2) {
    this.dim1 = dim1;
    this.dim2 = dim2;
  }
}
