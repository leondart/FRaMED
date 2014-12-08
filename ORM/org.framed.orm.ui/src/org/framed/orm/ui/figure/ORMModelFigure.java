package org.framed.orm.ui.figure;

import org.eclipse.draw2d.ConnectionLayer;
import org.eclipse.draw2d.XYLayout;
import org.eclipse.swt.SWT;
import org.framed.orm.model.Model;


/**
 * This figure is for {@link Model}s. The figure is nothing more that white area to which
 * borders are added in the Editparts of {@link Shape}s from type CompartmentType and Goup.
 * 
 * @author Kay Bierzynski
 * */
public class ORMModelFigure extends ConnectionLayer {

  /**
   * The constructor of this class, where the layout for the white area is set.
   * */
  public ORMModelFigure() {
    
 
    setLayoutManager(new XYLayout());
    //setBorder(new LineBorder(1));
    setAntialias(SWT.ON);
  }


  /** {@inheritDoc} */
  @Override
  protected boolean useLocalCoordinates() {
    return true;
  }

}
