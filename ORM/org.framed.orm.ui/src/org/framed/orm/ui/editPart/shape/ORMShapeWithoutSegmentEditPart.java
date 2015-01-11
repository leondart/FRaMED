package org.framed.orm.ui.editPart.shape;

import org.eclipse.draw2d.BorderLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Label;
import org.eclipse.gef.EditPart;
import org.framed.orm.model.Model;
import org.framed.orm.model.ModelElement;
import org.framed.orm.model.Shape;
import org.framed.orm.model.Type;
import org.framed.orm.ui.editPart.ORMModelEditPart;
import org.framed.orm.ui.figure.shapes.ORMGroupingV1Figure;
import org.framed.orm.ui.figure.shapes.ORMGroupingV2Figure;
import org.framed.orm.ui.figure.shapes.ORMRoleGroupFigure;
import org.framed.orm.ui.figure.shapes.PartFigure;

/**
 * This {@link EditPart} is the controller for a {@link Shape} from type group or compartmentype.
 * 
 * @author Kay Bierzynski
 * */
public class ORMShapeWithoutSegmentEditPart extends ORMSuperShapeEditPart {

  /**
   * A {@link PartFigure} in which all {@link Shapes}s from type compartmenttype and group that the
   * this groups {@link Model} contains are listed. A global variable is helpful, because this
   * {@link PartFigure} is used in the methods refreshVisual() and addChildVisual().
   */
  private PartFigure compartmentPart;

  /**
   * {@inheritDoc} In case of this {@link EditPart} that would be the figure of a {@link Model}. If
   * the figure of the {@link Model} or the compartmentPart is added to a Shape from type group
   * depends on which version of group figure is used also if the user has steped in the group. or
   * not.
   * 
   * */
  @Override
  protected void addChildVisual(final EditPart childEditPart, final int index) {

    if (childEditPart.getModel() instanceof Model) {
      IFigure contentPane = null;
      Shape shape = (Shape) getModel();

      switch (shape.getType().getValue()) {
        case Type.GROUP_VALUE:
          if (getFigure() instanceof ORMGroupingV1Figure) {
            contentPane = ((ORMGroupingV1Figure) getFigure()).getBasicRec();
            final Model model = (Model) ((ORMModelEditPart) childEditPart).getModel();

            compartmentPart = new PartFigure();
            addNamesToCompartmentPart(model);
            contentPane.add(compartmentPart);
          } else {
            contentPane = ((ORMGroupingV2Figure) getFigure()).getBasicRec();
            contentPane.add(((ORMModelEditPart) childEditPart).getFigure(), BorderLayout.CENTER);
          }
          break;
        case Type.ROLE_GROUP_VALUE:
          contentPane = ((ORMRoleGroupFigure) getFigure()).getBasicRec();
          contentPane.add(((ORMModelEditPart) childEditPart).getFigure(), BorderLayout.CENTER);
          break;
      }
    }

  }

  /**
   * The first thing, which is done in this method is that a {@link Label} with the text
   * Compartments is added to the compartmentPart. After that the names of all {@link Shape}s from
   * type group and compartmenttype, which are in the child {@link Model} of this group, are added
   * to the compartmentPart. When are more then three names in the compartmentPart list a ... label
   * is added in the tooltip of the ... label the names of the remaining groups and compartmenttypes
   * are shown.
   * */
  private void addNamesToCompartmentPart(final Model model) {
    Label lab = new Label();

    Label collectLabel = new Label();
    collectLabel.setText("....");
    PartFigure collectLabels = new PartFigure();

    int sizeList = 0;

    lab.setText("Compartments");
    compartmentPart.add(lab);

    for (ModelElement element : model.getElements()) {
      if (element.getType().equals(Type.GROUP) || element.getType().equals(Type.COMPARTMENT_TYPE)) {
        Label label = new Label();
        Label label2 = new Label();
        label2.setText("For Editing please go in the Group.");
        sizeList = compartmentPart.getChildren().size();
        label.setText(element.getName());
        label.setToolTip(label2);
        if (sizeList <= 3) {
          compartmentPart.add(label);
        } else {
          collectLabels.add(label);
        }
      }

      if (sizeList > 3) {
        collectLabel.setToolTip(collectLabels);
        compartmentPart.add(collectLabel);
      }
    }
  }

  /**
   * {@inheritDoc} The refreshVisuals of this {@link EditPart} the names of all groups and
   * compartmenttype in the child {@link Model} are added to the compartmentPart and the method
   * {@link ORMSuperShapeEditPart#refreshVisuals()} is called.
   * 
   */
  @Override
  public void refreshVisuals() {
    super.refreshVisuals();

    if (compartmentPart != null) {
      compartmentPart.removeAll();
      Model model = ((Shape) getModel()).getModel();
      addNamesToCompartmentPart(model);

    }
  }

}
