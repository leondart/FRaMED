package org.framed.orm.ui.editPolicy;


import org.eclipse.gef.DefaultEditDomain;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;
import org.eclipse.gef.editpolicies.ComponentEditPolicy;
import org.eclipse.gef.requests.GroupRequest;
import org.framed.orm.model.Model;
import org.framed.orm.model.Shape;
import org.framed.orm.ui.action.StepInAction;
import org.framed.orm.ui.action.StepInNewPageAction;
import org.framed.orm.ui.action.StepInNewTabAction;
import org.framed.orm.ui.action.StepOutAction;
import org.framed.orm.ui.command.StepCommand;
import org.framed.orm.ui.command.shapes.ORMShapeDeleteCommand;
import org.framed.orm.ui.editor.ORMGraphicalEditor;
import org.framed.orm.ui.editor.ORMMultiPageEditor;


/**
 * This {@link ComponentEditPolicy} handles requests for the deletion of {@link Shape}s and the step
 * requests for stepping in and out of {@link Shapes}s ftom type compartment and grouping. This
 * Policy creates and returns the necessary command for these requests,
 *
 * @author Kay Bierzynski
 * */
public class ORMShapeComponentEditPolicy extends ComponentEditPolicy {

  /**
   * The {@link ORMMultiPageEditor} instance that shows/controls/manages the {@link Shape}s which
   * the user wants to delete/step into/ step outo.
   * */
  private final ORMMultiPageEditor editorPart;
  /** The {@link EditPart}, where this EditPolicy is installed. */
  private final AbstractGraphicalEditPart hostEditPart;
  /** The model element, which is controlled through hostEditPart. */
  private final Object hostModel;

  private EditPolicyHandler ep;

  /**
   * The constructor of this class. This class is initialized through calling the constructor of the
   * parent class and through setting the global variables.
   * */
  public ORMShapeComponentEditPolicy(EditPart host) {
    super();
    ORMGraphicalEditor editor =
        (ORMGraphicalEditor) ((DefaultEditDomain) host.getViewer().getEditDomain()).getEditorPart();
    editorPart = (ORMMultiPageEditor) editor.getParentEditor();
    hostEditPart = (AbstractGraphicalEditPart) host;
    hostModel = hostEditPart.getModel();
    ep = editor.getEditPolicyHandler();
  }


  /**
   * {@inheritDoc} In this EditPolicy this method creates and returns a command for deleting a
   * {@link Shape}.
   *
   * @return {@link ORMShapeDeleteCommand}
   */
  @Override
  protected Command createDeleteCommand(final GroupRequest deleteRequest) {

    final ORMShapeDeleteCommand command = new ORMShapeDeleteCommand();
    command.setShape((Shape) getHost().getModel());

    EditPolicyCommandDecorator<ORMShapeDeleteCommand> cmd = new EditPolicyCommandDecorator<>(command);
    cmd.setEditPolicyHandler(this.ep);

    return cmd;
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

    final Model container = ((Shape) hostModel).getContainer();

    final StepCommand command = new StepCommand();
    command.setEditPart(hostEditPart);
    command.setEditorPart(editorPart);


    if (container.getParent() == null) {
      command.setNewContent(container);
    } else {
      command.setNewContent(container.getParent());
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
