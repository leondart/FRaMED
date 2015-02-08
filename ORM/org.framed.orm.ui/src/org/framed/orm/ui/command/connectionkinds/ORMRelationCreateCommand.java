package org.framed.orm.ui.command.connectionkinds;

import java.util.ArrayList;

import org.eclipse.draw2d.Bendpoint;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.commands.Command;
import org.framed.orm.geometry.GeometryFactory;
import org.framed.orm.geometry.RelativePoint;
import org.framed.orm.model.Model;
import org.framed.orm.model.NamedElement;
import org.framed.orm.model.Relation;
import org.framed.orm.model.Shape;
import org.framed.orm.model.Type;

/**
 * Through this command all {@link Relation}s can be created(invoked into the model tree).
 * 
 * @author Kay Bierzynski
 * */
public class ORMRelationCreateCommand extends Command {

  /** The target/end {@link Shape} of the {@link Relation} to be created. */
  protected Shape target;
  /** The source/start {@link Shape} of the {@link Relation} to be created. */
  protected Shape source;
  /** The target label of the {@link Relation} to be created. */
  private NamedElement targetLabel;
  /** The source label of the {@link Relation} to be created. */
  private NamedElement sourceLabel;
  /** A list of refrences on other {@link Relation}s. */
  protected ArrayList<Relation> refrencedRelations;

  /**
   * The {@link Relation} to be created. The basis type of the {@link Relation} is given by a
   * factory.
   */
  protected Relation relation;
  /** The {@link Model} to which the {@link Relation} should be added. */
  protected Model parent;

  /**
   * Constructor of this command, where the label is set, which describes this command to the user.
   * 
   */
  public ORMRelationCreateCommand() {
    super.setLabel("ORMRelationCreate");
    targetLabel = null;
    sourceLabel = null;
  }

  /**
   * This method tests if the conditions for executing this command are fulfilled,
   * 
   * @return true if the parameter target, source, relation and parent are set.
   */
  @Override
  public boolean canExecute() {

    if (relation == null || target == null || parent == null || source == null) {
      return false;
    }

    int val = relation.getType().getValue();

    switch (val) {
      case Type.RELATIONSHIP_VALUE:
        return targetLabel != null && sourceLabel != null && refrencedRelations == null;
      case Type.IRREFLEXIVE_VALUE:
        return testRelationshipConstraint();
      case Type.TOTAL_VALUE:
        return testRelationshipConstraint();
      case Type.CYCLIC_VALUE:
        return testRelationshipConstraint();
      default:
        return targetLabel == null && sourceLabel == null && refrencedRelations == null;
    }
  }

  /**
   * This method checks if all variables, which are needed for the creation of a {@link Relation}
   * from type cyclic, total or irreflexive.
   * 
   * @return true when target and source label are null and refrencedRelations array is not null.
   * */
  private boolean testRelationshipConstraint() {
    if (targetLabel == null && sourceLabel == null && refrencedRelations != null) {
      return refrencedRelations.size() == 1;
    }
    return false;
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
    relation.setSourceLabel(sourceLabel);
    relation.setTargetLabel(targetLabel);
    if (refrencedRelations != null) {
      relation.getReferencedRelation().addAll(refrencedRelations);
    }
    relation.setSource(source);
    relation.setTarget(target);
    relation.setContainer(parent);

    Rectangle sourcerec = createRectangleFromFromBoundarieData(source);

    // when source and target of the {@link Relation} are equal, than call insertSelfLoopBPs()
    // method, because to make the {@link Relation} visible/look good to the user we need to insert
    // three {@link Bendpoint}
    if (source.equals(target)) {
      insertSelfLoopBPs(sourcerec);
    }


    int relationCount = getRelationCount();
    if (relationCount > 1 && !source.equals(target)) {
      Rectangle targetrec = createRectangleFromFromBoundarieData(target);
      Point ps = calculateCorrectPoint(sourcerec, targetrec.getLocation());
      Point pt = calculateCorrectPoint(targetrec, sourcerec.getLocation());
      adaptRelationCreation(ps, pt, relationCount);
    }
  }

  /**
   * {@inheritDoc} This command is undone through removing the created {@link Relation} from the
   * source, the {@link Model} and the target and through deleting all the {@link Bendpoint}s of the
   * {@link Relation}.
   * 
   */
  @Override
  public void undo() {
    relation.getSource().getOutgoingRelations().remove(relation);
    relation.setSource(null);
    relation.getTarget().getIncomingRelations().remove(relation);
    relation.setTarget(null);
    relation.setContainer(null);
    relation.setSourceLabel(null);
    relation.setTargetLabel(null);
    relation.getBendpoints().clear();
    relation.getReferencedRelation().clear();
  }

  /**
   * This method is for determining the number of {@link Relation}s between the source and target.
   * 
   * @return number of relations between source and target.
   * */
  protected int getRelationCount() {
    // get all relations which are come from the source and go to the target
    final ArrayList<Relation> relsIn = new ArrayList<Relation>();
    relsIn.addAll(target.getIncomingRelations());
    relsIn.retainAll(source.getOutgoingRelations());

    // get all relations which are come from the target and go to the source
    final ArrayList<Relation> rels = new ArrayList<Relation>();
    rels.addAll(target.getOutgoingRelations());
    rels.retainAll(source.getIncomingRelations());

    return rels.size() + relsIn.size();
  }

