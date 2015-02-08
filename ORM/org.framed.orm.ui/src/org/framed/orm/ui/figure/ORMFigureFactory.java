package org.framed.orm.ui.figure;

import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.XYLayout;
import org.eclipse.gef.EditPart;
import org.framed.orm.model.Model;
import org.framed.orm.model.Segment;
import org.framed.orm.model.Shape;
import org.framed.orm.model.Type;
import org.framed.orm.ui.figure.shapes.ORMChildModelFigure;
import org.framed.orm.ui.figure.shapes.ORMCompartmentV1Figure;
import org.framed.orm.ui.figure.shapes.ORMCompartmentV2Figure;
import org.framed.orm.ui.figure.shapes.ORMDataTypeFigure;
import org.framed.orm.ui.figure.shapes.ORMGroupV1Figure;
import org.framed.orm.ui.figure.shapes.ORMGroupV2Figure;
import org.framed.orm.ui.figure.shapes.ORMNaturalTypeFigure;
import org.framed.orm.ui.figure.shapes.ORMRoleGroupFigure;
import org.framed.orm.ui.figure.shapes.ORMRoleTypeFigure;
import org.framed.orm.ui.figure.shapes.ORMRootModelFigure;
import org.framed.orm.ui.figure.shapes.ORMShapeFigure;
import org.framed.orm.ui.figure.shapes.PartFigure;

/**
 * This class serves as a facade/factory for creating figures for different {@link Shape} types.
 * 
 * @author Kay Bierzynski
 * */
public class ORMFigureFactory {

  /**
   * This method takes a {@link EditPart} as input and return the correct figure depending on which
   * kind of model element the edit part controls.
   * 
   * @param editpart {@link EditPart}
   * @return {@link Figure}
   * */
  public static Figure createFigure(EditPart editpart) {
    Figure fig = null;


    if (editpart.getModel() instanceof Model) {
      if (!(editpart.getParent().getModel() instanceof Shape)) {
        fig = new ORMRootModelFigure();
      } else {
        fig = new ORMChildModelFigure();
      }
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
          fig = new ORMDataTypeFigure();
          break;
        case Type.ROLE_GROUP_VALUE:
          fig = new ORMRoleGroupFigure();
          break;
        case Type.ROLE_TYPE_VALUE:
          fig = new ORMRoleTypeFigure();
          break;
        case Type.RELATIONSHIP_SHAPE_CHILD_VALUE:
          fig = new ORMShapeFigure();
          fig.setOpaque(false);
          fig.setLayoutManager(new XYLayout());
          break;
      }
    }

    if (editpart.getModel() instanceof Segment) {
      fig = new PartFigure();
    }


    return fig;
  }

  /**
   * This method created and returns a version of the figure for a {@link Shape} from type
   * compartmentypes.
   * 
   * @param editpart {@link EditPart}
   * @return {@link ORMCompartmentV1Figure}(when user not stepped into the compartmentype)
   *            or {@link ORMCompartmentV2Figure}(when user stepped into the compartmentype)
   * */
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

  /**
   * This method created and returns a version of the figure for a {@link Shape} from type
   * group.
   * 
   * @param editpart {@link EditPart}
   * @return {@link ORMGroupV1Figure}(when user not stepped into the group)
   *            or {@link ORMGroupV2Figure}(when user stepped into the group)
   * */
  private static Figure creatGroupFigure(EditPart editpart) {
    // when the group editpart is not "opened"(steped in) use as figure ORMGroupingV1Figure
    if (editpart.getParent().getModel() instanceof Model) {
      return new ORMGroupV1Figure();

    }
    // when the group editpart is "opened"(steped in) use ORMGroupingV2Figure
    else {
      return new ORMGroupV2Figure();
    }
  }
}
