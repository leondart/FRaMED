package org.framed.orm.ui.editPart.connectionkinds;


import org.eclipse.draw2d.IFigure;


/**
 * @author Kay Bierzynski
 * */
public class ORMIrreflexiveEditPart extends ORMRelationshipConstraintEditPart {
  
  
  @Override 
  protected IFigure createFigure() {
      return creatRelationshipConstraint("irreflexive");
    }
	
}
