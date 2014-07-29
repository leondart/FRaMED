package org.framed.orm.ui.editPart.connectionkinds;


import org.eclipse.draw2d.BendpointConnectionRouter;
import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.ConnectionEndpointLocator;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.PolygonDecoration;
import org.eclipse.draw2d.PolylineConnection;
import org.eclipse.gef.EditPart;
import org.eclipse.swt.SWT;
import org.framed.orm.model.Fulfillment;
import org.framed.orm.model.RoleGroup;
import org.framed.orm.model.RoleType;
import org.framed.orm.ui.action.FulfillRolesAction;

/**
 * This {@link EditPart} is the controller for the model element {@link Fulfillment}.
 * 
 * @author Kay Bierzynski
 * */
public class ORMFulfillmentEditPart extends ORMRelationEditPart {
  /**
   * A {@link Label} that contains the names of the {@link RoleType}s and {@link RoleGroup}s that
   * are fulfill from the source of this {@link Fulfillment}.
   */
  private final Label targetLabel;

  /**
   * Constructor of this class. In which the class is initialized through calling the constructor of
   * it's parent and initializing the targetLabel.
   */
  public ORMFulfillmentEditPart() {
    super();
    targetLabel = new Label();
  }

  /**
   * {@inheritDoc} {@link Fulfilment}s have as figure a drawn through line with a {@link Label} that
   * contains the names of the {@link RoleType}s and {@link RoleGroup}s that are fulfill from the
   * source of this {@link Fulfillment} and a black arrow tip at the target end of the connection .
   */
  @Override
  protected IFigure createFigure() {
    Label tooltipTarget = new Label();
    tooltipTarget
        .setText("This tooltip is for layouting of the text, which is not implemented yet");

    PolylineConnection conn = new PolylineConnection();
    conn.setAntialias(SWT.ON);

    // create the black arrow tip
    PolygonDecoration poly = new PolygonDecoration();
    poly.setAntialias(SWT.ON);
    poly.setBackgroundColor(ColorConstants.black);
    poly.setScale(5, 5);

    // add the the black arrow tip
    conn.setTargetDecoration(poly);
    conn.setConnectionRouter(new BendpointConnectionRouter());

    // add target Label
    ConnectionEndpointLocator targetEndL = new ConnectionEndpointLocator(conn, true);
    targetEndL.setVDistance(-1);
    targetEndL.setUDistance(1);
    // add to the targetLabel the initial text(when no roletype or rolegroup names in the
    // fulfilledroles list) or the roletype and the rolegroup names in the fulfilledrole list
    String text = "<...>";
    for (String name : ((Fulfillment) getModel()).getFulfilledRoles()) {
      if (text.equals("<...>")) {
        text = name;
      } else {
        text = text + ", " + name;
      }
    }
    targetLabel.setText(text);
    targetLabel.setToolTip(tooltipTarget);
    conn.add(targetLabel, targetEndL);

    return conn;
  }

  /**
   * {@inheritDoc} The refreshVisuals of this {@link EditPart} calls
   * {@link ORMRelationEditPart#refreshVisuals()} and updates the text of the targetLabel(to handle
   * the cases where the user adds/deletes names of the {@link RoleType}s and {@link RoleGroup}s
   * through the property sheet or the{@link FulfillRolesAction}.
   * 
   */
  @Override
  protected void refreshVisuals() {
    super.refreshVisuals();

    final Fulfillment model = (Fulfillment) getModel();

    String text = "<...>";
    for (String name : model.getFulfilledRoles()) {
      if (text.equals("<...>")) {
        text = name;
      } else {
        text = text + ", " + name;
      }
    }

    targetLabel.setText(text);
  }
}
