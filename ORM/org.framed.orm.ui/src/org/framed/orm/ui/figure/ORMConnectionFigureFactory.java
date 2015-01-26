package org.framed.orm.ui.figure;

import org.eclipse.draw2d.BendpointConnectionRouter;
import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.ConnectionEndpointLocator;
import org.eclipse.draw2d.ConnectionLocator;
import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.PolygonDecoration;
import org.eclipse.draw2d.PolylineConnection;
import org.eclipse.draw2d.PolylineDecoration;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.gef.EditPart;
import org.eclipse.swt.SWT;
import org.framed.orm.model.Relation;
import org.framed.orm.model.Shape;
import org.framed.orm.model.Type;
import org.framed.orm.ui.editPart.connectionkinds.ORMFulfillmentEditPart;
import org.framed.orm.ui.editPart.connectionkinds.ORMRelationshipConstraintEditPart;
import org.framed.orm.ui.editPart.connectionkinds.ORMRelationshipEditPart;
import org.framed.orm.ui.editPart.shape.ORMCompartmentEditPart;
import org.framed.orm.ui.figure.shapes.PartFigure;

public class ORMConnectionFigureFactory {

  public static Figure createConnectionFigure(EditPart editPart) {

    Relation relation = (Relation) editPart.getModel();
    int val = relation.getType().getValue();
    switch (val) {
      case Type.CYCLIC_VALUE:
        return createRelationshipConstraintFigure(relation, editPart);
      case Type.IRREFLEXIVE_VALUE:
        return createRelationshipConstraintFigure(relation, editPart);
      case Type.TOTAL_VALUE:
        return createRelationshipConstraintFigure(relation, editPart);
      case Type.RELATIONSHIP_VALUE:
        return createRelationshipFigure((ORMRelationshipEditPart) editPart);
      case Type.ROLE_EQUIVALENCE_VALUE:
        return createRoleEquivalenceFigure();
      case Type.ROLE_IMPLICATION_VALUE:
        return createRoleRelationshipImplicationFigure();
      case Type.RELATIONSHIP_IMPLICATION_VALUE:
        return createRoleRelationshipImplicationFigure();
      case Type.ROLE_PROHIBITION_VALUE:
        return createRoleProhibitonFigure();
      case Type.FULFILLMENT_VALUE:
        return createFulfillmentFigure(relation, editPart);
      case Type.INHERITANCE_VALUE:
        return createInheritanceFigure();
    }

    return null;
  }

  /**
   * This method creates and returns the figure for {@link Relation}s from type cyclic, total and
   * irreflexive, which differs from relationshipConstraint to relationshipConstraint only in the
   * text of the {@link Label}. A cyclic, total or irreflexive figure is dashed line with a
   * {@link Label}.
   * 
   * @return conn org.eclipse.draw2d.PolylineConnection
   * */
  private static Figure createRelationshipConstraintFigure(Relation relation, EditPart editpart) {
    ORMRelationshipConstraintEditPart editP = (ORMRelationshipConstraintEditPart) editpart;

    editP.getLabel().setText(relation.getName());
    editP.setTextInitial(relation.getName());

    PolylineConnection conn = new PolylineConnection();
    conn.setAntialias(SWT.ON);
    conn.setLineDash(new float[] {5.0f, 5.0f});
    conn.setLineStyle(SWT.LINE_CUSTOM);;
    conn.setConnectionRouter(new BendpointConnectionRouter());

    // add label to the connection
    ConnectionLocator loc = new ConnectionLocator(conn, ConnectionLocator.MIDDLE);
    loc.setRelativePosition(PositionConstants.SOUTH);
    loc.setGap(5);
    // this is needed, because when the label would be just added the label text could be seen in
    // the rootModel
    if (editP.getRoot().getContents() instanceof ORMCompartmentEditPart) {
      conn.add(editP.getLabel(), loc);
    }
    return conn;
  }

  /**
   * {@link Relation}s from type relationship have as figure a drawn through line with two
   * {@link Label}s at both ends. The {@link Label} are added through child model elements(
   * {@link NamedElements}).
   */
  private static Figure createRelationshipFigure(ORMRelationshipEditPart editPart) {
    PolylineConnection connection = new PolylineConnection();
    connection.setAntialias(SWT.ON);
    connection.setConnectionRouter(new BendpointConnectionRouter());
    
    // add label to the connection
    ConnectionLocator loc = new ConnectionLocator(connection, ConnectionLocator.MIDDLE);
    loc.setRelativePosition(PositionConstants.NORTH);
    loc.setGap(5);
    
    // this is needed, because when the label would be just added the label text could be seen in
    // the rootModel
    if (editPart.getRoot().getContents() instanceof ORMCompartmentEditPart) {
      editPart.getNameLabel().setText(editPart.getRelationship().getName());
      connection.add(editPart.getNameLabel(), loc);
    } 
    return connection;
  }


