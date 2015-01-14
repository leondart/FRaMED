package org.framed.orm.ui.editPart.connectionkinds;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.draw2d.Label;
import org.eclipse.gef.EditPart;
import org.framed.orm.model.NamedElement;
import org.framed.orm.model.Relation;
import org.framed.orm.model.Shape;
import org.framed.orm.ui.action.FulfillRolesAction;

/**
 * This {@link EditPart} is the controller for {@link Relation}s from type fulfillment.
 * 
 * @author Kay Bierzynski (initial dev)
 * @author David Gollasch
 * */
public class ORMFulfillmentEditPart extends ORMRelationEditPart {

  /**
   * A {@link Label} that contains the names of the {@link Shapes}s from type roletype and rolegroup
   * that are fulfilled from the source of this {@link Relation} from type fulfillment.
   */
  private Label targetLabel;

  private Label targetToolTip;

  /**
   * Constructor of this class. In which the class is initialized through calling the constructor of
   * it's parent.
   */
  public ORMFulfillmentEditPart() {
    super();
  }

  /**
   * {@inheritDoc} The refreshVisuals of this {@link EditPart} calls
   * {@link ORMRelationEditPart#refreshVisuals()} and updates the text of the targetLabel(to handle
   * the cases where the user adds/deletes names of the {@link Shapes}s from type roletype and
   * rolegroup through the {@link FulfillRolesAction}.
   * 
   */
  @Override
  protected void refreshVisuals() {
    super.refreshVisuals();

    final Relation relation = (Relation) getModel();

    for (Shape role : relation.getReferencedRoles()) {
      if (targetLabel.getText().equals("<...>")) {
        targetLabel.setText(role.getName());
      } else {
        targetLabel.setText(targetLabel.getText() + ", " + role.getName());
      }
    }
  }
  
  public void setTargetLabel(Label targetLabel) {
    this.targetLabel = targetLabel;
  }

  public void setTargetToolTip(Label targetToolTip) {
    this.targetToolTip = targetToolTip;
  }


}
