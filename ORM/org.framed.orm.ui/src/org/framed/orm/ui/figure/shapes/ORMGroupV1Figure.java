package org.framed.orm.ui.figure.shapes;


import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.ToolbarLayout;
import org.eclipse.draw2d.XYLayout;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.swt.SWT;


/**
 * This figure is for {@link Shapes} from type Group, where the user didn't step into. The figure
 * looks in the viewer/editor somewhat like this:
 * 
 * ____________ |____Name____| | Compartment| | List | | | |____________|
 * 
 * The compartment list is added in the editparts. The right side and bottom side of the figure have
 * a border shadow and the corners of the rectangle are round.
 * 
 * @author Kay Bierzynski
 * */
public class ORMGroupV1Figure extends ORMShapeFigure {

  /**
   * The basic {@link ShadowRoundedRectangle}, which has at right and bottom side a border shadow
   * and to which all child figures(compartment list, name) are added.
   */
  private final ShadowRoundedRectangle rectangle;

  /**
   * The constructor of this class, where the constructor {@link ORMShapeFigure#ORMShapeFigure()} is
   * called, the basic {@link ShadowRoundedRectangle} is initialized and the child figure for the
   * name( {@link Label}) is added to the basic rectangle.
   * */
  public ORMGroupV1Figure() {

    super();

    rectangle = new ShadowRoundedRectangle();

    ToolbarLayout layout = new ToolbarLayout();
    layout.setSpacing(4); // set initial heigth of child figures
    setLayoutManager(new XYLayout());
    setBackgroundColor(ColorConstants.white);

    rectangle.setAntialias(SWT.ON);
    rectangle.setLayoutManager(layout);
    rectangle.setOpaque(true);

    // add name figure
    rectangle.add(getLabel());
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



  /** {@inheritDoc} */
  @Override
  protected void paintFigure(final Graphics graphics) {
    super.paintFigure(graphics);
    final Rectangle r = getBounds().getCopy();
    setConstraint(rectangle, new Rectangle(0, 0, r.width(), r.height()));
  }
}
