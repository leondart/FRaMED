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
import org.framed.orm.model.Compartment;
import org.framed.orm.model.Node;
import org.framed.orm.ui.editPart.types.ORMCompartmentEditPart;

/**
 * This figure is for {@link Compartment}s, where the user didn't step into. The figure looks in the
 * viewer/editor like this:
 * ______________
 * |____Name____|
 * |Attribute   |
 * |_List_______|
 * |Method      |
 * |_List_______|
 * |  ROLES     |
 * |____________|
 *
 * The roles list is added in the {@link ORMCompartmentEditPart}. The right side and bottom side of
 * the figure have a border shadow.
 * 
 * @author Kay Bierzynski
 * @author Lars Schuetze
 * */
public class ORMCompartmentV1Figure extends ORMTypeFigure {

  /**
   * The basic {@link ShadowRectangle}, which has at right and bottom side a border shadow and to
   * which all child figures(method list, roles list, name, attribute list) are added.
   */
  private final ShadowRectangle rectangle;
  /**
   * The {@link ConnectionAnchor} of this figure, which is necessary for connecting {@link Relation}s 
   * to the figure.
   */
  private ConnectionAnchor connectionAnchor;

  /**
   * The constructor of this class, where the constructor {@link ORMTypeFigure#ORMTypeFigure(Node)}
   * is called, the basic {@link ShadowRectangle} is initialized and the child figures for the name(
   * {@link Label}), the attribute list({@link PartFigure}) and the method list({@link PartFigure})
   * are added to basic rectangle. The method list is only added when the isEditorData flag is
   * false.
   * 
   * */
  public ORMCompartmentV1Figure(final boolean isEditorData, final Node parent) {

    super(parent);

    rectangle = new ShadowRectangle();

    ToolbarLayout layout = new ToolbarLayout();
    layout.setSpacing(4); // set the initial heigth of the child figures
    setLayoutManager(new XYLayout());
    setBackgroundColor(ColorConstants.white);

    rectangle.setAntialias(SWT.ON);
    rectangle.setLayoutManager(layout);
    rectangle.setOpaque(true);

    setOpaque(true);

    // add child figure for the name
    rectangle.add(getLabel());
    // add child figure for the attribute list
    rectangle.add(getAttributeFigure());
    // add child figure for the method list
    if (!isEditorData) {
      rectangle.add(getMethodeFigure());
    }

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
    final Rectangle rect = getBounds().getCopy();
    setConstraint(rectangle, new Rectangle(0, 0, rect.width(), rect.height()));
  }


}
