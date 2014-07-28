package org.framed.orm.ui.command.connectionkinds;

import java.util.ArrayList;

import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.gef.commands.Command;
import org.framed.orm.model.Node;
import org.framed.orm.model.Relation;
import org.framed.orm.model.Container;
import org.framed.orm.model.Relationship;
import org.framed.orm.model.RelationshipConstraint;

/**
 * Through this command all {@link Relation}s except the {@link RelationshipConstraint}s can be
 * created(invoked into the model tree). The {@link RelationshipConstraint}s need a extra command,
 * because for their creation the {@link Relationship}s to which they belong must be setted as well.
 * 
 * @author Kay Bierzynski
 * */
public class ORMRelationCreateCommand extends Command {

  /** The target/end {@link Node} of the {@link Relation} to be created. */
  protected Node target;
  /** The source/start {@link Node} of the {@link Relation} to be created. */
  protected Node source;
  /**
   * The {@link Relation} to be created. The basis class of the {@link Relation} is given by a
   * factory.
   */
  protected Relation relation;
  /** The {@link Container} to which the {@link Relation} should be added. */
  protected Container parent;

  /**
   * Constructor of this command, where the label is set, which describes this command to the user.
   * 
   */
  public ORMRelationCreateCommand() {
    super.setLabel("ORMRelationCreate");
  }

  /**
   * This method tests if the conditions for executing this command are fulfilled,
   * 
   * @return true if the parameter target, source, relation and parent are set.
   */
  @Override
  public boolean canExecute() {
    return target != null && source != null && relation != null && parent != null;
  }

  /**
   * {@inheritDoc} In this method the {@link Relation} is created/ invoked into the model tree
   * through setting it's parameter. After that three {@link Bendpoint}s are added to the
   * {@link Relation}, when the source and target of the {@link Relation} are equal. This needs to
   * be done or else the {@link Relation} is not visible/ doesn't look good to the user. When the
   * source and target of the {@link Relation} are not equal and more as one {@link Relation} exists
   * between the target and the source than a {@link Bendpoint} is added to the created
   * {@link Relation} to make the {@link Relation} better visibile/ acessesible to the user.
   * 
   */
  @Override
  public void execute() {

    relation.setSource(source);
    relation.setTarget(target);
    relation.setRelationContainer(parent);

    // when source and target of the {@link Relation} are equal, than call insertSelfLoopBPs()
    // method, because to make the {@link Relation} visible/look good to the use we need to insert
    // three {@link Bendpoint}
    if (source.equals(target)) {
      insertSelfLoopBPs();
    }

    int relationCount = getRelationCount();
    if (relationCount > 1 && !source.equals(target)) {
      Point ps = new Point(source.getConstraints().x(), source.getConstraints().y());
      Point pt = new Point(target.getConstraints().x(), target.getConstraints().y());
      adaptRelationCreation(ps, pt, relationCount);
    }
  }

  /**
   * {@inheritDoc} This command is undone through removing the created {@link Relation} from the
   * source, the {@link Container} and the target and through deleting all the {@link Bendpoint}s of
   * the {@link Relation}.
   * 
   */
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

  /**
   * This method is for determining the number of {@link Relation}s between the source and target.
   * 
   * @return number of relations between source and target.
   * */
  public int getRelationCount() {
    // get all relations which are come from the source and go to the target
    final ArrayList<Relation> relsIn = new ArrayList<Relation>();
    relsIn.addAll(target.getIncomingLinks());
    relsIn.retainAll(source.getOutgoingLinks());

    // get all relations which are come from the target and go to the source
    final ArrayList<Relation> rels = new ArrayList<Relation>();
    rels.addAll(target.getOutgoingLinks());
    rels.retainAll(source.getIncomingLinks());

    return rels.size() + relsIn.size();
  }

