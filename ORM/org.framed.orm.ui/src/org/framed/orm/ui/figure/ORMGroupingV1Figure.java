package org.framed.orm.ui.figure;

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
import org.framed.orm.model.Node;
import org.framed.orm.ui.editPart.ORMGroupingEditPart;

/**
 * This figure is for {@link Grouping}s, where the user didn't step into. The figure looks in
 * the viewer/editor somewhat like this:
 * 
 *  ____________
 * |____Name____|
 * | Compartment|
 * | List       |
 * |            |
 * |____________|
 * 
 * The compartment list is added in the {@link ORMGroupingEditPart}. The right side and bottom side
 * of the figure have a border shadow and the corners of the rectangle are round.
 * 
 * @author Kay Bierzynski
 * */
public class ORMGroupingV1Figure extends Figure {

  /**
   * The basic {@link ShadowRoundedRectangle}, which has at right and bottom side a border shadow
   * and to which all child figures(compartment list, name) are added.
   */
  private final ShadowRoundedRectangle rectangle;
  /**
   * The {@link ConnectionAnchor} of this figure, which is necessary for connecting {@link Relation}
   * s to the figure.
   */
  private ConnectionAnchor connectionAnchor;
  /** This {@link Label} is the figure for the {@link Grouping} name. */
  private final Label label;

  /**
   * The constructor of this class, where the basic {@link ShadowRoundedRectangle} is initialized
   * and the child figure for the name( {@link Label}) is added to the basic rectangle.
   * */
  public ORMGroupingV1Figure(Node node) {

    super();

    rectangle = new ShadowRoundedRectangle();

    ToolbarLayout layout = new ToolbarLayout();
    layout.setSpacing(4); // set initial heigth of child figures
    setLayoutManager(new XYLayout());
    setBackgroundColor(ColorConstants.white);

    rectangle.setAntialias(SWT.ON);
    rectangle.setLayoutManager(layout);
    rectangle.setOpaque(true);

    label = new Label();
    // add name figure
    rectangle.add(label);
    setOpaque(true);

    add(rectangle);

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

  /** {@inheritDoc} */
  @Override
  protected void paintFigure(final Graphics graphics) {
    super.paintFigure(graphics);
    final Rectangle r = getBounds().getCopy();
    setConstraint(rectangle, new Rectangle(0, 0, r.width(), r.height()));
  }
}
