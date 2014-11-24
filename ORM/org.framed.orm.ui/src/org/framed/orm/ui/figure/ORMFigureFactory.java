package org.framed.orm.ui.figure;

import org.eclipse.draw2d.Figure;
import org.eclipse.gef.EditPart;
import org.framed.orm.model.Model;
import org.framed.orm.model.Segment;
import org.framed.orm.model.Shape;
import org.framed.orm.model.Type;

public class ORMFigureFactory {

  public static Figure createFigure(EditPart editpart) {
    Figure fig = null;


    if (editpart.getModel() instanceof Model) {
      fig = new ORMModelFigure();
    }

    if (editpart.getModel() instanceof Shape) {
      Shape shape = (Shape) editpart.getModel();
      int val = shape.getType().getValue();
      switch (val) {
        case Type.COMPARTMENT_TYPE_VALUE:
          fig = creatCompartmentTypeFigure(editpart);
          break;
        case Type.GROUP_VALUE:
          fig = creatGroupFigure(editpart);
          break;
        case Type.NATURAL_TYPE_VALUE:
          fig = new ORMNaturalTypeFigure();
          break;
        case Type.DATA_TYPE_VALUE:
          break;
        case Type.ROLE_GROUP_VALUE:
          fig = new ORMRoleGroupFigure();
          break;
        case Type.ROLE_TYPE_VALUE:
          fig = new ORMRoleTypeFigure();
          break;
      }
    }

    if (editpart.getModel() instanceof Segment) {
      fig = new PartFigure();
    }


    return fig;
  }

  private static Figure creatCompartmentTypeFigure(EditPart editpart) {
    // when the compartment editpart is not "opened"(steped in) use as figure
    // ORMCompartmentV1Figure
    if (editpart.getParent().getModel() instanceof Model) {

      return new ORMCompartmentV1Figure();
    }
    // when the edit part is "opened"(steped in) use ORMCompartmentV2Figure
    else {
      return new ORMCompartmentV2Figure();
    }
  }

  private static Figure creatGroupFigure(EditPart editpart) {
    // when the group editpart is not "opened"(steped in) use as figure ORMGroupingV1Figure
    if (editpart.getParent().getModel() instanceof Model) {
      return new ORMGroupingV1Figure();

    }
    // when the group editpart is "opened"(steped in) use ORMGroupingV2Figure
    else {
      return new ORMGroupingV2Figure();
    }
  }
}
