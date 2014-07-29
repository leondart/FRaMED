package org.framed.orm.ui.editPart;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.draw2d.BorderLayout;
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
import org.eclipse.gef.editparts.ScalableRootEditPart;
import org.eclipse.gef.editpolicies.SnapFeedbackPolicy;
import org.eclipse.jface.viewers.TextCellEditor;
import org.framed.orm.model.Compartment;
import org.framed.orm.model.CompartmentDiagram;
import org.framed.orm.model.Grouping;
import org.framed.orm.model.Node;
import org.framed.orm.model.Relation;
import org.framed.orm.model.Rolemodel;
import org.framed.orm.ui.editPolicy.ORMNodeDirectEditPolicy;
import org.framed.orm.ui.editPolicy.ORMNodeGraphicalNodeEditPolicy;
import org.framed.orm.ui.editPolicy.ORMTypeComponentEditPolicy;
import org.framed.orm.ui.editor.ORMNodeCellEditorLocator;
import org.framed.orm.ui.editor.ORMNodeDirectEditManager;
import org.framed.orm.ui.figure.ORMGroupingV1Figure;
import org.framed.orm.ui.figure.ORMGroupingV2Figure;
import org.framed.orm.ui.figure.PartFigure;


/**
 * This {@link EditPart} is the controller for the model element {@link Grouping}.
 * 
 * @author Kay Bierzynski
 * */
public class ORMGroupingEditPart extends AbstractGraphicalEditPart implements NodeEditPart {

  /**
   * A {@link PartFigure} in which all {@link Compartment}s and {@link Grouping}s that the
   * {@link Grouping}s {@link Rolemodel} contains are listed. A global variable is helpful, because
   * this {@link PartFigure} is used in the methods refreshVisual() and addChildVisual().
   */
  private PartFigure compartmentPart;
  /**
   * The {@link Adapter} of this controller, which recieves the notifications from the viewer/user.
   * This {@link EditPart} reacts on the notifications
   */
  private final ORMGroupingAdapter adapter;

  /**
   * Constructor of this class. In which the class is initialized through calling the constructor of
   * it's parent, initializing it's {@link Adapter} and setting compartmentPart on null.
   */
  public ORMGroupingEditPart() {
    super();
    adapter = new ORMGroupingAdapter();
    compartmentPart = null;
  }

  /**
   * {@inheritDoc} A {@link Grouping} has as a figure a {@link ORMGroupingV1Figure}, when the user
   * didn't step in it, and a {@link ORMGroupingV2Figure}, when the user didn't step in it.
   */
  @Override
  protected IFigure createFigure() {
    // when this compartment editpart is not "opened"(steped in) use as figure ORMGroupingV1Figure
    if (getParent().getModel() instanceof Rolemodel
        || getParent().getModel() instanceof CompartmentDiagram) {
      ORMGroupingV1Figure figure1 = new ORMGroupingV1Figure((Node) getModel());
      return figure1;
    }
    // when this edit part is "opened"(steped in) use ORMGroupingV2Figure
    else {
      return new ORMGroupingV2Figure();
    }
  }

  /** {@inheritDoc} */
  @Override
  public void createEditPolicies() {
    // edit policy for handling requests of editing the grouping name
    installEditPolicy(EditPolicy.DIRECT_EDIT_ROLE, new ORMNodeDirectEditPolicy());
    // edit policy, which handels requests for deleting the grouping, which is controlled
    // through this edit part
    installEditPolicy(EditPolicy.COMPONENT_ROLE, new ORMTypeComponentEditPolicy(this));
    installEditPolicy("Snap Feedback", new SnapFeedbackPolicy());
    // when the user has steped in the grouping than the should be unselctable for connection
    // creation, therefore the ORMNodeGraphicalNodeEditPolicy is only installed for groupings, where
    // the user didn't step in
    if (!(getParent() instanceof ScalableRootEditPart)) {
      // edit policy, which handel for the creation and deletion of connection that start from this
      // grouping or end at this grouping
      installEditPolicy(EditPolicy.GRAPHICAL_NODE_ROLE, new ORMNodeGraphicalNodeEditPolicy());
    }

  }

  /** {@inheritDoc} */
  @Override
  public void performRequest(final Request req) {

    if (req.getType() == RequestConstants.REQ_DIRECT_EDIT) {
      performDirectEditing();
    }
  }

