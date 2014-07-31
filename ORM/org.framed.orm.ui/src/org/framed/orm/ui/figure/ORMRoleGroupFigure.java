package org.framed.orm.ui.figure;

import org.eclipse.draw2d.ChopboxAnchor;
import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.ConnectionAnchor;
import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.RoundedRectangle;
import org.eclipse.draw2d.XYLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.swt.SWT;
import org.framed.orm.model.Grouping;
import org.framed.orm.model.RoleGroup;
import org.framed.orm.model.RoleType;

/**
 * This figure is for {@link RoleGroup}s. The figure looks in the viewer/editor somewhat like this:
 * 
 * ---------------------------
 * |         Name            |
 * |                         |
 * |                         |
 * |                         |
 * ---------------------------
 * 
 * The corners of the rectangle are round and the border lines of the rectangle are dashed.
 * 
 * @author Kay Bierzynski
 * */
public class ORMRoleGroupFigure extends Figure {

  /**
   * The basic {@link RoundedRectangle} to which all child figures({@link RoleType} figures,
   * {@link RoleGroup} figures, name) are added.
   */
  private final RoundedRectangle rectangle;
  /**
   * The {@link ConnectionAnchor} of this figure, which is necessary for connecting {@link Relation}
   * s to the figure.
   */
  private ConnectionAnchor connectionAnchor;
  /** This {@link Label} is the figure for the {@link RoleGroup} name. */
  private final Label label;

  /**
   * The constructor of this class, where the basic {@link RoundedRectangle} is initialized and the
   * child figure for the name( {@link Label}) is added to the basic rectangle.
   * */
  public ORMRoleGroupFigure() {
    super();
    rectangle = new RoundedRectangle();
    label = new Label();

    label.setLabelAlignment(PositionConstants.TOP);
    label.setTextAlignment(PositionConstants.TOP);
    label.setOpaque(false);

    setLayoutManager(new XYLayout());
    setBackgroundColor(ColorConstants.white);

    rectangle.setAntialias(SWT.ON);
    rectangle.setLayoutManager(new XYLayout());

    rectangle.setCornerDimensions(new Dimension(20, 20));

    // CODE for dashed rectangle
    rectangle.setLineDash(new float[] {5.0f, 5.0f});
    rectangle.setLineStyle(SWT.LINE_CUSTOM);
    // add name figure
    rectangle.add(label);
    add(rectangle);

  }

  /**
   * A getter for the basic rectangle of this figure.
   * 
   * @return rectangle {@link ShadowRoundedRectangle}
   * */
  public RoundedRectangle getBasicRec() {
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
    rectangle.setConstraint(label, new Rectangle(5, 5, r.width() - 5, r.height() - 5));
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
}
