package org.framed.orm.ui.figure;

import org.eclipse.draw2d.ChopboxAnchor;
import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.ConnectionAnchor;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.ToolbarLayout;
import org.eclipse.draw2d.XYLayout;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.swt.SWT;
import org.framed.orm.model.Node;


/**
 * This figure is for {@link RoleType}s. The figure looks in the viewer/editor like this:
 * 
 * ______________
 * |____Name____|
 * |Attribute   |
 * |_List_______|
 * |Method      |
 * |_List_______|
 * 
 * The right side and bottom side of the figure have a border shadow and the corners of the
 * rectangle are round.
 * 
 * @author Kay Bierzynski
 * */
public class ORMRoleTypeFigure extends ORMTypeFigure {

  /**
   * The basic {@link ShadowRoundedRectangle}, which has at right and bottom side a border shadow
   * and to which all child figures(method list, name, attribute list) are added.
   */
  private final ShadowRoundedRectangle rectangle;
  /**
   * The {@link ConnectionAnchor} of this figure, which is necessary for connecting {@link Relation}
   * s to the figure.
   */
  private ConnectionAnchor connectionAnchor;


  /**
   * The constructor of this class, where the constructor {@link ORMTypeFigure#ORMTypeFigure(Node)}
   * is called, the basic {@link ShadowRoundedRectangle} is initialized and the child figures for
   * the name( {@link Label}), the attribute list({@link PartFigure}) and the method list(
   * {@link PartFigure}) are added to basic rectangle. The method list is only added when the
   * isEditorData flag is false.
   * 
   * */
  public ORMRoleTypeFigure(final boolean isEditorData, final Node parent) {

    super(parent);

    rectangle = new ShadowRoundedRectangle();

    ToolbarLayout layout = new ToolbarLayout();
    layout.setSpacing(4); // set the initial heigth of the child figures
    setLayoutManager(new XYLayout());
    setBackgroundColor(ColorConstants.white);

    rectangle.setAntialias(SWT.ON);
    rectangle.setLayoutManager(layout);
    rectangle.setOpaque(true);
    setOpaque(true);

    // add name figure
    rectangle.add(getLabel());
    // add attribute list figure
    rectangle.add(getAttributeFigure());
    if (!isEditorData) {
      // add method list figure
      rectangle.add(getMethodeFigure());
    }
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
