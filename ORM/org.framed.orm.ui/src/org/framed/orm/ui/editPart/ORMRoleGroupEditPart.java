package org.framed.orm.ui.editPart;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.draw2d.ConnectionAnchor;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Label;
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
import org.eclipse.gef.editpolicies.SnapFeedbackPolicy;
import org.eclipse.jface.viewers.TextCellEditor;
import org.framed.orm.model.Relation;
import org.framed.orm.model.RoleGroup;
import org.framed.orm.model.RoleType;
import org.framed.orm.ui.editPart.types.ORMCompartmentEditPart;
import org.framed.orm.ui.editPart.types.ORMRoleTypeEditPart;
import org.framed.orm.ui.editPolicy.ORMContainerEditPolicy;
import org.framed.orm.ui.editPolicy.ORMNodeDirectEditPolicy;
import org.framed.orm.ui.editPolicy.ORMNodeGraphicalNodeEditPolicy;
import org.framed.orm.ui.editPolicy.ORMRoleGroupComponentEditPolicy;
import org.framed.orm.ui.editPolicy.ORMRoleGroupXYLayoutEditPolicy;
import org.framed.orm.ui.editor.ORMCellEditorLocator;
import org.framed.orm.ui.editor.ORMDirectEditManager;
import org.framed.orm.ui.figure.ORMRoleGroupFigure;

/**
 * This {@link EditPart} is the controller for the model element {@link RoleGroup}.
 * 
 * @author Kay Bierzynski
 * */
public class ORMRoleGroupEditPart extends AbstractGraphicalEditPart implements NodeEditPart {

  /**
   * The {@link Adapter} of this controller, which recieves the notifications from the viewer/user.
   * This {@link EditPart} reacts on the notifications
   */
  private final ORMRoleGroupAdapter adapter;

  /**
   * Constructor of this class. In which the class is initialized through calling the constructor of
   * it's parent and initializing it's {@link Adapter}.
   */
  public ORMRoleGroupEditPart() {
    super();
    adapter = new ORMRoleGroupAdapter();

  }

  /** {@inheritDoc} {@link RoleGroup}s have as a figure a {@link ORMRoleGroupFigure}. */
  @Override
  protected IFigure createFigure() {
    return new ORMRoleGroupFigure();
  }

  /** {@inheritDoc} */
  @Override
  protected void createEditPolicies() {
    // edit policy for handling requests of editing the rolegroup name
    installEditPolicy(EditPolicy.DIRECT_EDIT_ROLE, new ORMNodeDirectEditPolicy());
    // edit policy, which handles the creation of the children of role group and the
    // adding of the children to the rolegroup
    installEditPolicy(EditPolicy.LAYOUT_ROLE, new ORMRoleGroupXYLayoutEditPolicy());
    // edit policy, which handels requests for deleting the {@link RoleGroup}, which is controlled
    // through this edit part
    installEditPolicy(EditPolicy.COMPONENT_ROLE, new ORMRoleGroupComponentEditPolicy());
    // edit policy, which handel for the creation and deletion of connection that start from this
    // rolegroup or end at this rolegrpup
    installEditPolicy(EditPolicy.GRAPHICAL_NODE_ROLE, new ORMNodeGraphicalNodeEditPolicy());
    installEditPolicy(EditPolicy.CONTAINER_ROLE, new ORMContainerEditPolicy());
    installEditPolicy("Snap Feedback", new SnapFeedbackPolicy());
  }


  /** {@inheritDoc} */
  @Override
  public void performRequest(final Request req) {

    if (req.getType() == RequestConstants.REQ_DIRECT_EDIT) {
      performDirectEditing();
    }
  }

  /**
   * This method initializes and starts the {@link ORMDirectEditManager} for direct editing the
   * method name.
   */
  private void performDirectEditing() {
    Label label = ((ORMRoleGroupFigure) getFigure()).getLabel();
    ORMDirectEditManager manager =
        new ORMDirectEditManager(this, TextCellEditor.class,
            new ORMCellEditorLocator(label), label);
    manager.show(); // refresh view
  }

  /**
   * {@inheritDoc} In case of this {@link EditPart} that would be the figure of {@link RoleType}s
   * and {@link RoleGroup}s.
   * */
  @Override
  protected void addChildVisual(final EditPart childEditPart, final int index) {
    IFigure contentPane = ((ORMRoleGroupFigure) getFigure()).getBasicRec();
    if (childEditPart instanceof ORMRoleTypeEditPart)
      contentPane.add(((ORMRoleTypeEditPart) childEditPart).getFigure());
    if (childEditPart instanceof ORMRoleGroupEditPart)
      contentPane.add(((ORMRoleGroupEditPart) childEditPart).getFigure());
  }

