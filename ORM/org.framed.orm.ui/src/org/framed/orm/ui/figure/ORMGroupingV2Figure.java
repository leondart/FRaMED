package org.framed.orm.ui.figure;

import org.eclipse.draw2d.BorderLayout;
import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.XYLayout;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.swt.SWT;
import org.framed.orm.model.Model;

/**
 * This figure is for {@link Shape}s from type Group, where the user did step into. The figure looks in the
 * viewer/editor somewhat like this:
 * 
 *  ___________________________
 * |___________Name____________|
 * |                           |
 * |       Child Model         |
 * |                           |
 * |___________________________|
 * 
 * The Child {@link Model} figure is added in editparts. The right side and bottom
 * side of the figure have a border shadow and the corners of the rectangle are round.
 * 
 * @author Kay Bierzynski
 * */
public class ORMGroupingV2Figure extends ORMShapeFigure {

  /**
   * The basic {@link ShadowRoundedRectangle}, which has at right and bottom side a border shadow
   * and to which all child figures(child model, name) are added.
   */
  private final ShadowRoundedRectangle rectangle;

  /**
   * The constructor of this class, where the constructor {@link ORMShapeFigure#ORMShapeFigure()}
   * is called, the basic {@link ShadowRoundedRectangle} is initialized and the
   * child figure for the name( {@link Label}) is added to the basic rectangle.
   * */
  public ORMGroupingV2Figure() {

    super();

    rectangle = new ShadowRoundedRectangle();

    BorderLayout layout = new BorderLayout();
    XYLayout layout2 = new XYLayout();

    layout.setHorizontalSpacing(-1);
    layout.setVerticalSpacing(-1);

    setLayoutManager(layout2);
    setBackgroundColor(ColorConstants.white);

    rectangle.setLayoutManager(layout);

    rectangle.setFill(false);
 
    // add name figure
    rectangle.add(getLabel(), BorderLayout.TOP);
    rectangle.setAntialias(SWT.ON);
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
