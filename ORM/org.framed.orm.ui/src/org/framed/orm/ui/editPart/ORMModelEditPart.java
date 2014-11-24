package org.framed.orm.ui.editPart;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.draw2d.ConnectionLayer;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.LineBorder;
import org.eclipse.draw2d.XYLayout;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.gef.CompoundSnapToHelper;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.SnapToGeometry;
import org.eclipse.gef.SnapToGrid;
import org.eclipse.gef.SnapToHelper;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;
import org.eclipse.gef.editpolicies.SnapFeedbackPolicy;
import org.eclipse.swt.SWT;
import org.framed.orm.model.Model;
import org.framed.orm.ui.editPolicy.ORMCompartmentDiagramXYLayoutPolicy;

/**
 * This {@link EditPart} is the controller for the model element {@link Model.
 * 
 * @author Kay Bierzynski
 * */
public class ORMModelEditPart extends AbstractGraphicalEditPart {

  /**
   * The {@link Adapter} of this controller, which recieves the notifications from the viewer/user.
   * This {@link EditPart} reacts on the notifications
   */
  private final ORMModelAdapter adapter;

  /**
   * Constructor of this class. In which the class is initialized through calling the constructor of
   * it's parent and initializing it's {@link Adapter}.
   */
  public ORMModelEditPart() {
    super();
    adapter = new ORMModelAdapter();
  }


  /** {@inheritDoc} */
  @Override
  protected IFigure createFigure() {
    ConnectionLayer layer = new ConnectionLayer();
    layer.setLayoutManager(new XYLayout());
    layer.setBorder(new LineBorder(1));
    layer.setAntialias(SWT.ON);
    return layer;
  }

  /**
   * {@inheritDoc} The Model shouldn't be selectable, because for that reason we need to
   * override the isSelectable function.
   */
  @Override
  public boolean isSelectable() {
    return false;
  }
  
  /** {@inheritDoc} */
  @Override
  protected void createEditPolicies() {
    // edit policy, which handles the creation of the children of the compartment diagram and the
    // adding of the children to the compartment diagram
    installEditPolicy(EditPolicy.LAYOUT_ROLE, new ORMCompartmentDiagramXYLayoutPolicy());
    installEditPolicy("Snap Feedback", new SnapFeedbackPolicy());
  }

  /** {@inheritDoc} */
  @Override
  protected List getModelChildren() {
    List contexts = new ArrayList();
    Model cd = (Model) getModel();
    // all children of compartmentdiagram are nodes
    contexts.addAll(cd.getElements());

    return contexts;
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
