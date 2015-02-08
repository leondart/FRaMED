package org.framed.orm.ui.editPart.connectionkinds;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.draw2d.Bendpoint;
import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.ConnectionAnchor;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.RelativeBendpoint;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.gef.ConnectionEditPart;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.NodeEditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.editparts.AbstractConnectionEditPart;
import org.eclipse.gef.editparts.ScalableRootEditPart;
import org.eclipse.gef.editpolicies.ConnectionEndpointEditPolicy;
import org.framed.orm.geometry.Point;
import org.framed.orm.geometry.RelativePoint;
import org.framed.orm.model.Model;
import org.framed.orm.model.Relation;
import org.framed.orm.model.Shape;
import org.framed.orm.model.Type;
import org.framed.orm.ui.editPart.ORMModelEditPart;
import org.framed.orm.ui.editPart.shape.ORMCompartmentEditPart;
import org.framed.orm.ui.editPart.shape.ORMShapeWithoutSegmentEditPart;
import org.framed.orm.ui.editPart.shape.ORMSuperShapeEditPart;
import org.framed.orm.ui.editPolicy.ORMRelationBendpointEditPolicy;
import org.framed.orm.ui.editPolicy.ORMRelationConnectionEditPolicy;
import org.framed.orm.ui.editPolicy.ORMRelationGraphicalNodeEditPolicy;
import org.framed.orm.ui.figure.ORMConnectionFigureFactory;
import org.framed.orm.ui.figure.shapes.ORMShapeFigure;

/**
 * This {@link EditPart} is the super/parent {@link EditPart} also super/parent controller of all
 * {@link Relation}s.
 * 
 * @author Kay Bierzynski
 * */
public class ORMRelationEditPart extends AbstractConnectionEditPart implements NodeEditPart {

  /**
   * The {@link Adapter} of this controller, which recieves the notifications from the viewer/user.
   * This {@link EditPart} reacts on the notifications
   */
  private final RelationAdapter adapter;

  /**
   * Constructor of this class. In which the class is initialized through calling the constructor of
   * it's parent and initializing it's {@link Adapter}.
   */
  public ORMRelationEditPart() {
    super();
    adapter = new RelationAdapter();
  }

  /** {@inheritDoc} */
  @Override
  protected IFigure createFigure() {
    return ORMConnectionFigureFactory.createConnectionFigure(this);
  }

  /** {@inheritDoc} */
  @Override
  protected void createEditPolicies() {
    installEditPolicy(EditPolicy.CONNECTION_ENDPOINTS_ROLE, new ConnectionEndpointEditPolicy());
    // edit policy, which handel the creation of relations
    installEditPolicy(EditPolicy.CONNECTION_ROLE, new ORMRelationConnectionEditPolicy());
    // edit policy, which the creation, moving and deletion of bendpoints on a relation
    installEditPolicy(EditPolicy.CONNECTION_BENDPOINTS_ROLE, new ORMRelationBendpointEditPolicy());
    installEditPolicy(EditPolicy.GRAPHICAL_NODE_ROLE, new ORMRelationGraphicalNodeEditPolicy());
  }

  /**
   * {@inheritDoc} The refreshVisuals of this {@link EditPart} updates/adds the {@link Bendpoint}s
   * of a {@link Relation}. The content of this method should only be called when the
   * compartmenttype/group/rootmodel where this {@link Relation}s parentrolemodel(for the cases
   * compartmenttype/group) belongs to is the current opened(content of the viewer)
   * compartmenttype/group/rootmodel. The test of getSource() != null and getTarget() != null is
   * needed, because it exist cases where this method is called and getSource() or getTarget()
   * returns null.
   * 
   */
  @Override
  protected void refreshVisuals() {

    if ((getSource() != null && getTarget() != null)
        && (testRootModel() || testGroup()
            && getSource().getParent().getParent().getParent() instanceof ScalableRootEditPart || getRoot()
            .getContents() instanceof ORMCompartmentEditPart)) {

      Connection connection = getConnectionFigure();
      connection.setVisible(true);
      List<RelativePoint> relativePoints = ((Relation) getModel()).getBendpoints();

      // the bendpoints are added as RelativeBendpoint, because the position of the bendpoints
      // must change when the position of the source or target of the relation changes or the the
      // figure of the content of the viewer has expandable and collapsable elements
      ArrayList<RelativeBendpoint> figureConstraint = new ArrayList<RelativeBendpoint>();

      for (int i = 0; i < relativePoints.size(); i++) {
        RelativeBendpoint rbp = new RelativeBendpoint(getConnectionFigure());
        // p.x = width p.y = height
        Point pSource = relativePoints.get(i).getDistances().get(0);
        Point pTarget = relativePoints.get(i).getDistances().get(1);
        Dimension dim1 = new Dimension(pSource.getX(), pSource.getY());
        Dimension dim2 = new Dimension(pTarget.getX(), pTarget.getY());
        rbp.setRelativeDimensions(dim1, dim2);

        figureConstraint.add(rbp);
      }

      connection.setRoutingConstraint(figureConstraint);
    } else {
      getConnectionFigure().setVisible(false);
    }
  }

