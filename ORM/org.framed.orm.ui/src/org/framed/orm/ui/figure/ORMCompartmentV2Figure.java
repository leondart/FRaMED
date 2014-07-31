package org.framed.orm.ui.figure;

import org.eclipse.draw2d.BorderLayout;
import org.eclipse.draw2d.Button;
import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.ToolbarLayout;
import org.eclipse.draw2d.XYLayout;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.framed.orm.model.Compartment;
import org.framed.orm.model.Node;
import org.framed.orm.model.Rolemodel;
import org.framed.orm.ui.editPart.types.ORMCompartmentEditPart;

/**
 * This figure is for {@link Compartment}s, where the user did step into. The figure looks in the
 * viewer/editor like this:
 * _____________________________
 * |___________Name____________|
 * |___B_____|                 |
 * |Attribute|                 |
 * |_List____|     Rolemodel   |
 * |Method   |                 |
 * | List    |                 |
 * |         |                 |
 * |_________|_________________|
 * 
 * B = button for expand/collapse the attribute and method list. The {@link Rolemodel} figure is
 * added in {@link ORMCompartmentEditPart} The right side and bottom side of the figure have a
 * border shadow.
 * 
 * @author Kay Bierzynski
 * */
public class ORMCompartmentV2Figure extends ORMTypeFigure {

  /**
   * The basic {@link ShadowRectangle}, which has at right and bottom side a border shadow and to
   * which all child figures(name, rolemodel, expandable/collapsable structure rectangle2) are
   * added.
   */
  private final ShadowRectangle rectangle;
  /**
   * The {@link PartFigure}, which containts the attribute list and the method list and be
   * expanded/collapsed through the expandCollapseButton.
   */
  private final PartFigure rectangle2;
  /**
   * The {@link Button}, which expands/collaps the rectangle2(the {@link PartFigure}, which
   * containts the attribute list and the method list).
   */
  private final Button expandCollapseButton;
  /**
   * The {@link Image}, which is shown one the expandCollapseButton.
   * */
  private final Image image;

  /**
   * The constructor of this class, where the constructor {@link ORMTypeFigure#ORMTypeFigure(Node)}
   * is called, the basic {@link ShadowRectangle} is initialized, expandable/collapsable
   * {@link PartFigure} rectangle2 is initialized and added to the basic rectangle, the
   * {@link Button} for the expandaning/collapsing is initialized and added to rectangle2, the child
   * figures for the name( {@link Label}) is added to the basic rectangle and the attribute list(
   * {@link PartFigure}) and the method list({@link PartFigure}) are added to rectangle2. The method
   * list is only added when the isEditorData flag is false.
   * 
   * */
  public ORMCompartmentV2Figure(boolean isEditorData) {

    super(null);

    rectangle = new ShadowRectangle();
    rectangle2 = new PartFigure();

    image =
        new Image(null, ImageDescriptor
            .createFromFile(this.getClass(), "../icons/expandArrow3.png").createImage(),
            SWT.IMAGE_COPY);

    expandCollapseButton = new Button(image);
    expandCollapseButton.setStyle(Button.STYLE_BUTTON);

    // to only show the image of the button
    // the border must set to null and opaque to false
    expandCollapseButton.setBorder(null);
    expandCollapseButton.setOpaque(false);

    BorderLayout layout = new BorderLayout();
    ToolbarLayout layout2 = new ToolbarLayout();
    XYLayout layout3 = new XYLayout();

    layout2.setSpacing(4); // set the initial heigth of the child figures
    layout2.setHorizontal(false);
    layout.setHorizontalSpacing(-1);
    layout.setVerticalSpacing(-1);

    setLayoutManager(layout3);
    setBackgroundColor(ColorConstants.white);

    rectangle.setLayoutManager(layout);
    rectangle2.setLayoutManager(layout2);

    rectangle.setFill(false);
    // add name figure
    rectangle.add(getLabel(), BorderLayout.TOP);
    // add button
    rectangle2.add(expandCollapseButton);

    // add attribute list figure
    rectangle2.add(getAttributeFigure());
    if (!isEditorData) {
      // add method list figure
      rectangle2.add(getMethodeFigure());
    }
    // add expandable/ collapsable structure
    rectangle.add(rectangle2, BorderLayout.LEFT);

    add(rectangle);


  }


  /**
   * A getter for the expandable/collapsable structure of this figure.
   * 
   * @return rectangle2 {@link PartFigure}
   * */
  public final PartFigure getListAttMet() {
    return rectangle2;
  }

  /**
   * A getter for the basic rectangle of this figure.
   * 
   * @return rectangle {@link ShadowRectangle}
   * */
  public ShadowRectangle getBasicRec() {
    return rectangle;
  }

  /**
   * A getter for the button through which the expandable/collapsable structure of this figure can
   * expanded/collapsed.
   * 
   * @return expandCollapseButton {@link Button}
   * */
  public Button getButton() {
    return expandCollapseButton;
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
