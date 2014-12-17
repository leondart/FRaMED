package org.framed.orm.ui.editPart.types;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.draw2d.ConnectionAnchor;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Label;
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
import org.framed.orm.model.Attribute;
import org.framed.orm.model.Compartment;
import org.framed.orm.model.Method;
import org.framed.orm.model.Relation;
import org.framed.orm.model.Rolemodel;
import org.framed.orm.model.Type;
import org.framed.orm.ui.editPart.ORMNamedElementEditPart;
import org.framed.orm.ui.editPart.ORMGroupingEditPart;
import org.framed.orm.ui.editPart.ORMMethodEditPart;
import org.framed.orm.ui.editPolicy.ORMNodeDirectEditPolicy;
import org.framed.orm.ui.editPolicy.ORMShapeComponentEditPolicy;
import org.framed.orm.ui.editPolicy.ORMSegmentXYLayoutPolicy;
import org.framed.orm.ui.editor.ORMCellEditorLocator;
import org.framed.orm.ui.editor.ORMDirectEditManager;
import org.framed.orm.ui.figure.ORMShapeFigure;
import org.framed.orm.ui.figure.PartFigure;

/**
 * This {@link EditPart} is the super/parent {@link EditPart} also super/parent controller of all
 * {@link Type}s.
 * 
 * @author Kay Bierzynski
 * */
public abstract class ORMTypeEditPart extends AbstractGraphicalEditPart implements NodeEditPart {

  /**
   * The {@link Adapter} of this controller, which recieves the notifications from the viewer/user.
   * This {@link EditPart} reacts on the notifications
   */
  private final ORMTypeAdapter adapter;

  // TODO: find better names
  /**
   * A {@link Label} which will contain collectionAtt as tooltip and has a text ... . A global
   * variablie is nessecary, because this variable is used in methods addChildVisual and
   * removeChildVisual.
   * */
  private final Label collectAttribute;
  /**
   * A {@link Label} which contains collection Met as tooltip and has as a text ... . A global
   * variablie is nessecary, because this variable is used in methods addChildVisual and
   * removeChildVisual.
   * */
  private final Label collectMethod;
  /**
   * A {@link PartFigure} which contains the names of all {@link Attribute}s that doesn't fit in the
   * attribute list of the type figure, when the attribute list already contains three
   * {@link Attribute}s. A global variable is nessecary, because this variable is used in methods
   * addChildVisual and removeChildVisual.
   */
  private final PartFigure collectionAtt;
  /**
   * A {@link PartFigure} which contains the names of all {@link Method}s that doesn't fit in the
   * method list of the type figure, when the method list already contains three {@link Methods}s. A
   * global variable is helpful, because this {@link PartFigure} is used in the methods
   * removeChildVisual() and addChildVisual().
   */
  private final PartFigure collectionMet;

  /**
   * Constructor of this class. In which the class is initialized through calling the constructor of
   * it's parent, initializing it's {@link Adapter} and initializing the global variables
   * collectMethod, collectAttribure, collectionAtt and collectionMet.
   */
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

  /** {@inheritDoc} */
  @Override
  public void createEditPolicies() {
    // edit policy for handling requests of editing the type name
    installEditPolicy(EditPolicy.DIRECT_EDIT_ROLE, new ORMNodeDirectEditPolicy());
    installEditPolicy("Snap Feedback", new SnapFeedbackPolicy());
    // edit policy, which handles the creation of the children of the tyoe and the
    // adding of the children to the type
    installEditPolicy(EditPolicy.LAYOUT_ROLE, new ORMSegmentXYLayoutPolicy());
    // edit policy, which handels requests for deleting the type, which is controlled
    // through this edit part
    installEditPolicy(EditPolicy.COMPONENT_ROLE, new ORMShapeComponentEditPolicy(this));
  }

  /** {@inheritDoc} */
  @Override
  public void performRequest(Request req) {

    if (req.getType() == RequestConstants.REQ_DIRECT_EDIT) {
      performDirectEditing();
    }
  }

