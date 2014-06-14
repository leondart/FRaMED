package org.framed.orm.ui.editPolicy;

import org.eclipse.gef.DefaultEditDomain;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;
import org.eclipse.gef.editpolicies.ComponentEditPolicy;
import org.eclipse.gef.requests.GroupRequest;
import org.framed.orm.model.Compartment;
import org.framed.orm.model.Grouping;
import org.framed.orm.model.NaturalType;
import org.framed.orm.model.Node;
import org.framed.orm.model.RoleType;
import org.framed.orm.ui.action.StepInAction;
import org.framed.orm.ui.action.StepOutAction;
import org.framed.orm.ui.action.StepInNewPageAction;
import org.framed.orm.ui.action.StepOutNewPageAction;
import org.framed.orm.ui.command.ORMNodeDeleteCommand;
import org.framed.orm.ui.command.StepInCommand;
import org.framed.orm.ui.command.StepOutCommand;
import org.framed.orm.ui.command.StepInNewPageCommand;
import org.framed.orm.ui.command.StepOutNewPageCommand;
import org.framed.orm.ui.editor.ORMGraphicalEditor;


/**
 * @author Kay Bierzynski
 * */
public class ORMTypeComponentEditPolicy extends ComponentEditPolicy {

  @Override
  protected Command createDeleteCommand(GroupRequest deleteRequest) {

    if (getHost().getModel() instanceof NaturalType || getHost().getModel() instanceof RoleType
        || getHost().getModel() instanceof Compartment || getHost().getModel() instanceof Grouping) {
      ORMNodeDeleteCommand typeDeleteCommand = new ORMNodeDeleteCommand();
      typeDeleteCommand.setNode((Node) getHost().getModel());
      return typeDeleteCommand;
    }


    return null;
  }

  private StepInCommand createStepInCommand() {
    EditPart host = getHost();

    StepInCommand command = new StepInCommand();
    command.setEditPart((AbstractGraphicalEditPart) host);
    command.setEditorPart((ORMGraphicalEditor) ((DefaultEditDomain) host.getViewer()
        .getEditDomain()).getEditorPart());

    return command;
  }


  private StepOutCommand createStepOutCommand() {
    EditPart host = getHost();

    StepOutCommand command = new StepOutCommand();
    command.setEditPart((AbstractGraphicalEditPart) host);
    command.setEditorPart((ORMGraphicalEditor) ((DefaultEditDomain) host.getViewer()
        .getEditDomain()).getEditorPart());
    return command;
  }

  private StepInNewPageCommand createStepInNewPageCommand() {
    EditPart host = getHost();

    StepInNewPageCommand command = new StepInNewPageCommand();
    command.setEditPart((AbstractGraphicalEditPart) host);

    return command;
  }


  private StepOutNewPageCommand createStepOutNewPageCommand() {
    EditPart host = getHost();

    StepOutNewPageCommand command = new StepOutNewPageCommand();
    command.setEditPart((AbstractGraphicalEditPart) host);
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
      return createStepInCommand();
    }
    if (request.getType().equals(StepOutAction.STEP_OUT_REQUEST)) {
      return createStepOutCommand();
    }
    if (request.getType().equals(StepInNewPageAction.STEP_IN_NEW_PAGE_REQUEST)) {
      return createStepInNewPageCommand();
    }
    if (request.getType().equals(StepOutNewPageAction.STEP_OUT_NEW_PAGE_REQUEST)) {
      return createStepOutNewPageCommand();
    }
    return super.getCommand(request);
  }
}
