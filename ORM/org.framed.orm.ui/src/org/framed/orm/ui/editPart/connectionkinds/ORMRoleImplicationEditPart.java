package org.framed.orm.ui.editPart.connectionkinds;

import org.eclipse.draw2d.BendpointConnectionRouter;
import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.PolygonDecoration;
import org.eclipse.draw2d.PolylineConnection;
import org.eclipse.gef.EditPart;
import org.eclipse.swt.SWT;

/**
 * This {@link EditPart} is the controller for the model element {@link RoleImplication}.
 * 
 * @author Kay Bierzynski
 * */
public class ORMRoleImplicationEditPart extends ORMRelationEditPart {
	
	
  /**
   * {@inheritDoc} {@link RoleImplication}s have as figure a dashed line with a white arrow tip
   * at target end of this connection.
   */
	@Override 
	protected IFigure createFigure() {
	    
	    //create white arrow tip
	    PolygonDecoration poly = new PolygonDecoration();
	    poly.setAntialias(SWT.ON);
	    poly.setBackgroundColor(ColorConstants.white);
	    poly.setScale(5, 5);
	    
	    PolylineConnection conn = new PolylineConnection();
	    conn.setAntialias(SWT.ON);
	    conn.setLineDash(new float[] { 5.0f, 5.0f });
	    conn.setLineStyle(SWT.LINE_CUSTOM);
        conn.setTargetDecoration(poly);
        conn.setConnectionRouter(new BendpointConnectionRouter());
	    return conn;
	  }
	
}
