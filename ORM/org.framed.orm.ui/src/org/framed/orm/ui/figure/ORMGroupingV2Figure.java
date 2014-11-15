package org.framed.orm.ui.figure;

import org.eclipse.draw2d.BorderLayout;
import org.eclipse.draw2d.ChopboxAnchor;
import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.ConnectionAnchor;
import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.ToolbarLayout;
import org.eclipse.draw2d.XYLayout;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.swt.SWT;
import org.framed.orm.model.Grouping;
import org.framed.orm.model.Rolemodel;
import org.framed.orm.ui.editPart.ORMGroupingEditPart;
/**
 * This figure is for {@link Grouping}s, where the user did step into. The figure looks in the
 * viewer/editor somewhat like this:
 * 
 *  ___________________________
 * |___________Name____________|
 * |                           |
 * |        Rolemodel          |
 * |                           |
 * |___________________________|
 * 
 * The {@link Rolemodel} figure is added in {@link ORMGroupingEditPart} The right side and bottom
 * side of the figure have a border shadow and the corners of the rectangle are round.
 * 
 * @author Kay Bierzynski
 * */
public class ORMGroupingV2Figure extends Figure {

  /**
   * The basic {@link ShadowRoundedRectangle}, which has at right and bottom side a border shadow
   * and to which all child figures(role model, name) are added.
   */
  private final ShadowRoundedRectangle rectangle;
  /** This {@link Label} is the figure for the {@link Grouping} name. */
  private final Label label;
  /**
   * The {@link ConnectionAnchor} of this figure, which is necessary for connecting {@link Relation}
   * s to the figure.
   */
  private ConnectionAnchor connectionAnchor;

  /**
   * The constructor of this class, where the basic {@link ShadowRoundedRectangle} is initialized and the
   * child figure for the name( {@link Label}) is added to the basic rectangle.
   * */
  public ORMGroupingV2Figure() {

    super();

    rectangle = new ShadowRoundedRectangle();

    BorderLayout layout = new BorderLayout();
    ToolbarLayout layout2 = new ToolbarLayout();
    XYLayout layout3 = new XYLayout();

    layout2.setSpacing(4); //set the initial heigth of the child figures
    layout2.setHorizontal(false);
    layout.setHorizontalSpacing(-1);
    layout.setVerticalSpacing(-1);

    setLayoutManager(layout3);
    setBackgroundColor(ColorConstants.white);

    rectangle.setLayoutManager(layout);

    rectangle.setFill(false);
    label = new Label();
    // add name figure
    rectangle.add(label, BorderLayout.TOP);
    rectangle.setAntialias(SWT.ON);
    add(rectangle);


  }

  /**
   * A getter for the {@link ConnectionAnchor} of this figure.
   * 
   * @reutrn connectionAnchor {@link ConnectionAnchor}
   * */
  public ConnectionAnchor getConnectionAnchor() {
    if (connectionAnchor == null) {
      connectionAnchor = new ChopboxAnchor(this);
    }
    return connectionAnchor;
  }


  /**
   * A getter for the basic rectangle of this figure.
   * 
   * @return rectangle {@link ShadowRoundedRectangle}
   * */
  public ShadowRoundedRectangle getBasicRec() {
    return rectangle;
  }

  /**
   * A getter for the label, which is the figure for the {@link Grouping} name.
   * 
   * @return label {@link Label}
   * */
  public Label getLabel() {
    return label;
  }

  /** {@inheritDoc} */
  @Override
  protected boolean useLocalCoordinates() {
    return true;
  }

  /** {@inheritDoc} */
  @Override
  protected void paintFigure(final Graphics graphics) {
    super.paintFigure(graphics);
    final Rectangle r = getBounds().getCopy();
    setConstraint(rectangle, new Rectangle(0, 0, r.width(), r.height()));
  }

}