  /**
   * {@link Relation}s from type roleequivalence have as figure a dashed line with a white arrow
   * tips at both connection ends.
   */
  private static Figure createRoleEquivalenceFigure() {
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

  /**
   * {@link Relations}s from type roleimplication and relationshipimplication have as figure a
   * dashed line with a white arrow tip at target end of this connection.
   */
  private static Figure createRoleRelationshipImplicationFigure() {
    // create white arrow tip
    PolygonDecoration poly = new PolygonDecoration();
    poly.setAntialias(SWT.ON);
    poly.setBackgroundColor(ColorConstants.white);
    poly.setScale(5, 5);

    PolylineConnection conn = new PolylineConnection();
    conn.setAntialias(SWT.ON);
    conn.setLineDash(new float[] {5.0f, 5.0f});
    conn.setLineStyle(SWT.LINE_CUSTOM);
    conn.setTargetDecoration(poly);
    conn.setConnectionRouter(new BendpointConnectionRouter());
    return conn;
  }

  /**
   * Input template for the arrow tips so that the arrow tips are drawn inverted and open at the
   * " bottom side".
   */
  public static final PointList INVERTED_TRIANGLE_TIP = new PointList();

  // coordinates to draw a arrow tip inverted
  static {
    INVERTED_TRIANGLE_TIP.addPoint(0, 1);
    INVERTED_TRIANGLE_TIP.addPoint(-1, 0);
    INVERTED_TRIANGLE_TIP.addPoint(0, -1);
  }

  /**
   * {@link Relation}s from type roleprohibition have as figure a dased line with two inverted and
   * open arrow tips at both ends of this connection.
   */
  private static Figure createRoleProhibitonFigure() {
    PolylineDecoration poly1 = new PolylineDecoration();
    poly1.setTemplate(INVERTED_TRIANGLE_TIP);
    poly1.setAntialias(SWT.ON);
    poly1.setBackgroundColor(ColorConstants.black);
    poly1.setScale(5, 5);


    PolylineDecoration poly2 = new PolylineDecoration();
    poly2.setTemplate(INVERTED_TRIANGLE_TIP);
    poly2.setAntialias(SWT.ON);
    poly2.setBackgroundColor(ColorConstants.black);
    poly2.setScale(5, 5);


    PolylineConnection conn = new PolylineConnection();
    conn.setAntialias(SWT.ON);
    conn.setLineDash(new float[] {5.0f, 5.0f});
    conn.setLineStyle(SWT.LINE_CUSTOM);
    conn.setTargetDecoration(poly1);
    conn.setSourceDecoration(poly2);
    conn.setConnectionRouter(new BendpointConnectionRouter());

    return conn;
  }

  /**
   * {@link Relation}s from type fulfillment have as figure a drawn through line with a
   * {@link Label} at the connection end that contains the names of the {@link Shape}s from type
   * roletype and rolegroup that are fulfilled from the source of this fulfillment and a black arrow
   * tip at the target end of the connection .
   */
  private static Figure createFulfillmentFigure(Relation relation, EditPart editPart) {
    PartFigure tooltipTarget = new PartFigure();

    PolylineConnection conn = new PolylineConnection();
    conn.setAntialias(SWT.ON);

    // create the black arrow tip
    PolygonDecoration poly = new PolygonDecoration();
    poly.setAntialias(SWT.ON);
    poly.setBackgroundColor(ColorConstants.black);
    poly.setScale(5, 5);

    // add the the black arrow tip
    conn.setTargetDecoration(poly);
    conn.setConnectionRouter(new BendpointConnectionRouter());

    // add target Label
    ConnectionEndpointLocator targetEndL = new ConnectionEndpointLocator(conn, true);
    targetEndL.setVDistance(-1);
    targetEndL.setUDistance(1);

    // add to the targetLabel the initial roletype and the rolegroup names in the fulfilledrole list
    Label label = new Label("<...>");
    int roleCount = 0;
    for (Shape role : relation.getReferencedRoles()) {
      if (label.getText().equals("<...>")) {
        label.setText(role.getName());
      } else {
        if (roleCount > 2) {
          tooltipTarget.add(new Label(role.getName()));
        } else {
          label.setText(label.getText() + ", " + role.getName());
        }
      }
      roleCount++;
    }

    label.setToolTip(tooltipTarget);
    conn.add(label, targetEndL);

    if (editPart instanceof ORMFulfillmentEditPart) {
      ((ORMFulfillmentEditPart) editPart).setTargetLabel(label);
      ((ORMFulfillmentEditPart) editPart).setTargetToolTip(tooltipTarget);
    }
    return conn;
  }

  /**
   * {@link Relation}s from type inheritance have as figure a drawn through line with a white arrow
   * tip at target end of this connection.
   */
  private static Figure createInheritanceFigure() {
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