  /** {@inheritDoc} */
  @Override
  protected List getModelChildren() {
    List children = new ArrayList();
    Grouping type = (Grouping) getModel();
    // the only children a grouping has it is role model
    children.add(type.getRolemodel());

    return children;
  }


  /**
   * This method initializes and starts the {@link ORMNodeDirectEditManager} for direct editing the
   * grouping name.
   */
  private void performDirectEditing() {
    Label label;
    if (getFigure() instanceof ORMGroupingV1Figure) {
      label = ((ORMGroupingV1Figure) getFigure()).getLabel();
    } else {
      label = ((ORMGroupingV2Figure) getFigure()).getLabel();
    }
    ORMNodeDirectEditManager manager =
        new ORMNodeDirectEditManager(this, TextCellEditor.class,
            new ORMNodeCellEditorLocator(label), label);
    manager.show(); // refresh view
  }

  /** {@inheritDoc} */
  @Override
  public List<Relation> getModelSourceConnections() {
    if (!(getParent() instanceof ScalableRootEditPart)) {
      Grouping model = (Grouping) getModel();
      return model.getOutgoingLinks();
    }
    return new ArrayList<Relation>();
  }

  /** {@inheritDoc} */
  @Override
  public List<Relation> getModelTargetConnections() {
    if (!(getParent() instanceof ScalableRootEditPart)) {
      Grouping model = (Grouping) getModel();
      return model.getIncomingLinks();
    }
    return new ArrayList<Relation>();
  }

  /** {@inheritDoc} */
  @Override
  public ConnectionAnchor getSourceConnectionAnchor(final ConnectionEditPart connection) {
    if (getFigure() instanceof ORMGroupingV1Figure) {
      return ((ORMGroupingV1Figure) getFigure()).getConnectionAnchor();
    } else {
      return ((ORMGroupingV2Figure) getFigure()).getConnectionAnchor();
    }
  }

  /** {@inheritDoc} */
  @Override
  public ConnectionAnchor getTargetConnectionAnchor(final ConnectionEditPart connection) {
    if (getFigure() instanceof ORMGroupingV1Figure) {
      return ((ORMGroupingV1Figure) getFigure()).getConnectionAnchor();
    } else {
      return ((ORMGroupingV2Figure) getFigure()).getConnectionAnchor();
    }
  }

  /** {@inheritDoc} */
  @Override
  public ConnectionAnchor getSourceConnectionAnchor(final Request request) {
    if (getFigure() instanceof ORMGroupingV1Figure) {
      return ((ORMGroupingV1Figure) getFigure()).getConnectionAnchor();
    } else {
      return ((ORMGroupingV2Figure) getFigure()).getConnectionAnchor();
    }
  }

  /** {@inheritDoc} */
  @Override
  public ConnectionAnchor getTargetConnectionAnchor(final Request request) {
    if (getFigure() instanceof ORMGroupingV1Figure) {
      return ((ORMGroupingV1Figure) getFigure()).getConnectionAnchor();
    } else {
      return ((ORMGroupingV2Figure) getFigure()).getConnectionAnchor();
    }
  }

  /**
   * {@inheritDoc} The refreshVisuals of this {@link EditPart} updates the text(shorten grouping
   * name), the boundaries(constraints and the tooltip(complete grouping name) of the grouping
   * figure, which can be a {@link ORMGroupingV1Figure} or a {@link ORMGroupingV2Figure}. After that
   * the names of all {@link Grouping}s and {@link Compartment}s in the child {@link Rolemodel} are
   * added to the compartmentPart.
   * 
   */
  @Override
  public void refreshVisuals() {
    if (figure instanceof ORMGroupingV1Figure) {
      final ORMGroupingV1Figure figure = (ORMGroupingV1Figure) getFigure();
      final Grouping model = (Grouping) getModel();
      final GraphicalEditPart parent = (GraphicalEditPart) getParent();

      figure.getLabel().setText(model.getName());
      figure.getLabel().setToolTip(new Label(model.getName()));
      parent.setLayoutConstraint(this, figure, model.getConstraints());
    } else {
      final ORMGroupingV2Figure figure = (ORMGroupingV2Figure) getFigure();
      final Grouping model = (Grouping) getModel();
      final GraphicalEditPart parent = (GraphicalEditPart) getParent();

      figure.getLabel().setText(model.getName());
      figure.getLabel().setToolTip(new Label(model.getName()));
      parent.setLayoutConstraint(this, figure, model.getConstraints());
    }

    if (compartmentPart != null) {
      compartmentPart.removeAll();
      final Rolemodel rm = ((Grouping) getModel()).getRolemodel();

      addNamesToCompartmentPart(rm);

    }
  }

