package org.framed.orm.ui.editPart;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.draw2d.BorderLayout;
import org.eclipse.draw2d.ConnectionAnchor;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.text.TextFlow;
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
 * @author Kay Bierzynski
 * */
public class ORMGroupingEditPart extends AbstractGraphicalEditPart implements NodeEditPart {

  public IFigure fig;
  private PartFigure compartmentPart = null;
  private ORMGroupingAdapter adapter;

  public ORMGroupingEditPart() {
    super();
    adapter = new ORMGroupingAdapter();
  }

  @Override
  protected IFigure createFigure() {
    // TODO: testing if this work for all cases
    // when this compartment editpart is not "opened" use as figure ORMCompartmentV1Figure
    if (getParent().getModel() instanceof Rolemodel
        || getParent().getModel() instanceof CompartmentDiagram) {
      ORMGroupingV1Figure figure1 = new ORMGroupingV1Figure((Node) getModel());
      return figure1;
    }
    // when this edit part is "opened" use ORMCompartmentV2Figure
    else {
      return new ORMGroupingV2Figure();
    }
  }

  /*
   * GRAPHICAL_NODE_ROLE Policy must be installed here so that we can make the MainContext
   * unselectable for Conectioncreation
   */

  @Override
  public void createEditPolicies() {
    installEditPolicy(EditPolicy.DIRECT_EDIT_ROLE, new ORMNodeDirectEditPolicy());
    installEditPolicy(EditPolicy.COMPONENT_ROLE, new ORMTypeComponentEditPolicy(this));
    installEditPolicy("Snap Feedback", new SnapFeedbackPolicy());
    if (!(getParent() instanceof ScalableRootEditPart)) {
      installEditPolicy(EditPolicy.GRAPHICAL_NODE_ROLE, new ORMNodeGraphicalNodeEditPolicy());
    }

  }

  @Override
  public void performRequest(Request req) {

    if (req.getType() == RequestConstants.REQ_DIRECT_EDIT) {
      performDirectEditing();
    }
  }

  @Override
  protected List getModelChildren() {
    List children = new ArrayList();
    Grouping type = (Grouping) getModel();

    children.add(type.getRolemodel());

    return children;
  }


  private void performDirectEditing() {
    Label label;
    if (getFigure() instanceof ORMGroupingV1Figure) {
      label = ((ORMGroupingV1Figure) getFigure()).getLabel();
    } else {
      label = ((ORMGroupingV2Figure) getFigure()).getLabel();
    }
    ORMNodeDirectEditManager manager =
        new ORMNodeDirectEditManager(this, TextCellEditor.class, new ORMNodeCellEditorLocator(label), label);
    manager.show(); // refresh view
  }

  @Override
  public List<Relation> getModelSourceConnections() {
    if (!(getParent() instanceof ScalableRootEditPart)) {
      Grouping model = (Grouping) getModel();
      return model.getOutgoingLinks();
    }
    return new ArrayList<Relation>();
  }

  @Override
  public List<Relation> getModelTargetConnections() {
    if (!(getParent() instanceof ScalableRootEditPart)) {
      Grouping model = (Grouping) getModel();
      return model.getIncomingLinks();
    }
    return new ArrayList<Relation>();
  }

  @Override
  public ConnectionAnchor getSourceConnectionAnchor(ConnectionEditPart connection) {
    if (getFigure() instanceof ORMGroupingV1Figure) {
      return ((ORMGroupingV1Figure) getFigure()).getConnectionAnchor();
    } else {
      return ((ORMGroupingV2Figure) getFigure()).getConnectionAnchor();
    }
  }

  @Override
  public ConnectionAnchor getTargetConnectionAnchor(ConnectionEditPart connection) {
    if (getFigure() instanceof ORMGroupingV1Figure) {
      return ((ORMGroupingV1Figure) getFigure()).getConnectionAnchor();
    } else {
      return ((ORMGroupingV2Figure) getFigure()).getConnectionAnchor();
    }
  }

