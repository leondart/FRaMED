package org.framed.orm.ui.editPart.connectionkinds;


import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Label;
import org.eclipse.gef.EditPart;
import org.framed.orm.model.Total;


/**
 * This {@link EditPart} is the controller for the model element {@link Total}.
 * 
 * @author Kay Bierzynski
 * */
public class ORMTotalEditPart extends ORMRelationshipConstraintEditPart {
  
  /**
   * {@inheritDoc} {@link Total}s have as figure a dashed line with a {@link Label} that has as
   * text the word total.
   */
  @Override 
  protected IFigure createFigure() {
    return creatRelationshipConstraint("total");
    }
}
