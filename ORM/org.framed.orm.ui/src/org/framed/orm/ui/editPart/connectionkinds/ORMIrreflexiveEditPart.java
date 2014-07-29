package org.framed.orm.ui.editPart.connectionkinds;


import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Label;
import org.eclipse.gef.EditPart;
import org.framed.orm.model.Irreflexive;


/**
 * This {@link EditPart} is the controller for the model element {@link Irreflexive}.
 * 
 * @author Kay Bierzynski
 * */
public class ORMIrreflexiveEditPart extends ORMRelationshipConstraintEditPart {
  
  /**
   * {@inheritDoc} {@link Irreflexive}s have as figure a dashed line with a {@link Label} that has as
   * text the word irreflexive.
   */
  @Override 
  protected IFigure createFigure() {
      return creatRelationshipConstraint("irreflexive");
    }
	
}
