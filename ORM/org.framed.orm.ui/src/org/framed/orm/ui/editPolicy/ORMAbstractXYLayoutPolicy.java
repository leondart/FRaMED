package org.framed.orm.ui.editPolicy;

import java.util.List;

import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;
import org.eclipse.gef.editpolicies.XYLayoutEditPolicy;
import org.eclipse.gef.requests.ChangeBoundsRequest;
import org.eclipse.gef.requests.CreateRequest;
import org.framed.orm.geometry.GeometryFactory;
import org.framed.orm.geometry.Point;
import org.framed.orm.model.Model;
import org.framed.orm.model.Shape;
import org.framed.orm.model.Type;
import org.framed.orm.ui.command.ORMAddCommand;
import org.framed.orm.ui.utilities.ORMTextUtilities;

/**
 * @author Lars Schuetze
 * 
 */
public abstract class ORMAbstractXYLayoutPolicy extends XYLayoutEditPolicy {

	static Dimension dynamicDimensions(Object obj) {
		Dimension d = new Dimension();

		d.setWidth(200);

		if (obj == null) {
			d.setHeight(ORMTextUtilities.charHeight(null) * 10); // charHeight *
																	// 10: title
																	// + 3
																	// attributes
																	// + 3
																	// methods +
																	// 3 dots
			return d;
		}

		if (obj.equals(Type.ROLE_GROUP)) {
			// offset + title + role height
			d.setHeight(2 * ORMTextUtilities.charHeight(null)
					+ dynamicDimensions(null).height());
			d.setWidth(250);
		} else {
			// charHeight * 10: title + 3 attributes + 3 methods + 3 dots
			d.setHeight(ORMTextUtilities.charHeight(null) * 10);
		}

		return d;
	}

	@Override
	protected Command createAddCommand(ChangeBoundsRequest request,
			EditPart child, Object constraint) {
		CompoundCommand result = new CompoundCommand();

		@SuppressWarnings("unchecked")
		List<AbstractGraphicalEditPart> parts = request.getEditParts();
		Rectangle r = (Rectangle) constraint;

		for (AbstractGraphicalEditPart part : parts) {
			if (part.getModel() instanceof Shape) {
				Rectangle newBoundarie = r;
				ORMAddCommand addCommand = new ORMAddCommand();
				addCommand.setParent((Model) getHost().getModel());
				addCommand.setChild((Shape) part.getModel());

				Shape n = (Shape) part.getModel();

				org.framed.orm.geometry.Rectangle rec = n.getBoundaries();
				int width = Math.abs(rec.getTopLeft().getX()
						- rec.getBottomRight().getX());
				int heigth = Math.abs(rec.getTopLeft().getY()
						- rec.getBottomRight().getY());
				Dimension dim = new Dimension(width, heigth);

				newBoundarie = new Rectangle(r.getLocation(), dim);

				addCommand.setBoundaries(createModelReactangle(newBoundarie));
				addCommand.setLabel("Adding");
				addCommand.setDebugLabel("Adding");

				result.add(addCommand);
			}
		}
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.gef.editpolicies.LayoutEditPolicy#getCreateCommand(org.eclipse
	 * .gef.requests. CreateRequest)
	 */
	@Override
	protected Command getCreateCommand(CreateRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Command getCloneCommand(ChangeBoundsRequest request) {
		// TODO Auto-generated method stub
		return super.getCloneCommand(request);
	}

	/**
	 * This method converts a draw2d Rectangle into a Rectangle from the
	 * graphical model.
	 * 
	 * @param boundarie
	 *            org.eclipse.draw2d.geometry.Rectangle
	 * @return rec org.framed.orm.geometry.Rectangle
	 * */
	protected org.framed.orm.geometry.Rectangle createModelReactangle(
			final Rectangle boundarie) {
		org.framed.orm.geometry.Rectangle rec = GeometryFactory.eINSTANCE
				.createRectangle();

		Point bottomRight = GeometryFactory.eINSTANCE.createPoint();
		Point topLeft = GeometryFactory.eINSTANCE.createPoint();

		bottomRight.setX(boundarie.getBottomRight().x());
		bottomRight.setY(boundarie.getBottomRight().y());
		topLeft.setX(boundarie.getTopLeft().x());
		topLeft.setY(boundarie.getTopLeft().y());

		rec.setBottomRight(bottomRight);
		rec.setTopLeft(topLeft);
		return rec;
	}
}
