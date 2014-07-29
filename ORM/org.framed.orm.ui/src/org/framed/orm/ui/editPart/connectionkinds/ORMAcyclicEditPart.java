package org.framed.orm.ui.editPart.connectionkinds;


import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Label;
import org.eclipse.gef.EditPart;
import org.framed.orm.model.Acyclic;

/**
 * This {@link EditPart} is the controller for the model element {@link Acyclic}.
 * 
 * @author Kay Bierzynski
 * */
public class ORMAcyclicEditPart extends ORMRelationshipConstraintEditPart {

  /**
   * {@inheritDoc} {@link Acyclic}s have as figure a dashed line with a {@link Label} that has as
   * text the word acyclc.
   */
  @Override
  protected IFigure createFigure() {

    return creatRelationshipConstraint("acyclic");
  }
}
