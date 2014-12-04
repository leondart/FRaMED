package org.framed.orm.ui.editPart.types;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;
import org.framed.orm.model.Shape;
import org.framed.orm.ui.figure.ORMFigureFactory;

/**
 * 
 * @author Bálint Gyapjas
 *
 */
public class ORMShapeEditPart extends AbstractGraphicalEditPart {

	@Override
	protected IFigure createFigure() {
		return ORMFigureFactory.createFigure(this);
	}

	@Override
	protected void createEditPolicies() {
		// TODO Auto-generated method stub

	}
	
	public Rectangle getConstraints() {
		Shape model = (Shape) getModel();
		org.framed.orm.geometry.Rectangle boundries = model.getBoundaries();
		
		Point	topLeft = new Point( boundries.getTopLeft().getX(), boundries.getTopLeft().getX()),
				bottomRight = new Point( boundries.getBottomRight().getX(), boundries.getBottomRight().getY());
		
		return new org.eclipse.draw2d.geometry.Rectangle(topLeft,bottomRight);		
	}
	
	@Override
	protected void addChildVisual(final EditPart childEditPart, final int index) {
		
	}

}
