package orm.figure;

import org.eclipse.draw2d.ChopboxAnchor;
import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.ConnectionAnchor;
import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.RoundedRectangle;
import org.eclipse.draw2d.XYLayout;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.draw2d.text.FlowPage;
import org.eclipse.draw2d.text.TextFlow;
import org.eclipse.swt.SWT;

/**
 * @author Kay Bierzynski
 * */
public class ORMRoleGroupFigure extends Figure {
	
	private final RoundedRectangle rectangle;
	private ConnectionAnchor connectionAnchor;
	private final FlowPage label;
    private final TextFlow textFlow;   
	public ORMRoleGroupFigure() {

		super();
		
		
	    rectangle = new RoundedRectangle();
	    textFlow = new TextFlow();
	    label = new FlowPage();
	    
	    label.setHorizontalAligment(PositionConstants.CENTER);
	    label.setOpaque(false);
	    label.add(textFlow);
	    
	    
	    setLayoutManager(new XYLayout());
	    setBackgroundColor(ColorConstants.white);
	    
	    
	    rectangle.setAntialias(SWT.ON);
	    rectangle.setLayoutManager(new XYLayout());

	  //  CODE for dashed rectangle
	    rectangle.setLineDash(new float[] { 5.0f, 5.0f });
	    rectangle.setLineStyle(SWT.LINE_CUSTOM);

	    rectangle.add(label);
	    add(rectangle);
        
	}
	
	 public RoundedRectangle getBasicRec() {
		    return rectangle;
		  }
	
	public TextFlow getLabel(){
		return textFlow;
	}
	
	@Override
	protected boolean useLocalCoordinates() {
		return true;
	}
	
	@Override protected void paintFigure(Graphics graphics) {
		 super.paintFigure(graphics);
		 Rectangle r = getBounds().getCopy();
		 setConstraint(rectangle, new Rectangle(0, 0, r.width(), r.height()));
		 rectangle.setConstraint(label, new Rectangle(5, 5, r.width() - 5, r.height() - 5));
	}
	
	 public ConnectionAnchor getConnectionAnchor() {
		    if (connectionAnchor == null) {
		      connectionAnchor = new ChopboxAnchor(this);
		    }
		    return connectionAnchor;
		  }
}
