package org.framed.orm.ui.editPart.shape;

import org.eclipse.draw2d.IFigure;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;
import org.framed.orm.ui.figure.ORMFigureFactory;

public class ORMNamedElementEditPart extends AbstractGraphicalEditPart {

	@Override
	protected IFigure createFigure() {
		return ORMFigureFactory.createFigure(this);
	}

	@Override
	protected void createEditPolicies() {
		// TODO Auto-generated method stub

	}

}