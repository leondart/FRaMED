package org.framed.orm.ui.editPart.connectionkinds;

import java.util.Collection;
import java.util.Iterator;

import org.eclipse.draw2d.Label;
import org.eclipse.gef.EditPart;
import org.framed.orm.model.Relation;
import org.framed.orm.model.Shape;
import org.framed.orm.model.util.Util;
import org.framed.orm.model.util.Util.Foo;
import org.framed.orm.ui.action.FulfillRolesAction;
import org.framed.orm.ui.figure.shapes.PartFigure;

/**
 * This {@link EditPart} is the controller for {@link Relation}s from type fulfillment.
 * 
 * @author Kay Bierzynski (initial dev, second time adapting to the graphical model)
 * @author David Gollasch ( first time adapting to the graphical model)
 * */
public class ORMFulfillmentEditPart extends ORMRelationEditPart {

  /**
   * A {@link Label} that contains the names of the {@link Shapes}s from type roletype and rolegroup
   * that are fulfilled from the source of this {@link Relation} from type fulfillment.
   */
  private Label targetLabel;

  /**
   * A {@link PartFigure}, which acts as the tool tip figure of the targetLabel and when more than
   * three roletype and/or rolegroups are fulfilled than this tool tip contains alle name of the
   * roletypes and rolegroups with a index of above three in the fulfilled role list.
   * */
  private PartFigure targetToolTip;

  /**
   * Constructor of this class. In which the class is initialized through calling the constructor of
   * it's parent.
   */
  public ORMFulfillmentEditPart() {
    super();
  }

  /**
   * {@inheritDoc} The refreshVisuals of this {@link EditPart} calls
   * {@link ORMRelationEditPart#refreshVisuals()} and updates the text of the targetLabel or
   * targetToolTip depening on number of fulfilled roles to handle the cases where the user
   * adds/deletes names of the {@link Shapes}s from type roletype and rolegroup through the
   * {@link FulfillRolesAction}.
   * 
   * @return
   * 
   */
  @Override
  protected void refreshVisuals() {
    super.refreshVisuals();
    final Relation relation = (Relation) getModel();

    targetLabel.setText("<...>");
    targetToolTip.removeAll();
    if (!relation.getReferencedRoles().isEmpty()) {
      Iterable<String> rolenames = Util.map(new Foo<Shape, String>() {
        public String f(Shape s) {
          return s.getName();
        }
      }, relation.getReferencedRoles());
      for (String r : rolenames)
        targetToolTip.add(new Label(r));
      targetLabel.setText(Util.join(", ", rolenames));
    }
    // System.out.println(targetLabel.getText());
  }

  /**
   * A setter for the target Label of this fulfillment.
   * 
   * @param targetLabel {@link Label}
   * */
  public void setTargetLabel(Label targetLabel) {
    this.targetLabel = targetLabel;
  }

  /**
   * A setter for the target label tool tip of this fulfillment.
   * 
   * @param targetToolTip {@link PartFigure}
   * */
  public void setTargetToolTip(PartFigure targetToolTip) {
    this.targetToolTip = targetToolTip;
  }


}
