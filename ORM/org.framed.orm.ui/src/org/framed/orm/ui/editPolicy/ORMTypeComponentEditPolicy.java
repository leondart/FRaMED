package org.framed.orm.ui.editPolicy;


import org.eclipse.gef.DefaultEditDomain;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;
import org.eclipse.gef.editpolicies.ComponentEditPolicy;
import org.eclipse.gef.requests.GroupRequest;
import org.framed.orm.model.Node;
import org.framed.orm.ui.action.StepInAction;
import org.framed.orm.ui.action.StepOutAction;
import org.framed.orm.ui.action.StepInNewPageAction;
import org.framed.orm.ui.action.StepOutNewPageAction;
import org.framed.orm.ui.command.StepCommand;
import org.framed.orm.ui.command.nodes.ORMNodeDeleteCommand;
import org.framed.orm.ui.editor.ORMGraphicalEditor;
import org.framed.orm.ui.editor.ORMMultiPageEditor;


/**
 * @author Kay Bierzynski
 * */
public class ORMTypeComponentEditPolicy extends ComponentEditPolicy {

  private ORMMultiPageEditor editorPart;
  private AbstractGraphicalEditPart hostEditPart;
  private Object hostModel;

  public ORMTypeComponentEditPolicy(EditPart host) {
    super();
    ORMGraphicalEditor editor =
        (ORMGraphicalEditor) ((DefaultEditDomain) host.getViewer().getEditDomain()).getEditorPart();
    editorPart = (ORMMultiPageEditor) editor.getParentEditor();
    hostEditPart = (AbstractGraphicalEditPart) host;
    hostModel = hostEditPart.getModel();
  }

  @Override
  protected Command createDeleteCommand(GroupRequest deleteRequest) {

    ORMNodeDeleteCommand typeDeleteCommand = new ORMNodeDeleteCommand();
    typeDeleteCommand.setNode((Node) getHost().getModel());
    return typeDeleteCommand;
  }

  private StepCommand createStepInCommand(boolean isNewWindowCommand) {

    Object oldContent = hostEditPart.getViewer().getContents().getModel();
    if (!editorPart.getOldViewerContents().contains(oldContent)) {
      editorPart.getOldViewerContents().add(oldContent);
    }
    
    StepCommand command = new StepCommand();
    command.setEditPart(hostEditPart);
    command.setEditorPart(editorPart);
    command.setNewContent(hostModel);
    command.setIsNewWindowCommand(isNewWindowCommand);
    
    return command;
  }


  private StepCommand createStepOutCommand(boolean isNewWindowCommand) {

    int index =  editorPart.getOldViewerContents().size() - 1;
    Object content = null;

    if (editorPart.getOldViewerContents().contains(hostModel)) {
      content = editorPart.getOldViewerContents().get(index - 1);
      // node of the model tree needs to be removed from the list, 
      // when the node is visted again through stepping out of it's children 
      // and user wants to step out of this as well
      editorPart.getOldViewerContents().remove(index);
    } else {
      content = editorPart.getOldViewerContents().get(index);
    }

    StepCommand command = new StepCommand();
    command.setEditPart(hostEditPart);
    command.setEditorPart(editorPart);
    command.setNewContent(content);
    command.setIsNewWindowCommand(isNewWindowCommand);
    
    return command;
  }
  
  /**
   * <p>
   * Extends the parent implementation by handling incoming GO_DOWN_TREE, GO_UP_TREE,
   * STEP_IN_NEW_PAGE and STEP_OUT_NEW_PAGE requests.
   * </p>
   * <p>
   * The parent implementation {@inheritDoc}
   * </p>
   */
  
  @Override
  public Command getCommand(Request request) {
    if (request.getType().equals(StepInAction.STEP_IN_REQUEST)) {
      return createStepInCommand(false);
    }
    if (request.getType().equals(StepOutAction.STEP_OUT_REQUEST)) {
      return createStepOutCommand(false);
    }
    if (request.getType().equals(StepInNewPageAction.STEP_IN_NEW_PAGE_REQUEST)) {
      return createStepInCommand(true);
    }
    if (request.getType().equals(StepOutNewPageAction.STEP_OUT_NEW_PAGE_REQUEST)) {
      return createStepOutCommand(true);
    }
    return super.getCommand(request);
  }
}