  /**
   * In this method a {@link Bendpoint} is added to the created {@link Relation}, when between
   * source and target more than one {@link Relation} exists.
   */
  public void adaptRelationCreation(final Point ps, final Point pt, final int relationCount) {

    int relCount = relationCount;

    // calculate initial dimensions to get started
    final Point p = new Point((ps.x() + pt.x()) / 2, (ps.y() + pt.y()) / 2);
    Dimension d1 = p.getDifference(ps);
    Dimension d2 = p.getDifference(pt);

    // put the dimension in points to prepare them for adding to the relation
    Point dim1P = new Point(d1.width(), d1.height());
    Point dim2P = new Point(d2.width(), d2.height());

    // calculate the x(width) and y(heigth) gaps between the dimensions for adjusting the bendpoint
    // position
    int xGap = Math.abs(Math.abs(dim2P.x()) - Math.abs(dim1P.x()));
    int yGap = Math.abs(Math.abs(dim2P.y()) - Math.abs(dim1P.y()));

    // every "second"(2,4,6,..) relation gets a bendpoint, which lays above/ left from a realtion
    // between source
    // and target that has no bendpoints
    // else branch: every "first"(3,5,7..) relation gets a bendpoint, which lays beneath/rigth from
    // a realtion between source
    // and target that has no bendpoints
    if (relCount % 2 == 0) {
      relCount = relCount / 2;
      // test if the target/source is above/beneath the source/target
      // else branch is for the case when target and source are next to each other
      if (Math.abs(dim1P.y()) > Math.abs(dim1P.x()) || xGap == yGap) {
        dim1P.setX(-(dim1P.x() + relCount * 20));
        dim2P.setX(-(dim2P.x() + relCount * 20));
      } else {
        dim1P.setY(-(dim1P.y() + relCount * 20));
        dim2P.setY(-(dim2P.y() + relCount * 20));
      }
    } else {
      relCount = (relCount + 1) / 2;
      // test if the target/source is above/beneath the source/target
      // else branch is for the case when target and source are next to each other
      if (Math.abs(dim1P.y()) > Math.abs(dim1P.x()) || xGap == yGap) {
        dim1P.setX(dim1P.x() + relCount * 20);
        dim2P.setX(dim2P.x() + relCount * 20);
      } else {
        dim1P.setY(dim1P.y() + relCount * 20);
        dim2P.setY(dim2P.y() + relCount * 20);
      }
    }

    // add the bendpoint to the relaton
    relation.getDim1BP().add(dim1P);
    relation.getDim2BP().add(dim2P);


  }

  /**
   * This method adds three {@link Bendpoint}s to relation and should only be called when the source
   * equals the traget.
   * */
  public void insertSelfLoopBPs() {
    final int width = source.getConstraints().width();
    final int height = source.getConstraints().height();
    // first bendpoint which lays beneaths the source/target
    relation.getDim1BP().add(new Point(0, height / 2 + 30));
    relation.getDim2BP().add(new Point(0, height / 2 + 30));
    // second bendpoint which lays in the southeast from the source/target
    relation.getDim1BP().add(new Point(width / 2 + 30, height / 2 + 30));
    relation.getDim2BP().add(new Point(width / 2 + 30, height / 2 + 30));
    // third bendpoint which lays in the east from the source/target
    relation.getDim1BP().add(new Point(width / 2 + 30, 0));
    relation.getDim2BP().add(new Point(width / 2 + 30, 0));
  }

  /**
   * Setter for the source of the {@link Relation}.
   * 
   * @param source org.framed.orm.model.Node
   * */
  public void setSourceNode(final Node source) {
    this.source = source;
  }

  /**
   * Setter for the target of the {@link Relation}.
   * 
   * @param target org.framed.orm.model.Node
   * */
  public void setTargetNode(final Node target) {
    this.target = target;
  }

  /**
   * Setter for the {@link Relation}, which is created/invoked in this command.
   * 
   * @param relation org.framed.orm.model.Relation
   * */
  public void setRelation(final Relation relation) {
    this.relation = relation;
  }

  /**
   * Setter for the {@link Container} to which {@link Relation} should be added.
   * 
   * @param relcon org.framed.orm.model.Container
   * */
  public void setRelationContainer(final Container relcon) {
    this.parent = relcon;
  }
}