  @Override
  public ConnectionAnchor getSourceConnectionAnchor(Request request) {
    if (getFigure() instanceof ORMGroupingV1Figure) {
      return ((ORMGroupingV1Figure) getFigure()).getConnectionAnchor();
    } else {
      return ((ORMGroupingV2Figure) getFigure()).getConnectionAnchor();
    }
  }

  @Override
  public ConnectionAnchor getTargetConnectionAnchor(Request request) {
    if (getFigure() instanceof ORMGroupingV1Figure) {
      return ((ORMGroupingV1Figure) getFigure()).getConnectionAnchor();
    } else {
      return ((ORMGroupingV2Figure) getFigure()).getConnectionAnchor();
    }
  }


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
    // TODO: implement something better for synchronsation
    // shows all compartment names, which are in the child rolemodel(this will change in later
    // version of the model) of this grouping
    // the names are shown in a list and when are more then three names in the list a ... label is
    // added
    // in the tooltip of the ... label the other names are shown
    if (compartmentPart != null) {
      compartmentPart.removeAll();
      Rolemodel rm = ((Grouping) getModel()).getRolemodel();

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
        String labelText;

        label2.setText("For Editing please go in the Grouping.");
        sizeList = compartmentPart.getChildren().size();

        labelText = node.getName();


        label.setText(labelText);
        label.setToolTip(label2);
        if (sizeList <= 3)
          compartmentPart.add(label);
        else
          collectLabels.add(label);

      }

      if (sizeList > 3) {
        collectLabel.setToolTip(collectLabels);

        compartmentPart.add(collectLabel);
      }
    }
  }

  // for adding rolemodel
  @Override
  protected void addChildVisual(EditPart childEditPart, int index) {
    IFigure contentPane = null;

    if (childEditPart.getModel() instanceof Rolemodel) {
      // TODO: testing if this work for all cases
      // when figure is Version 2
      if (getParent() instanceof ScalableRootEditPart) {
        contentPane = ((ORMGroupingV2Figure) getFigure()).getBasicRec();
        contentPane.add(((ORMRolemodelEditPart) childEditPart).getFigure(), BorderLayout.CENTER);
      }
      // when figure is Version 1
      else {
        // TODO: implement something better for synchronsation
        contentPane = ((ORMGroupingV1Figure) getFigure()).getBasicRec();
        Rolemodel rm = (Rolemodel) ((ORMRolemodelEditPart) childEditPart).getModel();

        // shows all compartment names, which are in the child rolemodel(this will change in later
        // version of the model) of this grouping
        // the names are shown in a list and when are more then three names in the list a ... label
        // is added
        // in the tooltip of the ... label the other names are shown
        compartmentPart = new PartFigure();
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
          if (sizeList <= 3)
            compartmentPart.add(label);
          else
            collectLabels.add(label);
        }

        if (sizeList > 3) {
          collectLabel.setToolTip(collectLabels);
          compartmentPart.add(collectLabel);
        }
        contentPane.add(compartmentPart);
      }
    }
  }

  @Override
  public void activate() {
    if (!isActive()) {
      ((Grouping) getModel()).eAdapters().add(adapter);
    }
    super.activate();
  }

  @Override
  public void deactivate() {
    if (isActive()) {
      ((Grouping) getModel()).eAdapters().remove(adapter);
    }

    super.deactivate();
  }

  /**
   * Currently the class only adapts to create a {@link SnapToHelper} when the editor is in snapping
   * mode (either to grid or to shapes).
   */
  @Override
  public Object getAdapter(Class key) {
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

  public class ORMGroupingAdapter implements Adapter {

    // Adapter interface
    @Override
    public void notifyChanged(Notification notification) {
      refreshChildren();

      refreshVisuals();

      refreshSourceConnections();
      refreshTargetConnections();
    }

    @Override
    public Notifier getTarget() {
      return (Grouping) getModel();
    }

    @Override
    public void setTarget(Notifier newTarget) {
      // Do nothing.
    }

    @Override
    public boolean isAdapterForType(Object type) {
      return type.equals(Grouping.class);
    }
  }
}
