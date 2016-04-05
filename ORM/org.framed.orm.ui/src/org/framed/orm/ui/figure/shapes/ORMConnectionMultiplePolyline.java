package org.framed.orm.ui.figure.shapes;

import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.PolylineConnection;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.gef.EditPart;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.framed.orm.model.Relation;

/**
 * 10.03.2016
 * This connection is used for the representation of relationship connections. 
 * It distinguished between having constraints and not.
 * 
 * @author Duc Dung Dam
 * */

public class ORMConnectionMultiplePolyline extends PolylineConnection {
	boolean hasConstraint = false;
	
	@Override
	protected void outlineShape(Graphics g){
		final PointList points = getPoints();

		Display display = Display.getCurrent();
		
		g.setAntialias(SWT.ON);
		g.setLineStyle(SWT.LINE_CUSTOM);
		if (hasConstraint){
			g.setLineStyle(SWT.LINE_DASH);
			g.setLineDash(new float[] {5.0f, 5.0f});
			g.setLineWidth(5);
			g.drawPolyline(points);
			
			g.setLineStyle(SWT.LINE_SOLID);
			g.setForegroundColor(display.getSystemColor(SWT.COLOR_WHITE));
			g.setLineWidth(3);
			g.drawPolyline(points);
		}
		
		g.setLineStyle(SWT.LINE_SOLID);
		g.setForegroundColor(display.getSystemColor(SWT.COLOR_BLACK));
		g.setLineWidth(1);
		g.drawPolyline(points);
	}
	
	public void setHasConstraint(boolean bol){
		hasConstraint = bol;
	}
}
