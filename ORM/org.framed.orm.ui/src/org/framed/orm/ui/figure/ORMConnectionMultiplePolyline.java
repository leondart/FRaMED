package org.framed.orm.ui.figure;

import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.PolylineConnection;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.swt.SWT;

public class ORMConnectionMultiplePolyline extends PolylineConnection {
	boolean hasConstraint = false;
	
	@Override
	protected void outlineShape(Graphics g){
		PointList points = getPoints();
		
		g.setLineStyle(SWT.LINE_SOLID);
		g.setAntialias(SWT.ON);
		g.setLineStyle(SWT.LINE_CUSTOM);
		
		g.drawPolyline(points);
		
		if (hasConstraint){
			g.setLineStyle(SWT.LINE_DASH);
			g.setAntialias(SWT.ON);
			g.setLineDash(new float[] {5.0f, 5.0f});
			g.setLineStyle(SWT.LINE_CUSTOM);
			
			points.translate(3, 3);
			g.drawPolyline(points);
			
			points.translate(-6, -6);
			g.drawPolyline(points);
		}
	}
	
	protected void setHasConstraint(boolean bol){
		hasConstraint = bol;
	}
}
