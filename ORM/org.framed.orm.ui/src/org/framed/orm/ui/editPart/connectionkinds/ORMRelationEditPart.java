package org.framed.orm.ui.editPart.connectionkinds;

import org.eclipse.draw2d.Bendpoint;
import org.eclipse.draw2d.Connection;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.editparts.AbstractConnectionEditPart;
import org.eclipse.gef.editparts.ScalableRootEditPart;
import org.eclipse.gef.editpolicies.ConnectionEndpointEditPolicy;
import org.framed.orm.model.Relation;
import org.framed.orm.ui.editPart.ORMModelEditPart;
import org.framed.orm.ui.editPart.ORMGroupingEditPart;
import org.framed.orm.ui.editPart.shape.ORMCompartmentEditPart;
import org.framed.orm.ui.editPolicy.ORMRelationBendpointEditPolicy;
import org.framed.orm.ui.editPolicy.ORMRelationConnectionEditPolicy;

/**
 * This {@link EditPart} is the super/parent {@link EditPart} also super/parent controller of all
 * {@link Relation}s.
 * 
 * @author Kay Bierzynski
 * */
public class ORMRelationEditPart extends AbstractConnectionEditPart {

  /**
   * The {@link Adapter} of this controller, which recieves the notifications from the viewer/user.
   * This {@link EditPart} reacts on the notifications
   */
  private final RelationAdapter adapter;

  /**
   * Constructor of this class. In which the class is initialized through calling the constructor of
   * it's parent and initializing it's {@link Adapter}.
   */
  public ORMRelationEditPart() {
    super();
    adapter = new RelationAdapter();
  }

  /** {@inheritDoc} */
  @Override
  protected void createEditPolicies() {
    installEditPolicy(EditPolicy.CONNECTION_ENDPOINTS_ROLE, new ConnectionEndpointEditPolicy());
    // edit policy, which handel the creation of relations
    installEditPolicy(EditPolicy.CONNECTION_ROLE, new ORMRelationConnectionEditPolicy());
    // edit policy, which the creation, moving and deletion of bendpoints on a relation
    installEditPolicy(EditPolicy.CONNECTION_BENDPOINTS_ROLE, new ORMRelationBendpointEditPolicy());
  }

  /**
   * {@inheritDoc} The refreshVisuals of this {@link EditPart} updates/adds the {@link Bendpoint}s
   * of a {@link Relation}. The content of this method should only be called when the
   * compartment/grouping/compartmentdiagram where this {@link Relation}s parentrolemodel(for the
   * cases compartment/grouping) belongs to is the current opened(content of the viewer)
   * compartment/grouping/compartmentdiagram. The test of getSource() != null and getTarget() !=
   * null is needed, because it exist cases where this method /its called and getSource() or
   * getTarget() returns null.
   * 
   */
  @Override
  protected void refreshVisuals() {

    if (getSource() != null && getTarget() != null
        && getSource().getParent() instanceof ORMModelEditPart || getSource() != null
        && getTarget() != null
        && getRoot().getContents() instanceof ORMGroupingEditPart
        // source - parentrolemodel of source - parentgroup of rolemodel - parent of group
        && getSource().getParent().getParent().getParent() instanceof ScalableRootEditPart
        || getSource() != null && getTarget() != null
        && getRoot().getContents() instanceof ORMCompartmentEditPart) {

      Connection connection = getConnectionFigure();
//      List<Point> dim1Constraint = ((Relation) getModel()).getDim1BP();
//      List<Point> dim2Constraint = ((Relation) getModel()).getDim2BP();
//      // the bendpoints are added as RelativeBendpoint, because the position of the bendpoints must
//      // change when the position of the source or target of the relation changes or the the figure
//      // of the content of the viewer has expandalble and collapsible elements
//      List<RelativeBendpoint> figureConstraint = new ArrayList<RelativeBendpoint>();
//      // this check is needed, while during the execute of the CreateBendpointCommand the
//      // refreshVisual is called
//      if (dim1Constraint.size() == dim2Constraint.size()) {
//        for (int i = 0; i < dim1Constraint.size(); i++) {
//          RelativeBendpoint rbp = new RelativeBendpoint(getConnectionFigure());
//          // p.x = width p.y = height
//          Dimension dim1 = new Dimension(dim1Constraint.get(i).x, dim1Constraint.get(i).y);
//          Dimension dim2 = new Dimension(dim2Constraint.get(i).x, dim2Constraint.get(i).y);
//          rbp.setRelativeDimensions(dim1, dim2);
//
//          figureConstraint.add(rbp);
//        }
//      }
//      connection.setRoutingConstraint(figureConstraint);
      connection.setRoutingConstraint(((Relation)getModel()).getBendpoints());
    }
  }

  /** {@inheritDoc} */
  @Override
  public void activate() {
    if (!isActive()) {
      ((Relation) getModel()).eAdapters().add(adapter);
    }
    super.activate();
  }

  /** {@inheritDoc} */
  @Override
  public void deactivate() {
    if (isActive()) {
      ((Relation) getModel()).eAdapters().remove(adapter);
    }
    super.deactivate();
  }

  /**
   * The {@link Adapter} of this {@link EditPart}. An adapter is a receiver of notifications and is
   * typically associated with a Notifier via an AdapterFactory. This {@link Adapter} calls the
   * refreshVisuals() method when it gets a change notification.
   * 
   * */
  public class RelationAdapter implements Adapter {

    /** {@inheritDoc} */
    @Override
    public void notifyChanged(final Notification notification) {
      refreshVisuals();
    }

    /** {@inheritDoc} */
    @Override
    public Notifier getTarget() {
      return (Relation) getModel();
    }

    /** {@inheritDoc} */
    @Override
    public void setTarget(final Notifier newTarget) {
      // Do nothing.
    }

    /** {@inheritDoc} */
    @Override
    public boolean isAdapterForType(final Object type) {
      return type.getClass().equals(Relation.class);
    }
  }
}
