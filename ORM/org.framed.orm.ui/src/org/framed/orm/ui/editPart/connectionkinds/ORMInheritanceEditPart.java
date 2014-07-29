package org.framed.orm.ui.editPart.connectionkinds;

import org.eclipse.draw2d.BendpointConnectionRouter;
import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.PolygonDecoration;
import org.eclipse.draw2d.PolylineConnection;
import org.eclipse.gef.EditPart;
import org.eclipse.swt.SWT;
import org.framed.orm.model.Inheritance;


/**
 * This {@link EditPart} is the controller for the model element {@link Inheritance}.
 * 
 * @author Kay Bierzynski
 * */
public class ORMInheritanceEditPart extends ORMRelationEditPart {

  /**
   * {@inheritDoc} {@link Inheritance}s have as figure a drawn through line with a white arrow tip
   * at target end of this connection.
   */
  @Override
  protected IFigure createFigure() {
    PolylineConnection conn = new PolylineConnection();
    conn.setAntialias(SWT.ON);
    // create white arrow tip
    PolygonDecoration poly = new PolygonDecoration();
    poly.setAntialias(SWT.ON);
    poly.setBackgroundColor(ColorConstants.white);
    poly.setScale(5, 5);

    // add white arrow tip
    conn.setTargetDecoration(poly);
    conn.setConnectionRouter(new BendpointConnectionRouter());
    return conn;
  }
}
