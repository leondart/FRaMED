package org.framed.orm.ui.figure.shapes;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.geometry.Insets;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.swt.graphics.Color;

public class ShadowOctagon extends RectangleFigure {


  /** Variable, which containts the value for the shadow inset. */
  public static final int SHADOW_INSET = 4;

  /**
   * 
   * @see Shape#fillShape(Graphics)
   */
  protected void fillShape(final Graphics graphics) {
    final Rectangle f = Rectangle.SINGLETON.setBounds(getBounds());
    Insets shadowInset = new Insets(0, 0, SHADOW_INSET, SHADOW_INSET);
    f.crop(shadowInset);
    this.drawShadow(f, graphics);
    graphics.fillPolygon(getPoints(f));;
  }

  /**
   * A getter for the inset of this {@link RectangleFigure}.
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
    graphics.drawPolygon(getPoints(f));
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
    graphics.fillPolygon(getPoints(shadowLayer));
    // Restore the start of the graphics object
    graphics.popState();
  }
  
  private PointList getPoints(Rectangle rec){
    PointList octogon = new PointList(8);
    
    int hoffset =(rec.width/8);
    int voffset =(rec.height/8);
   

    octogon.removeAllPoints();
    octogon.addPoint(new Point(rec.x+hoffset,rec.y));
    octogon.addPoint(new Point(rec.x-hoffset+rec.width,rec.y));
    octogon.addPoint(new Point(rec.x+rec.width,rec.y+voffset));
    octogon.addPoint(new Point(rec.x+rec.width,rec.y-voffset+rec.height));  
    octogon.addPoint(new Point(rec.x-hoffset+rec.width,rec.y+rec.height));
    octogon.addPoint(new Point(rec.x+hoffset,rec.y+rec.height));
    octogon.addPoint(new Point(rec.x,rec.y-voffset+rec.height));
    octogon.addPoint(new Point(rec.x,rec.y+voffset));

    return octogon;
  }
}
