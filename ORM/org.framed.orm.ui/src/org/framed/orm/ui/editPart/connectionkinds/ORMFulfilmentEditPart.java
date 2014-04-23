package org.framed.orm.ui.editPart.connectionkinds;


import org.eclipse.draw2d.BendpointConnectionRouter;
import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.ConnectionEndpointLocator;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.PolygonDecoration;
import org.eclipse.draw2d.PolylineConnection;
import org.eclipse.swt.SWT;
import org.framed.orm.model.Fulfilment;
import org.framed.orm.ui.figure.LabelFigure;


/**
 * @author Kay Bierzynski
 * */
public class ORMFulfilmentEditPart extends ORMRelationEditPart {
		private final LabelFigure  targetLabel;
	
		public  ORMFulfilmentEditPart() {
		    super();  
		    targetLabel = new LabelFigure();
		  }
		
	@Override protected IFigure createFigure() {
		Label tooltipTarget = new Label();
		tooltipTarget.setText("Direct Editing of this Value over the Propertysheet from the related Realtionship under tragetLabelValue.");
		
	    PolylineConnection conn = new PolylineConnection();
	    conn.setAntialias(SWT.ON);
	    PolygonDecoration poly = new PolygonDecoration();
	    poly.setAntialias(SWT.ON);
	    poly.setBackgroundColor(ColorConstants.black);
	    poly.setScale(5, 5);
	    
	    //add decoration
        conn.setTargetDecoration(poly);
        conn.setConnectionRouter(new BendpointConnectionRouter());
        
      //add target Label
        ConnectionEndpointLocator targetEndL = new  ConnectionEndpointLocator(conn,true);
        targetEndL.setVDistance(-1);
        targetEndL.setUDistance(1);
        targetLabel.setText(((Fulfilment)getModel()).getFufilledRole());
        targetLabel.setToolTip(tooltipTarget);
        conn.add(targetLabel,targetEndL);
        
	    return conn;
	  }

	//change tragetLabel text when user change filledRole in the propertysheet
	@Override 
	 protected void refreshVisuals() {
		super.refreshVisuals();
		final Fulfilment model = (Fulfilment) getModel();

		targetLabel.setText(model.getFufilledRole());
	}
}
