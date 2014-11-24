package org.framed.orm.ui.figure;

import org.eclipse.draw2d.ConnectionLayer;
import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.LineBorder;
import org.eclipse.draw2d.XYLayout;
import org.eclipse.swt.SWT;
import org.framed.orm.model.Model;


/**
 * This figure is for {@link Model}s. The figure is nothing more that white area to which
 * borders are added in the Editparts of {@link Shape}s from type CompartmentType and Goup.
 * 
 * @author Kay Bierzynski
 * */
public class ORMModelFigure extends Figure {

  /**
   * The constructor of this class, where the layout for the white area is set.
   * */
  public ORMModelFigure() {
    
    ConnectionLayer layer = new ConnectionLayer();
    layer.setLayoutManager(new XYLayout());
    //layer.setBorder(new LineBorder(1));
    layer.setAntialias(SWT.ON);

    add(layer);
  }


  /** {@inheritDoc} */
  @Override
  protected boolean useLocalCoordinates() {
    return true;
  }

}