  /**
   * {@inheritDoc} In case of this {@link EditPart} that would be the figure of {@link RoleType}s
   * and {@link RoleGroup}s.
   * */
  @Override
  protected void removeChildVisual(final EditPart childEditPart) {
    IFigure contentPane = ((ORMRoleGroupFigure) getFigure()).getBasicRec();
    if (childEditPart instanceof ORMRoleTypeEditPart)
      contentPane.remove(((ORMRoleTypeEditPart) childEditPart).getFigure());
    if (childEditPart instanceof ORMRoleGroupEditPart)
      contentPane.remove(((ORMRoleGroupEditPart) childEditPart).getFigure());

  }

  /** {@inheritDoc} */
  @Override
  protected List<Relation> getModelSourceConnections() {
    RoleGroup model = (RoleGroup) getModel();
    return model.getOutgoingLinks();
  }

  /** {@inheritDoc} */
  @Override
  protected List<Relation> getModelTargetConnections() {
    RoleGroup model = (RoleGroup) getModel();
    return model.getIncomingLinks();
  }

  /** {@inheritDoc} */
  @Override
  protected List getModelChildren() {
    List children = new ArrayList();

    RoleGroup roleGroup = (RoleGroup) getModel();
    children.addAll(roleGroup.getNodes());

    return children;
  }

  /**
   * {@inheritDoc} The refreshVisuals of this {@link EditPart} updates the text(shorten rolegroup
   * name), the boundaries(constraints) and the tooltip(complete rolegroup name) of the rolegroup
   * figure, which is {@link ORMRoleGroupFigure}.
   * */
  @Override
  protected void refreshVisuals() {
    final ORMRoleGroupFigure figure = (ORMRoleGroupFigure) getFigure();
    final RoleGroup model = (RoleGroup) getModel();
    final GraphicalEditPart parent = (GraphicalEditPart) getParent();


    figure.getLabel().setText(model.getName());
    figure.getLabel().setToolTip(new Label(model.getName()));
    parent.setLayoutConstraint(this, figure, model.getConstraints());
  }

  /** {@inheritDoc} */
  @Override
  public ConnectionAnchor getSourceConnectionAnchor(final ConnectionEditPart connection) {
    return ((ORMRoleGroupFigure) getFigure()).getConnectionAnchor();
  }

  /** {@inheritDoc} */
  @Override
  public ConnectionAnchor getTargetConnectionAnchor(final ConnectionEditPart connection) {
    return ((ORMRoleGroupFigure) getFigure()).getConnectionAnchor();
  }

  /** {@inheritDoc} */
  @Override
  public ConnectionAnchor getSourceConnectionAnchor(final Request request) {
    return ((ORMRoleGroupFigure) getFigure()).getConnectionAnchor();
  }

  /** {@inheritDoc} */
  @Override
  public ConnectionAnchor getTargetConnectionAnchor(final Request request) {
    return ((ORMRoleGroupFigure) getFigure()).getConnectionAnchor();
  }

  /** {@inheritDoc} */
  @Override
  public void activate() {
    if (!isActive()) {
      ((RoleGroup) getModel()).eAdapters().add(adapter);
    }
    super.activate();
  }

  /** {@inheritDoc} */
  @Override
  public void deactivate() {
    if (isActive()) {
      ((RoleGroup) getModel()).eAdapters().remove(adapter);
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
   * refreshVisuals(), refreshChildren(), refreshSourceConnections(), refreshTargetConnections() and
   * the refreshVisuals() of the parent {@link Compartment} of it's parent {@link Rolemodel} when it
   * gets a change notification.
   */
  public class ORMRoleGroupAdapter implements Adapter {

    /** {@inheritDoc} */
    @Override
    public void notifyChanged(final Notification notification) {
      refreshChildren();
      refreshVisuals();
      // for synchronsation with role list of the parent Compartement in above layer of the tree
      if (getParent().getParent() instanceof ORMCompartmentEditPart) {
        ((ORMCompartmentEditPart) getParent().getParent()).refreshVisuals();
      }
      refreshSourceConnections();
      refreshTargetConnections();
    }

    /** {@inheritDoc} */
    @Override
    public Notifier getTarget() {
      return (RoleGroup) getModel();
    }

    /** {@inheritDoc} */
    @Override
    public void setTarget(final Notifier newTarget) {
      // Do nothing.
    }
    
    /** {@inheritDoc} */
    @Override
    public boolean isAdapterForType(final Object type) {
      return type.getClass().equals(RoleGroup.class);
    }
  }
}
