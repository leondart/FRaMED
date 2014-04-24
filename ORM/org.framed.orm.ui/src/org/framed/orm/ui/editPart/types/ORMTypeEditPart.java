package org.framed.orm.ui.editPart.types;

import java.util.ArrayList;
import java.util.List;

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
import org.framed.orm.model.Attribute;
import org.framed.orm.model.Compartment;
import org.framed.orm.model.Methode;
import org.framed.orm.model.Relation;
import org.framed.orm.model.Type;
import org.framed.orm.ui.editPart.ORMAttributeEditPart;
import org.framed.orm.ui.editPart.ORMCompartmentEditPart;
import org.framed.orm.ui.editPart.ORMMethodEditPart;
import org.framed.orm.ui.editPolicy.ORMNodeDirectEditPolicy;
import org.framed.orm.ui.editPolicy.ORMTypeComponentEditPolicy;
import org.framed.orm.ui.editPolicy.ORMTypeXYLayoutPolicy;
import org.framed.orm.ui.editor.ORMNodeCellEditorLocator;
import org.framed.orm.ui.editor.ORMNodeDirectEditManager;
import org.framed.orm.ui.figure.ORMTypeFigure;
import org.framed.orm.ui.figure.PartFigure;

/**
 * @author Kay Bierzynski
 * */
public abstract class ORMTypeEditPart extends AbstractGraphicalEditPart implements NodeEditPart {

  private ORMTypeAdapter adapter;

  // TODO: find better names
  private Label collectAttribute;
  private Label collectMethode;
  private PartFigure collectionAtt;
  private PartFigure collectionMet;

  public ORMTypeEditPart() {
    super();
    adapter = new ORMTypeAdapter();
    collectAttribute = new Label();
    collectAttribute.setText("...");
    collectMethode = new Label();
    collectMethode.setText("...");
    collectionAtt = new PartFigure();
    collectionMet = new PartFigure();
  }



  @Override
  public void createEditPolicies() {
    installEditPolicy(EditPolicy.DIRECT_EDIT_ROLE, new ORMNodeDirectEditPolicy());
    installEditPolicy("Snap Feedback", new SnapFeedbackPolicy());
    installEditPolicy(EditPolicy.LAYOUT_ROLE, new ORMTypeXYLayoutPolicy());
    installEditPolicy(EditPolicy.COMPONENT_ROLE, new ORMTypeComponentEditPolicy());

  }


  @Override
  public void performRequest(Request req) {

    if (req.getType() == RequestConstants.REQ_DIRECT_EDIT) {
      performDirectEditing();
    }
  }

  // for adding of Attribute and Methode
  @Override
  protected void addChildVisual(EditPart childEditPart, int index) {
    // TODO: find better solution
    /*
     * when more than 3 Attributes/Methodes are added to this Type, than the label
     * collectAttribute/collectMethode are added and the names of the Attributes/Methodes with index
     * >2 are collectet in the tooltip of the label collectAttribute/collectMethode
     */
    if (childEditPart.getModel() instanceof Attribute) {
      IFigure contentPane = ((ORMTypeFigure) getFigure()).getAttributeFigure();
      if (contentPane.getChildren().size() >= 3
          && !(contentPane.getChildren().contains(collectAttribute))) {
        collectAttribute.setToolTip(collectionAtt);
        contentPane.add(collectAttribute);
      }
      if (contentPane.getChildren().size() >= 3) {
        collectionAtt.add(((ORMAttributeEditPart) childEditPart).getFigure());
        collectAttribute.setToolTip(collectionAtt);
      } else {
        Attribute attribute = (Attribute) childEditPart.getModel();
        int attributeIndex = attribute.getType().getAttributes().indexOf(attribute);
        contentPane.add(((ORMAttributeEditPart) childEditPart).getFigure(), attributeIndex);
      }
    }

    if (childEditPart.getModel() instanceof Methode) {
      IFigure contentPane = ((ORMTypeFigure) getFigure()).getMethodeFigure();
      if (contentPane.getChildren().size() >= 3
          && !(contentPane.getChildren().contains(collectMethode))) {
        collectMethode.setToolTip(collectionMet);
        contentPane.add(collectMethode);
      }
      if (contentPane.getChildren().size() >= 3) {
        collectionMet.add(((ORMMethodEditPart) childEditPart).getFigure());
        collectMethode.setToolTip(collectionMet);
      } else {
        // add method to right position determined by the model
        Methode method = (Methode) childEditPart.getModel();
        int methodIndex = method.getType().getOperations().indexOf(method);
        contentPane.add(((ORMMethodEditPart) childEditPart).getFigure(), methodIndex);
      }
    }
  }

