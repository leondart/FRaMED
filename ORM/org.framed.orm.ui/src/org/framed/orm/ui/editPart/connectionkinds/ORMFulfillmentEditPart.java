package org.framed.orm.ui.editPart.connectionkinds;

import org.eclipse.draw2d.Label;
import org.eclipse.gef.EditPart;
import org.framed.orm.model.Relation;
import org.framed.orm.ui.action.FulfillRolesAction;

/**
 * This {@link EditPart} is the controller for the model element {@link Fulfillment}.
 * 
 * @author Kay Bierzynski (initial dev)
 * @author David Gollasch
 * */
public class ORMFulfillmentEditPart extends ORMRelationEditPart {

  /**
   * A {@link Label} that contains the names of the {@link RoleType}s and {@link RoleGroup}s that
   * are fulfill from the source of this {@link Fulfillment}.
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
   * the cases where the user adds/deletes names of the {@link RoleType}s and {@link RoleGroup}s
   * through the property sheet or the{@link FulfillRolesAction}.
   * 
   */
  @Override
  protected void refreshVisuals() {
    super.refreshVisuals();

    final Relation model = (Relation) getModel();

//    String text = "<...>";
//    for (String name : model.getFulfilledRoles()) {
//      if (text.equals("<...>")) {
//        text = name;
//      } else {
//        text = text + ", " + name;
//      }
//    }

    targetLabel.setText(model.getTargetLabel().getName());
  }

  public void setTargetLabel(Label targetLabel) {
    this.targetLabel = targetLabel;
  }

  public void setTargetToolTip(Label targetToolTip) {
    this.targetToolTip = targetToolTip;
  }
  
  
}
