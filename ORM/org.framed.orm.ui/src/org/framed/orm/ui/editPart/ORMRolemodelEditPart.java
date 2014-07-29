package org.framed.orm.ui.editPart;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.draw2d.AbstractBorder;
import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Insets;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.gef.CompoundSnapToHelper;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gef.SnapToGeometry;
import org.eclipse.gef.SnapToGrid;
import org.eclipse.gef.SnapToHelper;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;
import org.eclipse.gef.editpolicies.SnapFeedbackPolicy;
import org.framed.orm.model.Compartment;
import org.framed.orm.model.Grouping;
import org.framed.orm.model.Rolemodel;
import org.framed.orm.model.Type;
import org.framed.orm.ui.editPart.types.ORMCompartmentEditPart;
import org.framed.orm.ui.editPolicy.ORMContainerEditPolicy;
import org.framed.orm.ui.editPolicy.ORMRolemodelXYLayoutPolicy;
import org.framed.orm.ui.figure.ORMCompartmentV2Figure;
import org.framed.orm.ui.figure.ORMRolemodelFigure;

/**
 * This {@link EditPart} is the controller for the model element {@link Rolemodel}.
 * 
 * @author Kay Bierzynski
 * */
public class ORMRolemodelEditPart extends AbstractGraphicalEditPart {

  /**
   * The {@link Adapter} of this controller, which recieves the notifications from the viewer/user.
   * This {@link EditPart} reacts on the notifications
   */
  private final ORMRolemodelAdapter adapter;

  /**
   * Constructor of this class. In which the class is initialized through calling the constructor of
   * it's parent and initializing it's {@link Adapter}.
   */
  public ORMRolemodelEditPart() {
    super();
    adapter = new ORMRolemodelAdapter();

  }

  /**
   * {@inheritDoc} The Rolemodel shouldn't be selectable, because for that reason we need to
   * override the isSelectable function.
   */
  @Override
  public boolean isSelectable() {
    return false;
  }

  /**
   * {@inheritDoc} {@link Rolemodel}s have as a figure a {@link ORMRolemodelFigure}. The border of
   * the figure is differs dependingon if the parent is a {@link Grouping} or a {@link Compartment}
   * and on the expandstate of {@link Compartment} if the role model has as a parent a
   * {@link Compartment}.
   */
  @Override
  protected IFigure createFigure() {
    final GraphicalEditPart parent = (GraphicalEditPart) getParent();


    ORMRolemodelFigure figure = new ORMRolemodelFigure();
    if (parent.getModel() instanceof Compartment) {
      final Type model = (Type) parent.getModel();
      // change border of the figure depending on expandStateChange of the parent compartment
      if (((ORMCompartmentEditPart) getParent()).getFigure() instanceof ORMCompartmentV2Figure) {
        if (model.isIsExpand()) {
          figure.setBorder(new PartFigureBorderExpand());
        }
        if (!(model.isIsExpand())) {
          figure.setBorder(new PartFigureBorderNotExpand());
        }
      }
    }
    // set border of th figure,when the parent is a grouping
    else {
      figure.setBorder(new PartFigureBorderNotExpand());
    }
    return figure;
  }

  /** {@inheritDoc} */
  @Override
  public IFigure getContentPane() {
    return getFigure();
  }

  /** {@inheritDoc} */
  @Override
  protected void createEditPolicies() {
    // edit policy, which handles the creation of the children of the role model and the
    // adding of the children to the rolemodel
    installEditPolicy(EditPolicy.LAYOUT_ROLE, new ORMRolemodelXYLayoutPolicy());
    installEditPolicy(EditPolicy.CONTAINER_ROLE, new ORMContainerEditPolicy());
    installEditPolicy("Snap Feedback", new SnapFeedbackPolicy());
  }

  /** {@inheritDoc} */
  @Override
  protected List getModelChildren() {
    List children = new ArrayList();
    Rolemodel rm = (Rolemodel) getModel();
    children.addAll(rm.getNodes());

    return children;
  }

  /**
   * {@inheritDoc} The refreshVisuals of this {@link EditPart} updates the borders of the
   * {@link ORMRolemodelFigure} depended on the the expandstate of {@link Compartment} is the role
   * model has as a parent a {@link Compartment}.
   * */
  @Override
  public void refreshVisuals() {
    final Figure figure = (Figure) getFigure();
    final GraphicalEditPart parent = (GraphicalEditPart) getParent();
    if (parent.getModel() instanceof Compartment) {
      final Type model = (Type) parent.getModel();

      if (((ORMCompartmentEditPart) getParent()).getFigure() instanceof ORMCompartmentV2Figure) {
        if (model.isIsExpand()) {
          figure.setBorder(new PartFigureBorderExpand());
        }
        if (!(model.isIsExpand())) {
          figure.setBorder(new PartFigureBorderNotExpand());
        }
      }
    }
  }

  /**
   * A border class where a border is drawn at top side of the figure and on the left side of the
   * figure.
   * */
  public class PartFigureBorderExpand extends AbstractBorder {

    /** {@inheritDoc} */
    @Override
    public Insets getInsets(IFigure figure) {
      return new Insets(1, 0, 0, 0);
    }

    /** {@inheritDoc} */
    @Override
    public void paint(IFigure figure, Graphics graphics, Insets insets) {
      // draw border at the top side of the figure
      graphics.drawLine(getPaintRectangle(figure, insets).getTopLeft(), tempRect.getTopRight());
      // draw border at the left side of the figure
      graphics.drawLine(getPaintRectangle(figure, insets).getTopLeft(), tempRect.getBottomLeft());
    }
  }

  /**
   * A border class where a border is drawn at top side of the figure.
   * */
  public class PartFigureBorderNotExpand extends AbstractBorder {

    /** {@inheritDoc} */
    @Override
    public Insets getInsets(IFigure figure) {
      return new Insets(1, 0, 0, 0);
    }

    /** {@inheritDoc} */
    @Override
    public void paint(IFigure figure, Graphics graphics, Insets insets) {
      // draw border at the top side of the figure
      graphics.drawLine(getPaintRectangle(figure, insets).getTopLeft(), tempRect.getTopRight());
    }
  }

  /** {@inheritDoc} */
  @Override
  public void activate() {
    if (!isActive()) {
      ((Rolemodel) getModel()).eAdapters().add(adapter);
    }
    super.activate();
  }

  /** {@inheritDoc} */
  @Override
  public void deactivate() {
    if (isActive()) {
      ((Rolemodel) getModel()).eAdapters().remove(adapter);
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
   * refreshVisuals() and the refreshChildren() method when it gets a change notification.
   * 
   * */
  public class ORMRolemodelAdapter implements Adapter {

    /** {@inheritDoc} */
    @Override
    public void notifyChanged(Notification notification) {
      refreshChildren();
      refreshVisuals();

    }

    /** {@inheritDoc} */
    @Override
    public Notifier getTarget() {
      return (Rolemodel) getModel();
    }

    /** {@inheritDoc} */
    @Override
    public void setTarget(Notifier newTarget) {
      // Do nothing.
    }

    /** {@inheritDoc} */
    @Override
    public boolean isAdapterForType(Object type) {
      return type.getClass().equals(Rolemodel.class);
    }
  }
}
