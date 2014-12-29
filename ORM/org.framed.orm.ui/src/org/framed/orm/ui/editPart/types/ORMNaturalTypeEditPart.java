package org.framed.orm.ui.editPart.types;


import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.DefaultEditDomain;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.framed.orm.model.Compartment;
import org.framed.orm.model.NaturalType;
import org.framed.orm.model.Node;
import org.framed.orm.ui.editPolicy.ORMNodeGraphicalNodeEditPolicy;
import org.framed.orm.ui.editor.ORMGraphicalEditor;
import org.framed.orm.ui.figure.ORMNaturalTypeFigure;


/**
 * This {@link EditPart} is the controller for the model element {@link NaturalType}.
 * 
 * @author Kay Bierzynski
 * */
public class ORMNaturalTypeEditPart extends ORMSuperShapeEditPart {

  /**
   * {@inheritDoc} GRAPHICAL_NODE_ROLE Policy must be installed here so that we can make the
   * {@link Compartment}s unselectable for connection creation, when the user steped in the
   * compartment. The other {@link EditPolicy}s are installed through calling
   * {@link ORMSuperShapeEditPart#createEditPolicies()}.
   * 
   * */
  @Override
  public void createEditPolicies() {
    super.createEditPolicies();
    installEditPolicy(EditPolicy.GRAPHICAL_NODE_ROLE, new ORMNodeGraphicalNodeEditPolicy());

  }

  /**
   * {@inheritDoc} A {@link NaturalType} has as a figure a {@link ORMNaturalTypeFigure}.
   */
  @Override
  protected IFigure createFigure() {
    final ORMGraphicalEditor editorPart =
        (ORMGraphicalEditor) ((DefaultEditDomain) getViewer().getEditDomain()).getEditorPart();

    return new ORMNaturalTypeFigure(editorPart.getIsEditorData(), (Node) getModel());
  }

  /** {@inheritDoc} */
  @Override
  public Rectangle getConstraints() {
    // TODO Auto-generated method stub
    return null;
  }


}
