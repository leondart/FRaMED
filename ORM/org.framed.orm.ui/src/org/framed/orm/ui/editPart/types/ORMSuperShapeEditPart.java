package org.framed.orm.ui.editPart.types;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.draw2d.ConnectionAnchor;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.gef.CompoundSnapToHelper;
import org.eclipse.gef.ConnectionEditPart;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gef.NodeEditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.RequestConstants;
import org.eclipse.gef.SnapToGeometry;
import org.eclipse.gef.SnapToGrid;
import org.eclipse.gef.SnapToHelper;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;
import org.eclipse.gef.editparts.ScalableRootEditPart;
import org.eclipse.gef.editpolicies.SnapFeedbackPolicy;
import org.eclipse.jface.viewers.TextCellEditor;
import org.framed.orm.model.Relation;
import org.framed.orm.model.Shape;
import org.framed.orm.model.Type;
import org.framed.orm.ui.editPart.ORMGroupingEditPart;
import org.framed.orm.ui.editPolicy.ORMNamedElementDirectEditPolicy;
import org.framed.orm.ui.editPolicy.ORMNodeGraphicalNodeEditPolicy;
import org.framed.orm.ui.editPolicy.ORMShapeComponentEditPolicy;
import org.framed.orm.ui.editor.ORMCellEditorLocator;
import org.framed.orm.ui.editor.ORMDirectEditManager;
import org.framed.orm.ui.figure.ORMFigureFactory;
import org.framed.orm.ui.figure.ORMShapeFigure;

/**
 * This {@link EditPart} is the super/parent {@link EditPart} also super/parent controller of all
 * {@link Shape}s.
 * 
 * @author Kay Bierzynski
 * */
