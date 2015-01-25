package org.framed.orm.ui.figure.shapes;

import org.eclipse.draw2d.BorderLayout;
import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.RoundedRectangle;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.swt.SWT;
import org.framed.orm.model.Shape;

/**
 * This figure is for {@link Shape}s from type RoleGroup. The figure looks in the viewer/editor somewhat like this:
 * 
 * -------Cardinality---------
 * |         Name            |
 * |                         |
 * |      Child Model        |
 * |                         |
 * ---------------------------
 * 
 * The corners of the rectangle are round and the border lines of the rectangle are dashed.
 * The Child {@link Model} figure is added in the editparts.
 * @author Kay Bierzynski
 * */
public class ORMRoleGroupFigure extends ORMShapeFigure {

  /**
   * The basic {@link RoundedRectangle} to which all child figures({@link ORMRootModelFigure} , name) are added.
   */
  private final RoundedRectangle rectangle;

  /**
   * The constructor of this class, where the constructor {@link ORMShapeFigure#ORMShapeFigure()}
   * is called, the basic {@link RoundedRectangle} is initialized and the
   * child figure for the name( {@link Label}) is added to the basic rectangle.
   * */
  public ORMRoleGroupFigure() {
    super();
    rectangle = new RoundedRectangle();

    setLayoutManager(new BorderLayout());
    setBackgroundColor(ColorConstants.white);

    BorderLayout layout = new BorderLayout();

    layout.setHorizontalSpacing(-1);
    layout.setVerticalSpacing(-1);
    
    rectangle.setAntialias(SWT.ON);
    rectangle.setLayoutManager(layout);

    rectangle.setCornerDimensions(new Dimension(20, 20));

    // CODE for dashed rectangle
    rectangle.setLineDash(new float[] {5.0f, 5.0f});
    rectangle.setLineStyle(SWT.LINE_CUSTOM);
    
    
    rectangle.setFill(false);
    
    // add name figure
    rectangle.add(getLabel(), BorderLayout.TOP);
    
    add(rectangle, BorderLayout.CENTER);

  }

  /**
   * A getter for the basic rectangle of this figure.
   * 
   * @return rectangle {@link ShadowRoundedRectangle}
   * */
  public RoundedRectangle getBasicRec() {
    return rectangle;
  }
  
}
