package orm.editPart.connectionkinds;

import org.eclipse.draw2d.BendpointConnectionRouter;
import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.PolylineConnection;
import org.eclipse.draw2d.PolylineDecoration;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.swt.SWT;


/**
* @author Kay Bierzynski
* */
public class ORMRoleProhibitionEditPart extends ORMRelationEditPart {
	
	// input template for the decorations so that the decoration are drawn inverted
	public static final PointList INVERTED_TRIANGLE_TIP = new PointList();

	static {
			INVERTED_TRIANGLE_TIP.addPoint(0, 1);
			INVERTED_TRIANGLE_TIP.addPoint(-1, 0);
			INVERTED_TRIANGLE_TIP.addPoint(0, -1);	
		}
	@Override protected IFigure createFigure() {
	    
		  
		PolylineDecoration poly1 = new PolylineDecoration();
		poly1.setTemplate(INVERTED_TRIANGLE_TIP);
	    poly1.setAntialias(SWT.ON);
	    poly1.setBackgroundColor(ColorConstants.black);
	    poly1.setScale(5, 5);
	   
	    
	    PolylineDecoration poly2 = new PolylineDecoration();
	    poly2.setTemplate(INVERTED_TRIANGLE_TIP);
	    poly2.setAntialias(SWT.ON);
	    poly2.setBackgroundColor(ColorConstants.black);
	    poly2.setScale(5, 5);
	    
	   
	    PolylineConnection conn = new PolylineConnection(); 
	    conn.setAntialias(SWT.ON);
	    conn.setLineDash(new float[] { 5.0f, 5.0f });
	    conn.setLineStyle(SWT.LINE_CUSTOM);
        conn.setTargetDecoration(poly1);
        conn.setSourceDecoration(poly2);
        conn.setConnectionRouter(new BendpointConnectionRouter());
        
        
	    return conn;
	  }
}