public abstract class ORMSuperShapeEditPart extends AbstractGraphicalEditPart implements
    NodeEditPart {

  /**
   * The {@link Adapter} of this controller, which recieves the notifications from the viewer/user.
   * This {@link EditPart} reacts on the notifications
   */
  private final ORMShapeAdapter adapter;

  /**
   * Constructor of this class. In which the class is initialized through calling the constructor of
   * it's parent and initializing it's {@link Adapter}.
   */
  public ORMSuperShapeEditPart() {
    super();
    adapter = new ORMShapeAdapter();
  }

  /** {@inheritDoc} */
  @Override
  protected IFigure createFigure() {
    return ORMFigureFactory.createFigure(this);
  }



  /** {@inheritDoc} */
  @Override
  public void createEditPolicies() {
    // edit policy for handling requests of editing the shape name
    installEditPolicy(EditPolicy.DIRECT_EDIT_ROLE, new ORMNamedElementDirectEditPolicy());
    installEditPolicy("Snap Feedback", new SnapFeedbackPolicy());
    // edit policy, which handels requests for deleting the shape, which is controlled
    // through this edit part
    installEditPolicy(EditPolicy.COMPONENT_ROLE, new ORMShapeComponentEditPolicy(this));
    // the ORMNodeGraphicalNodeEditPolicy shouldn't for shapes from type compartmenttype and group,
    // where the user stepped into
    if (!(getParent() instanceof ScalableRootEditPart)) {
      // installEditPolicy(EditPolicy.GRAPHICAL_NODE_ROLE, new ORMNodeGraphicalNodeEditPolicy());
    }
  }

  /** {@inheritDoc} */
  @Override
  public void performRequest(Request req) {

    if (req.getType() == RequestConstants.REQ_DIRECT_EDIT) {
      performDirectEditing();
    }
  }

  /** {@inheritDoc} */
  @Override
  protected List getModelChildren() {
    List children = new ArrayList();
    Shape shape = (Shape) getModel();
    if (shape.getFirstSegment() != null) {
      children.add(shape.getFirstSegment());
    }
    if (shape.getSecondSegment() != null) {
      children.add(shape.getSecondSegment());
    }
    if (shape.getModel() != null) {
      children.add(shape.getModel());
    }
    return children;
  }

  /**
   * This method initializes and starts the {@link ORMDirectEditManager} for direct editing the type
   * name.
   */
  private void performDirectEditing() {
    Label label = ((ORMShapeFigure) getFigure()).getLabel();
    ORMDirectEditManager manager =
        new ORMDirectEditManager(this, TextCellEditor.class, new ORMCellEditorLocator(label), label);
    manager.show(); // refresh view
  }

  /** {@inheritDoc} */
  @Override
  public List<Relation> getModelSourceConnections() {
    if (!(getParent() instanceof ScalableRootEditPart)) {
      Shape model = (Shape) getModel();
      return model.getOutgoingRelations();
    }
    return new ArrayList<Relation>();
  }

  /** {@inheritDoc} */
  @Override
  public List<Relation> getModelTargetConnections() {
    if (!(getParent() instanceof ScalableRootEditPart)) {
      Shape model = (Shape) getModel();
      return model.getIncomingRelations();
    }
    return new ArrayList<Relation>();
  }

  /** {@inheritDoc} */
  @Override
  public ConnectionAnchor getSourceConnectionAnchor(ConnectionEditPart connection) {
    return ((ORMShapeFigure) getFigure()).getConnectionAnchor();
  }

  /** {@inheritDoc} */
  @Override
  public ConnectionAnchor getTargetConnectionAnchor(ConnectionEditPart connection) {
    return ((ORMShapeFigure) getFigure()).getConnectionAnchor();
  }

  /** {@inheritDoc} */
  @Override
  public ConnectionAnchor getSourceConnectionAnchor(Request request) {
    return ((ORMShapeFigure) getFigure()).getConnectionAnchor();
  }

  /** {@inheritDoc} */
  @Override
  public ConnectionAnchor getTargetConnectionAnchor(Request request) {
    return ((ORMShapeFigure) getFigure()).getConnectionAnchor();
  }

  /**
   * {@inheritDoc} The refreshVisuals of this {@link EditPart}(all shape editparts) updates the
   * text(shorten shape name), the boundaries and the tooltip(complete shape name) of the
   * {@link Shape} figure.
   * */
  @Override
  public void refreshVisuals() {
    final ORMShapeFigure figure = (ORMShapeFigure) getFigure();
    final Shape model = (Shape) getModel();
    final GraphicalEditPart parent = (GraphicalEditPart) getParent();

    figure.getLabel().setText(model.getName());
    figure.getLabel().setToolTip(new Label(model.getName()));
    parent.setLayoutConstraint(this, figure, getConstraints());
  }

  /** {@inheritDoc} */
  @Override
  public void setLayoutConstraint(EditPart child, IFigure childFigure, Object constraint) {
    if (constraint != null) {
      childFigure.getParent().setConstraint(childFigure, constraint);
    }
  }

  /** {@inheritDoc} */
  @Override
  public void activate() {
    if (!isActive()) {
      ((Shape) getModel()).eAdapters().add(adapter);
    }
    super.activate();
  }

  /** {@inheritDoc} */
  @Override
  public void deactivate() {
    if (isActive()) {
      ((Shape) getModel()).eAdapters().remove(adapter);
    }

    super.deactivate();
  }

  /**
   * {@inheritDoc} In this {@link EditPart} this method add adapter types for creating a
   * {@link SnapToHelper} when the editor is in snapping mode (either to grid or to shapes).
   */
  @Override
  public Object getAdapter(final Class key) {
    if (key == SnapToHelper.class) {
      List<SnapToHelper> helpers = new ArrayList<SnapToHelper>();
      if (Boolean.TRUE.equals(getViewer().getProperty(SnapToGeometry.PROPERTY_SNAP_ENABLED))) {
        helpers.add(new SnapToGeometry(this));
      }
      if (Boolean.TRUE.equals(getViewer().getProperty(SnapToGrid.PROPERTY_GRID_ENABLED))) {
        helpers.add(new SnapToGrid(this));
      }
      if (helpers.size() == 0) {
        return null;
      } else {
        return new CompoundSnapToHelper(helpers.toArray(new SnapToHelper[0]));
      }
    }
    return super.getAdapter(key);
  }

  /**
   * The {@link Adapter} of this {@link EditPart}. An adapter is a receiver of notifications and is
   * typically associated with a Notifier via an AdapterFactory. This {@link Adapter} calls the
   * refreshVisuals(), refreshChildren(), refreshSourceConnections() and refreshTargetConnections()
   * method when it gets a change notification. RefreshSourceConnections() and
   * refreshTargetConnections() are only called when the user didn't stepped in the {@link Shape}
   * also when the shape isn't from type compartmenttype or group or is a shape from type
   * compartment or group, where the user didn't step into. When a {@link Shape} is created as child
   * of a {@link Model} or the name of a shape in a model is changed than the role/ compartment list
   * of the parent(compartenttype/group) must be updated for that reason the refreshVisuals() of the
   * parent of the model is called on a change notification.
   * 
   * */
  public class ORMShapeAdapter implements Adapter {

    /** {@inheritDoc} */
    @Override
    public void notifyChanged(final Notification notification) {

      refreshChildren();
      refreshVisuals();

      Shape shape = (Shape) getModel();
      if (shape.getContainer() != null) {
        Shape parent = shape.getContainer().getParent();
        if (parent != null) {
          // for synchronsation with role list of the Shape from type compartmenttype in above layer
          // of the tree
          if (parent.getType().equals(Type.COMPARTMENT_TYPE)) {
            ((ORMCompartmentEditPart) getParent().getParent()).refreshVisuals();
          }

          // for synchronsation with compartment list of the Group in above layer of the tree
          if (parent.getType().equals(Type.GROUP)) {
            ((ORMGroupingEditPart) getParent().getParent()).refreshVisuals();
          }
        }
      }
      if (!(getParent() instanceof ScalableRootEditPart)) {
        refreshSourceConnections();
        refreshTargetConnections();
      }
    }

    /** {@inheritDoc} */
    @Override
    public Notifier getTarget() {
      return (Shape) getModel();
    }

    /** {@inheritDoc} */
    @Override
    public void setTarget(final Notifier newTarget) {
      // Do nothing.
    }

    /** {@inheritDoc} */
    @Override
    public boolean isAdapterForType(final Object shape) {
      return shape.equals(Shape.class);
    }
  }

  /**
   * A getter for the boundaries of this {@link Shape}.
   * 
   * @return shape boundaries
   * */
  public Rectangle getConstraints() {
    Shape model = (Shape) getModel();
    org.framed.orm.geometry.Rectangle boundries = model.getBoundaries();

    Point topLeft = new Point(boundries.getTopLeft().getX(), boundries.getTopLeft().getX());
    Point bottomRight =
        new Point(boundries.getBottomRight().getX(), boundries.getBottomRight().getY());

    return new org.eclipse.draw2d.geometry.Rectangle(topLeft, bottomRight);
  }
}
