package orm.editPart.connectionkinds;

import org.eclipse.draw2d.BendpointConnectionRouter;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.MidpointLocator;
import org.eclipse.draw2d.PolylineConnection;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.swt.SWT;

import orm.editPart.ORMCompartmentEditPart;

/**
 * @author Kay Bierzynski
 * */
public class ORMIrreflexiveEditPart extends ORMRelationEditPart {
	
	
	@Override protected IFigure createFigure() {
		Label lab = new Label();
		lab.setText("irreflexiv");
		
	    PolylineConnection conn = new PolylineConnection();
	    conn.setAntialias(SWT.ON);
	    conn.setLineDash(new float[] { 5.0f, 5.0f });
	    conn.setLineStyle(SWT.LINE_CUSTOM);;
        conn.setConnectionRouter(new BendpointConnectionRouter());
        
        //add label to the connection
        //TODO: change calculation/refresh so that label is always in the mid of the connection
        MidpointLocator midL = new MidpointLocator(conn,0);
        midL.setGap(5);
        midL.setRelativePosition(PositionConstants.SOUTH);
        // this is needed, because when the label would be just added the label can be seen in the compartmentdiagram
        if( getRoot().getContents() instanceof ORMCompartmentEditPart){
        	conn.add(lab,midL);
        }
	    return conn;
	  }
	
}
