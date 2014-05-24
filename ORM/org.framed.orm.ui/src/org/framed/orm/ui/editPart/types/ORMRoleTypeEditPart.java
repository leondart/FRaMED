package org.framed.orm.ui.editPart.types;


import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.DefaultEditDomain;
import org.eclipse.gef.EditPolicy;
import org.framed.orm.model.RoleType;
import org.framed.orm.ui.editPolicy.ORMNodeGraphicalNodeEditPolicy;
import org.framed.orm.ui.editor.ORMGraphicalEditor;
import org.framed.orm.ui.figure.ORMRoleTypeFigure;

/**
 * @author Kay Bierzynski
 * */
public class ORMRoleTypeEditPart extends ORMTypeEditPart {
  
  private IFigure figure;
  
  /*
   * Needed to be installed here and not in TypeEditPart, because its needed that in
   * ContextTypeEditPart it can be filtered, so that the MainContext cannot be selected for
   * Connectioncreation.
   */
  @Override
  public void createEditPolicies() {
    super.createEditPolicies();
    installEditPolicy(EditPolicy.GRAPHICAL_NODE_ROLE, new ORMNodeGraphicalNodeEditPolicy());
  }

  @Override
  protected IFigure createFigure() {

    ORMGraphicalEditor editorPart =
        (ORMGraphicalEditor) ((DefaultEditDomain) getViewer().getEditDomain()).getEditorPart();
    ORMRoleTypeFigure figure = new ORMRoleTypeFigure(editorPart.getIsEditorData());
    this.figure = figure;
    return figure;
  }

  @Override
  public Rectangle getConstraints(){
    return ((RoleType)getModel()).getConstraints();
  }

}
