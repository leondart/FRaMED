package org.framed.orm.ui.figure.shapes;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.ToolbarLayout;
import org.eclipse.draw2d.XYLayout;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.swt.SWT;
import org.framed.orm.model.Segment;

/**
 * This figure is for {@link Shapes}s from type CompartmentType, where the user didn't step into.
 * The figure looks in the viewer/editor like this: ______________ |____Name____| |Attribute |
 * |_List_______| |Operation | |_List_______| | ROLES | |____________|
 *
 * The roles list is added in the editparts. The right side and bottom side of the figure have a
 * border shadow. The attribute list and operation list are added through child {@link Segment}s in
 * the editparts.
 * 
 * @author Kay Bierzynski
 * @author Lars Schuetze
 * */
public class ORMCompartmentV1Figure extends ORMShapeFigure {

  /**
   * The basic {@link ShadowRectangle}, which has at right and bottom side a border shadow and to
   * which all child figures(operation segment, roles list, name, attribute segment) are added.
   */
  private final ShadowRectangle rectangle;

  /**
   * The constructor of this class, where the constructor {@link ORMShapeFigure#ORMShapeFigure()} is
   * called, the basic {@link ShadowRectangle} is initialized and the child figures for the name(
   * {@link Label})is added to basic rectangle.
   * 
   * */
  public ORMCompartmentV1Figure() {

    super();

    rectangle = new ShadowRectangle();

    ToolbarLayout layout = new ToolbarLayout();
    layout.setSpacing(8); // set the initial heigth of the child figures
    setLayoutManager(new XYLayout());
    setBackgroundColor(ColorConstants.white);

    rectangle.setAntialias(SWT.ON);
    rectangle.setLayoutManager(layout);
    rectangle.setOpaque(true);

    setOpaque(true);

    // add child figure for the name
    rectangle.add(getLabel());

    add(rectangle);

  }

  /**
   * A getter for the basic rectangle of this figure.
   * 
   * @return rectangle {@link ShadowRectangle}
   * */
  public ShadowRectangle getBasicRec() {
    return rectangle;
  }

  /** {@inheritDoc} */
  @Override
  protected void paintFigure(final Graphics graphics) {
    super.paintFigure(graphics);
    final Rectangle rect = getBounds().getCopy();
    setConstraint(rectangle, new Rectangle(0, 0, rect.width(), rect.height()));
  }


}
