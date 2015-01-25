package org.framed.orm.ui.figure.shapes;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.RoundedRectangle;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Insets;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.swt.graphics.Color;

/**
 * {@link RoundRectangle} with a border shadow.
 * 
 * @author Kay Bierzynski
 * */
public class ShadowRoundedRectangle extends RoundedRectangle {

  /** The width of the rectangle corners. */
  private static final int ARC_WIDTH = 20;
  /** The heigth of the rectangle corners. */
  private static final int ARC_HEIGTH = 20;
  /** Variable, which containts the value for the shadow inset. */
  public static final int SHADOW_INSET = 4;

  /**
   * The constructor of this class, where the {@link Dimension} of the rectangle corners is set.
   * */
  public ShadowRoundedRectangle() {
    super();
    setCornerDimensions(new Dimension(ARC_WIDTH, ARC_HEIGTH));
  }

  /**
   * 
   * @see Shape#fillShape(Graphics)
   */
  protected void fillShape(final Graphics graphics) {
    final Rectangle f = Rectangle.SINGLETON.setBounds(getBounds());
    final Insets shadowInset = new Insets(0, 0, SHADOW_INSET, SHADOW_INSET);
    f.crop(shadowInset);
    this.drawShadow(f, graphics);
    graphics.fillRoundRectangle(f, corner.width, corner.height);
  }

  /**
   * A getter for the inset of this {@link RoundedRectangle}.
   * 
   * @return {@link Insets}
   * */
  public Insets getInsets() {
    return new Insets(1, 1, SHADOW_INSET + 1, SHADOW_INSET + 1);
  }

  /**
   * @see Shape#outlineShape(Graphics)
   */
  protected void outlineShape(final Graphics graphics) {
    final Rectangle f = Rectangle.SINGLETON.setBounds(getBounds());
    final Insets shadowInset =
        new Insets(lineWidth / 2, lineWidth / 2, lineWidth + SHADOW_INSET, lineWidth + SHADOW_INSET);

    f.crop(shadowInset);
    graphics.drawRoundRectangle(f, Math.max(0, corner.width - SHADOW_INSET),
        Math.max(0, corner.height - SHADOW_INSET));
  }

  /**
   * This method draws the border shadow.
   * */
  private void drawShadow(final Rectangle rectangle, final Graphics graphics) {
    this.drawShadowLayer(rectangle, graphics, 3, ColorConstants.lightGray);
    this.drawShadowLayer(rectangle, graphics, 2, ColorConstants.gray);
    this.drawShadowLayer(rectangle, graphics, 1, ColorConstants.darkGray);
  }


  /**
   * This method draws the border shadow layers.
   * */
  private void drawShadowLayer(final Rectangle rectangle, final Graphics graphics,
      final int offset, final Color color) {
    // Save the state of the graphics object
    graphics.pushState();
    graphics.setLineWidth(0);
    graphics.setBackgroundColor(color);
    Rectangle shadowLayer = new Rectangle(rectangle);
    shadowLayer.x += offset;
    shadowLayer.y += offset;
    graphics.fillRoundRectangle(shadowLayer, ARC_WIDTH, ARC_HEIGTH);
    // Restore the start of the graphics object
    graphics.popState();
  }

}
