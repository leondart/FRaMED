package org.framed.orm.ui.figure;

import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.XYLayout;
import org.framed.orm.model.Rolemodel;
import org.framed.orm.ui.editPart.ORMGroupingEditPart;
import org.framed.orm.ui.editPart.types.ORMCompartmentEditPart;

/**
 * This figure is for {@link Rolemodel}s. The figure is nothing more that white area to which
 * borders are added in the {@link ORMCompartmentEditPart} and the {@link ORMGroupingEditPart}.
 * 
 * @author Kay Bierzynski
 * */
public class ORMRolemodelFigure extends Figure {

  /**
   * The constructor of this class, where the layout for the white area is set.
   * */
  public ORMRolemodelFigure() {

    XYLayout layout = new XYLayout();
    setLayoutManager(layout);

  }


  /** {@inheritDoc} */
  @Override
  protected boolean useLocalCoordinates() {
    return true;
  }

}
