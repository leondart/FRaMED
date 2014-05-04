package org.framed.orm.ui.editPart.connectionkinds;


import org.eclipse.draw2d.IFigure;


/**
 * @author Kay Bierzynski
 * */
public class ORMTotalEditPart extends ORMRelationshipConstraintEditPart {
  
  @Override 
  protected IFigure createFigure() {
    return creatRelationshipConstraint("total");
    }
}