  /**
   * {@inheritDoc} In case of this {@link EditPart} that would be the figure of a {@link Rolemodel}.
   * If the figure of the {@link Rolemodel} or the compartmentPart is added to this {@link Grouping}
   * depends on which version of grouping figure is used also id the user has steped in the grouping
   * or not.
   */
  @Override
  protected void addChildVisual(final EditPart childEditPart, final int index) {
    IFigure contentPane = null;

    if (childEditPart.getModel() instanceof Rolemodel) {
      // when figure is Version 2
      if (getParent() instanceof ScalableRootEditPart) {
        contentPane = ((ORMGroupingV2Figure) getFigure()).getBasicRec();
        contentPane.add(((ORMRolemodelEditPart) childEditPart).getFigure(), BorderLayout.CENTER);
      }
      // when figure is Version 1
      else {
        contentPane = ((ORMGroupingV1Figure) getFigure()).getBasicRec();
        final Rolemodel rm = (Rolemodel) ((ORMRolemodelEditPart) childEditPart).getModel();

        compartmentPart = new PartFigure();
        addNamesToCompartmentPart(rm);
        contentPane.add(compartmentPart);
      }
    }
  }

  /**
   * The first thing, which is done this is that a {@link Label} with the text Compartments is added
   * to the compartmentPart. After that all {@link Grouping} and {@link Compartment} names, which
   * are in the child {@link Rolemodel }this will change in later version of the model) of this
   * grouping, are added to the compartmentPart. When are more then three names in the
   * compartmentPart list a ... label is added in the tooltip of the ... label the names of the
   * remaining {@link Grouping}s and {@link Compartment}s are shown.
   * */
  private void addNamesToCompartmentPart(final Rolemodel rm) {
    Label lab = new Label();

    Label collectLabel = new Label();
    collectLabel.setText("....");
    PartFigure collectLabels = new PartFigure();

    int sizeList = 0;

    lab.setText("Compartments");
    compartmentPart.add(lab);
    List<Node> children = new ArrayList<Node>();
    children.addAll(rm.getSubcontexts());
    children.addAll(rm.getGroups());

    for (Node node : children) {
      Label label = new Label();
      Label label2 = new Label();
      label2.setText("For Editing please go in the Group.");
      sizeList = compartmentPart.getChildren().size();
      label.setText(node.getName());
      label.setToolTip(label2);
      if (sizeList <= 3) {
        compartmentPart.add(label);
      } else {
        collectLabels.add(label);
      }
    }

    if (sizeList > 3) {
      collectLabel.setToolTip(collectLabels);
      compartmentPart.add(collectLabel);
    }

  }

  /** {@inheritDoc} */
  @Override
  public void activate() {
    if (!isActive()) {
      ((Grouping) getModel()).eAdapters().add(adapter);
    }
    super.activate();
  }

  /** {@inheritDoc} */
  @Override
  public void deactivate() {
    if (isActive()) {
      ((Grouping) getModel()).eAdapters().remove(adapter);
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
   * method when it gets a change notification.
   * 
   * */
  public class ORMGroupingAdapter implements Adapter {

    /** {@inheritDoc} */
    @Override
    public void notifyChanged(final Notification notification) {
      refreshChildren();

      refreshVisuals();

      refreshSourceConnections();
      refreshTargetConnections();
    }

    /** {@inheritDoc} */
    @Override
    public Notifier getTarget() {
      return (Grouping) getModel();
    }

    /** {@inheritDoc} */
    @Override
    public void setTarget(final Notifier newTarget) {
      // Do nothing.
    }

    /** {@inheritDoc} */
    @Override
    public boolean isAdapterForType(final Object type) {
      return type.equals(Grouping.class);
    }
  }
}