  /**
   * This method checks if the parent in the model tree of the model element, which is represented
   * through this editpart is the root model or not.
   * */
  private boolean testRootModel() {
    if (getSource().getParent() instanceof ORMModelEditPart) {
      Model model = (Model) getSource().getParent().getModel();
      return model.getParent() == null;
    } else {
      return false;
    }
  }

  /**
   * This method checks if the parent in the model tree of the model element, which is represented
   * through this editpart is a {@link Shape} from type group.
   * */
  private boolean testGroup() {
    if (getRoot().getContents() instanceof ORMShapeWithoutSegmentEditPart) {
      return ((Shape) getRoot().getContents().getModel()).getType().equals(Type.GROUP);
    } else {
      return false;
    }

  }

  /** {@inheritDoc} */
  @Override
  public void activate() {
    if (!isActive()) {
      ((Relation) getModel()).eAdapters().add(adapter);
    }
    super.activate();
  }

  /** {@inheritDoc} */
  @Override
  public void deactivate() {
    if (isActive()) {
      ((Relation) getModel()).eAdapters().remove(adapter);
    }
    super.deactivate();
  }

  /**
   * The {@link Adapter} of this {@link EditPart}. An adapter is a receiver of notifications and is
   * typically associated with a Notifier via an AdapterFactory. This {@link Adapter} calls the
   * refreshVisuals() method when it gets a change notification.
   * 
   * */
  public class RelationAdapter implements Adapter {

    /** {@inheritDoc} */
    @Override
    public void notifyChanged(final Notification notification) {
      refreshChildren();
      refreshVisuals();
    }

    /** {@inheritDoc} */
    @Override
    public Notifier getTarget() {
      return (Relation) getModel();
    }

    /** {@inheritDoc} */
    @Override
    public void setTarget(final Notifier newTarget) {
      // Do nothing.
    }

    /** {@inheritDoc} */
    @Override
    public boolean isAdapterForType(final Object type) {
      return type.getClass().equals(Relation.class);
    }
  }

  /** {@inheritDoc} */
  @Override
  public ConnectionAnchor getSourceConnectionAnchor(ConnectionEditPart connection) {
    Shape shape = ((Relation) getModel()).getConnectionAnchor();
    if (shape != null) {
      return getConnectionAnchorFromChildShape(shape);
    }
    return null;
  }

  /** {@inheritDoc} */
  @Override
  public ConnectionAnchor getTargetConnectionAnchor(ConnectionEditPart connection) {
    Shape shape = ((Relation) getModel()).getConnectionAnchor();
    if (shape != null) {
      return getConnectionAnchorFromChildShape(shape);
    }
    return null;
  }

  /** {@inheritDoc} */
  @Override
  public ConnectionAnchor getSourceConnectionAnchor(Request request) {
    Shape shape = ((Relation) getModel()).getConnectionAnchor();
    if (shape != null) {
      return getConnectionAnchorFromChildShape(shape);
    }
    return null;
  }

  /** {@inheritDoc} */
  @Override
  public ConnectionAnchor getTargetConnectionAnchor(Request request) {
    Shape shape = ((Relation) getModel()).getConnectionAnchor();
    if (shape != null) {
      return getConnectionAnchorFromChildShape(shape);
    }
    return null;
  }

  /**
   * This method returns the connection anchor of the connection anchor {@link Shape} of this
   * {@link Relation}.
   * 
   * @param shape {@link Shape}
   */
  public ConnectionAnchor getConnectionAnchorFromChildShape(Shape shape) {
    ORMSuperShapeEditPart editpart =
        (ORMSuperShapeEditPart) getViewer().getEditPartRegistry().get(shape);
    return ((ORMShapeFigure) editpart.getFigure()).getConnectionAnchor();
  }
}
