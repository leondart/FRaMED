package org.framed.orm.ui.editPart.connectionkinds;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.draw2d.ConnectionEndpointLocator;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Locator;
import org.eclipse.draw2d.PolylineConnection;
import org.eclipse.gef.EditPart;
import org.eclipse.swt.SWT;
import org.framed.orm.model.RelationLabel;
import org.framed.orm.model.Relationship;
import org.framed.orm.ui.editPart.ORMRelationLabelEditPart;

/**
 * @author Kay Bierzynski (initial development)
 * @author Lars Schuetze (refactoring)
 **/
public class ORMRelationshipEditPart extends ORMRelationEditPart {

  @Override
  protected IFigure createFigure() {
    PolylineConnection connection = new PolylineConnection();
    connection.setAntialias(SWT.ON);

    return connection;
  }

  private Locator getConnectionLocator(PolylineConnection connection, boolean isEnd) {
    final ConnectionEndpointLocator locator = new ConnectionEndpointLocator(connection, isEnd);
    locator.setVDistance(-1);
    locator.setUDistance(1);
    return locator;
  }

  @Override
  protected List getModelChildren() {
    List<RelationLabel> children = new ArrayList<>(2);
    children.add(getRelationship().getTargetLabel());
    children.add(getRelationship().getSourceLabel());
    return children;
  }

  protected Relationship getRelationship() {
    return (Relationship) getModel();
  }

  protected PolylineConnection getRelationFigure() {
    return (PolylineConnection) getFigure();
  }

  @Override
  protected void addChildVisual(EditPart childEditPart, int index) {
    if (childEditPart instanceof ORMRelationLabelEditPart) {
      ORMRelationLabelEditPart labelEditPart = (ORMRelationLabelEditPart) childEditPart;
      getRelationFigure().getLayoutManager().setConstraint(labelEditPart.getFigure(),
          getConnectionLocator(getRelationFigure(), labelEditPart.isRelationEnd()));
    }
    super.addChildVisual(childEditPart, index);
  }
}
