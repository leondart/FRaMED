package org.framed.orm.ui.figure;

import org.eclipse.draw2d.AbstractBorder;
import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.ToolbarLayout;
import org.eclipse.draw2d.geometry.Insets;


/**
 * Figure for listing child figures.
 * 
 * @author Kay Bierzynski
 * */
public class PartFigure extends Figure {

  /** The constructor of this class. */
  public PartFigure() {
    super();

    final ToolbarLayout layout = new ToolbarLayout();
    layout.setMinorAlignment(ToolbarLayout.ALIGN_CENTER);
    layout.setStretchMinorAxis(false);
    layout.setSpacing(1);
    setLayoutManager(layout);
    setBorder(new PartFigureBorder());
  }

  /**
   * A border class where a border is drawn at top side of the figure.
   * */
  class PartFigureBorder extends AbstractBorder {
    /** {@inheritDoc} */
    public Insets getInsets(final IFigure figure) {
      return new Insets(1, 0, 0, 0);
    }

    /** {@inheritDoc} */
    public void paint(final IFigure figure,final Graphics graphics,final  Insets insets) {
      graphics.drawLine(getPaintRectangle(figure, insets).getTopLeft(), tempRect.getTopRight());
    }
  }

}
