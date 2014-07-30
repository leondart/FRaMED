package org.framed.orm.ui.editPolicy;


import org.eclipse.gef.DefaultEditDomain;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;
import org.eclipse.gef.editpolicies.ComponentEditPolicy;
import org.eclipse.gef.requests.GroupRequest;
import org.framed.orm.model.Compartment;
import org.framed.orm.model.CompartmentDiagram;
import org.framed.orm.model.Grouping;
import org.framed.orm.model.Node;
import org.framed.orm.model.Rolemodel;
import org.framed.orm.ui.action.StepInAction;
import org.framed.orm.ui.action.StepOutAction;
import org.framed.orm.ui.action.StepInNewPageAction;
import org.framed.orm.ui.action.StepInNewTabAction;
import org.framed.orm.ui.command.StepCommand;
import org.framed.orm.ui.command.nodes.ORMNodeDeleteCommand;
import org.framed.orm.ui.editor.ORMGraphicalEditor;
import org.framed.orm.ui.editor.ORMMultiPageEditor;


/**
 * This {@link ComponentEditPolicy} handels requests for the deletion of {@link Types}s/
 * {@linkGrouping}s and the step requests for stepping in and out of {@link Compartment}s and
 * {@link Grouping}s. This Policy creates and returns the necessary command for these requests,
 * 
 * @author Kay Bierzynski
 * */
public class ORMTypeComponentEditPolicy extends ComponentEditPolicy {

  /**
   * The {@link ORMMultiPageEditor} instance that shows/controlls/manages the {@link Types}s/
   * {@linkGrouping}s which the user wants to delete/step into/ step outo.
   * */
  private final ORMMultiPageEditor editorPart;
  /** The {@link EditPart}, where this EditPolicy is installed. */
  private final AbstractGraphicalEditPart hostEditPart;
  /** The model element, which is controlles through hostEditPart. */
  private final Object hostModel;

  /**
   * The constructor of this class. This class is initialized through calling the constructor of the
   * parent class and through setting the global variables.
   * */
  public ORMTypeComponentEditPolicy(EditPart host) {
    super();
    ORMGraphicalEditor editor =
        (ORMGraphicalEditor) ((DefaultEditDomain) host.getViewer().getEditDomain()).getEditorPart();
    editorPart = (ORMMultiPageEditor) editor.getParentEditor();
    hostEditPart = (AbstractGraphicalEditPart) host;
    hostModel = hostEditPart.getModel();
  }


  /**
   * {@inheritDoc} In this EditPolicy this method creates and returns a command for deleting a
   * {@link Type} or a {@link Grouping}.
   * 
   * @return {@link ORMNodeDeleteCommand}
   */
  @Override
  protected Command createDeleteCommand(final GroupRequest deleteRequest) {

    final ORMNodeDeleteCommand typeDeleteCommand = new ORMNodeDeleteCommand();
    typeDeleteCommand.setNode((Node) getHost().getModel());
    return typeDeleteCommand;
  }

  /**
   * This method creates and returns the command for step in, step in new tab and step in new page
   * requests.
   * 
   * @return {@link StepCommand}
   * */
  private StepCommand createStepInCommand(final boolean isNewWindowCommand,
      final boolean isNewTabCommand) {

    final StepCommand command = new StepCommand();
    command.setEditPart(hostEditPart);
    command.setEditorPart(editorPart);
    command.setNewContent(hostModel);
    command.setIsNewWindowCommand(isNewWindowCommand);
    command.setIsNewTabCommand(isNewTabCommand);

    return command;
  }


  /**
   * This method creates and returns the command for step out requests.
   * 
   * @return {@link StepCommand}
   * */
  private StepCommand createStepOutCommand() {

    final Object container = ((Node) hostModel).getContainer();

    final StepCommand command = new StepCommand();
    command.setEditPart(hostEditPart);
    command.setEditorPart(editorPart);

    if (container instanceof CompartmentDiagram) {
      command.setNewContent(container);
    } else if (container instanceof Rolemodel) {

      Rolemodel rm = (Rolemodel) ((Node) hostModel).getContainer();

      if (rm.getParentGroup() != null) {
        command.setNewContent(rm.getParentGroup());
      } else {
        command.setNewContent(rm.getCompartment());
      }
    }

    command.setIsNewWindowCommand(false);
    command.setIsNewTabCommand(false);
    return command;
  }


  /**
   * This method handles step in, step in tab, step in new page and step out requests.
   * 
   * @return {@link StepCommand} , which has a specifically set up for the respective request
   * */
  @Override
  public Command getCommand(final Request request) {
    
    if (request.getType().equals(StepInAction.STEP_IN_REQUEST)) {
      return createStepInCommand(false, false);
    }
    if (request.getType().equals(StepOutAction.STEP_OUT_REQUEST)) {
      return createStepOutCommand();
    }
    if (request.getType().equals(StepInNewPageAction.STEP_IN_NEW_PAGE_REQUEST)) {
      return createStepInCommand(true, false);
    }
    if (request.getType().equals(StepInNewTabAction.STEP_IN_NEW_TAB_REQUEST)) {
      return createStepInCommand(false, true);
    }
    return super.getCommand(request);
  }
}
