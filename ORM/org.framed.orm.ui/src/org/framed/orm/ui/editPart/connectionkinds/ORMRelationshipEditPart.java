package org.framed.orm.ui.editPart.connectionkinds;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.draw2d.ConnectionEndpointLocator;
import org.eclipse.draw2d.ConnectionLocator;
import org.eclipse.draw2d.Locator;
import org.eclipse.draw2d.PolylineConnection;
import org.eclipse.gef.EditPart;
import org.framed.orm.model.NamedElement;
import org.framed.orm.model.Relation;
import org.framed.orm.ui.editPart.ORMNamedElementEditPart;
import org.framed.orm.ui.editPart.shape.ORMSuperShapeEditPart;

/**
 * This {@link EditPart} is the controller for {@link Relation}s from type relationship.
 * 
 * @author Kay Bierzynski (initial development, implemented Relationship Implication, last changes due to new model)
 * @author Lars Schuetze (refactoring)
 * @author David Gollasch (changes due to a new model)
 **/
public class ORMRelationshipEditPart extends ORMRelationEditPart {

  /**
   * This method returns a {@link ConnectionEndpointLocator} for this {@link Relation} from type
   * relationship.
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
    if (getRelationship().getConnectionAnchor() != null) {
      children.add(getRelationship().getConnectionAnchor());
    }
    return children;
  }

  /**
   * A getter for the model element {@link Relation} from type relationship.
   * 
   * @return ({@link Relationship}) getModel()
   * */
  protected Relation getRelationship() {
    return (Relation) getModel();
  }

  /**
   * A getter for the relationship figure.
   * 
   * @return ({@link PolylineConnection}) getFigure()
   * */
  protected PolylineConnection getRelationFigure() {
    return (PolylineConnection) getFigure();
  }

  /**
   * {@inheritDoc} In case the figures of targetLabel and sourceLabel which are {@link NamedElement}
   * s.
   */
  @Override
  protected void addChildVisual(final EditPart childEditPart, final int index) {
    if (childEditPart instanceof ORMNamedElementEditPart) {
      ORMNamedElementEditPart labelEditPart = (ORMNamedElementEditPart) childEditPart;
      if (labelEditPart.getModel().equals(getRelationship().getSourceLabel())) {
        getRelationFigure().getLayoutManager().setConstraint(labelEditPart.getFigure(),
            getConnectionLocator(getRelationFigure(), false));
      } else {
        getRelationFigure().getLayoutManager().setConstraint(labelEditPart.getFigure(),
            getConnectionLocator(getRelationFigure(), true));
      }
    }

    if (childEditPart instanceof ORMSuperShapeEditPart) {
      ConnectionLocator loc = new ConnectionLocator(getRelationFigure(), ConnectionLocator.MIDDLE);
      getRelationFigure().getLayoutManager().setConstraint(((ORMSuperShapeEditPart) childEditPart).getFigure(), loc);
    }
    super.addChildVisual(childEditPart, index);
  }
}
