package orm.figure;

import org.eclipse.draw2d.BorderLayout;
import org.eclipse.draw2d.ChopboxAnchor;
import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.ConnectionAnchor;
import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.ToolbarLayout;
import org.eclipse.draw2d.XYLayout;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.swt.SWT;

/**
 * @author Kay Bierzynski
 * */
public class ORMGroupingV2Figure extends Figure {

	private final ShadowRoundedRectangle rectangle;
	private LabelFigure label;
	private ConnectionAnchor connectionAnchor;
	
	//figure for maingroupings
	public ORMGroupingV2Figure() {

		super();

	    rectangle = new ShadowRoundedRectangle();
	   	        
	    BorderLayout layout = new BorderLayout();
	    ToolbarLayout layout2 = new ToolbarLayout();
	    XYLayout layout3 = new XYLayout();
	    
	    layout2.setSpacing(4); // setzt initial höhe der Kind Elemente
	    layout2.setHorizontal(false);
	    layout.setHorizontalSpacing(-1);
	    layout.setVerticalSpacing(-1);
	   
	    setLayoutManager(layout3);
	    setBackgroundColor(ColorConstants.white);
	    
	    rectangle.setLayoutManager(layout);

	    rectangle.setFill(false);
	    label = new LabelFigure();
	    rectangle.add(label,BorderLayout.TOP);
	    rectangle.setAntialias(SWT.ON);
	    add(rectangle);
	    
	    
	}
	
	public ConnectionAnchor getConnectionAnchor() {
		if (connectionAnchor == null) {
			connectionAnchor = new ChopboxAnchor(this);
		}
		return connectionAnchor;
	}

    public ShadowRoundedRectangle getBasicRec() {
	    return rectangle;
	}
    
    public LabelFigure getLabel(){
    	return label;
    }
    
    @Override
    protected boolean useLocalCoordinates() {
        return true;
    }
    
	@Override protected void paintFigure(Graphics graphics) {
		 super.paintFigure(graphics);
		 Rectangle r = getBounds().getCopy();
		 setConstraint(rectangle, new Rectangle(0, 0, r.width(), r.height()));
	}
	
}