  // for delete of Attribute and Methode
  @Override
  protected void removeChildVisual(EditPart childEditPart) {

    if (childEditPart.getModel() instanceof Attribute) {
      IFigure contentPane = ((ORMTypeFigure) getFigure()).getAttributeFigure();
      if (contentPane.getChildren().contains(((ORMAttributeEditPart) childEditPart).getFigure())) {
        contentPane.remove(((ORMAttributeEditPart) childEditPart).getFigure());
        if (contentPane.getChildren().size() < 4
            && contentPane.getChildren().contains(collectAttribute)) {
          if (collectionAtt.getChildren().size() == 0) {
            contentPane.remove(collectAttribute);
          } else {
            IFigure child = (IFigure) collectionAtt.getChildren().get(0);
            contentPane.remove(collectAttribute);
            contentPane.add(child);
            contentPane.add(collectAttribute);
          }
          if (collectionAtt.getChildren().size() == 0) {
            contentPane.remove(collectAttribute);
          }
        }
      } else if (collectionAtt.getChildren().contains(
          ((ORMAttributeEditPart) childEditPart).getFigure())) {
        collectionAtt.remove(((ORMAttributeEditPart) childEditPart).getFigure());
        if (collectionAtt.getChildren().size() == 0) {
          contentPane.remove(collectAttribute);
        }
      }

    }

    if (childEditPart.getModel() instanceof Methode) {
      IFigure contentPane = ((ORMTypeFigure) getFigure()).getMethodeFigure();
      if (contentPane.getChildren().contains(((ORMMethodEditPart) childEditPart).getFigure())) {
        contentPane.remove(((ORMMethodEditPart) childEditPart).getFigure());
        if (contentPane.getChildren().size() < 4
            && contentPane.getChildren().contains(collectMethode)) {
          if (collectionMet.getChildren().size() == 0) {
            contentPane.remove(collectMethode);
          } else {
            IFigure child = (IFigure) collectionMet.getChildren().get(0);
            contentPane.remove(collectMethode);
            contentPane.add(child);
            contentPane.add(collectMethode);
          }
          if (collectionMet.getChildren().size() == 0) {
            contentPane.remove(collectMethode);
          }
        }
      } else if (collectionMet.getChildren().contains(
          ((ORMMethodEditPart) childEditPart).getFigure())) {
        collectionMet.remove(((ORMMethodEditPart) childEditPart).getFigure());
        if (collectionMet.getChildren().size() == 0) {
          contentPane.remove(collectMethode);
        }
      }
    }
  }

  @Override
  protected List getModelChildren() {
    List children = new ArrayList();
    Type type = (Type) getModel();
    children.addAll(type.getOperations());
    children.addAll(type.getAttributes());
    if (getModel() instanceof Compartment) {
      Compartment type2 = (Compartment) getModel();
      children.add(type2.getRolemodel());
    }
    return children;
  }


  private void performDirectEditing() {
    TextFlow textFlow = ((ORMTypeFigure) getFigure()).getLabel().getTextFlow();
    ORMNodeDirectEditManager manager =
        new ORMNodeDirectEditManager(this, TextCellEditor.class, new ORMNodeCellEditorLocator(
            textFlow), textFlow);
    manager.show(); // refresh view
  }

  @Override
  public List<Relation> getModelSourceConnections() {
    if (!(getParent() instanceof ScalableRootEditPart)) {
      Type model = (Type) getModel();
      return model.getOutgoingLinks();
    }
    return new ArrayList<Relation>();
  }

  @Override
  public List<Relation> getModelTargetConnections() {
    if (!(getParent() instanceof ScalableRootEditPart)) {
      Type model = (Type) getModel();
      return model.getIncomingLinks();
    }
    return new ArrayList<Relation>();
  }

  @Override
  public ConnectionAnchor getSourceConnectionAnchor(ConnectionEditPart connection) {
    return ((ORMTypeFigure) getFigure()).getConnectionAnchor();
  }

  @Override
  public ConnectionAnchor getTargetConnectionAnchor(ConnectionEditPart connection) {
    return ((ORMTypeFigure) getFigure()).getConnectionAnchor();
  }

  @Override
  public ConnectionAnchor getSourceConnectionAnchor(Request request) {
    return ((ORMTypeFigure) getFigure()).getConnectionAnchor();
  }

  @Override
  public ConnectionAnchor getTargetConnectionAnchor(Request request) {
    return ((ORMTypeFigure) getFigure()).getConnectionAnchor();
  }

  @Override
  public void refreshVisuals() {
    final ORMTypeFigure figure = (ORMTypeFigure) getFigure();
    final Type model = (Type) getModel();
    final GraphicalEditPart parent = (GraphicalEditPart) getParent();

    figure.getLabel().setText(model.getName());
    parent.setLayoutConstraint(this, figure, model.getConstraints());

  }

  @Override
  public void setLayoutConstraint(EditPart child, IFigure childFigure, Object constraint) {
    if (constraint != null) {
      childFigure.getParent().setConstraint(childFigure, constraint);
    }
  }

  @Override
  public void activate() {
    if (!isActive()) {
      ((Type) getModel()).eAdapters().add(adapter);
    }
    super.activate();
  }

  @Override
  public void deactivate() {
    if (isActive()) {
      ((Type) getModel()).eAdapters().remove(adapter);
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

  public class ORMTypeAdapter implements Adapter {

    // Adapter interface
    @Override
    public void notifyChanged(Notification notification) {

      refreshChildren();
      refreshVisuals();
      // for synchronsation with role list of the Compartement in above layer of the tree
      if (getParent().getParent() instanceof ORMCompartmentEditPart)
        ((ORMCompartmentEditPart) getParent().getParent()).refreshVisuals();
      if (!(getParent() instanceof ScalableRootEditPart)) {
        refreshSourceConnections();
        refreshTargetConnections();
      }
    }

    @Override
    public Notifier getTarget() {
      return (Type) getModel();
    }

    @Override
    public void setTarget(Notifier newTarget) {
      // Do nothing.
    }

    @Override
    public boolean isAdapterForType(Object type) {
      return type.equals(Type.class);
    }
  }
}
