package org.framed.orm.ui.editPart.types;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.eclipse.draw2d.ConnectionAnchor;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.geometry.Rectangle;
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
import org.framed.orm.model.Method;
import org.framed.orm.model.Node;
import org.framed.orm.model.Relation;
import org.framed.orm.model.Type;
import org.framed.orm.ui.editPart.ORMAttributeEditPart;
import org.framed.orm.ui.editPart.ORMLabelFigure;
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

  private final ORMTypeAdapter adapter;

  // TODO: find better names
  private final Label collectAttribute;
  private final Label collectMethod;
  private final PartFigure collectionAtt;
  private final PartFigure collectionMet;

  public ORMTypeEditPart() {
    super();
    adapter = new ORMTypeAdapter();
    collectAttribute = new Label();
    collectAttribute.setText("...");
    collectMethod = new Label();
    collectMethod.setText("...");
    collectionAtt = new PartFigure();
    collectionMet = new PartFigure();
  }

  // return node for ORMLabelFigure to get the bounding rectangle
  public Node getNode() {
    return (Node) getModel();
  }

  @Override
  public void createEditPolicies() {
    installEditPolicy(EditPolicy.DIRECT_EDIT_ROLE, new ORMNodeDirectEditPolicy());
    installEditPolicy("Snap Feedback", new SnapFeedbackPolicy());
    installEditPolicy(EditPolicy.LAYOUT_ROLE, new ORMTypeXYLayoutPolicy());
    installEditPolicy(EditPolicy.COMPONENT_ROLE, new ORMTypeComponentEditPolicy(this));

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
      ORMAttributeEditPart attrEditPart = (ORMAttributeEditPart) childEditPart;
      attrEditPart.setParentEditPart(this); // set the parent editpart so that the attribute can
                                            // access the current bounds of the editpart
      
      Attribute attribute = (Attribute) childEditPart.getModel();

      List<Attribute> temp = new ArrayList<Attribute>();
      temp.addAll(attribute.getType().getAttributes());
      Collections.reverse(temp);

      int attributeIndex = temp.indexOf(attribute);

      addChildToRightPosition(attributeIndex, attrEditPart, contentPane,
          collectAttribute,  collectionAtt);
    }

    if (childEditPart.getModel() instanceof Method) {
      IFigure contentPane = ((ORMTypeFigure) getFigure()).getMethodeFigure();
      ORMMethodEditPart methodEditPart = (ORMMethodEditPart) childEditPart;
      methodEditPart.setParentEditPart(this);

      // add method to right position determined by the model
      Method method = (Method) childEditPart.getModel();

      List<Method> temp = new ArrayList<Method>();
      temp.addAll(method.getType().getOperations());
      Collections.reverse(temp);

      int methodIndex = temp.indexOf(method);

      addChildToRightPosition(methodIndex, methodEditPart, contentPane,
          collectMethod,  collectionMet);

    }
  }

  public void addChildToRightPosition(int index, GraphicalEditPart childEditPart, IFigure contentPane,
      Label collect, PartFigure collection) {

    if (index < 3) {

      if (contentPane.getChildren().size() <= index +1 && contentPane.getChildren().size() != 3) {
        contentPane.add(childEditPart.getFigure(), 0);
      } else {
        contentPane.add(childEditPart.getFigure(), index);
      }

      if (contentPane.getChildren().size() >= 4
          && !contentPane.getChildren().get(3).equals(collect)) {
        if (!(contentPane.getChildren().contains(collectMethod))) {
          contentPane.add(collect);
          collect.setToolTip(collection);
        }

        IFigure childfig =
            (IFigure) contentPane.getChildren().get(contentPane.getChildren().size() - 2);
        contentPane.getChildren().remove(childfig);
        collection.add(childfig, 0);
      }
    } else {

      if (!(contentPane.getChildren().contains(collect))) {
        contentPane.add(collect);
        collect.setToolTip(collection);
      }

      int collectionSize = collection.getChildren().size();
      if (collectionSize <= index - collectionSize) {
        collection.add(childEditPart.getFigure(), 0);
      } else {
        collection.add(childEditPart.getFigure(), index - collectionSize);
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
      } else {
        collectionAtt.remove(((ORMAttributeEditPart) childEditPart).getFigure());
      }

      if (contentPane.getChildren().contains(collectAttribute)) {

        if (contentPane.getChildren().size() < 4) {
          IFigure child = (IFigure) collectionAtt.getChildren().get(0);
          contentPane.remove(collectAttribute);
          contentPane.add(child);
          contentPane.add(collectAttribute);
        }

        if (collectionAtt.getChildren().size() == 0) {
          contentPane.remove(collectAttribute);
        }
      }
    }


    if (childEditPart.getModel() instanceof Method) {
      IFigure contentPane = ((ORMTypeFigure) getFigure()).getMethodeFigure();

      if (contentPane.getChildren().contains(((ORMMethodEditPart) childEditPart).getFigure())) {
        contentPane.remove(((ORMMethodEditPart) childEditPart).getFigure());
      } else {
        collectionMet.remove(((ORMMethodEditPart) childEditPart).getFigure());
      }

      if (contentPane.getChildren().contains(collectMethod)) {

        if (contentPane.getChildren().size() < 4) {
          IFigure child = (IFigure) collectionMet.getChildren().get(0);
          contentPane.remove(collectMethod);
          contentPane.add(child);
          contentPane.add(collectMethod);
        }

        if (collectionMet.getChildren().size() == 0) {
          contentPane.remove(collectMethod);
        }
      }
    }

  }

  @Override
  protected List getModelChildren() {
    List children = new ArrayList();
    Type type = (Type) getModel();
    children.addAll(type.getAttributes());
    children.addAll(type.getOperations());
    if (getModel() instanceof Compartment) {
      Compartment type2 = (Compartment) getModel();
      children.add(type2.getRolemodel());
    }
    return children;
  }


  private void performDirectEditing() {
    Label label = ((ORMTypeFigure) getFigure()).getLabel();
    ORMNodeDirectEditManager manager =
        new ORMNodeDirectEditManager(this, TextCellEditor.class, new ORMNodeCellEditorLocator(label), label);
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

  @SuppressWarnings("unchecked")
  @Override
  public void refreshVisuals() {
    final ORMTypeFigure figure = (ORMTypeFigure) getFigure();
    final Type model = (Type) getModel();
    final GraphicalEditPart parent = (GraphicalEditPart) getParent();

    figure.getLabel().setText(model.getName());
    figure.getLabel().setToolTip(new Label(model.getName()));
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

  // ! Returns the bounds of the parent figure
  public Rectangle getConstraints() {
    return null;
  }
}
