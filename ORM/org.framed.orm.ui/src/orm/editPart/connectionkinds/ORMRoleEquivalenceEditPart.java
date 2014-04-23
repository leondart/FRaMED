package orm.editPart.connectionkinds;

import org.eclipse.draw2d.BendpointConnectionRouter;
import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.PolygonDecoration;
import org.eclipse.draw2d.PolylineConnection;
import org.eclipse.swt.SWT;

/**
 * @author Kay Bierzynski
 * */
public class ORMRoleEquivalenceEditPart extends ORMRelationEditPart {

	

	@Override protected IFigure createFigure() {
	    
	  
	    PolygonDecoration poly1 = new PolygonDecoration();
	    poly1.setAntialias(SWT.ON);
	    poly1.setBackgroundColor(ColorConstants.white);
	    poly1.setScale(5, 5);
	   
	    PolygonDecoration poly2 = new PolygonDecoration();
	    poly2.setAntialias(SWT.ON);
	    poly2.setBackgroundColor(ColorConstants.white);
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