  /**
   * {@inheritDoc} In case of this {@link EditPart} that would be the figure of {@link Attribute}s
   * and {@link Method}s. When more than 3 Attributes/Methodes are added to this Type, than the
   * label collectAttribute/collectMethod( they have as a text ...) are added and the names of the
   * Attributes/Methodes with index >2 are collected and shown in the tooltip(collectionAtt/
   * collectionMet) of the label collectAttribute/collectMethod.
   * 
   * */
  @Override
  protected void addChildVisual(final EditPart childEditPart, final int index) {

    if (childEditPart.getModel() instanceof Attribute) {
      final IFigure contentPane = ((ORMShapeFigure) getFigure()).getAttributeFigure();
      final ORMNamedElementEditPart attrEditPart = (ORMNamedElementEditPart) childEditPart;

      final Attribute attribute = (Attribute) childEditPart.getModel();

      final List<Attribute> temp = new ArrayList<Attribute>();
      temp.addAll(attribute.getType().getAttributes());
      // the attrbutes should be added to the collectionAtt and the collectAttribute in reversed
      // order
      Collections.reverse(temp);

      final int attributeIndex = temp.indexOf(attribute);

      addChildToCorrectPosition(attributeIndex, attrEditPart, contentPane, collectAttribute,
          collectionAtt);
    }

    if (childEditPart.getModel() instanceof Method) {
      final IFigure contentPane = ((ORMShapeFigure) getFigure()).getMethodeFigure();
      final ORMMethodEditPart methodEditPart = (ORMMethodEditPart) childEditPart;

      final Method method = (Method) childEditPart.getModel();

      final List<Method> temp = new ArrayList<Method>();
      temp.addAll(method.getType().getOperations());
      // the method should be added to the collectionMet and the collectMethod in reversed
      // order
      Collections.reverse(temp);

      final int methodIndex = temp.indexOf(method);

      addChildToCorrectPosition(methodIndex, methodEditPart, contentPane, collectMethod,
          collectionMet);

    }
  }

