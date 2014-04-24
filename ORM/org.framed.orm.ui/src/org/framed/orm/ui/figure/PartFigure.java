package org.framed.orm.ui.figure;

import org.eclipse.draw2d.AbstractBorder;
import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.ToolbarLayout;
import org.eclipse.draw2d.geometry.Insets;


/**
 * Figure for attribute, methode, roles and compartment lists.
 * 
 * @author Kay Bierzynski
 * */
public class PartFigure extends Figure {

  public PartFigure() {
    ToolbarLayout layout = new ToolbarLayout();
    layout.setMinorAlignment(ToolbarLayout.ALIGN_CENTER);
    layout.setStretchMinorAxis(false);
    layout.setSpacing(1);
    setLayoutManager(layout);
    setBorder(new PartFigureBorder());
  }

  public class PartFigureBorder extends AbstractBorder {
    public Insets getInsets(IFigure figure) {
      return new Insets(1, 0, 0, 0);
    }

    public void paint(IFigure figure, Graphics graphics, Insets insets) {
      graphics.drawLine(getPaintRectangle(figure, insets).getTopLeft(), tempRect.getTopRight());
    }
  }

}
