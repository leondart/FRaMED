package org.framed.orm.ui.action;

import org.eclipse.gef.DefaultEditDomain;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gef.requests.DirectEditRequest;
import org.eclipse.gef.ui.actions.SaveAction;
import org.eclipse.gef.ui.actions.SelectionAction;
import org.eclipse.ui.IWorkbenchPart;
import org.framed.orm.ui.editPart.ORMAttributeEditPart;
import org.framed.orm.ui.editPart.ORMMethodEditPart;
import org.framed.orm.ui.editor.ORMGraphicalEditor;
import org.framed.orm.ui.factory.ORMAttributeFactory;
import org.framed.orm.ui.factory.ORMMethodFactory;

public class CreateActionMethodAction extends SelectionAction {

  public static final String CREATE_A_M_ID = "CreateAttributeMethod";
  private AbstractGraphicalEditPart editPart;
  
  public CreateActionMethodAction(IWorkbenchPart part) {
    super(part);
    setId(CREATE_A_M_ID);
    setText("CreateAttributeMethod");
  }

  
  @Override
  public void run() {
    ORMGraphicalEditor editorPart =
        (ORMGraphicalEditor) ((DefaultEditDomain) editPart.getViewer().getEditDomain())
            .getEditorPart();


    CreateRequest request = new CreateRequest();

    if (getSelectedObjects().get(0) instanceof ORMAttributeEditPart){
     request.setFactory(new ORMAttributeFactory());
    } else {
      request.setFactory(new ORMMethodFactory());
    }
    execute(editPart.getCommand(request));
    
    final Object model = request.getNewObject();
    final Object o = editorPart.getOwnViewer().getEditPartRegistry().get(model);
    
    if(o instanceof EditPart) {
      EditPart part = (EditPart)o;
      Request directrequest = new DirectEditRequest();
      part.performRequest(directrequest);
    }
    ;
    editorPart.getOwnViewer().getSelectionManager().deselectAll();
  }
  
  
  @Override
  protected boolean calculateEnabled() {
    if (getSelectedObjects().isEmpty() || getSelectedObjects().size() > 1) {
      return false;
    }
    
   
    if (getSelectedObjects().get(0) instanceof ORMAttributeEditPart
        || getSelectedObjects().get(0) instanceof ORMMethodEditPart) {
      editPart = (AbstractGraphicalEditPart) ((AbstractGraphicalEditPart) getSelectedObjects().get(0)).getParent();
      return true;
    }
    return false;
  }

}
