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
import org.framed.orm.model.Model;
import org.framed.orm.model.ModelElement;
import org.framed.orm.model.Relation;
import org.framed.orm.model.Shape;
import org.framed.orm.model.Type;
import org.framed.orm.ui.editPolicy.EditPolicyHandler;
import org.framed.orm.ui.editPolicy.ORMContainerEditPolicy;
import org.framed.orm.ui.editPolicy.ORMModelXYLayoutPolicy;
import org.framed.orm.ui.figure.ORMFigureFactory;
import org.framed.orm.ui.figure.shapes.ORMCompartmentV2Figure;
import org.framed.orm.ui.figure.shapes.ORMRootModelFigure;
import org.framed.orm.ui.figure.shapes.ORMShapeFigure;

/**
 * This {@link EditPart} is the controller for the model element {@link Model}.
 *
 * @author Kay Bierzynski
 * @param <IEditorPart>
 * */
public class ORMModelEditPart<IEditorPart> extends AbstractGraphicalEditPart {

	/**
	 *  EditPilicyHandler for command-creation. Pass through from Editor to command.
	 */
	private EditPolicyHandler ep;

  /**
   * The {@link Adapter} of this controller, which recieves the notifications from the viewer/user.
   * This {@link EditPart} reacts on the notifications
   */
  private final ORMModelAdapter adapter;

  /**
   * Constructor of this class. In which the class is initialized through calling the constructor of
   * it's parent and initializing it's {@link Adapter}.
   */
  public ORMModelEditPart(EditPolicyHandler editPolicyHandler) {
    super();
    adapter = new ORMModelAdapter();
	this.ep = editPolicyHandler;
  }


  /**
   * {@inheritDoc} {@link Model}s have as a figure a {@link ORMRootModelFigure}. The border of the
   * figure is differs depending on if the parent is a {@link Shape} from type Group or a
   * {@link Shape} from type comaprtemnt and on the expandstate of the parent figure.
   */
  @Override
  protected IFigure createFigure() {
    final GraphicalEditPart parent = (GraphicalEditPart) getParent();
    Figure fig = ORMFigureFactory.createFigure(this);

    setFigureBorder(parent, fig);

    return fig;
  }

  /**
   * {@inheritDoc} The Model shouldn't be selectable, because for that reason we need to override
   * the isSelectable function.
   */
  @Override
  public boolean isSelectable() {
    return false;
  }

  /** {@inheritDoc} */
  @Override
  public IFigure getContentPane() {
    return getFigure();
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
  protected void createEditPolicies() {
    // edit policy, which handles the creation of the children of the compartment diagram and the
    // adding of the children to the compartment diagram

    installEditPolicy(EditPolicy.LAYOUT_ROLE, new ORMModelXYLayoutPolicy(this.ep));
    installEditPolicy(EditPolicy.CONTAINER_ROLE, new ORMContainerEditPolicy(this.ep));
    installEditPolicy("Snap Feedback", new SnapFeedbackPolicy());
  }

  /** {@inheritDoc} */
  @Override
  protected List getModelChildren() {
    List contexts = new ArrayList();
    Model cd = (Model) getModel();
    // all children of compartmentdiagram are model elments
    // only relations and the connection anchor shape(for now only the relationship_shape_child) are
    // handled
    // in other ways and because of that are not added as a model children
    for (ModelElement ele : cd.getElements()) {
      if (!(ele instanceof Relation)) {
        if (!ele.getType().equals(Type.RELATIONSHIP_SHAPE_CHILD)) {
          contexts.add(ele);
        }
      }
    }
    return contexts;
  }

  /**
   * {@inheritDoc} The refreshVisuals of this {@link EditPart} updates the borders of the
   * {@link ORMRootModelFigure} depending on the expandstate of it's parents figure.
   * */
  @Override
  public void refreshVisuals() {
    final Figure figure = (Figure) getFigure();
    final GraphicalEditPart parent = (GraphicalEditPart) getParent();

    setFigureBorder(parent, figure);
  }

  /**
   * A setter, which sets the border of the {@link ORMRootModelFigure} depending on it's parent and
   * the expandstate of the parent figure.
   * */
  private void setFigureBorder(GraphicalEditPart parent, Figure fig) {
    if (getParent().getModel() instanceof Shape) {
      ORMShapeFigure parentFigure = (ORMShapeFigure) parent.getFigure();
      if (parentFigure instanceof ORMCompartmentV2Figure && parentFigure.isExpanded()) {

        fig.setBorder(new PartFigureBorderExpand());
      } else {
        fig.setBorder(new PartFigureBorderNotExpand());
      }
    }
  }


  /** {@inheritDoc} */
  @Override
  public void activate() {
    if (!isActive()) {
      ((Model) getModel()).eAdapters().add(adapter);
    }
    super.activate();
  }

  /** {@inheritDoc} */
  @Override
  public void deactivate() {
    if (isActive()) {
      ((Model) getModel()).eAdapters().remove(adapter);
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
   * refreshChildren() method when it gets a change notification.
   *
   * */
  public class ORMModelAdapter implements Adapter {

    /** {@inheritDoc} */
    @Override
    public void notifyChanged(final Notification notification) {
      refreshChildren();
    }

    /** {@inheritDoc} */
    @Override
    public Notifier getTarget() {
      return (Model) getModel();
    }

    /** {@inheritDoc} */
    @Override
    public void setTarget(final Notifier newTarget) {
      // Do nothing.
    }

    /** {@inheritDoc} */
    @Override
    public boolean isAdapterForType(final Object type) {
      return type.getClass().equals(Model.class);
    }
  }
}
