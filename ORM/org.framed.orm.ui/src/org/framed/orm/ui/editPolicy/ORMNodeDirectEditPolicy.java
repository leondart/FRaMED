package org.framed.orm.ui.editPolicy;


import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.DirectEditPolicy;
import org.eclipse.gef.requests.DirectEditRequest;
import org.framed.orm.model.Node;
import org.framed.orm.ui.command.nodes.ORMNodeRenameCommand;
import org.framed.orm.ui.figure.ORMGroupingV1Figure;
import org.framed.orm.ui.figure.ORMGroupingV2Figure;
import org.framed.orm.ui.figure.ORMRoleGroupFigure;
import org.framed.orm.ui.figure.ORMShapeFigure;

/**
 * This {@link DirectEditPolicy} shows DirectEdit feedback and creates the Command to perform a
 * "direct edit" of a {@link Node} name. Direct Edit is when the User is editing a property of
 * an EditPart directly (as opposed to in the Properties View) in the Viewer using a
 * org.eclipse.jface.viewers.CellEditor. This EditPolicy is typically installed using
 * org.eclipse.gef.EditPolicy.DIRECT_EDIT_ROLE.
 *
 * @author Kay Bierzynski
 * @author Lars Schuetze
 * */
public class ORMNodeDirectEditPolicy extends DirectEditPolicy {

  /**
   * {@inheritDoc} In this specific EditPolicy the command, which is returned, is for renaming of a
   * {@link Node}.
   * 
   * @return command org.framed.orm.ui.command.AttributeMethodCommands.ORMNodeRenameCommand
   * */
  @Override
  protected Command getDirectEditCommand(final DirectEditRequest request) {
    final ORMNodeRenameCommand command = new ORMNodeRenameCommand();
    command.setNode((Node) getHost().getModel());
    command.setNewName((String) request.getCellEditor().getValue());
    return command;
  }

  /** {@inheritDoc} */
  @Override
  protected void showCurrentEditValue(final DirectEditRequest request) {
    final String value = (String) request.getCellEditor().getValue();
    if (getHostFigure() instanceof ORMShapeFigure){
      ((ORMShapeFigure) getHostFigure()).getLabel().setText(value);
    }
    if (getHostFigure() instanceof ORMRoleGroupFigure){
      ((ORMRoleGroupFigure) getHostFigure()).getLabel().setText(value);
    }
    if (getHostFigure() instanceof ORMGroupingV1Figure){
      ((ORMGroupingV1Figure) getHostFigure()).getLabel().setText(value);
    }
    if (getHostFigure() instanceof ORMGroupingV2Figure){
      ((ORMGroupingV2Figure) getHostFigure()).getLabel().setText(value);
    }
  }
}
