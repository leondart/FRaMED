package orm.editPart.connectionkinds;

import org.eclipse.draw2d.BendpointConnectionRouter;
import org.eclipse.draw2d.ConnectionEndpointLocator;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.PolylineConnection;
import org.eclipse.swt.SWT;

import orm.figure.LabelFigure;
import org.framed.orm.model.Relationship;

/**
 * @author Kay Bierzynski
 * */
public class ORMRelationshipEditPart extends ORMRelationEditPart {
	// direct Edit of this labels over Propertysheet
	private final LabelFigure sourceLabel, targetLabel;
	
 
	
	public  ORMRelationshipEditPart() {
	    super();
	    sourceLabel = new LabelFigure();
	    targetLabel = new LabelFigure();
	  }
	
	@Override protected IFigure createFigure() {
		Label tooltipTarget = new Label();
		tooltipTarget.setText("Direct Editing of this Value over the Propertysheet from the related Realtionship under tragetLabelValue.");
		Label tooltipSource = new Label();
		tooltipSource.setText("Direct Editing of this Value over the Propertysheet from the related Realtionship under sourceLabelValue.");
		
	    PolylineConnection conn = new PolylineConnection();
	    conn.setAntialias(SWT.ON);
        conn.setConnectionRouter(new BendpointConnectionRouter());
        //add target Label
        ConnectionEndpointLocator targetEndL = new  ConnectionEndpointLocator(conn,true);
        targetEndL.setVDistance(-1);
        targetEndL.setUDistance(1);
        targetLabel.setText(((Relationship)getModel()).getTargetLabelValue());
        targetLabel.setToolTip(tooltipTarget);
        conn.add(targetLabel,targetEndL);
        //add source Label
        ConnectionEndpointLocator sourceEndL = new ConnectionEndpointLocator(conn,false);
        sourceEndL.setVDistance(-1);
        sourceEndL.setUDistance(1);
        sourceLabel.setText(((Relationship)getModel()).getSourceLabelValue());
        sourceLabel.setToolTip(tooltipSource);
        conn.add(sourceLabel,sourceEndL);
        
	    return conn;
	  }
	
	@Override 
	 protected void refreshVisuals() {
		super.refreshVisuals();
		final Relationship model = (Relationship) getModel();
		
		sourceLabel.setText(model.getSourceLabelValue());
		targetLabel.setText(model.getTargetLabelValue());
	}
}
