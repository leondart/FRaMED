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
		tooltipTarget.setText("This tooltip is for layouting of the text, which is not implemented yet");
		
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
        String text = "<...>";
        for(String name : ((Fulfilment)getModel()).getFulfilledRoles()){
          if(text.equals("<...>")){
            text = name;
          }
          else{
            text = text + ", " + name;
          }
        }
        targetLabel.setText(text);
        targetLabel.setToolTip(tooltipTarget);
        conn.add(targetLabel,targetEndL);
        
	    return conn;
	  }

	//change tragetLabel text when user change filledRole in the propertysheet
	@Override 
	 protected void refreshVisuals() {
		super.refreshVisuals();
		
		final Fulfilment model = (Fulfilment) getModel();
		
		String text = "<...>";
        for(String name : model.getFulfilledRoles()){
          if(text.equals("<...>")){
            text = name;
          }
          else{
            text = text + ", " + name;
          }
        }
        
        targetLabel.setText(text);
	}
}
