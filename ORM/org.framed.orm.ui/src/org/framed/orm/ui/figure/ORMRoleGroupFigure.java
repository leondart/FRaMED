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

/**
 * @author Kay Bierzynski
 * */
public class ORMRoleGroupFigure extends Figure {

  private final RoundedRectangle rectangle;
  private ConnectionAnchor connectionAnchor;
  private final Label label;

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

    rectangle.add(label);
    add(rectangle);

  }

  public RoundedRectangle getBasicRec() {
    return rectangle;
  }

  public Label getLabel() {
    return label;
  }

  @Override
  protected boolean useLocalCoordinates() {
    return true;
  }

  @Override
  protected void paintFigure(Graphics graphics) {
    super.paintFigure(graphics);
    Rectangle r = getBounds().getCopy();
    setConstraint(rectangle, new Rectangle(0, 0, r.width(), r.height()));
    rectangle.setConstraint(label, new Rectangle(5, 5, r.width() - 5, r.height() - 5));
  }

  public ConnectionAnchor getConnectionAnchor() {
    if (connectionAnchor == null) {
      connectionAnchor = new ChopboxAnchor(this);
    }
    return connectionAnchor;
  }
}
