package org.framed.orm.ui.editPart.connectionkinds;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.draw2d.BendpointConnectionRouter;
import org.eclipse.draw2d.ConnectionEndpointLocator;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Locator;
import org.eclipse.draw2d.PolylineConnection;
import org.eclipse.gef.EditPart;
import org.eclipse.swt.SWT;
import org.framed.orm.model.NamedElement;
import org.framed.orm.model.Relation;
import org.framed.orm.ui.editPart.ORMRelationLabelEditPart;

/**
 * This {@link EditPart} is the controller for the model element {@link Relationship}.
 * 
 * @author Kay Bierzynski (initial development)
 * @author Lars Schuetze (refactoring)
 * @author David Gollasch (changes due to a new model)
 **/
public class ORMRelationshipEditPart extends ORMRelationEditPart {

  /**
   * This method returns a {@link ConnectionEndpointLocator} for this {@link Relationship}.
   * 
   * @return locator org.eclipse.draw2d.ConnectionEndpointLocator
   * */
  private Locator getConnectionLocator(final PolylineConnection connection, final boolean isEnd) {
    final ConnectionEndpointLocator locator = new ConnectionEndpointLocator(connection, isEnd);
    locator.setVDistance(-1);
    locator.setUDistance(1);
    return locator;
  }

  /** {@inheritDoc} */
  @Override
  protected List<NamedElement> getModelChildren() {
    List<NamedElement> children = new ArrayList<>(2);
    children.add(getRelationship().getTargetLabel());
    children.add(getRelationship().getSourceLabel());
    return children;
  }

  /**
   * A getter for the model element {@link Relationship}. 
   * 
   * @return ({@link Relationship}) getModel()
   * */
  protected Relation getRelationship() {
    return (Relation) getModel();
  }

  /**
   * A getter for the model element {@link Relationship} figure. 
   * 
   * @return ({@link PolylineConnection}) getFigure()
   * */
  protected PolylineConnection getRelationFigure() {
    return (PolylineConnection) getFigure();
  }

  /** {@inheritDoc} In case the figures of {@link RelationLabel}s.*/
  @Override
  protected void addChildVisual(final EditPart childEditPart, final int index) {
    if (childEditPart instanceof ORMRelationLabelEditPart) {
      ORMRelationLabelEditPart labelEditPart = (ORMRelationLabelEditPart) childEditPart;
      getRelationFigure().getLayoutManager().setConstraint(labelEditPart.getFigure(),
          getConnectionLocator(getRelationFigure(), labelEditPart.isRelationEnd()));
    }
    super.addChildVisual(childEditPart, index);
  }
}
