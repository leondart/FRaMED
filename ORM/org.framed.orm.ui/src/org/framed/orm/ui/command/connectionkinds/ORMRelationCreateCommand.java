package org.framed.orm.ui.command.connectionkinds;

import java.util.ArrayList;

import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.gef.commands.Command;
import org.framed.orm.model.Relation;
import org.framed.orm.model.Node;
import org.framed.orm.model.RelationContainer;

/**
 * @author Kay Bierzynski
 * */
public class ORMRelationCreateCommand extends Command {

  /***/
  protected Node target;
  /***/
  protected Node source;
  /***/
  protected Relation relation;
  /***/
  protected RelationContainer relcon;

  /***/
  public ORMRelationCreateCommand() {
    super.setLabel("ORMRelationCreate");
  }

  /***/
  @Override
  public boolean canExecute() {
    return target != null && source != null && relation != null && relcon != null;
  }

  /***/
  @Override
  public void execute() {

    relation.setSource(source);
    relation.setTarget(target);
    relation.setRelationContainer(relcon);
    
    // for self-loop
    if (source.equals(target)) {
      insertSelfLoopBPs();
    } else {
      Point ps = new Point(source.getConstraints().x(), source.getConstraints().y());
      Point pt = new Point(target.getConstraints().x(), target.getConstraints().y());
      adaptRelationCreation(ps, pt);
    }

   

  }

  /***/
  @Override
  public void undo() {
    relation.getSource().getOutgoingLinks().remove(relation);
    relation.setSource(null);
    relation.getTarget().getIncomingLinks().remove(relation);
    relation.setTarget(null);
    relation.setRelationContainer(null);
    relation.getDim1BP().clear();
    relation.getDim2BP().clear();
  }

  /***/
  public void adaptRelationCreation(final Point ps, final Point pt) {

    final ArrayList<Relation> relsIn = new ArrayList<Relation>();
    relsIn.addAll(target.getIncomingLinks());
    relsIn.retainAll(source.getOutgoingLinks());

    final ArrayList<Relation> rels = new ArrayList<Relation>();
    rels.addAll(target.getOutgoingLinks());
    rels.retainAll(source.getIncomingLinks());
    rels.addAll(relsIn);
    
    int relCount = rels.size();
    
    if (relCount > 1) {

      final Point p = new Point((ps.x() + pt.x()) / 2, (ps.y() + pt.y()) / 2);
      Dimension d1 = p.getDifference(ps);
      Dimension d2 = p.getDifference(pt);

      Point dim1P = new Point(d1.width(), d1.height());
      Point dim2P = new Point(d2.width(), d2.height());
      
      
      if (relCount % 2 == 0) {
        relCount = relCount / 2;
        if (Math.abs(dim1P.y()) > Math.abs(dim1P.x())) {
          dim1P.setX(-(dim1P.x() + relCount * 20));
          dim2P.setX(-(dim2P.x() + relCount * 20));
        } else {
          dim1P.setY(-(dim1P.y() + relCount * 20));
          dim2P.setY(-(dim2P.y() + relCount * 20));
        }
      } else {
        relCount = (relCount + 1) / 2;
        if (Math.abs(dim1P.y()) > Math.abs(dim1P.x())) {
          dim1P.setX(dim1P.x() + relCount * 20);
          dim2P.setX(dim2P.x() + relCount * 20);
        } else {
          dim1P.setY(dim1P.y() + relCount * 20);
          dim2P.setY(dim2P.y() + relCount * 20);
        }
      }

      relation.getDim1BP().add(dim1P);
      relation.getDim2BP().add(dim2P);
    }

  }

  /***/
  public void insertSelfLoopBPs() {
    final int width = source.getConstraints().width();
    final int height = source.getConstraints().height();
    relation.getDim1BP().add(new Point(0, height / 2 + 30));
    relation.getDim1BP().add(new Point(width / 2 + 30, height / 2 + 30));
    relation.getDim1BP().add(new Point(width / 2 + 30, 0));
    relation.getDim2BP().add(new Point(0, height / 2 + 30));
    relation.getDim2BP().add(new Point(width / 2 + 30, height / 2 + 30));
    relation.getDim2BP().add(new Point(width / 2 + 30, 0));
  }

  /***/
  public void setSourceNode(final Node source) {
    this.source = source;
  }

  /***/
  public void setTargetNode(final Node target) {
    this.target = target;
  }

  /***/
  public void setRelation(final Relation relation) {
    this.relation = relation;
  }

  /***/
  public void setRelationContainer(final RelationContainer relcon) {
    this.relcon = relcon;
  }
}