  /**
   * This method adds a {@link Attribute}/{@link Method} to the attibute/ method list of the type
   * figure and when attibute/ method list contains more than three {@link Attribute}s/
   * {@link Method}s the latest added {@link Attribute}/{@link Method} is removed from attibute/
   * method list and added to collectionAtt/collectionMet and the label collectAttribute/collectMet
   * is added.
   * */
  private void addChildToCorrectPosition(final int index, final GraphicalEditPart childEditPart,
      final IFigure contentPane, final Label collect, final PartFigure collection) {

    if (index < 3) {
      // if the contentPane contains not more than index+1 children not more than three children
      // than total than the atttribute/method should be added at top of the attribute/method
      // list(contentPane) else the child is added on it's index
      if (contentPane.getChildren().size() <= index + 1 && contentPane.getChildren().size() != 3) {
        contentPane.add(childEditPart.getFigure(), 0);
      } else {
        contentPane.add(childEditPart.getFigure(), index);
      }

      // if the contentPane has more than four children and thhe contentPane doesn't contain collect
      // label that the collect label is added at the end of the contentPane, the collection is
      // added to the collect label as tootltip and the first added(to the contentPan) child figure
      // is removed from contentPane an added to the collection
      if (contentPane.getChildren().size() >= 4
          && !contentPane.getChildren().get(3).equals(collect)) {

        contentPane.add(collect);
        collect.setToolTip(collection);


        IFigure childfig =
            (IFigure) contentPane.getChildren().get(contentPane.getChildren().size() - 2);
        contentPane.getChildren().remove(childfig);
        collection.add(childfig, 0);
      }
    } else {

      if (!contentPane.getChildren().contains(collect)) {
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

  /**
   * {@inheritDoc} In case of this {@link EditPart} that would be the figures of {@link Attribute}s
   * and {@link Method}s. Depending on the index of the {@link Attribute}/{@link Method} is the
   * child removed from the contentPane or the collectionAtt/collectionMet. When after the removing
   * the contentPane has less than four children and has a collectAttribute/collectMethod, which has
   * at least one children, than a children is taken from collectionAttribute/collectionMethod and
   * added before the collectAttribute/collectMethod. At end this method tests if the
   * collectionAttribute/collectionMethod contains ate least one children when not thatn the the
   * collectAttribute/collectMethod is removed from the conetntPane.
   * 
   * */
  @Override
  protected void removeChildVisual(final EditPart childEditPart) {

    if (childEditPart.getModel() instanceof Attribute) {
      IFigure contentPane = ((ORMShapeFigure) getFigure()).getAttributeFigure();

      if (contentPane.getChildren().contains(((ORMNamedElementEditPart) childEditPart).getFigure())) {
        contentPane.remove(((ORMNamedElementEditPart) childEditPart).getFigure());
      } else {
        collectionAtt.remove(((ORMNamedElementEditPart) childEditPart).getFigure());
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
      IFigure contentPane = ((ORMShapeFigure) getFigure()).getMethodeFigure();

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

  /** {@inheritDoc} */
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

  /**
   * This method initializes and starts the {@link ORMDirectEditManager} for direct editing the
   * type name.
   */
  private void performDirectEditing() {
    Label label = ((ORMShapeFigure) getFigure()).getLabel();
    ORMDirectEditManager manager =
        new ORMDirectEditManager(this, TextCellEditor.class,
            new ORMCellEditorLocator(label), label);
    manager.show(); // refresh view
  }

  /** {@inheritDoc} */
  @Override
  public List<Relation> getModelSourceConnections() {
    if (!(getParent() instanceof ScalableRootEditPart)) {
      Type model = (Type) getModel();
      return model.getOutgoingLinks();
    }
    return new ArrayList<Relation>();
  }

  /** {@inheritDoc} */
  @Override
  public List<Relation> getModelTargetConnections() {
    if (!(getParent() instanceof ScalableRootEditPart)) {
      Type model = (Type) getModel();
      return model.getIncomingLinks();
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
   * {@inheritDoc} The refreshVisuals of this {@link EditPart}(all type editparts) updates the
   * text(shorten type name), the boundaries(constraints) and the tooltip(complete type name) of the
   * {@link Type} figure.
   * */
  @Override
  public void refreshVisuals() {
    final ORMShapeFigure figure = (ORMShapeFigure) getFigure();
    final Type model = (Type) getModel();
    final GraphicalEditPart parent = (GraphicalEditPart) getParent();

    figure.getLabel().setText(model.getName());
    figure.getLabel().setToolTip(new Label(model.getName()));
    parent.setLayoutConstraint(this, figure, model.getConstraints());
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
      ((Type) getModel()).eAdapters().add(adapter);
    }
    super.activate();
  }

  /** {@inheritDoc} */
  @Override
  public void deactivate() {
    if (isActive()) {
      ((Type) getModel()).eAdapters().remove(adapter);
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
   * refreshTargetConnections() are only called when the user didn't stepped in the {@link Type}
   * also when the type isn't a {@link Compartment} or is a {@link Compartment}, where the user
   * didn't step into. When a {@link Type} is created as child of a {@link Rolemodel} or the name of
   * a type in a rolemodel is changed than the role/ compartment list of the
   * parent(compartem/grouping) must be updated for that reason the refreshVisuals() of the parent
   * of the rolemodel is called on a change notification.
   * 
   * */
  public class ORMTypeAdapter implements Adapter {

    /** {@inheritDoc} */
    @Override
    public void notifyChanged(final Notification notification) {

      refreshChildren();
      refreshVisuals();

      // for synchronsation with role list of the Compartement in above layer of the tree
      if (getParent().getParent() instanceof ORMCompartmentEditPart) {
        ((ORMCompartmentEditPart) getParent().getParent()).refreshVisuals();
      }

      // for synchronsation with compartment list of the Grouping in above layer of the tree
      if (getParent().getParent() instanceof ORMGroupingEditPart) {
        ((ORMGroupingEditPart) getParent().getParent()).refreshVisuals();
      }

      if (!(getParent() instanceof ScalableRootEditPart)) {
        refreshSourceConnections();
        refreshTargetConnections();
      }
    }

    /** {@inheritDoc} */
    @Override
    public Notifier getTarget() {
      return (Type) getModel();
    }

    /** {@inheritDoc} */
    @Override
    public void setTarget(final Notifier newTarget) {
      // Do nothing.
    }

    /** {@inheritDoc} */
    @Override
    public boolean isAdapterForType(final Object type) {
      return type.equals(Type.class);
    }
  }

  /**
   * A getter for the boundaries of this {@link Type}.
   * 
   * @return type boundaries
   * */
  public abstract Rectangle getConstraints();
}
