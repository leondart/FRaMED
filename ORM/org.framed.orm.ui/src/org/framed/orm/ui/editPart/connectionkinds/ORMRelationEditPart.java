package org.framed.orm.ui.editPart.connectionkinds;

import java.util.ArrayList;
import java.util.List;


import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.RelativeBendpoint;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.editparts.AbstractConnectionEditPart;
import org.eclipse.gef.editparts.ScalableRootEditPart;
import org.eclipse.gef.editpolicies.ConnectionEndpointEditPolicy;
import org.framed.orm.model.Relation;
import org.framed.orm.ui.editPart.ORMCompartmentDiagramEditPart;
import org.framed.orm.ui.editPart.ORMCompartmentEditPart;
import org.framed.orm.ui.editPart.ORMGroupingEditPart;
import org.framed.orm.ui.editPolicy.ORMRelationBendpointEditPolicy;
import org.framed.orm.ui.editPolicy.ORMRelationConnectionEditPolicy;

/**
 * @author Kay Bierzynski
 * */
public class ORMRelationEditPart extends AbstractConnectionEditPart {

  private RelationAdapter adapter;

  public ORMRelationEditPart() {
    super();
    adapter = new RelationAdapter();
  }



  @Override
  protected void createEditPolicies() {
    installEditPolicy(EditPolicy.CONNECTION_ENDPOINTS_ROLE, new ConnectionEndpointEditPolicy());
    installEditPolicy(EditPolicy.CONNECTION_ROLE, new ORMRelationConnectionEditPolicy());
    installEditPolicy(EditPolicy.CONNECTION_BENDPOINTS_ROLE, new ORMRelationBendpointEditPolicy());
  }

  @Override
  protected void refreshVisuals() {
    // the content of this method should only be called when the
    // compartment/grouping/compartmentdiagram
    // where this relation parentrolemodel belongs to is the current opened
    // compartment/grouping/compartmentdiagram
    // test of getSource() != null and getTarget() != null, because it exist cases where this method
    // its called and getSource() or getTarget() returns null


    if (getSource() != null
        && getTarget() != null
        && getSource().getParent() instanceof ORMCompartmentDiagramEditPart
        ||
        // source - parentrolemodel of source - parentgroup of rolemodel - parent of group
        getSource() != null && getTarget() != null
        && getRoot().getContents() instanceof ORMGroupingEditPart
        && getSource().getParent().getParent().getParent() instanceof ScalableRootEditPart
        || getSource() != null && getTarget() != null
        && getRoot().getContents() instanceof ORMCompartmentEditPart) {

      Connection connection = getConnectionFigure();
      //List<Point> modelConstraint = ((Relation) getModel()).getBendpoints();
      //List<AbsoluteBendpoint> figureConstraint = new ArrayList<AbsoluteBendpoint>();
      List<Point> dim1Constraint = ((Relation) getModel()).getDim1BP();
      List<Point> dim2Constraint = ((Relation) getModel()).getDim2BP();
      List<RelativeBendpoint> figureConstraint = new ArrayList<RelativeBendpoint>();
      // this check is needed, while during the execute of the CreateBendpointCommand the refreshVisual is called
      if(dim1Constraint.size() == dim2Constraint.size()){
        for (int i = 0;i<dim1Constraint.size();i++){//modelConstraint) {
          RelativeBendpoint rbp = new RelativeBendpoint(getConnectionFigure());
          // p.x = width p.y = height
          Dimension dim1 = new Dimension(dim1Constraint.get(i).x,dim1Constraint.get(i).y);
          Dimension dim2 = new Dimension(dim2Constraint.get(i).x, dim2Constraint.get(i).y);
          rbp.setRelativeDimensions(dim1, dim2);
        
          figureConstraint.add(rbp);//new AbsoluteBendpoint(p));
        }
      }
      connection.setRoutingConstraint(figureConstraint);
    }
  }

  @Override
  public void activate() {
    if (!isActive()) {
      ((Relation) getModel()).eAdapters().add(adapter);
    }
    super.activate();
  }

  @Override
  public void deactivate() {
    if (isActive()) {
      ((Relation) getModel()).eAdapters().remove(adapter);
    }
    super.deactivate();
  }

  public class RelationAdapter implements Adapter {

    @Override
    public void notifyChanged(Notification notification) {
      refreshVisuals();
    }

    @Override
    public Notifier getTarget() {
      return (Relation) getModel();
    }

    @Override
    public void setTarget(Notifier newTarget) {
      // Do nothing.
    }

    @Override
    public boolean isAdapterForType(Object type) {
      return type.equals(Relation.class);
    }
  }
}