  /**
   * In this method a {@link Bendpoint} is added to the created {@link Relation}, when between
   * source and target more than one {@link Relation} exists.
   */
  protected void adaptRelationCreation(final Point ps, final Point pt, final int relationCount) {

    int relCount = relationCount;

    // calculate initial dimensions to get started
    final Point p = new Point((ps.x() + pt.x()) / 2, (ps.y() + pt.y()) / 2);
    Dimension d1 = p.getDifference(ps);
    Dimension d2 = p.getDifference(pt);

    // put the dimension in points to prepare them for adding to the relation
    Point dim1P = new Point(Math.abs(d1.width()), Math.abs(d1.height()));
    Point dim2P = new Point(Math.abs(d2.width()), Math.abs(d2.height()));

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
    creatAndAddBenpoint(dim1P, dim2P, ps, pt);

  }

  /**
   * This method adds three {@link Bendpoint}s to relation and should only be called when the source
   * equals the target.
   * */
  private void insertSelfLoopBPs(Rectangle sourcerec) {
    final int width = sourcerec.width();
    final int height = sourcerec.height();
    Point refSource = new Point(sourcerec.x(), sourcerec.y());

    // first bendpoint which lays beneaths the source/target
    creatAndAddBenpoint(new Point(0, height + 30), new Point(0, height + 30), refSource, refSource);
    // second bendpoint which lays in the southeast from the source/target
    creatAndAddBenpoint(new Point(width + 30, height + 30), new Point(width + 30, height + 30),
        refSource, refSource);
    // third bendpoint which lays in the east from the source/target
    creatAndAddBenpoint(new Point(width + 30, 0), new Point(width + 30, 0), refSource, refSource);
  }

  /**
   * This method converts the source and target dimension {@link Point} as well as the refrence
   * points to the target and source into a {@link RelativePoint}/Bendpoint and adds the cretaed
   * Bendpoint to the relation.
   * */
  private void creatAndAddBenpoint(Point dim1P, Point dim2P, Point refSource, Point refTarget) {
    org.framed.orm.geometry.Point p1 = GeometryFactory.eINSTANCE.createPoint();
    p1.setX(dim1P.x());
    p1.setY(dim1P.y());
    org.framed.orm.geometry.Point p2 = GeometryFactory.eINSTANCE.createPoint();
    p1.setX(dim2P.x());
    p1.setY(dim2P.y());

    org.framed.orm.geometry.Point ps = GeometryFactory.eINSTANCE.createPoint();
    ps.setX(refSource.x());
    ps.setY(refSource.y());
    org.framed.orm.geometry.Point pt = GeometryFactory.eINSTANCE.createPoint();
    pt.setX(refTarget.x());
    pt.setY(refTarget.y());

    org.framed.orm.geometry.RelativePoint relPoint =
        GeometryFactory.eINSTANCE.createRelativePoint();
    relPoint.getReferencePoints().add(ps);
    relPoint.getReferencePoints().add(pt);
    relPoint.getDistances().add(p1);
    relPoint.getDistances().add(p2);
    relation.getBendpoints().add(relPoint);
  }

  /**
   * This method calculates and returns the correct refrence point of a {@link Rectangle} in regards
   * to a given Point.
   * */
  protected Point calculateCorrectPoint(Rectangle rec, Point locationOfOther) {
    // TODO: doesn't work properly for the shape connection anchors of a relation
    switch (rec.getPosition(locationOfOther)) {
      case PositionConstants.NORTH:
        return rec.getTop();
      case PositionConstants.NORTH_EAST:
        return rec.getTop();
      case PositionConstants.NORTH_WEST:
        return rec.getTop();
      case PositionConstants.EAST:
        return rec.getRight();
      case PositionConstants.WEST:
        return rec.getLeft();
      case PositionConstants.SOUTH:
        return rec.getBottom();
      case PositionConstants.SOUTH_EAST:
        return rec.getBottom();
      case PositionConstants.SOUTH_WEST:
        return rec.getBottom();
      default:
        return rec.getCenter();
    }
  }

  protected Rectangle createRectangleFromFromBoundarieData(Shape shape) {
    Point ptbottomright =
        new Point(shape.getBoundaries().getBottomRight().getX(), shape.getBoundaries()
            .getBottomRight().getY());
    Point pttopleft =
        new Point(shape.getBoundaries().getTopLeft().getX(), shape.getBoundaries().getTopLeft()
            .getY());
    return new Rectangle(pttopleft, ptbottomright);
  }

  /**
   * Setter for the source of the {@link Relation}.
   * 
   * @param source org.framed.orm.model.Shape
   * */
  public void setSource(final Shape source) {
    this.source = source;
  }

  /**
   * Setter for the target of the {@link Relation}.
   * 
   * @param target org.framed.orm.model.Shape
   * */
  public void setTarget(final Shape target) {
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
   * Setter for the {@link Model} to which {@link Relation} should be added.
   * 
   * @param relcon org.framed.orm.model.Model
   * */
  public void setRelationContainer(final Model relcon) {
    this.parent = relcon;
  }

  /**
   * Setter for the target {@link NamedElement}/Label of the {@link Relation} which will be created.
   * 
   * @param targetLabel {@link org.framed.orm.model.NamedElement}
   * */
  public void setTargetLabel(NamedElement targetLabel) {
    this.targetLabel = targetLabel;
  }

  /**
   * Setter for the source {@link NamedElement}/Label of the {@link Relation} which will be created.
   * 
   * @param sourceLabel {@link org.framed.orm.model.NamedElement}
   * */
  public void setSourceLabel(NamedElement sourceLabel) {
    this.sourceLabel = sourceLabel;
  }

  /**
   * Setter for the refrenced relation array of the {@link Relation} which will be created.
   * 
   * @param ArrayList<Relation> refrencedRelations
   * */
  public void setRefrencedRelations(ArrayList<Relation> refrencedRelations) {
    this.refrencedRelations = refrencedRelations;
  }
}
