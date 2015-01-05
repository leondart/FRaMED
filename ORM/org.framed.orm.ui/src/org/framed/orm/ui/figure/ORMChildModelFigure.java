package org.framed.orm.ui.figure;


import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.XYLayout;
import org.framed.orm.model.Model;


/**
 * This figure is for a child {@link Model}. The figure is nothing more that white area to which
 * borders are added in the Editparts of {@link Shape}s from type CompartmentType and Goup.
 * 
 * @author Kay Bierzynski
 * */
public class ORMChildModelFigure extends Figure {

  /**
   * The constructor of this class, where the layout for the white area is set.
   * */
  public ORMChildModelFigure() {


    XYLayout layout = new XYLayout();
    setLayoutManager(layout);
  }


  /** {@inheritDoc} */
  @Override
  protected boolean useLocalCoordinates() {
    return true;
  }

}
