package org.framed.orm.ui.figure;

import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.XYLayout;

/**
 * @author Kay Bierzynski
 * */
public class ORMRolemodelFigure extends Figure {

	public ORMRolemodelFigure() {
	
		XYLayout layout = new XYLayout();
		setLayoutManager(layout);

    }
   


    @Override
    protected boolean useLocalCoordinates() {
        return true;
    }
	
}
