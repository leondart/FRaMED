package org.framed.orm.ui.editPolicy;

import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.PolylineConnection;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.DirectEditPolicy;
import org.eclipse.gef.requests.DirectEditRequest;
import org.framed.orm.model.NamedElement;
import org.framed.orm.model.Shape;
import org.framed.orm.model.Type;
import org.framed.orm.ui.command.ORMNamedElementRenameCommand;
import org.framed.orm.ui.editPart.connectionkinds.ORMRelationshipEditPart;
import org.framed.orm.ui.editPart.shape.ORMSuperShapeEditPart;
import org.framed.orm.ui.figure.shapes.ORMShapeFigure;

/**
 * This {@link DirectEditPolicy} shows DirectEdit feedback and creates the Command to perform a
 * "direct edit" of a {@link NamedElement} name. Direct Edit is when the User is editing a property
 * of an EditPart directly (as opposed to in the Properties View) in the Viewer using a
 * org.eclipse.jface.viewers.CellEditor. This EditPolicy is typically installed using
 * org.eclipse.gef.EditPolicy.DIRECT_EDIT_ROLE.
 * 
 * @author Kay Bierzynski
 * */
public class ORMNamedElementDirectEditPolicy extends DirectEditPolicy {

  /**
   * {@inheritDoc} In this specific EditPolicy the command, which is returned, is for renaming of a
   * {@link NamedElement}.
   * 
   * @return command org.framed.orm.ui.command.ORMNamedElementRenameCommand
   * */
  @Override
  protected Command getDirectEditCommand(final DirectEditRequest request) {
    ORMNamedElementRenameCommand command = new ORMNamedElementRenameCommand();
    command.setNamedElement((NamedElement) getHost().getModel());

    String newName = (String) request.getCellEditor().getValue();
    command.setNewName(newName);

    return command;
  }

  /** {@inheritDoc} */
  @Override
  protected void showCurrentEditValue(final DirectEditRequest request) {
    String value = (String) request.getCellEditor().getValue();
    if (getHostFigure() instanceof ORMShapeFigure) {
      ((ORMShapeFigure) getHostFigure()).getLabel().setText(value);
    } else if (getHostFigure() instanceof PolylineConnection) {
      ((ORMRelationshipEditPart) getHost()).getNameLabel().setText(value);
    } else {
      ((Label) getHostFigure()).setText(value);
    }
  }

  /**
   * This method checks if the parent in the model tree of the {@link NamedElement}, whichs name is
   * edited here, is a {@link Shape} from type rolegroup or roletype.
   * */
  private boolean testForRoleTypeAndRoleGroup() {
    if (getHost().getParent() instanceof ORMSuperShapeEditPart) {
      Shape shape = (Shape) getHost().getParent().getModel();
      if (shape.getType().equals(Type.ROLE_GROUP) || shape.getType().equals(Type.ROLE_TYPE)) {
        return true;
      }
    }
    return false;
  }

}
