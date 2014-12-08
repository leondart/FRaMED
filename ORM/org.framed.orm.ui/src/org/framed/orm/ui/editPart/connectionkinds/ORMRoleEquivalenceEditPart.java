package org.framed.orm.ui.editPart.connectionkinds;

import org.eclipse.draw2d.BendpointConnectionRouter;
import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.PolygonDecoration;
import org.eclipse.draw2d.PolylineConnection;
import org.eclipse.gef.EditPart;
import org.eclipse.swt.SWT;

/**
 * This {@link EditPart} is the controller for the model element {@link RoleEquivalence}.
 * 
 * @author Kay Bierzynski
 * */
public class ORMRoleEquivalenceEditPart extends ORMRelationEditPart {


  /**
   * {@inheritDoc} {@link RoleEquivalence}s have as figure a dashed line with a white arrow tips at
   * both connection ends. at target end of this connection.
   */
  @Override
  protected IFigure createFigure() {

    // create white arrow tip 1
    PolygonDecoration poly1 = new PolygonDecoration();
    poly1.setAntialias(SWT.ON);
    poly1.setBackgroundColor(ColorConstants.white);
    poly1.setScale(5, 5);

    // create white arrow tip 2
    PolygonDecoration poly2 = new PolygonDecoration();
    poly2.setAntialias(SWT.ON);
    poly2.setBackgroundColor(ColorConstants.white);
    poly2.setScale(5, 5);

    PolylineConnection conn = new PolylineConnection();
    conn.setAntialias(SWT.ON);
    conn.setLineDash(new float[] {5.0f, 5.0f});
    conn.setLineStyle(SWT.LINE_CUSTOM);
    // add white arrow tip 1
    conn.setTargetDecoration(poly1);
    // add white arrow tip 2
    conn.setSourceDecoration(poly2);
    conn.setConnectionRouter(new BendpointConnectionRouter());
    return conn;
  }

}
