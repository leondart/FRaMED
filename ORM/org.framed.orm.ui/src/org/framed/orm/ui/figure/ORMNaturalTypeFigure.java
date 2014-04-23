package org.framed.orm.ui.figure;

import org.eclipse.draw2d.ChopboxAnchor;
import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.ConnectionAnchor;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.ToolbarLayout;
import org.eclipse.draw2d.XYLayout;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.swt.SWT;

/**
 * @author Kay Bierzynski
 * */
public class ORMNaturalTypeFigure extends ORMTypeFigure {
	
	private final ShadowRectangle rectangle;
	private ConnectionAnchor connectionAnchor;

	   
	public ORMNaturalTypeFigure(boolean isEditorData) {

		super();

	    rectangle = new ShadowRectangle();
	    
	    ToolbarLayout layout = new ToolbarLayout();
	    layout.setSpacing(4); // setzt initial höhe der Kind Elemente
	    setLayoutManager(new XYLayout());
	    setBackgroundColor(ColorConstants.white);
	    
	    rectangle.setAntialias(SWT.ON);
	    rectangle.setLayoutManager(layout);
	    //TODO: test if this two rows are really necessary
	    rectangle.setOpaque(true);
	    setOpaque(true);

	    rectangle.add(getLabel());
	    rectangle.add(getAttributeFigure());
	    if(!(isEditorData))
	    rectangle.add(getMethodeFigure());

	    add(rectangle);
        
	}
	
	 public ShadowRectangle getBasicRec() {
		    return rectangle;
		  }
	 @Override
	 public ConnectionAnchor getConnectionAnchor() {
			if (connectionAnchor == null) {
				connectionAnchor = new ChopboxAnchor(this);
			}
			return connectionAnchor;
		}
	
	@Override protected void paintFigure(Graphics graphics) {
		 super.paintFigure(graphics);
		 Rectangle r = getBounds().getCopy();
		 setConstraint(rectangle, new Rectangle(0, 0, r.width(), r.height()));
	
	}
	
}
