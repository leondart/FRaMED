package org.framed.orm.ui.figure;

import org.eclipse.draw2d.ChopboxAnchor;
import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.ConnectionAnchor;
import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.ToolbarLayout;
import org.eclipse.draw2d.XYLayout;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;
import org.eclipse.swt.SWT;
import org.framed.orm.model.Node;
import org.framed.orm.ui.editPart.ORMGroupingEditPart;
import org.framed.orm.ui.editPart.ORMLabelFigure;

/**
 * @author Kay Bierzynski
 * */
public class ORMGroupingV1Figure extends Figure {
	
	private final ShadowRoundedRectangle rectangle;
	private ConnectionAnchor connectionAnchor;
	private ORMLabelFigure label;
  
	//figure for subgroupings 
	public ORMGroupingV1Figure(Node node){

		super();

	    rectangle = new ShadowRoundedRectangle();
	    
	    ToolbarLayout layout = new ToolbarLayout();
	    layout.setSpacing(4); // setzt initial höhe der Kind Elemente
	    setLayoutManager(new XYLayout());
	    setBackgroundColor(ColorConstants.white);
	    
	    rectangle.setAntialias(SWT.ON);
	    rectangle.setLayoutManager(layout);
	    rectangle.setOpaque(true);
	    
	    label = new ORMLabelFigure(node);
	    rectangle.add(label);
	    setOpaque(true);

	   

	    add(rectangle);
        
	}
	
	 public ShadowRoundedRectangle getBasicRec() {
		    return rectangle;
	 }
	 
	 public ORMLabelFigure getLabel(){
		 return label;
	 }
	 
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
