package org.framed.orm.ui.figure.shapes;

import org.eclipse.draw2d.ConnectionLayer;
import org.eclipse.draw2d.XYLayout;
import org.eclipse.swt.SWT;
import org.framed.orm.model.Model;


/**
 * This figure is for a root {@link Model}.
 * 
 * @author Kay Bierzynski
 * */
public class ORMRootModelFigure extends ConnectionLayer {

  /**
   * The constructor of this class, where the layout for the white area is set.
   * */
  public ORMRootModelFigure() {


    setLayoutManager(new XYLayout());
    // setBorder(new LineBorder(1));
    setAntialias(SWT.ON);
  }


  /** {@inheritDoc} */
  @Override
  protected boolean useLocalCoordinates() {
    return true;
  }

}
