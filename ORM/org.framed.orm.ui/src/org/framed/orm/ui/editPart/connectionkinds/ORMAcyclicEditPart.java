package org.framed.orm.ui.editPart.connectionkinds;


import org.eclipse.draw2d.IFigure;


/**
 * @author Kay Bierzynski
 * */
public class ORMAcyclicEditPart extends ORMRelationshipConstraintEditPart {
  
  
  @Override 
  protected IFigure createFigure() {
    
    return creatRelationshipConstraint("acyclic");
    }
}
