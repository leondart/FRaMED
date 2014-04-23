package orm.figure;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.RoundedRectangle;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Insets;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.swt.graphics.Color;

/**
 * RoundRectangle with a border shadow.
 * 
 * @author Kay Bierzynski
 * */
public class ShadowRoundedRectangle extends RoundedRectangle {

  private static int arcWidth = 20;
  private static int arcHeight = 20;

  public ShadowRoundedRectangle() {
    super();
    setCornerDimensions(new Dimension(arcWidth, arcHeight));
  }

  /**
   * 
   * @see Shape#fillShape(Graphics)
   */
  protected void fillShape(Graphics graphics) {
    Rectangle f = Rectangle.SINGLETON.setBounds(getBounds());
    Insets shadowInset = new Insets(0, 0, SHADOW_INSET, SHADOW_INSET);
    f.crop(shadowInset);
    this.drawShadow(f, graphics);
    graphics.fillRoundRectangle(f, corner.width, corner.height);
  }

  public Insets getInsets() {
    return new Insets(1, 1, SHADOW_INSET + 1, SHADOW_INSET + 1);
  }

  /**
   * @see Shape#outlineShape(Graphics)
   */

  protected void outlineShape(Graphics graphics) {
    // float lineInset = Math.max(1.0f, getLineWidthFloat()) / 2.0f;
    // int inset1 = (int) Math.floor(lineInset);
    // int inset2 = (int) Math.ceil(lineInset);

    /*
     * Rectangle r = Rectangle.SINGLETON.setBounds(getBounds()); r.x += inset1; r.y += inset1;
     * r.width -= inset1 + inset2; r.height -= inset1 + inset2;
     */

    /*
     * graphics.drawRoundRectangle(r, Math.max(0, corner.width - (int) lineInset), Math.max(0,
     * corner.height - (int) lineInset));
     */

    Rectangle f = Rectangle.SINGLETON.setBounds(getBounds());
    Insets shadowInset =
        new Insets(lineWidth / 2, lineWidth / 2, lineWidth + SHADOW_INSET, lineWidth + SHADOW_INSET);

    f.crop(shadowInset);
    graphics.drawRoundRectangle(f, Math.max(0, corner.width - SHADOW_INSET),
        Math.max(0, corner.height - SHADOW_INSET));
  }



  private void drawShadow(Rectangle rectangle, Graphics graphics) {
    this.drawShadowLayer(rectangle, graphics, 3, ColorConstants.lightGray);
    this.drawShadowLayer(rectangle, graphics, 2, ColorConstants.gray);
    this.drawShadowLayer(rectangle, graphics, 1, ColorConstants.darkGray);
  }



  private void drawShadowLayer(Rectangle rectangle, Graphics graphics, int offset, Color color) {
    // Save the state of the graphics object
    graphics.pushState();
    graphics.setLineWidth(0);
    graphics.setBackgroundColor(color);
    Rectangle shadowLayer = new Rectangle(rectangle);
    shadowLayer.x += offset;
    shadowLayer.y += offset;
    graphics.fillRoundRectangle(shadowLayer, arcWidth, arcHeight);
    // Restore the start of the graphics object
    graphics.popState();
  }


  public static int SHADOW_INSET = 4;

}
